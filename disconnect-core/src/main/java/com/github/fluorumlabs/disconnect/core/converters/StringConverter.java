package com.github.fluorumlabs.disconnect.core.converters;

import js.lang.Unknown;

/**
 * Created by Artem Godin on 2/10/2020.
 */
public class StringConverter implements Converter {
	public static final Converter INSTANCE = new StringConverter();

	@Override
	public String fromJS(Unknown x) {
		return x.stringValue();
	}

	@Override
	public Unknown toJS(Object x) {
		return Unknown.of((String)x);
	}
}
