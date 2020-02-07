package js.lang;

import org.teavm.jso.JSBody;
import org.teavm.jso.JSByRef;
import org.teavm.jso.JSProperty;

/**
 * Creates a new function.
 */
public interface JsFunction extends Any {
    /**
     * Creates a new function.
     *
     * @param args A list of arguments the function accepts.
     */
    @JSBody(params = "args", script = "return Function.apply(null, args)")
    static JsFunction create(String... args) {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    @JSBody(script = "return Function.prototype")
    static JsFunction prototype() {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    /**
     * Calls the function, substituting the specified object for the this value of the function, and the specified array for the arguments of the function.
     *
     * @param thisArg  The object to be used as the this object.
     * @param argArray A set of arguments to be passed to the function.
     */
    Any apply(Any thisArg, Any argArray);

    Any apply(Any thisArg);

    /**
     * Calls a method of an object, substituting another object for the current object.
     *
     * @param thisArg  The object to be used as the current object.
     * @param argArray A list of arguments to be passed to the method.
     */
    @JSBody(params = {"thisArg", "argArray"}, script = "return this.call.apply(this, [].concat([thisArg], argArray))")
    Any call(Any thisArg, Any... argArray);

    /**
     * For a given function, creates a bound function that has the same body as the original function.
     * The this object of the bound function is associated with the specified object, and has the specified initial parameters.
     *
     * @param thisArg  An object to which the this keyword can refer inside the new function.
     * @param argArray A list of arguments to be passed to the new function.
     */
    @JSBody(params = {"thisArg", "argArray"}, script = "return this.bind.apply(this, [].concat([thisArg], argArray))")
    Any bind(Any thisArg, Any... argArray);

    /**
     * Returns a string representation of a function.
     */
    String toString();

    @JSProperty
    Any getPrototype();

    @JSProperty
    void setPrototype(Any vaue);

    @JSProperty("length")
    int length();

    /**
     * Returns the name of the function. Function names are read-only and can not be changed.
     */
    @JSProperty
    String getName();

}
