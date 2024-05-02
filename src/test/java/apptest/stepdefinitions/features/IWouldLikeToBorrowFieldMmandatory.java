package apptest.stepdefinitions.features;

import apptest.pages.Common_Page;
import io.cucumber.java.en.Given;

public class IWouldLikeToBorrowFieldMmandatory {
	@Given("scenario I would like to borrow field is mandatory for deal application ends")
	public void scenario_i_would_like_to_borrow_field_is_mandatory_for_deal_application_ends() throws Exception {
		try {

		} catch (Exception e) {
			Common_Page.setScenarioResult(false);
		} finally {
			if (!Common_Page.isScenarioResult()) {				
					throw new Exception("Scenario 'I would like to borrow field is mandatory for deal application' FAILED");					
				
			}
		}
	
	}
}
