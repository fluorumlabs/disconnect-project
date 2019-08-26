package org.vaadin.disconnect.core.client.internals;

import org.teavm.jso.JSFunctor;
import org.teavm.jso.JSObject;
import org.vaadin.disconnect.core.client.ElementPrototype;

/**
 * Created by Artem Godin on 8/21/2019.
 */
@JSFunctor
public interface StateAwareRenderFunction extends JSObject {
    ElementPrototype render(JSObject properties, JSObject state, JSObject context);
}
