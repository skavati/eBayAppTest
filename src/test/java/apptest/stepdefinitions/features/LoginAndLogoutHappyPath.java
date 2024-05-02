package apptest.stepdefinitions.features;

import apptest.pages.Common_Page;
import io.cucumber.java.en.Given;

public class LoginAndLogoutHappyPath {
	@Given("scenario LoginAndLogout Happy Path ends")
	public void scenario_login_and_logout_happy_path_ends() throws Exception {
		try {

		} catch (Exception e) {
			Common_Page.setScenarioResult(false);
		} finally {
			if (!Common_Page.isScenarioResult()) {				
					throw new Exception("Scenario 'LoginAndLogout Happy Path' FAILED");					
				
			}
		}
	
	}
}