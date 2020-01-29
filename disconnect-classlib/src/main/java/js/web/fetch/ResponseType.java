package js.web.fetch;

import js.extras.JsEnum;

 //"follow" | "error" | "manual";
        public abstract class ResponseType extends JsEnum {
        public static final ResponseType BASIC = JsEnum.of("basic");
        public static final ResponseType CORS = JsEnum.of("cors");
        public static final ResponseType DEFAULT = JsEnum.of("default");
        public static final ResponseType ERROR = JsEnum.of("error");
        public static final ResponseType OPAQUE = JsEnum.of("opaque");
        public static final ResponseType OPAQUE_REDIRECT = JsEnum.of("opaque-redirect");

}
