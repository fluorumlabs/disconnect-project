package org.vaadin.disconnect.vuetify.theme;

/**
 * Created by Artem Godin on 10/17/2019.
 */
public enum MaterialColor implements ThemeColor {
    RED, PINK, PURPLE, DEEP_PURPLE, INDIGO, BLUE,
    LIGHT_BLUE, CYAN, TEAL, GREEN, LIGHT_GREEN,
    LIME, YELLOW, AMBER, ORANGE, DEEP_ORANGE,
    BROWN, BLUE_GREY, GREY, BLACK, WHITE, TRANSPARENT;

    public Color accent(int val) {
        return Color.of(this.value().stringValue() + " accent-" + val);
    }
}
