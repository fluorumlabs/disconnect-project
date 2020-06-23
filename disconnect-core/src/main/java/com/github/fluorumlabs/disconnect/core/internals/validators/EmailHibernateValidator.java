/*
 * Hibernate Validator, declare and validate application constraints
 *
 * License: Apache License, Version 2.0
 * See the license.txt file in the root directory or <http://www.apache.org/licenses/LICENSE-2.0>.
 */
package com.github.fluorumlabs.disconnect.core.internals.validators;

import com.github.fluorumlabs.disconnect.core.annotations.ImportObject;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import org.hibernate.validator.constraints.Email;
import org.teavm.jso.JSMethod;
import org.teavm.jso.JSObject;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

/**
 * @author Hardy Ferentschik
 */
public class EmailHibernateValidator implements ConstraintValidator<org.hibernate.validator.constraints.Email, CharSequence> {


	@Override
	public void initialize(Email parameters) {
	}

	@Override
	public boolean isValid(CharSequence value, ConstraintValidatorContext constraintValidatorContext) {
		if ( value == null ) {
			return true;
		}

		String string = value.toString();

		return InternalEmailValidator.instance.validate(string);
	}

	@NpmPackage(name = "email-validator", version = "^2.0.4")
	private abstract static class InternalEmailValidator implements JSObject {
		@ImportObject(module = "email-validator")
		private static InternalEmailValidator instance;

		@JSMethod
		private native boolean validate(String email);
	}

}
