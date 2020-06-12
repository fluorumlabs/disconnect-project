package com.github.fluorumlabs.disconnect.core.observables;

import java.io.Serializable;
import java.util.Objects;


public class Pair<A ,B > implements Serializable {
    private final A valueA;
    private final B valueB;

    protected Pair(A valueA, B valueB) {
        this.valueA = valueA;
        this.valueB = valueB;
    }

    public static <A ,B > Pair<A,B> of(A a, B b) {
        return new Pair<>(a,b);
    }

    <C > Triplet<A, B, C> toTriplet(C c) {
        return new Triplet<>(valueA, valueB, c);
    }

    protected A getValueA() {
        return valueA;
    }

    protected B getValueB() {
        return valueB;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pair<?, ?> pair = (Pair<?, ?>) o;
        return Objects.deepEquals(valueA, pair.valueA) &&
                Objects.deepEquals(valueB, pair.valueB);
    }

    @Override
    public int hashCode() {
        return Objects.hash(valueA, valueB);
    }

    public boolean hasValue() {
        return valueA != null && valueB != null;
    }
}
