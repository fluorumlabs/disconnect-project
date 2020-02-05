package com.github.fluorumlabs.disconnect.vaadin.constants;

import js.extras.JsEnum;

/**
 * Created by Artem Godin on 2/4/2020.
 */
public abstract class DropLocation extends JsEnum {
	public static final DropLocation ON_TOP = JsEnum.of("on-top");

	public static final DropLocation ABOVE = JsEnum.of("above");

	public static final DropLocation BELOW = JsEnum.of("below");

	public static final DropLocation EMPTY = JsEnum.of("empty");

}
