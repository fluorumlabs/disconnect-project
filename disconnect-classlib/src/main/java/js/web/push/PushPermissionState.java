package js.web.push;

import js.extras.JsEnum;

 //"p256dh" | "auth";
        public abstract class PushPermissionState extends JsEnum {
  public static final PushPermissionState DENIED = JsEnum.of("denied");
  public static final PushPermissionState GRANTED = JsEnum.of("granted");
  public static final PushPermissionState PROMPT = JsEnum.of("prompt");

}
