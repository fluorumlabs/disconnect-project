package js.web.mse;

import js.extras.JsEnum;


public abstract class AppendMode extends JsEnum {
    public static final AppendMode SEGMENTS = JsEnum.of("segments");

    public static final AppendMode SEQUENCE = JsEnum.of("sequence");

}
