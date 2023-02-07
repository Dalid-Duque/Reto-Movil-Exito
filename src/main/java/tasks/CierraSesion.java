package tasks;

import com.choucair.moviles.app.interactions.choucair.builders.Tap;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.waits.WaitUntil;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isPresent;
import static ui.HomeUi.*;
import static ui.MainUi.*;

public class CierraSesion implements Task {

    public static CierraSesion exitoso () {
        return Tasks.instrumented(CierraSesion.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                Tap.on(MODAL_UBICACION),
                Tap.on(BTN_MI_CUENTA),
                Tap.on(BTN_CERRAR_SESION),
                Tap.on(BTN_ACEPTAR_CIERRE_SESION),
                WaitUntil.the(LBL_HOLA_MAIN, isPresent()).forNoMoreThan(2).seconds()
        );
    }
}
