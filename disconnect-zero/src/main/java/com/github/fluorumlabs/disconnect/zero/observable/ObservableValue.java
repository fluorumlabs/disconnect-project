package com.github.fluorumlabs.disconnect.zero.observable;


public class ObservableValue<VALUE> extends Observable<VALUE> {
    ObservableValue(VALUE value) {
        setCurrentValue(value);
    }

    public static <VALUE> ObservableValue<VALUE> of(VALUE value) {
        return new ObservableValue<>(value);
    }

    public static <VALUE> ObservableValue<VALUE> empty() {
        return new ObservableValue<>(null);
    }

    public void set(VALUE newValue) {
        pushNewValue(newValue);
    }

    public void markAsDirty() {
        super.markAsDirty();
    }
}
