package js.web.webanimations;

import js.extras.JsEnum;


public abstract class FillMode extends JsEnum {
        public static final FillMode NONE = JsEnum.of("none");
        public static final FillMode FORWARDS = JsEnum.of("forwards");
        public static final FillMode BACKWARDS = JsEnum.of("backwards");
        public static final FillMode BOTH = JsEnum.of("both");
        public static final FillMode AUTO = JsEnum.of("auto");

}
