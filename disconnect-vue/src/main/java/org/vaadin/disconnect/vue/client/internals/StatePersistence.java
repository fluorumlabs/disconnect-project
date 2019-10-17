package org.vaadin.disconnect.vue.client.internals;

import org.teavm.jso.JSBody;
import org.teavm.jso.JSObject;
import org.teavm.jso.JSProperty;
import org.teavm.jso.browser.Storage;
import org.teavm.jso.browser.Window;
import org.teavm.jso.json.JSON;
import org.teavm.metaprogramming.CompileTime;
import org.teavm.metaprogramming.Meta;
import org.teavm.metaprogramming.ReflectClass;
import org.teavm.metaprogramming.reflect.ReflectField;
import org.vaadin.disconnect.core.client.Convert;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

import static org.teavm.metaprogramming.Metaprogramming.exit;

/**
 * Created by Artem Godin on 10/17/2019.
 */
@CompileTime
public class StatePersistence {
    private static final Map<String,Integer> DEBOUNCERS = new HashMap<>();

    public static <T extends Serializable> T read(Class<T> clazz, String key) {
        String value = Window.current().getLocalStorage().getItem(key);
        if ( value == null ) {
            return null;
        }
        PersistedState object = JSON.parse(value).cast();
        String expectedUID = getSerialVersionUID(clazz);
        String actualUID = object.getSerialVersionUID();

        if ( !expectedUID.equals(actualUID)) {
            Window.current().getLocalStorage().removeItem(key);
            return null;
        }

        object.removeSerialVersionUID();
        return Convert.toSerializable(object, clazz);
    }

    public static <T extends Serializable> void write(Class<T> clazz, String key, T value) {
        Integer timeoutId = DEBOUNCERS.get(key);
        if (timeoutId != null) {
            Window.clearTimeout(timeoutId);
        }
        DEBOUNCERS.put(key, Window.setTimeout(() -> writeDebounced(clazz, key, value), 200));
    }

    private static <T extends Serializable> void writeDebounced(Class<T> clazz, String key, T value) {
        PersistedState object = Convert.toJSObject(value).cast();
        object.setSerialVersionUID(getSerialVersionUID(clazz));

        Window.current().getLocalStorage().setItem(key, JSON.stringify(object));
    }

    @Meta
    public static native String getSerialVersionUID(Class<? extends Serializable> clazz);
    public static void getSerialVersionUID(ReflectClass<? extends Serializable> clazz) {
        ReflectField serialVersionUID = clazz.getDeclaredField("serialVersionUID");
        if (serialVersionUID != null) {
            exit(() -> Long.toString((Long) serialVersionUID.get(null)));
        } else {
            String randomKey = Long.toString(new Random().nextLong());
            exit(() -> randomKey);
        }
    }

    private interface PersistedState extends JSObject {
        @JSProperty
        String getSerialVersionUID();
        @JSProperty
        void setSerialVersionUID(String uid);
        @JSBody(script = "delete this.serialVersionUID")
        void removeSerialVersionUID();
    }
}
