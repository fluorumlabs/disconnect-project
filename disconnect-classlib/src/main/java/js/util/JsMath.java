package js.util;

import js.lang.Any;
import org.teavm.jso.JSBody;


public abstract class JsMath implements Any {
    /**
     * The mathematical constant e. This is Euler's number, the base of natural logarithms.
     */
    public static final double E = E();

    /**
     * The natural logarithm of 10.
     */
    public static final double LN10 = LN10();

    /**
     * The natural logarithm of 2.
     */
    public static final double LN2 = LN2();

    /**
     * The base-2 logarithm of e.
     */
    public static final double LOG2E = LOG2E();

    /**
     * The base-10 logarithm of e.
     */
    public static final double LOG10E = LOG10E();

    /**
     * Pi. This is the ratio of the circumference of a circle to its diameter.
     */
    public static final double PI = PI();

    /**
     * The square root of 0.5, or, equivalently, one divided by the square root of 2.
     */
    public static final double SQRT1_2 = SQRT1_2();

    /**
     * The square root of 2.
     */
    public static final double SQRT2 = SQRT2();

    @JSBody(script = "return Math.E")
    private static native double E();

    @JSBody(script = "return Math.LN10")
    private static native double LN10();

    @JSBody(script = "return Math.LN2")
    private static native double LN2();

    @JSBody(script = "return Math.LOG2E")
    private static native double LOG2E();

    @JSBody(script = "return Math.LOG10E")
    private static native double LOG10E();

    @JSBody(script = "return Math.PI")
    private static native double PI();

    @JSBody(script = "return Math.SQRT1_2")
    private static native double SQRT1_2();

    @JSBody(script = "return Math.SQRT2")
    private static native double SQRT2();

    /**
     * Returns the absolute value of a number (the value without regard to whether it is positive or negative).
     * For example, the absolute value of -5 is the same as the absolute value of 5.
     *
     * @param x A numeric expression for which the absolute value is needed.
     */
    @JSBody(params = "x", script = "return Math.abs(x)")
    public static native double abs(double x);

    /**
     * Returns the arc cosine (or inverse cosine) of a number.
     *
     * @param x A numeric expression.
     */
    @JSBody(params = "x", script = "return Math.acos(x)")
    public static native double acos(double x);

    /**
     * Returns the arcsine of a number.
     *
     * @param x A numeric expression.
     */
    @JSBody(params = "x", script = "return Math.asin(x)")
    public static native double asin(double x);

    /**
     * Returns the arctangent of a number.
     *
     * @param x A numeric expression for which the arctangent is needed.
     */
    @JSBody(params = "x", script = "return Math.atan(x)")
    public static native double atan(double x);

    /**
     * Returns the angle (in radians) from the X axis to a point.
     *
     * @param y A numeric expression representing the cartesian y-coordinate.
     * @param x A numeric expression representing the cartesian x-coordinate.
     */
    @JSBody(params = {"x", "y"}, script = "return Math.atan2(x, y)")
    public static native double atan2(double y, double x);

    /**
     * Returns the smallest integer greater than or equal to its numeric argument.
     *
     * @param x A numeric expression.
     */
    @JSBody(params = "x", script = "return Math.ceil(x)")
    public static native int ceil(double x);

    /**
     * Returns the cosine of a number.
     *
     * @param x A numeric expression that contains an angle measured in radians.
     */
    @JSBody(params = "x", script = "return Math.cos(x)")
    public static native double cos(double x);

    /**
     * Returns e (the base of natural logarithms) raised to a power.
     *
     * @param x A numeric expression representing the power of e.
     */
    @JSBody(params = "x", script = "return Math.exp(x)")
    public static native double exp(double x);

    /**
     * Returns the greatest integer less than or equal to its numeric argument.
     *
     * @param x A numeric expression.
     */
    @JSBody(params = "x", script = "return Math.floor(x)")
    public static native int floor(double x);

    /**
     * Returns the natural logarithm (base e) of a number.
     *
     * @param x A numeric expression.
     */
    @JSBody(params = "x", script = "return Math.log(x)")
    public static native double log(double x);

    /**
     * Returns the larger of a set of supplied numeric expressions.
     *
     * @param values Numeric expressions to be evaluated.
     */
    @JSBody(params = "values", script = "return Math.max.apply(Math, values)")
    public static native double max(double... values);

    @JSBody(params = "values", script = "return Math.max.apply(Math, values)")
    public static native int max(int... values);

    /**
     * Returns the smaller of a set of supplied numeric expressions.
     *
     * @param values Numeric expressions to be evaluated.
     */
    @JSBody(params = "values", script = "return Math.min.apply(Math, values)")
    public static native double min(double... values);

    @JSBody(params = "values", script = "return Math.min.apply(Math, values)")
    public static native int min(int... values);

    /**
     * Returns the value of a base expression taken to a specified power.
     *
     * @param x The base value of the expression.
     * @param y The exponent value of the expression.
     */
    @JSBody(params = {"x", "y"}, script = "return Math.pow(x, y)")
    public static native double pow(double x, double y);

    /**
     * Returns a pseudorandom number between 0 and 1.
     */
    @JSBody(script = "return Math.random()")
    public static native double random();

