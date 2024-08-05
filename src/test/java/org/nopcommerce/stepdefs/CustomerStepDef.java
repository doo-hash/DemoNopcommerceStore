package org.nopcommerce.stepdefs;

import org.nopcommerce.hooks.AllHooks;
import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CustomerStepDef {
	
	WebDriver driver = AllHooks.driver;
	
	@When("user can view dashboard")
	public void user_can_view_dashboard() {
		System.out.println("now on dashboard");
	}

	@When("user clicks on customer menu")
	public void user_clicks_on_customer_menu() {
		System.out.println("clicks on customer menu");
	}

	@When("user clicks on customers menu item")
	public void user_clicks_on_customers_menu_item() {
		System.out.println("clicks on customers menu item");
	}

	@When("user clicks on add new button")
	public void user_clicks_on_add_new_button() {
		System.out.println("clicks on add new button");
	}

	@Then("user can view add new customer page")
	public void user_can_view_add_new_customer_page() {
		System.out.println("now in customer page");
	}

	@When("user enters new customer info")
	public void user_enters_new_customer_info() {
		System.out.println("enters customer details");
	}

	@When("clicks on save button")
	public void clicks_on_save_button() {
		System.out.println("clicks on save button");
	}

	@Then("user gets confirmation message")
	public void user_gets_confirmation_message() {
		System.out.println("confirmation message for successful customer addition");
	}

	@When("user enters customer email")
	public void user_enters_customer_email() {
		System.out.println("user enters customer email");
	}

	@When("user clicks on search button")
	public void user_clicks_on_search_button() {
		System.out.println("user clicks search button");	
	}
	
	@Then("user should found customer in search table")
	public void user_should_found_customer_in_search_table() {
		System.out.println("user finds customer in table");
	}
	
	@When("user enters customer firstname")
	public void user_enters_customer_firstname() {
		System.out.println("user enters first name");
	}

	@When("user enters customer lastname")
	public void user_enters_customer_lastname() {
		System.out.println("user enters last name");
	}
	
}
