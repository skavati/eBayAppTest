package apptest.stepdefinitions.features;

import apptest.pages.Common_Page;
import io.cucumber.java.en.Given;

public class SearchMyTransactions {
	@Given("scenario Search My Transactions ends")
	public void scenario_search_my_transactions_ends() throws Exception {
		try {

		} catch (Exception e) {
			Common_Page.setScenarioResult(false);
		} finally {
			if (!Common_Page.isScenarioResult()) {				
					throw new Exception("Scenario 'Search My Transactions' FAILED");					
				
			}
		}
	
	}
}