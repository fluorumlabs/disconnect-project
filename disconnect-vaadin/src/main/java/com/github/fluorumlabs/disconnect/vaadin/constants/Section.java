package com.github.fluorumlabs.disconnect.vaadin.constants;

import js.extras.JsEnum;

/**
 * Created by Artem Godin on 2/4/2020.
 */
public abstract class Section extends JsEnum {
	public static final Section BODY = JsEnum.of("body");

	public static final Section HEADER = JsEnum.of("header");

	public static final Section FOOTER = JsEnum.of("footer");

	public static final Section DETAILS = JsEnum.of("details");
}
