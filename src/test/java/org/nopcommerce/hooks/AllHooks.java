package org.nopcommerce.hooks;
import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.nopcommerce.utilities.AppUtilities;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.edge.EdgeDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class AllHooks extends AppUtilities {

	@Before
	public void setup() {
		options.addArguments("start-maximized");
//		options.addArguments("--headless=new");
//		driver = new EdgeDriver();
	}
	
	@After
	public void tearDown(Scenario scenario) throws IOException {
		if(scenario.isFailed()) {
//			TakesScreenshot screenshot = ((TakesScreenshot)driver);
//			
//			File srcFile = screenshot.getScreenshotAs(OutputType.FILE);
//			
//			File destFile = new File(System.getProperty("user.dir") + "//Screenshots//test.png");
//			
//			FileUtils.copyFile(srcFile, destFile);

		}
		
//		driver.quit();
	}
}
