package js.web.dom;

import js.extras.JsEnum;

 //"live" | "ended";
        public abstract class NavigationReason extends JsEnum {
  public static final NavigationReason UP = JsEnum.of("up");
  public static final NavigationReason DOWN = JsEnum.of("down");
  public static final NavigationReason LEFT = JsEnum.of("left");
  public static final NavigationReason RIGHT = JsEnum.of("right");

}
