package userinterfaces;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;


@DefaultUrl("https://www.falabella.com.co/falabella-co")
public class HomeFalabella extends PageObject {
    public static final Target BARRA_BUSQUEDA = Target.the("Barra de busqueda").located(By.xpath("//input[@class='SearchBar-module_searchBar__Input__1kPKS']"));
    public static final Target BOTON_BUSCAR = Target.the("Boton buscar home").located(By.xpath("//button[@class='SearchBar-module_searchBtnIcon__2L2s0']"));
    public static final Target MOSTRARIO_OBJECTO = Target.the("Cuadro con el objeto").located(By.id("testId-pod-9461744"));
    public static final Target BOTON_AGREGAR_AL_CARRITO = Target.the("Boton agregar al carrito").located(By.id("add-to-cart-button"));
    public static final Target BOTON_IR_CARRO = Target.the("Boton ir al carrito").located(By.id("linkButton"));



}
