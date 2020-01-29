package js.web.webanimations;

import js.extras.JsEnum;

public abstract class PlaybackDirection extends JsEnum {
    public static final PlaybackDirection NORMAL = JsEnum.of("normal");

    public static final PlaybackDirection REVERSE = JsEnum.of("reverse");

    public static final PlaybackDirection ALTERNATE = JsEnum.of("alternate");

    public static final PlaybackDirection ALTERNATE_REVERSE = JsEnum.of("alternate-reverse");

}
