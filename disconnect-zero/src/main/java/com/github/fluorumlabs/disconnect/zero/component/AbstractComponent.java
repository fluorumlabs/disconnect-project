package com.github.fluorumlabs.disconnect.zero.component;

import com.github.fluorumlabs.disconnect.core.internals.DisconnectUtils;
import com.github.fluorumlabs.disconnect.zero.LazyEventInitializer;
import com.github.fluorumlabs.disconnect.zero.event.VisibilityChange;
import com.github.fluorumlabs.disconnect.zero.observable.ObservableEvent;
import js.lang.Any;
import js.web.dom.*;
import org.teavm.jso.JSBody;

import javax.annotation.Nullable;
import java.util.function.BiConsumer;
import java.util.function.Supplier;

import static js.web.dom.Window.DOCUMENT;


public abstract class AbstractComponent<X extends Element> extends LazyEventInitializer<X> implements Component<X> {
    private final X element;
    private HiddenNode hiddenElementHolder;

    private ObservableEvent<VisibilityChange> visibilityChangeEvent;

    protected AbstractComponent(X node) {
        this.element = node;
        node.<ComponentReferenceHolder<AbstractComponent<?>>>cast().set(this);
    }

    @SuppressWarnings("unchecked")
    protected AbstractComponent(String tagName) {
        this((X)DOCUMENT.createElement(tagName));
    }

    public X getElement() {
        return element;
    }

    public Element render() {
        if (hiddenElementHolder != null) {
            return hiddenElementHolder;
        } else {
            return element;
        }
    }

    @Override
    public <T, E extends ObservableEvent<T>> E createEvent(Object identifier, Supplier<E> initializer) {
        return super.createEvent(identifier, initializer);
    }

    @Override
    public <T extends Event, E extends ObservableEvent<T>> E createEvent(String identifier) {
        return createEvent(element, identifier);
    }

    @Override
    public <T extends Event, E extends ObservableEvent<T>> E createEvent(String identifier, String... altIdentifiers) {
        return createEvent(element, identifier, altIdentifiers);
    }

    @Override
    public <T extends Event, E extends ObservableEvent<T>> E createEvent(BiConsumer<X, EventListener<T>> addEventListener) {
        return createEvent(element, addEventListener);
    }

    @SafeVarargs
    @Override
    public final <T extends Event, E extends ObservableEvent<T>> E createEvent(BiConsumer<X, EventListener<T>> addEventListener, BiConsumer<X, EventListener<T>>... addEventListeners) {
        return createEvent(element, addEventListener, addEventListeners);
    }

    @Nullable
    protected <Y extends AbstractComponent<?>> Y getParent() {
        Element parentElement = (isVisible() ? element : hiddenElementHolder).getParentElement();
        return parentElement == null ? null : from(parentElement);
    }

    public boolean isVisible() {
        return hiddenElementHolder == null || hiddenElementHolder.isVisible();
    }

    public void toggleVisibility() {
        if (isVisible()) {
            hide();
        } else {
            show();
        }
    }

    public void hide() {
        if (isVisible()) {
            if (hiddenElementHolder == null) {
                hiddenElementHolder = DOCUMENT.createElement("zero-hidden");
                hiddenElementHolder.setElement(element);
                hiddenElementHolder.setVisible(false);
                if (element.getParentNode() != null) {
                    if (element.getSlot() != null && !element.getSlot().isEmpty()) {
                        hiddenElementHolder.setSlot(element.getSlot());
                    }
                    element.getParentNode().replaceChild(hiddenElementHolder, element);
                }
            } else {
                hiddenElementHolder.setVisible(false);
                if (element.getParentNode() != null) {
                    if (element.getSlot() != null && !element.getSlot().isEmpty()) {
                        hiddenElementHolder.setSlot(element.getSlot());
                    }
                    element.getParentNode().removeChild(element);
                }
            }
            if (visibilityChangeEvent != null) {
                visibilityChangeEvent.trigger(new VisibilityChange(this, false));
            }
        }
    }

    public void show() {
        if (!isVisible()) {
            if (hiddenElementHolder.getParentNode() != null) {
                if (hiddenElementHolder.getSlot() != null && !hiddenElementHolder.getSlot().isEmpty()) {
                    element.setSlot(hiddenElementHolder.getSlot());
                }
                hiddenElementHolder.getParentNode().insertBefore(element, hiddenElementHolder);
                hiddenElementHolder.setVisible(true);
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

    public static <C extends AbstractComponent<?>> C from(Element element) {
        return element.<ComponentReferenceHolder<C>>cast().get();
    }

    private abstract static class ComponentReferenceHolder<C extends AbstractComponent<?>> implements Any {
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

    private interface HiddenNode extends HTMLUnknownElement {
        @JSBody(script = "return this.__element__")
        Element getElement();

        @JSBody(params = "node", script = "this.__element__ = element")
        void setElement(Element element);

        @JSBody(script = "return this.__hidden__")
        boolean isVisible();

        @JSBody(params = "hidden", script = "this.__hidden__ = hidden")
        void setVisible(boolean visible);
    }
}
