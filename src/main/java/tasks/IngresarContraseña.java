package tasks;

import com.choucair.moviles.app.interactions.choucair.builders.Tap;
import models.DatosModels;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.*;
import static ui.RegisterUi.*;

public class IngresarContraseña implements Task {

    private DatosModels datos;

    public IngresarContraseña(DatosModels datos) {

        this.datos = datos;
    }

    public static IngresarContraseña exitoso (DatosModels datos) {

        return Tasks.instrumented(IngresarContraseña.class, datos);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(

                WaitUntil.the(TXT_CONTRASEÑA, isPresent()).forNoMoreThan(30).seconds(),
                Enter.theValue(datos.getContrasenna()).into(TXT_CONTRASEÑA),
                Enter.theValue(datos.getContrasenna()).into(TXT_CONFIRM_CONTRASEÑA),
                Tap.on(BTN_MOSTRAR_CONTRASEÑA),
                Tap.on(BTN_MOSTRAR_CONFIRMAR_CONTRASEÑA)
        );
    }
}
