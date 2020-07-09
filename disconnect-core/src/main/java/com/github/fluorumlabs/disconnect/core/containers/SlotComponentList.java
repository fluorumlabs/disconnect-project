package com.github.fluorumlabs.disconnect.core.containers;

import com.github.fluorumlabs.disconnect.core.components.Component;
import com.github.fluorumlabs.disconnect.core.components.HasElement;
import com.github.fluorumlabs.disconnect.core.internals.TagRegistry;
import js.util.JS;
import js.util.collections.Array;
import js.util.collections.ReadonlyArray;
import js.web.dom.Element;
import js.web.dom.ParentNode;
import js.web.dom.Window;
import js.web.webcomponents.HTMLSlotElement;
import js.web.webcomponents.ShadowRoot;
import org.apache.commons.lang3.StringUtils;

import java.util.AbstractList;
import java.util.Optional;

/**
 * Created by Artem Godin on 5/20/2020.
 */
public class SlotComponentList<E extends Element, T extends Component<? extends E>> extends AbstractList<T> implements ComponentList<T> {
    private final ParentNode root;
    private HTMLSlotElement slotElement = null;
    private final String slotName;

    public SlotComponentList(Element parent, String slotName) {
        this.root = parent;
        this.slotName = slotName;
        String tagName = parent.getTagName().toLowerCase();
        if (!tagName.contains("-")) {
            throw new IllegalArgumentException("Cannot create SlotContainer for built-in element");
        }
        ShadowRoot shadowRoot = parent.getShadowRoot();
        if (shadowRoot != null) {
            if (slotName.isEmpty()) {
                slotElement = shadowRoot.querySelector("slot:not([name])");
            } else {
                slotElement = shadowRoot.querySelector("slot[name="+quote(slotName)+"]");
            }
        } else {
            Window.WINDOW.getCustomElements().whenDefined(tagName).then(() -> {
                ShadowRoot lazyShadowRoot = parent.getShadowRoot();
                if (lazyShadowRoot != null) {
                    if (slotName.isEmpty()) {
                        slotElement = lazyShadowRoot.querySelector("slot:not([name])");
                    } else {
                        slotElement = lazyShadowRoot.querySelector("slot[name=" + quote(slotName) + "]");
                    }
                }
            });
        }
    }

    private static String quote(String slotName) {
        return "\""+ StringUtils.replace(slotName, "\"", "\\\"") + "\"";
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
     * @return {@code true}
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
        t.getElement().setSlot(slotName);
        root.appendChild(t.getElement());
        return true;
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
        element.getElement().setSlot(slotName);
        Element previous = slotted().get(index);
        root.replaceChild(element.getElement(), previous);
        previous.setSlot("");
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
        element.getElement().setSlot(slotName);
        ReadonlyArray<E> array = slotted();
        if (index==array.getLength()) {
            // add
            root.appendChild(element.getElement());
        } else {
            // insert
            Element previous = array.get(index);
            root.insertBefore(element.getElement(), previous);
        }
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
        Element previous = slotted().get(index);
        root.removeChild(previous);
        previous.setSlot("");
        return TagRegistry.recover(previous);
    }

    @Override
    public boolean remove(Object o) {
        if (o instanceof HasElement) {
            E element = ((T) o).getElement();
            if (element.getParentNode()==root
                    && slotName.equals(element.getSlot())) {
                root.removeChild(element);
                element.setSlot("");
                return true;
            }
        }
        return false;
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
        if (!(o instanceof HasElement)) {
            return -1;
        }
        return slotted().indexOf(((HasElement<? extends E>)o).getElement());
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
        if (!(o instanceof HasElement)) {
            return -1;
        }
        return slotted().lastIndexOf(((HasElement<? extends E>)o).getElement());
    }

    /**
     * Removes from this list all of the elements whose index is between
     * {@code fromIndex}, inclusive, and {@code toIndex}, exclusive.
     * Shifts any succeeding elements to the left (reduces their index).
     * This call shortens the list by {@code (toIndex - fromIndex)} elements.
     * (If {@code toIndex==fromIndex}, this operation has no effect.)
     *
     * <p>This method is called by the {@code clear} operation on this list
     * and its subLists.  Overriding this method to take advantage of
     * the internals of the list implementation can <i>substantially</i>
     * improve the performance of the {@code clear} operation on this list
     * and its subLists.
     *
     * <p>This implementation gets a list iterator positioned before
     * {@code fromIndex}, and repeatedly calls {@code ListIterator.next}
     * followed by {@code ListIterator.remove} until the entire range has
     * been removed.  <b>Note: if {@code ListIterator.remove} requires linear
     * time, this implementation requires quadratic time.</b>
     *
     * @param fromIndex index of first element to be removed
     * @param toIndex   index after last element to be removed
     */
    @Override
    protected void removeRange(int fromIndex, int toIndex) {
        ReadonlyArray<E> slotted = slotted();
        for (int i = fromIndex; i < toIndex; i++) {
            Element element = slotted.get(i);
            root.removeChild(element);
            element.setSlot("");
        }
    }

    public ComponentList<T> query(String selector) {
        return new ArrayLikeBackedComponentList<>(slotted().filter((value, key, parent) -> value.matches(selector)));
    }

    public Optional<T> find(String selector) {
        E foundElement = JS.nullify(slotted().find((value, key, parent) -> value.matches(selector)));
        Optional<E> e = Optional.ofNullable(foundElement);
        return e.map(TagRegistry::recover);
    }

    /**
     * {@inheritDoc}
     *
     * @param index
     * @throws IndexOutOfBoundsException {@inheritDoc}
     */
    @Override
    public T get(int index) {
        return TagRegistry.recover(slotted().get(index));
    }

    @Override
    public int size() {
        return slotted().getLength();
    }

    private ReadonlyArray<E> slotted() {
        if (slotElement != null) {
            return (ReadonlyArray<E>) slotElement.assignedElements();
        } else {
            return (ReadonlyArray<E>) Array.from(root.getChildren()).filter((value, key, parent) -> value.getSlot().equals(slotName));
        }
    }
}
