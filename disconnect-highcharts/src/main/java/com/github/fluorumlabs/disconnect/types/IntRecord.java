package com.github.fluorumlabs.disconnect.types;

import js.lang.Any;
import org.teavm.jso.JSIndexer;


public interface IntRecord extends Any {
    @JSIndexer
    int get(String key);

    @JSIndexer
    void set(String key, int value);
}
