package com.github.fluorumlabs.disconnect.zero.component;

import com.github.fluorumlabs.disconnect.core.internals.DisconnectUtils;
import js.lang.Any;
import org.teavm.jso.JSBody;

/**
 * Created by Artem Godin on 2/3/2020.
 */
abstract class ComponentReferenceHolder<C extends Component<?>> implements Any {
    void set(C component) {
        setImpl(DisconnectUtils.asJsObject(component));
    }

    C get() {
        return DisconnectUtils.asJavaObject(getImpl());
    }

    @JSBody(params = "component", script = "this.__component_ref__ = this.__component_ref__ || component")
    private native void setImpl(Any component);

    @JSBody(script = "return this.__component_ref__")
    private native Any getImpl();
}
