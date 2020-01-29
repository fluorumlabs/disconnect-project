package com.github.fluorumlabs.disconnect.core.internals;

import js.lang.Any;
import js.lang.Unknown;
import org.teavm.jso.JSBody;
import org.teavm.jso.JSIndexer;


public abstract class DisconnectSymbols implements Any {
    @JSBody(script = "return __this__;")
    private static native DisconnectSymbols getInstance();

    @JSIndexer
    private native Unknown getImportedSymbol(String symbol);

    public static Unknown get(String symbol) {
        return getInstance().getImportedSymbol(symbol);
    }
}
