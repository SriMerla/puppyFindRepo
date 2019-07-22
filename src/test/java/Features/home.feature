Feature: HomePage Functionality I want to use this template for my feature file

  Scenario: User verifies all the links in the home page
    Given User is on WebPage
    When user verifies all the links in the home page
    Then user confirms the links are corresponding to their respective pages
    
  Scenario: User selects a puppy from popular Dog breeds on home Page
     Given user is on homepage
     When user Clicks a link in popular dog breeds
     Then user verifies the details of the breed
     And clicks on that breed puppies for sale
     And verifies the search results displayed

  
