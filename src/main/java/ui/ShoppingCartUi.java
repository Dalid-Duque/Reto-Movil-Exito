package ui;

import io.appium.java_client.MobileBy;
import net.serenitybdd.screenplay.targets.Target;

public class ShoppingCartUi {

    public static final Target LBL_JAGERMEISTER = Target.the("Label jagermeister")
            .locatedForAndroid(MobileBy.xpath("//android.widget.TextView[@text='LICOR DE HIERBAS JAGERMEISTER 700 ml']"))
            .locatedForIOS(MobileBy.id(""));

}
