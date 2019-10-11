package org.vaadin.disconnect.vue.client.validation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

/**
 * Created by Artem Godin on 10/10/2019.
 */
public class ValidationResult {
    private final static ValidationResult VALID = new ValidationResult();

    private final List<String> validationErrors;

    ValidationResult() {
        validationErrors = new ArrayList<>();
    }

    private ValidationResult(String... errors) {
        validationErrors = Arrays.asList(errors);
    }

    public boolean isValid() {
        return validationErrors.isEmpty();
    }

    public String[] getErrors() {
        return (String[]) validationErrors.toArray();
    }

    public String first() {
        return validationErrors.isEmpty() ? "" : validationErrors.get(0);
    }

    void addError(String error) {
        validationErrors.add(error);
    }

    public static ValidationResult valid() {
        return VALID;
    }

    public static ValidationResult of(String... errors) {
        return new ValidationResult(errors);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ValidationResult that = (ValidationResult) o;

        return Objects.equals(validationErrors, that.validationErrors);

    }

    @Override
    public int hashCode() {
        return validationErrors != null ? validationErrors.hashCode() : 0;
    }
}
