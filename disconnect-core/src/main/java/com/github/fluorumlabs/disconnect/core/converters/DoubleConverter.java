package com.github.fluorumlabs.disconnect.core.converters;

import js.lang.Unknown;

/**
 * Created by Artem Godin on 2/10/2020.
 */
public class DoubleConverter implements Converter {
	public static final Converter INSTANCE = new DoubleConverter();

	@Override
	public Double fromJS(Unknown x) {
		return x.doubleValue();
	}

	@Override
	public Unknown toJS(Object x) {
		return Unknown.of((Double)x);
	}
}
