package com.github.fluorumlabs.disconnect.zero.component;

import com.github.fluorumlabs.disconnect.zero.LazyEventInitializer;
import com.github.fluorumlabs.disconnect.zero.observable.ObservableEvent;
import js.web.dom.*;
import js.web.webcomponents.HTMLTemplateElement;

import javax.annotation.Nullable;

import java.util.function.BiConsumer;
import java.util.function.Supplier;

import static js.web.dom.Document.DOCUMENT;


public class Template extends LazyEventInitializer<DocumentFragment> implements Component<DocumentFragment>,
HasComponents<DocumentFragment, Template, Component<?>> {
    private final DocumentFragment node;
    private final HTMLTemplateElement templateElement;

    public Template() {
        this.templateElement = DOCUMENT.createElement("template");
        this.node = templateElement.getContent();
        templateElement.<ComponentReferenceHolder<Template>>cast().set(this);
    }

    public DocumentFragment getNode() {
        return node;
    }

    public Node getRenderedNode() {
        return templateElement;
    }

    @Override
    public <T, E extends ObservableEvent<T>> E createEvent(Object identifier, Supplier<E> initializer) {
        return super.createEvent(identifier, initializer);
    }

    @Override
    public <T extends Event, E extends ObservableEvent<T>> E createEvent(String identifier) {
        return createEvent(node, identifier);
    }

    @Override
    public <T extends Event, E extends ObservableEvent<T>> E createEvent(String identifier, String... altIdentifiers) {
        return createEvent(node, identifier, altIdentifiers);
    }

    @Override
    public <T extends Event, E extends ObservableEvent<T>> E createEvent(BiConsumer<DocumentFragment, EventListener<T>> addEventListener) {
        return createEvent(node, addEventListener);
    }

    @SafeVarargs
    @Override
    public final <T extends Event, E extends ObservableEvent<T>> E createEvent(BiConsumer<DocumentFragment, EventListener<T>> addEventListener, BiConsumer<DocumentFragment, EventListener<T>>... addEventListeners) {
        return createEvent(node, addEventListener, addEventListeners);
    }

    @Nullable
    protected <Y extends Template> Y getParent() {
        Element parentElement = templateElement.getParentElement();
        return parentElement == null ? null : from(parentElement);
    }

    public static <C extends Template> C from(Element element) {
        return element.<ComponentReferenceHolder<C>>cast().get();
    }

}
