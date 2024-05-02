package apptest.stepdefinitions.features;

import apptest.pages.Common_Page;
import io.cucumber.java.en.Given;

public class ViewRequestsTalkToUs {
	@Given("scenario View Requests - Talk to us ends")
	public void scenario_view_requests_talk_to_us_ends() throws Exception {
		try {

		} catch (Exception e) {
			Common_Page.setScenarioResult(false);
		} finally {
			if (!Common_Page.isScenarioResult()) {				
					throw new Exception("Scenario 'View Requests - Talk to us' FAILED");					
				
			}
		}
	
	}
}
