package com.github.fluorumlabs.disconnect.vaadin.constants;

import js.extras.JsEnum;

/**
 * Created by Artem Godin on 2/4/2020.
 */
public abstract class AxisPosition extends JsEnum {
    public static final AxisPosition LEFT = JsEnum.of("left");

    public static final AxisPosition RIGHT = JsEnum.of("right");

    public static final AxisPosition TOP = JsEnum.of("top");

    public static final AxisPosition BOTTOM = JsEnum.of("bottom");

}
