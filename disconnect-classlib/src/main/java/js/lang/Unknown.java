package js.lang;

import org.teavm.jso.JSBody;
import org.teavm.jso.JSByRef;


/**
 * The interface Unknown.
 */
public interface Unknown extends Any {
	/**
	 * Of unknown.
	 *
	 * @param value the value
	 *
	 * @return the unknown
	 */
	@JSBody(params = "value", script = "return value")
    static Unknown of(double value) {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

	@JSBody(params = "value", script = "return value")
    static Unknown of(Any value) {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

	@JSBody(params = "value", script = "return Object.values(value)")
    static Unknown of(@JSByRef Any[] value) {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

	@JSBody(params = "value", script = "return Object.values(value)")
    static Unknown of(@JSByRef double[] value) {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

	@JSBody(params = "value", script = "return Object.values(value)")
    static Unknown of(@JSByRef float[] value) {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

	/**
	 * Of unknown.
	 *
	 * @param value the value
	 *
	 * @return the unknown
	 */
	@JSBody(params = "value", script = "return value")
    static Unknown of(int value) {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

	@JSBody(params = "value", script = "return Object.values(value)")
    static Unknown of(@JSByRef int[] value) {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

	@JSBody(params = "value", script = "return Object.values(value)")
    static Unknown of(@JSByRef short[] value) {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

	@JSBody(params = "value", script = "return Object.values(value)")
    static Unknown of(@JSByRef byte[] value) {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

	@JSBody(params = "value", script = "return Object.values(value)")
    static Unknown of(@JSByRef char[] value) {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

	/**
	 * Of unknown.
	 *
	 * @param value the value
	 *
	 * @return the unknown
	 */
	@JSBody(params = "value", script = "return value")
    static Unknown of(String value) {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

	@JSBody(params = "value", script = "return value")
    static Unknown of(String[] value) {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

	/**
	 * Of unknown.
	 *
	 * @param value the value
	 *
	 * @return the unknown
	 */
	@JSBody(params = "value", script = "return value")
    static Unknown of(boolean value) {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

	@JSBody(params = "value", script = "return value")
    static Unknown of(boolean[] value) {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

	/**
	 * Undefined unknown.
	 *
	 * @return the unknown
	 */
	@JSBody(script = "return undefined")
    static Unknown undefined() {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

	/**
	 * Double value double.
	 *
	 * @return the double
	 */
	@JSBody(script = "return +this")
    double doubleValue();

	/**
	 * Int value int.
	 *
	 * @return the int
	 */
	@JSBody(script = "return +this")
    int intValue();

	/**
	 * Byte value byte.
	 *
	 * @return the byte
	 */
	@JSBody(script = "return +this")
    byte byteValue();

	/**
	 * Char value char.
	 *
	 * @return the char
	 */
	@JSBody(script = "return +this")
    char charValue();

	/**
	 * Short value short.
	 *
	 * @return the short
	 */
	@JSBody(script = "return +this")
    short shortValue();

	/**
	 * Float value float.
	 *
	 * @return the float
	 */
	@JSBody(script = "return +this")
    float floatValue();

	/**
	 * Boolean value boolean.
	 *
	 * @return the boolean
	 */
	@JSBody(script = "return !!this")
    boolean booleanValue();

	@JSBody(script = "return this")
	<T extends Any> T value();

	/**
	 * String value string.
	 *
	 * @return the string
	 */
	@JSBody(script = "return ''+this")
    String stringValue();

	@JSBody(script = "return [].concat(this)")
	String[] stringArrayValue();

	@JSBody(script = "return [].concat(this)")
	boolean[] booleanArrayValue();

	@JSBody(script = "return [].concat(this)")
	@JSByRef
	byte[] byteArrayValue();

	@JSBody(script = "return [].concat(this)")
	@JSByRef
	char[] charArrayValue();

	@JSBody(script = "return [].concat(this)")
	@JSByRef
	float[] floatArrayValue();

	@JSBody(script = "return [].concat(this)")
	@JSByRef
	double[] doubleArrayValue();

	@JSBody(script = "return [].concat(this)")
	@JSByRef
	short[] shortArrayValue();

	@JSBody(script = "return [].concat(this)")
	@JSByRef
	int[] intArrayValue();

	@JSBody(script = "return [].concat(this)")
	@JSByRef
	<T extends Any> T[] arrayValue();

	/**
	 * Is string boolean.
	 *
	 * @return the boolean
	 */
	@JSBody(script = "return typeof this === 'string'")
    boolean isString();

	/**
	 * Is number boolean.
	 *
	 * @return the boolean
	 */
	@JSBody(script = "return typeof this === 'number'")
    boolean isNumber();

	/**
	 * Is boolean boolean.
	 *
	 * @return the boolean
	 */
	@JSBody(script = "return typeof this === 'boolean'")
    boolean isBoolean();

	/**
	 * Is array boolean.
	 *
	 * @return the boolean
	 */
	@JSBody(script = "return Array.isArray(this)")
    boolean isArray();

	/**
	 * Equals boolean.
	 *
	 * @param other the other
	 *
	 * @return the boolean
	 */
	@JSBody(params = "other", script = "return this === other")
    boolean equals(Unknown other);

    @JSBody(script = "return ''+this")
    String toString();
}
