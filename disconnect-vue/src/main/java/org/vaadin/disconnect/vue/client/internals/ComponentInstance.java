package org.vaadin.disconnect.vue.client.internals;

import org.teavm.jso.JSBody;
import org.teavm.jso.JSFunctor;
import org.teavm.jso.JSIndexer;
import org.teavm.jso.JSObject;
import org.teavm.jso.dom.html.HTMLElement;
import org.teavm.platform.PlatformObject;
import org.vaadin.disconnect.core.annotations.Import;
import org.vaadin.disconnect.vue.client.router.Route;

/**
 * Created by Artem Godin on 9/20/2019.
 */
@Import(symbols = "renderElementPrototype", module = "disconnect-vue-jar/frontend/render-elementprototype.js", defaultExport = true)
public abstract class ComponentInstance implements JSObject {
    @JSBody(params = "instance", script = "this.$options.data = function() { return instance };")
    public native void setJavaInstance(JSObject instance);

    @JSBody(params = "rf", script = "var that = this;\n" +
            "this.$options.render = function(h) {\n" +
            "    that.$$marker = 1;\n" +
            "    let result = renderElementPrototype(h, rf());\n" +
            "    that.$$marker = 0;\n" +
            "    return result; \n" +
            "};")
    public native void setRenderMethod(RenderFunction rf);

    @JSBody(script = "this.$mount(); return this.$el;")
    public native HTMLElement mount();

    @JSBody(script = "this.$forceUpdate();")
    public native void forceUpdate();

    @JSBody(params = {"callback", "callbackFunction"}, script = "this['__'+callback] = callbackFunction;")
    public native void registerCallback(String callback, VoidCallbackFunction callbackFunction);

    @JSIndexer
    public native void set(String name, JSObject value);

    @JSIndexer
    public native JSObject get(String name);

    public Route getRoute() {
        return get("$route").cast();
    }

    @JSBody(params = {"observeFunction", "computeFunction"}, script = "var that = this;\n" +
            "window.requestAnimationFrame(function() { that.$watch(observeFunction, $rtd_wrapThread.fn(computeFunction), { deep: true, immediate: true })});")
    public native void watch(ObserveFunction observeFunction, VoidCallbackFunction computeFunction);

    @JSFunctor
    public interface ObserveFunction extends JSObject {
        int observe();
    }

    @JSFunctor
    public interface CallbackFunction extends JSObject {
        void callback(JSObject object);
    }


    @JSFunctor
    public interface VoidCallbackFunction extends JSObject {
        void callback();
    }

    @JSFunctor
    public interface WatchFunction extends JSObject {
        int watch();
    }

    @JSFunctor
    public interface RenderFunction extends JSObject {
        PlatformObject render();
    }
}
