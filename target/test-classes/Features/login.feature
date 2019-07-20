Feature: Login Functionality
Scenario: user enters valid credentials to login to the web page
Given user is on web page
When user enters valid credentials
And user selects the action from drop down and submit
Then user is on find a puppy page

Scenario: user verifies links on the login page
Given user is on login page
When user verifies all the links are enable
Then user clicks the links to verify the pages responding to the links