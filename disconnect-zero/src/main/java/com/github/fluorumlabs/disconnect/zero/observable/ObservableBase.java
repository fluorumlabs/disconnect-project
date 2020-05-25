package com.github.fluorumlabs.disconnect.zero.observable;

import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;
import java.util.Objects;
import java.util.Vector;
import java.util.function.Consumer;


abstract class ObservableBase<VALUE> {
    private VALUE currentValue = null;
    private final Vector<WeakReference<Consumer<VALUE>>> consumers = new Vector<>(1);
    private final ReferenceQueue<Consumer<VALUE>> queue = new ReferenceQueue<>();

    void acceptImpl(Consumer<VALUE> consumer) {
        acceptImplQuiet(consumer);
        consumer.accept(currentValue);
    }

    void acceptImplQuiet(Consumer<VALUE> consumer) {
        synchronized (consumers) {
            consumers.add(new WeakReference<>(consumer, queue));
        }
    }

    void markAsDirty() {
        // Cleanup first
        for (java.lang.ref.Reference<? extends Consumer<VALUE>> x; (x = queue.poll()) != null; ) {
            synchronized (consumers) {
                consumers.removeElement(x);
            }
        }
        VALUE value = currentValue;
        synchronized (consumers) {
            consumers.forEach(weakReference -> {
                Consumer<VALUE> consumer = weakReference.get();
                if (consumer != null) {
                    consumer.accept(value);
                }
            });
        }
    }

    boolean equalFunction(VALUE a, VALUE b) {
        return Objects.deepEquals(a, b);
    }

    void setCurrentValue(VALUE value) {
        this.currentValue = value;
    }

    void pushNewValue(VALUE value) {
        pushNewValue(value, false);
    }

    void pushNewValue(VALUE value, boolean forcePropagation) {
        if (forcePropagation || !equalFunction(currentValue, value)) {
            this.currentValue = value;
            markAsDirty();
        }
    }

    VALUE getCurrentValue() {
        return currentValue;
    }

}
