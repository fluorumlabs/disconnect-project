package com.github.fluorumlabs.disconnect.vaadin.i18n;

import js.lang.Any;
import org.teavm.jso.JSFunctor;
import org.teavm.jso.JSProperty;

/**
 * Created by Artem Godin on 2/4/2020.
 */
public interface TimePickerI18n extends Any {
    @JSProperty
    TimeFormatter getFormatTime();

    @JSProperty
    void setFormatTime(TimeFormatter formatDate);

    @JSProperty
    TimeParser getParseTime();

    @JSProperty
    void setParseTime(TimeParser parseDate);

    @JSProperty
    String getSelector();

    @JSProperty
    void setSelector(String selector);

    @JSProperty
    String getClear();

    @JSProperty
    void setClear(String clear);

    @JSFunctor
    @FunctionalInterface
    interface TimeFormatter extends Any {
        String formatTime(SimpleTime d);
    }

    @JSFunctor
    @FunctionalInterface
    interface TimeParser extends Any {
        SimpleTime parseTime(String text);
    }

    interface SimpleTime extends Any {
        @JSProperty
        int getHours();

        @JSProperty
        void setHours(int hours);

        @JSProperty
        int getMinutes();

        @JSProperty
        void setMinutes(int minutes);

        @JSProperty
        int getSeconds();

        @JSProperty
        void setSeconds(int seconds);

        @JSProperty
        int getMilliseconds();

        @JSProperty
        void setMilliseconds(int milliseconds);
    }
}
