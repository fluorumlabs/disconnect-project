package org.vaadin.disconnect.vuetify.theme;

/**
 * Created by Artem Godin on 10/17/2019.
 */
public enum MaterialColors implements Color {
    RED, PINK, PURPLE, DEEP_PURPLE, INDIGO, BLUE,
    LIGHT_BLUE, CYAN, TEAL, GREEN, LIGHT_GREEN,
    LIME, YELLOW, AMBER, ORANGE, DEEP_ORANGE,
    BROWN, BLUE_GREY, GREY, BLACK, WHITE, TRANSPARENT;

    public String lighten(int val) {
        return this.value().stringValue() + " lighten-" + val;
    }

    public String darken(int val) {
        return this.value().stringValue() + " darken-" + val;
    }

    public String accent(int val) {
        return this.value().stringValue() + " accent-" + val;
    }
}
