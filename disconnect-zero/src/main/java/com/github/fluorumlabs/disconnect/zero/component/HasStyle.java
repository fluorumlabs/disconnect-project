package com.github.fluorumlabs.disconnect.zero.component;

import js.web.cssom.CSSStyleDeclaration;
import js.web.dom.HTMLElement;


@SuppressWarnings("unchecked")
public interface HasStyle<E extends HTMLElement, T extends HasStyle<E, T>> extends Component<E> {
    default CSSStyleDeclaration getStyle() {
        return getNode().getStyle();
    }

    default T addClass(String... tokens) {
        getNode().getClassList().add(tokens);
        return (T) this;
    }

    default T removeClass(String... tokens) {
        getNode().getClassList().remove(tokens);
        return (T) this;
    }

    default T toggleClass(String... tokens) {
        for (String token : tokens) {
            toggleClass(token);
        }
        return (T) this;
    }

    default T addClass(String token) {
        getNode().getClassList().add(token);
        return (T) this;
    }

    default T removeClass(String token) {
        getNode().getClassList().remove(token);
        return (T) this;
    }

    default T toggleClass(String token) {
        getNode().getClassList().toggle(token);
        return (T) this;
    }

    default boolean hasClass(String token) {
        return getNode().getClassList().contains(token);
    }
}
