package stepdefinitions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import models.DatosModels;
import tasks.AbreLaApp;
import tasks.HaceLogin;
import tasks.HaceTap;
import tasks.ValidarInicioSesion;

import java.util.List;

import static net.serenitybdd.screenplay.actors.OnStage.*;


public class IniciarSesionStepDefinitions {

    @Given("^El usuario abre la App Móvil Éxito$")
    public void elUsuarioAbreLaAppMóvilÉxito() {
        theActorCalled("Actor").wasAbleTo(AbreLaApp.Exito());
    }

    @When("^Hace Tap en el boton ingresar$")
    public void haceTapEnElBotonIngresar() {

        theActorInTheSpotlight().attemptsTo(HaceTap.exitoso());
    }

    @And("^Ingresa el correo y la contraseña$")
    public void ingresaElCorreoYLaContraseña(List<DatosModels> datos) {
        theActorInTheSpotlight().attemptsTo(HaceLogin.exitoso(datos.get(0)));
    }

    @And("^Hace Tap en ingresar$")
    public void haceTapEnIngresar() {

        theActorInTheSpotlight().attemptsTo(HaceTap.exitoso());
    }

    @Then("^Inicia sesion exitosamente$")
    public void iniciaSesionExitosamente() {
        theActorInTheSpotlight().attemptsTo(ValidarInicioSesion.exitoso());
    }

}
