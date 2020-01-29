package js.web.webaudio;

import js.extras.JsEnum;


public abstract class ChannelCountMode extends JsEnum {
    public static final ChannelCountMode MAX = JsEnum.of("max");

    public static final ChannelCountMode CLAMPED_MAX = JsEnum.of("clamped-max");

    public static final ChannelCountMode EXPLICIT = JsEnum.of("explicit");

}
