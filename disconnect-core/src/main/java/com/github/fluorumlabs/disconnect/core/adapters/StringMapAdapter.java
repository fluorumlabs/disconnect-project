package com.github.fluorumlabs.disconnect.core.adapters;

import com.github.fluorumlabs.disconnect.core.converters.Converter;
import com.github.fluorumlabs.disconnect.core.converters.ConverterFactory;
import js.lang.Unknown;
import js.util.collections.Array;
import org.teavm.metaprogramming.CompileTime;

import java.util.Map;

/**
 * Created by Artem Godin on 2/10/2020.
 */
@CompileTime
public class StringMapAdapter implements Adapter {
	private final Class<?> itemType;
	private Converter converter = null;

	public StringMapAdapter(Class<?> itemType) {
		this.itemType = itemType;
		this.converter = ConverterFactory.converterFor(itemType);
	}

	@Override
	public Unknown get(Object instance, String key) {
		Object o = ((Map<String, Object>) instance).get(key);
		return o == null ? null : converter.toJS(o);
	}

	@Override
	public boolean set(Object instance, String key, Unknown value) {
		((Map<String, Object>) instance).put(key, converter.fromJS(value));
		return true;
	}

	@Override
	public boolean has(Object instance, String key) {
		return  ((Map<String, Object>) instance).containsKey(key);
	}

	@Override
	public Array<Unknown> keys(Object instance) {
		Array<Unknown> keys = Array.create();
		for (String s : ((Map<String, Object>) instance).keySet()) {
			keys.push(Unknown.of(s));
		}
		return keys;
	}
}
