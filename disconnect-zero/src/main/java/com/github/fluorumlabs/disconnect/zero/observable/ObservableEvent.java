package com.github.fluorumlabs.disconnect.zero.observable;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;


public class ObservableEvent<VALUE> extends SimpleObservableEvent {
    public Observable<VALUE> asObservable() {
        Observable<VALUE> observable = new Observable<>();
        acceptImplQuiet(value -> observable.pushNewValue((VALUE)value, true));
        return observable;
    }

    public <NEW_VALUE> ObservableEvent<NEW_VALUE> map(Function<VALUE, NEW_VALUE> mapper) {
        ObservableEvent<NEW_VALUE> newSignal = new ObservableEvent<>();
        acceptImplQuiet(value -> newSignal.trigger(mapper.apply((VALUE) value)));
        return newSignal;
    }

    public <NEW_VALUE> ObservableEvent<NEW_VALUE> mapAsync(Function<VALUE, NEW_VALUE> mapper) {
        ObservableEvent<NEW_VALUE> newSignal = new ObservableEvent<>();
        acceptImplQuiet(value -> new Thread(() -> newSignal.trigger(mapper.apply((VALUE) value))).start());
        return newSignal;
    }

    public ObservableEvent<VALUE> filter(Predicate<VALUE> predicate) {
        ObservableEvent<VALUE> newSignal = new ObservableEvent<>();
        acceptImplQuiet(value -> {
            if (predicate.test((VALUE)value)) {
                newSignal.trigger((VALUE)value);
            }
        });
        return newSignal;
    }

    public ObservableEvent<VALUE> filterAsync(Predicate<VALUE> predicate) {
        ObservableEvent<VALUE> newSignal = new ObservableEvent<>();
        acceptImplQuiet(value -> new Thread(() ->{
            if (predicate.test((VALUE)value)) {
                newSignal.trigger((VALUE)value);
            }
        }).start());
        return newSignal;
    }

    public void accept(Consumer<VALUE> handler) {
        acceptImplQuiet(handler);
    }

    public void acceptAsync(Consumer<VALUE> handler) {
        acceptImplQuiet(value -> new Thread(() -> handler.accept((VALUE)value)).start());
    }

    public void trigger(VALUE value) {
        pushNewValue(value);
    }
}
