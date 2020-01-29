package js.web.dom;

import js.extras.JsEnum;

 //"canceled" | "interrupted" | "audio-busy" | "audio-hardware" | "network" |
//        "synthesis-unavailable" | "synthesis-failed" | "language-unavailable" |
//        "voice-unavailable" | "text-too-long" | "invalid-argument";
        public abstract class SupportedType extends JsEnum {
        public static final SupportedType TEXT_HTML = JsEnum.of("text/html");

        public static final SupportedType TEXT_XML = JsEnum.of("text/xml");

        public static final SupportedType APPLICATION_XML = JsEnum.of("application/xml");

        public static final SupportedType APPLICATION_XHTML_XML = JsEnum.of("application/xhtml+xml");

        public static final SupportedType IMAGE_SVG_XML = JsEnum.of("image/svg+xml");

}
