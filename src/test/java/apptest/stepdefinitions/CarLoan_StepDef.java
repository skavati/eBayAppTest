package apptest.stepdefinitions;

import apptest.steps.CarLoan_Steps;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CarLoan_StepDef {
	CarLoan_Steps carLoanSteps = new CarLoan_Steps();
	
	@Given("I click on Apply Now button")
	public void i_click_on_apply_now_button() throws Exception {
		carLoanSteps.clickOnApplyNowButton();
	}

	@Given("I navigate to Car Loan")
	public void i_navigate_to_car_loan() throws Exception {
		carLoanSteps.navigateToCarLoan();
	}

	@Given("I fill car loan details")
	public void i_fill_car_loan_details() throws Exception {
		carLoanSteps.fillCarLoanDetails();
	}

	@When("I submit car loan")
	public void i_submit_car_loan() throws Exception {
		carLoanSteps.clickSubmitButton();
	}

	@Then("I should verify successful submission of car loan application")
	public void i_should_verify_successful_submission_of_car_loan_application() throws Exception {
		carLoanSteps.verifySuccessfulCarLoanApplication();
	}
	@Given("I close login screen")
	public void i_close_login_screen() throws Exception {
		carLoanSteps.click_X_btn();
	}
	
	@Given("I enter ebay item in the search box")
	public void i_enter_ebay_item_in_the_search_box() throws Exception {
		carLoanSteps.enterSearchBox();
	}
	
	@Given("I tap on top item")
	public void i_tap_on_top_item() throws Exception {
		carLoanSteps.clickTopItem();
	}
	
	@Then("I verify ebay item from the list")
	public void i_verify_ebay_item_from_the_list() throws Exception {
		carLoanSteps.verifySuccessfulSearch();
	}

}
