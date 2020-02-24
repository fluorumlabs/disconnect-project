package js.lang;

import js.intl.NumberFormatOptions;
import org.teavm.jso.JSBody;


/**
 * The type Js number.
 */
public abstract class JsNumber implements Any {
	/**
	 * The constant MAX_VALUE.
	 */
	public static final double MAX_VALUE = MAX_VALUE();

	/**
	 * The constant MIN_VALUE.
	 */
	public static final double MIN_VALUE = MIN_VALUE();

	/**
	 * The constant NaN.
	 */
	public static final double NaN = NaN();

	/**
	 * The constant NEGATIVE_INFINITY.
	 */
	public static final double NEGATIVE_INFINITY = NEGATIVE_INFINITY();

	/**
	 * The constant POSITIVE_INFINITY.
	 */
	public static final double POSITIVE_INFINITY = POSITIVE_INFINITY();

	/**
	 * Of js number.
	 *
	 * @param value the value
	 *
	 * @return the js number
	 */
	@JSBody(params = "value", script = "return Number(value)")
    public static native JsNumber of(double value);

	/**
	 * Of js number.
	 *
	 * @param value the value
	 *
	 * @return the js number
	 */
	@JSBody(params = "value", script = "return Number(value)")
    public static native JsNumber of(int value);

	/**
	 * Returns true if passed value is finite.
	 * Unlike the global isFinite, Number.isFinite doesn't forcibly convert the parameter to a
	 * number. Only finite values of the type number, result in true.
	 *
	 * @param number A numeric value.
	 *
	 * @return the boolean
	 */
	@JSBody(params = "number", script = "return Number.isFinite(number)")
    public static native boolean isFinite(double number);

	/**
	 * Returns true if the value passed is an integer, false otherwise.
	 *
	 * @param number A numeric value.
	 *
	 * @return the boolean
	 */
	@JSBody(params = "number", script = "return Number.isInteger(number)")
    public static native boolean isInteger(double number);

	/**
	 * Returns true if the value passed is a safe integer.
	 *
	 * @param number A numeric value.
	 *
	 * @return the boolean
	 */
	@JSBody(params = "number", script = "return Number.isSafeInteger(number)")
    public static native boolean isSafeInteger(double number);

	/**
	 * Returns a Boolean value that indicates whether a value is the reserved value NaN (not a
	 * number). Unlike the global isNaN(), Number.isNaN() doesn't forcefully convert the parameter
	 * to a number. Only values of the type number, that are also NaN, result in true.
	 *
	 * @param number A numeric value.
	 *
	 * @return the boolean
	 */
	@JSBody(params = "number", script = "return Number.isNaN(number)")
    public static native boolean isNaN(double number);

	/**
	 * Create js number.
	 *
	 * @param value the value
	 *
	 * @return the js number
	 */
	@JSBody(params = "value", script = "return Number(value)")
    public static native JsNumber create(Any value);

	/**
	 * Create js number.
	 *
	 * @return the js number
	 */
	@JSBody(script = "return Number()")
    public static native JsNumber create();

	/**
	 * Converts a string to a floating-point number.
	 *
	 * @param string A string that contains a floating-point number.
	 *
	 * @return the double
	 */
	@JSBody(params = "string", script = "return Number.parseFloat(string)")
    public static native double parseFloat(String string);

	/**
	 * Converts A string to an integer.
	 *
	 * @param string the string
	 * @param radix  A value between 2 and 36 that specifies the base of the number in numString.              If this
	 *                 argument is not supplied, strings with a prefix of '0x' are considered hexadecimal.
	 *                 All other strings are considered decimal.
	 *
	 * @return the int
	 */
	@JSBody(params = {"string", "radix"}, script = "return Number.parseInt(string, radix)")
    public static native int parseInt(String string, int radix);

	/**
	 * Parse int int.
	 *
	 * @param string the string
	 *
	 * @return the int
	 */
	@JSBody(params = "string", script = "return Number.parseInt(string)")
    public static native int parseInt(String string);

	/**
	 * Prototype js number.
	 *
	 * @return the js number
	 */
	@JSBody(script = "return Number.prototype")
    public static native JsNumber prototype();

    /**
     * The largest number that can be represented in JavaScript. Equal to approximately 1.79E+308.
     */
    @JSBody(script = "return Number.MAX_VALUE")
    private static native double MAX_VALUE();

    /**
     * The closest number to zero that can be represented in JavaScript. Equal to approximately 5.00E-324.
     */
    @JSBody(script = "return Number.MAX_VALUE")
    private static native double MIN_VALUE();

    /**
     * A value that is not a number.
     * In equality comparisons, NaN does not equal any value, including itself. To test whether a value is equivalent to NaN, use the isNaN function.
     */
    @JSBody(script = "return Number.NaN")
    private static native double NaN();

    /**
     * A value that is less than the largest negative number that can be represented in JavaScript.
     * JavaScript displays NEGATIVE_INFINITY values as -infinity.
     */
    @JSBody(script = "return Number.NEGATIVE_INFINITY")
    private static native double NEGATIVE_INFINITY();

