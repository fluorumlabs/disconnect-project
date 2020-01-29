package js.web.dom;

import js.extras.JsEnum;

 //"disabled" | "hidden" | "showing";
        public abstract class TouchType extends JsEnum {
        public static final TouchType DIRECT = JsEnum.of("direct");
        public static final TouchType STYLUS = JsEnum.of("stylus");

}
