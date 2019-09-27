package org.vaadin.disconnect.vuetify.elements;

import org.vaadin.disconnect.vue.annotations.ImportComponent;

/**
 * Created by Artem Godin on 9/25/2019.
 */
@ImportComponent(module = "vuetify/lib/components/VBottomNavigation")
public final class BottomNavigation extends VuetifyElement<BottomNavigation> implements
    HasTheme<BottomNavigation>
{
    public BottomNavigation() {
        super(BottomNavigation.class);
    }

    public BottomNavigation setApplicationShell() {
        data().properties().set("app", true);
        return this;
    }
}
