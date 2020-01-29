package js.web.cssom;

import js.extras.JsEnum;


public abstract class OrientationLockType extends JsEnum {
    public static final OrientationLockType ANY = JsEnum.of("any");

    public static final OrientationLockType NATURAL = JsEnum.of("natural");

    public static final OrientationLockType LANDSCAPE = JsEnum.of("landscape");

    public static final OrientationLockType PORTRAIT = JsEnum.of("portrait");

    public static final OrientationLockType PORTRAIT_PRIMARY = JsEnum.of("portrait-primary");

    public static final OrientationLockType PORTRAIT_SECONDARY = JsEnum.of("portrait-secondary");

    public static final OrientationLockType LANDSCAPE_PRIMARY = JsEnum.of("landscape-primary");

    public static final OrientationLockType LANDSCAPE_SECONDARY = JsEnum.of("landscape-secondary");
}
