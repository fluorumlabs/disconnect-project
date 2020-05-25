package com.github.fluorumlabs.disconnect.core.internals;

import com.github.fluorumlabs.disconnect.core.components.Component;
import js.lang.Any;
import js.web.dom.Element;
import org.teavm.jso.JSBody;

import javax.annotation.Nullable;

/**
 * Created by Artem Godin on 2/3/2020.
 */
public abstract class ComponentReferenceHolder implements Any {
    @Nullable
    private static Component<?> PENDING_COMPONENT_REFERENCE = null;
    @Nullable
    private static Element PENDING_ELEMENT_REFERENCE = null;

    @Nullable
    public static <C extends Component<?>> C popPendingComponentReference() {
        C result = (C)PENDING_COMPONENT_REFERENCE;
        resetPendingComponentReference();
        return result;
    }
    @Nullable
    public static <E extends Element> E popPendingElementReference() {
        E result = (E)PENDING_ELEMENT_REFERENCE;
        resetPendingElementReference();
        return result;
    }

    public static void pushPendingComponentReference(Component<?> component) {
        PENDING_COMPONENT_REFERENCE = component;
    }

    public static void resetPendingComponentReference() {
        PENDING_COMPONENT_REFERENCE = null;
    }

    public static void pushPendingElementReference(Element element) {
        PENDING_ELEMENT_REFERENCE = element;
    }

    public static void resetPendingElementReference() {
        PENDING_ELEMENT_REFERENCE = null;
    }

    public void set(Object component) {
        setImpl(DisconnectUtils.asJsObject(component));
    }


    public <C> C get() {
        return DisconnectUtils.asJavaObject(getImpl());
    }

    @JSBody(params = "component", script = "this.__cref__ = component")
    private native void setImpl(Any component);

    @JSBody(script = "return this.__cref__ || null")
    private native Any getImpl();
}
