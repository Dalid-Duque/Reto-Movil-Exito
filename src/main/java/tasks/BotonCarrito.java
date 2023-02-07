package tasks;

import com.choucair.moviles.app.interactions.choucair.builders.Tap;
import models.DatosModels;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;

import static ui.SearchResultUi.BTN_CARRITO;

public class BotonCarrito implements Task {

    private DatosModels datos;

    public static BotonCarrito exitoso () {

        return Tasks.instrumented(BotonCarrito.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(

                Tap.on(BTN_CARRITO)

        );

    }

}
