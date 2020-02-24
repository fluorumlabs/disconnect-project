package com.github.fluorumlabs.disconnect.zero.observable;

import java.util.Objects;


public class Quad<A,B,C,D> extends Triplet<A, B, C> {
    private final D valueD;

    protected Quad(A valueA, B valueB, C valueC, D valueD) {
        super(valueA, valueB, valueC);
        this.valueD = valueD;
    }

    public static <A,B,C,D> Quad<A,B,C,D> of(A a, B b, C c, D d) {
        return new Quad<>(a,b,c,d);
    }

    protected D getValueD() {
        return valueD;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Quad<?, ?, ?, ?> triplet = (Quad<?, ?, ?, ?>) o;
        return super.equals(o) &&
                Objects.deepEquals(valueD, triplet.valueD);
    }

    @Override
    public int hashCode() {
        return Objects.hash(getValueA(), getValueB(), getValueC(), valueD);
    }
}
