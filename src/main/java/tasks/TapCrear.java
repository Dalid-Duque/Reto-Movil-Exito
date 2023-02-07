package tasks;

import com.choucair.moviles.app.interactions.choucair.builders.Tap;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;

import static ui.RegisterUi.*;

public class TapCrear implements Task{

    public static TapCrear exitoso () {
        return Tasks.instrumented(TapCrear.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                Tap.on(BTN_CREAR)
        );
    }
}
