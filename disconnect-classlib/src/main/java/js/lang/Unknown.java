package js.lang;

import org.teavm.jso.JSBody;


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
	@JSBody(script = "return this")
    double doubleValue();

	/**
	 * Int value int.
	 *
	 * @return the int
	 */
	@JSBody(script = "return this")
    int intValue();

	/**
	 * Byte value byte.
	 *
	 * @return the byte
	 */
	@JSBody(script = "return this")
    byte byteValue();

	/**
	 * Char value char.
	 *
	 * @return the char
	 */
	@JSBody(script = "return this")
    char charValue();

	/**
	 * Short value short.
	 *
	 * @return the short
	 */
	@JSBody(script = "return this")
    short shortValue();

	/**
	 * Float value float.
	 *
	 * @return the float
	 */
	@JSBody(script = "return this")
    float floatValue();

	/**
	 * Boolean value boolean.
	 *
	 * @return the boolean
	 */
	@JSBody(script = "return this")
    boolean booleanValue();

	/**
	 * String value string.
	 *
	 * @return the string
	 */
	@JSBody(script = "return this")
    String stringValue();

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
