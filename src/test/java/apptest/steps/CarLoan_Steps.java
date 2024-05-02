package apptest.steps;

import apptest.pages.CarLoan_Page;
import apptest.pages.Common_Page;


public class CarLoan_Steps {
	@SuppressWarnings("unchecked")
	CarLoan_Page carLoanPage = CarLoan_Page.getInstance(Common_Page.getMobileDriver());
	
	Boolean stepPass = true;
	String step = "";

	@SuppressWarnings("static-access")	
	public void clickOnApplyNowButton() throws Exception {
		String step = "Given I click on Apply Now button";
		String keyword = "Given";
		stepPass = true;
		if (Common_Page.isStepFail()) {
			Common_Page.LOGGEROnSkip(keyword, step);
		} else {
			try {		
				if (!(carLoanPage.clickOnApplyNowButton())) {
					stepPass = false;
					throw new Exception(Common_Page.getException());
				}
			} catch (Exception e) {
				stepPass = false;
				Common_Page.setException(e.toString());
			} finally {
				if (stepPass == true) {
					Common_Page.LOGGEROnPass(keyword, step);
				} else {
					Common_Page.setStepFail(true);
					Common_Page.setScenarioResult(false);
					Common_Page.LOGGEROnFail(keyword, step, Common_Page.getException());
				}
			}
		}
	}
	
	@SuppressWarnings("static-access")	
	public void navigateToCarLoan() throws Exception {
		String step = "And I navigate to Car Loan";
		String keyword = "And";
		stepPass = true;
		if (Common_Page.isStepFail()) {
			Common_Page.LOGGEROnSkip(keyword, step);
		} else {
			try {		
				if (!(carLoanPage.navigateToCarLoan())) {
					stepPass = false;
					throw new Exception(Common_Page.getException());
				}
			} catch (Exception e) {
				stepPass = false;
				Common_Page.setException(e.toString());
			} finally {
				if (stepPass == true) {
					Common_Page.LOGGEROnPass(keyword, step);
				} else {
					Common_Page.setStepFail(true);
					Common_Page.setScenarioResult(false);
					Common_Page.LOGGEROnFail(keyword, step, Common_Page.getException());
				}
			}
		}
	}
	
	@SuppressWarnings("static-access")	
	public void fillCarLoanDetails() throws Exception {
		String step = "And I fill car loan details";
		String keyword = "And";
		stepPass = true;
		if (Common_Page.isStepFail()) {
			Common_Page.LOGGEROnSkip(keyword, step);
		} else {
			try {		
				if (!(carLoanPage.fillCarLoanDetails())) {
					stepPass = false;
					throw new Exception(Common_Page.getException());
				}
			} catch (Exception e) {
				stepPass = false;
				Common_Page.setException(e.toString());
			} finally {
				if (stepPass == true) {
					Common_Page.LOGGEROnPass(keyword, step);
				} else {
					Common_Page.setStepFail(true);
					Common_Page.setScenarioResult(false);
					Common_Page.LOGGEROnFail(keyword, step, Common_Page.getException());
				}
			}
		}
	}
	
	@SuppressWarnings("static-access")	
	public void clickSubmitButton() throws Exception {
		String step = "When I submit car loan";
		String keyword = "When";
		stepPass = true;
		if (Common_Page.isStepFail()) {
			Common_Page.LOGGEROnSkip(keyword, step);
		} else {
			try {		
				if (!(carLoanPage.clickSubmitButton())) {
					stepPass = false;
					throw new Exception(Common_Page.getException());
				}
			} catch (Exception e) {
				stepPass = false;
				Common_Page.setException(e.toString());
			} finally {
				if (stepPass == true) {
					Common_Page.LOGGEROnPass(keyword, step);
				} else {
					Common_Page.setStepFail(true);
					Common_Page.setScenarioResult(false);
					Common_Page.LOGGEROnFail(keyword, step, Common_Page.getException());
				}
			}
		}
	}
	
