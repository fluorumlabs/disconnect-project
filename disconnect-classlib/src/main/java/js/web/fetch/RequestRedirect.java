package js.web.fetch;

import js.extras.JsEnum;

public abstract class RequestRedirect extends JsEnum {
    public static final RequestRedirect FOLLOW = JsEnum.of("follow");

    public static final RequestRedirect ERROR = JsEnum.of("error");

    public static final RequestRedirect MANUAL = JsEnum.of("manual");

}
