package org.vaadin.disconnect.vue.client.router;

import org.teavm.jso.JSBody;
import org.teavm.jso.JSByRef;
import org.teavm.jso.JSObject;
import org.vaadin.disconnect.core.annotations.ImportObject;
import org.vaadin.disconnect.core.annotations.NpmPackage;
import org.vaadin.disconnect.vue.client.internals.*;
import org.vaadin.disconnect.vue.client.ui.Vue;

/**
 * Created by Artem Godin on 8/14/2019.
 */
@NpmPackage(name = "vue-router")
public abstract class VueRouter implements JSObject {
    @ImportObject(module = "vue-router")
    private static VueRouter INSTANCE;

    static {
        createRouter(getRouteConfiguration());
    }

    private static RouterInstance routerInstance;

    @JSBody(params = {"instance", "_routes"},
            script = "window.DisconnectRouter = new instance({mode:'history', routes:_routes}); return window.DisconnectRouter;")
    private static native RouterInstance createRouter(VueRouter instance, @JSByRef RouteRecord[] _routes);

    private static void createRouter(RouteRecord[] routes) {
        Vue.use(INSTANCE);

        routerInstance = createRouter(INSTANCE, routes);
    }

    private static RouteRecord[] getRouteConfiguration() {
        return null;
    }

    public static RouterInstance getRouterInstance() {
        return routerInstance;
    }

    public static void rerouteTo(String path) {
    }

    public static void abortNavigation() {
    }
}
