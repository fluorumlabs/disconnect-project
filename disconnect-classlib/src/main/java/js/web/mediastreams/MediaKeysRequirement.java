package js.web.mediastreams;

import js.extras.JsEnum;

 //"usable" | "expired" | "released" | "output-restricted" |
//        "output-downscaled" | "status-pending" | "internal-error";
        public abstract class MediaKeysRequirement extends JsEnum {
        public static final MediaKeysRequirement REQUIRED = JsEnum.of("required");
        public static final MediaKeysRequirement OPTIONAL = JsEnum.of("optional");
        public static final MediaKeysRequirement NOT_ALLOWED = JsEnum.of("not-allowed");


}
