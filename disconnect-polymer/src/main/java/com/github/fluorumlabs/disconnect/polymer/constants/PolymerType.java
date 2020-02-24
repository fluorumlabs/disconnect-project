package com.github.fluorumlabs.disconnect.polymer.constants;

import js.extras.JsEnum;

/**
 * Created by Artem Godin on 2/3/2020.
 */
public abstract class PolymerType extends JsEnum {
	/**
	 * The constant BOOLEAN.
	 */
	public static final PolymerType BOOLEAN = JsEnum.of("Boolean");

	/**
	 * The constant DATE.
	 */
	public static final PolymerType DATE = JsEnum.of("Date");

	/**
	 * The constant NUMBER.
	 */
	public static final PolymerType NUMBER = JsEnum.of("Number");

	/**
	 * The constant STRING.
	 */
	public static final PolymerType STRING = JsEnum.of("String");

	/**
	 * The constant ARRAY.
	 */
	public static final PolymerType ARRAY = JsEnum.of("Array");

	/**
	 * The constant OBJECT.
	 */
	public static final PolymerType OBJECT = JsEnum.of("Object");
}
