package com.github.fluorumlabs.disconnect.polymer.utils;

import js.extras.JsEnum;

/**
 * Created by Artem Godin on 2/3/2020.
 */
@Deprecated
public abstract class ScrollDirection extends JsEnum {
    public static final ScrollDirection ALL = JsEnum.of("all");

    public static final ScrollDirection X = JsEnum.of("x");

    public static final ScrollDirection Y = JsEnum.of("y");

    public static final ScrollDirection NONE = JsEnum.of("none");
}
