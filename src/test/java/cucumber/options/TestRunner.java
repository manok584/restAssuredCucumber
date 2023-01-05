package cucumber.options;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
//@CucumberOptions(features = "src/test/java/features", glue = { "stepDefinitions" },tags = "not @ignore")
//, tags="@DeletePlace"
@CucumberOptions(features = "src/test/java/features", glue = { "stepDefinitions" }, plugin="json:target/jsonReports/cucumber-reports.json")
public class TestRunner {

	
}
