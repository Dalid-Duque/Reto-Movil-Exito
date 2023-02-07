package stepdefinitions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import models.DatosModels;
import net.serenitybdd.screenplay.actors.OnStage;
import tasks.*;

import java.util.List;

public class RegistrarUsuarioStepDefinitions {

    @When("^Hace Tap en el boton registrarse$")
    public void haceTapEnElBotonRegistrarse() {

        OnStage.theActorInTheSpotlight().attemptsTo(TapRegistrarse.exitoso());
    }

    @And("^Ingresa los datos requeridos$")
    public void ingresaLosDatosRequeridos(List<DatosModels> datos) {
        OnStage.theActorInTheSpotlight().attemptsTo(HaceRegistro.exitoso(datos.get(0)));
    }

    @And("^Hace Tap en confirmar$")
    public void haceTapEnConfirmar() {
        OnStage.theActorInTheSpotlight().attemptsTo(TapConfirmar.exitoso());
    }

    @And("^Ingresa la contraseña$")
    public void ingresaLaContraseña(List<DatosModels> datos) {
        OnStage.theActorInTheSpotlight().attemptsTo(IngresarContraseña.exitoso(datos.get(0)));
    }

    @Then("^Se crea el usuario exitosamente$")
    public void seCreaElUsuarioExitosamente() {
        OnStage.theActorInTheSpotlight().attemptsTo(TapCrear.exitoso());
    }

    @And("^Cierra sesion$")
    public void cierraSesion() {

        OnStage.theActorInTheSpotlight().attemptsTo(CierraSesion.exitoso());
    }
}
