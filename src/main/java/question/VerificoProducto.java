package question;

import com.choucair.moviles.app.interactions.choucair.builders.EsperaExplicita;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;
import static ui.ShoppingCartUi.*;

public class VerificoProducto implements Task {

    public VerificoProducto() {

    }

    public static VerificoProducto exitoso() {
        return new VerificoProducto();
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                new EsperaExplicita(3000),
                WaitUntil.the(LBL_JAGERMEISTER, isVisible()).forNoMoreThan(10).seconds()
        );

    }

}
