package runner;

import org.junit.AfterClass;
import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import utilities.CucumberReportingConfig;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "classpath:features",
		glue = "step.definition",
		tags = "@smokeTest",
		dryRun = false, 
		strict = true,
		monochrome = true,
		plugin = {
				"pretty", "html:target/sit/cucumber-pretty",
				"json:target/cucumber.json"
		},
		publish = true
		)
public class TestRunner {

@AfterClass
	public static void generateReport() {
	CucumberReportingConfig.reportConfig();
}
}
