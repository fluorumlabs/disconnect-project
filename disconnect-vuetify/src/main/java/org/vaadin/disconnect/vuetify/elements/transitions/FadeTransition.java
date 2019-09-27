package org.vaadin.disconnect.vuetify.elements.transitions;

import org.vaadin.disconnect.vue.annotations.ImportComponent;
import org.vaadin.disconnect.vue.client.elements.Element;
import org.vaadin.disconnect.vue.client.elements.HasChildElements;

/**
 * Created by Artem Godin on 9/25/2019.
 */
@ImportComponent(symbol = "VFadeTransition", module = "vuetify/lib/components/transitions")
public final class FadeTransition extends Element<FadeTransition> implements HasChildElements<FadeTransition, Element<?>> {
    public FadeTransition() {
        super(FadeTransition.class);
    }

    public FadeTransition(Element... elements) {
        this();
        add(elements);
    }

    public FadeTransition setGroup(boolean group) {
        data().properties().set("group", group);
        return this;
    }
}
