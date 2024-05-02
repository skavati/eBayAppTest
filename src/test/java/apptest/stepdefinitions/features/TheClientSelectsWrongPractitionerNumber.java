package apptest.stepdefinitions.features;

import apptest.pages.Common_Page;
import io.cucumber.java.en.Given;

public class TheClientSelectsWrongPractitionerNumber {
	@Given("scenario The client selects the wrong practitioner number and needs to search for it again ends")
	public void scenario_the_client_selects_the_wrong_practitioner_number_and_needs_to_search_for_it_again_ends() throws Exception {
		try {

		} catch (Exception e) {
			Common_Page.setScenarioResult(false);
		} finally {
			if (!Common_Page.isScenarioResult()) {				
					throw new Exception("Scenario 'The client selects the wrong practitioner number and needs to search for it again' FAILED");					
				
			}
		}
	
	}
}