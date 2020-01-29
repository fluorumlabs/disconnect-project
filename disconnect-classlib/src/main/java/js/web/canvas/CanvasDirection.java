package js.web.canvas;

import js.extras.JsEnum;


public abstract class CanvasDirection extends JsEnum {
        public static final CanvasDirection LTR = JsEnum.of("ltr");
        public static final CanvasDirection RTL = JsEnum.of("rtl");
        public static final CanvasDirection INHERIT = JsEnum.of("inherit");


}
