package com.github.fluorumlabs.disconnect.zero.component;

import com.github.fluorumlabs.disconnect.core.internals.DisconnectUtils;
import com.github.fluorumlabs.disconnect.zero.LazyEventInitializer;
import com.github.fluorumlabs.disconnect.zero.event.VisibilityChange;
import com.github.fluorumlabs.disconnect.zero.observable.ObservableEvent;
import js.lang.Any;
import js.web.dom.*;
import org.teavm.jso.JSBody;

import java.util.function.BiConsumer;
import java.util.function.Supplier;

import static js.web.dom.Window.DOCUMENT;


public abstract class Component<X extends Node & EventTarget> extends LazyEventInitializer<X> implements ComponentBase<X> {
    private X node = null;
    private HiddenNode hiddenNodeHolder = null;

    private ObservableEvent<VisibilityChange> visibilityChangeEvent = null;

    protected Component(X node) {
        this.node = node;
        node.<ComponentReferenceHolder<Component>>cast().set(this);
    }

    protected Component(String tagName) {
        this((X)DOCUMENT.createElement(tagName));
    }

    public X getNode() {
        return node;
    }

    public Node render() {
        if (hiddenNodeHolder != null) {
            return hiddenNodeHolder;
        } else {
            return node;
        }
    }

    @Override
    public <T, E extends ObservableEvent<T>> E createEvent(Object identifier, Supplier<E> initializer) {
        return super.createEvent(identifier, initializer);
    }

    @Override
    public <T extends Event, E extends ObservableEvent<T>> E createEvent(String identifier) {
        return createEvent(getNode(), identifier);
    }

    @Override
    public <T extends Event, E extends ObservableEvent<T>> E createEvent(String identifier, String... altIdentifiers) {
        return createEvent(getNode(), identifier, altIdentifiers);
    }

    @Override
    public <T extends Event, E extends ObservableEvent<T>> E createEvent(BiConsumer<X, EventListener<T>> addEventListener) {
        return createEvent(getNode(), addEventListener);
    }

    @Override
    public <T extends Event, E extends ObservableEvent<T>> E createEvent(BiConsumer<X, EventListener<T>> addEventListener, BiConsumer<X, EventListener<T>>... altAddEventListeners) {
        return createEvent(getNode(), addEventListener, altAddEventListeners);
    }

    protected <X extends Component> X getParent() {
        Node parentNode = (isHidden() ? hiddenNodeHolder : node).getParentNode();
        return parentNode == null ? null : Component.from(parentNode);
    }

    public boolean isHidden() {
        return hiddenNodeHolder != null && hiddenNodeHolder.isHidden();
    }

    public void toggleVisibility() {
        if (isHidden()) {
            show();
        } else {
            hide();
        }
    }

    public void hide() {
        if (!isHidden()) {
            if (hiddenNodeHolder == null) {
                hiddenNodeHolder = DOCUMENT.createComment("").cast();
                hiddenNodeHolder.setNode(node);
                hiddenNodeHolder.setHidden(true);
                if (node.getParentNode() != null) {
                    node.getParentNode().replaceChild(hiddenNodeHolder, node);
                }
            } else {
                hiddenNodeHolder.setHidden(true);
                node.getParentNode().removeChild(node);
            }
            if (visibilityChangeEvent != null) {
                visibilityChangeEvent.trigger(new VisibilityChange(this, false));
            }
        }
    }

    public void show() {
        if (isHidden()) {
            if (hiddenNodeHolder.getParentNode() != null) {
                hiddenNodeHolder.getParentNode().insertBefore(node, hiddenNodeHolder);
                hiddenNodeHolder.setHidden(false);
            }
            if (visibilityChangeEvent != null) {
                visibilityChangeEvent.trigger(new VisibilityChange(this, true));
            }
        }
    }

    public ObservableEvent<VisibilityChange> visibilityChangeEvent() {
        if (visibilityChangeEvent == null) {
            visibilityChangeEvent = new ObservableEvent<>();
        }
        return visibilityChangeEvent;
    }

    public static <C extends Component> C from(Node node) {
        return node.<ComponentReferenceHolder<C>>cast().get();
    }

    private static abstract class ComponentReferenceHolder<C extends Component> implements Any {
        private void set(C component) {
            setImpl(DisconnectUtils.asJsObject(component));
        }

        private C get() {
            return DisconnectUtils.asJavaObject(getImpl());
        }

        @JSBody(params = "component", script = "this.__component_ref__ = this.__component_ref__ || component")
        private native void setImpl(Any component);

        @JSBody(script = "return this.__component_ref__")
        private native Any getImpl();
    }

    private interface HiddenNode extends Comment {
        @JSBody(script = "return this.__node__")
        DocumentFragment getNode();

        @JSBody(params = "node", script = "this.__node__ = node")
        void setNode(Node node);

        @JSBody(script = "return this.__hidden__")
        boolean isHidden();

        @JSBody(params = "hidden", script = "this.__hidden__ = hidden")
        void setHidden(boolean hidden);
    }
}
