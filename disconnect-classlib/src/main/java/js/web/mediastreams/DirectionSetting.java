package js.web.mediastreams;

import js.extras.JsEnum;


public abstract class DirectionSetting extends JsEnum {
    public static final DirectionSetting NONE = JsEnum.of("");

    public static final DirectionSetting RL = JsEnum.of("rl");

    public static final DirectionSetting LR = JsEnum.of("lr");

}
