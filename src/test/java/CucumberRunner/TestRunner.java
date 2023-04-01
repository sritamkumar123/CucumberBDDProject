package CucumberRunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

//@RunWith(Cucumber.class)
@CucumberOptions(
		features=".//Features",
		glue="StepDefinitions",
		dryRun=false,
		monochrome=false,
		//plugin= {"pretty","html:target/cucumber-report/html_report.html",},
		plugin= {"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"},
		tags="@smoke"
		
		)


public class TestRunner extends AbstractTestNGCucumberTests {
	//it will always empty
}
