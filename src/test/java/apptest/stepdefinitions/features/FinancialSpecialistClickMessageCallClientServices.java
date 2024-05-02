package apptest.stepdefinitions.features;

import apptest.pages.Common_Page;
import io.cucumber.java.en.Given;

public class FinancialSpecialistClickMessageCallClientServices {
	@Given("scenario Financial Specialist - click on message, call Client services ends")
	public void scenario_financial_specialist_click_on_message_call_client_services_ends() throws Exception {
	   
		try {

		} catch (Exception e) {
			Common_Page.setScenarioResult(false);
		} finally {
			if (!Common_Page.isScenarioResult()) {				
					throw new Exception("Scenario 'Financial Specialist - click on message, call Client services' FAILED");					
				
			}
		}
	
	}
}
