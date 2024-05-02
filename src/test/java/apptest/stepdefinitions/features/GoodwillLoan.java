package apptest.stepdefinitions.features;

import apptest.pages.Common_Page;
import io.cucumber.java.en.Given;

public class GoodwillLoan {
	@Given("scenario Goodwill Loan ends")
	public void scenario_goodwill_loan_ends() throws Exception {
		try {

		} catch (Exception e) {
			Common_Page.setScenarioResult(false);
		} finally {
			if (!Common_Page.isScenarioResult()) {				
					throw new Exception("Scenario 'Goodwill Loan' FAILED");					
				
			}
		}
	
	}
}
