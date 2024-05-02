package apptest.stepdefinitions.features;

import apptest.pages.Common_Page;
import io.cucumber.java.en.Given;

public class PracticeFitoutLoan {
	@Given("scenario Practice Fitout Loan ends")
	public void scenario_practice_fitout_loan_ends() throws Exception {
		try {

		} catch (Exception e) {
			Common_Page.setScenarioResult(false);
		} finally {
			if (!Common_Page.isScenarioResult()) {
				throw new Exception("Scenario 'Practice Fitout Loan' FAILED");

			}
		}

	}

}