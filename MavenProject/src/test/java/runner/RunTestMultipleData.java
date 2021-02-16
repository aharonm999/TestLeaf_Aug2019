package runner;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(features="src/test/java/features/MultipleData.feature", glue="stepsMultipleData", monochrome=true)
public class RunTestMultipleData extends AbstractTestNGCucumberTests{

}
