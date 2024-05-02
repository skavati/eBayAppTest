package apptest.stepdefinitions.features;

import apptest.pages.Common_Page;
import io.cucumber.java.en.Given;

public class ViewPendingDirectDebits {
	@Given("scenario View Pending Direct Debits ends")
	public void scenario_view_pending_direct_debits_ends() throws Exception {
		try {

		} catch (Exception e) {
			Common_Page.setScenarioResult(false);
		} finally {
			if (!Common_Page.isScenarioResult()) {				
					throw new Exception("Scenario 'View Pending Direct Debits' FAILED");					
				
			}
		}
	
	}
}