package com.github.fluorumlabs.disconnect.core.internals;

/**
 * Created by Artem Godin on 10/3/2019.
 */
public class ValidationException extends RuntimeException {
    /**
     * Constructs a new exception with the specified detail message.  The
     * cause is not initialized, and may subsequently be initialized by
     * a call to {@link #initCause}.
     *
     * @param message the detail message. The detail message is saved for
     *                later retrieval by the {@link #getMessage()} method.
     */
    public ValidationException(String message) {
        super(message);
    }
}
