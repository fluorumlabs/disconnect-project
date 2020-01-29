package js.web.canvas;

import js.extras.JsEnum;


public abstract class CanvasTextBaseline extends JsEnum {
        public static final CanvasTextBaseline TOP = JsEnum.of("top");
        public static final CanvasTextBaseline HANGING = JsEnum.of("hanging");
        public static final CanvasTextBaseline MIDDLE = JsEnum.of("middle");
        public static final CanvasTextBaseline ALPHABETIC = JsEnum.of("alphabetic");
        public static final CanvasTextBaseline IDEOGRAPHIC = JsEnum.of("ideographic");
        public static final CanvasTextBaseline BOTTOM = JsEnum.of("bottom");

}
