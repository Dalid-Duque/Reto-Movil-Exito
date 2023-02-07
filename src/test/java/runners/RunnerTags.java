package runners;

import cucumber.api.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import cucumber.api.SnippetType;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features",
        tags = "@agregarProductoCarrito",
        snippets = SnippetType.CAMELCASE,
        glue = "stepdefinitions"
)

public class RunnerTags {
}
