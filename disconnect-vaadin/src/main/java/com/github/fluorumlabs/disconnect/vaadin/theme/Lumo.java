package com.github.fluorumlabs.disconnect.vaadin.theme;

import com.github.fluorumlabs.disconnect.core.Application;
import com.github.fluorumlabs.disconnect.core.components.HasElement;
import js.extras.JsEnum;
import js.web.dom.Element;

import static js.web.dom.Window.DOCUMENT;

/**
 * Created by Artem Godin on 6/29/2020.
 */
public final class Lumo {
    private static boolean INITIALIZED = false;

    private Lumo() {
    }

    private static void init() {
        if (INITIALIZED) {
            return;
        }

        Application.render(new LumoStyles());
    }

    public static void useLightTheme(HasElement<? extends Element> component) {
        init();
        Themeable.setTheme(component.getElement(), Theme.DARK, false);
        Themeable.setTheme(component.getElement(), Theme.LIGHT, true);
    }

    public static void useDarkTheme(HasElement<? extends Element> component) {
        init();
        Themeable.setTheme(component.getElement(), Theme.DARK, true);
        Themeable.setTheme(component.getElement(), Theme.LIGHT, false);
    }

    public static void useLightTheme() {
        init();
        Themeable.setTheme(DOCUMENT.getFirstElementChild(), Theme.DARK, false);
        Themeable.setTheme(DOCUMENT.getFirstElementChild(), Theme.LIGHT, true);
    }

    public static void useDarkTheme() {
        init();
        Themeable.setTheme(DOCUMENT.getFirstElementChild(), Theme.DARK, true);
        Themeable.setTheme(DOCUMENT.getFirstElementChild(), Theme.LIGHT, false);
    }

    public static void useNormalFontSize() {
        init();
        Themeable.setTheme(DOCUMENT.getFirstElementChild(), Theme.FONT_SIZE_XS, false);
        Themeable.setTheme(DOCUMENT.getFirstElementChild(), Theme.FONT_SIZE_S, false);
    }

    public static void useSmallFontSize() {
        init();
        Themeable.setTheme(DOCUMENT.getFirstElementChild(), Theme.FONT_SIZE_XS, false);
        Themeable.setTheme(DOCUMENT.getFirstElementChild(), Theme.FONT_SIZE_S, true);
    }

    public static void useExtraSmallFontSize() {
        init();
        Themeable.setTheme(DOCUMENT.getFirstElementChild(), Theme.FONT_SIZE_XS, true);
        Themeable.setTheme(DOCUMENT.getFirstElementChild(), Theme.FONT_SIZE_S, false);
    }

    private abstract static class Theme extends ThemeVariant {
        public static final Theme DARK = JsEnum.of("dark");

        public static final Theme LIGHT = JsEnum.of("light");

        public static final Theme FONT_SIZE_XS = JsEnum.of("font-size-xs");

        public static final Theme FONT_SIZE_S = JsEnum.of("font-size-s");
    }
}
