package org.vaadin.disconnect.vuetify.elements;

import org.vaadin.disconnect.vue.annotations.ImportComponent;

/**
 * Created by Artem Godin on 9/25/2019.
 */
@ImportComponent(module = "vuetify/lib/components/VSystemBar")
public final class SystemBar extends VuetifyElement<SystemBar> implements
        HasTheme<SystemBar>,
        HasColor<SystemBar> {

    public SystemBar() {
        super(NavigationDrawer.class);
    }

    public SystemBar setApplicationShell() {
        data().properties().set("app", true);
        return this;
    }
}
