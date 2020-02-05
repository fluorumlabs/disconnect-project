package com.github.fluorumlabs.disconnect.vaadin.constants;

import js.extras.JsEnum;

/**
 * Created by Artem Godin on 2/4/2020.
 */
public abstract class DropMode extends JsEnum {
	public static final DropMode BETWEEN = JsEnum.of("between");

	public static final DropMode ON_TOP = JsEnum.of("on-top");

	public static final DropMode ON_TOP_OR_BETWEEN = JsEnum.of("on-top-or-between");

	public static final DropMode ON_GRID = JsEnum.of("on-grid");

}
