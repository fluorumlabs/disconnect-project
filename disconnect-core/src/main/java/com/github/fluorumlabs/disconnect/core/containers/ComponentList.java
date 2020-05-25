package com.github.fluorumlabs.disconnect.core.containers;

import com.github.fluorumlabs.disconnect.core.components.Component;

import java.util.List;
import java.util.Optional;

/**
 * Created by Artem Godin on 5/20/2020.
 */
public interface ComponentList<T extends Component<?>> extends List<T> {
    ComponentList<T> query(String selector);

    Optional<T> find(String selector);

    default boolean add(T... components) {
        boolean result = false;
        for (T component : components) {
            result |= add(component);
        }
        return result;
    }

    default void remove(T... components) {
        for (T component : components) {
            remove(component);
        }
    }

    default boolean add(String text) {
        throw new UnsupportedOperationException();
    }

    default boolean add(String... text) {
        throw new UnsupportedOperationException();
    }
}
