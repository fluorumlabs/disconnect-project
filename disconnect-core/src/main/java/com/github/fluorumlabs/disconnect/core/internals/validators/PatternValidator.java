/*
 * Hibernate Validator, declare and validate application constraints
 *
 * License: Apache License, Version 2.0
 * See the license.txt file in the root directory or <http://www.apache.org/licenses/LICENSE-2.0>.
 */
package com.github.fluorumlabs.disconnect.core.internals.validators;

import js.util.RegExp;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import javax.validation.constraints.Pattern;

import static java.util.regex.Pattern.*;

/**
 * @author Hardy Ferentschik
 */
public class PatternValidator implements ConstraintValidator<Pattern, CharSequence> {

	private RegExp regExp;

	@Override
	public void initialize(Pattern parameters) {
		Pattern.Flag[] flags = parameters.flags();
		StringBuilder jsFlags = new StringBuilder();
		for (Pattern.Flag flag : flags) {
			switch (flag.getValue()) {
				case CASE_INSENSITIVE:
					jsFlags.append('i'); break;
				case MULTILINE:
					jsFlags.append('m'); break;
				case DOTALL:
					jsFlags.append('d'); break;
				case UNICODE_CASE:
					jsFlags.append('u'); break;
			}
		}
		String jsFlagsString = jsFlags.toString();

		regExp = RegExp.create(parameters.regexp(), jsFlagsString);
	}

	@Override
	public boolean isValid(CharSequence value, ConstraintValidatorContext constraintValidatorContext) {
		if ( value == null ) {
			return true;
		}

		return regExp.test(value.toString());
	}
}
