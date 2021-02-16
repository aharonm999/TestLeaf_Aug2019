package runner;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.testng.AbstractTestNGCucumberTests;

/* Scenario1: We will execute cucumber features from this class, using Run as TestNG*/

/* NOTE: To crate java methods automatically - we use these two values by adding in @CucumberOptions()
 dryRun=true and snippets=SnippetType.CAMELCASE 
 
 Step1 - Mention @CucmberOptions(Features, glue="Give here Some duplicate PackageName")
 Step2 - Now after glue, mention dryRun=true and snippets=SnippetType.CAMELCASE
 Step3 - Extend the class AbstractTestNGCucumberTests 
 Step4 - Now Save and Run in console you get the all java methods
 Step5 - Now just copy all the methods and crate one more package called 'Steps'
 Step6 - Create a class under Steps and paste the all methods.
 Step7 - While running need to remove the two values which we have added from the @CucumberOptions() i,e
 			- dryRun=true and snippets=SnippetType.CAMELCASE
 			- Bcz if we have this it just verify whether it has all methods or not, it wont execute the code
 Step8 - Finally it looks like this
 
 @CucumberOptions(features="src/test/java/features/Login.feature", glue="Steps", monochrome=true, dryRun=true, snippets=SnippetType.CAMELCASE)
 */

@CucumberOptions(features="src/test/java/features/Login.feature", glue="steps", monochrome=true)
public class RunTest  extends AbstractTestNGCucumberTests{

}
