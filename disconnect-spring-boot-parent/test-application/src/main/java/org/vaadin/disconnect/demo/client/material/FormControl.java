package org.vaadin.disconnect.demo.client.material;

import org.vaadin.disconnect.core.client.ElementPrototype;
import org.vaadin.disconnect.core.client.Elements;
import org.vaadin.disconnect.demo.client.material.internals.CoreImports;

/**
 * Created by Artem Godin on 8/26/2019.
 */
public interface FormControl extends ElementPrototype<FormControl> {
    static FormControl create() {
        return Elements.create(CoreImports.imports().get("FormControl"));
    }

    default FormControl fullWidth() {
        return with("fullWidth", true);
    }

    default FormControl variant(Variant variant) {
        return with("variant", variant.getValue());
    }

    default FormControl margin(Margin margin) {
        return with("margin", margin.getValue());
    }

    default FormControl component(String component) {
        return with("component", component);
    }

    enum Margin {
        NONE("none"),
        NORMAL("normal"),
        DENSE("dense");

        private final String value;

        Margin(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }
    }

    enum Variant {
        STANDARD("standard"),
        OUTLINED("outlined"),
        FILLED("filled");
        private final String value;

        Variant(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }
    }
}
