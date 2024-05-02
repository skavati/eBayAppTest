@ebay @appTest
Feature: Search an ebay item

  @tearDown 
  Scenario: Search an ebay item Happy Path
    Given scenario starts "AppTestData" "SearchItem" "SearchItem Happy Path"
    Given I launch Credabl app on device
    And I close login screen
    And I enter ebay item in the search box
    When I tap on top item   
    Then I verify ebay item from the list 
    #Given scenario SearchItem Happy Path ends
    
  
    
    
    