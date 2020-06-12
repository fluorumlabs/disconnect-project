package com.github.fluorumlabs.disconnect.core.observables;

import com.github.fluorumlabs.disconnect.core.Application;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;


public class BiObservable<VALUE_A , VALUE_B > extends ObservableBase<Pair<VALUE_A, VALUE_B>> {
    BiObservable() {
        setCurrentValue(Pair.of(null, null));
    }

    public <NEW_VALUE > Observable<NEW_VALUE> map(BiFunction<VALUE_A, VALUE_B, NEW_VALUE> mapper) {
        Observable<NEW_VALUE> observable = new Observable<>();
        acceptImpl(valuePair -> observable.pushNewValue(mapper.apply(valuePair.getValueA(), valuePair.getValueB())));
        return observable;
    }

    public <NEW_VALUE > Observable<NEW_VALUE> mapAsync(BiFunction<VALUE_A, VALUE_B, NEW_VALUE> mapper) {
        Observable<NEW_VALUE> observable = new Observable<>();
        acceptImpl(valuePair -> new Thread(() -> observable.pushNewValue(mapper.apply(valuePair.getValueA(),
                valuePair.getValueB()))).start());
        return observable;
    }

    public <NEW_VALUE , VALUE_C > Observable<NEW_VALUE> map(TriFunction<VALUE_A, VALUE_B, VALUE_C, NEW_VALUE> mapper,
                                                          Observable<VALUE_C> other) {
        return Observable.join(this, other).apply(mapper);
    }

    public <NEW_VALUE , VALUE_C > Observable<NEW_VALUE> mapAsync(TriFunction<VALUE_A, VALUE_B, VALUE_C, NEW_VALUE> mapper,
                                                               Observable<VALUE_C> other) {
        return Observable.join(this, other).applyAsync(mapper);
    }

    public Forked<VALUE_A, VALUE_B> when(BiPredicate<VALUE_A, VALUE_B> predicate) {
        Forked<VALUE_A, VALUE_B> forkedObserver = new Forked<>();
        acceptImpl(valuePair -> forkedObserver.pushNewValue(valuePair.toTriplet(predicate.test(valuePair.getValueA(),
                valuePair.getValueB()))));
        return forkedObserver;
    }

    public Forked<VALUE_A, VALUE_B> whenAsync(BiPredicate<VALUE_A, VALUE_B> predicate) {
        Forked<VALUE_A, VALUE_B> forkedObserver = new Forked<>();
        acceptImpl(valuePair -> new Thread(() -> forkedObserver.pushNewValue(valuePair.toTriplet(predicate.test(valuePair.getValueA(), valuePair.getValueB())))).start());
        return forkedObserver;
    }

    public BiObservable<VALUE_A, VALUE_B> nonNull() {
        BiObservable<VALUE_A, VALUE_B> observable = new BiObservable<>();
        acceptImpl(value -> {
            if (value.getValueA() != null && value.getValueB() != null) {
                observable.pushNewValue(value);
            }
        });
        return observable;
    }


    public BiObservable<VALUE_A, VALUE_B> filter(BiPredicate<VALUE_A, VALUE_B> predicate) {
        BiObservable<VALUE_A, VALUE_B> observable = new BiObservable<>();
        acceptImpl(value -> {
            if (predicate.test(value.getValueA(), value.getValueB())) {
                observable.pushNewValue(value);
            }
        });
        return observable;
    }

    public BiObservable<VALUE_A, VALUE_B> filterAsync(BiPredicate<VALUE_A, VALUE_B> predicate) {
        BiObservable<VALUE_A, VALUE_B> observable = new BiObservable<>();
        acceptImpl(value -> new Thread(() -> {
            if (predicate.test(value.getValueA(), value.getValueB())) {
                observable.pushNewValue(value);
            }
        }).start());
        return observable;
    }

    public <VALUE_C > BiObservable<VALUE_A, VALUE_B> filter(TriPredicate<VALUE_A, VALUE_B, VALUE_C> predicate,
                                                           Observable<VALUE_C> other) {
        BiObservable<VALUE_A, VALUE_B> observable = new BiObservable<>();
        Observable.join(this, other).filter(predicate).acceptImpl(observable::pushNewValue);
        return observable;
    }

    public <VALUE_C > BiObservable<VALUE_A, VALUE_B> filterAsync(TriPredicate<VALUE_A, VALUE_B, VALUE_C> predicate,
                                                                Observable<VALUE_C> other) {
        BiObservable<VALUE_A, VALUE_B> observable = new BiObservable<>();
        Observable.join(this, other).filterAsync(predicate).acceptImpl(observable::pushNewValue);
        return observable;
    }

