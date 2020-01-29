package js.web.serviceworker;

import js.extras.JsEnum;

public abstract class ServiceWorkerUpdateViaCache extends JsEnum {
    public static final ServiceWorkerUpdateViaCache IMPORTS = JsEnum.of("imports");

    public static final ServiceWorkerUpdateViaCache ALL = JsEnum.of("all");

    public static final ServiceWorkerUpdateViaCache NONE = JsEnum.of("none");

}
