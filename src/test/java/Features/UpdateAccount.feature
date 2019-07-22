Feature: Update Fuctionality
Scenario: user updates the account

Given user is on webPage and logs in
And user navigates to My Account
When user enters the details to update the account
#Then user login in to the web page with new credentials
Then verifies the login confirmation
