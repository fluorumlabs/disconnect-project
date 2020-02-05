package com.github.fluorumlabs.disconnect.vaadin.i18n;

import js.lang.Any;
import org.teavm.jso.JSProperty;

/**
 * Created by Artem Godin on 2/4/2020.
 */
public interface TextFieldI18n extends Any {
    @JSProperty
    String getClear();

    @JSProperty
    void setClear(String clear);

}
