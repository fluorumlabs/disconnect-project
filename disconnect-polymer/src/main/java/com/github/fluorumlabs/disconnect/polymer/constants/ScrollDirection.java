package com.github.fluorumlabs.disconnect.polymer.constants;

import js.extras.JsEnum;

/**
 * Created by Artem Godin on 2/3/2020.
 */
@Deprecated
public abstract class ScrollDirection extends JsEnum {
	/**
	 * The constant ALL.
	 */
	public static final ScrollDirection ALL = JsEnum.of("all");

	/**
	 * The constant X.
	 */
	public static final ScrollDirection X = JsEnum.of("x");

	/**
	 * The constant Y.
	 */
	public static final ScrollDirection Y = JsEnum.of("y");

	/**
	 * The constant NONE.
	 */
	public static final ScrollDirection NONE = JsEnum.of("none");
}
