package com.github.fluorumlabs.disconnect.vaadin.constants;

import js.extras.JsEnum;

/**
 * Created by Artem Godin on 2/4/2020.
 */
public abstract class Markers extends JsEnum {
	public static final Markers SHOWN = JsEnum.of("shown");

	public static final Markers HIDDEN = JsEnum.of("hidden");

	public static final Markers AUTO = JsEnum.of("auto");

}
