/*
 * Hibernate Validator, declare and validate application constraints
 *
 * License: Apache License, Version 2.0
 * See the license.txt file in the root directory or <http://www.apache.org/licenses/LICENSE-2.0>.
 */
package org.vaadin.disconnect.vue.client.internals.validators;

import org.hibernate.validator.constraintvalidation.HibernateConstraintValidatorContext;
import org.hibernate.validator.internal.engine.messageinterpolation.util.InterpolationHelper;
import org.hibernate.validator.internal.util.logging.Log;
import org.hibernate.validator.internal.util.logging.LoggerFactory;
import org.teavm.jso.core.JSRegExp;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import javax.validation.constraints.Pattern;
import java.lang.invoke.MethodHandles;
import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.PatternSyntaxException;

import static java.util.regex.Pattern.*;
import static org.teavm.metaprogramming.Metaprogramming.exit;

/**
 * @author Hardy Ferentschik
 */
public class PatternValidator implements ConstraintValidator<Pattern, CharSequence> {

	private JSRegExp regExp;

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

		regExp = JSRegExp.create(parameters.regexp(), jsFlagsString);
	}

	@Override
	public boolean isValid(CharSequence value, ConstraintValidatorContext constraintValidatorContext) {
		if ( value == null ) {
			return true;
		}

		return regExp.test(value.toString());
	}
}
