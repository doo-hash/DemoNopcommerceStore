package org.nopcommerce.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchCustomerPage {

	private WebDriver driver;

	@FindBy(xpath = "//li/a[@class='nav-link disabled']")
	WebElement username;
	
	@FindBy(xpath = "//li/a[normalize-space()='Logout']")
	WebElement logout;
	
	
	public SearchCustomerPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public String getUserName() {
		return username.getText();
	}
	
	
	public void clickLogout() {
		logout.click();
	}
}
