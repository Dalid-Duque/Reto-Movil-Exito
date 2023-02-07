package tasks;

import com.choucair.moviles.app.interactions.choucair.builders.EsperaExplicita;
import com.choucair.moviles.app.interactions.choucair.builders.Tap;
import models.DatosModels;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;

import static ui.SearchResultUi.*;

public class AgregarProducto implements Task {

    private DatosModels datos;

    public static AgregarProducto exitoso () {

        return Tasks.instrumented(AgregarProducto.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(

                new EsperaExplicita(3000),
                Tap.on(BTN_AGREGAR_PRODUCTO)

        );

    }

}


