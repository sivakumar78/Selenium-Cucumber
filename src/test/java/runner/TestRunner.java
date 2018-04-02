package runner;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
	
@RunWith(Cucumber.class)
@CucumberOptions(
		
		features = "src/test/resources/features"
		,glue = {"stepDefinitions"}
		,plugin = {"pretty", "json:target/json/output.xml"}
		,tags = {"@SmokeTest"}
		,monochrome = true
		)
public class TestRunner {
	
}
