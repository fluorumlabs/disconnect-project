package com.github.fluorumlabs.disconnect.zero.observable;


public interface WritableObservable<VALUE> {
    void set(VALUE value);

    void markAsDirty();
}
