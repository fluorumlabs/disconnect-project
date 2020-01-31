package com.github.fluorumlabs.disconnect.zero.component;

import js.web.dom.Element;
import js.web.dom.Node;

import javax.annotation.Untainted;


@SuppressWarnings("unchecked")
public interface HasComponents<E extends Element, T extends HasComponents<E, T, C>, C extends Component<?>> extends Component<E> {
    default T add(C component) {
        getElement().appendChild(component.render());
        return (T) this;
    }

    default T add(C... components) {
        for (C component : components) {
            add(component);
        }
        return (T) this;
    }

    default T insert(C... components) {
        Node firstChild = getElement().getFirstChild();
        if ( firstChild == null ) {
            return add(components);
        }

        for (C component : components) {
            getElement().insertBefore(component.render(), firstChild);
        }
        return (T) this;
    }

    default T insert(C component) {
        Node firstChild = getElement().getFirstChild();
        if ( firstChild == null ) {
            return add(component);
        }

        getElement().insertBefore(component.render(), firstChild);
        return (T) this;
    }

    default T replaceContent(C component) {
        return removeAll().add(component);
    }

    default T replaceContent(C... components) {
        return removeAll().add(components);
    }

    default T remove(C component) {
        getElement().removeChild(component.render());
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
            E node = getElement();
            if (node.getFirstChild() == null) break;
            node.removeChild(node.getFirstChild());
        }
        return (T) this;
    }

    default T text(String text) {
        getElement().setTextContent(text);
        return (T) this;
    }

    default String text() {
        return getElement().getTextContent();
    }

    default T html(@Untainted String html) {
        getElement().setInnerHTML(html);
        return (T) this;
    }

    default String html() {
        return getElement().getInnerHTML();
    }
}
