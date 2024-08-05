package org.nopcommerce.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	private WebDriver driver;

	
	@FindBy(name = "Email")
	WebElement emailInput;
	
	@FindBy(name = "Password")
	WebElement passwordInput;
	
	@FindBy(xpath="//button[normalize-space()='Log in']")
	WebElement loginButton;
	
	public LoginPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public void setEmail(String email) {
		emailInput.clear();
		emailInput.sendKeys(email);
	}
	
	public void setPassword(String password) {
		passwordInput.clear();
		passwordInput.sendKeys(password);
	}
	
	public void clickLoginButton() {
		loginButton.click();
	}
}
