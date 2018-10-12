package runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.junit.Cucumber;

@CucumberOptions(features = { "src/test/java/features/CreateLead.feature" }, 
		glue = { "pages","steps" }, 
		monochrome = true,
		// dryRun = true,
		tags = "@smoketest", 
		snippets = SnippetType.CAMELCASE)
@RunWith(Cucumber.class)
public class RunTest {

}
