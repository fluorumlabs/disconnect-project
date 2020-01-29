package js.web.mediastreams;

import js.extras.JsEnum;

 //"temporary" | "persistent-license";
        public abstract class MediaKeyStatus extends JsEnum {
        public static final MediaKeyStatus USABLE = JsEnum.of("usable");
        public static final MediaKeyStatus EXPIRED = JsEnum.of("expired");
        public static final MediaKeyStatus RELEASED = JsEnum.of("released");
        public static final MediaKeyStatus OUTPUT_RESTRICTED = JsEnum.of("output-restricted");

        public static final MediaKeyStatus OUTPUT_DOWNSCALED = JsEnum.of("output-downscaled");

        public static final MediaKeyStatus STATUS_PENDING = JsEnum.of("status-pending");

        public static final MediaKeyStatus INTERNAL_ERROR = JsEnum.of("internal-error");


}
