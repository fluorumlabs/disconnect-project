package js.web.fetch;

import js.extras.JsEnum;

public abstract class RequestMode extends JsEnum {
    public static final RequestMode NAVIGATE = JsEnum.of("navigate");

    public static final RequestMode SAME_ORIGIN = JsEnum.of("same-origin");

    public static final RequestMode NO_CORS = JsEnum.of("no-cors");

    public static final RequestMode CORS = JsEnum.of("cors");

}
