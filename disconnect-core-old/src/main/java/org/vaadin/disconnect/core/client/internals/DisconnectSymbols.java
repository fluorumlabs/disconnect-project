package org.vaadin.disconnect.core.client.internals;

import org.teavm.jso.JSBody;
import org.teavm.jso.JSIndexer;
import org.teavm.jso.JSObject;

/**
 * Created by Artem Godin on 9/20/2019.
 */
public abstract class DisconnectSymbols implements JSObject {
    @JSBody(script = "return __this__;")
    private static native DisconnectSymbols getInstance();

    @JSIndexer
    private native JSObject getImportedSymbol(String symbol);

    public static JSObject get(String symbol) {
        return getInstance().getImportedSymbol(symbol);
    }
}
