package com.github.fluorumlabs.disconnect.core.observables;


import java.io.Serializable;

public interface WritableObservable<VALUE extends Serializable> {
    void set(VALUE value);

    void markAsDirty();
}
