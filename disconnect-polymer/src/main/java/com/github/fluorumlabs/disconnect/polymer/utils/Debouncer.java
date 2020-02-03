package com.github.fluorumlabs.disconnect.polymer.utils;

import js.lang.Any;

/**
 * Created by Artem Godin on 2/3/2020.
 */
@Deprecated
public interface Debouncer extends Any {
    boolean isActive();

    void cancel();

    void flush();
}
