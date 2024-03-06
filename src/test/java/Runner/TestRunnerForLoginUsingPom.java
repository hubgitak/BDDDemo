package Runner;

import cucumber.api.CucumberOptions;
import org.junit.runner.RunWith;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features/LoginDemo.feature",
        glue = {"StepDefinition"}, // Correct package path to your step definitions
        monochrome = true,
        plugin = {"pretty", "junit:target/JUnitReporter/report.xml",
                "json:target/JSONReports/report.json",
                "html:target/HTMLReports"}
)


public class TestRunnerForLoginUsingPom {
}
