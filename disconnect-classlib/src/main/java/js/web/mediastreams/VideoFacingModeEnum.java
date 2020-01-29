package js.web.mediastreams;

import js.extras.JsEnum;

public abstract class VideoFacingModeEnum extends JsEnum {
    public static final VideoFacingModeEnum USER = JsEnum.of("user");

    public static final VideoFacingModeEnum ENVIRONMENT = JsEnum.of("environment");

    public static final VideoFacingModeEnum LEFT = JsEnum.of("left");

    public static final VideoFacingModeEnum RIGHT = JsEnum.of("right");

}
