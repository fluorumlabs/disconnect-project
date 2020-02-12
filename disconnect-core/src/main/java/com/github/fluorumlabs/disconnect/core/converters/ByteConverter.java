package com.github.fluorumlabs.disconnect.core.converters;

import js.lang.Unknown;

/**
 * Created by Artem Godin on 2/10/2020.
 */
public class ByteConverter implements Converter {
	public static final Converter INSTANCE = new ByteConverter();

	@Override
	public Byte fromJS(Unknown x) {
		return x.byteValue();
	}

	@Override
	public Unknown toJS(Object x) {
		return Unknown.of((Byte)x);
	}
}
