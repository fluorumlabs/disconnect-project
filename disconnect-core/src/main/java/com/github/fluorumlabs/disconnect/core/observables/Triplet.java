package com.github.fluorumlabs.disconnect.core.observables;

import java.util.Objects;


public class Triplet<A,B,C> extends Pair<A, B> {
    private final C valueC;

    protected Triplet(A valueA, B valueB, C valueC) {
        super(valueA, valueB);
        this.valueC = valueC;
    }

    public static <A,B,C> Triplet<A,B,C> of(A a, B b, C c) {
        return new Triplet<>(a,b,c);
    }

    protected C getValueC() {
        return valueC;
    }

    <D> Quad<A, B, C, D> toQuad(D d) {
        return new Quad<>(getValueA(), getValueB(), getValueC(), d);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Triplet<?, ?, ?> triplet = (Triplet<?, ?, ?>) o;
        return super.equals(o) &&
                Objects.deepEquals(valueC, triplet.valueC);
    }

    @Override
    public int hashCode() {
        return Objects.hash(getValueA(), getValueB(), valueC);
    }
}
