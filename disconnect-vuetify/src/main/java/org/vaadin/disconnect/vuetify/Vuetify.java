package org.vaadin.disconnect.vuetify;

import org.teavm.jso.JSBody;
import org.teavm.jso.JSObject;
import org.vaadin.disconnect.core.annotations.Import;
import org.vaadin.disconnect.core.annotations.ImportObject;
import org.vaadin.disconnect.core.annotations.NpmPackage;
import org.vaadin.disconnect.vue.client.ui.Vue;

/**
 * Created by Artem Godin on 9/25/2019.
 */
@NpmPackage(name = "vuetify")
@NpmPackage(name = "@mdi/font")
@Import(module = "@mdi/font/css/materialdesignicons.css")
public abstract class Vuetify {
    @ImportObject(module = "vuetify/lib/framework")
    private static JSObject INSTANCE;

    private static VuetifyConfiguration vuetifyConfiguration;

    static {
        Vue.use(INSTANCE);
    }

    public static JSObject configure(VuetifyConfiguration configuration) {
        vuetifyConfiguration = configuration;
        return createInstance(INSTANCE, configuration);
    }

    public static void useDarkTheme(boolean dark) {
        if (dark) {
            vuetifyConfiguration.useDarkTheme();
        } else {
            vuetifyConfiguration.useLightTheme();
        }
    }

    @JSBody(params = {"instance", "configuration"}, script = "return new instance(configuration)")
    private static native JSObject createInstance(JSObject instance, VuetifyConfiguration configuration);

}
