package org.vaadin.disconnect.vuetify.theme;

import org.teavm.jso.core.JSString;
import org.vaadin.disconnect.vue.client.utils.EnumeratedString;

/**
 * Created by Artem Godin on 10/17/2019.
 */
public interface Color extends EnumeratedString {
    static Color of(String color) {
        return new RawColor(color);
    }

    static Color of(String color, String modifier) {
        return new RawColor(color, modifier);
    }

    class RawColor implements Color {
        private final String color;
        private final String modifier;

        @Override
        public String name() {
            return color;
        }

        public String modifier() {
            return modifier;
        }

        @Override
        public JSString value() {
            return JSString.valueOf(modifier.isEmpty() ? color : (color + " " + modifier));
        }

        private RawColor(String color) {
            this(color, "");
        }

        private RawColor(String color, String modifier) {
            this.color = color;
            this.modifier = modifier;
        }
    }

}