	@SuppressWarnings("static-access")	
	public void verifySuccessfulCarLoanApplication() throws Exception {
		String step = "Then I should verify successful submission of car loan application";
		String keyword = "Then";
		stepPass = true;
		if (Common_Page.isStepFail()) {
			Common_Page.LOGGEROnSkip(keyword, step);
		} else {
			try {		
				if (!(carLoanPage.verifySuccessfulCarLoanApplication())) {
					stepPass = false;
					throw new Exception(Common_Page.getException());
				}
			} catch (Exception e) {
				stepPass = false;
				Common_Page.setException(e.toString());
			} finally {
				if (stepPass == true) {
					Common_Page.LOGGEROnPass(keyword, step);
				} else {
					Common_Page.setStepFail(true);
					Common_Page.setScenarioResult(false);
					Common_Page.LOGGEROnFail(keyword, step, Common_Page.getException());
				}
			}
		}
	}
	
	@SuppressWarnings("static-access")
	public void click_X_btn() throws Exception {
		String step = "And I close login screen";
		String keyword = "And";
		stepPass = true;
		if (Common_Page.isStepFail()) {
			Common_Page.LOGGEROnSkip(keyword, step);
		} else {
			try {
				if (!(carLoanPage.click_X_btn())) {
					stepPass = false;
					throw new Exception(Common_Page.getException());
				}
			} catch (Exception e) {
				stepPass = false;
				Common_Page.setException(e.toString());
			} finally {
				if (stepPass == true) {
					Common_Page.LOGGEROnPass(keyword, step);
				} else {
					Common_Page.setStepFail(true);
					Common_Page.setScenarioResult(false);
					Common_Page.LOGGEROnFail(keyword, step, Common_Page.getException());
				}
			}
		}
	}
	
	
	@SuppressWarnings("static-access")
	public void enterSearchBox() throws Exception {
		String step = "And I enter ebay item in the search box";
		String keyword = "And";
		stepPass = true;
		if (Common_Page.isStepFail()) {
			Common_Page.LOGGEROnSkip(keyword, step);
		} else {
			try {
				if (!(carLoanPage.enterSearchBox())) {
					stepPass = false;
					throw new Exception(Common_Page.getException());
				}
			} catch (Exception e) {
				stepPass = false;
				Common_Page.setException(e.toString());
			} finally {
				if (stepPass == true) {
					Common_Page.LOGGEROnPass(keyword, step);
				} else {
					Common_Page.setStepFail(true);
					Common_Page.setScenarioResult(false);
					Common_Page.LOGGEROnFail(keyword, step, Common_Page.getException());
				}
			}
		}
	}
	
	@SuppressWarnings("static-access")
	public void clickTopItem() throws Exception {
		String step = "And I tap on top item ";
		String keyword = "And";
		stepPass = true;
		if (Common_Page.isStepFail()) {
			Common_Page.LOGGEROnSkip(keyword, step);
		} else {
			try {
				if (!(carLoanPage.clickTopItem())) {
					stepPass = false;
					throw new Exception(Common_Page.getException());
				}
			} catch (Exception e) {
				stepPass = false;
				Common_Page.setException(e.toString());
			} finally {
				if (stepPass == true) {
					Common_Page.LOGGEROnPass(keyword, step);
				} else {
					Common_Page.setStepFail(true);
					Common_Page.setScenarioResult(false);
					Common_Page.LOGGEROnFail(keyword, step, Common_Page.getException());
				}
			}
		}
	}
	
	@SuppressWarnings("static-access")
	public void verifySuccessfulSearch() throws Exception {
		String step = "Then I verify ebay item from the list";
		String keyword = "Then";
		stepPass = true;
		if (Common_Page.isStepFail()) {
			Common_Page.LOGGEROnSkip(keyword, step);
		} else {
			try {
				if (!(carLoanPage.verifySuccessfulSearch())) {
					stepPass = false;
					throw new Exception(Common_Page.getException());
				}
			} catch (Exception e) {
				stepPass = false;
				Common_Page.setException(e.toString());
			} finally {
				if (stepPass == true) {
					Common_Page.LOGGEROnPass(keyword, step);
				} else {
					Common_Page.setStepFail(true);
					Common_Page.setScenarioResult(false);
					Common_Page.LOGGEROnFail(keyword, step, Common_Page.getException());
				}
			}
		}
	}
}
