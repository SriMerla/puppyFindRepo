Feature: SearchOpion functionality

  Scenario:User browse for puppies from search option
    Given user is on find a puppy
    When user enters the breed name
    Then user verifies search results appeared in dropdown and selects puppy
    And user verifies the selectes item is displayed on the page

 