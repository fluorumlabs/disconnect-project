package com.github.fluorumlabs.disconnect.zero.component;

import js.web.dom.Node;


@SuppressWarnings("unchecked")
public interface HasComponents<E extends Node, T extends HasComponents<E, T, C>, C extends Component<?>> extends Component<E> {
    default T add(C component) {
        getNode().appendChild(component.getRenderedNode());
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
            getNode().insertBefore(component.getRenderedNode(), firstChild);
        }
        return (T) this;
    }

    default T insert(C component) {
        Node firstChild = getNode().getFirstChild();
        if ( firstChild == null ) {
            return add(component);
        }

        getNode().insertBefore(component.getRenderedNode(), firstChild);
        return (T) this;
    }

    default T replaceContent(C component) {
        return removeAll().add(component);
    }

    default T replaceContent(C... components) {
        return removeAll().add(components);
    }

    default T remove(C component) {
        getNode().removeChild(component.getRenderedNode());
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

    default T stamp(Template template) {
        return stamp(template, true);
    }

    default T stamp(Template template, boolean deepClone) {
        getNode().appendChild(template.getNode().cloneNode(deepClone));
        return (T) this;
    }

    default T stampReplace(Template template) {
        return stamp(template, true);
    }

    default T stampReplace(Template template, boolean deepClone) {
        removeAll();
        getNode().appendChild(template.getNode().cloneNode(deepClone));
        return (T) this;
    }

    default T stampInsert(Template template) {
        return stampInsert(template, true);
    }

    default T stampInsert(Template template, boolean deepClone) {
        getNode().appendChild(template.getNode().cloneNode(deepClone));
        Node firstChild = getNode().getFirstChild();
        if ( firstChild == null ) {
            return stamp(template, deepClone);
        }
        getNode().insertBefore(template.getNode().cloneNode(deepClone), firstChild);
        return (T) this;
    }

    default T text(String text) {
        getNode().setTextContent(text);
        return (T) this;
    }

    default String text() {
        return getNode().getTextContent();
    }
}
