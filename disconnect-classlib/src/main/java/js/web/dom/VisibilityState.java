package js.web.dom;

import js.extras.JsEnum;

 //"user" | "environment" | "left" | "right";
        public abstract class VisibilityState extends JsEnum {
  public static final VisibilityState HIDDEN = JsEnum.of("hidden");
  public static final VisibilityState VISIBLE = JsEnum.of("visible");

}
