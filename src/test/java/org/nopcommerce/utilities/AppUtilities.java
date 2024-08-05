package org.nopcommerce.utilities;

import org.apache.commons.lang3.RandomStringUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.nopcommerce.pages.AdminPage;
import org.nopcommerce.pages.LoginPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeOptions;

public class AppUtilities {

	public static Logger log = LogManager.getLogger("DemoNopcommerceStore");
	public static WebDriver driver;
	public static EdgeOptions options  = new EdgeOptions();
	
	public LoginPage loginPage = new LoginPage(driver);
	public AdminPage adminPage = new AdminPage(driver);
	
	
	public String getRandomEmailId() {
		return(RandomStringUtils.randomAlphabetic(5));
	}
}
