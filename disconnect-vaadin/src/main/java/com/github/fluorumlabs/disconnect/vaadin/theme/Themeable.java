package com.github.fluorumlabs.disconnect.vaadin.theme;

import com.github.fluorumlabs.disconnect.core.components.HasElement;
import js.lang.JsString;
import js.util.collections.Array;
import js.web.dom.Element;

/**
 * Created by Artem Godin on 6/29/2020.
 */
public interface Themeable<VARIANT extends ThemeVariant, ELEMENT extends Element> extends HasElement<ELEMENT> {
    default void setTheme(VARIANT theme) {
        setTheme(theme, true);
    }

    default void setTheme(VARIANT... themes) {
        for (VARIANT theme : themes) {
            setTheme(theme, true);
        }
    }

    default void setTheme(VARIANT theme, boolean enable) {
        setTheme(getElement(), theme, enable);
    }

    default boolean hasTheme(VARIANT theme) {
        return hasTheme(getElement(), theme);
    }

    static void setTheme(Element element, ThemeVariant theme, boolean enable) {
        String currentTheme = element.getAttribute("theme");

        Array<JsString> tokens = currentTheme == null ? Array.create() : JsString.of(currentTheme).split(" ");
        int index = tokens.indexOf(theme.cast());
        if (index >= 0 != enable) {
            if (enable) {
                tokens.push(theme.cast());
            } else {
                tokens.splice(index, 1);
            }
        }

        element.setAttribute("theme", tokens.join(" "));
    }

    static boolean hasTheme(Element element, ThemeVariant theme) {
        String currentTheme = element.getAttribute("theme");
        if (currentTheme == null) {
            return false;
        }

        int index = JsString.of(currentTheme).split(" ").indexOf(theme.cast());

        return index >= 0;
    }
}
