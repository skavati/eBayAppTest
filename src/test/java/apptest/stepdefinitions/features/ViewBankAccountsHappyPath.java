package apptest.stepdefinitions.features;

import apptest.pages.Common_Page;
import io.cucumber.java.en.Given;

public class ViewBankAccountsHappyPath {
	@Given("scenario View Bank Accounts Happy Path ends")
	public void scenario_view_bank_accounts_happy_path_ends() throws Exception {
		try {

		} catch (Exception e) {
			Common_Page.setScenarioResult(false);
		} finally {
			if (!Common_Page.isScenarioResult()) {				
					throw new Exception("Scenario 'View Bank Accounts Happy Path' FAILED");					
				
			}
		}
	
	}
}

