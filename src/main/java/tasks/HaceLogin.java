package tasks;

import com.choucair.moviles.app.interactions.choucair.TakeScreenshot;
import com.choucair.moviles.app.interactions.choucair.builders.Tap;
import models.DatosModels;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Enter;

import static ui.LoginUi.*;

public class HaceLogin implements Task {

    private DatosModels datos;

    public HaceLogin(DatosModels datos) {

        this.datos = datos;
    }

    public static HaceLogin exitoso (DatosModels datos) {

        return Tasks.instrumented(HaceLogin.class, datos);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(

                Enter.theValue(datos.getCorreoElectronico()).into(TXT_EMAIL),
                Enter.theValue(datos.getContrasenna()).into(TXT_CONTRASEÑA),
                Tap.on(BTN_MOSTRAR_CONTRASEÑA),
                TakeScreenshot.asEvidence()
        );

    }
}