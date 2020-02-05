package com.github.fluorumlabs.disconnect.vaadin.dataproviders;

import js.lang.Any;
import js.util.collections.Array;
import org.teavm.jso.JSFunctor;

/**
 * Created by Artem Godin on 2/4/2020.
 */
@JSFunctor
@FunctionalInterface
public
interface DataProviderCallback<ITEM extends Any> extends Any {
    void accept(Array<ITEM> items, int size);
}
