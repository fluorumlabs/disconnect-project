package js.web.webvtt;

import js.extras.JsEnum;


public abstract class LineAlignSetting extends JsEnum {
    public static final LineAlignSetting START = JsEnum.of("start");

    public static final LineAlignSetting CENTER = JsEnum.of("center");

    public static final LineAlignSetting END = JsEnum.of("end");
}
