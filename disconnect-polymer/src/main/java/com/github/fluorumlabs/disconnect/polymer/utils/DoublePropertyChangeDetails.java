package com.github.fluorumlabs.disconnect.polymer.utils;

import js.lang.Any;
import org.teavm.jso.JSProperty;

/**
 * Created by Artem Godin on 2/3/2020.
 */
public interface DoublePropertyChangeDetails extends Any {
    @JSProperty
    double getValue();

    @JSProperty
    void setValue(double value);

    @JSProperty
    boolean getQueueProperty();

    @JSProperty
    void setQueueProperty(boolean queueProperty);

    @JSProperty
    String getPath();

    @JSProperty
    void setPath(String path);
}
