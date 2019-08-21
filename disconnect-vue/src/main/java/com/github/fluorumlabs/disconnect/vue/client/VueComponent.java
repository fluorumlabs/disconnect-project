package com.github.fluorumlabs.disconnect.vue.client;

import com.github.fluorumlabs.disconnect.vue.client.internals.RenderFunction;
import org.teavm.jso.JSFunctor;
import org.teavm.jso.JSObject;
import org.teavm.jso.core.JSFunction;
import org.teavm.jso.core.JSObjects;

import java.util.function.Supplier;

/**
 * Created by Artem Godin on 8/14/2019.
 */
public abstract class VueComponent<T extends VueComponentModel> {
    private static final ThreadLocal<VueComponentJSObject> jsInstanceThreadLocal = new ThreadLocal<>();
    private VueComponentJSObject jsInstance;
    private VueComponentModel model = null;

    public static void setJsInstanceThreadLocal(VueComponentJSObject jsInstance) {
        jsInstanceThreadLocal.set(jsInstance);
    }

    @SuppressWarnings("unchecked")
    protected VueComponent() {
        this.jsInstance = jsInstanceThreadLocal.get();
        jsInstance.setVueComponent(this);
        jsInstance.setModel(JSObjects.create());
        jsInstance.registerRender(this::render);
    }

    protected T getModel() {
        if (model == null) {
            model = createModel();
        }
        return (T) model;
    }

    protected abstract ElementPrototype render();

    protected VueComponentModel createModel() {
        return null;
    }

    public VueComponentJSObject getJsInstance() {
        return jsInstance;
    }

    public static void registerComponent(String tagName, String template, Supplier<VueComponent> component) {
        Vue.registerComponent(tagName, template, component);
    }

    public void clear(String key) {
        setNative(key, null);
    }

    public void setNative(String name, JSObject value) {
        jsInstance.setNative(name, value);
    }

    public JSObject getNative(String name) {
        return jsInstance.getNative(name);
    }

    @JSFunctor
    public interface VoidVarArgs extends JSObject {
        void run(JSObject[] args);
    }

}
