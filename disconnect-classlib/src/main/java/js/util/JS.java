package js.util;

import js.lang.Any;
import js.lang.Unknown;
import org.teavm.jso.JSBody;
import org.teavm.jso.JSObject;

public final class JS {
    public static final Reflect Reflect = getReflectInstance();

    /////////////////////////////
    /// ECMAScript APIs
    /////////////////////////////

    /**
     * Not instantiatable
     */
    private JS() {
    }


    public static final JSObject undefined = undefined();

    @JSBody(params = "x", script = "return x || null")
    public static native <T extends Any> T nullify(T x);

    @JSBody(params = "x", script = "return x === undefined")
    public static native boolean isUndefined(Any x);

    @JSBody(params = "x", script = "return x === undefined || x === null")
    public static native boolean isUndefinedOrNull(Any x);

    /**
     * Evaluates JavaScript code and executes it.
     *
     * @param x A String value that contains valid JavaScript code.
     */
    @JSBody(params = "x", script = "return eval(x)")
    public static native Any eval(java.lang.String x);

    /**
     * Converts a string to an integer.
     *
     * @param s     A string to convert into a number.
     * @param radix A value between 2 and 36 that specifies the base of the number in numString.
     *              If this argument is not supplied, strings with a prefix of '0x' are considered hexadecimal.
     *              All other strings are considered decimal.
     */
    @JSBody(params = {"s", "radix"}, script = "return parseInt(s, radix)")
    public static native int parseInt(String s, int radix);

    /**
     * Converts a string to an integer.
     *
     * @param s A string to convert into a number.
     *          Strings with a prefix of '0x' are considered hexadecimal.
     *          All other strings are considered decimal.
     */
    @JSBody(params = "s", script = "return parseInt(s)")
    public static native int parseInt(String s);

    /**
     * Converts a string to a floating-point number.
     *
     * @param string A string that contains a floating-point number.
     */
    @JSBody(params = "string", script = "return parseFloat(string)")
    public static native float parseFloat(String string);

    /**
     * Returns a Boolean value that indicates whether a value is the reserved value NaN (not a number).
     *
     * @param number A numeric value.
     */
    @JSBody(params = "number", script = "return isNaN(number)")
    public static native boolean isNaN(double number);

    /**
     * Determines whether a supplied number is finite.
     *
     * @param number Any numeric value.
     */
    @JSBody(params = "number", script = "return isFinite(number)")
    public static native boolean isFinite(double number);

    /**
     * Gets the unencoded version of an encoded Uniform Resource Identifier (URI).
     *
     * @param encodedURI A value representing an encoded URI.
     */
    @JSBody(params = "encodedURI", script = "return decodeURI(encodedURI)")
    public static native String decodeURI(String encodedURI);

    /**
     * Gets the unencoded version of an encoded component of a Uniform Resource Identifier (URI).
     *
     * @param encodedURIComponent A value representing an encoded URI component.
     */
    @JSBody(params = "encodedURIComponent", script = "return decodeURIComponent(encodedURIComponent)")
    public static native String decodeURIComponent(String encodedURIComponent);

    /**
     * Encodes a text string as a valid Uniform Resource Identifier (URI)
     *
     * @param uri A value representing an encoded URI.
     */
    @JSBody(params = "uri", script = "return encodeURI(uri)")
    public static native String encodeURI(String uri);

    /**
     * Encodes a text string as a valid component of a Uniform Resource Identifier (URI).
     *
     * @param uriComponent A value representing an encoded URI component.
     */
    @JSBody(params = "uriComponent", script = "return encodeURIComponent(uriComponent)")
    public static native String encodeURIComponent(String uriComponent);

    /**
     * Encodes a text string as a valid component of a Uniform Resource Identifier (URI).
     *
     * @param uriComponent A value representing an encoded URI component.
     */
    @JSBody(params = "uriComponent", script = "return encodeURIComponent(uriComponent)")
    public static native String encodeURIComponent(double uriComponent);

    /**
     * Encodes a text string as a valid component of a Uniform Resource Identifier (URI).
     *
     * @param uriComponent A value representing an encoded URI component.
     */
    @JSBody(params = "uriComponent", script = "return encodeURIComponent(uriComponent)")
    public static native String encodeURIComponent(boolean uriComponent);

    /**
     * Computes a new string in which certain characters have been replaced by a hexadecimal escape sequence.
     *
     * @param string A string value
     */
    @JSBody(params = "string", script = "return escape(string)")
    public static native String escape(String string);

    /**
     * Computes a new string in which hexadecimal escape sequences are replaced with the character that it represents.
     *
     * @param string A string value
     */
    @JSBody(params = "string", script = "return unescape(string)")
    public static native String unescape(String string);

    @JSBody(script = "return self.Reflect")
    public static native Reflect getReflectInstance();

    @JSBody(script = "return undefined")
    private static native Unknown undefined();
}
