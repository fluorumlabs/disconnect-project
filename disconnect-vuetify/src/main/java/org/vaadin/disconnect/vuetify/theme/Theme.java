package org.vaadin.disconnect.vuetify.theme;

import org.teavm.jso.JSIndexer;
import org.teavm.jso.JSObject;
import org.teavm.jso.core.JSObjects;
import org.teavm.jso.core.JSString;

/**
 * Created by Artem Godin on 10/18/2019.
 */
public abstract class Theme implements JSObject {
    @JSIndexer
    private native void set(JSString key, JSObject value);

    @JSIndexer
    private native void set(String key, JSObject value);

    @JSIndexer
    private native JSObject get(JSString key);

    @JSIndexer
    private native JSObject get(String key);

    public ThemeColorVariants build(ThemeColor color) {
        ThemeColorVariants themeColor = JSObjects.create();
        set(color.value(), themeColor);
        return themeColor;
    }

    public void define(ThemeColor color, CssColor cssColor) {
        set(color.value(), cssColor.value());
    }

    public void define(ThemeColor color, String cssColor) {
        set(color.value(), JSString.valueOf(cssColor));
    }

    public void alias(ThemeColor color, Color aliasTo) {
        set(color.value(), get(aliasTo.value()));
    }

    public ThemeColorVariants build(String customColor) {
        ThemeColorVariants themeColor = JSObjects.create();
        set(customColor, themeColor);
        return themeColor;
    }

    public abstract class ThemeColorVariants implements JSObject {
        @JSIndexer
        private native void set(String key, String value);

        public ThemeColorVariants base(CssColor color) {
            return base(color.value().stringValue());
        }

        public ThemeColorVariants darken(int darken, CssColor color) {
            return darken(darken, color.value().stringValue());
        }

        public ThemeColorVariants lighten(int lighten, CssColor color) {
            return lighten(lighten, color.value().stringValue());
        }

        public ThemeColorVariants base(String color) {
            set("base", color);
            return this;
        }

        public ThemeColorVariants darken(int darken, String color) {
            set("darken" + darken, color);
            return this;
        }

        public ThemeColorVariants lighten(int darken, String color) {
            set("lighten" + darken, color);
            return this;
        }
    }


}
