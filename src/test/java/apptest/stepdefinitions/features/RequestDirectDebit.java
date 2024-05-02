package apptest.stepdefinitions.features;

import apptest.pages.Common_Page;
import io.cucumber.java.en.Given;

public class RequestDirectDebit {
	@Given("scenario Request Direct Debit ends")
	public void scenario_request_direct_debit_ends() throws Exception {
		try {

		} catch (Exception e) {
			Common_Page.setScenarioResult(false);
		} finally {
			if (!Common_Page.isScenarioResult()) {				
					throw new Exception("Scenario 'Request Direct Debit' FAILED");					
				
			}
		}
	
	}
}
