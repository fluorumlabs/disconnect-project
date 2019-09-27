package org.vaadin.disconnect.vue.client.elements;

/**
 * Created by Artem Godin on 9/26/2019.
 */
public interface HasStyle<T extends HasStyle<T>> extends ElementBase {
    default T cssClass(String className, boolean enabled) {
        data().classes().set(className, enabled);
        return (T)this;
    }

    default T cssClass(String className) {
        return cssClass(className, true);
    }

    default T style(String property, String value) {
        data().styles().set(property, value);
        return (T)this;
    }
}
