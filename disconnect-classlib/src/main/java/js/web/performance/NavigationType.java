package js.web.performance;

import js.extras.JsEnum;

public abstract class NavigationType extends JsEnum {
    public static final NavigationType NAVIGATE = JsEnum.of("navigate");

    public static final NavigationType RELOAD = JsEnum.of("reload");

    public static final NavigationType BACK_FORWARD = JsEnum.of("back_forward");

    public static final NavigationType PRERENDER = JsEnum.of("prerender");

}
