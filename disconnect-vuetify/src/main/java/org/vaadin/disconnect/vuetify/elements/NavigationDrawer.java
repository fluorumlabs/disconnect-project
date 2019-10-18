package org.vaadin.disconnect.vuetify.elements;

import org.vaadin.disconnect.vue.annotations.ImportComponent;

/**
 * Created by Artem Godin on 9/25/2019.
 */
@ImportComponent(module = "vuetify/lib/components/VNavigationDrawer")
public final class NavigationDrawer extends VuetifyElement<NavigationDrawer> implements
        HasTheme<NavigationDrawer>,
        HasColor<BottomNavigation>
{
    public NavigationDrawer() {
        super(NavigationDrawer.class);
    }

    public NavigationDrawer setApplicationShell() {
        data().properties().set("app", true);
        return this;
    }
}
