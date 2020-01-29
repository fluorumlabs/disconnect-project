package js.web.notifications;

import js.extras.JsEnum;

 //"auto" | "ltr" | "rtl";
        public abstract class NotificationPermission extends JsEnum {
  public static final NotificationPermission DEFAULT = JsEnum.of("default");
  public static final NotificationPermission DENIED = JsEnum.of("denied");
  public static final NotificationPermission GRANTED = JsEnum.of("granted");

}
