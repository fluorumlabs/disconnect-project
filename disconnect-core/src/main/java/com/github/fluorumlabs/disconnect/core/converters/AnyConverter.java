package com.github.fluorumlabs.disconnect.core.converters;

import js.lang.Any;
import js.lang.Unknown;

/**
 * Created by Artem Godin on 2/10/2020.
 */
public class AnyConverter implements Converter {
	public static final Converter INSTANCE = new AnyConverter();

	@Override
	public Any fromJS(Unknown x) {
		return x.cast();
	}

	@Override
	public Unknown toJS(Object x) {
		return ((Any)x).cast();
	}
}
