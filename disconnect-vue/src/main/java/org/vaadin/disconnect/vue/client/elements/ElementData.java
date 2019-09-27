package org.vaadin.disconnect.vue.client.elements;

import org.teavm.jso.*;
import org.teavm.jso.core.JSArray;
import org.teavm.jso.dom.events.Event;
import org.teavm.vm.spi.RendererListener;
import org.vaadin.disconnect.vue.client.Directive;
import org.vaadin.disconnect.vue.client.events.EventListener;
import org.vaadin.disconnect.vue.client.events.NativeEventListener;
import org.vaadin.disconnect.vue.client.events.VoidEventListener;
import org.vaadin.disconnect.vue.client.utils.EnumeratedString;

/**
 * Created by Artem Godin on 9/26/2019.
 */
public interface ElementData extends JSObject {

    @JSBody(script = "this.class = this.class||{}; return this.class;")
    Classes classes();

    @JSBody(script = "this.style = this.style||{}; return this.style;")
    Styles styles();

    @JSBody(script = "this.attrs = this.attrs||{}; return this.attrs;")
    Attributes attributes();

    @JSBody(script = "this.props = this.props||{}; return this.props;")
    Properties properties();

    @JSBody(script = "this.domProps = this.domProps||{}; return this.domProps;")
    Properties domProperties();

    @JSBody(script = "this.on = this.on||{}; return this.on;")
    EventListeners eventListeners();

    @JSBody(script = "this.nativeOn = this.nativeOn||{}; return this.nativeOn;")
    NativeEventListeners nativeEventListeners();

    @JSBody(script = "this.beforeRender = this.beforeRender||{}; return this.beforeRender;")
    RenderListeners renderListeners();

    @JSBody(script = "this.directives = this.directives||[]; return this.directives;")
    JSArray<Directive> directives();

    @JSProperty
    void setSlot(String slot);

    @JSProperty
    void setKey(String slot);

    @JSProperty
    void setRef(String slot);

    @JSProperty
    String getKey();

    @JSProperty
    String getRef();

    interface Classes extends JSObject {
        @JSIndexer
        void set(String key, boolean object);
    }

    interface Styles extends JSObject {
        @JSIndexer
        void set(String key, String value);
    }

    interface Attributes extends JSObject {
        @JSIndexer
        void set(String key, String value);

        @JSIndexer
        void set(String key, boolean value);
    }

    interface Properties extends JSObject {
        @JSIndexer
        void set(String key, String value);

        @JSIndexer
        void set(String key, String[] value);

        @JSIndexer
        void set(String key, boolean value);

        @JSIndexer
        void set(String key, boolean[] value);

        @JSIndexer
        void set(String key, int value);

        @JSIndexer
        void set(String key, int[] value);

        @JSIndexer
        void set(String key, double value);

        @JSIndexer
        void set(String key, double[] value);

        @JSIndexer
        void set(String key, JSObject value);

        @JSIndexer
        void set(String key, JSObject[] value);

        default void set(String key, EnumeratedString value) {
            set(key, value.value());
        }
    }

    interface EventListeners extends JSObject {
        @JSBody(params = {"type", "listener"}, script = "this[type] = $rtd_wrapThread(listener);")
        void set(String type, VoidEventListener listener);

        @JSBody(params = {"type", "listener"}, script = "this[type] = $rtd_wrapThread(listener);")
        void set(String type, EventListener<?> listener);

        @JSBody(params = "type", script = "delete this[type];")
        void remove(String type);
    }

    interface NativeEventListeners extends JSObject {
        @JSBody(params = {"type", "listener"}, script = "this[type] = $rtd_wrapThread(listener);")
        void set(String type, NativeEventListener<?> listener);

        @JSBody(params = "type", script = "delete this[type];")
        void remove(String type);
    }

    interface RenderListeners extends JSObject {
        @JSBody(params = {"type", "listener"}, script = "this[type] = listener;")
        void set(String type, RenderListener listener);

        @JSBody(params = "type", script = "delete this[type];")
        void remove(String type);
    }

    @JSFunctor
    interface RenderListener extends JSObject {
        void beforeRender();
    }

}
