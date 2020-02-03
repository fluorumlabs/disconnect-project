package com.github.fluorumlabs.disconnect.polymer.utils;

import js.lang.Any;
import org.teavm.jso.JSProperty;

/**
 * Created by Artem Godin on 2/3/2020.
 */
public interface BooleanPropertyChangeDetails extends Any {
    @JSProperty
    boolean getValue();

    @JSProperty
    void setValue(boolean value);

    @JSProperty
    boolean getQueueProperty();

    @JSProperty
    void setQueueProperty(boolean queueProperty);

    @JSProperty
    String getPath();

    @JSProperty
    void setPath(String path);
}
