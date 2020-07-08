package com.github.fluorumlabs.disconnect.core.utils;

import com.github.fluorumlabs.disconnect.core.internals.DisconnectUtils;
import js.lang.Any;
import js.lang.Symbol;
import org.teavm.jso.JSBody;

/**
 * Created by Artem Godin on 7/6/2020.
 */
public final class SidebandReference<T> {
    private final Symbol symbol;

    public SidebandReference(String description) {
        this.symbol = Symbol.create(description);
    }

    public SidebandReference() {
        this.symbol = Symbol.create();
    }

    public <X extends T> void store(Any target, X value) {
        target.<Reference>cast().set(symbol, DisconnectUtils.asJsObject(value));
    }

    public <X extends T> X retrieve(Any target) {
        return DisconnectUtils.asJavaObject(target.<Reference>cast().get(symbol));
    }

    public <X extends Any> void store(Object target, X value) {
        DisconnectUtils.asJsObject(target).<Reference>cast().set(symbol, value);
    }

    public <X extends Any> X retrieve(Object target) {
        return DisconnectUtils.asJsObject(target).<Reference>cast().get(symbol).cast();
    }

    public <X extends T> void storeObject(Object target, X value) {
        DisconnectUtils.asJsObject(target).<Reference>cast().set(symbol, DisconnectUtils.asJsObject(value));
    }

    public <X extends T> X retrieveObject(Object target) {
        return DisconnectUtils.asJavaObject(DisconnectUtils.asJsObject(target).<Reference>cast().get(symbol).cast());
    }

    private interface Reference extends Any {
        @JSBody(params = "symbol", script = "return this[symbol]||null")
        <T extends Any> T get(Symbol symbol);

        @JSBody(params = {"symbol","value"}, script = "this[symbol]=value")
        <T extends Any> void set(Symbol symbol, T value);
    }
}
