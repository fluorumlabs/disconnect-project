package js.lang;

import org.teavm.jso.JSIndexer;


/**
 * The interface Property descriptor map.
 */
public interface PropertyDescriptorMap extends Any {
	/**
	 * Get property descriptor.
	 *
	 * @param s the s
	 *
	 * @return the property descriptor
	 */
	@JSIndexer
    PropertyDescriptor get(String s);

	/**
	 * Set.
	 *
	 * @param s     the s
	 * @param value the value
	 */
	@JSIndexer
    void set(String s, PropertyDescriptor value);
}
