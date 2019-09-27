package org.vaadin.disconnect.vuetify.elements.bars;

import org.vaadin.disconnect.vue.annotations.ImportComponent;
import org.vaadin.disconnect.vue.client.elements.*;
import org.vaadin.disconnect.vuetify.elements.VuetifyElement;

/**
 * Created by Artem Godin on 9/25/2019.
 */
@ImportComponent(symbol = "VToolbarTitle", module = "vuetify/lib/components/VToolbar")
public final class ToolbarTitle extends VuetifyElement<ToolbarTitle> implements HasChildElements<ToolbarTitle, Element<?>> {
    public ToolbarTitle() {
        super(ToolbarTitle.class);
    }

    public ToolbarTitle(String title) {
        this();
        setText(title);
    }
}
