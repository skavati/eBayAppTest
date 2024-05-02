package apptest.stepdefinitions.features;

import apptest.pages.Common_Page;
import io.cucumber.java.en.Given;

public class STPApplicationUsedCarLoan {
	@Given("scenario STP application for used car loan ends")
	public void scenario_stp_application_for_used_car_loan_ends() throws Exception {
		try {

		} catch (Exception e) {
			Common_Page.setScenarioResult(false);
		} finally {
			if (!Common_Page.isScenarioResult()) {
				throw new Exception("Scenario 'STP application for used car loan' FAILED");

			}
		}

	}

}
