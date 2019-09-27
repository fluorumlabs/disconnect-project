package org.vaadin.disconnect.vue.client.elements;

/**
 * Created by Artem Godin on 9/26/2019.
 */
public final class Text extends Element {
    public Text(String text) {
        super("#text");
        data().domProperties().set("textContent", text);
    }
}
