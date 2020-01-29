package js.web.permissions;

import js.extras.JsEnum;

public abstract class PermissionState extends JsEnum {
    public static final PermissionState GRANTED = JsEnum.of("granted");

    public static final PermissionState DENIED = JsEnum.of("denied");

    public static final PermissionState PROMPT = JsEnum.of("prompt");

}
