package apptest.stepdefinitions.features;

import apptest.pages.Common_Page;
import io.cucumber.java.en.Given;

public class ViewContractAccessHappyPath {
	@Given("scenario View Contract Access Happy Path ends")
	public void scenario_view_contract_access_happy_path_ends() throws Exception {
		try {

		} catch (Exception e) {
			Common_Page.setScenarioResult(false);
		} finally {
			if (!Common_Page.isScenarioResult()) {				
					throw new Exception("Scenario 'View Contract Access Happy Path' FAILED");					
				
			}
		}
	
	}
}


