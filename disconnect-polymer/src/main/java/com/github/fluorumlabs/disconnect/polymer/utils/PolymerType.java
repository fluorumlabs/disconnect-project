package com.github.fluorumlabs.disconnect.polymer.utils;

import js.extras.JsEnum;

/**
 * Created by Artem Godin on 2/3/2020.
 */
public abstract class PolymerType extends JsEnum {
    public static final PolymerType BOOLEAN = JsEnum.of("Boolean");

    public static final PolymerType DATE = JsEnum.of("Date");

    public static final PolymerType NUMBER = JsEnum.of("Number");

    public static final PolymerType STRING = JsEnum.of("String");

    public static final PolymerType ARRAY = JsEnum.of("Array");

    public static final PolymerType OBJECT = JsEnum.of("Object");
}
