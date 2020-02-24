package com.github.fluorumlabs.disconnect.core.converters;

import com.github.fluorumlabs.disconnect.core.ObjectMirror;
import js.lang.Unknown;

import java.io.Serializable;
import java.util.Map;

/**
 * Created by Artem Godin on 2/10/2020.
 */
public class StringMapConverter implements Converter {
	private final Class<?> objectType;

	public StringMapConverter(Class<?> objectType) {
		this.objectType = objectType;
	}

	@Override
	public Map<String, Serializable> fromJS(Unknown x) {
		return ObjectMirror.fromStringMap((Class<Serializable>)objectType, x);
	}

	@Override
	public Unknown toJS(Object x) {
		return ObjectMirror.fromStringMap((Class<Serializable>)objectType, (Map)x).cast();
	}
}
