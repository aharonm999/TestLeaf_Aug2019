package runner;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.testng.AbstractTestNGCucumberTests;


@CucumberOptions(features="src/test/java/features/FindLeads.feature", glue="stepsFindLeads", monochrome=true)

public class RunTestFindLeads extends AbstractTestNGCucumberTests{
	
}
