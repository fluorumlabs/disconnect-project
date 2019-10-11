package org.vaadin.disconnect.vue.client.internals;

import org.teavm.jso.JSBody;
import org.teavm.jso.JSByRef;
import org.teavm.jso.JSFunctor;
import org.teavm.jso.JSObject;
import org.teavm.jso.core.JSFunction;
import org.vaadin.disconnect.vue.client.router.Route;
import org.vaadin.disconnect.vue.client.router.RouteRecord;

/**
 * Created by Artem Godin on 9/20/2019.
 */
public interface RouterInstance extends JSObject {
    @JSBody(params = "routes", script = "this.addRoutes(routes)")
    void addRoutes(@JSByRef RouteRecord... routes);

    @JSBody(params = "guard", script = "this.beforeHooks.push(guard)")
    void setBeforeHook(RouterGuard guard);

    @JSBody(params = "guard", script = "this.afterHooks.push(guard)")
    void setAfterHook(RouterGuard guard);

    @JSFunctor
    interface RouterGuard extends JSObject {
        void hook(Route to, Route from, JSFunction next);
    }
}
