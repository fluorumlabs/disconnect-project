package org.vaadin.disconnect.vue.client.elements;

import org.vaadin.disconnect.vue.client.internals.ComponentDefinition;

/**
 * Created by Artem Godin on 9/27/2019.
 */
public abstract class ElementContainer<T extends ElementContainer<T>> extends Element<T> {
    protected ElementContainer(String text) {
        super(text);
    }

    protected ElementContainer(ComponentDefinition definition) {
        super(definition);
    }

    protected ElementContainer(Class<?> clazz) {
        super(clazz);
    }

    public final T add(Element... elements) {
        for (Element element : elements) {
            children().add(element, this);
        }
        return (T) this;
    }

    public final T remove(Element...elements) {
        for (Element element : elements) {
            children().remove(element);
        }
        return (T) this;
    }

    public final T removeByKey(String...keys) {
        for (String key : keys) {
            children().removeByKey(key);
        }
        return (T) this;
    }

    public final T removeAll() {
        children().removeAll();
        return (T) this;
    }

}
