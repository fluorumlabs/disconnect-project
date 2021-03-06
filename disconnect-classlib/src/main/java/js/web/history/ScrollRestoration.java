package js.web.history;

import js.extras.JsEnum;

public abstract class ScrollRestoration extends JsEnum {
    public static final ScrollRestoration AUTO = JsEnum.of("auto");

    public static final ScrollRestoration MANUAL = JsEnum.of("manual");

}
