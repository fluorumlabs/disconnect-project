package org.vaadin.disconnect.vuetify.elements.bars;

import org.vaadin.disconnect.vue.annotations.ImportComponent;
import org.vaadin.disconnect.vue.client.elements.Element;
import org.vaadin.disconnect.vue.client.elements.HasChildElements;
import org.vaadin.disconnect.vuetify.elements.VuetifyElement;

/**
 * Created by Artem Godin on 9/25/2019.
 */
@ImportComponent(symbol = "VToolbarItems", module = "vuetify/lib/components/VToolbar")
public final class ToolbarItems extends VuetifyElement<ToolbarItems> implements HasChildElements<ToolbarItems, Element<?>> {
    public ToolbarItems() {
        super(ToolbarItems.class);
    }
}
