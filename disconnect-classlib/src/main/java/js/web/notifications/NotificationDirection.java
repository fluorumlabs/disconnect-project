package js.web.notifications;

import js.extras.JsEnum;

 //"navigate" | "reload" | "back_forward" | "prerender";
        public abstract class NotificationDirection extends JsEnum {
  public static final NotificationDirection AUTO = JsEnum.of("auto");
  public static final NotificationDirection LTR = JsEnum.of("ltr");
  public static final NotificationDirection RTL = JsEnum.of("rtl");

}
