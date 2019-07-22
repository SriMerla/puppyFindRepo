Feature: Find A Puppy Fuctionality

  Scenario: User Checks the functionalities available on the find a puppy page
    Given user is on home page
    And user navigates to find a puppy page
    Then user verifies find a puppy by breed ,by state and by Life style are displayed
    And user verifes search by keyword , browse alphabetically are enable
    And verifies the number results displayed on the page
    
  Scenario: User finds a puppy by breed
   
    Given user navigates to Find a puppy page
    And user enters the breed
    And user clicks Find by breed button
    And user verifies the search results

 
 