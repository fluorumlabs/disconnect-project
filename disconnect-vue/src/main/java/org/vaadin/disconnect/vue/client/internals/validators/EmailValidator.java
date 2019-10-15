/*
 * Hibernate Validator, declare and validate application constraints
 *
 * License: Apache License, Version 2.0
 * See the license.txt file in the root directory or <http://www.apache.org/licenses/LICENSE-2.0>.
 */
package org.vaadin.disconnect.vue.client.internals.validators;

import org.teavm.jso.JSMethod;
import org.teavm.jso.JSObject;
import org.teavm.jso.core.JSRegExp;
import org.vaadin.disconnect.core.annotations.Import;
import org.vaadin.disconnect.core.annotations.ImportObject;
import org.vaadin.disconnect.core.annotations.NpmPackage;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import javax.validation.constraints.Email;
import javax.validation.constraints.Pattern;

import static java.util.regex.Pattern.*;

/**
 * @author Hardy Ferentschik
 */
public class EmailValidator implements ConstraintValidator<Email, CharSequence> {

	private JSRegExp regExp;

	@Override
	public void initialize(Email parameters) {
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

		String string = value.toString();

		return InternalEmailValidator.instance.validate(string) && regExp.test(string);
	}

	@NpmPackage(name = "email-validator")
	private static abstract class InternalEmailValidator implements JSObject {
		@ImportObject(module = "email-validator")
		private static InternalEmailValidator instance;

		@JSMethod
		private native boolean validate(String email);
	}
}
