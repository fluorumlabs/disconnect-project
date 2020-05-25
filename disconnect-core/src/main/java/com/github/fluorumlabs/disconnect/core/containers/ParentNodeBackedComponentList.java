package com.github.fluorumlabs.disconnect.core.containers;

import com.github.fluorumlabs.disconnect.core.components.Component;
import com.github.fluorumlabs.disconnect.core.components.HasElement;
import com.github.fluorumlabs.disconnect.core.internals.TagRegistry;
import js.util.collections.Array;
import js.web.dom.Element;
import js.web.dom.ParentNode;

import java.util.AbstractList;
import java.util.Collection;
import java.util.Optional;

/**
 * Created by Artem Godin on 5/20/2020.
 */
public class ParentNodeBackedComponentList<E extends Element, T extends Component<? extends E>> extends AbstractList<T> implements ComponentList<T> {
    private final ParentNode parentNode;

    public ParentNodeBackedComponentList(ParentNode parentNode) {
        this.parentNode = parentNode;
    }

    /**
     * {@inheritDoc}
     *
     * @param index
     * @throws IndexOutOfBoundsException {@inheritDoc}
     */
    @Override
    public T get(int index) {
        return TagRegistry.recover(parentNode.getChildren().get(index));
    }

    @Override
    public int size() {
        return parentNode.getChildElementCount();
    }

    /**
     * {@inheritDoc}
     *
     * <p>This implementation always throws an
     * {@code UnsupportedOperationException}.
     *
     * @param index
     * @param element
     * @throws UnsupportedOperationException {@inheritDoc}
     * @throws ClassCastException            {@inheritDoc}
     * @throws NullPointerException          {@inheritDoc}
     * @throws IllegalArgumentException      {@inheritDoc}
     * @throws IndexOutOfBoundsException     {@inheritDoc}
     */
    @Override
    public T set(int index, T element) {
        Element previous = parentNode.getChildren().get(index);
        parentNode.replaceChild(element.getElement(), previous);
        return TagRegistry.recover(previous);
    }

    /**
     * {@inheritDoc}
     *
     * <p>This implementation always throws an
     * {@code UnsupportedOperationException}.
     *
     * @param index
     * @param element
     * @throws UnsupportedOperationException {@inheritDoc}
     * @throws ClassCastException            {@inheritDoc}
     * @throws NullPointerException          {@inheritDoc}
     * @throws IllegalArgumentException      {@inheritDoc}
     * @throws IndexOutOfBoundsException     {@inheritDoc}
     */
    @Override
    public void add(int index, T element) {
        if (index==size()) {
            // add
            parentNode.appendChild(element.getElement());
        } else {
            // insert
            Element previous = parentNode.getChildren().get(index);
            parentNode.insertBefore(element.getElement(), previous);
        }
    }

    /**
     * Appends the specified element to the end of this list (optional
     * operation).
     *
     * <p>Lists that support this operation may place limitations on what
     * elements may be added to this list.  In particular, some
     * lists will refuse to add null elements, and others will impose
     * restrictions on the type of elements that may be added.  List
     * classes should clearly specify in their documentation any restrictions
     * on what elements may be added.
     *
     * <p>This implementation calls {@code add(size(), e)}.
     *
     * <p>Note that this implementation throws an
     * {@code UnsupportedOperationException} unless
     * {@link #add(int, Object) add(int, E)} is overridden.
     *
     * @param t element to be appended to this list
     * @return {@code true} (as specified by {@link Collection#add})
     * @throws UnsupportedOperationException if the {@code add} operation
     *                                       is not supported by this list
     * @throws ClassCastException            if the class of the specified element
     *                                       prevents it from being added to this list
     * @throws NullPointerException          if the specified element is null and this
     *                                       list does not permit null elements
     * @throws IllegalArgumentException      if some property of this element
     *                                       prevents it from being added to this list
     */
    @Override
    public boolean add(T t) {
        parentNode.appendChild(t.getElement());
        return true;
    }

    /**
     * Removes all of the elements from this list (optional operation).
     * The list will be empty after this call returns.
     *
     * <p>This implementation calls {@code removeRange(0, size())}.
     *
     * <p>Note that this implementation throws an
     * {@code UnsupportedOperationException} unless {@code remove(int
     * index)} or {@code removeRange(int fromIndex, int toIndex)} is
     * overridden.
     *
     * @throws UnsupportedOperationException if the {@code clear} operation
     *                                       is not supported by this list
     */
    @Override
    public void clear() {
        parentNode.setTextContent("");
    }

    /**
     * {@inheritDoc}
     *
     * <p>This implementation always throws an
     * {@code UnsupportedOperationException}.
     *
     * @param index
     * @throws UnsupportedOperationException {@inheritDoc}
     * @throws IndexOutOfBoundsException     {@inheritDoc}
     */
    @Override
    public T remove(int index) {
        Element previous = parentNode.getChildren().get(index);
        parentNode.removeChild(previous);
        return TagRegistry.recover(previous);
    }

    public ComponentList<T> query(String selector) {
        return new ArrayLikeBackedComponentList<>(parentNode.querySelectorAll(selector));
    }

    public Optional<T> find(String selector) {
        Optional<E> e = Optional.ofNullable(parentNode.querySelector(selector));
        return e.map(TagRegistry::recover);
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
            return Array.from(parentNode.getChildren()).indexOf(((T)o).getElement());
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
            return Array.from(parentNode.getChildren()).lastIndexOf(((T)o).getElement());
        }
        return -1;
    }

    @Override
    public boolean add(String text) {
        parentNode.append(text);
        return true;
    }

    @Override
    public boolean add(String... text) {
        parentNode.append(text);
        return true;
    }

    @Override
    public boolean add(T... components) {
        parentNode.append(HasElement.getElements(components));
        return true;
    }
}
