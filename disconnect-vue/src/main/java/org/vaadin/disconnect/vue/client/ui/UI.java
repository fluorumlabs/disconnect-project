package org.vaadin.disconnect.vue.client.ui;

import org.teavm.jso.JSObject;
import org.teavm.jso.dom.html.HTMLDocument;
import org.vaadin.disconnect.vue.client.internals.ComponentDefinition;
import org.vaadin.disconnect.vue.client.internals.ComponentDefinitionAccessor;
import org.vaadin.disconnect.vue.client.router.VueRouter;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Artem Godin on 9/20/2019.
 */
public class UI {
    private static final Map<String, JSObject> extraConfiguration = new HashMap<>();

    public static void addConfiguration(String key, JSObject configuration) {
        extraConfiguration.put(key, configuration);
    }

    public static void run(Class<? extends Component> component) {
        run(ComponentDefinitionAccessor.getComponentDefinition(component));
    }

    public static void run(ComponentDefinition component) {
        addConfiguration("router", VueRouter.getRouterInstance());

        ComponentDefinition componentDefinition = component.clone();

        for (Map.Entry<String, JSObject> stringJSObjectEntry : extraConfiguration.entrySet()) {
            componentDefinition.addConfiguration(stringJSObjectEntry.getKey(), stringJSObjectEntry.getValue());
        }

        HTMLDocument.current().getBody().appendChild(Vue.createComponent(componentDefinition).mount());
    }
}
