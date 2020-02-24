package com.github.fluorumlabs.disconnect.types;

import js.lang.Any;
import org.teavm.jso.JSIndexer;


public interface DoubleRecord extends Any {
    @JSIndexer
    double get(String key);

    @JSIndexer
    void set(String key, double value);
}
