package com.github.fluorumlabs.disconnect.core.converters;

import js.lang.Unknown;

/**
 * Created by Artem Godin on 2/10/2020.
 */
public class BooleanConverter implements Converter {
	public static final Converter INSTANCE = new BooleanConverter();

	@Override
	public Boolean fromJS(Unknown x) {
		return x.booleanValue();
	}

	@Override
	public Unknown toJS(Object x) {
		return Unknown.of((Boolean)x);
	}
}
