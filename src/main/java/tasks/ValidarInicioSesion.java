package tasks;

import com.choucair.moviles.app.interactions.choucair.builders.Tap;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isPresent;
import static ui.HomeUi.*;

public class ValidarInicioSesion implements Task {

    public static ValidarInicioSesion exitoso () {
        return Tasks.instrumented(ValidarInicioSesion.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Tap.on(MODAL_UBICACION),
                WaitUntil.the(LBL_HOLA, isPresent())
        );

    }
}
