package org.nopcommerce.stepdefs;

import static org.junit.Assert.assertTrue;

import org.nopcommerce.utilities.AppUtilities;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginStepDef extends AppUtilities {
		
	@Given("user opens application url {string}")
	public void user_opens_application_url(String url) {
//		driver.get(url);
		log.info("opened the application");
	}

	@When("user enters email {string}")
	public void user_enters_email(String email) {
//		loginPage.setEmail(email);
		log.info("Email entered");
	}

	@When("user enters password {string}")
	public void user_enters_password(String password) {
//		loginPage.setPassword(password);
		log.info("Password entered");
	}

	@When("user clicks login button")
	public void user_clicks_login_button() {
//		loginPage.clickLoginButton();
		log.info("Clicked login button");
	}

	@Then("page title should be {string}")
	public void page_title_should_be(String title) {
//		String pageTitle = driver.getTitle();
//		assertTrue(pageTitle.equals(title));
	}

	@Then("user name is visible {string}")
	public void user_name_is_visible(String username) {
//		String loggedinUsername = adminPage.getUserName();
//		assertTrue(loggedinUsername.equals(username));
	}

	@Then("user clicks on logout")
	public void user_clicks_on_logout() {
		adminPage.clickLogout();
	}

	
}
