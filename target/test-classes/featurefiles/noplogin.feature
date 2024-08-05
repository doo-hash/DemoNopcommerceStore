
Feature: login to application
 
@login
Scenario: login with valid credentials
    Given user opens application url "https://admin-demo.nopcommerce.com/login"
    When user enters email "admin@yourstore.com"
    And user enters password "admin"
    And user clicks login button
    Then page title should be "Dashboard / nopCommerce administration"
    And user name is visible "John Smith"
    And user clicks on logout 
    And page title should be "Your store. Login"

Scenario Outline: login with valid credentials DDT
    Given user opens application url "https://admin-demo.nopcommerce.com/login"
    When user enters email "<email>"
    And user enters password "<password>"
    And user clicks login button
    Then page title should be "Dashboard / nopCommerce administration"
    And user name is visible "<username>"
    And user clicks on logout 
    And page title should be "Your store. Login"

		Examples:
		| email | password | username |
		| admin@yourstore.com | admin | John Smith |