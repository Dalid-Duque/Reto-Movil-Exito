package ui;

import io.appium.java_client.MobileBy;
import net.serenitybdd.screenplay.targets.Target;

public class HomeUi {

   public static final Target MODAL_UBICACION = Target.the("Modal acceso localizacion")
            .locatedForAndroid(MobileBy.id("com.android.permissioncontroller:id/permission_deny_button"))
            .locatedForIOS(MobileBy.id(""));

    public static final Target LBL_HOLA = Target.the("Label saludo inicial para validar ingreso")
            .locatedForAndroid(MobileBy.id("com.exito.appcompania:id/textView_hello"))
            .locatedForIOS(MobileBy.id(""));

    public static final Target TXT_BUSQUEDA = Target.the("Textbox busqueda producto")
            .locatedForAndroid(MobileBy.id("com.exito.appcompania:id/appCompatEditText_search_bar"))
            .locatedForIOS(MobileBy.id(""));

    public static final Target BTN_COMPRA_Y_RECOGE = Target.the("Boton compra y recoge")
            .locatedForAndroid(MobileBy.id("com.exito.appcompania:id/appCompatTextView_buy_and_collect_description"))
            .locatedForIOS(MobileBy.id(""));

    public static final Target CBX_CIUDAD = Target.the("Combo box seleccione ciudad")
            .locatedForAndroid(MobileBy.id("com.exito.appcompania:id/filled_exposed_dropdown_city"))
            .locatedForIOS(MobileBy.id(""));

    public static final Target CBX_ALMACEN = Target.the("Combo box seleccione almacen")
            .locatedForAndroid(MobileBy.id("com.exito.appcompania:id/filled_exposed_dropdown_store"))
            .locatedForIOS(MobileBy.id(""));

 public static final Target BTN_PEREIRA = Target.the("Ciudad Pereira")
         .locatedForAndroid(MobileBy.id("com.exito.appcompania:id/touch_outside"))
         .locatedForIOS(MobileBy.id(""));

    public static final Target BTN_CONTINUAR = Target.the("Boton continuar")
            .locatedForAndroid(MobileBy.id("com.exito.appcompania:id/appCompatButton_continue"))
            .locatedForIOS(MobileBy.id(""));

    public static final Target TXT_BUSQUEDA_2 = Target.the("Textbox busqueda producto 2")
            .locatedForAndroid(MobileBy.id("com.exito.appcompania:id/appCompatEditText_search_data_edit"))
            .locatedForIOS(MobileBy.id(""));

    public static final Target LBL_PRODUCTO = Target.the("Label resultado busqueda producto")
            .locatedForAndroid(MobileBy.id("com.exito.appcompania:id/appCompatTextView"))
            .locatedForIOS(MobileBy.id(""));

    public static final Target BTN_VER_MAS = Target.the("Boton ver mas")
            .locatedForAndroid(MobileBy.id("com.exito.appcompania:id/textView_title_halls_see_more"))
            .locatedForIOS(MobileBy.id(""));

    public static final Target BTN_BUSCAR = Target.the("Boton buscar")
            .locatedForAndroid(MobileBy.id("com.exito.appcompania:id/text_input_start_icon"))
            .locatedForIOS(MobileBy.id(""));

    public static final Target BTN_RECIBIR_PEDIDO = Target.the("Boton como quieres recibir pedido")
         .locatedForAndroid(MobileBy.id("com.exito.appcompania:id/appCompaTextView_address"))
         .locatedForIOS(MobileBy.id(""));

    //TAB BAR
    public static final Target BTN_MI_CUENTA = Target.the("Boton Mi Cuenta Tab Bar")
            .locatedForAndroid(MobileBy.id("com.exito.appcompania:id/fifth_item"))
            .locatedForIOS(MobileBy.id(""));

    public static final Target BTN_CERRAR_SESION = Target.the("Boton cerrar sesion - mi cuenta")
           .locatedForAndroid(MobileBy.xpath("//android.widget.TextView[@text=\"Cerrar sesión\"]"))
           .locatedForIOS(MobileBy.id(""));

    public static final Target BTN_ACEPTAR_CIERRE_SESION = Target.the("Boton aceptar modal cierre sesion")
           .locatedForAndroid(MobileBy.xpath("//android.widget.TextView[@text=\"Aceptar\"]"))
           .locatedForIOS(MobileBy.id(""));

}
