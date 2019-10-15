package org.vaadin.disconnect.vue.client.elements;

/**
 * Created by Artem Godin on 9/26/2019.
 */
public interface HasChildElements<T extends HasChildElements<T, E>, E extends Element<?>> extends ElementBase {
    default T add(E... elements) {
        for (Element element : elements) {
            children().add(element, this);
        }
        return (T) this;
    }

    default T insert(E... elements) {
        int pos = 0;
        for (Element element : elements) {
            children().insertAt(pos, element, this);
            pos++;
        }
        return (T) this;
    }

    default T replaceContent(E... elements) {
        return removeAll().add(elements);
    }

    default T remove(E... elements) {
        for (Element element : elements) {
            children().remove(element);
        }
        return (T) this;
    }

    default T removeByKey(String... keys) {
        for (String key : keys) {
            children().removeByKey(key);
        }
        return (T) this;
    }

    default T removeAll() {
        children().removeAll();
        return (T) this;
    }

    default T setText(String text) {
        removeAll();
        data().domProperties().set("textContent", text);
        return (T) this;
    }
}
