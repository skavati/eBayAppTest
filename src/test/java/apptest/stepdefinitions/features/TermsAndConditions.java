package apptest.stepdefinitions.features;

import apptest.pages.Common_Page;
import io.cucumber.java.en.Given;

public class TermsAndConditions {
	@Given("scenario Terms and Conditions ends")
	public void scenario_terms_and_conditions_ends() throws Exception {
		try {

		} catch (Exception e) {
			Common_Page.setScenarioResult(false);
		} finally {
			if (!Common_Page.isScenarioResult()) {				
					throw new Exception("Scenario 'Terms and Conditions' FAILED");					
				
			}
		}
	
	}
}