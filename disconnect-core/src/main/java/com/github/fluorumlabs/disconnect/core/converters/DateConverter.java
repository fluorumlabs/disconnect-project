package com.github.fluorumlabs.disconnect.core.converters;

import js.lang.Unknown;

import java.util.Date;

/**
 * Created by Artem Godin on 2/10/2020.
 *
 * Beware of Y2K38
 */
public class DateConverter implements Converter {
	public static final Converter INSTANCE = new DateConverter();

	@Override
	public Date fromJS(Unknown x) {
		return new Date(Math.round(x.doubleValue()));
	}

	@Override
	public Unknown toJS(Object x) {
		return Unknown.of(((Date)x).getTime());
	}
}
