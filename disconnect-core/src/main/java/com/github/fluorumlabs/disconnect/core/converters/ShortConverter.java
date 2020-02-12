package com.github.fluorumlabs.disconnect.core.converters;

import js.lang.Unknown;

/**
 * Created by Artem Godin on 2/10/2020.
 */
public class ShortConverter implements Converter {
	public static final Converter INSTANCE = new ShortConverter();

	@Override
	public Short fromJS(Unknown x) {
		return x.shortValue();
	}

	@Override
	public Unknown toJS(Object x) {
		return Unknown.of((Short)x);
	}
}
