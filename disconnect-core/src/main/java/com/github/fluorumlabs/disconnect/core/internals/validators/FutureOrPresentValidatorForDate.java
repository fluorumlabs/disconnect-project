package com.github.fluorumlabs.disconnect.core.internals.validators;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import javax.validation.constraints.Future;
import java.util.Date;

/**
 * Created by Artem Godin on 10/15/2019.
 */
public class FutureOrPresentValidatorForDate implements ConstraintValidator<Future, Date> {
    @Override
    public boolean isValid(Date value, ConstraintValidatorContext context) {
        if ( value == null ) {
            return true;
        }
        return !value.before(new Date());
    }
}
