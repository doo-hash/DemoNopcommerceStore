Feature: add new customer in the application

@customer
Scenario: Add new customer
    Given user opens application url "https://admin-demo.nopcommerce.com/login"
    When user enters email "admin@yourstore.com"
    And user enters password "admin"
    And user clicks login button
		And user can view dashboard
		And user clicks on customer menu
		And user clicks on customers menu item
		And user clicks on add new button
		Then user can view add new customer page
		When user enters new customer info
		And clicks on save button
		Then user gets confirmation message
	  And user clicks on logout 

	  
Scenario: search customer by email
    Given user opens application url "https://admin-demo.nopcommerce.com/login"
    When user enters email "admin@yourstore.com"
    And user enters password "admin"
  	And user clicks login button
		And user can view dashboard
		And user clicks on customer menu
		And user clicks on customers menu item
		And user enters customer email
		When user clicks on search button
		Then user should found customer in search table
		And user clicks on logout 
	  
	  
Scenario: search customer by full name
    Given user opens application url "https://admin-demo.nopcommerce.com/login"
    When user enters email "admin@yourstore.com"
    And user enters password "admin"
  	And user clicks login button
		And user can view dashboard
		And user clicks on customer menu
		And user clicks on customers menu item
		And user enters customer firstname
		And user enters customer lastname
		When user clicks on search button
		Then user should found customer in search table
		And user clicks on logout 
	  