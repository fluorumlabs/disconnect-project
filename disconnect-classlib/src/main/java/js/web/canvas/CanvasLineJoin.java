package js.web.canvas;

import js.extras.JsEnum;


public abstract class CanvasLineJoin extends JsEnum {
    public static final CanvasLineJoin ROUND = JsEnum.of("round");

    public static final CanvasLineJoin BEVEL = JsEnum.of("bevel");

    public static final CanvasLineJoin MITER = JsEnum.of("miter");
}
