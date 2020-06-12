package com.github.fluorumlabs.disconnect.core.observables;

import com.github.fluorumlabs.disconnect.core.internals.DisconnectUtils;
import com.github.fluorumlabs.disconnect.core.utils.Serializer;
import js.lang.Any;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;
import java.util.Vector;
import java.util.function.Consumer;


abstract class ObservableBase<VALUE> {
    private final Vector<WeakReference<Consumer<VALUE>>> consumers = new Vector<>(1);
    private final ReferenceQueue<Consumer<VALUE>> queue = new ReferenceQueue<>();
    @Nullable
    private VALUE currentValue = null;
    @Nullable
    private Any currentValueCopy = null;

    void acceptImpl(Consumer<VALUE> consumer) {
        acceptImplQuiet(consumer);
        if (hasValue()) {
            consumer.accept(currentValue);
        }
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
        if (hasValue()) {
            VALUE value = currentValue;
            synchronized (consumers) {
                for (WeakReference<Consumer<VALUE>> weakReference : consumers) {
                    Consumer<VALUE> consumer = weakReference.get();
                    if (consumer != null) {
                        consumer.accept(value);
                    }
                }
            }
        }
    }

    void clearValue() {
        this.currentValue = null;
        this.currentValueCopy = null;
    }

    void setCurrentValue(@Nonnull VALUE value, @Nonnull Any serializedValue) {
        this.currentValue = value;
        this.currentValueCopy = serializedValue;
    }

    void pushNewValue(@Nonnull VALUE value) {
        pushNewValue(value, false);
    }

    void pushNewValue(@Nonnull VALUE value, boolean forcePropagation) {
        Any serialized = Serializer.serialize(value);
        if (forcePropagation) {
            setCurrentValue(value, serialized);
            markAsDirty();
        } else if (!DisconnectUtils.deepEquals(currentValueCopy, serialized)) {
            setCurrentValue(value, serialized);
            markAsDirty();
        }
    }

    @Nullable
    VALUE getCurrentValue() {
        return currentValue;
    }

    void setCurrentValue(@Nonnull VALUE value) {
        setCurrentValue(value, Serializer.serialize(value));
    }

    boolean hasValue() {
        return currentValue != null;
    }

}
