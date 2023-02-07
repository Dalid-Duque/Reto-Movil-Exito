package ui;

import io.appium.java_client.MobileBy;
import net.serenitybdd.screenplay.targets.Target;

public class RegisterUi {

    public static final Target TXT_NOMBRES = Target.the("Textbox nombre")
            .locatedForAndroid(MobileBy.xpath("//android.widget.EditText[@text='Nombres']"))
            .locatedForIOS(MobileBy.id(""));

    public static final Target TXT_APELLIDOS = Target.the("Textbox apellidos")
            .locatedForAndroid(MobileBy.xpath("//android.widget.EditText[@text='Apellidos']"))
            .locatedForIOS(MobileBy.id(""));

    public static final Target BTN_TIPO_ID = Target.the("Boton tipo documento")
            .locatedForAndroid(MobileBy.id("com.exito.appcompania:id/filled_exposed_dropdown"))
            .locatedForIOS(MobileBy.id(""));

    public static final Target TXT_NUMERO_DOCUMENTO = Target.the("Textbox numero documento")
            .locatedForAndroid(MobileBy.xpath("//android.widget.EditText[@text='Número de documento']"))
            .locatedForIOS(MobileBy.id(""));

    public static final Target BTN_AÑO = Target.the("Boton año")
            .locatedForAndroid(MobileBy.id("com.exito.appcompania:id/filled_exposed_dropdown_anio_registro"))
            .locatedForIOS(MobileBy.id(""));

    public static final Target BTN_MES = Target.the("Boton mes")
            .locatedForAndroid(MobileBy.id("com.exito.appcompania:id/filled_exposed_dropdown_mes_registro"))
            .locatedForIOS(MobileBy.id(""));

    public static final Target BTN_DIA = Target.the("Boton dia")
            .locatedForAndroid(MobileBy.id("com.exito.appcompania:id/filled_exposed_dropdown_dia_registro"))
            .locatedForIOS(MobileBy.id(""));

    public static final Target TXT_CELULAR = Target.the("Textbox celular")
            .locatedForAndroid(MobileBy.id("com.exito.appcompania:id/TextInputEditText_tel"))
            .locatedForIOS(MobileBy.id(""));

    public static final Target TXT_EMAIL = Target.the("Textbox email")
            .locatedForAndroid(MobileBy.xpath("//android.widget.EditText[@text='Correo electrónico']"))
            .locatedForIOS(MobileBy.id(""));

    public static final Target BTN_TERMS_CONDICIONES = Target.the("Boton terminos y condiciones")
            .locatedForAndroid(MobileBy.id("com.exito.appcompania:id/AppCompatTextView_terminos_y_condiciones"))
            .locatedForIOS(MobileBy.id(""));

    public static final Target BTN_POLITICAS_PRIVACIDAD = Target.the("Boton politicas privacidad")
            .locatedForAndroid(MobileBy.id("com.exito.appcompania:id/AppCompatTextView_politicas_tratamiento"))
            .locatedForIOS(MobileBy.id(""));

    public static final Target BTN_CONFIRMAR = Target.the("Boton confirmar")
            .locatedForAndroid(MobileBy.id("com.exito.appcompania:id/AppCompatButton_registrar"))
            .locatedForIOS(MobileBy.id(""));

    public static final Target BTN_INICIAR_SESION = Target.the("Boton iniciar sesion")
            .locatedForAndroid(MobileBy.id("com.exito.appcompania:id/AppCompatTextView_iniciar"))
            .locatedForIOS(MobileBy.id(""));

    public static final Target TXT_CODIGO = Target.the("Texto codigo iniciar")
            .locatedForAndroid(MobileBy.id("com.exito.appcompania:id/PinView_code_otp"))
            .locatedForIOS(MobileBy.id(""));

    public static final Target TXT_CONTRASEÑA = Target.the("Textbox contraseña")
            .locatedForAndroid(MobileBy.xpath("//android.widget.EditText[@text='Contraseña']"))
            .locatedForIOS(MobileBy.id(""));

    public static final Target TXT_CONFIRM_CONTRASEÑA = Target.the("Textbox confirmar contraseña")
            .locatedForAndroid(MobileBy.xpath("//android.widget.EditText[@text='Confirmar contraseña']"))
            .locatedForIOS(MobileBy.id(""));

    public static final Target BTN_MOSTRAR_CONTRASEÑA = Target.the("Boton mostrar contraseña")
            .locatedForAndroid(MobileBy.xpath("(//android.widget.ImageButton[@content-desc=\'Mostrar contraseña\'])[1]"))
            .locatedForIOS(MobileBy.id(""));

    public static final Target BTN_MOSTRAR_CONFIRMAR_CONTRASEÑA = Target.the("Boton mostrar confirmar contraseña")
            .locatedForAndroid(MobileBy.xpath("(//android.widget.ImageButton[@content-desc=\'Mostrar contraseña\'])[2]"))
            .locatedForIOS(MobileBy.id(""));


    public static final Target BTN_REENVIAR_CODIGO = Target.the("Boton reenviar codigo")
            .locatedForAndroid(MobileBy.id("com.exito.appcompania:id/AppCompatTextView_reenviar_otp"))
            .locatedForIOS(MobileBy.id(""));

    public static final Target BTN_CREAR = Target.the("Boton crear cuenta")
            .locatedForAndroid(MobileBy.id("com.exito.appcompania:id/AppCompatButton_continuar"))
            .locatedForIOS(MobileBy.id(""));

}
