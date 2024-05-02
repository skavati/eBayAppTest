package apptest.stepdefinitions.features;

import apptest.pages.Common_Page;
import io.cucumber.java.en.Given;

public class NonSTPApplicationNoHomeOwner {
	@Given("scenario Non-STP application for a used car loan <{int} years, Dealer, No a home owner ends")
	public void scenario_non_stp_application_for_a_used_car_loan_years_dealer_no_a_home_owner_ends(Integer int1) throws Exception {
		try {

		} catch (Exception e) {
			Common_Page.setScenarioResult(false);
		} finally {
			if (!Common_Page.isScenarioResult()) {
				throw new Exception("Scenario 'Non-STP application for a used car loan <{int} years, Dealer, No a home owner' FAILED");

			}
		}

	}

}
