package com.github.fluorumlabs.disconnect.vue.client;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.vue.client.internals.RenderFunction;
import org.teavm.jso.JSBody;
import org.teavm.jso.JSObject;
import org.teavm.platform.Platform;
import org.teavm.platform.PlatformObject;

/**
 * Created by Artem Godin on 8/15/2019.
 */
@Import(symbols = "renderElementPrototype", module = "./disconnect-vue/render-elementprototype.js", object = true)
public abstract class VueComponentJSObject implements JSObject {
    @JSBody(script = "return this.$options.data")
    public native JSObject getModel();

    @JSBody(params = "model", script = "this.$options.data = model")
    public native void setModel(JSObject model);

    @JSBody(params = "instance", script = "this.$$java_instance = instance")
    private native void setVueComponent(PlatformObject instance);

    public void setVueComponent(VueComponent instance) {
        setVueComponent(Platform.getPlatformObject(instance));
    }

    @JSBody(params = {"name", "method"}, script = "this.$options.methods[name] = method")
    public native void registerMethod(String name, VueComponent.VoidVarArgs method);

    @JSBody(params = {"renderer"}, script = "this.$options.render = function (createElement) {\n" +
            "    return renderElementPrototype(createElement, renderer());\n" +
            "}")
    public native void registerRender(RenderFunction renderer);

    public void clear(String key) {
        setNative(key, null);
    }

    @JSBody(params = {"name", "value"}, script = "this.$options.data[name] = value")
    public native void setNative(String name, JSObject value);

    @JSBody(params = {"name"}, script = "return this.$options.data[name]")
    public native JSObject getNative(String name);

    //@JSBody(params = {"name", "method"}, script = "this.$options.methods[name] = method")
    //public native void registerMethod(String name, VueComponent.Void1Args method);
}
