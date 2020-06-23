package com.github.fluorumlabs.disconnect.core.validation;

import java.util.*;

/**
 * Created by Artem Godin on 10/10/2019.
 */
public class ValidationResult {
    private static final ValidationResult VALID = new ValidationResult();

    private final List<String> validationErrors;

    ValidationResult(ValidationResult other) {
        validationErrors = Collections.unmodifiableList(other.validationErrors);
    }

    ValidationResult() {
        validationErrors = new ArrayList<>();
    }

    public boolean isValid() {
        return validationErrors.isEmpty();
    }

    public List<String> getErrors() {
        return validationErrors;
    }

    public String first() {
        return validationErrors.isEmpty() ? "" : validationErrors.get(0);
    }

    void addError(String error) {
        validationErrors.add(error);
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
