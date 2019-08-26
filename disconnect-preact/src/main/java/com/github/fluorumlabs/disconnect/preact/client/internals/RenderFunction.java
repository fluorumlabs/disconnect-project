package com.github.fluorumlabs.disconnect.preact.client.internals;

import com.github.fluorumlabs.disconnect.preact.client.ElementPrototype;
import org.teavm.jso.JSFunctor;
import org.teavm.jso.JSObject;

/**
 * Created by Artem Godin on 8/21/2019.
 */
@JSFunctor
public interface RenderFunction extends JSObject {
    ElementPrototype render();
}
