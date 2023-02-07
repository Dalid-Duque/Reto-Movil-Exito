package tasks;

import com.choucair.moviles.app.interactions.choucair.builders.Tap;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import static ui.MainUi.*;

public class TapRegistrarse implements Task {

    public static TapRegistrarse exitoso () {
        return Tasks.instrumented(TapRegistrarse.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                Tap.on(BTN_REGISTRAR)
        );

    }
}
