package com.github.fluorumlabs.disconnect.vaadin.constants;

import js.extras.JsEnum;

/**
 * Created by Artem Godin on 2/4/2020.
 */
public abstract class EditorType extends JsEnum {
    public static final EditorType TEXT = JsEnum.of("text");

    public static final EditorType CHECKBOX = JsEnum.of("checkbox");

    public static final EditorType SELECT = JsEnum.of("select");

}
