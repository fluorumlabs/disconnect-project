package org.vaadin.disconnect.vuetify.elements.bars;

import org.vaadin.disconnect.vue.annotations.ImportComponent;
import org.vaadin.disconnect.vuetify.elements.HasColor;
import org.vaadin.disconnect.vuetify.elements.HasTheme;
import org.vaadin.disconnect.vuetify.elements.VuetifyElement;

/**
 * Created by Artem Godin on 9/25/2019.
 */
@ImportComponent(symbol = "VToolbar", module = "vuetify/lib/components/VToolbar")
public final class Toolbar extends VuetifyElement<Toolbar> implements
        HasTheme<Toolbar>,
        HasColor<Toolbar> {
    public Toolbar() {
        super(Toolbar.class);
    }
}
