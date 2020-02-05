package com.github.fluorumlabs.disconnect.vaadin.constants;

import js.extras.JsEnum;

/**
 * Created by Artem Godin on 2/4/2020.
 */
public abstract class SortDirection extends JsEnum {
    public static final SortDirection ASC = JsEnum.of("asc");

    public static final SortDirection DESC = JsEnum.of("desc");
}
