package task;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.*;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.waits.Wait;
import net.serenitybdd.screenplay.waits.WaitUntil;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import java.time.Duration;

import static net.serenitybdd.screenplay.Tasks.instrumented;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;
import static userinterfaces.HomeFalabella.*;

public class AgregarObjectoAlCarrito implements Task {


    private WebDriver navegador;
    private String object;
    private Duration duration = Duration.ofSeconds(10);
    public AgregarObjectoAlCarrito(WebDriver navegador, String object){
        this.navegador=navegador;
        this.object=object;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                MoveMouse.to(BARRA_BUSQUEDA),
                Click.on(BARRA_BUSQUEDA),
                Enter.theValue(this.object).into(BARRA_BUSQUEDA),
                Hit.the(Keys.ENTER).into(BARRA_BUSQUEDA),
                WaitUntil.the(MOSTRARIO_OBJECTO, isVisible()).forNoMoreThan(15).seconds(),
                Click.on(MOSTRARIO_OBJECTO),
                WaitUntil.the(BOTON_AGREGAR_AL_CARRITO, isVisible()).forNoMoreThan(15).seconds(),
                Click.on(BOTON_AGREGAR_AL_CARRITO),
                Click.on(BOTON_IR_CARRO)
        );
    }

    public static AgregarObjectoAlCarrito agregarObejcto (WebDriver navegador, String object) {
        return instrumented(AgregarObjectoAlCarrito.class, navegador, object);
    }
}
