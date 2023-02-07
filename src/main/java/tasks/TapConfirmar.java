package tasks;

import com.choucair.moviles.app.interactions.choucair.builders.Tap;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;

import static ui.RegisterUi.*;

public class TapConfirmar implements Task{

    public static TapConfirmar exitoso () {
        return Tasks.instrumented(TapConfirmar.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                Tap.on(BTN_CONFIRMAR)
        );
    }
}
