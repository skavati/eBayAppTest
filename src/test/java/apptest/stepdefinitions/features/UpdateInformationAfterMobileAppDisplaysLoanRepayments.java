package apptest.stepdefinitions.features;

import apptest.pages.Common_Page;
import io.cucumber.java.en.Given;

public class UpdateInformationAfterMobileAppDisplaysLoanRepayments {
	@Given("scenario Update the information after the Mobile App displays the loan repayment calculator ends")
	public void scenario_update_the_information_after_the_mobile_app_displays_the_loan_repayment_calculator_ends() throws Exception {
		try {

		} catch (Exception e) {
			Common_Page.setScenarioResult(false);
		} finally {
			if (!Common_Page.isScenarioResult()) {				
					throw new Exception("Scenario 'Update the information after the Mobile App displays the loan repayment calculator' FAILED");					
				
			}
		}
	
	}
}


