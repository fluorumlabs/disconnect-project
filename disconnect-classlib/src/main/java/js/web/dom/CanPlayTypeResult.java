package js.web.dom;

import js.extras.JsEnum;


public abstract class CanPlayTypeResult extends JsEnum {
        public static final CanPlayTypeResult NONE = JsEnum.of("");
        public static final CanPlayTypeResult MAYBE = JsEnum.of("maybe");
        public static final CanPlayTypeResult PROBABLY = JsEnum.of("probably");

}
