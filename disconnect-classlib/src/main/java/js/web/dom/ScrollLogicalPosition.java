package js.web.dom;

import js.extras.JsEnum;

public abstract class ScrollLogicalPosition extends JsEnum {
    public static final ScrollLogicalPosition START = JsEnum.of("start");

    public static final ScrollLogicalPosition CENTER = JsEnum.of("center");

    public static final ScrollLogicalPosition END = JsEnum.of("end");

    public static final ScrollLogicalPosition NEAREST = JsEnum.of("nearest");

}
