package com.github.fluorumlabs.disconnect.polymer.types;

import js.lang.Any;
import js.util.collections.Array;
import org.teavm.jso.JSProperty;

/**
 * Created by Artem Godin on 2/3/2020.
 */
public interface ReadonlySpliceRecord<T extends Any> extends Any {
	@JSProperty
	int getIndex();

	@JSProperty
	Array<T> getRemoved();

	@JSProperty
	int getAddedCount();
}
