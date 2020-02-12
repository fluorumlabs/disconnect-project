package com.github.fluorumlabs.disconnect.core.converters;

import com.github.fluorumlabs.disconnect.core.ObjectMirror;
import js.lang.Unknown;

import java.io.Serializable;

/**
 * Created by Artem Godin on 2/10/2020.
 */
public class ObjectConverter implements Converter {
	private final Class<?> objectType;

	public ObjectConverter(Class<?> objectType) {
		this.objectType = objectType;
	}

	@Override
	public Object fromJS(Unknown x) {
		return ObjectMirror.from((Class<Serializable>)objectType, x);
	}

	@Override
	public Unknown toJS(Object x) {
		return ObjectMirror.from((Serializable)x).cast();
	}
}
