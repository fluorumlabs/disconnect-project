package js.web.canvas;

import js.extras.JsEnum;


public abstract class CanvasLineCap extends JsEnum {
    public static final CanvasLineCap BUTT = JsEnum.of("butt");

    public static final CanvasLineCap ROUND = JsEnum.of("round");

    public static final CanvasLineCap SQUARE = JsEnum.of("square");
}
