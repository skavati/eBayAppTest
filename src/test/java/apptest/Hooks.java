package apptest;

import java.io.File;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.aventstack.extentreports.ExtentReports;

import apptest.pages.Common_Page;
import common.toolbox.report.ExtentReport;
import common.utilities.FileUtils;
import common.utilities.StringUtils;
import common.utilities.XMLUtils;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {
	private static boolean isBeforeRun = false;
	private static final Logger LOGGER = LogManager.getLogger(Common_Page.class);

	// --------------------------------------------------------------------//
	@Before("@appTest") // cucumber "before annotation"
	public void beforeAll() throws Exception {
		// LOGGER.info("Executing beforeall for mbankweb");
		// to initialize scenario no to "1" before every cucumber scenario
		Common_Page.setScenarioNo(1);
		Common_Page.setRepeatNo(1);
		// to set stepFail to 'false' before each cucumber scenario
		Common_Page.setStepFail(false);
		// to intialize LoggerOnSkip
		Common_Page.setLoggerOnSkip(true);
		Common_Page.setException(null);
		Common_Page.setScenarioResult(true);
		// to set testSummaryException to null
		Common_Page.setTestSummaryException(null);

		if (!isBeforeRun) {
			Runtime.getRuntime().addShutdownHook(new Thread(new Runnable() {
				@Override
				public void run() {
					// to close extent report
					// this will run only once for whole jvm process
					Common_Page.extentReport.flush();
					LOGGER.info("Extent report generated");
					// To replace absolute path with relative in test report html file String
					String extentReportPath = XMLUtils.getNodeText(Common_Page.getConfigPath(), "ExtentReportFile");
					if (extentReportPath.contains("{")) {
						// to replace {user_home} or {user_dir} with absolute path
						try {
							extentReportPath = StringUtils.replaceWithReflection(extentReportPath,
									"common.utilities.SystemUtils", "{", "}");
						} catch (IllegalAccessException | InvocationTargetException | NoSuchMethodException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
					}
					String target = StringUtils.getStringBetweenTwoCharsInAFile(extentReportPath,
							"<img data-featherlight='", "\\ScreenShots");
					FileUtils.replaceFileText(extentReportPath, target, ".");
				}

			}));

			isBeforeRun = true;
			// setting test data file from project variables
			String configPath = FileUtils.findFullPath(System.getProperty("user.dir"), "config.xml");
			LOGGER.info("config file path:" + configPath);
			Common_Page.setConfigPath(configPath);
			ExtentReport.setConfigPath(configPath);
			String testDataDir = XMLUtils.getNodeText(configPath, "TestDataDir");
			if (testDataDir.contains("{")) {
				testDataDir = StringUtils.replaceWithReflection(testDataDir, "common.utilities.SystemUtils", "{", "}");
			}
			Common_Page.setTestDataDir(testDataDir);

			// starting extent report
			// if test suites are running parallel
			// then create ExtentReport instance on testsuite_setup.feature
			String parallel = XMLUtils.getNodeText(configPath, "Parallel");
			if (!parallel.equalsIgnoreCase("true")) {// y
				ExtentReports report = ExtentReport.getExtentReport();
				Common_Page.setExtentReport(report);
				LOGGER.info("Extent report started");
			}
		}
	}

	@After("@tearDown and @appTest")
	public void tearDown() throws Exception {
		LOGGER.info("closing app");
		if (!(Common_Page.getMobileDriver() == null)) {
			// to close app
			Common_Page.getMobileDriver().quit();
		}

	}
}
