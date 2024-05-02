package apptest.pages;

import java.text.DecimalFormat;
import java.time.Duration;
import java.util.HashMap;
import java.util.List;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebElement;
import org.openqa.selenium.support.PageFactory;

import common.toolbox.appium.Driver;
import common.toolbox.appium.Gestures;
import common.toolbox.selenium.Action;
import common.toolbox.selenium.Element;
import common.toolbox.selenium.Waits;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.FindsByAndroidUIAutomator;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import junit.framework.Assert;

public class CarLoan_Page {
	private static final Logger LOGGER = LogManager.getLogger(CarLoan_Page.class);
	private static HashMap<Object, CarLoan_Page> hmap = new HashMap<Object, CarLoan_Page>();
	private static AppiumDriver driver;

	public CarLoan_Page(AppiumDriver<WebElement> driver) {
		CarLoan_Page.driver = driver;
		PageFactory.initElements(new AppiumFieldDecorator(driver, Duration.ofSeconds(15)), this);
	}

	public static CarLoan_Page getInstance(AppiumDriver<WebElement> driver) {
		synchronized (hmap) {
			CarLoan_Page instance = hmap.get(driver);
			if (instance == null) {
				instance = new CarLoan_Page(driver);
				hmap.put(driver, instance);
			}
			return instance;
		}
	}

