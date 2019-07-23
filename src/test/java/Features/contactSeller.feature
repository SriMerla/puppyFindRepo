Feature: Add puppy to favorites and  contact seller fuctionality

  Background: user  is on find a puppy page
  Given user is on home page and navigates to find a puppy page
  
  
  Scenario: user adds a puppy to favourites and contact the seller
  When user searchs for puppy
  And user clicks puppy for sale and select a puppy
  And user clicks on add favorites
  Then click on contact via email
  
  Scenario: user verifies my favorites
  Then user checks the number of puppies in favorites
 # And user clicks puppy for sale and select a puppy
  #And user clicks on add favorites
  And user add a puppy to favorites
  And user verifies the number of puppies in favorites after adding another puppy
