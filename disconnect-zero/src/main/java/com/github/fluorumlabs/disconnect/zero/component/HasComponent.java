package com.github.fluorumlabs.disconnect.zero.component;

import js.web.dom.Element;


@SuppressWarnings("unchecked")
public interface HasComponent<E extends Element, T extends HasComponent<E, T, C>, C extends Component<?>> extends Component<E> {
    default T setContent(C component) {
        removeContent();
        getNode().appendChild(component.getRenderedNode());
        return (T) this;
    }

    default T removeContent() {
        while (true) {
            E node = getNode();
            if (node.getFirstChild() == null) break;
            node.removeChild(node.getFirstChild());
        }
        return (T) this;
    }
}
