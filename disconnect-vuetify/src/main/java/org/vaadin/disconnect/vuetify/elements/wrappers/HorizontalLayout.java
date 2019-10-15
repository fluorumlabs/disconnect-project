package org.vaadin.disconnect.vuetify.elements.wrappers;

import org.vaadin.disconnect.vue.client.elements.Element;
import org.vaadin.disconnect.vue.client.elements.HasChildElements;
import org.vaadin.disconnect.vue.client.elements.Text;
import org.vaadin.disconnect.vuetify.elements.VuetifyElement;
import org.vaadin.disconnect.vuetify.elements.container.Container;

/**
 * Created by Artem Godin on 9/27/2019.
 */
public final class HorizontalLayout extends VuetifyElement<HorizontalLayout> implements HasChildElements<HorizontalLayout, Element<?>> {
    private final Container.Row row = new Container.Row();

    public HorizontalLayout() {
        super(Container.class);
    }

    public HorizontalLayout(Element... elements) {
        this();
        add(elements);
    }

    @Override
    public final HorizontalLayout add(Element... elements) {
        for (Element element : elements) {
            children().add(new Container.Col(element).key(element.getKey()), this);
        }
        return this;
    }

    @Override
    public final HorizontalLayout insert(Element<?>... elements) {
        int pos = 0;
        for (Element element : elements) {
            children().insertAt(pos, new Container.Row(new Container.Col(element)).key(element.getKey()), this);
            pos++;
        }
        return this;
    }

    @Override
    public final HorizontalLayout remove(Element... elements) {
        for (Element element : elements) {
            children().removeByKey(element.getKey());
        }
        return this;
    }

    @Override
    public final HorizontalLayout removeByKey(String... keys) {
        for (String key : keys) {
            children().removeByKey(key);
        }
        return this;
    }

    @Override
    public final HorizontalLayout removeAll() {
        children().removeAll();
        return this;
    }

    @Override
    public final HorizontalLayout setText(String text) {
        return removeAll().add(new Text(text));
    }

}
