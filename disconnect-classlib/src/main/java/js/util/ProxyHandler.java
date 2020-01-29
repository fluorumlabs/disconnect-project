package js.util;

import js.lang.Any;
import js.lang.PropertyDescriptor;
import js.lang.Unknown;
import js.util.collections.Array;
import org.teavm.jso.JSFunctor;
import org.teavm.jso.JSObject;
import org.teavm.jso.JSProperty;


public interface ProxyHandler<T extends Any> extends Any {
    @JSProperty
    void setGetPrototypeOf(Function1<T, Unknown> getPrototypeOf);

    @JSProperty
    void setSetPrototypeOf(BooleanFunction2<T, Any> setPrototypeOf);

    @JSProperty
    void setIsExtensible(BooleanFunction1<T> isExtensible);

    @JSProperty
    void setPreventExtensions(BooleanFunction1<T> preventExtensions);

    @JSProperty
    void setGetOwnPropertyDescriptor(Function2<T, Unknown, PropertyDescriptor> getOwnPropertyDescriptor);

    @JSProperty
    void setHas(BooleanFunction2<T, Unknown> has);

    @JSProperty
    void setGet(Function3<T, Unknown, Any, Unknown> get);

    @JSProperty
    void setSet(BooleanFunction4<T, Unknown, Any, Any> set);

    @JSProperty
    void setDeleteProperty(BooleanFunction2<T, Unknown> deleteProperty);

    @JSProperty
    void setDefineProperty(BooleanFunction3<T, Unknown, PropertyDescriptor> defineProperty);

    @JSProperty
    void setEnumerate(Function1<T, Array<Unknown>> enumerate);

    @JSProperty
    void setOwnKeys(Function1<T, Array<Unknown>> enumerate);

    @JSProperty
    void setApply(Function3<T, Any, Array<Any>, Unknown> apply);

    @JSProperty
    void setConstruct(Function2<T, Array<Any>, Unknown> apply);

    @JSFunctor
    @FunctionalInterface
    interface Function1<T, R> extends JSObject {
        R apply(T value);
    }

    @JSFunctor
    @FunctionalInterface
    interface Function2<T1, T2, R> extends JSObject {
        R apply(T1 value1, T2 value2);
    }

    @JSFunctor
    @FunctionalInterface
    interface Function3<T1, T2, T3, R> extends JSObject {
        R apply(T1 value1, T2 value2, T3 value3);
    }

    @JSFunctor
    @FunctionalInterface
    interface BooleanFunction1<T> extends JSObject {
        boolean apply(T value);
    }

    @JSFunctor
    @FunctionalInterface
    interface BooleanFunction2<T1, T2> extends JSObject {
        boolean apply(T1 value1, T2 value2);
    }

    @JSFunctor
    @FunctionalInterface
    interface BooleanFunction3<T1, T2, T3> extends JSObject {
        boolean apply(T1 value1, T2 value2, T3 value3);
    }

    @JSFunctor
    @FunctionalInterface
    interface BooleanFunction4<T1, T2, T3, T4> extends JSObject {
        boolean apply(T1 value1, T2 value2, T3 value3, T4 value4);
    }
}
