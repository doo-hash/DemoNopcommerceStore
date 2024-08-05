package org.nopcommerce.runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		tags="@customer",
		plugin = {
				"pretty",
				"html:target/cucumber-reports/htmlReport.html"				
		},
		features="src/test/resources/featurefiles",
		glue = {
				"org.nopcommerce.stepdefs",
				"org.nopcommerce.hooks"
		}
)
public class TestRunner {

}
