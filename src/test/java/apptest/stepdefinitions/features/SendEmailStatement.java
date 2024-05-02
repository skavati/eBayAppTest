package apptest.stepdefinitions.features;

import apptest.pages.Common_Page;
import io.cucumber.java.en.Given;

public class SendEmailStatement {
	@Given("scenario Send Email Statement ends")
	public void scenario_send_email_statement_ends() throws Exception {
		try {

		} catch (Exception e) {
			Common_Page.setScenarioResult(false);
		} finally {
			if (!Common_Page.isScenarioResult()) {				
					throw new Exception("Scenario 'Send Email Statement' FAILED");					
				
			}
		}
	
	}
}
