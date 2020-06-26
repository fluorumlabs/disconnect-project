package js.lang.external.vaadin.vaadin_notification;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import js.extras.JsEnum;

@NpmPackage(
    name = "@vaadin/vaadin-notification",
    version = "^1.6.0-alpha2"
)
@Import(
    module = "@vaadin/vaadin-notification/vaadin-notification.js"
)
public abstract class NotificationPosition extends JsEnum {
  public static final NotificationPosition TOP_STRETCH = JsEnum.of("top-stretch");

  public static final NotificationPosition TOP_START = JsEnum.of("top-start");

  public static final NotificationPosition TOP_CENTER = JsEnum.of("top-center");

  public static final NotificationPosition TOP_END = JsEnum.of("top-end");

  public static final NotificationPosition MIDDLE = JsEnum.of("middle");

  public static final NotificationPosition BOTTOM_START = JsEnum.of("bottom-start");

  public static final NotificationPosition BOTTOM_CENTER = JsEnum.of("bottom-center");

  public static final NotificationPosition BOTTOM_END = JsEnum.of("bottom-end");

  public static final NotificationPosition BOTTOM_STRETCH = JsEnum.of("bottom-stretch");
}
