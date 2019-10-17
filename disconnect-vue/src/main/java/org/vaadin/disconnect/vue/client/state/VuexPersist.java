package org.vaadin.disconnect.vue.client.state;

import org.apache.commons.lang3.StringUtils;
import org.teavm.jso.JSBody;
import org.teavm.jso.JSFunctor;
import org.teavm.jso.JSObject;
import org.teavm.jso.JSProperty;
import org.teavm.jso.browser.Window;
import org.teavm.jso.core.JSArray;
import org.teavm.jso.core.JSObjects;
import org.teavm.jso.core.JSString;
import org.teavm.platform.Platform;
import org.vaadin.disconnect.core.annotations.ImportObject;
import org.vaadin.disconnect.core.annotations.NpmPackage;
import org.vaadin.disconnect.core.client.Convert;
import org.vaadin.disconnect.core.client.internals.DisconnectUtils;
import org.vaadin.disconnect.vue.client.internals.ComponentInstance;
import org.vaadin.disconnect.vue.client.internals.StoreDefinition;
import org.vaadin.disconnect.vue.client.internals.StoreInstance;
import org.vaadin.disconnect.vue.client.ui.Vue;

import java.io.Serializable;

/**
 * Created by Artem Godin on 8/14/2019.
 */
@NpmPackage(name = "vuex-persist")
public abstract class VuexPersist implements JSObject {
    @ImportObject(module = "vuex-persist")
    private static VuexPersist INSTANCE;

    public static JSObject of(SaveStateFunction saveStateFunction, RestoreStateFunction restoreStateFunction) {
        return of(INSTANCE, saveStateFunction, restoreStateFunction);
    }

    @JSBody(params = {"instance", "saveStateFunction", "restoreStateFunction"}, script = "return new instance({saveState:saveStateFunction, restoreState:restoreStateFunction});")
    private static native JSObject of(VuexPersist instance, SaveStateFunction saveStateFunction, RestoreStateFunction restoreStateFunction);

    public static <T extends Serializable> void saveStateToLS(JSString key, JSObject state, JSObject storage, Class<T> clazz) {
        String decodedKey = key.stringValue();
        T value = DisconnectUtils.asJavaObject(state);
        Window.current().getLocalStorage().setItem(decodedKey, Convert.toString(value));
    }

    public static <T extends Serializable> JSObject restoreStateFromLS(JSString key, JSObject storage, Class<T> clazz) {
        String decodedKey = key.stringValue();
        T value = Convert.toSerializable(Window.current().getLocalStorage().getItem(decodedKey), clazz);

        return DisconnectUtils.asJsObject(value);
    }

    @JSFunctor
    public interface RestoreStateFunction extends JSObject {
        JSObject restoreState(JSString key, JSObject storage);
    }

    @JSFunctor
    public interface SaveStateFunction extends JSObject {
        void saveState(JSString key, JSObject state, JSObject storage);
    }
}
