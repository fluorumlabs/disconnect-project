package org.vaadin.disconnect.vuetify.elements;

import org.vaadin.disconnect.vue.client.elements.ElementBase;
import org.vaadin.disconnect.vuetify.theme.Color;

/**
 * Created by Artem Godin on 9/26/2019.
 */
public interface HasTheme<T extends HasTheme<T>> extends ElementBase {
    default T useDarkTheme(boolean dark) {
        data().properties().set("dark", dark);
        data().properties().set("light", !dark);
        return (T) this;
    }

    default T useLightTheme(boolean light) {
        data().properties().set("dark", !light);
        data().properties().set("light", light);
        return (T) this;
    }

    default T useDarkTheme() {
        return useDarkTheme(true);
    }

    default T useLightTheme() {
        return useLightTheme(true);
    }
}
