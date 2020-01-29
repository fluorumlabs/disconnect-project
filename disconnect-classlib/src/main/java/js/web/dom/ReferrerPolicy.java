package js.web.dom;

import js.extras.JsEnum;

public abstract class ReferrerPolicy extends JsEnum {
    public static final ReferrerPolicy NONE = JsEnum.of("");

    public static final ReferrerPolicy NO_REFERRER = JsEnum.of("no-referrer");

    public static final ReferrerPolicy NO_REFERRER_WHEN_DOWNGRADE = JsEnum.of("no-referrer-when-downgrade");

    public static final ReferrerPolicy SAME_ORIGIN = JsEnum.of("same-origin");


    public static final ReferrerPolicy ORIGIN = JsEnum.of("origin");

    public static final ReferrerPolicy STRICT_ORIGIN = JsEnum.of("strict-origin");

    public static final ReferrerPolicy ORIGIN_WHEN_CROSS_ORIGIN = JsEnum.of("origin-when-cross-origin");

    public static final ReferrerPolicy STRICT_ORIGIN_WHEN_CROSS_ORIGIN = JsEnum.of("strict-origin-when-cross-origin");

    public static final ReferrerPolicy UNSAFE_URL = JsEnum.of("unsafe-url");
}
