package js.web.webanimations;

import js.extras.JsEnum;

public abstract class IterationCompositeOperation extends JsEnum {
    public static final IterationCompositeOperation REPLACE = JsEnum.of("replace");

    public static final IterationCompositeOperation ACCUMULATE = JsEnum.of("accumulate");

}
