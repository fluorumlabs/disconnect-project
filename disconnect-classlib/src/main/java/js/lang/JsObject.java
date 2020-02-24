package js.lang;

import js.util.collections.Array;
import org.teavm.jso.JSBody;
import org.teavm.jso.JSByRef;
import org.teavm.jso.JSIndexer;
import org.teavm.jso.JSProperty;

import javax.annotation.Nullable;


/**
 * The interface Js object.
 */
public interface JsObject extends Any {
	/**
	 * Create js object.
	 *
	 * @param value the value
	 *
	 * @return the js object
	 */
	@JSBody(params = "value", script = "return new Object(value)")
    static JsObject create(Any value) {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

	/**
	 * A reference to the prototype for a class of objects.
	 *
	 * @return the js object
	 */
	@JSBody(script = "return Object.prototype")
    static JsObject prototype() {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

	/**
	 * Returns the prototype of an object.
	 *
	 * @param o The object that references the prototype.
	 *
	 * @return the prototype of
	 */
	@JSBody(params = "o", script = "return Object.getPrototypeOf(o)")
    static Any getPrototypeOf(Any o) {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

	/**
	 * Gets the own property descriptor of the specified object.
	 * An own property descriptor is one that is defined directly on the object and is not inherited from the object's
	 * prototype.
	 *
	 * @param o Object that contains the property.
	 * @param p Name of the property.
	 *
	 * @return the own property descriptor
	 */
	@Nullable
    @JSBody(params = {"o", "p"}, script = "return Object.getOwnPropertyDescriptor(o,p)")
    static PropertyDescriptor getOwnPropertyDescriptor(Any o, String p) {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

	/**
	 * Gets own property descriptor.
	 *
	 * @param o the o
	 * @param p the p
	 *
	 * @return the own property descriptor
	 */
	@Nullable
    @JSBody(params = {"o", "p"}, script = "return Object.getOwnPropertyDescriptor(o,p)")
    static PropertyDescriptor getOwnPropertyDescriptor(Any o, Symbol p) {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

	/**
	 * Gets own property descriptor.
	 *
	 * @param o the o
	 * @param p the p
	 *
	 * @return the own property descriptor
	 */
	@Nullable
    @JSBody(params = {"o", "p"}, script = "return Object.getOwnPropertyDescriptor(o,p)")
    static PropertyDescriptor getOwnPropertyDescriptor(Any o, int p) {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

	/**
	 * Gets own property descriptor.
	 *
	 * @param o the o
	 * @param p the p
	 *
	 * @return the own property descriptor
	 */
	@Nullable
    @JSBody(params = {"o", "p"}, script = "return Object.getOwnPropertyDescriptor(o,p)")
    static PropertyDescriptor getOwnPropertyDescriptor(Any o, double p) {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

	/**
	 * Returns the names of the own properties of an object. The own properties of an object are those that are
	 * defined directly
	 * on that object, and are not inherited from the object's prototype. The properties of an object include both
	 * fields (objects) and functions.
	 *
	 * @param o Object that contains the own properties.
	 *
	 * @return the string [ ]
	 */
	@JSBody(params = "o", script = "return Object.getOwnPropertyNames(o)")
    static String[] getOwnPropertyNames(Any o) {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

	/**
	 * Creates an object that has the specified prototype or that has null prototype.
	 *
	 * @param o Object to use as a prototype. May be null.
	 *
	 * @return the any
	 */
	@JSBody(params = "o", script = "return Object.create(o)")
    static Any create(@Nullable JsObject o) {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

	/**
	 * Creates an object that has the specified prototype, and that optionally contains specified properties.
	 *
	 * @param o          Object to use as a prototype. May be null
	 * @param properties JavaScript object that contains one or more property descriptors.
	 *
	 * @return the any
	 */
	@JSBody(params = {"o", "properties"}, script = "return Object.create(o,properties)")
    static Any create(@Nullable JsObject o, PropertyDescriptorMap properties) {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

	/**
	 * Adds a property to an object, or modifies attributes of an existing property.
	 *
	 * @param o          Object on which to add or modify the property. This can be a native JavaScript object (that
	 *                      is, a user-defined object or a built in object) or a DOM object.
	 * @param p          The property name.
	 * @param attributes Descriptor for the property. It can be for a data property or an accessor property.
	 *
	 * @return the any
	 */
	@JSBody(params = {"o", "p", "attributes"}, script = "return Object.defineProperty(o,p,attributes)")
    static Any defineProperty(Any o, String p, PropertyDescriptor attributes) {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

	/**
	 * Define property any.
	 *
	 * @param o          the o
	 * @param p          the p
	 * @param attributes the attributes
	 *
	 * @return the any
	 */
	@JSBody(params = {"o", "p", "attributes"}, script = "return Object.defineProperty(o,p,attributes)")
    static Any defineProperty(Any o, Symbol p, PropertyDescriptor attributes) {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

	/**
	 * Define property any.
	 *
	 * @param o          the o
	 * @param p          the p
	 * @param attributes the attributes
	 *
	 * @return the any
	 */
	@JSBody(params = {"o", "p", "attributes"}, script = "return Object.defineProperty(o,p,attributes)")
    static Any defineProperty(Any o, int p, PropertyDescriptor attributes) {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

	/**
	 * Define property any.
	 *
	 * @param o          the o
	 * @param p          the p
	 * @param attributes the attributes
	 *
	 * @return the any
	 */
	@JSBody(params = {"o", "p", "attributes"}, script = "return Object.defineProperty(o,p,attributes)")
    static Any defineProperty(Any o, double p, PropertyDescriptor attributes) {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

	/**
	 * Adds one or more properties to an object, and/or modifies attributes of existing properties.
	 *
	 * @param o          Object on which to add or modify the properties. This can be a native JavaScript object or a
	 *                      DOM object.
	 * @param properties JavaScript object that contains one or more descriptor objects. Each descriptor object
	 *                      describes a data property or an accessor property.
	 *
	 * @return the any
	 */
	@JSBody(params = {"o", "properties"}, script = "return Object.defineProperties(o,properties)")
    static Any defineProperties(Any o, PropertyDescriptorMap properties) {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

	/**
	 * Prevents the modification of attributes of existing properties, and prevents the addition of new properties.
	 *
	 * @param <T> the type parameter
	 * @param o   Object on which to lock the attributes.
	 *
	 * @return the t
	 */
	@JSBody(params = "o", script = "return Object.seal(o)")
    static <T extends Any> T seal(T o) {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

	/**
	 * Prevents the modification of existing property attributes and values, and prevents the addition of new
	 * properties.
	 *
	 * @param <T> the type parameter
	 * @param a   Object on which to lock the attributes.
	 *
	 * @return the array
	 */
	@JSBody(params = "a", script = "return Object.freeze(a)")
    static <T extends Any> Array<T> freeze(Array<T> a) {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

	/**
	 * Prevents the modification of existing property attributes and values, and prevents the addition of new
	 * properties.
	 *
	 * @param <T> the type parameter
	 * @param f   Object on which to lock the attributes.
	 *
	 * @return the t
	 */
	@JSBody(params = "f", script = "return Object.freeze(f)")
    static <T extends Any> T freeze(T f) {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

	/**
	 * Prevents the addition of new properties to an object.
	 *
	 * @param <T> the type parameter
	 * @param o   Object to make non-extensible.
	 *
	 * @return the t
	 */
	@JSBody(params = "o", script = "return Object.preventExtensions(o)")
    static <T extends Any> T preventExtensions(T o) {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

	/**
	 * Returns true if existing property attributes cannot be modified in an object and new properties cannot be added
	 * to the object.
	 *
	 * @param o Object to test.
	 *
	 * @return the boolean
	 */
	@JSBody(params = "o", script = "return Object.isSealed(o)")
    static boolean isSealed(Any o) {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

	/**
	 * Returns true if existing property attributes and values cannot be modified in an object, and new properties
	 * cannot be added to the object.
	 *
	 * @param o Object to test.
	 *
	 * @return the boolean
	 */
	@JSBody(params = "o", script = "return Object.isFrozen(o)")
    static boolean isFrozen(Any o) {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

	/**
	 * Returns a value that indicates whether new properties can be added to an object.
	 *
	 * @param o Object to test.
	 *
	 * @return the boolean
	 */
	@JSBody(params = "o", script = "return Object.isExtensible(o)")
    static boolean isExtensible(Any o) {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

	/**
	 * Returns the names of the enumerable string properties and methods of an object.
	 *
	 * @param o Object that contains the properties and methods. This can be an object that you created or an existing
	 *            Document Object Model (DOM) object.
	 *
	 * @return the string [ ]
	 */
	@JSBody(params = "o", script = "return Object.keys(o)")
    static String[] keys(JsObject o) {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

	/**
	 * Copy the values of all of the enumerable own properties from one or more source objects to a
	 * target object. Returns the target object.
	 *
	 * @param <T>    the type parameter
	 * @param <U>    the type parameter
	 * @param <R>    the type parameter
	 * @param target The target object to copy to.
	 * @param source The source object from which to copy properties.
	 *
	 * @return the r
	 */
	@JSBody(params = {"target", "source"}, script = "return Object.assign(target, source)")
    static <T extends Any, U extends Any, R extends Any> R assign(T target, U source) {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

	/**
	 * Copy the values of all of the enumerable own properties from one or more source objects to a
	 * target object. Returns the target object.
	 *
	 * @param <R>     the type parameter
	 * @param target  The target object to copy to.
	 * @param sources One or more source objects from which to copy properties
	 *
	 * @return the r
	 */
	@JSBody(params = {"target", "sources"}, script = "return Object.assign.apply(Object, [target].concat(sources))")
    static <R extends Any> R assign(Any target, Any... sources) {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

	/**
	 * Returns an array of all symbol properties found directly on object o.
	 *
	 * @param o Object to retrieve the symbols from.
	 *
	 * @return the symbol [ ]
	 */
	@JSBody(params = "o", script = "return Object.getOwnPropertySymbols(o)")
    static Symbol[] getOwnPropertySymbols(Any o) {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

	/**
	 * Returns the names of the enumerable string properties and methods of an object.
	 *
	 * @param o Object that contains the properties and methods. This can be an object that you created or an existing
	 *            Document Object Model (DOM) object.
	 *
	 * @return the string [ ]
	 */
	@JSBody(params = "o", script = "return Object.keys(o)")
    static String[] keys(Any o) {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

	/**
	 * Returns true if the values are the same value, false otherwise.
	 *
	 * @param value1 The first value.
	 * @param value2 The second value.
	 *
	 * @return the boolean
	 */
	@JSBody(params = {"value1", "value2"}, script = "return Object.is(value1, value2)")
    static boolean is(Any value1, Any value2) {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

	/**
	 * Sets the prototype of a specified object o to object proto or null. Returns the object o.
	 *
	 * @param o     The object to change its prototype.
	 * @param proto The value of the new prototype or null.
	 *
	 * @return the prototype of
	 */
	@JSBody(params = {"o", "proto"}, script = "return Object.setPrototypeOf(o, proto)")
    static Any setPrototypeOf(Any o, Any proto) {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

	/**
	 * The initial value of Object.prototype.constructor is the standard built-in Object constructor.
	 *
	 * @return the constructor
	 */
	@JSProperty
    JsFunction getConstructor();

	/**
	 * Sets constructor.
	 *
	 * @param value the value
	 */
	@JSProperty
    void setConstructor(JsFunction value);

    /**
     * Returns a string representation of an object.
     */
    String toString();

	/**
	 * Returns a date converted to a string using the current locale.
	 *
	 * @return the string
	 */
	String toLocaleString();

	/**
	 * Returns the primitive value of the specified object.
	 *
	 * @return the js object
	 */
	JsObject valueOf();

	/**
	 * Determines whether an object has a property with the specified name.
	 *
	 * @param v A property name.
	 *
	 * @return the boolean
	 */
	boolean hasOwnProperty(String v);

	/**
	 * Has own property boolean.
	 *
	 * @param v the v
	 *
	 * @return the boolean
	 */
	boolean hasOwnProperty(Symbol v);

	/**
	 * Has own property boolean.
	 *
	 * @param v the v
	 *
	 * @return the boolean
	 */
	boolean hasOwnProperty(int v);

	/**
	 * Has own property boolean.
	 *
	 * @param v the v
	 *
	 * @return the boolean
	 */
	boolean hasOwnProperty(double v);

	/**
	 * Determines whether an object exists in another object's prototype chain.
	 *
	 * @param v Another object whose prototype chain is to be checked.
	 *
	 * @return the boolean
	 */
	boolean isPrototypeOf(JsObject v);

	/**
	 * Determines whether a specified property is enumerable.
	 *
	 * @param v A property name.
	 *
	 * @return the boolean
	 */
	boolean propertyIsEnumerable(String v);

	/**
	 * Property is enumerable boolean.
	 *
	 * @param v the v
	 *
	 * @return the boolean
	 */
	boolean propertyIsEnumerable(Symbol v);

	/**
	 * Property is enumerable boolean.
	 *
	 * @param v the v
	 *
	 * @return the boolean
	 */
	boolean propertyIsEnumerable(int v);

	/**
	 * Property is enumerable boolean.
	 *
	 * @param v the v
	 *
	 * @return the boolean
	 */
	boolean propertyIsEnumerable(double v);

	/**
	 * Get t.
	 *
	 * @param <T> the type parameter
	 * @param key the key
	 *
	 * @return the t
	 */
	@JSIndexer
    <T extends Any> T get(String key);

	/**
	 * Gets string.
	 *
	 * @param key the key
	 *
	 * @return the string
	 */
	@JSIndexer
    String getString(String key);

	/**
	 * Gets int.
	 *
	 * @param key the key
	 *
	 * @return the int
	 */
	@JSIndexer
    int getInt(String key);

	/**
	 * Gets double.
	 *
	 * @param key the key
	 *
	 * @return the double
	 */
	@JSIndexer
    double getDouble(String key);

	/**
	 * Gets boolean.
	 *
	 * @param key the key
	 *
	 * @return the boolean
	 */
	@JSIndexer
    boolean getBoolean(String key);

	/**
	 * Set.
	 *
	 * @param key   the key
	 * @param value the value
	 */
	@JSIndexer
    void set(String key, Any value);

	/**
	 * Set.
	 *
	 * @param key   the key
	 * @param value the value
	 */
	@JSIndexer
    void set(String key, String value);

	/**
	 * Set.
	 *
	 * @param key   the key
	 * @param value the value
	 */
	@JSIndexer
    void set(String key, int value);

	/**
	 * Set.
	 *
	 * @param key   the key
	 * @param value the value
	 */
	@JSIndexer
    void set(String key, double value);

	/**
	 * Set.
	 *
	 * @param key   the key
	 * @param value the value
	 */
	@JSIndexer
    void set(String key, boolean value);

	/**
	 * Create js object.
	 *
	 * @return the js object
	 */
	@JSBody(script = "return {}")
    JsObject create();

}
