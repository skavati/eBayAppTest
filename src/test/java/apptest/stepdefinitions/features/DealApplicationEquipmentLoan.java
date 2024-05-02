package apptest.stepdefinitions.features;

import apptest.pages.Common_Page;
import io.cucumber.java.en.Given;

public class DealApplicationEquipmentLoan {
	@Given("scenario Deal Application - Equipment Loan ends")
	public void scenario_deal_application_equipment_loan_ends() throws Exception {
		try {

		} catch (Exception e) {
			Common_Page.setScenarioResult(false);
		} finally {
			if (!Common_Page.isScenarioResult()) {				
					throw new Exception("Scenario 'Deal Application - Equipment Loan' FAILED");					
				
			}
		}
	
	}
}

