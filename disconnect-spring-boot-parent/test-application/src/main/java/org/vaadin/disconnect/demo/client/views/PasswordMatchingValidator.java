package org.vaadin.disconnect.demo.client.views;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import java.util.Objects;

/**
 * Created by Artem Godin on 10/11/2019.
 */
public class PasswordMatchingValidator implements ConstraintValidator<PasswordsMatch, UserDetails> {
    @Override
    public boolean isValid(UserDetails value, ConstraintValidatorContext context) {
        return Objects.equals(value.getPassword(), value.getConfirmPassword());
    }

    @Override
    public void initialize(PasswordsMatch constraintAnnotation) {

    }
}
