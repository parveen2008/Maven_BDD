package StepDefination;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

	@RunWith(Cucumber.class)
	
	@CucumberOptions(glue = {"StepDefination"}, features = "src/test/resources/features", format = {"pretty",
	        "html:target/cucumber-reports", "json:target/cucumber-reports/cucumber.json"})
	
	
	public class AllTest {
	}


