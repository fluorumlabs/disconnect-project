package js.web.webaudio;

import js.extras.JsEnum;

public abstract class PanningModelType extends JsEnum {
    public static final PanningModelType EQUAL_POWER = JsEnum.of("equalpower");

    public static final PanningModelType HRTF = JsEnum.of("HRTF");


}
