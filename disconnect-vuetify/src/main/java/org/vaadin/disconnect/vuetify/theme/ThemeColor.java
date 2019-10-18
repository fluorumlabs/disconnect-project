package org.vaadin.disconnect.vuetify.theme;

/**
 * Created by Artem Godin on 10/18/2019.
 */
public interface ThemeColor extends Color {
    default Color lighten(int val) {
        return Color.of(this.value().stringValue(), "lighten-" + val);
    }

    default Color darken(int val) {
        return Color.of(this.value().stringValue(), "darken-" + val);
    }
}
