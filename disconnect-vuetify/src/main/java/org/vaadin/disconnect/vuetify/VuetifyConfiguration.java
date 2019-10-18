package org.vaadin.disconnect.vuetify;

import org.teavm.jso.JSBody;
import org.teavm.jso.JSObject;
import org.teavm.jso.core.JSObjects;
import org.vaadin.disconnect.vuetify.theme.Theme;

/**
 * Created by Artem Godin on 9/26/2019.
 */
public abstract class VuetifyConfiguration implements JSObject {
    public static VuetifyConfiguration create() {
        return JSObjects.create();
    }

    @JSBody(params = {"name", "themeDefinition"}, script = "this.theme = this.theme || {};\n" +
            "this.theme.themes = this.theme.themes || {};\n" +
            "this.theme.themes[name] = themeDefinition;")
    private native void setTheme(String name, Theme themeDefinition);

    public Theme buildDarkTheme() {
        Theme theme = JSObjects.create();
        setTheme("dark", theme);
        return theme;
    }

    public Theme buildLightTheme() {
        Theme theme = JSObjects.create();
        setTheme("light", theme);
        return theme;
    }

    @JSBody(script = "this.theme = this.theme || {}; this.theme.dark = true; this.theme.light = false;")
    public native void useDarkTheme();

    @JSBody(script = "this.theme = this.theme || {}; this.theme.dark = false; this.theme.light = true;")
    public native void useLightTheme();
}
