package js.lang;

import org.teavm.jso.JSBody;


/**
 * The type Js boolean.
 */
public abstract class JsBoolean implements Any {
	/**
	 * Of js boolean.
	 *
	 * @param value the value
	 *
	 * @return the js boolean
	 */
	@JSBody(params = "value", script = "return Boolean(value)")
    public static native JsBoolean of(boolean value);

	/**
	 * Create js boolean.
	 *
	 * @param value the value
	 *
	 * @return the js boolean
	 */
	@JSBody(params = "value", script = "return Boolean(value)")
    static JsBoolean create(Any value) {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

	/**
	 * Create js boolean.
	 *
	 * @return the js boolean
	 */
	@JSBody(params = "value", script = "return Boolean()")
    static JsBoolean create() {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

	/**
	 * Prototype js string.
	 *
	 * @return the js string
	 */
	@JSBody(script = "return Boolean.prototype")
    static JsString prototype() {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

	/**
	 * Returns the primitive value of the specified object.
	 *
	 * @return the boolean
	 */
	public native boolean valueOf();
}
