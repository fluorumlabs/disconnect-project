package js.util;

import js.lang.Any;
import org.teavm.jso.JSBody;
import org.teavm.jso.JSByRef;
import org.teavm.jso.JSFunctor;
import org.teavm.jso.JSObject;

import javax.annotation.Nullable;


public abstract class JSON implements Any {
    /**
     * Converts a JavaScript Object Notation (JSON) string into an object.
     * @param text A valid JSON string.
     * @param reviver A function that transforms the results. This function is called for each member of the object.
     * If a member contains nested objects, the nested objects are transformed before the parent object is.
     */
    @JSBody(params = {"text","reviver"}, script = "return JSON.parse(text, reviver)")
    public static native Any parse(String text, Reviver reviver);
    @JSBody(params = {"text"}, script = "return JSON.parse(text)")
    public static native Any parse(String text);
    /**
     * Converts a JavaScript value to a JavaScript Object Notation (JSON) string.
     * @param value A JavaScript value, usually an object or array, to be converted.
     * @param replacer A function that transforms the results.
     * @param space Adds indentation, white space, and line break characters to the return-value JSON text to make it easier to read.
     */
    @JSBody(params = {"value", "replacer", "space"}, script = "return JSON.stringify(value, replacer, space)")
    public static native String stringify(Any value, @Nullable Replacer replacer, String space);
    @JSBody(params = {"value", "replacer", "space"}, script = "return JSON.stringify(value, replacer, space)")
    public static native String stringify(Any value, @Nullable Replacer replacer, int space);
    @JSBody(params = {"value", "replacer"}, script = "return JSON.stringify(value, replacer)")
    public static native String stringify(Any value, Replacer replacer);
    @JSBody(params = {"value"}, script = "return JSON.stringify(value)")
    public static native String stringify(Any value);
    /**
     * Converts a JavaScript value to a JavaScript Object Notation (JSON) string.
     * @param value A JavaScript value, usually an object or array, to be converted.
     * @param replacer An array of strings and numbers that acts as a approved list for selecting the object properties that will be stringified.
     * @param space Adds indentation, white space, and line break characters to the return-value JSON text to make it easier to read.
     */
    @JSBody(params = {"value", "replacer", "space"}, script = "return JSON.stringify(value, replacer, space)")
    public static native String stringify(Any value, @JSByRef String[] replacer, String space);
    @JSBody(params = {"value", "replacer", "space"}, script = "return JSON.stringify(value, replacer, space)")
    public static native String stringify(Any value, @JSByRef String[] replacer, int space);
    @JSBody(params = {"value", "replacer"}, script = "return JSON.stringify(value, replacer)")
    public static native String stringify(Any value, @JSByRef String[] replacer);
    @JSBody(params = {"value", "replacer", "space"}, script = "return JSON.stringify(value, replacer, space)")
    public static native String stringify(Any value, @JSByRef int[] replacer, String space);
    @JSBody(params = {"value", "replacer", "space"}, script = "return JSON.stringify(value, replacer, space)")
    public static native String stringify(Any value, @JSByRef int[] replacer, int space);
    @JSBody(params = {"value", "replacer"}, script = "return JSON.stringify(value, replacer)")
    public static native String stringify(Any value, @JSByRef int[] replacer);
    @JSBody(params = {"value", "replacer", "space"}, script = "return JSON.stringify(value, replacer, space)")
    public static native String stringify(Any value, @JSByRef double[] replacer, String space);
    @JSBody(params = {"value", "replacer", "space"}, script = "return JSON.stringify(value, replacer, space)")
    public static native String stringify(Any value, @JSByRef double[] replacer, int space);
    @JSBody(params = {"value", "replacer"}, script = "return JSON.stringify(value, replacer)")
    public static native String stringify(Any value, @JSByRef double[] replacer);

    @JSFunctor
    @FunctionalInterface
    interface Reviver extends JSObject {
        Any revive(String key, Any value);
    }

    @JSFunctor
    @FunctionalInterface
    interface Replacer extends JSObject {
        Any revive(String key, Any value);
    }
}

