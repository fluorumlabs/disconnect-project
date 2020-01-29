package js.web.fetch;

import js.extras.JsEnum;

public abstract class RequestCredentials extends JsEnum {
    public static final RequestCredentials OMIT = JsEnum.of("omit");

    public static final RequestCredentials SAME_ORIGIN = JsEnum.of("same-origin");

    public static final RequestCredentials INCLUDE = JsEnum.of("include");

}
