package runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.junit.Cucumber;

@CucumberOptions(features =
		"src/test/java/features/Login.feature",
		glue = {"pages", "steps"},
		monochrome = true,
		//dryRun = true, 
		snippets = SnippetType.CAMELCASE)
@RunWith(Cucumber.class)
public class RunTest {

}



