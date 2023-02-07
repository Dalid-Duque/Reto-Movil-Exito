package ui;

import io.appium.java_client.MobileBy;
import net.serenitybdd.screenplay.targets.Target;

public class MainUi {

    public static final Target LBL_HOLA_MAIN = Target.the("Label saludo main")
            .locatedForAndroid(MobileBy.xpath("//android.widget.TextView[@text=\"¡Hola!\"]"))
            .locatedForIOS(MobileBy.id(""));

    public static final Target BTN_INGRESAR = Target.the("Boton Ingresar Login")
            .locatedForAndroid(MobileBy.id("com.exito.appcompania:id/AppCompatButton_ingresar"))
            .locatedForIOS(MobileBy.id(""));

    public static final Target BTN_REGISTRAR = Target.the("Boton registrarse")
            .locatedForAndroid(MobileBy.id("com.exito.appcompania:id/AppCompatButton_registrarse"))
            .locatedForIOS(MobileBy.id(""));

    public static final Target BTN_MAS_TARDE = Target.the("Boton iniciar sesion mas tarde")
            .locatedForAndroid(MobileBy.id("com.exito.appcompania:id/textView_loginlater"))
            .locatedForIOS(MobileBy.id(""));

}
