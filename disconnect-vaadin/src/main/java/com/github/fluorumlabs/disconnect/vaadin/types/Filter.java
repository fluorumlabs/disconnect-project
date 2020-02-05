package com.github.fluorumlabs.disconnect.vaadin.types;

import js.lang.Any;
import org.teavm.jso.JSProperty;

import javax.annotation.Nullable;

/**
 * Created by Artem Godin on 2/4/2020.
 */
public interface Filter extends Any {
    @JSProperty
    String getPath();

    @Nullable
    @JSProperty
    String getValue();
}
