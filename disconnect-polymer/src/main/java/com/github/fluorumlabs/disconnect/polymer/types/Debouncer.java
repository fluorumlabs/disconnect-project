package com.github.fluorumlabs.disconnect.polymer.types;

import js.lang.Any;

/**
 * Created by Artem Godin on 2/3/2020.
 */
@Deprecated
public interface Debouncer extends Any {
	/**
	 * Is active boolean.
	 *
	 * @return the boolean
	 */
	boolean isActive();

	/**
	 * Cancel.
	 */
	void cancel();

	/**
	 * Flush.
	 */
	void flush();
}
