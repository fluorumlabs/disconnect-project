package org.vaadin.disconnect.vue.client.ui;

import org.teavm.jso.JSBody;
import org.teavm.jso.JSObject;
import org.vaadin.disconnect.core.annotations.ImportObject;
import org.vaadin.disconnect.core.annotations.NpmPackage;
import org.vaadin.disconnect.vue.client.internals.ComponentDefinition;
import org.vaadin.disconnect.vue.client.internals.ComponentInstance;

/**
 * Created by Artem Godin on 8/14/2019.
 */
@NpmPackage(name = "vue")
public abstract class Vue implements JSObject {
    @ImportObject(module = "vue")
    private static Vue INSTANCE;

    @JSBody(params = {"instance", "definition"},
            script = "return new instance(definition)")
    private static native ComponentInstance createComponent(Vue instance, ComponentDefinition definition);

    @JSBody(params = {"instance", "plugin"}, script = "instance.use(plugin);")
    private static native void use(Vue instance, JSObject plugin);

    public static void use(JSObject plugin) {
        use(INSTANCE, plugin);
    }

    public static ComponentInstance createComponent(ComponentDefinition definition) {

        return createComponent(INSTANCE, definition);
    }
}
