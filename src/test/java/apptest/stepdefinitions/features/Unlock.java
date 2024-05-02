package apptest.stepdefinitions.features;

import apptest.pages.Common_Page;
import io.cucumber.java.en.Given;

public class Unlock {
	@Given("scenario Unlock ends")
	public void scenario_unlock_ends() throws Exception {
		try {

		} catch (Exception e) {
			Common_Page.setScenarioResult(false);
		} finally {
			if (!Common_Page.isScenarioResult()) {				
					throw new Exception("Scenario ' Unlock' FAILED");					
				
			}
		}
	
	}
}
