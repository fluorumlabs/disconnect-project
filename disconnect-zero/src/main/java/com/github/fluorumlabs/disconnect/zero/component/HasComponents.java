package com.github.fluorumlabs.disconnect.zero.component;

import js.web.dom.Element;
import js.web.dom.Node;


public interface HasComponents<E extends Element, T extends HasComponents<E, T, C>, C extends Component<?>> extends ComponentBase<E> {
    default T add(C component) {
        getNode().appendChild(component.render());
        return (T) this;
    }

    default T add(C... components) {
        for (C component : components) {
            add(component);
        }
        return (T) this;
    }

    default T insert(C... components) {
        Node firstChild = getNode().getFirstChild();
        if ( firstChild == null ) {
            return add(components);
        }

        for (C component : components) {
            getNode().insertBefore(component.render(), firstChild);
        }
        return (T) this;
    }

    default T insert(C component) {
        Node firstChild = getNode().getFirstChild();
        if ( firstChild == null ) {
            return add(component);
        }

        getNode().insertBefore(component.render(), firstChild);
        return (T) this;
    }

    default T replaceContent(C component) {
        return removeAll().add(component);
    }

    default T replaceContent(C... components) {
        return removeAll().add(components);
    }

    default T remove(C component) {
        getNode().removeChild(component.render());
        return (T) this;
    }

    default T remove(C... components) {
        for (C component : components) {
            remove(component);
        }
        return (T) this;
    }

    default T removeAll() {
        while (getNode().getFirstChild() != null) {
            getNode().removeChild(getNode().getFirstChild());
        }
        return (T) this;
    }

    default T text(String text) {
        getNode().setTextContent(text);
        return (T) this;
    }
}
