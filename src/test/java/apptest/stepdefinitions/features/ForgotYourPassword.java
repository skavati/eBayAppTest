package apptest.stepdefinitions.features;

import apptest.pages.Common_Page;
import io.cucumber.java.en.Given;

public class ForgotYourPassword {
	@Given("scenario Forgot your password ends")
	public void scenario_forgot_your_password_ends() throws Exception {
		try {

		} catch (Exception e) {
			Common_Page.setScenarioResult(false);
		} finally {
			if (!Common_Page.isScenarioResult()) {				
					throw new Exception("Scenario 'Forgot your password' FAILED");					
				
			}
		}
	
	}
}