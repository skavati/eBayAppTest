package apptest.stepdefinitions.features;

import apptest.pages.Common_Page;
import io.cucumber.java.en.Given;

public class ViewRequestsHappyPath {
	@Given("scenario View Requests Happy Path ends")
	public void scenario_view_requests_happy_path_ends() throws Exception {
		try {

		} catch (Exception e) {
			Common_Page.setScenarioResult(false);
		} finally {
			if (!Common_Page.isScenarioResult()) {				
					throw new Exception("Scenario 'View Requests Happy Path' FAILED");					
				
			}
		}
	
	}
}

