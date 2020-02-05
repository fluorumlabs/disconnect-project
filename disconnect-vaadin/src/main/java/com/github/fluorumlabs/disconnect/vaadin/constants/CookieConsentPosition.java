package com.github.fluorumlabs.disconnect.vaadin.constants;

import js.extras.JsEnum;

/**
 * Created by Artem Godin on 2/4/2020.
 */
public abstract class CookieConsentPosition extends JsEnum {
    public static final CookieConsentPosition TOP = JsEnum.of("top");

    public static final CookieConsentPosition BOTTOM = JsEnum.of("bottom");

    public static final CookieConsentPosition TOP_LEFT = JsEnum.of("top-left");

    public static final CookieConsentPosition TOP_RIGHT = JsEnum.of("top-right");

    public static final CookieConsentPosition BOTTOM_LEFT = JsEnum.of("bottom-left");

    public static final CookieConsentPosition BOTTOM_RIGHT = JsEnum.of("bottom-right");

}
