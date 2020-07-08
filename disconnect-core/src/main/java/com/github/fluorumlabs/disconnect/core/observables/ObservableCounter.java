package com.github.fluorumlabs.disconnect.core.observables;

import com.github.fluorumlabs.disconnect.core.utils.Lazy;

/**
 * Created by Artem Godin on 6/23/2020.
 */
public class ObservableCounter extends Observable<Integer> {
    private final int initialValue;

    private final Lazy<Forked<Integer>> initialForked;
    private final Lazy<Forked<Integer>> greaterForked;
    private final Lazy<Forked<Integer>> lessForked;

    private ObservableCounter(int initialValue) {
        this.initialValue = initialValue;
        pushNewValue(initialValue);

        initialForked = Lazy.from(() -> when(v -> v == initialValue));
        greaterForked = Lazy.from(() -> when(v -> v > initialValue));
        lessForked = Lazy.from(() -> when(v -> v < initialValue));
    }

    public static ObservableCounter zero() {
        return new ObservableCounter(0);
    }

    public static ObservableCounter of(int initialValue) {
        return new ObservableCounter(initialValue);
    }

    public void reset() {
        pushNewValue(initialValue);
    }

    public void increment(int value) {
        assert getCurrentValue() != null : "Current value is not null";
        pushNewValue(getCurrentValue() + value);
    }

    public void decrement(int value) {
        assert getCurrentValue() != null : "Current value is not null";
        pushNewValue(getCurrentValue() - value);
    }

    public void increment() {
        increment(1);
    }

    public void decrement() {
        decrement(1);
    }

    public Forked<Integer> whenInitial() {
        return initialForked.get();
    }

    public Forked<Integer> whenGreater() {
        return greaterForked.get();
    }

    public Forked<Integer> whenLess() {
        return lessForked.get();
    }

}
