package apptest.stepdefinitions.features;

import apptest.pages.Common_Page;
import io.cucumber.java.en.Given;

public class DownloadStatement {
	@Given("scenario Download Statement ends")
	public void scenario_download_statement_ends() throws Exception {
		try {

		} catch (Exception e) {
			Common_Page.setScenarioResult(false);
		} finally {
			if (!Common_Page.isScenarioResult()) {				
					throw new Exception("Scenario 'Download Statement' FAILED");					
				
			}
		}
	
	}
}
