package com.github.fluorumlabs.disconnect.zero.observable;

import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;


public class BiObservable<LEFT_VALUE, RIGHT_VALUE> extends ObservableBase<Pair<LEFT_VALUE, RIGHT_VALUE>> {
    BiObservable() {
        setCurrentValue(Pair.of(null, null));
    }

    public <NEW_VALUE> Observable<NEW_VALUE> map(BiFunction<LEFT_VALUE, RIGHT_VALUE, NEW_VALUE> mapper) {
        Observable<NEW_VALUE> observable = new Observable<>();
        acceptImpl(valuePair -> observable.pushNewValue(mapper.apply(valuePair.getValueA(), valuePair.getValueB())));
        return observable;
    }

    public Forked<LEFT_VALUE, RIGHT_VALUE> when(BiPredicate<LEFT_VALUE, RIGHT_VALUE> predicate) {
        Forked<LEFT_VALUE, RIGHT_VALUE> forkedObserver = new Forked<>();
        acceptImpl(valuePair -> forkedObserver.pushNewValue(valuePair.extend(predicate.test(valuePair.getValueA(), valuePair.getValueB()))));
        return forkedObserver;
    }

    public BiObservable<LEFT_VALUE, RIGHT_VALUE> on(SimpleObservableEvent event) {
        Delayed<LEFT_VALUE, RIGHT_VALUE> observable = new Delayed<>();
        acceptImpl(observable::setPendingValue);
        event.accept(observable::acceptPendingValue);
        return observable;
    }

    public void accept(BiConsumer<LEFT_VALUE, RIGHT_VALUE> consumer) {
        acceptImpl(valuePair -> consumer.accept(valuePair.getValueA(), valuePair.getValueB()));
    }

    public LEFT_VALUE getLeft() {
        return getCurrentValue().getValueA();
    }

    public RIGHT_VALUE getRight() {
        return getCurrentValue().getValueB();
    }

    public static class Delayed<LEFT_VALUE, RIGHT_VALUE> extends BiObservable<LEFT_VALUE, RIGHT_VALUE> {
        private Pair<LEFT_VALUE, RIGHT_VALUE> pendingValue;
        private boolean hasPendingValue = false;

        void setPendingValue(Pair<LEFT_VALUE, RIGHT_VALUE> value) {
            pendingValue = value;
            hasPendingValue = true;
        }

        void acceptPendingValue() {
            if (hasPendingValue) {
                hasPendingValue = false;
                pushNewValue(pendingValue, true);
                setCurrentValue(null);
            }
        }
    }

    public static class Forked<LEFT_VALUE, RIGHT_VALUE> extends ObservableBase<Triplet<LEFT_VALUE, RIGHT_VALUE, Boolean>> {
        Forked() {
            setCurrentValue(Triplet.of(null, null, false));
        }

        public BiObservable<LEFT_VALUE, RIGHT_VALUE> then() {
            BiObservable<LEFT_VALUE, RIGHT_VALUE> observable = new BiObservable<>();
            acceptImpl(valueTriplet -> {
                if (valueTriplet.getValueC()) {
                    observable.pushNewValue(valueTriplet, true);
                }
            });
            return observable;
        }

        public BiObservable.Forked<LEFT_VALUE, RIGHT_VALUE> then(BiConsumer<LEFT_VALUE, RIGHT_VALUE> consumer) {
            acceptImpl(valueTriplet -> {
                if (valueTriplet.getValueC()) {
                    consumer.accept(valueTriplet.getValueA(), valueTriplet.getValueB());
                }
            });
            return this;
        }

        public BiObservable<LEFT_VALUE, RIGHT_VALUE> orElse() {
            BiObservable<LEFT_VALUE, RIGHT_VALUE> observable = new BiObservable<>();
            acceptImpl(valueTriplet -> {
                if (!valueTriplet.getValueC()) {
                    observable.pushNewValue(valueTriplet, true);
                }
            });
            return observable;
        }

        public BiObservable.Forked<LEFT_VALUE, RIGHT_VALUE> orElse(BiConsumer<LEFT_VALUE, RIGHT_VALUE> consumer) {
            acceptImpl(valueTriplet -> {
                if (!valueTriplet.getValueC()) {
                    consumer.accept(valueTriplet.getValueA(), valueTriplet.getValueB());
                }
            });
            return this;
        }

        @Override
        boolean equalFunction(Triplet<LEFT_VALUE, RIGHT_VALUE, Boolean> a, Triplet<LEFT_VALUE, RIGHT_VALUE, Boolean> b) {
            return false;
        }
    }
}
