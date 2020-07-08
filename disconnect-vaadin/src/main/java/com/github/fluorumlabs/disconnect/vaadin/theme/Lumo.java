package com.github.fluorumlabs.disconnect.vaadin.theme;

import com.github.fluorumlabs.disconnect.core.Application;
import com.github.fluorumlabs.disconnect.vaadin.lumostyles.LumoStyles;

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

    public static void useLightTheme() {
        init();
        Themable.setTheme(DOCUMENT.getFirstElementChild(), Theme.DARK, false);
        Themable.setTheme(DOCUMENT.getFirstElementChild(), Theme.LIGHT, true);
    }

    public static void useDarkTheme() {
        init();
        Themable.setTheme(DOCUMENT.getFirstElementChild(), Theme.DARK, true);
        Themable.setTheme(DOCUMENT.getFirstElementChild(), Theme.LIGHT, false);
    }

    public static void useNormalFontSize() {
        init();
        Themable.setTheme(DOCUMENT.getFirstElementChild(), Theme.FONT_SIZE_XS, false);
        Themable.setTheme(DOCUMENT.getFirstElementChild(), Theme.FONT_SIZE_S, false);
    }

    public static void useSmallFontSize() {
        init();
        Themable.setTheme(DOCUMENT.getFirstElementChild(), Theme.FONT_SIZE_XS, false);
        Themable.setTheme(DOCUMENT.getFirstElementChild(), Theme.FONT_SIZE_S, true);
    }

    public static void useExtraSmallFontSize() {
        init();
        Themable.setTheme(DOCUMENT.getFirstElementChild(), Theme.FONT_SIZE_XS, true);
        Themable.setTheme(DOCUMENT.getFirstElementChild(), Theme.FONT_SIZE_S, false);
    }

    public enum Theme implements ThemeVariant {
        DARK, LIGHT, FONT_SIZE_XS, FONT_SIZE_S;

        static {
            init();
        }
    }
}
