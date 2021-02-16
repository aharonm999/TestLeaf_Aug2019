package runner;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(features="src/test/java/features/MultipleTestCase.feature",
glue="stepsMultipleTestCase", monochrome=true, tags="@sanity")
/* If we give tags="@sanity or @smoke"  
 *			  tags="@sanity and @smoke" --> 
 *			  tags="~sanity"		*/
public class RunTestMultipleTestCase extends AbstractTestNGCucumberTests{

}
