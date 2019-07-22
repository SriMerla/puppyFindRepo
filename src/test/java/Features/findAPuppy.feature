Feature: Find A Puppy Fuctionality
  
  Background: user is on homepage and navigates to find a puppy page
    Given user is on home page
    And user navigates to find a puppy page
  
  Scenario: User Checks the functionalities available on the find a puppy page
    Then user verifies find a puppy by breed ,by state and by Life style are displayed
    And user verifes search by keyword , browse alphabetically are enable
    And verifies the number results displayed on the page
    
  Scenario: User finds a puppy by breed
  
    Then user enters the breed
    And user clicks Find by breed button
    And user verifies the search results
    
  Scenario: User finds a puppy by state
    When user selects state from dropdown
    And user clicks the search my state button
    Then user verifies the puppies for sale in the state
    
   Scenario:User finds a puppy by life style
    When user selects size , upkeep, purpose
    Then user verifies the search results for find puppy by life style
    
   Scenario: User browse alphabetically for puppies
     When user Clicks on any alphabet on appears on the page
     Then user verifies the browse results

 
 