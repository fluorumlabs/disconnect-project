package org.vaadin.disconnect.vuetify.theme;

import org.teavm.jso.core.JSString;

/**
 * Created by Artem Godin on 10/17/2019.
 */
public class CssColor implements Color {
    static CssColor of(String color) {
        return new CssColor(color);
    }

    private String color;

    @Override
    public String name() {
        return color;
    }

    @Override
    public JSString value() {
        return JSString.valueOf(color);
    }

    private CssColor(String color) {
        this.color = color;
    }
}
