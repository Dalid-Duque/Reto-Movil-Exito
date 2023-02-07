package tasks;

import com.choucair.moviles.app.interactions.choucair.builders.EsperaExplicita;
import com.choucair.moviles.app.interactions.choucair.builders.Tap;
import models.DatosModels;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.waits.WaitUntil;


import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;
import static ui.HomeUi.*;
import static ui.ShoppingCartUi.*;

public class HaceBusqueda implements Task {

    private DatosModels datos;

    public HaceBusqueda(DatosModels datos) {

        this.datos = datos;
    }

    public static HaceBusqueda exitosa (DatosModels datos) {

        return Tasks.instrumented(HaceBusqueda.class, datos);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
            Tap.on(MODAL_UBICACION),
            Tap.on(BTN_RECIBIR_PEDIDO),
            Tap.on(BTN_COMPRA_Y_RECOGE),
            Tap.on(CBX_CIUDAD),
            Tap.on(BTN_PEREIRA),
            Tap.on(CBX_ALMACEN),
            Tap.on(110,1263),
            Tap.on(110,1263),
            Tap.on(BTN_CONTINUAR),
            new EsperaExplicita(5000),
            Tap.on(BTN_CONTINUAR),
            Enter.theValue(datos.getProducto()).into(TXT_BUSQUEDA),
            Tap.on(653,170),
            Enter.theValue(datos.getProducto()).into(TXT_BUSQUEDA_2),
            Tap.on(BTN_BUSCAR),
            WaitUntil.the(LBL_JAGERMEISTER, isVisible()).forNoMoreThan(8).seconds()

        );


    }


}
