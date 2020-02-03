package com.github.fluorumlabs.disconnect.polymer.utils;

import js.lang.Any;
import org.teavm.jso.JSProperty;

/**
 * Created by Artem Godin on 2/3/2020.
 */
public interface PropertyChangeDetails<T extends Any> extends Any {
    @JSProperty
    T getValue();

    @JSProperty
    void setValue(T value);

    @JSProperty
    boolean getQueueProperty();

    @JSProperty
    void setQueueProperty(boolean queueProperty);

    @JSProperty
    String getPath();

    @JSProperty
    void setPath(String path);
}