    public BiObservable<VALUE_A, VALUE_B> on(SimpleObservableEvent event) {
        Delayed<VALUE_A, VALUE_B> observable = new Delayed<>();
        acceptImpl(observable::setPendingValue);
        event.accept(observable::acceptPendingValue);
        return observable;
    }

    public BiObservable<VALUE_A, VALUE_B> debounce(int milliseconds) {
        BiObservable<VALUE_A, VALUE_B> observable = new BiObservable<>();
        acceptImpl(value -> Application.debounce(observable, () -> observable.pushNewValue(value), milliseconds));
        return observable;
    }

    public BiObservable<VALUE_A, VALUE_B> accept(BiConsumer<VALUE_A, VALUE_B> consumer) {
        acceptImpl(valuePair -> consumer.accept(valuePair.getValueA(), valuePair.getValueB()));
        return this;
    }

    public BiObservable<VALUE_A, VALUE_B> acceptAsync(BiConsumer<VALUE_A, VALUE_B> consumer) {
        acceptImpl(valuePair -> new Thread(() -> consumer.accept(valuePair.getValueA(), valuePair.getValueB())).start());
        return this;
    }

    public BiObservable<VALUE_A, VALUE_B> accept(Runnable runnable) {
        acceptImpl(valuePair -> runnable.run());
        return this;
    }

    public BiObservable<VALUE_A, VALUE_B> acceptAsync(Runnable runnable) {
        acceptImpl(valuePair -> new Thread(runnable).start());
        return this;
    }

    @Nullable
    public VALUE_A getLeft() {
        return getCurrentValue() != null ? getCurrentValue().getValueA() : null;
    }

    @Nullable
    public VALUE_B getRight() {
        return getCurrentValue() != null ? getCurrentValue().getValueB() : null;
    }

    @Override
    boolean hasValue() {
        return getCurrentValue() != null && getCurrentValue().hasValue();
    }

    public static class Delayed<LEFT_VALUE , RIGHT_VALUE > extends BiObservable<LEFT_VALUE, RIGHT_VALUE> {
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
                clearValue();
            }
        }
    }

    public static class Forked<LEFT_VALUE , RIGHT_VALUE >
            extends ObservableBase<Triplet<LEFT_VALUE, RIGHT_VALUE, Boolean>> {
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

        public BiObservable.Forked<LEFT_VALUE, RIGHT_VALUE> thenAsync(BiConsumer<LEFT_VALUE, RIGHT_VALUE> consumer) {
            acceptImpl(valueTriplet -> {
                if (valueTriplet.getValueC()) {
                    new Thread(() -> consumer.accept(valueTriplet.getValueA(), valueTriplet.getValueB())).start();
                }
            });
            return this;
        }

        public BiObservable.Forked<LEFT_VALUE, RIGHT_VALUE> then(Runnable runnable) {
            acceptImpl(valueTriplet -> {
                if (valueTriplet.getValueC()) {
                    runnable.run();
                }
            });
            return this;
        }

        public BiObservable.Forked<LEFT_VALUE, RIGHT_VALUE> thenAsync(Runnable runnable) {
            acceptImpl(valueTriplet -> {
                if (valueTriplet.getValueC()) {
                    new Thread(runnable).start();
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

        public BiObservable.Forked<LEFT_VALUE, RIGHT_VALUE> orElseAsync(BiConsumer<LEFT_VALUE, RIGHT_VALUE> consumer) {
            acceptImpl(valueTriplet -> {
                if (!valueTriplet.getValueC()) {
                    new Thread(() -> consumer.accept(valueTriplet.getValueA(), valueTriplet.getValueB())).start();
                }
            });
            return this;
        }

        public BiObservable.Forked<LEFT_VALUE, RIGHT_VALUE> orElse(Runnable runnable) {
            acceptImpl(valueTriplet -> {
                if (!valueTriplet.getValueC()) {
                    runnable.run();
                }
            });
            return this;
        }

        public BiObservable.Forked<LEFT_VALUE, RIGHT_VALUE> orElseAsync(Runnable runnable) {
            acceptImpl(valueTriplet -> {
                if (!valueTriplet.getValueC()) {
                    new Thread(runnable).start();
                }
            });
            return this;
        }

        @Override
        void pushNewValue(@Nonnull Triplet<LEFT_VALUE, RIGHT_VALUE, Boolean> value) {
            pushNewValue(value, true);
        }

    }
}
