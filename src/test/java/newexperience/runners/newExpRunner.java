package newexperience.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;


@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/newexperience.feature",
        tags = "@story",
        glue = "newexperience.stepdefinitions",
        snippets = SnippetType.CAMELCASE)

public class newExpRunner {

}