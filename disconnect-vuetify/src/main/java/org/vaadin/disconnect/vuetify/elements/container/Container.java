package org.vaadin.disconnect.vuetify.elements.container;

import org.vaadin.disconnect.vue.annotations.ImportComponent;
import org.vaadin.disconnect.vue.client.elements.Element;
import org.vaadin.disconnect.vue.client.elements.HasChildElements;
import org.vaadin.disconnect.vuetify.elements.VuetifyElement;

/**
 * Created by Artem Godin on 9/25/2019.
 */
@ImportComponent(symbol = "VContainer", module = "vuetify/lib/components/VGrid")
public final class Container extends VuetifyElement<Container> {
    public Container() {
        super(Container.class);
    }

    public Container fluid(boolean fluid) {
        data().properties().set("fluid", fluid);
        return this;
    }

    public Container fluid() {
        return fluid(true);
    }

    /**
     * Created by Artem Godin on 9/25/2019.
     */
    @ImportComponent(symbol = "VCol", module = "vuetify/lib/components/VGrid")
    public static final class Col extends VuetifyElement<Col> implements HasChildElements<Col, Element<?>> {
        public Col() {
            super(Col.class);
        }

        public Col(Element... elements) {
            this();
            add(elements);
        }
    }

    /**
     * Created by Artem Godin on 9/25/2019.
     */
    @ImportComponent(symbol = "VRow", module = "vuetify/lib/components/VGrid")
    public static final class Row extends VuetifyElement<Row> implements HasChildElements<Row, Col> {
        public Row() {
            super(Row.class);
        }

        public Row(Col... cols) {
            this();
            add(cols);
        }
    }
}
