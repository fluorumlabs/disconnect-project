package com.github.fluorumlabs.disconnect.core.converters;

import js.lang.Unknown;

/**
 * Created by Artem Godin on 2/10/2020.
 */
public class FloatConverter implements Converter {
	public static final Converter INSTANCE = new FloatConverter();

	@Override
	public Float fromJS(Unknown x) {
		return x.floatValue();
	}

	@Override
	public Unknown toJS(Object x) {
		return Unknown.of((Float)x);
	}
}
