package com.github.fluorumlabs.disconnect.vue.client;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import com.github.fluorumlabs.disconnect.vue.client.internals.RenderFunction;
import org.teavm.jso.JSBody;
import org.teavm.jso.JSFunctor;
import org.teavm.jso.JSObject;
import org.teavm.jso.core.JSRegExp;

import java.util.function.Supplier;

/**
 * Created by Artem Godin on 8/14/2019.
 */
@NpmPackage(name = "vue", version = "2.6.10")
@Import(symbols = "Vue", module = "vue")
@Import(symbols = "renderElementPrototype", module = "./disconnect-vue/render-elementprototype.js", object = true)
public abstract class Vue implements JSObject {
    @JSBody(params = {"tagName", "definition"},
            script = "Vue.component(tagName, definition)")
    public static native void registerComponent(String tagName, VueComponentDefinition definition);

    @JSBody(params = {"tagName", "_template", "_beforeCreate"},
            script = "window.Disconnect = window.Disconnect || {};\n" +
                    "window.Disconnect[tagName] = Vue.component(tagName, { \n" +
                    "    template: _template,\n" +
                    "    data: function() { return {} },\n" +
                    "    methods: {},\n" +
                    "    beforeCreate: function() { _beforeCreate(this); } \n" +
                    "})")
    private static native void registerComponent(String tagName, String _template, Hook _beforeCreate);

    @JSBody(params = {"tagName", "_beforeCreate"},
            script = "window.Disconnect = window.Disconnect || {};\n" +
                    "window.Disconnect[tagName] = Vue.component(tagName, { \n" +
                    "    data: function() { return {} },\n" +
                    "    methods: {},\n" +
                    "    beforeCreate: function() { _beforeCreate(this); } \n" +
                    "})")
    private static native void registerComponent(String tagName, Hook _beforeCreate);

    public static void registerComponent(String tagName, String template, Supplier<VueComponent> instantiator) {
        registerComponent(tagName, template, (jsInstance -> {
            VueComponent.setJsInstanceThreadLocal(jsInstance);
            instantiator.get();
        }));
    }

    public static void registerComponent(String tagName, Supplier<VueComponent> instantiator) {
        registerComponent(tagName, (jsInstance -> {
            VueComponent.setJsInstanceThreadLocal(jsInstance);
            instantiator.get();
        }));
    }

    @JSBody(params = {"selector"},
            script = "new Vue({ el: selector })")
    public static native void run(String selector);

    @JSBody(params = {"selector", "renderFunction"}, script = "new Vue({ el: selector, render: function (createElement) {\n" +
            "    return renderElementPrototype(createElement, renderFunction());\n" +
            "}})")
    public static native void run(String selector, RenderFunction renderFunction);

    @JSBody(params = {"tagName"}, script = "Vue.config.ignoredElements = [...(Vue.config.ignoredElements||[]), tagName] ")
    public static native void registerWebComponent(String tagName);

    @JSBody(params = {"tagNames"}, script = "Vue.config.ignoredElements = [...(Vue.config.ignoredElements||[]), tagNames] ")
    public static native void registerWebComponents(JSRegExp tagNames);

    @JSFunctor
    private interface Hook extends JSObject {
        void run(VueComponentJSObject instance);
    }


}
