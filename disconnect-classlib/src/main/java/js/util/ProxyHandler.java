package js.util;

import js.lang.Any;
import js.lang.PropertyDescriptor;
import js.lang.Unknown;
import org.teavm.jso.JSFunctor;
import org.teavm.jso.JSObject;
import org.teavm.jso.JSProperty;


public interface ProxyHandler<T extends Any> extends Any {
    @JSProperty
    void setGetPrototypeOf(Getter<T> getPrototypeOf);

    @JSProperty
    void setSetPrototypeOf(PropertyBooleanFunction<T> setPrototypeOf);

    @JSProperty
    void setIsExtensible(BooleanGetter<T> isExtensible);

    @JSProperty
    void setPreventExtensions(BooleanGetter<T> preventExtensions);

    @JSProperty
    void setGetOwnPropertyDescriptor(PropertyDescriptorGetter<T> getOwnPropertyDescriptor);

    @JSProperty
    void setHas(PropertyBooleanFunction<T> has);

    @JSProperty
    void setGet(PropertyGetter<T> get);

    @JSProperty
    void setSet(Setter<T> set);

    @JSProperty
    void setDeleteProperty(PropertyBooleanFunction<T> deleteProperty);

    @JSProperty
    void setDefineProperty(DefineProperty<T> defineProperty);

    @JSProperty
    void setEnumerate(Getter<T> enumerate);

    @JSProperty
    void setOwnKeys(Getter<T> enumerate);

    @JSProperty
    void setApply(Apply<T> apply);

    @JSProperty
    void setConstruct(Constructor<T> apply);

    @JSFunctor
    @FunctionalInterface
    interface Getter<T extends Any> extends JSObject {
        Any get(T target);
    }

    @JSFunctor
    @FunctionalInterface
    interface Constructor<T1 extends Any> extends JSObject {
        Any apply(T1 target, Unknown... arguments);
    }

    @JSFunctor
    @FunctionalInterface
    interface PropertyDescriptorGetter<T1 extends Any> extends JSObject {
        PropertyDescriptor get(T1 target, Unknown key);
    }

    @JSFunctor
    @FunctionalInterface
    interface Apply<T1 extends Any> extends JSObject {
        Any apply(T1 target, Unknown thisArg, Unknown... arguments);
    }

    @JSFunctor
    @FunctionalInterface
    interface PropertyGetter<T1 extends Any> extends JSObject {
        Any get(T1 target, Unknown key, Proxy receiver);
    }

    @JSFunctor
    @FunctionalInterface
    interface BooleanGetter<T extends Any> extends JSObject {
        boolean test(T target);
    }

    @JSFunctor
    @FunctionalInterface
    interface PropertyBooleanFunction<T1 extends Any> extends JSObject {
        boolean apply(T1 target, Unknown key);
    }

    @JSFunctor
    @FunctionalInterface
    interface PrototypeSetter<T1 extends Any> extends JSObject {
        boolean set(T1 target, Unknown prototype);
    }

    @JSFunctor
    @FunctionalInterface
    interface DefineProperty<T1 extends Any> extends JSObject {
        boolean define(T1 target, Unknown key, PropertyDescriptor descriptor);
    }

    @JSFunctor
    @FunctionalInterface
    interface Setter<T1 extends Any> extends JSObject {
        boolean apply(T1 target, Unknown key, Unknown value, Proxy receiver);
    }
}
