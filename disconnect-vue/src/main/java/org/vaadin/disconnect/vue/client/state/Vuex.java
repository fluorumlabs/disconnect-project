package org.vaadin.disconnect.vue.client.state;

import org.teavm.jso.JSBody;
import org.teavm.jso.JSObject;
import org.teavm.jso.core.JSArray;
import org.teavm.platform.Platform;
import org.teavm.platform.PlatformObject;
import org.vaadin.disconnect.core.annotations.ImportObject;
import org.vaadin.disconnect.core.annotations.NpmPackage;
import org.vaadin.disconnect.vue.client.internals.ComponentInstance;
import org.vaadin.disconnect.vue.client.internals.StoreDefinition;
import org.vaadin.disconnect.vue.client.internals.StoreInstance;
import org.vaadin.disconnect.vue.client.ui.Vue;

/**
 * Created by Artem Godin on 8/14/2019.
 */
@NpmPackage(name = "vuex")
public abstract class Vuex implements JSObject {
    @ImportObject(module = "vuex")
    private static Vuex INSTANCE;

    static {
        createEmptyStore();
    }

    private static StoreInstance store;

    @JSBody(params = {"instance"},
            script = "window.DisconnectStore = new instance.Store({modules:{__StatePlaceholder__:{state:{_dummy_:0}}}}); return window.DisconnectStore;")
    private static native StoreInstance createStore(Vuex instance);

    public static JSObject getState(String name) {
        return store.getState(name);
    }

    public static void registerModule(String name, StoreDefinition definition) {
        if (store.hasState("__StatePlaceholder__")) {
            store.unregisterModule("__StatePlaceholder__");
        }
        store.registerModule(name, definition);
    }

    private static void createEmptyStore() {
        Vue.use(INSTANCE);

        store = createStore(INSTANCE);
    }

    public static StoreInstance getStore() {
        return store;
    }

    @JSBody(params = {"store", "observeFunction", "computeFunction"}, script = "store.watch(observeFunction, $rtd_wrapThread(computeFunction), { deep: true, immediate: true })")
    private static native void watch(StoreInstance store, ComponentInstance.ObserveFunction observeFunction, ComponentInstance.CallbackFunction computeFunction);

    public static void watch(ComponentInstance.ObserveFunction observeFunction, ComponentInstance.CallbackFunction computeFunction) {
        watch(store, observeFunction, computeFunction);
    }

    public static JSArray<PlatformObject> convertPayload(Object... objects) {
        JSArray<PlatformObject> platformObjects = JSArray.create();
        for (Object object : objects) {
            platformObjects.push(Platform.getPlatformObject(object));
        }
        return platformObjects;
    }

    public static Object[] convertPayload(JSArray<PlatformObject> platformObjects) {
        Object[] objects = new Object[platformObjects.getLength()];

        for (int i = 0; i < platformObjects.getLength(); i++) {
            objects[i] = platformObjects.get(i);
        }

        return objects;
    }

    @JSBody(params = {"instance", "id", "payload"}, script = "instance.dispatch(id, payload)")
    private static native void dispatch(StoreInstance instance, String id, JSArray<PlatformObject> payload);

    public static void dispatch(String id, JSArray<PlatformObject> payload) {
        dispatch(store, id, payload);
    }

    @JSBody(params = {"instance", "id", "payload"}, script = "instance.commit(id, payload)")
    private static native void commit(StoreInstance instance, String id, JSArray<PlatformObject> payload);

    public static void commit(String id, JSArray<PlatformObject> payload) {
        commit(store, id, payload);
    }
}
