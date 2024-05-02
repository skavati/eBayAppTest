 @CarLoan @appTest
Feature: Car loan

@tearDown
  Scenario: Car Loan Happy Path
    Given scenario starts "AppTestData" "Car Loan" "Car Loan Happy Path"
    Given I launch Credabl app on device
    And I tap on Login button
    And I created a session PIN
    And I enter login credentials
    When I click on Sign in
    Then I should verify successful loginto Credabl
    Given I click on Apply Now button
    And I navigate to Car Loan
    And I fill car loan details
    When I submit car loan
    Then I should verify successful submission of car loan application
    Given scenario Car Loan Happy Path ends
    
  #@tearDown
  #Scenario: STP application for new car loan
    #Given scenario starts "AppTestData" "Car Loan" "STP application for new car loan"
    #Given I launch Credabl app on device
    #And I tap on Login button
    #And I created a session PIN
    #And I enter login credentials
    #When I click on Sign in
    #Then I should verify successful loginto Credabl
    #Given I click on Apply Now button
    #And I navigate to Car Loan
    #And I fill car loan details
    #When I submit car loan
    #Then I should verify successful submission of car loan application
    #Given scenario STP application for new car loan ends
    #
    #@tearDown
  #Scenario: STP application for used car loan
    #Given scenario starts "AppTestData" "Car Loan" "STP application for used car loan"
    #Given I launch Credabl app on device
    #And I tap on Login button
    #And I created a session PIN
    #And I enter login credentials
    #When I click on Sign in
    #Then I should verify successful loginto Credabl
    #Given I click on Apply Now button
    #And I navigate to Car Loan
    #And I fill car loan details
    #When I submit car loan
    #Then I should verify successful submission of car loan application
    #Given scenario STP application for used car loan ends
    #
   #@tearDown
  #Scenario: Non-STP application for a used car loan 3+ years
    #Given scenario starts "AppTestData" "Car Loan" "Non-STP application for a used car loan 3+ years"
    #Given I launch Credabl app on device
    #And I tap on Login button
    #And I created a session PIN
    #And I enter login credentials
    #When I click on Sign in
    #Then I should verify successful loginto Credabl
    #Given I click on Apply Now button
    #And I navigate to Car Loan
    #And I fill car loan details
    #When I submit car loan
    #Then I should verify successful submission of car loan application
    #Given scenario Non-STP application for a used car loan 3+ years ends
    #
  #@tearDown
  #Scenario: Non-STP application for a used car loan <3 years, Private seller
    #Given scenario starts "AppTestData" "Car Loan" "Non-STP application for a used car loan <3 years, Private seller"
    #Given I launch Credabl app on device
    #And I tap on Login button
    #And I created a session PIN
    #And I enter login credentials
    #When I click on Sign in
    #Then I should verify successful loginto Credabl
    #Given I click on Apply Now button
    #And I navigate to Car Loan
    #And I fill car loan details
    #When I submit car loan
    #Then I should verify successful submission of car loan application
    #Given scenario Non-STP application for a used car loan <3 years, Private seller ends
    #
  #@tearDown
  #Scenario: Non-STP application for a used car loan / new car loan - Personal use
    #Given scenario starts "AppTestData" "Car Loan" "Non-STP application for a used car loan / new car loan - Personal use"
    #Given I launch Credabl app on device
    #And I tap on Login button
    #And I created a session PIN
    #And I enter login credentials
    #When I click on Sign in
    #Then I should verify successful loginto Credabl
    #Given I click on Apply Now button
    #And I navigate to Car Loan
    #And I fill car loan details
    #When I submit car loan
    #Then I should verify successful submission of car loan application
    #Given scenario Non-STP application for a used car loan / new car loan - Personal use ends
    #
    #@tearDown
  #Scenario: Non-STP application for a new car loan and enter manually the practitioner number in the search
    #Given scenario starts "AppTestData" "Car Loan" "Non-STP application for a new car loan and enter manually the practitioner number in the search"
    #Given I launch Credabl app on device
    #And I tap on Login button
    #And I created a session PIN
    #And I enter login credentials
    #When I click on Sign in
    #Then I should verify successful loginto Credabl
    #Given I click on Apply Now button
    #And I navigate to Car Loan
    #And I fill car loan details
    #When I submit car loan
    #Then I should verify successful submission of car loan application
    #Given scenario Non-STP application for a new car loan and enter manually the practitioner number in the search ends
    #
     #@tearDown     
     #Scenario: Non-STP application for a used car loan <3 years, Dealer, No a home owner
    #Given scenario starts "AppTestData" "Car Loan" "Non-STP application for a used car loan <3 years, Dealer, No a home owner"
    #Given I launch Credabl app on device
    #And I tap on Login button
    #And I created a session PIN
    #And I enter login credentials
    #When I click on Sign in
    #Then I should verify successful loginto Credabl
    #Given I click on Apply Now button
    #And I navigate to Car Loan
    #And I fill car loan details
    #When I submit car loan
    #Then I should verify successful submission of car loan application
    #Given scenario Non-STP application for a used car loan <3 years, Dealer, No a home owner ends
    #
     #@tearDown     
     #Scenario: Manually adjust interest type, terms, and residual (according to the STP criteria)
    #Given scenario starts "AppTestData" "Car Loan" "Manually adjust interest type, terms, and residual (according to the STP criteria)"
    #Given I launch Credabl app on device
    #And I tap on Login button
    #And I created a session PIN
    #And I enter login credentials
    #When I click on Sign in
    #Then I should verify successful loginto Credabl
    #Given I click on Apply Now button
    #And I navigate to Car Loan
    #And I fill car loan details
    #When I submit car loan
    #Then I should verify successful submission of car loan application
    #Given scenario Non-STP application for a used car loan <3 years, Dealer, No a home owner ends
    #
     #@tearDown     
     #Scenario: Update the information after the Mobile App displays the loan repayment calculator
    #Given scenario starts "AppTestData" "Car Loan" "Update the information after the Mobile App displays the loan repayment calculator"
    #Given I launch Credabl app on device
    #And I tap on Login button
    #And I created a session PIN
    #And I enter login credentials
    #When I click on Sign in
    #Then I should verify successful loginto Credabl
    #Given I click on Apply Now button
    #And I navigate to Car Loan
    #And I fill car loan details
    #When I submit car loan
    #Then I should verify successful submission of car loan application
    #Given scenario Update the information after the Mobile App displays the loan repayment calculator ends
    #
    #@tearDown     
     #Scenario: I would like to borrow field is mandatory for deal application
    #Given scenario starts "AppTestData" "Car Loan" "I would like to borrow field is mandatory for deal application"
    #Given I launch Credabl app on device
    #And I tap on Login button
    #And I created a session PIN
    #And I enter login credentials
    #When I click on Sign in
    #Then I should verify successful loginto Credabl
    #Given I click on Apply Now button
    #And I navigate to Car Loan
    #And I fill car loan details
    #When I submit car loan
    #Then I should verify successful submission of car loan application
    #Given scenario I would like to borrow field is mandatory for deal application ends
    #
     #@tearDown     
     #Scenario: The client selects the wrong practitioner number and needs to search for it again
    #Given scenario starts "AppTestData" "Car Loan" "The client selects the wrong practitioner number and needs to search for it again"
    #Given I launch Credabl app on device
    #And I tap on Login button
    #And I created a session PIN
    #And I enter login credentials
    #When I click on Sign in
    #Then I should verify successful loginto Credabl
    #Given I click on Apply Now button
    #And I navigate to Car Loan
    #And I fill car loan details
    #When I submit car loan
    #Then I should verify successful submission of car loan application
    #Given scenario The client selects the wrong practitioner number and needs to search for it again ends
    #
    