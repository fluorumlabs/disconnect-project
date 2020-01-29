package js.web.webanimations;

import js.extras.JsEnum;


public abstract class CompositeOperationOrAuto extends JsEnum {
    public static final CompositeOperationOrAuto REPLACE = JsEnum.of("replace");

    public static final CompositeOperationOrAuto ADD = JsEnum.of("add");

    public static final CompositeOperationOrAuto ACCUMULATE = JsEnum.of("accumulate");

    public static final CompositeOperationOrAuto AUTO = JsEnum.of("auto");

}
