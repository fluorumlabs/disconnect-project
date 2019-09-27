package org.vaadin.disconnect.vue.client;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

/**
 * Created by Artem Godin on 9/26/2019.
 */
public final class Observer<V> implements Consumer<V> {
    private final List<Consumer<V>> consumers = new ArrayList<>(1);

    @Override
    public void accept(V v) {
        for (Consumer<V> consumer : consumers) {
            consumer.accept(v);
        }
    }

    public final <W> Observer<W> map(Function<V, W> mapper) {
        Observer<W> result = new Observer<>();
        consumers.add(v -> result.accept(mapper.apply(v)));
        return result;
    }

    public final Observer<V> filter(Predicate<V> filter) {
        Observer<V> result = new Observer<>();
        consumers.add(v -> {
            if (filter.test(v)) {
                result.accept(v);
            }
        });
        return result;
    }

    public final Observer<V> then(Consumer<V> consumer) {
        Observer<V> result = new Observer<>();
        consumers.add(consumer);
        consumers.add(result);
        return result;
    }

    public final void clear() {
        consumers.clear();
    }
}
