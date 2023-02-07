package ui;

import io.appium.java_client.MobileBy;
import net.serenitybdd.screenplay.targets.Target;

public class SearchResultUi {

    public static final Target BTN_AGREGAR_PRODUCTO = Target.the("Boton agregar producto")
            .locatedForAndroid(MobileBy.id("com.exito.appcompania:id/constraitLayout_add_item"))
            .locatedForIOS(MobileBy.id(""));

    public static final Target BTN_CARRITO = Target.the("Boton ver carrito")
            .locatedForAndroid(MobileBy.id("com.exito.appcompania:id/appCompatImageView_shopping_cart"))
            .locatedForIOS(MobileBy.id(""));

}
