package com.github.fluorumlabs.disconnect.core.observables;


public interface WritableObservable<VALUE> {
    void set(VALUE value);

    void markAsDirty();
}
