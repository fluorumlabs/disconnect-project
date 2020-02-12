package com.github.fluorumlabs.disconnect.core.converters;

import js.lang.Unknown;

/**
 * Created by Artem Godin on 2/10/2020.
 */
public class IntegerConverter implements Converter {
	public static final Converter INSTANCE = new IntegerConverter();

	@Override
	public Integer fromJS(Unknown x) {
		return x.intValue();
	}

	@Override
	public Unknown toJS(Object x) {
		return Unknown.of((Integer)x);
	}
}
