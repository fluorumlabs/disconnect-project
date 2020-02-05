package com.github.fluorumlabs.disconnect.vaadin.i18n;

import js.lang.Any;
import org.teavm.jso.JSFunctor;
import org.teavm.jso.JSProperty;

/**
 * Created by Artem Godin on 2/4/2020.
 */
public interface CustomFieldI18n extends Any {
    @JSProperty
    Formatter getFormatValue();

    @JSProperty
    void setFormatValue(Formatter formatValue);

    @JSProperty
    Parser getParseValue();

    @JSProperty
    void setParseValue(Parser parseValue);

    @JSFunctor
    @FunctionalInterface
    interface Formatter extends Any {
        String formatValue(String[] inputValues);
    }

    @JSFunctor
    @FunctionalInterface
    interface Parser extends Any {
        String[] parseValue(String value);
    }
}
