package com.github.fluorumlabs.disconnect.core.adapters;

import com.github.fluorumlabs.disconnect.core.converters.Converter;
import com.github.fluorumlabs.disconnect.core.converters.ConverterFactory;
import js.lang.JsNumber;
import js.lang.Unknown;
import js.util.JS;
import js.util.collections.Array;
import org.teavm.metaprogramming.CompileTime;

import java.util.Set;

/**
 * Created by Artem Godin on 2/10/2020.
 */
@CompileTime
public class SetAdapter implements Adapter {
	private final Class<?> itemType;
	private Converter converter = null;

	public SetAdapter(Class<?> itemType) {
		this.itemType = itemType;
		this.converter = ConverterFactory.converterFor(itemType);
	}

	@Override
	public Unknown get(Object instance, String key) {
		if ("length".equals(key)) {
			return Unknown.of(((Set<Object>)instance).size());
		} else if (ListAdapter.isArrayIndex(key)) {
			int index = JsNumber.parseInt(key, 10);
			if (index>=0 && index < ((Set<Object>)instance).size()) {
				Object o = get((Set<Object>) instance, index);
				return o == null ? null : converter.toJS(o);
			}
		}
		return Unknown.undefined();
	}

	@Override
	public boolean set(Object instance, String key, Unknown value) {
		if ("length".equals(key)) {
			return true;
		} else if (ListAdapter.isArrayIndex(key)) {
			int index = JsNumber.parseInt(key, 10);
			Object o = get((Set<Object>) instance, index);
			if ( o != null ) {
				((Set<Object>)instance).remove(o);
			}
			if (!JS.isUndefinedOrNull(value)) {
				((Set<Object>)instance).add(converter.fromJS(value));
			}
			return true;
		}
		return false;
	}

	@Override
	public boolean has(Object instance, String key) {
		if ("length".equals(key)) {
			return true;
		} else if (ListAdapter.isArrayIndex(key)) {
			int index = JsNumber.parseInt(key, 10);
			return index >= 0 && index < ((Set<Object>) instance).size();
		}
		return false;
	}

	@Override
	public Array<Unknown> keys(Object instance) {
		return Array.from(Array.create(((Set)instance).size()).keys().getIterator());
	}

	private static Object get(Set<Object> instance, int index) {
		int i = 0;
		for (Object o : instance) {
			if ( i == index) {
				return o;
			}
			i++;
		}
		return null;
	}

}
