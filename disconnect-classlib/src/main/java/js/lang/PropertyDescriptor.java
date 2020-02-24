package js.lang;

import org.teavm.jso.JSProperty;


/**
 * The interface Property descriptor.
 */
public interface PropertyDescriptor extends Any {
	/**
	 * Is configurable boolean.
	 *
	 * @return the boolean
	 */
	@JSProperty
    boolean isConfigurable();

	/**
	 * Sets configurable.
	 *
	 * @param value the value
	 */
	@JSProperty
    void setConfigurable(boolean value);

	/**
	 * Is enumerable boolean.
	 *
	 * @return the boolean
	 */
	@JSProperty
    boolean isEnumerable();

	/**
	 * Sets enumerable.
	 *
	 * @param value the value
	 */
	@JSProperty
    void setEnumerable(boolean value);

	/**
	 * Gets value.
	 *
	 * @return the value
	 */
	@JSProperty
    Any getValue();

	/**
	 * Sets value.
	 *
	 * @param value the value
	 */
	@JSProperty
    void setValue(Any value);

	/**
	 * Is writable boolean.
	 *
	 * @return the boolean
	 */
	@JSProperty
    boolean isWritable();

	/**
	 * Sets writable.
	 *
	 * @param value the value
	 */
	@JSProperty
    void setWritable(boolean value);

	/**
	 * Get any.
	 *
	 * @return the any
	 */
	Any get();

	/**
	 * Set.
	 *
	 * @param v the v
	 */
	void set(Any v);
}
