package js.web.webcomponents;

import js.extras.JsEnum;

 //"imports" | "all" | "none";
        public abstract class ShadowRootMode extends JsEnum {
  public static final ShadowRootMode OPEN = JsEnum.of("open");
  public static final ShadowRootMode CLOSED = JsEnum.of("closed");

}
