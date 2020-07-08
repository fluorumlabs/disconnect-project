package com.github.fluorumlabs.disconnect.vaadin.theme;

import com.github.fluorumlabs.disconnect.core.components.HasElement;
import com.github.fluorumlabs.disconnect.core.utils.LowerCase;
import js.lang.JsString;
import js.util.collections.Array;
import js.web.dom.Element;

/**
 * Created by Artem Godin on 6/29/2020.
 */
public interface Themable<X extends Element> extends HasElement<X> {
    default void setTheme(ThemeVariant theme) {
        setTheme(theme, true);
    }

    default void setTheme(ThemeVariant... themes) {
        for (ThemeVariant theme : themes) {
            setTheme(theme, true);
        }
    }

    default void setTheme(ThemeVariant theme, boolean enable) {
        setTheme(getElement(), theme, enable);
    }

    default boolean hasTheme(ThemeVariant theme) {
        return hasTheme(getElement(), theme);
    }

    static <VARIANT extends ThemeVariant> void setTheme(Element element, VARIANT theme, boolean enable) {
        String currentTheme = element.getAttribute("theme");
        String themeValue = LowerCase.of((Enum<?>)theme);

        Array<JsString> tokens = currentTheme == null ? Array.create() : JsString.of(currentTheme).split(" ");
        int index = tokens.indexOf(JsString.of(themeValue));
        if (index >= 0 != enable) {
            if (enable) {
                tokens.push(JsString.of(themeValue));
            } else {
                tokens.splice(index, 1);
            }
        }

        element.setAttribute("theme", tokens.join(" "));
    }

    static <VARIANT extends ThemeVariant> boolean hasTheme(Element element, VARIANT theme) {
        String currentTheme = element.getAttribute("theme");
        String themeValue = LowerCase.of((Enum<?>)theme);
        if (currentTheme == null) {
            return false;
        }

        int index = JsString.of(currentTheme).split(" ").indexOf(JsString.of(themeValue));

        return index >= 0;
    }
}
