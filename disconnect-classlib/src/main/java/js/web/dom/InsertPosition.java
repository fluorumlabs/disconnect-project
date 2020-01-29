package js.web.dom;

import js.extras.JsEnum;


public abstract class InsertPosition extends JsEnum {
        public static final InsertPosition BEFORE_BEGIN = JsEnum.of("beforebegin");

        public static final InsertPosition AFTER_BEGIN = JsEnum.of("afterbegin");

        public static final InsertPosition BEFORE_END = JsEnum.of("beforeend");

        public static final InsertPosition AFTER_END = JsEnum.of("afterend");
}
