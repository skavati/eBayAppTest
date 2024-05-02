package apptest.stepdefinitions.features;

import apptest.pages.Common_Page;
import io.cucumber.java.en.Given;

public class GetAssistanceHappyPath {
	@Given("scenario Get Assistance Happy Path ends")
	public void scenario_get_assistance_happy_path_ends() throws Exception {
		try {

		} catch (Exception e) {
			Common_Page.setScenarioResult(false);
		} finally {
			if (!Common_Page.isScenarioResult()) {				
					throw new Exception("Scenario 'Get Assistance Happy Path' FAILED");					
				
			}
		}
	
	}
}