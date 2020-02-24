package com.github.fluorumlabs.disconnect.zero.observable;


public class SimpleObservableEvent extends ObservableBase {
    public void accept(Runnable handler) {
        acceptImpl(__ -> handler.run());
    }

    public void acceptAsync(Runnable handler) {
        acceptImpl(__ -> new Thread(handler).start());
    }

    protected void trigger() {
        pushNewValue(null);
    }

    @Override
    boolean equalFunction(Object a, Object b) {
        return false;
    }
}
