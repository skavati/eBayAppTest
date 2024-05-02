package apptest.stepdefinitions.features;

import apptest.pages.Common_Page;
import io.cucumber.java.en.Given;

public class NonSTPApplicationUsedCarLoanLessThan3YrsPrivateSeller {
	@Given("scenario Non-STP application for a used car loan <{int} years, Private seller ends")
	public void scenario_non_stp_application_for_a_used_car_loan_years_private_seller_ends(Integer int1) throws Exception {
		try {

		} catch (Exception e) {
			Common_Page.setScenarioResult(false);
		} finally {
			if (!Common_Page.isScenarioResult()) {
				throw new Exception("Scenario 'Non-STP application for a used car loan <3 years' FAILED");

			}
		}

	}

}
	


