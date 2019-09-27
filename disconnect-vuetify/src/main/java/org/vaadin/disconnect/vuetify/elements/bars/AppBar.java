package org.vaadin.disconnect.vuetify.elements.bars;

import org.vaadin.disconnect.vue.annotations.ImportComponent;
import org.vaadin.disconnect.vue.client.elements.Element;
import org.vaadin.disconnect.vue.client.elements.HasChildElements;
import org.vaadin.disconnect.vuetify.elements.HasTheme;
import org.vaadin.disconnect.vuetify.elements.VuetifyElement;

/**
 * Created by Artem Godin on 9/25/2019.
 */
@ImportComponent(symbol = "VAppBar", module = "vuetify/lib/components/VAppBar")
public final class AppBar extends VuetifyElement<AppBar> implements HasTheme<AppBar>, HasChildElements<AppBar, Element<?>> {
    public AppBar() {
        super(AppBar.class);
    }

    public AppBar(Element...elements) {
        this();
        add(elements);
    }

    public AppBar setApplicationShell() {
        data().properties().set("app", true);
        return this;
    }
}
