package com.github.fluorumlabs.disconnect.vaadin.constants;

import js.extras.JsEnum;

/**
 * Created by Artem Godin on 2/4/2020.
 */
public abstract class UploadMethod extends JsEnum {
    public static final UploadMethod POST = JsEnum.of("POST");

    public static final UploadMethod PUT = JsEnum.of("PUT");

}
