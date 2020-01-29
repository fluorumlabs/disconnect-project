package js.web.fetch;

import js.extras.JsEnum;

public abstract class RequestCache extends JsEnum {
    public static final RequestCache DAFAULT = JsEnum.of("dafault");

    public static final RequestCache NO_STORE = JsEnum.of("no-store");

    public static final RequestCache RELOAD = JsEnum.of("reload");

    public static final RequestCache NO_CACHE = JsEnum.of("no-cache");

    public static final RequestCache FORCE_CACHE = JsEnum.of("force-cache");

    public static final RequestCache ONLY_IF_CACHED = JsEnum.of("only-if-cached");

}
