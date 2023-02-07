package ui;

import io.appium.java_client.MobileBy;
import net.serenitybdd.screenplay.targets.Target;

public class LoginUi {

    public static final Target TXT_EMAIL = Target.the("Textbox email")
            .locatedForAndroid(MobileBy.id("com.exito.appcompania:id/TextInputEditText_email"))
            .locatedForIOS(MobileBy.id(""));

    public static final Target TXT_CONTRASEÑA = Target.the("Textbox contraseña")
            .locatedForAndroid(MobileBy.xpath("//android.widget.EditText[@text='Contraseña']"))
            .locatedForIOS(MobileBy.id(""));

    public static final Target BTN_MOSTRAR_CONTRASEÑA = Target.the("Boton mostrar contraseña")
            .locatedForAndroid(MobileBy.id("com.exito.appcompania:id/text_input_end_icon"))
            .locatedForIOS(MobileBy.id(""));

    public static final Target BTN_INGRESAR = Target.the("Boton ingresar")
            .locatedForAndroid(MobileBy.id("com.exito.appcompania:id/AppCompatButton_ingresar"))
            .locatedForIOS(MobileBy.id(""));

    public static final Target BTN_INGRESAR_CON_CODIGO = Target.the("Boton ingresar con codigo")
            .locatedForAndroid(MobileBy.id("com.exito.appcompania:id/AppCompatButton_ingresar_otp"))
            .locatedForIOS(MobileBy.id(""));

    public static final Target BTN_OLVIDAR_CONTRASEÑA = Target.the("Boton olvidaste contraseña")
            .locatedForAndroid(MobileBy.id("com.exito.appcompania:id/AppCompatTextView_olvidar_contrasenia"))
            .locatedForIOS(MobileBy.id(""));

    public static final Target BTN_CREAR_CUENTA = Target.the("Boton crear cuenta")
            .locatedForAndroid(MobileBy.id("com.exito.appcompania:id/AppCompatTextView_titulo_crear_cuenta"))
            .locatedForIOS(MobileBy.id(""));

}
