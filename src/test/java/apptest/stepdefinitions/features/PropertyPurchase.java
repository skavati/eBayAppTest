package apptest.stepdefinitions.features;

import apptest.pages.Common_Page;
import io.cucumber.java.en.Given;

public class PropertyPurchase {
	@Given("scenario Property Purchase ends")
	public void scenario_property_purchase_ends() throws Exception {
		try {

		} catch (Exception e) {
			Common_Page.setScenarioResult(false);
		} finally {
			if (!Common_Page.isScenarioResult()) {
				throw new Exception("Scenario 'Property Purchase' FAILED");

			}
		}

	}

}