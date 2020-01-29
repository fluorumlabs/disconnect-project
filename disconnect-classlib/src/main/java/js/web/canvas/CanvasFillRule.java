package js.web.canvas;

import js.extras.JsEnum;


public abstract class CanvasFillRule extends JsEnum {
        public static final CanvasFillRule NONZERO = JsEnum.of("nonzero");

        public static final CanvasFillRule EVENODD = JsEnum.of("evenodd");

}
