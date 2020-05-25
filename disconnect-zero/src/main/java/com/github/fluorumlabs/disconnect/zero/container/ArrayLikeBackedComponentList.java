package com.github.fluorumlabs.disconnect.zero.container;

import com.github.fluorumlabs.disconnect.zero.component.Component;
import com.github.fluorumlabs.disconnect.zero.component.HasElement;
import com.github.fluorumlabs.disconnect.zero.internals.TagRegistry;
import js.util.JS;
import js.util.collections.Array;
import js.util.collections.ArrayLike;
import js.util.collections.ReadonlyArray;
import js.web.dom.Element;

import java.util.AbstractList;
import java.util.Optional;

/**
 * Created by Artem Godin on 5/20/2020.
 */
public class ArrayLikeBackedComponentList<E extends Element, T extends Component<? extends E>> extends AbstractList<T> implements ComponentList<T> {
    private final ArrayLike<E> nodes;

    public ArrayLikeBackedComponentList(ArrayLike<E> nodes) {
        this.nodes = nodes;
    }

    /**
     * {@inheritDoc}
     *
     * @param index
     * @throws IndexOutOfBoundsException {@inheritDoc}
     */
    @Override
    public T get(int index) {
        return TagRegistry.recover(nodes.get(index));
    }

    @Override
    public int size() {
        return nodes.getLength();
    }

    /**
     * {@inheritDoc}
     *
     * <p>This implementation first gets a list iterator (with
     * {@code listIterator()}).  Then, it iterates over the list until the
     * specified element is found or the end of the list is reached.
     *
     * @param o
     * @throws ClassCastException   {@inheritDoc}
     * @throws NullPointerException {@inheritDoc}
     */
    @Override
    public int indexOf(Object o) {
        if (o instanceof HasElement) {
            return Array.from(nodes).indexOf(((T)o).getElement());
        }
        return -1;
    }

    /**
     * {@inheritDoc}
     *
     * <p>This implementation first gets a list iterator that points to the end
     * of the list (with {@code listIterator(size())}).  Then, it iterates
     * backwards over the list until the specified element is found, or the
     * beginning of the list is reached.
     *
     * @param o
     * @throws ClassCastException   {@inheritDoc}
     * @throws NullPointerException {@inheritDoc}
     */
    @Override
    public int lastIndexOf(Object o) {
        if (o instanceof HasElement) {
            return Array.from(nodes).lastIndexOf(((T)o).getElement());
        }
        return -1;
    }

    public ComponentList<T> query(String selector) {
        ReadonlyArray<E> filteredNodes = Array.from(nodes).filter((value, key, parent) -> value.matches(selector));
        return new ArrayLikeBackedComponentList<>(filteredNodes);
    }

    public Optional<T> find(String selector) {
        E foundElement = JS.nullify(Array.from(nodes).find((value, key, parent) -> value.matches(selector)));
        Optional<E> e = Optional.ofNullable(foundElement);
        return e.map(TagRegistry::recover);
    }
}
