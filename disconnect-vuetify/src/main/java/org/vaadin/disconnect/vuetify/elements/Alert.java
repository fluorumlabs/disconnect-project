package org.vaadin.disconnect.vuetify.elements;

import org.vaadin.disconnect.vue.annotations.ImportComponent;
import org.vaadin.disconnect.vue.client.elements.Element;
import org.vaadin.disconnect.vue.client.elements.HasChildElements;
import org.vaadin.disconnect.vue.client.elements.HasClickListener;
import org.vaadin.disconnect.vue.client.events.VoidEventListener;

/**
 * Created by Artem Godin on 9/25/2019.
 */
@ImportComponent(module = "vuetify/lib/components/VAlert")
public final class Alert extends Element<Alert> implements HasChildElements<Alert, Element<?>> {
    public Alert() {
        super(Alert.class);
    }

    public Alert(String title) {
        this();
        setText(title);
    }

    public Alert setColoredBorder(boolean coloredBorder) {
        data().properties().set("colored-border", coloredBorder);
        return this;
    }

    public Alert setColor(String color) {
        data().properties().set("color", color);
        return this;
    }

    public Alert setElevation(int elevation) {
        data().properties().set("elevation", elevation);
        return this;
    }
}
