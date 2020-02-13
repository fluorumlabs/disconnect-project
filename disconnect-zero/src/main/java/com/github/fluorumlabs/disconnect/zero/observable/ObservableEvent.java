package com.github.fluorumlabs.disconnect.zero.observable;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;


public class ObservableEvent<VALUE> extends SimpleObservableEvent {
    public Observable<VALUE> asObservable() {
        Observable<VALUE> observable = new Observable<>();
        acceptImpl(value -> observable.pushNewValue((VALUE)value, true));
        return observable;
    }

    public <NEW_VALUE> ObservableEvent<NEW_VALUE> map(Function<VALUE, NEW_VALUE> mapper) {
        ObservableEvent<NEW_VALUE> newSignal = new ObservableEvent<>();
        acceptImpl(value -> newSignal.trigger(mapper.apply((VALUE) value)));
        return newSignal;
    }

    public ObservableEvent<VALUE> filter(Predicate<VALUE> predicate) {
        ObservableEvent<VALUE> newSignal = new ObservableEvent<>();
        acceptImpl(value -> {
            if (predicate.test((VALUE)value)) {
                newSignal.trigger((VALUE)value);
            }
        });
        return newSignal;
    }

    public void accept(Consumer<VALUE> handler) {
        acceptImpl(handler);
    }

    public void trigger(VALUE value) {
        pushNewValue(value);
    }
}
