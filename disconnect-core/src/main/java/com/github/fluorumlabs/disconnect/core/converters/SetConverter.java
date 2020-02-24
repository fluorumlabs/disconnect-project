package com.github.fluorumlabs.disconnect.core.converters;

import com.github.fluorumlabs.disconnect.core.ObjectMirror;
import js.lang.Unknown;

import java.io.Serializable;
import java.util.Set;

/**
 * Created by Artem Godin on 2/10/2020.
 */
public class SetConverter implements Converter {
	private final Class<?> objectType;

	public SetConverter(Class<?> objectType) {
		this.objectType = objectType;
	}

	@Override
	public Set<Serializable> fromJS(Unknown x) {
		return ObjectMirror.fromSet((Class<Serializable>)objectType, x);
	}

	@Override
	public Unknown toJS(Object x) {
		return ObjectMirror.fromSet((Class<Serializable>)objectType, (Set)x).cast();
	}
}
