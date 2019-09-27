package org.vaadin.disconnect.vuetify.elements;

import org.vaadin.disconnect.vue.annotations.ImportComponent;
import org.vaadin.disconnect.vue.client.elements.*;

/**
 * Created by Artem Godin on 9/25/2019.
 */
@ImportComponent(module = "vuetify/lib/components/VFooter")
public final class Footer extends VuetifyElement<Footer> implements HasChildElements<Footer, Element<?>> {
    public Footer() {
        super(Footer.class);
    }

    public Footer setApplicationShell() {
        data().properties().set("app", true);
        return this;
    }
}
