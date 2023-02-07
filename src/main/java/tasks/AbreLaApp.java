package tasks;

import com.choucair.moviles.app.interactions.choucair.TakeScreenshot;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.thucydides.core.annotations.Step;
import java.util.logging.Logger;

public class AbreLaApp implements Task {

    public AbreLaApp(){}

    public static AbreLaApp Exito(){

        return Tasks.instrumented(AbreLaApp.class);
    }

    @Override
    @Step("App Exito abierta")
    public <T extends Actor> void performAs(T actor) {
        Logger.getAnonymousLogger().info("Se abre app Exito");
        actor.attemptsTo(TakeScreenshot.asEvidence());
    }
}
