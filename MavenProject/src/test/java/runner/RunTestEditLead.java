package runner;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(features="src/test/java/features/EditLead.feature", glue="stepsEditLead", monochrome=true)
public class RunTestEditLead extends AbstractTestNGCucumberTests{
	

}
