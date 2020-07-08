package com.github.fluorumlabs.disconnect.vaadin.charts;

import js.lang.Unknown;

import java.util.Optional;

/**
 * Created by Artem Godin on 7/4/2020.
 */
public final class Stack {
    private final String stringValue;
    private final int intValue;

    private final boolean isString;

    private Stack(String stringValue) {
        this.stringValue = stringValue;
        this.intValue = 0;
        this.isString = true;
    }

    private Stack(int intValue) {
        this.stringValue = null;
        this.intValue = intValue;
        this.isString = false;
    }

    public static Stack byName(String value) {
        return new Stack(value);
    }

    public static Stack byIndex(int value) {
        return new Stack(value);
    }

    public static Stack by(Unknown value) {
        if (value.isString()) {
            return new Stack(value.stringValue());
        } else {
            return new Stack(value.intValue());
        }
    }

    public Optional<String> getName() {
        return isString ? Optional.of(stringValue) : Optional.empty();
    }

    public Optional<Integer> getIndex() {
        return isString ? Optional.empty() : Optional.of(intValue);
    }

}
