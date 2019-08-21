package com.github.fluorumlabs.disconnect.vue.client;

import org.teavm.jso.JSFunctor;
import org.teavm.jso.JSObject;

/**
 * Created by Artem Godin on 8/14/2019.
 */
@JSFunctor
public interface VueComponentDataSupplier<T extends JSObject> extends JSObject {
    T get() throws IllegalAccessException, InstantiationException;
}
