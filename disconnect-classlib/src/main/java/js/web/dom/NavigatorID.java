package js.web.dom;

import js.lang.Any;
import org.teavm.jso.JSProperty;


public interface NavigatorID extends Any {
    @JSProperty
    String getAppCodeName();

    @JSProperty
    String getAppName();

    @JSProperty
    String getAppVersion();

    @JSProperty
    String getOscpu();

    @JSProperty
    String getPlatform();

    @JSProperty
    String getProduct();

    @JSProperty
    String getProductSub();

    @JSProperty
    String getUserAgent();

    @JSProperty
    String getVendor();

    @JSProperty
    String getVendorSub();

    boolean taintEnabled();
}
