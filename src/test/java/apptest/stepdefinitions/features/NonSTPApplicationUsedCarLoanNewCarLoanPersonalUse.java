package apptest.stepdefinitions.features;

import apptest.pages.Common_Page;
import io.cucumber.java.en.Given;

public class NonSTPApplicationUsedCarLoanNewCarLoanPersonalUse {
	@Given("scenario Non-STP application for a used car loan \\/ new car loan - Personal use ends")
	public void scenario_non_stp_application_for_a_used_car_loan_new_car_loan_personal_use_ends() throws Exception {
		try {

		} catch (Exception e) {
			Common_Page.setScenarioResult(false);
		} finally {
			if (!Common_Page.isScenarioResult()) {
				throw new Exception("Scenario 'Non-STP application for a used car loan\new car loan - Personal use' FAILED");

			}
		}

	}

}
