package apptest.stepdefinitions;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.junit.AssumptionViolatedException;

import com.aventstack.extentreports.ExtentReports;


import apptest.pages.Common_Page;
import apptest.steps.Common_Steps;
import common.toolbox.appium.*;
import common.toolbox.report.ExtentReport;
import common.utilities.ExcelUtils;
import common.utilities.StringUtils;
import common.utilities.SystemUtils;
import common.utilities.XMLUtils;
import io.cucumber.java.en.Given;

public class Common_StepDef {
	private static final Logger LOGGER = LogManager.getLogger(Common_StepDef.class);
	Common_Steps commonSteps = new Common_Steps();

	@Given("^current testsuite \"([^\"]*)\"$")
	public void current_testsuite(String currentTestSuite) throws Throwable {
		System.out.println("Current test suite name:" + currentTestSuite);
		String suiteNo = StringUtils.GetNumericString(currentTestSuite);
		Common_Page.setTestSuiteNo(suiteNo);
		System.out.println("config full path: " + Common_Page.getConfigPath());
		String parallel = XMLUtils.getNodeText(Common_Page.getConfigPath(), "Parallel");
		if (parallel.equalsIgnoreCase("true")) {
			ExtentReport.setReportNo(suiteNo);
			ExtentReports report = ExtentReport.getExtentReport();
			Common_Page.setExtentReport(report);
			LOGGER.info("Extent report" + suiteNo + " started");
		}
		Driver.setCurrentTestSuite(currentTestSuite);
	}

	@Given("^print device details$")
	public void print_device_details() throws Exception {
		commonSteps.printDeviceInfo();
	}

	@Given("^scenario starts \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\"")
	public void scenario_starts_mbank_appium(String sheet, String feature, String scenario) throws Throwable {
		commonSteps.setupScenario(sheet, feature, scenario);

	}

	@Given("I launch Credabl app on device")
	public void i_launch_credabl_app_on_device() throws Exception {
		commonSteps.launchApp();
	}
	
	
}
