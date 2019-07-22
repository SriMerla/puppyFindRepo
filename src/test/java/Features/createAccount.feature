Feature: Create an Account functionality
Scenario: Create account for multiple users
  Given user is on loginpage
  And user clicks on link buying a puppy?
  When user enters valid data on Page to create an account
    |   firstname   |    lastname   |       email       |   confirmEmail    |     pass    |  confirmPass  |
    |   seja3       |    L          | sejaL3@gmail.com  | sejaL3@gmail.com  |     seja123 |   seja123    |
    |   Dev3        |    M          | devM3@gmail.com   | devM3@gmail.com   |     dev123  |   dev123     |
    |   Tory3       |    R          | toryR3@gmail.com  | toryR3@gmail.com  |     tory123 |   tory123    |

  Then user verifies confirmation message 

 