    /**
     * Returns a supplied numeric expression rounded to the nearest integer.
     *
     * @param x The value to be rounded to the nearest integer.
     */
    @JSBody(params = "x", script = "return Math.round(x)")
    public static native int round(double x);

    /**
     * Returns the sine of a number.
     *
     * @param x A numeric expression that contains an angle measured in radians.
     */
    @JSBody(params = "x", script = "return Math.sin(x)")
    public static native double sin(double x);

    /**
     * Returns the square root of a number.
     *
     * @param x A numeric expression.
     */
    @JSBody(params = "x", script = "return Math.sqrt(x)")
    public static native double sqrt(double x);

    /**
     * Returns the tangent of a number.
     *
     * @param x A numeric expression that contains an angle measured in radians.
     */
    @JSBody(params = "x", script = "return Math.tan(x)")
    public static native double tan(double x);

    /**
     * Returns the number of leading zero bits in the 32-bit binary representation of a number.
     *
     * @param x A numeric expression.
     */
    @JSBody(params = "x", script = "return Math.clz32(x)")
    public static native int clz32(int x);

    /**
     * Returns the result of 32-bit multiplication of two numbers.
     *
     * @param x First number
     * @param y Second number
     */
    @JSBody(params = {"x","y"}, script = "return Math.imul(x, y)")
    public static native int imul(int x, int y);

    /**
     * Returns the sign of the x, indicating whether x is positive, negative or zero.
     *
     * @param x The numeric expression to test
     */
    @JSBody(params = "x", script = "return Math.sign(x)")
    public static native int sign(double x);

    /**
     * Returns the base 10 logarithm of a number.
     *
     * @param x A numeric expression.
     */
    @JSBody(params = "x", script = "return Math.log10(x)")
    public static native double log10(double x);

    /**
     * Returns the base 2 logarithm of a number.
     *
     * @param x A numeric expression.
     */
    @JSBody(params = "x", script = "return Math.log2(x)")
    public static native double log2(double x);

    /**
     * Returns the natural logarithm of 1 + x.
     *
     * @param x A numeric expression.
     */
    @JSBody(params = "x", script = "return Math.log1p(x)")
    public static native double log1p(double x);

    /**
     * Returns the result of (e^x - 1), which is an implementation-dependent approximation to
     * subtracting 1 from the exponential function of x (e raised to the power of x, where e
     * is the base of the natural logarithms).
     *
     * @param x A numeric expression.
     */
    @JSBody(params = "x", script = "return Math.expm1(x)")
    public static native double expm1(double x);

    /**
     * Returns the hyperbolic cosine of a number.
     *
     * @param x A numeric expression that contains an angle measured in radians.
     */
    @JSBody(params = "x", script = "return Math.cosh(x)")
    public static native double cosh(double x);

    /**
     * Returns the hyperbolic sine of a number.
     *
     * @param x A numeric expression that contains an angle measured in radians.
     */
    @JSBody(params = "x", script = "return Math.sinh(x)")
    public static native double sinh(double x);

    /**
     * Returns the hyperbolic tangent of a number.
     *
     * @param x A numeric expression that contains an angle measured in radians.
     */
    @JSBody(params = "x", script = "return Math.tanh(x)")
    public static native double tanh(double x);

    /**
     * Returns the inverse hyperbolic cosine of a number.
     *
     * @param x A numeric expression that contains an angle measured in radians.
     */
    @JSBody(params = "x", script = "return Math.acosh(x)")
    public static native double acosh(double x);

    /**
     * Returns the inverse hyperbolic sine of a number.
     *
     * @param x A numeric expression that contains an angle measured in radians.
     */
    @JSBody(params = "x", script = "return Math.asinh(x)")
    public static native double asinh(double x);

    /**
     * Returns the inverse hyperbolic tangent of a number.
     *
     * @param x A numeric expression that contains an angle measured in radians.
     */
    @JSBody(params = "x", script = "return Math.atanh(x)")
    public static native double atanh(double x);

    /**
     * Returns the square root of the sum of squares of its arguments.
     *
     * @param values Values to compute the square root for.
     *               If no arguments are passed, the result is +0.
     *               If there is only one argument, the result is the absolute value.
     *               If any argument is +Infinity or -Infinity, the result is +Infinity.
     *               If any argument is NaN, the result is NaN.
     *               If all arguments are either +0 or −0, the result is +0.
     */
    @JSBody(params = "values", script = "return Math.hypot.apply(Math, values)")
    public static native double hypot(double... values);

    /**
     * Returns the integral part of the a numeric expression, x, removing any fractional digits.
     * If x is already an integer, the result is x.
     *
     * @param x A numeric expression.
     */
    @JSBody(params = "x", script = "return Math.trunc(x)")
    public static native int trunc(double x);

    /**
     * Returns the nearest single precision float representation of a number.
     *
     * @param x A numeric expression.
     */
    @JSBody(params = "x", script = "return Math.fround(x)")
    public static native float fround(double x);

    /**
     * Returns an implementation-dependent approximation to the cube root of number.
     *
     * @param x A numeric expression.
     */
    @JSBody(params = "x", script = "return Math.cbrt(x)")
    public static native double cbrt(double x);

}
