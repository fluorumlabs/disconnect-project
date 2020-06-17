package com.github.fluorumlabs.disconnect.core.router;

import js.lang.Any;
import js.lang.external.vaadin.router.Params;
import js.util.JS;

import java.util.Arrays;
import java.util.List;

/**
 * Created by Artem Godin on 6/17/2020.
 */
public class LocationParams {
    private final Params params;

    public LocationParams() {
        this.params = Any.empty();
    }

    public LocationParams(Params params) {
        this.params = params;
    }

    public boolean has(String key) {
        return !JS.isUndefinedOrNull(params.get(key));
    }

    public boolean has(int key) {
        return !JS.isUndefinedOrNull(params.get(key));
    }

    public String get(String key) {
        return params.get(key).stringValue();
    }

    public String get(int key) {
        return params.get(key).stringValue();
    }

    public List<String> getAsList(String key) {
        return Arrays.asList(params.get(key).stringArrayValue());
    }

    public List<String> getAsList(int key) {
        return Arrays.asList(params.get(key).stringArrayValue());
    }

    public void set(String key, String value) {
        params.set(key, value);
    }

    public void set(String key, List<String> value) {
        params.set(key, (String[]) value.toArray());
    }

    public void set(int key, String value) {
        params.set(key, value);
    }

    public void set(int key, List<String> value) {
        params.set(key, (String[]) value.toArray());
    }

    Params getParams() {
        return params;
    }
}
