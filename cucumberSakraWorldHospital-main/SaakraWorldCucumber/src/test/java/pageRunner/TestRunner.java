package pageRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="C:\\Users\\Rajneesh Sharma\\eclipse-workspace\\cucumberSakraWorldHospital-main\\SaakraWorldCucumber\\Feature\\SaakraTabs.feature", glue = {
"StepDefination" }, plugin = { "pretty",
"html:target/htmlReports" })

public class TestRunner {

}
