package tasks;

import com.choucair.moviles.app.interactions.choucair.builders.Tap;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;

import static ui.LoginUi.BTN_INGRESAR;

public class HaceTap implements Task {

    public static HaceTap exitoso () {

        return Tasks.instrumented(HaceTap.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                Tap.on(BTN_INGRESAR)
        );

    }
}