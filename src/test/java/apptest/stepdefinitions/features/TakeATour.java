package apptest.stepdefinitions.features;

import apptest.pages.Common_Page;
import io.cucumber.java.en.Given;

public class TakeATour {
	@Given("scenario Take a Tour ends")
	public void scenario_take_a_tour_ends() throws Exception {
		try {

		} catch (Exception e) {
			Common_Page.setScenarioResult(false);
		} finally {
			if (!Common_Page.isScenarioResult()) {
				throw new Exception("Scenario 'Take a Tour' FAILED");

			}
		}

	}

}
