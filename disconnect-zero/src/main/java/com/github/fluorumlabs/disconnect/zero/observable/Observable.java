package com.github.fluorumlabs.disconnect.zero.observable;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;


public class Observable<VALUE> extends ObservableBase<VALUE> implements ReadableObservable<VALUE>{
    Observable() {}

    public static <VALUE> Observable<VALUE> of(VALUE value) {
        Observable<VALUE> observable = new Observable<>();
        observable.setCurrentValue(value);
        return observable;
    }

    public <NEW_VALUE> Observable<NEW_VALUE> map(Function<VALUE, NEW_VALUE> mapper) {
        Observable<NEW_VALUE> observable = new Observable<>();
        acceptImpl(value -> observable.pushNewValue(mapper.apply(value)));
        return observable;
    }

    public Forked<VALUE> when(Predicate<VALUE> predicate) {
        Forked<VALUE> forkedObserver = new Forked<>();
        acceptImpl(value -> forkedObserver.pushNewValue(Pair.of(value, predicate.test(value))));
        return forkedObserver;
    }

    public Observable<VALUE> on(SimpleObservableEvent event) {
        Delayed<VALUE> observable = new Delayed<>();
        acceptImpl(observable::setPendingValue);
        event.accept(observable::acceptPendingValue);
        return observable;
    }

    public void accept(Consumer<VALUE> consumer) {
        acceptImpl(consumer);
    }

    public VALUE get() {
        return getCurrentValue();
    }

    public static class Delayed<VALUE> extends Observable<VALUE> {
        private VALUE pendingValue;
        private boolean hasPendingValue = false;

        void setPendingValue(VALUE value) {
            pendingValue = value;
            hasPendingValue = true;
        }

        void acceptPendingValue() {
            if (hasPendingValue) {
                hasPendingValue = false;
                pushNewValue(pendingValue);
                setCurrentValue(null);
            }
        }

        @Override
        boolean equalFunction(VALUE a, VALUE b) {
            return false;
        }
    }

    public static class Forked<VALUE> extends ObservableBase<Pair<VALUE, Boolean>> {
        public Observable<VALUE> then() {
            Observable<VALUE> observable = new Observable<>();
            acceptImpl(valueBooleanPair -> {
                if (valueBooleanPair.getValueB()) {
                    observable.pushNewValue(valueBooleanPair.getValueA());
                }
            });
            return observable;
        }

        public Observable.Forked<VALUE> then(Consumer<VALUE> consumer) {
            acceptImpl(valueBooleanPair -> {
                if (valueBooleanPair.getValueB()) {
                    consumer.accept(valueBooleanPair.getValueA());
                }
            });
            return this;
        }

        public Observable<VALUE> orElse() {
            Observable<VALUE> observable = new Observable<>();
            acceptImpl(valueBooleanPair -> {
                if (!valueBooleanPair.getValueB()) {
                    observable.pushNewValue(valueBooleanPair.getValueA());
                }
            });
            return observable;
        }

        public Observable.Forked<VALUE> orElse(Consumer<VALUE> consumer) {
            acceptImpl(valueBooleanPair -> {
                if (!valueBooleanPair.getValueB()) {
                    consumer.accept(valueBooleanPair.getValueA());
                }
            });
            return this;
        }

        @Override
        boolean equalFunction(Pair<VALUE, Boolean> a, Pair<VALUE, Boolean> b) {
            return false;
        }
    }
}
