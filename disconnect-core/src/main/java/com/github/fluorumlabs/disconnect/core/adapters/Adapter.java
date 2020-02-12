package com.github.fluorumlabs.disconnect.core.adapters;

import js.lang.Unknown;
import js.util.collections.Array;

/**
 * Created by Artem Godin on 2/10/2020.
 */
public interface Adapter {
	Unknown get(Object instance, String key);
	boolean set(Object instance, String key, Unknown value);
	boolean has(Object instance, String key);
	Array<Unknown> keys(Object instance);
}
