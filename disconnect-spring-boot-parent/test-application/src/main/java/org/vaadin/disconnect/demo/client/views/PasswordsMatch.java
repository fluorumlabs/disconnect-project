package org.vaadin.disconnect.demo.client.views;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.*;
import static java.lang.annotation.RetentionPolicy.RUNTIME;


@Constraint(validatedBy = {PasswordMatchingValidator.class})
@Target({METHOD, FIELD, ANNOTATION_TYPE, CONSTRUCTOR, PARAMETER, TYPE_USE})
@Retention(RUNTIME)
public @interface PasswordsMatch {
    String message() default "passwords must match";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};
}
