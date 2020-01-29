package js.web.webaudio;

import js.extras.JsEnum;


public abstract class DistanceModelType extends JsEnum {
    public static final DistanceModelType LINEAR = JsEnum.of("linear");

    public static final DistanceModelType INVERSE = JsEnum.of("inverse");

    public static final DistanceModelType EXPONENTIAL = JsEnum.of("exponential");

}
