package runner;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(features="src/test/java/features/LoginAndLogout.feature", glue="stepsLoginAndLogout", monochrome=true)
public class RunTestLoginAndLogout extends AbstractTestNGCucumberTests{

}
