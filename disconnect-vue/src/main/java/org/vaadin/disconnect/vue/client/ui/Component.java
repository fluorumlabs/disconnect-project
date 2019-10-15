package org.vaadin.disconnect.vue.client.ui;

import org.teavm.jso.JSBody;
import org.teavm.jso.JSObject;
import org.teavm.jso.core.JSObjects;
import org.teavm.platform.Platform;
import org.teavm.platform.PlatformObject;
import org.vaadin.disconnect.core.client.Convert;
import org.vaadin.disconnect.core.client.internals.DisconnectUtils;
import org.vaadin.disconnect.vue.client.Observer;
import org.vaadin.disconnect.vue.client.WrappedSupplier;
import org.vaadin.disconnect.vue.client.elements.Element;
import org.vaadin.disconnect.vue.client.elements.Text;
import org.vaadin.disconnect.vue.client.internals.ComponentInstance;
import org.vaadin.disconnect.vue.client.router.Route;

import java.io.Serializable;
import java.util.function.Function;
import java.util.function.Supplier;

/**
 * Created by Artem Godin on 9/20/2019.
 */
public abstract class Component {
    private ComponentInstance instance;
    private Element content = new Text(""); // Create empty text node as a placeholder
    private int changeCounter = 0;

    public ComponentInstance getInstance() {
        return instance;
    }

    public Component() {
    }

    public void linkInstance(ComponentInstance instance) {
        instance.setJavaInstance(DisconnectUtils.asJsObject(this));
        instance.setRenderMethod(this::render);
        instance.registerCallback("created", () -> {
            this.instance = instance;
            setContent(init());
            created();
        });
        instance.registerCallback("beforeMount", this::beforeMount);
        instance.registerCallback("mounted", this::mounted);
        instance.registerCallback("beforeUpdate", this::beforeUpdate);
        instance.registerCallback("updated", this::updated);
        instance.registerCallback("activated", this::activated);
        instance.registerCallback("deactivated", this::deactivated);
        instance.registerCallback("beforeDestroy", this::beforeDestroy);
        instance.registerCallback("destroyed", this::destroyed);

        instance.registerCallback("beforeEnter", this::beforeRouteEnter);
    }

    private void beforeRouteEnter() {
        beforeEnter();
    }

    public void beforeEnter() {

    }

    public void created() {

    }

    public void beforeMount() {
    }

    public void mounted() {
    }

    public void beforeUpdate() {
    }

    public void updated() {
    }

    public void activated() {
    }

    public void deactivated() {
    }

    public void beforeDestroy() {
    }

    public void destroyed() {
        instance.setJavaInstance(null);
        instance = null;
    }

    public abstract Element init();

    public void setContent(Element content) {
        this.content = content;
        content.setParentComponent(this);
    }

    public Route getRoute() {
        return instance.get("$route").cast();
    }

    public final <V> Observer<V> observe(Supplier<V> getter) {
        Observer<V> observer = new Observer<>();
        WrappedSupplier<V> wrappedSupplier = WrappedSupplier.of(getter);
        instance.watch(wrappedSupplier::get, () -> observer.accept(wrappedSupplier.getValue()));
        return observer;
    }

    private PlatformObject render() {
        DisconnectUtils.ensure(changeCounter);
        return Platform.getPlatformObject(content);
    }

    public final void markAsDirty() {
        if (!Internals.isRendering(instance)) {
            changeCounter++;
        }
    }

    public static class Internals {

        @JSBody(params = {"component"}, script = "return component.$$marker && component.$$marker > 0")
        private static native boolean isRendering(JSObject component);

        private static <V> V getOrDefault(Supplier<JSObject> supplier, Function<JSObject,V> mapper, V defaultValue) {
            JSObject value = supplier.get();
            if (!JSObjects.isUndefined(value) && value!=null ) {
                return mapper.apply(value);
            } else {
                return defaultValue;
            }
        }

        public static <V> V getPropOrDefault(Component that, String name, Function<JSObject,V> mapper, V defaultValue) {
            return getOrDefault(() -> that.getInstance().get(name), mapper, defaultValue);
        }

        public static <V> V getRouteParamOrDefault(Component that, String name, Function<JSObject,V> mapper, V defaultValue) {
            return getOrDefault(() -> that.getInstance().getRoute().getParams().get(name), mapper, defaultValue);
        }

        public static <V> V getQueryParamOrDefault(Component that, String name, Function<JSObject,V> mapper, V defaultValue) {
            return getOrDefault(() -> that.getInstance().getRoute().getQuery().get(name), mapper, defaultValue);
        }

        public static String StringProp(Component that, String name) {
            return getPropOrDefault(that, name, Convert::toString, null);
        }

        public static int intProp(Component that, String name) {
            return getPropOrDefault(that, name, Convert::toInt, 0);
        }

        public static Integer IntegerProp(Component that, String name) {
            return getPropOrDefault(that, name, Convert::toInt, null);
        }

        public static boolean booleanProp(Component that, String name) {
            return getPropOrDefault(that, name, Convert::toBoolean, false);
        }

        public static Boolean BooleanProp(Component that, String name) {
            return getPropOrDefault(that, name, Convert::toBoolean, null);
        }

        public static byte byteProp(Component that, String name) {
            return getPropOrDefault(that, name, Convert::toByte, (byte)0);
        }

        public static Byte ByteProp(Component that, String name) {
            return getPropOrDefault(that, name, Convert::toByte, null);
        }

        public static char charProp(Component that, String name) {
            return getPropOrDefault(that, name, Convert::toChar, (char)0);
        }

