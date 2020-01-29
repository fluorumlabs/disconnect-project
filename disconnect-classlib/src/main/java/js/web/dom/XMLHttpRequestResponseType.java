package js.web.dom;

import js.extras.JsEnum;

 //"classic" | "module";
        public abstract class XMLHttpRequestResponseType extends JsEnum {
        public static final XMLHttpRequestResponseType NONE = JsEnum.of("none");
        public static final XMLHttpRequestResponseType ARRAYBUFFER = JsEnum.of("arraybuffer");
        public static final XMLHttpRequestResponseType BLOB = JsEnum.of("blob");
        public static final XMLHttpRequestResponseType DOCUMENT = JsEnum.of("document");
        public static final XMLHttpRequestResponseType JSON = JsEnum.of("json");
        public static final XMLHttpRequestResponseType TEXT = JsEnum.of("text");

}
