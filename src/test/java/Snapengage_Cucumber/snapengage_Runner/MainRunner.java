package Snapengage_Cucumber.snapengage_Runner;



import org.testng.annotations.Test;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

//@RunWith(Cucumber.class)

@CucumberOptions (
	features = {"src/test/java/Snapengage_Cucumber/snapEngage_Feature/"},
	glue = {"Snapengage_Cucumber.snapengage_Stepdefs"},
	monochrome = true,
	plugin = {"pretty", "html:target/cucumber", 
			"json:target/cucumber.json", 
			"com.cucumber.listener.ExtentCucumberFormatter:target/report.html"
	}
)

@Test
public class MainRunner extends AbstractTestNGCucumberTests {
	
}