        public static char CharacterProp(Component that, String name) {
            return getPropOrDefault(that, name, Convert::toChar, null);
        }

        public static short shortProp(Component that, String name) {
            return getPropOrDefault(that, name, Convert::toShort, (short)0);
        }

        public static Short ShortProp(Component that, String name) {
            return getPropOrDefault(that, name, Convert::toShort, null);
        }

        public static float floatProp(Component that, String name) {
            return getPropOrDefault(that, name, Convert::toFloat, 0.0f);
        }

        public static Float FloatProp(Component that, String name) {
            return getPropOrDefault(that, name, Convert::toFloat, null);
        }

        public static double doubleProp(Component that, String name) {
            return getPropOrDefault(that, name, Convert::toDouble, 0.0d);
        }

        public static Double DoubleProp(Component that, String name) {
            return getPropOrDefault(that, name, Convert::toDouble, null);
        }

        public static <T extends JSObject> T JSObjectProp(Component that, String name) {
            return that.getInstance().get(name).cast();
        }

        public static <T> T ObjectProp(Component that, String name) {
            return getPropOrDefault(that, name, DisconnectUtils::asJavaObject, null);
        }

        public static String StringRouteParam(Component that, String name) {
            return getRouteParamOrDefault(that, name, Convert::toString, null);
        }

        public static int intRouteParam(Component that, String name) {
            return getRouteParamOrDefault(that, name, Convert::toInt, 0);
        }

        public static Integer IntegerRouteParam(Component that, String name) {
            return getRouteParamOrDefault(that, name, Convert::toInt, null);
        }

        public static boolean booleanRouteParam(Component that, String name) {
            return getRouteParamOrDefault(that, name, Convert::toBoolean, false);
        }

        public static Boolean BooleanRouteParam(Component that, String name) {
            return getRouteParamOrDefault(that, name, Convert::toBoolean, null);
        }

        public static byte byteRouteParam(Component that, String name) {
            return getRouteParamOrDefault(that, name, Convert::toByte, (byte)0);
        }

        public static Byte ByteRouteParam(Component that, String name) {
            return getRouteParamOrDefault(that, name, Convert::toByte, null);
        }

        public static char charRouteParam(Component that, String name) {
            return getRouteParamOrDefault(that, name, Convert::toChar, (char)0);
        }

        public static char CharacterRouteParam(Component that, String name) {
            return getRouteParamOrDefault(that, name, Convert::toChar, null);
        }

        public static short shortRouteParam(Component that, String name) {
            return getRouteParamOrDefault(that, name, Convert::toShort, (short)0);
        }

        public static Short ShortRouteParam(Component that, String name) {
            return getRouteParamOrDefault(that, name, Convert::toShort, null);
        }

        public static float floatRouteParam(Component that, String name) {
            return getRouteParamOrDefault(that, name, Convert::toFloat, 0.0f);
        }

        public static Float FloatRouteParam(Component that, String name) {
            return getRouteParamOrDefault(that, name, Convert::toFloat, null);
        }

        public static double doubleRouteParam(Component that, String name) {
            return getRouteParamOrDefault(that, name, Convert::toDouble, 0.0d);
        }

        public static Double DoubleRouteParam(Component that, String name) {
            return getRouteParamOrDefault(that, name, Convert::toDouble, null);
        }

        public static String StringQueryParam(Component that, String name) {
            return getQueryParamOrDefault(that, name, Convert::toString, null);
        }

        public static int intQueryParam(Component that, String name) {
            return getQueryParamOrDefault(that, name, Convert::toInt, 0);
        }

        public static Integer IntegerQueryParam(Component that, String name) {
            return getQueryParamOrDefault(that, name, Convert::toInt, null);
        }

        public static boolean booleanQueryParam(Component that, String name) {
            return getQueryParamOrDefault(that, name, Convert::toBoolean, false);
        }

        public static Boolean BooleanQueryParam(Component that, String name) {
            return getQueryParamOrDefault(that, name, Convert::toBoolean, null);
        }

        public static byte byteQueryParam(Component that, String name) {
            return getQueryParamOrDefault(that, name, Convert::toByte, (byte)0);
        }

        public static Byte ByteQueryParam(Component that, String name) {
            return getQueryParamOrDefault(that, name, Convert::toByte, null);
        }

        public static char charQueryParam(Component that, String name) {
            return getQueryParamOrDefault(that, name, Convert::toChar, (char)0);
        }

        public static char CharacterQueryParam(Component that, String name) {
            return getQueryParamOrDefault(that, name, Convert::toChar, null);
        }

        public static short shortQueryParam(Component that, String name) {
            return getQueryParamOrDefault(that, name, Convert::toShort, (short)0);
        }

        public static Short ShortQueryParam(Component that, String name) {
            return getQueryParamOrDefault(that, name, Convert::toShort, null);
        }

        public static float floatQueryParam(Component that, String name) {
            return getQueryParamOrDefault(that, name, Convert::toFloat, 0.0f);
        }

        public static Float FloatQueryParam(Component that, String name) {
            return getQueryParamOrDefault(that, name, Convert::toFloat, null);
        }

        public static double doubleQueryParam(Component that, String name) {
            return getQueryParamOrDefault(that, name, Convert::toDouble, 0.0d);
        }

        public static Double DoubleQueryParam(Component that, String name) {
            return getQueryParamOrDefault(that, name, Convert::toDouble, null);
        }

        public static <T extends Serializable> T prop(Component that, String name, Class<T> clazz) {
            return getPropOrDefault(that, name, obj -> Convert.toSerializable(obj, clazz), null);
        }

    }
}
