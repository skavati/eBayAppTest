package apptest.stepdefinitions.features;

import apptest.pages.Common_Page;
import io.cucumber.java.en.Given;

public class TalkToUsChangeAddress {
	@Given("scenario Talk to Us - Change Address ends")
	public void scenario_talk_to_us_change_address_ends() throws Exception {
		try {

		} catch (Exception e) {
			Common_Page.setScenarioResult(false);
		} finally {
			if (!Common_Page.isScenarioResult()) {
				throw new Exception("Scenario 'Talk to Us - Change Address' FAILED");

			}
		}

	}

	}