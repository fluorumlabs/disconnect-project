package com.github.fluorumlabs.disconnect.polymer.utils;

import js.extras.JsEnum;
import js.lang.Any;
import js.util.collections.Array;
import org.teavm.jso.JSByRef;
import org.teavm.jso.JSProperty;

/**
 * Created by Artem Godin on 2/3/2020.
 */
public interface SpliceRecord<T extends Any> extends ReadonlySpliceRecord<T> {
    @JSProperty
    void setIndex(int index);

    @JSProperty
    void setRemoved(@JSByRef T... removed);
    @JSProperty
    void setRemoved(Array<T> removed);

    @JSProperty
    void setAddedCount(int addedCount);

    @JSProperty
    Array<T> getObject();

    @JSProperty
    void setObject(Array<T> object);

    @JSProperty
    Type getType();

    @JSProperty
    void setType(Type type);

    abstract class Type extends JsEnum {
        public static final Type SPLICE = JsEnum.of("splice");
    }

}
