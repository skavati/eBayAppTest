package apptest.stepdefinitions.features;

import apptest.pages.Common_Page;
import io.cucumber.java.en.Given;

public class CarLoanHappyPath {
	@Given("scenario Car Loan Happy Path ends")
	public void scenario_car_loan_happy_path_ends() throws Exception {
		try {

		} catch (Exception e) {
			Common_Page.setScenarioResult(false);
		} finally {
			if (!Common_Page.isScenarioResult()) {				
					throw new Exception("Scenario 'Car Loan Happy Path' FAILED");					
				
			}
		}
	
	}
}
