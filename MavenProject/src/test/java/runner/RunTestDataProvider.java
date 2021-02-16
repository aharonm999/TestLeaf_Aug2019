package runner;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

/* Scenario2: We will execute cucumber features from this class, using Run as TestNG*/

@CucumberOptions(features="src/test/java/features/LoginDataProvider.feature", glue="stepsDataProvider", monochrome=true)
public class RunTestDataProvider extends AbstractTestNGCucumberTests{

}
