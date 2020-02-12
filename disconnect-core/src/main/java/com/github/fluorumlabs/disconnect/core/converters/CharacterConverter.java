package com.github.fluorumlabs.disconnect.core.converters;

import js.lang.Unknown;

/**
 * Created by Artem Godin on 2/10/2020.
 */
public class CharacterConverter implements Converter {
	public static final Converter INSTANCE = new CharacterConverter();

	@Override
	public Character fromJS(Unknown x) {
		return x.charValue();
	}

	@Override
	public Unknown toJS(Object x) {
		return Unknown.of((Character)x);
	}
}
