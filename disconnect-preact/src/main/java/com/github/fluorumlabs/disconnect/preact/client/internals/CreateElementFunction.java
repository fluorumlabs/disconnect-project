package com.github.fluorumlabs.disconnect.preact.client.internals;

import org.teavm.jso.JSObject;
import org.teavm.jso.core.JSString;

/**
 * Created by Artem Godin on 8/21/2019.
 */
public interface CreateElementFunction extends JSObject {
    VNode call(JSString tag, JSObject params, VNode[] children);
}
