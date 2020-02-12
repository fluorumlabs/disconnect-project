package com.github.fluorumlabs.disconnect.core.converters;

import js.lang.Unknown;

/**
 * Created by Artem Godin on 2/10/2020.
 */
public interface Converter {
	Object fromJS(Unknown x);
	Unknown toJS(Object x);
}
