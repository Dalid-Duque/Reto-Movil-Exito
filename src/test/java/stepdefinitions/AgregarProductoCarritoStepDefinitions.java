package stepdefinitions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import models.DatosModels;
import net.serenitybdd.screenplay.actors.OnStage;
import question.VerificoProducto;
import tasks.*;

import java.util.List;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;

public class AgregarProductoCarritoStepDefinitions {

    @Given("^El usuario inicio sesion en la App Móvil Éxito$")
    public void elUsuarioInicioSesionEnLaAppMóvilÉxito(List<DatosModels> datos) {
        OnStage.theActorCalled("Actor").wasAbleTo(HaceTap.exitoso(), HaceLogin.exitoso(datos.get(0)), HaceTap.exitoso());
    }

    @And("^Busca el producto$")
    public void buscaElProducto(List<DatosModels> datos) {
        OnStage.theActorInTheSpotlight().attemptsTo(HaceBusqueda.exitosa(datos.get(0)));
    }

    @When("^Agrega el producto al carrito$")
    public void agregaElProductoAlCarrito() {
        OnStage.theActorInTheSpotlight().attemptsTo(AgregarProducto.exitoso());
    }

    @Then("^Valida que el producto se haya agregado exitosamente$")
    public void validaQueElProductoSeHayaAgregadoExitosamente() {
        OnStage.theActorInTheSpotlight().attemptsTo(BotonCarrito.exitoso());
        OnStage.theActorInTheSpotlight().attemptsTo(VerificoProducto.exitoso());

    }
}
