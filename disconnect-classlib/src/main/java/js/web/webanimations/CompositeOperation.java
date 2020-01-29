package js.web.webanimations;

import js.extras.JsEnum;


public abstract class CompositeOperation extends JsEnum {
        public static final CompositeOperation REPLACE = JsEnum.of("replace");
        public static final CompositeOperation ADD = JsEnum.of("add");
        public static final CompositeOperation ACCUMULATE = JsEnum.of("accumulate");

}
