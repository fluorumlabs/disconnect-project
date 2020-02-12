package com.github.fluorumlabs.disconnect.core.converters;

import com.github.fluorumlabs.disconnect.core.ObjectMirror;
import js.lang.Unknown;

import java.io.Serializable;
import java.util.List;

/**
 * Created by Artem Godin on 2/10/2020.
 */
public class ListConverter implements Converter {
	private final Class<?> objectType;

	public ListConverter(Class<?> objectType) {
		this.objectType = objectType;
	}

	@Override
	public List<Serializable> fromJS(Unknown x) {
		return ObjectMirror.fromList((Class<Serializable>)objectType, x);
	}

	@Override
	public Unknown toJS(Object x) {
		return ObjectMirror.fromList((Class<Serializable>)objectType, (List)x).cast();
	}
}
