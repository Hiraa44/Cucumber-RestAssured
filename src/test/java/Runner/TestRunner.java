package Runner;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		//plugin = {"pretty", "html:target/cucumber-reports/report.html"},
		features = "src/main/resources"
		,glue={"StepDefinitons"},
		plugin = { "pretty","html:target/Reports/report.html" }
		//monochrome = true
		)

public class TestRunner {

}