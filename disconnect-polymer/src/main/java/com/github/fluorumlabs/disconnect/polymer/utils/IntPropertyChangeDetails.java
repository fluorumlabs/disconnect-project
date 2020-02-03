package com.github.fluorumlabs.disconnect.polymer.utils;

import js.lang.Any;
import org.teavm.jso.JSProperty;

/**
 * Created by Artem Godin on 2/3/2020.
 */
public interface IntPropertyChangeDetails extends Any {
    @JSProperty
    int getValue();

    @JSProperty
    void setValue(int value);

    @JSProperty
    boolean getQueueProperty();

    @JSProperty
    void setQueueProperty(boolean queueProperty);

    @JSProperty
    String getPath();

    @JSProperty
    void setPath(String path);
}
