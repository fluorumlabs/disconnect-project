package com.github.fluorumlabs.disconnect.core.components;

import com.github.fluorumlabs.disconnect.core.internals.ComponentReferenceHolder;
import js.web.dom.Element;
import js.web.dom.HTMLElement;

import java.util.Optional;

/**
 * Created by Artem Godin on 5/12/2020.
 */
public interface NodeApi<X extends Element> extends HasElement<X> {
    default String getBaseURI() {
        return getElement().getBaseURI();
    }

    default boolean isConnected() {
        return getElement().isIsConnected();
    }

    default Optional<HTMLElement> getParentElement() {
        return Optional.ofNullable(getElement().getParentElement());
    }

    default <T extends Component<?>> Optional<T> getParent() {
        return getParentElement().map(element -> element.<ComponentReferenceHolder>cast().get());
    }

    default String getTextContent() {
        return getElement().getTextContent();
    }

    default void setTextContent(String textContent) {
        getElement().setTextContent(textContent);
    }

    default <E extends Element, T extends Component<E>> T clone(boolean deep) {
        E clone = (E)getElement().cloneNode(deep);
        ComponentReferenceHolder.pushPendingElementReference(clone);
        try {
            return (T)getClass().newInstance();
        } catch (InstantiationException | IllegalAccessException e) {
            throw new IllegalStateException("Unable to create new instance", e);
        } finally {
            ComponentReferenceHolder.resetPendingElementReference();
        }
    }

    /**
     * Inserts nodes just after node, while replacing strings in nodes with equivalent Text nodes.
     * <p>
     * Throws a "HierarchyRequestError" DOMException if the constraints of the node tree are violated.
     */
    default void after(String... nodes) {
        getElement().after(nodes);
    }

    default void after(Component<?>... nodes) {
        getElement().after(HasElement.getElements(nodes));
    }

    /**
     * Inserts nodes just before node, while replacing strings in nodes with equivalent Text nodes.
     * <p>
     * Throws a "HierarchyRequestError" DOMException if the constraints of the node tree are violated.
     */
    default void before(String... nodes) {
        getElement().before(nodes);
    }

    default void before(Component<?>... nodes) {
        getElement().before(HasElement.getElements(nodes));
    }

    /**
     * Removes node.
     */
    default void remove() {
        getElement().remove();
    }

    /**
     * Replaces node with nodes, while replacing strings in nodes with equivalent Text nodes.
     * <p>
     * Throws a "HierarchyRequestError" DOMException if the constraints of the node tree are violated.
     */
    default void replaceWith(String... nodes) {
        getElement().replaceWith(nodes);
    }

    default void replaceWith(Component<?>... nodes) {
        getElement().replaceWith(HasElement.getElements(nodes));
    }

    /**
     * Returns the first following sibling that is an element, and null otherwise.
     */
    default Optional<Element> getNextElementSibling() {
        return Optional.ofNullable(getElement().getNextElementSibling());
    }

    /**
     * Returns the first preceding sibling that is an element, and null otherwise.
     */
    default Optional<Element> getPreviousElementSibling() {
        return Optional.ofNullable(getElement().getPreviousElementSibling());
    }

    /**
     * Returns the first following sibling that is an element, and null otherwise.
     */
    default <T extends Component<?>> Optional<T> getNextSibling() {
        return getNextElementSibling().map(element -> element.<ComponentReferenceHolder>cast().get());
    }

    /**
     * Returns the first preceding sibling that is an element, and null otherwise.
     */
    default <T extends Component<?>> Optional<T> getPreviousSibling() {
        return getPreviousElementSibling().map(element -> element.<ComponentReferenceHolder>cast().get());
    }

}
