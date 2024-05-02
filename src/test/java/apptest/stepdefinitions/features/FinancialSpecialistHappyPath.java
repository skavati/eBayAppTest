package apptest.stepdefinitions.features;

import apptest.pages.Common_Page;
import io.cucumber.java.en.Given;

public class FinancialSpecialistHappyPath {
	@Given("scenario Financial Specialist Happy Path ends")
	public void scenario_financial_specialist_happy_path_ends() throws Exception {
		try {

		} catch (Exception e) {
			Common_Page.setScenarioResult(false);
		} finally {
			if (!Common_Page.isScenarioResult()) {				
					throw new Exception("Scenario 'Financial Specialist Happy Path' FAILED");					
				
			}
		}
	
	}
}