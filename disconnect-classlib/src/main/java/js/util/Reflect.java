package js.util;

import js.lang.*;
import js.util.collections.Array;
import js.util.collections.ArrayLike;
import js.util.iterable.IterableIterator;

import javax.annotation.Nullable;


public abstract class Reflect implements Any {
    public native Unknown apply(JsFunction target, Any thisArgument, ArrayLike<Any> argumentsList);

    public native Unknown construct(JsFunction target, ArrayLike<Any> argumentsList, Any newTarget);

    public native Unknown construct(JsFunction target, ArrayLike<Any> argumentsList);

    public native boolean defineProperty(Any target, String propertyKey, PropertyDescriptor attributes);

    public native boolean defineProperty(Any target, double propertyKey, PropertyDescriptor attributes);

    public native boolean defineProperty(Any target, Symbol propertyKey, PropertyDescriptor attributes);

    public native boolean deleteProperty(Any target, String propertyKey);

    public native boolean deleteProperty(Any target, double propertyKey);

    public native boolean deleteProperty(Any target, Symbol propertyKey);

    public native Unknown get(Any target, String propertyKey, Any receiver);

    public native Unknown get(Any target, double propertyKey, Any receiver);

    public native Unknown get(Any target, Symbol propertyKey, Any receiver);

    public native Unknown get(Any target, String propertyKey);

    public native Unknown get(Any target, double propertyKey);

    public native Unknown get(Any target, Symbol propertyKey);

    @Nullable
    public native PropertyDescriptor getOwnPropertyDescriptor(Any target, String propertyKey);

    @Nullable
    public native PropertyDescriptor getOwnPropertyDescriptor(Any target, double propertyKey);

    @Nullable
    public native PropertyDescriptor getOwnPropertyDescriptor(Any target, Symbol propertyKey);

    public native Unknown getPrototypeOf(Any target);

    public native IterableIterator<Any> enumerate(Any target);

    public native boolean has(Any target, String propertyKey);

    public native boolean has(Any target, double propertyKey);

    public native boolean has(Any target, Symbol propertyKey);

    public native boolean isExtensible(Any target);

    public native Array<Unknown> ownKeys(Any target);

    public native boolean preventExtensions(Any target);

    public native boolean set(Any target, String propertyKey, Any value, Any receiver);

    public native boolean set(Any target, double propertyKey, Any value, Any receiver);

    public native boolean set(Any target, Symbol propertyKey, Any value, Any receiver);

    public native boolean set(Any target, String propertyKey, Any value);

    public native boolean set(Any target, double propertyKey, Any value);

    public native boolean set(Any target, Symbol propertyKey, Any value);

    public native boolean setPrototypeOf(Any target, Any proto);
}
