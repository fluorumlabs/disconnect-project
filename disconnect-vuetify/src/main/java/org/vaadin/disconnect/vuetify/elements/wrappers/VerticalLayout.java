package org.vaadin.disconnect.vuetify.elements.wrappers;

import org.vaadin.disconnect.vue.client.elements.Element;
import org.vaadin.disconnect.vue.client.elements.HasChildElements;
import org.vaadin.disconnect.vue.client.elements.Text;
import org.vaadin.disconnect.vuetify.elements.VuetifyElement;
import org.vaadin.disconnect.vuetify.elements.container.Container;

/**
 * Created by Artem Godin on 9/27/2019.
 */
public final class VerticalLayout extends VuetifyElement<VerticalLayout> implements HasChildElements<VerticalLayout, Element<?>> {
    public VerticalLayout() {
        super(Container.class);
    }

    public VerticalLayout(Element... elements) {
        this();
        add(elements);
    }

    @Override
    public final VerticalLayout add(Element... elements) {
        for (Element element : elements) {
            children().add(new Container.Row(new Container.Col(element)).key(element.getKey()));
        }
        return this;
    }

    @Override
    public final VerticalLayout insert(Element<?>... elements) {
        int pos = 0;
        for (Element element : elements) {
            children().insertAt(pos, new Container.Row(new Container.Col(element)).key(element.getKey()));
            pos++;
        }
        return this;
    }

    @Override
    public final VerticalLayout remove(Element... elements) {
        for (Element element : elements) {
            children().removeByKey(element.getKey());
        }
        return this;
    }

    @Override
    public final VerticalLayout removeByKey(String... keys) {
        for (String key : keys) {
            children().removeByKey(key);
        }
        return this;
    }

    @Override
    public final VerticalLayout removeAll() {
        children().removeAll();
        return this;
    }

    @Override
    public final VerticalLayout setText(String text) {
        return removeAll().add(new Text(text));
    }
}
