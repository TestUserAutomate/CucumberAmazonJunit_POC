package myRunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features="C:\\Users\\microsoft\\eclipse-workspace\\CucumberAmazon_POC\\src\\main\\java\\features\\addToCart_Scenario.feature",
		glue={"stepDefinition"},
		dryRun=false,
		tags= {"@EndtoEnd"}

		)


public class TestRunner {

}
