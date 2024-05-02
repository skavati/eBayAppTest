package apptest.stepdefinitions.features;

import apptest.pages.Common_Page;
import io.cucumber.java.en.Given;

public class RequestAPayoutQuote {
	@Given("scenario Request a Payout Quote ends")
	public void scenario_request_a_payout_quote_ends() throws Exception {
		try {

		} catch (Exception e) {
			Common_Page.setScenarioResult(false);
		} finally {
			if (!Common_Page.isScenarioResult()) {				
					throw new Exception("Scenario 'Request a Payout Quote' FAILED");					
				
			}
		}
	
	}
}

