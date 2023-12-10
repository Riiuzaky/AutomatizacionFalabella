package co.com.jonathan.pruebas.runners;


import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/login/Session_start.feature",
        glue = "co.com.jonathan.pruebas.stepdefinitions",
        snippets = CucumberOptions.SnippetType.CAMELCASE,
        plugin = "pretty"
        //tags = "@LoginSuccessFully"
)
public class LoginRunner {
}
