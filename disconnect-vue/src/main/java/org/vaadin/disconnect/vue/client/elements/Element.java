package org.vaadin.disconnect.vue.client.elements;

import org.teavm.jso.JSBody;
import org.teavm.jso.JSObject;
import org.teavm.jso.JSProperty;
import org.teavm.jso.core.JSArray;
import org.teavm.jso.core.JSObjects;
import org.teavm.jso.core.JSString;
import org.teavm.platform.Platform;
import org.teavm.platform.PlatformObject;
import org.vaadin.disconnect.vue.client.Directive;
import org.vaadin.disconnect.vue.client.internals.ComponentDefinition;
import org.vaadin.disconnect.vue.client.internals.ComponentDefinitionAccessor;
import org.vaadin.disconnect.vue.client.ui.Component;

/**
 * Created by Artem Godin on 9/26/2019.
 */
public abstract class Element<T extends Element<T>> implements ElementBase {
    private ElementBase parentElement = null;
    private Component parentComponent = null;

    protected Element(String text) {
        getOverlay().setDefinition(JSString.valueOf(text));
        getOverlay().setChildren(JSArray.create());
        getOverlay().setData(JSObjects.create());

        key(generateUniqueKey());
    }

    protected Element(ComponentDefinition definition) {
        getOverlay().setDefinition(definition);
        getOverlay().setChildren(JSArray.create());
        getOverlay().setData(JSObjects.create());

        key(generateUniqueKey());
    }

    protected Element(Class<?> clazz) {
        this(ComponentDefinitionAccessor.getComponentDefinition(clazz));
    }

    @Override
    public final void setParentElement(ElementBase parent) {
        this.parentElement = parent;
    }

    public final void setParentComponent(Component parent) {
        this.parentComponent = parent;
    }

    @Override
    public final ElementData data() {
        markAsDirty(); // Why else one would query for data()?
        return getOverlay().getData();
    }

    @Override
    public final ElementChildren children() {
        markAsDirty(); // Why else one would query for children()?
        return getOverlay().getChildren();
    }

    public final T slot(String slot) {
        markAsDirty();
        getOverlay().getData().setSlot(slot);
        return (T) this;
    }

    public final T ref(String ref) {
        markAsDirty();
        getOverlay().getData().setRef(ref);
        return (T) this;
    }

    public final T key(String key) {
        markAsDirty();
        getOverlay().getData().setKey(key);
        return (T) this;
    }

    public final T directive(Directive directive) {
        getOverlay().getData().directives().push(directive);
        return (T) this;
    }

    public final String getKey() {
        return getOverlay().getData().getKey();
    }

    public final String getRef() {
        return getOverlay().getData().getRef();
    }

    public final void markAsDirty() {
        if (parentComponent != null) {
            parentComponent.markAsDirty();
            return;
        } else if (parentElement == null) {
            // Waat?
            return;
        }
        parentElement.markAsDirty();
    }

    @JSBody(script = "return String(Math.random()).slice(2);")
    private static native String generateUniqueKey();

    private Overlay getOverlay() {
        return Platform.getPlatformObject(this).cast();
    }

    private interface Overlay extends JSObject {
        @JSProperty
        void setDefinition(JSObject definition);

        @JSProperty
        void setData(ElementData data);

        @JSProperty
        void setChildren(JSArray<PlatformObject> elements);

        @JSProperty
        ElementData getData();

        @JSProperty
        ElementChildren getChildren();
    }

    public static HtmlElement of(String tag) {
        return new HtmlElement(tag);
    }

    public static VueElement of(Class<?> clazz) {
        return new VueElement(clazz);
    }
}
