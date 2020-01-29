package js.web.webaudio;

import js.extras.JsEnum;


public abstract class BiquadFilterType extends JsEnum {
    public static final BiquadFilterType LOWPASS = JsEnum.of("lowpass");

    public static final BiquadFilterType HIGHPASS = JsEnum.of("highpass");

    public static final BiquadFilterType BANDPASS = JsEnum.of("bandpass");

    public static final BiquadFilterType LOWSHELF = JsEnum.of("lowshelf");

    public static final BiquadFilterType HIGHSHELF = JsEnum.of("highshelf");

    public static final BiquadFilterType PEAKING = JsEnum.of("peaking");

    public static final BiquadFilterType NOTCH = JsEnum.of("notch");

    public static final BiquadFilterType ALLPASS = JsEnum.of("allpass");

}