    /**
     * A value greater than the largest number that can be represented in JavaScript.
     * JavaScript displays POSITIVE_INFINITY values as infinity.
     */
    @JSBody(script = "return Number.POSITIVE_INFINITY")
    private static native double POSITIVE_INFINITY();

    /**
     * The value of Number.EPSILON is the difference between 1 and the smallest value greater than 1
     * that is representable as a Number value, which is approximately:
     * 2.2204460492503130808472633361816 x 10‍−‍16.
     */
    @JSBody(script = "return Number.EPSILON")
    private static native double EPSILON();

    /**
     * The value of the largest integer n such that n and n + 1 are both exactly representable as
     * a Number value.
     * The value of Number.MAX_SAFE_INTEGER is 9007199254740991 2^53 − 1.
     */
    @JSBody(script = "return Number.MAX_SAFE_INTEGER")
    private static native double MAX_SAFE_INTEGER();

    /**
     * The value of the smallest integer n such that n and n − 1 are both exactly representable as
     * a Number value.
     * The value of Number.MIN_SAFE_INTEGER is −9007199254740991 (−(2^53 − 1)).
     */
    @JSBody(script = "return Number.MIN_SAFE_INTEGER")
    private static native double MIN_SAFE_INTEGER();

	/**
	 * Returns a string representation of an object.
	 *
	 * @param radix Specifies a radix for converting numeric values to strings. This value is only used for numbers.
	 *
	 * @return the string
	 */
	public native String toString(int radix);

    public native String toString();

	/**
	 * Converts a number to a string by using the current or specified locale.
	 *
	 * @param locales A locale string or array of locale strings that contain one or more language or locale tags. If
	 *                   you include more than one locale string, list them in descending order of priority so that
	 *                   the first entry is the preferred locale. If you omit this parameter, the default locale of
	 *                   the JavaScript runtime is used.
	 * @param options An object that contains one or more properties that specify comparison options.
	 *
	 * @return the string
	 */
	public native String toLocaleString(String locales, NumberFormatOptions options);

	/**
	 * To locale string string.
	 *
	 * @param locales the locales
	 * @param options the options
	 *
	 * @return the string
	 */
	public native String toLocaleString(String[] locales, NumberFormatOptions options);

	/**
	 * To locale string string.
	 *
	 * @param locales the locales
	 *
	 * @return the string
	 */
	public native String toLocaleString(String locales);

	/**
	 * To locale string string.
	 *
	 * @param locales the locales
	 *
	 * @return the string
	 */
	public native String toLocaleString(String[] locales);

	/**
	 * To locale string string.
	 *
	 * @return the string
	 */
	public native String toLocaleString();

	/**
	 * Returns a string representing a number in fixed-point notation.
	 *
	 * @param fractionDigits Number of digits after the decimal point. Must be in the range 0 - 20, inclusive.
	 *
	 * @return the string
	 */
	public native String toFixed(int fractionDigits);

	/**
	 * To fixed string.
	 *
	 * @return the string
	 */
	public native String toFixed();

	/**
	 * Returns a string containing a number represented in exponential notation.
	 *
	 * @param fractionDigits Number of digits after the decimal point. Must be in the range 0 - 20, inclusive.
	 *
	 * @return the string
	 */
	public native String toExponential(int fractionDigits);

	/**
	 * To exponential string.
	 *
	 * @return the string
	 */
	public native String toExponential();

	/**
	 * Returns a string containing a number represented either in exponential or fixed-point notation with a specified
	 * number of digits.
	 *
	 * @param precision Number of significant digits. Must be in the range 1 - 21, inclusive.
	 *
	 * @return the string
	 */
	public native String toPrecision(int precision);

	/**
	 * To precision string.
	 *
	 * @return the string
	 */
	public native String toPrecision();

	/**
	 * Returns the primitive value of the specified object.
	 *
	 * @return the double
	 */
	public native double valueOf();

	/**
	 * Returns the value of the specified number as an {@code int},
	 * which may involve rounding or truncation.
	 *
	 * @return the numeric value represented by this object after conversion         to type {@code int}.
	 */
	@JSBody(script = "return this.valueOf()")
    public native int intValue();

	/**
	 * Returns the value of the specified number as a {@code long},
	 * which may involve rounding or truncation.
	 *
	 * @return the numeric value represented by this object after conversion         to type {@code long}.
	 */
	public long longValue() {
        return intValue();
    }

	/**
	 * Returns the value of the specified number as a {@code float},
	 * which may involve rounding.
	 *
	 * @return the numeric value represented by this object after conversion         to type {@code float}.
	 */
	@JSBody(script = "return this.valueOf()")
    public native float floatValue();

	/**
	 * Returns the value of the specified number as a {@code double},
	 * which may involve rounding.
	 *
	 * @return the numeric value represented by this object after conversion         to type {@code double}.
	 */
	public double doubleValue() {
        return valueOf();
    }

}
