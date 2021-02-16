package runner;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(features="src/test/java/features/MultipleImplementationsInGlue.feature", glue="stepsMultipleImplementationsInGlue", monochrome=true)
public class RunTestMultipleImplementationsInGlue extends AbstractTestNGCucumberTests{

}
