package Runner;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/java/feature/LoginDemo.feature",glue={"StepDeffinitions"},monochrome = true,
plugin = {"pretty", "junit:target/JUnitReports/report.xml",
"json:target/JSONreports/report.json",
"html:target/HtmlReports"})
public class TestRunnerForLoginUsingPom {
}
