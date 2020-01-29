package js.web.webaudio;

import js.extras.JsEnum;


public abstract class ChannelInterpretation extends JsEnum {
    public static final ChannelInterpretation SPEAKERS = JsEnum.of("speakers");

    public static final ChannelInterpretation DISCRETE = JsEnum.of("discrete");

}
