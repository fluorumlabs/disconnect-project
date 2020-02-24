package com.github.fluorumlabs.disconnect.polymer.types;

import js.lang.Any;
import js.util.collections.Array;
import org.teavm.jso.JSProperty;

/**
 * Created by Artem Godin on 2/3/2020.
 *
 * @param <T> the type parameter
 */
public interface ReadonlySpliceRecord<T extends Any> extends Any {
	/**
	 * Gets index.
	 *
	 * @return the index
	 */
	@JSProperty
	int getIndex();

	/**
	 * Gets removed.
	 *
	 * @return the removed
	 */
	@JSProperty
	Array<T> getRemoved();

	/**
	 * Gets added count.
	 *
	 * @return the added count
	 */
	@JSProperty
	int getAddedCount();
}
