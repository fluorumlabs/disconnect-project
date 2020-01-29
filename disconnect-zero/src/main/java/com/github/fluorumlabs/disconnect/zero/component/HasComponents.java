package com.github.fluorumlabs.disconnect.zero.component;

import js.web.dom.Element;
import js.web.dom.Node;

import javax.annotation.Untainted;


public interface HasComponents<E extends Element, T extends HasComponents<E, T, C>, C extends Component<?>> extends Component<E> {
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
        while (true) {
            E node = getNode();
            if (node.getFirstChild() == null) break;
            node.removeChild(node.getFirstChild());
        }
        return (T) this;
    }

    default T text(String text) {
        getNode().setTextContent(text);
        return (T) this;
    }

    default String text() {
        return getNode().getTextContent();
    }

    default T html(@Untainted String html) {
        getNode().setInnerHTML(html);
        return (T) this;
    }

    default String html() {
        return getNode().getInnerHTML();
    }
}
