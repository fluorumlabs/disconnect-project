package com.github.fluorumlabs.disconnect.core.observables;


import java.util.function.Function;

public class ObservableValue<VALUE > extends Observable<VALUE> {
    ObservableValue(VALUE value) {
        setCurrentValue(value);
    }

    ObservableValue() {
    }

    public static <VALUE > ObservableValue<VALUE> of(VALUE value) {
        return new ObservableValue<>(value);
    }

    public static <VALUE > ObservableValue<VALUE> empty() {
        return new ObservableValue<>();
    }

    public void set(VALUE newValue) {
        pushNewValue(newValue);
    }

    public void refresh() {
        pushNewValue(getCurrentValue());
    }

    public <NEW_VALUE > ObservableValue<NEW_VALUE> map(Function<VALUE, NEW_VALUE> mapper, Function<NEW_VALUE,VALUE> reverseMapper) {
        ObservableValue<NEW_VALUE> observable = empty();
        bind(observable, mapper, reverseMapper);
        return observable;
    }

    public <NEW_VALUE > void bind(ObservableValue<NEW_VALUE> other, Function<VALUE, NEW_VALUE> mapper, Function<NEW_VALUE,VALUE> reverseMapper) {
        acceptImpl(value -> other.pushNewValue(mapper.apply(value)));
        other.acceptImpl(newValue -> pushNewValue(reverseMapper.apply(newValue)));
    }

    public void bind(ObservableValue<VALUE> other) {
        acceptImpl(other::pushNewValue);
        other.acceptImpl(this::pushNewValue);
    }
}
