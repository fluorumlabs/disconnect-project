package com.github.fluorumlabs.disconnect.core.observables;

import java.util.function.Consumer;


public interface ReadableObservable<VALUE > {
    Observable<VALUE> accept(Consumer<VALUE> consumer);

    VALUE get();
}
