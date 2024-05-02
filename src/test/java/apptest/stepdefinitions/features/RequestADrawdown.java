package apptest.stepdefinitions.features;

import apptest.pages.Common_Page;
import io.cucumber.java.en.Given;

public class RequestADrawdown {
	@Given("scenario Request a Drawdown ends")
	public void scenario_request_a_drawdown_ends() throws Exception {
		try {

		} catch (Exception e) {
			Common_Page.setScenarioResult(false);
		} finally {
			if (!Common_Page.isScenarioResult()) {				
					throw new Exception("Scenario 'Request a Drawdown' FAILED");					
				
			}
		}
	
	}
}