Feature: Amazon add to cart feature

@EndtoEnd  
Scenario: Amazon add Iphone to cart 
Given user is on Amazon Home page
Then user clicks on textbox and enter - Apple Iphone
Then user clicks on a product under apple
Then user adds the item to the cart

@EndtoEnd
Scenario: Amazon add Oneplus to cart
Given user is on Amazon Home page
Then user clicks on textbox and enter - Oneplus
Then user clicks on a product under Oneplus
Then user adds the item to the cart

@EndtoEnd
Scenario: Amazon add Samsung to cart
Given user is on Amazon Home page
Then user clicks on textbox and enter - Samsung
Then user clicks on a product under Samsung
Then user adds the item to the cart

@SmokeTest
Scenario: Amazon add Honor to cart
Given user is on Amazon Home page
Then user clicks on textbox and enter - Honor
Then user clicks on a product under Honor
Then user adds the item to the cart

@SmokeTest
Scenario: Amazon add Redmi to cart
Given user is on Amazon Home page
Then user clicks on textbox and enter - Redmi
Then user clicks on a product under Redmi
Then user adds the item to the cart