package co.com.jonathan.pruebas.stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Open;
import org.openqa.selenium.WebDriver;
import task.AgregarObjectoAlCarrito;
import userinterfaces.HomeFalabella;



public class LoginStepDefinitions {


    private WebDriver navegador;
    private Actor actor = Actor.named("Jonathan");
    private HomeFalabella homeFalabella = new HomeFalabella();



    @Given("the user navigates to the page falabella")
    public void NavigatePage() {
        actor.can(BrowseTheWeb.with(navegador));
        actor.wasAbleTo(Open.browserOn(homeFalabella));
    }

    @When("^add (.*) to car$")
    public void addToCar$(String object) {
        actor.wasAbleTo(AgregarObjectoAlCarrito.agregarObejcto(navegador, object));

    }
    @Then("should see the main page")
    public void shouldSeeTheMainPage() {
        // Write code here that turns the phrase above into concrete actions

    }


}
