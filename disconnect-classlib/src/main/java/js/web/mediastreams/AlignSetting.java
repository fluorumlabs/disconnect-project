package js.web.mediastreams;

import js.extras.JsEnum;

/**
* Created by Artem Godin on 1/23/2020.
*/
public abstract class AlignSetting extends JsEnum {
public static final AlignSetting START = JsEnum.of("start");

public static final AlignSetting CENTER = JsEnum.of("center");

public static final AlignSetting END = JsEnum.of("end");

public static final AlignSetting LEFT = JsEnum.of("left");

public static final AlignSetting RIGHT = JsEnum.of("right");


}
