package apptest.stepdefinitions.features;

import apptest.pages.Common_Page;
import io.cucumber.java.en.Given;

public class EditContractHappyPath {
	@Given("scenario Edit Contract Happy Path ends")
	public void scenario_edit_contract_happy_path_ends() throws Exception {
		try {

		} catch (Exception e) {
			Common_Page.setScenarioResult(false);
		} finally {
			if (!Common_Page.isScenarioResult()) {				
					throw new Exception("Scenario 'Edit Contract Happy Path' FAILED");					
				
			}
		}
	
	}
}

