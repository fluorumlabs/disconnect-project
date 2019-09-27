package org.vaadin.disconnect.vuetify.elements;

import org.vaadin.disconnect.core.annotations.ImportObject;
import org.vaadin.disconnect.vue.annotations.ImportComponent;
import org.vaadin.disconnect.vue.client.elements.*;
import org.vaadin.disconnect.vue.client.internals.ComponentDefinition;

/**
 * Created by Artem Godin on 9/25/2019.
 */
@ImportComponent(module = "vuetify/lib/components/VContent")
public final class Content extends Element<Content> implements HasChildElements<Content, Element<?>> {
    public Content() {
        super(Content.class);
    }
}
