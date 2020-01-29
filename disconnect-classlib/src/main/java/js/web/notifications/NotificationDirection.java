package js.web.notifications;

import js.extras.JsEnum;

public abstract class NotificationDirection extends JsEnum {
    public static final NotificationDirection AUTO = JsEnum.of("auto");

    public static final NotificationDirection LTR = JsEnum.of("ltr");

    public static final NotificationDirection RTL = JsEnum.of("rtl");

}
