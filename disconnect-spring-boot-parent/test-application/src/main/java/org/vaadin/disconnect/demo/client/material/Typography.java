package org.vaadin.disconnect.demo.client.material;

import org.vaadin.disconnect.core.client.ElementPrototype;
import org.vaadin.disconnect.core.client.Elements;
import org.vaadin.disconnect.demo.client.material.internals.CoreImports;

import javax.lang.model.element.TypeElement;

/**
 * Created by Artem Godin on 8/26/2019.
 */
public interface Typography extends ElementPrototype<Typography> {
    static Typography create() {
        return Elements.create(CoreImports.imports().get("Typography"));
    }

    default Typography variant(Variant variant) {
        return with("variant", variant.getValue());
    }

    enum Variant {
        H1("h1"),
        H2("h2"),
        H3("h3"),
        H4("h4"),
        H5("h5"),
        H6("h6"),
        SUBTITLE1("subtitle1"),
        SUBTITLE2("subtitle2"),
        BODY1("body1"),
        BODY2("body2"),
        CAPTION("caption"),
        BUTTON("button"),
        OVERLINE("overline"),
        SRONLY("srOnly"),
        INHERIT("inherit");

        private final String value;

        Variant(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }

    }
}
