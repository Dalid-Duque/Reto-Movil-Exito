package tasks;

import com.choucair.moviles.app.interactions.choucair.builders.Tap;
import models.DatosModels;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Enter;

import static ui.RegisterUi.*;

public class HaceRegistro implements Task {

    private DatosModels datos;

    public HaceRegistro(DatosModels datos) {

        this.datos = datos;
    }

    public static HaceRegistro exitoso (DatosModels datos) {

        return Tasks.instrumented(HaceRegistro.class, datos);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                Enter.theValue(datos.getNombres()).into(TXT_NOMBRES),
                Enter.theValue(datos.getApellidos()).into(TXT_APELLIDOS),
                Enter.theValue(datos.getNumeroDocumento()).into(TXT_NUMERO_DOCUMENTO),
                Tap.on(BTN_AÑO),
                Tap.on(116,1193),
                Tap.on(BTN_MES),
                Tap.on(308,794),
                Tap.on(BTN_DIA),
                Tap.on(524,886),
                Enter.theValue(datos.getCelular()).into(TXT_CELULAR),
                Enter.theValue(datos.getCorreoElectronico()).into(TXT_EMAIL),
                Tap.on(74,1076),
                Tap.on(105,1135)
        );

    }

}
