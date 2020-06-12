package com.github.fluorumlabs.disconnect.core.observables;


import js.lang.Any;

import javax.annotation.Nonnull;

public class SimpleObservableEvent extends ObservableBase {
    private static final Object VOID_VALUE = new Object();
    private static final Any VOID_SERIALIZABLE = Any.empty();

    public void accept(Runnable handler) {
        acceptImplQuiet(__ -> handler.run());
    }

    public void acceptAsync(Runnable handler) {
        acceptImplQuiet(__ -> new Thread(handler).start());
    }

    protected void trigger() {
        pushNewValue(VOID_VALUE);
    }

    @Override
    void pushNewValue(@Nonnull Object value) {
        pushNewValue(value, true);
    }

    @Override
    void pushNewValue(@Nonnull Object value, boolean forcePropagation) {
        setCurrentValue(value, VOID_SERIALIZABLE);
        markAsDirty();
    }

    @Override
    void setCurrentValue(@Nonnull Object value) {
        setCurrentValue(value, VOID_SERIALIZABLE);
    }
}
