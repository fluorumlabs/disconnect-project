package com.github.fluorumlabs.disconnect.core.events;


public class Target<T> {
    private final T target;

    public Target(T target) {
        this.target = target;
    }

    public T getTarget() {
        return target;
    }
}
