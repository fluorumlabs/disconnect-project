package com.github.fluorumlabs.disconnect.vaadin.constants;

import js.extras.JsEnum;

/**
 * Created by Artem Godin on 2/4/2020.
 */
public abstract class NotificationPosition extends JsEnum {
	public static final NotificationPosition TOP_STRETCH = JsEnum.of("top-stretch");

	public static final NotificationPosition TOP_START = JsEnum.of("top-start");

	public static final NotificationPosition TOP_CENTER = JsEnum.of("top-center");

	public static final NotificationPosition TOP_END = JsEnum.of("top-end");

	public static final NotificationPosition MIDDLE = JsEnum.of("middle");

	public static final NotificationPosition BOTTOM_START = JsEnum.of("bottom-start");

	public static final NotificationPosition BOTTOM_CENTER = JsEnum.of("bottom-center");

	public static final NotificationPosition BOTTOM_END = JsEnum.of("bottom-end");

	public static final NotificationPosition BOTTOM_STRETCH = JsEnum.of("bottom-stretch");

}