	@AndroidFindBy(xpath = "//*[@text='Apply Now']") // for Android native UI
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@label='Apply Now']") // for iOS native UI
	public static WebElement btnApplyNow;

	@AndroidFindBy(xpath = "//*[@text='Car Loan']") // for Android native UI
	@iOSXCUITFindBy(xpath = "//*[@label='Car Loan']") // for iOS native UI
	public static WebElement lblCarloan;

	@AndroidFindBy(xpath = "//android.widget.EditText[@text='0']") // for Android native UI
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeTextField[@label='']") // for iOS native UI
	public static WebElement txtBorrowAmt;

	@AndroidFindBy(xpath = "//*[@text='Continue']") // for Android native UI
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@label='Continue']") // for iOS native UI
	public static WebElement btnContinue;

	@AndroidFindBy(className = "??????") // for Android native UI
	@iOSXCUITFindBy(className = "XCUIElementTypeSwitch") // for iOS native UI
	public static List<WebElement> chkTheLegalStuff;

	@AndroidFindBy(xpath = "//*[@text='Submit']") // for Android native UI
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@label='Submit']") // for iOS native UI
	public static WebElement btnSubmit;

	@AndroidFindBy(xpath = "//*[@text='Submit']") // for Android native UI
	@iOSXCUITFindBy(xpath = "//*[@label='Your profession is']/following-sibling::*[@label='Select...']") // for iOS
	public static WebElement ddlProfession;

	@AndroidFindBy(xpath = "//*[@text='Submit']") // for Android native UI
	@iOSXCUITFindBy(xpath = "//*[@label='Your specialisation is']/following-sibling::*") // for iOS
	public static WebElement ddlSpecialisation;

	@AndroidFindBy(xpath = "//*[@text='search outline']") // for Android native UI
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@label='search outline']") // for iOS native UI
	public static WebElement btnSearch;

	@AndroidFindBy(xpath = "//*[@text='Promo code']") // for Android native UI
	@iOSXCUITFindBy(xpath = "//*[@label='Promo code']") // for iOS native UI
	public static RemoteWebElement lblPromoCode;

	@AndroidFindBy(xpath = "//*[@text='Your estimated total payments']") // for Android native UI
	@iOSXCUITFindBy(xpath = "//*[@label='Your estimated total payments']") // for iOS native UI
	public static RemoteWebElement lblTotalRepayments;

	@AndroidFindBy(xpath = "//*[@text='Your estimated total payments']") // for Android native UI
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeSwitch[@value='0']") // for iOS native UI
	public static RemoteWebElement chkIPreferToManuallyEnterPractionerNumber;

	@AndroidFindBy(xpath = "//*[@text='Your estimated total payments']") // for Android native UI
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeTextField[@value='Enter practitioner number']") // for iOS native UI
	public static RemoteWebElement txtEnterPractitionerNumber;

	@AndroidFindBy(xpath = "//*[@text='Confirm']") // for Android native UI
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@label='Confirm']") // for iOS native UI
	public static WebElement btnConfirm;

	@AndroidFindBy(xpath = "//*[@text='xxxx']") // for Android native UI
	@iOSXCUITFindBy(xpath = "//*[@label='I would like to borrow']/following-sibling::XCUIElementTypeTextField") // for
	public static RemoteWebElement txtNewBrrowAmount;

	@AndroidFindBy(xpath = "//*[@text='xxxxx']") // for Android native UI
	@iOSXCUITFindBy(xpath = "//*[@label='I want to pay it off in']/following-sibling::XCUIElementTypeOther/XCUIElementTypeSlider") // for
	public static RemoteWebElement slPayOffIn;

	@AndroidFindBy(xpath = "//*[@text='xxxxx']") // for Android native UI
	@iOSXCUITFindBy(xpath = "//*[@label='Residual']/following-sibling::XCUIElementTypeOther/XCUIElementTypeSlider") // for
	public static RemoteWebElement slResidual;
	
	@AndroidFindBy(xpath = "//*[@text='Back']") // for Android native UI
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@label='Back']") // for iOS native UI
	public static WebElement btnBack;
	
	@AndroidFindBy(xpath = "//android.widget.ImageView[@content-desc='Close']")
	public static RemoteWebElement btn_X;
	
	@AndroidFindBy(xpath = "//*[@text='Search on eBay']")
	public static RemoteWebElement txtSearchBox;
	
	@AndroidFindBy(xpath = "//*[contains(@content-desc,'Add to search query,samsung s23 ultra case')]/parent::*")
	public static RemoteWebElement mnuTopItem;
	
	@AndroidFindBy(xpath = "//*[contains(@text,'When you save a search')]")
	public static RemoteWebElement lblWhenSaveSearch;

	// ******************** Page methods **************************************

	public static boolean click_X_btn() throws Exception {
		try {
			
			
			btn_X.click();	
			//Waits.waitInSeconds(3);
			//String pageSource  = Common_Page.mobileDriver.getPageSource();
			//System.out.println("PageSource: " + pageSource);
			
			return true;
		} catch (Exception e) {

			LOGGER.info("Step: Navigation || click on X btn || Fail");
			Common_Page.setException(e.toString());
			return false;
		}
	}
	
	public static boolean enterSearchBox() throws Exception {
		try {	
			txtSearchBox.click();
			txtSearchBox.sendKeys("Samsung S23 ultra case");
			//Waits.waitInSeconds(3);
			//String pageSource  = Common_Page.mobileDriver.getPageSource();
			//System.out.println("PageSource: " + pageSource);			
			return true;
		} catch (Exception e) {
			LOGGER.info("Step: Navigation || enter item in the search box || Fail");
			Common_Page.setException(e.toString());
			return false;
		}
	}
	
	public static boolean clickTopItem() throws Exception {
		try {	
			mnuTopItem.click();
			//Waits.waitInSeconds(5);
			//String pageSource  = Common_Page.mobileDriver.getPageSource();
			//System.out.println("PageSource: " + pageSource);			
			return true;
		} catch (Exception e) {
			LOGGER.info("Step: Navigation || enter item in the search box || Fail");
			Common_Page.setException(e.toString());
			return false;
		}
	}
	
	@SuppressWarnings("deprecation")
	public static boolean verifySuccessfulSearch() throws Exception {
		try {
			if (Driver.getDeviceType().equalsIgnoreCase("android")) {
				if (!Element.isElementPresent(driver, By.xpath("//*[contains(@text,'When you save a search')]"), 30)) {
					throw new Exception("Search for ebay item successfully verified ");
				}
			} else {
				if (!Element.isElementPresent(driver,
						By.xpath("//XCUIElementTypeStaticText[@label='Congratulations!']"), 30)) {
					throw new Exception("Car loan application failed");
				}

			}
			
			return true;
		} catch (Exception e) {
			LOGGER.error("Step: Verification || Scuccessful search ebay item|| Fail\n" + e.getMessage());
			Common_Page.setException(e.toString());
			return false;
		}
	}



	public static boolean clickOnApplyNowButton() {
		try {
			btnApplyNow.click();
			return true;
		} catch (Exception e) {
			LOGGER.info("Step: Navigation || click on 'Apply Now' || Fail");
			Common_Page.setException(e.toString());
			return false;
		}
	}

	public static boolean navigateToCarLoan() {
		try {
			lblCarloan.click();
			return true;
		} catch (Exception e) {
			LOGGER.info("Step: Navigation || Navigate to 'Car loan' || Fail");
			Common_Page.setException(e.toString());
			return false;
		}
	}

	public static boolean fillCarLoanDetails() {
		try {
			String amt = Common_Page.getCSVData("Amount");
			 Waits.waitInSeconds(2);
			LOGGER.info("Page source:" + driver.getPageSource());
			txtBorrowAmt.sendKeys(amt);
			String loanUse = Common_Page.getCSVData("LoanUse");
			if (Driver.getDeviceType().equalsIgnoreCase("android")) {
				driver.findElement(By.xpath("//android.widget.Button[@text='" + loanUse + "']")).click();
			} else {
				driver.findElement(By.xpath("//XCUIElementTypeButton[@label='" + loanUse + "']")).click();
			}
			String isElectricCar = Common_Page.getCSVData("IsElectricCar");
			if (Driver.getDeviceType().equalsIgnoreCase("android")) {
				driver.findElement(By.xpath("//android.widget.Button[@text='" + isElectricCar + "']")).click();
			} else {
				driver.findElement(By.xpath("//XCUIElementTypeButton[@label='" + isElectricCar + "']")).click();
			}
			String carType = Common_Page.getCSVData("CarType");
			if (Driver.getDeviceType().equalsIgnoreCase("android")) {
				driver.findElement(By.xpath("//android.widget.Button[@text='" + carType + "']")).click();
			} else {
				driver.findElement(By.xpath("//XCUIElementTypeButton[@label='" + carType + "']")).click();
			}
			String howOld = "";
			String seller = "";
			if (!carType.contentEquals("New Car")) {
				howOld = Common_Page.getCSVData("HowOld");
				if (Driver.getDeviceType().equalsIgnoreCase("android")) {
					driver.findElement(By.xpath("//android.widget.Button[@text='" + howOld + "']")).click();
				} else {
					driver.findElement(By.xpath("//XCUIElementTypeButton[@label='" + howOld + "']")).click();
				}

				seller = Common_Page.getCSVData("Seller");
				if (Driver.getDeviceType().equalsIgnoreCase("android")) {
					driver.findElement(By.xpath("//android.widget.Button[@text='" + seller + "']")).click();
				} else {
					driver.findElement(By.xpath("//XCUIElementTypeButton[@label='" + seller + "']")).click();
				}
			}

			// LOGGER.info("Page source:" + driver.getPageSource());
			btnContinue.click();			
			if (Element.isElementPresent(driver, By.xpath("//*[@label='Required']"), 1)) {
				Waits.waitInSeconds(2);
				Common_Page.LOGGEROnPass("And", "Screenshot showing mantadory entry of borrwoing amount");
				txtBorrowAmt.sendKeys("25000");
				if (Driver.getDeviceType().equalsIgnoreCase("android")) {
					driver.findElement(By.xpath("//android.widget.Button[@text='" + loanUse + "']")).click();
				} else {
					driver.findElement(By.xpath("//XCUIElementTypeButton[@label='" + loanUse + "']")).click();
				}
				Common_Page.LOGGEROnPass("And", "Screenshot showing post entry of borrwoing amount");
				btnContinue.click();
			}
			
			//Waits.waitInSeconds(2);
			//LOGGER.info("Page source:" + driver.getPageSource());
			
			// Waits.waitInSeconds(2);
			// LOGGER.info("Page source:" + driver.getPageSource());
			// List<WebElement> els1 = ((Object)
			// driver).findElementsByAndroidUIAutomator("new
			// UiSelector().text(\"Continue\")").get(0).click();
			// els1.get(0).click();
			// driver.findElement(MobileBy.AndroidUIAutomator("Continue")).click();
			// ((AndroidDriver)
			// driver).findElementByAndroidUIAutomator("text(\"Continue\")").click();
			// driver.findElement(MobileBy.AndroidUIAutomator("text(\"Continue\")")).click();
			// ((AndroidDriver)driver).findElementByAndroidUIAutomator("new
			// UiSelector().text(\"Used Car\")").click();
			// ((AndroidDriver)driver).findElementByAndroidUIAutomator("new
			// UiSelector().text(\"Continue\")").click();
			// List<AndroidElement> btn_continue =
			// ((AndroidDriver)driver).findElementsByAndroidUIAutomator("new
			// UiSelector().text(\"Continue\")");
			// btn_continue.get(0).click();

			if (Driver.getDeviceType().equalsIgnoreCase("android")) {
				Element.isElementPresent(Common_Page.getMobileDriver(), By.xpath("//*[@text='About your details']"),
						30);
			} else {
				Element.isElementPresent(Common_Page.getMobileDriver(), By.xpath("//*[@label='About your details']"),
						30);
			}
			String homeOwner = Common_Page.getCSVData("HomeOwner");
			if (Driver.getDeviceType().equalsIgnoreCase("android")) {
				driver.findElement(By.xpath("//android.widget.Button[@text='" + homeOwner + "']")).click();
			} else {
				driver.findElement(By.xpath("//XCUIElementTypeButton[@label='" + homeOwner + "']")).click();
			}
			String yrsQualified = Common_Page.getCSVData("YearsQualified");
			if (Driver.getDeviceType().equalsIgnoreCase("android")) {
				driver.findElement(By.xpath("//android.widget.Button[@text='" + yrsQualified + "']")).click();
			} else {
				driver.findElement(By.xpath("//XCUIElementTypeButton[@label='" + yrsQualified + "']")).click();
			}
			String profession = Common_Page.getCSVData("Profession");
			// LOGGER.info("Page source:" + driver.getPageSource());
			ddlProfession.click();
			if (Driver.getDeviceType().equalsIgnoreCase("android")) {

			} else {
				driver.findElement(By.xpath("//*[@label='" + profession + "']")).click();
			}

			String specialisation = Common_Page.getCSVData("Specialisation");
			ddlSpecialisation.click();
			Waits.waitInSeconds(2);
			// LOGGER.info("Page source:" + driver.getPageSource());
			if (Driver.getDeviceType().equalsIgnoreCase("android")) {

			} else {
				WebElement el = driver.findElement(By.xpath("//*[@label='" + specialisation + "']"));
				Action.click(driver, el);
			}

			btnSearch.click();
			// Waits.waitInSeconds(3);
			// LOGGER.info("Page source:" + driver.getPageSource());
			String practitionerNumber = Common_Page.getCSVData("PractitionerNumber");
			if (practitionerNumber.contentEquals("")) {
				chkIPreferToManuallyEnterPractionerNumber.click();
				Waits.waitInSeconds(1);
				txtEnterPractitionerNumber.sendKeys("Test1234");
				btnConfirm.click();
				Common_Page.LOGGEROnPass("And", "Screenshot of manual entry of practitioner number");
			} else {
				if (Driver.getDeviceType().equalsIgnoreCase("android")) {
					Element.isElementPresent(Common_Page.getMobileDriver(),
							By.xpath("//*[@text='" + practitionerNumber + "']"), 30);
				} else {
					Element.isElementPresent(Common_Page.getMobileDriver(),
							By.xpath("//*[@label='" + practitionerNumber + "']"), 30);
				}
				if (Driver.getDeviceType().equalsIgnoreCase("android")) {

				} else {
					driver.findElement(By.xpath("//*[@label='" + practitionerNumber + "']")).click();
				}
			}
			
			String newPpractitionerNumber = Common_Page.getCSVData("NewPractitionerNumber");
			if (!newPpractitionerNumber.contentEquals("")) {
				Waits.waitInSeconds(2);
				Common_Page.LOGGEROnPass("And", "Screenshot of incorrect practitioner number");
				btnSearch.click();
				if (Driver.getDeviceType().equalsIgnoreCase("android")) {
					Element.isElementPresent(Common_Page.getMobileDriver(),
							By.xpath("//*[@text='" + newPpractitionerNumber + "']"), 30);
				} else {
					Element.isElementPresent(Common_Page.getMobileDriver(),
							By.xpath("//*[@label='" + newPpractitionerNumber + "']"), 30);
				}
				if (Driver.getDeviceType().equalsIgnoreCase("android")) {

				} else {
					driver.findElement(By.xpath("//*[@label='" + newPpractitionerNumber + "']")).click();
				}
				Common_Page.LOGGEROnPass("And", "Screenshot of correct practitioner number");				
			}
			

			btnContinue.click();
			if (Driver.getDeviceType().equalsIgnoreCase("android")) {
				Element.isElementPresent(Common_Page.getMobileDriver(), By.xpath("//*[@text='About your vehicle']"),
						30);
			} else {
				Element.isElementPresent(Common_Page.getMobileDriver(), By.xpath("//*[@label='About your vehicle']"),
						30);
			}
			Gestures.swipeToElement(driver, lblPromoCode, "up");
			Waits.waitInSeconds(1);
			btnContinue.click();
			if ((!howOld.contentEquals("3+ years")) && (!loanUse.contentEquals("Personal Use"))
					&& (!seller.contentEquals("Private Seller")) && (!practitionerNumber.contentEquals(""))
					&& (!homeOwner.contentEquals("No"))) {
				if (Driver.getDeviceType().equalsIgnoreCase("android")) {
					Element.isElementPresent(Common_Page.getMobileDriver(), By.xpath("//*[@text='Your loan details']"),
							5);
				} else {
					Element.isElementPresent(Common_Page.getMobileDriver(), By.xpath("//*[@label='Your loan details']"),
							5);
				}
				Gestures.swipeToElement(driver, lblTotalRepayments, "up");
				Common_Page.LOGGEROnPass("And", "Screenshot of repayment details");
				// LOGGER.info("Page source:" + driver.getPageSource());
				String newAmount = Common_Page.getCSVData("NewAmount");
				if (!newAmount.contentEquals("")) {
					Gestures.swipeToElement(driver, txtNewBrrowAmount, "down");
					txtNewBrrowAmount.clear();
					txtNewBrrowAmount.sendKeys(newAmount);
					String interestType = Common_Page.getCSVData("InterestType");
					driver.findElement(By.xpath("//*[@label='" + interestType + "']")).click();
					// Pay off in years
					String payOffIn = Common_Page.getCSVData("PayOffIn");
					double d = Double.parseDouble(payOffIn);
					DecimalFormat f = new DecimalFormat("##.00");
				     String newStr = String.valueOf(f.format(d));
					for (int i = 0;i<5;i++) {
					  Gestures.swipeToDirection_iOS_XCTest(driver, slPayOffIn, "right");
					  if (slPayOffIn.getAttribute("value").contentEquals(newStr)) {
						 break; 
					  }
					}
					// Residual loan amount
					String residual = Common_Page.getCSVData("Residual");
					double dresidual = Double.parseDouble(residual);					
				     String newResidual = String.valueOf(f.format(dresidual));
				     for (int i = 0;i<20;i++) {
						  Gestures.swipeToDirection_iOS_XCTest(driver, slResidual, "right");
						  if (slResidual.getAttribute("value").contentEquals(newResidual)) {
							 break; 
						  }	 
				     }				     
				     Common_Page.LOGGEROnPass("And", "Screenshot of new repayment details");
				}
				
				String newCarType = Common_Page.getCSVData("NewCarType");
				if (!newCarType.contentEquals("")) {
					btnBack.click();
					btnBack.click();
					btnBack.click();
					if (Driver.getDeviceType().equalsIgnoreCase("android")) {
						driver.findElement(By.xpath("//android.widget.Button[@text='" + newCarType + "']")).click();
					} else {
						driver.findElement(By.xpath("//XCUIElementTypeButton[@label='" + newCarType + "']")).click();
					}
					
					btnContinue.click();
					if (Driver.getDeviceType().equalsIgnoreCase("android")) {
						Element.isElementPresent(Common_Page.getMobileDriver(), By.xpath("//*[@text='About your details']"),
								5);
					} else {
						Element.isElementPresent(Common_Page.getMobileDriver(), By.xpath("//*[@label='About your details']"),
								5);
					}
					btnContinue.click();
					if (Driver.getDeviceType().equalsIgnoreCase("android")) {
						Element.isElementPresent(Common_Page.getMobileDriver(), By.xpath("//*[@text='About your vehicle']"),
								5);
					} else {
						Element.isElementPresent(Common_Page.getMobileDriver(), By.xpath("//*[@label='About your vehicle']"),
								5);
					}
					btnContinue.click();
					if (Driver.getDeviceType().equalsIgnoreCase("android")) {
						Element.isElementPresent(Common_Page.getMobileDriver(), By.xpath("//*[@text='Your loan details']"),
								5);
					} else {
						Element.isElementPresent(Common_Page.getMobileDriver(), By.xpath("//*[@label='Your loan details']"),
								5);
					}
				}

				btnContinue.click();
			}
			
			  for (WebElement element : chkTheLegalStuff) {
				  element.click();
				  
			  }
			  
			 
			return true;
			} catch (Exception e) {
			LOGGER.info("Step: Navigation || Fill car loan details || Fail");
			Common_Page.setException(e.toString());
			return false;
		}
	}

	public static boolean clickSubmitButton() {
		try {
			btnSubmit.click();
			return true;
		} catch (Exception e) {
			LOGGER.info("Step: Navigation || click on 'Submit' || Fail");
			Common_Page.setException(e.toString());
			return false;
		}
	}

	public boolean verifySuccessfulCarLoanApplication() {
		try {
			if (Driver.getDeviceType().equalsIgnoreCase("android")) {
				if (!Element.isElementPresent(driver, By.xpath("//*[@text='Congratulations!']"), 30)) {
					throw new Exception("Car loan application failed");
				}
			} else {

				if (!Element.isElementPresent(driver,
						By.xpath("//XCUIElementTypeStaticText[@label='Congratulations!']"), 30)) {
					throw new Exception("Car loan application failed");
				}

			}
			RemoteWebElement btnYes = (RemoteWebElement) driver.findElement(By.xpath("//*[@label='Yes']"));
			Gestures.swipeToElement(driver, btnYes, "up");
			Waits.waitInSeconds(2);
			return true;
		} catch (Exception e) {
			LOGGER.error("Step: Verification || Scuccessful car loan application|| Fail\n" + e.getMessage());
			Common_Page.setException(e.toString());
			return false;
		}
	}

}
