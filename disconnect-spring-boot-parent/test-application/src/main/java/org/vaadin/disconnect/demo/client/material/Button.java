package org.vaadin.disconnect.demo.client.material;

import org.vaadin.disconnect.core.client.ElementPrototype;
import org.vaadin.disconnect.core.client.Elements;
import org.vaadin.disconnect.demo.client.material.internals.CoreImports;

/**
 * Created by Artem Godin on 8/26/2019.
 */
public interface Button extends ElementPrototype<Button> {
    static Button create() {
        return Elements.create(CoreImports.imports().get("Button"));
    }

    static Button create(String text) {
        return create().text(text);
    }

    default Button color(Color color) {
        return with("color", color.getValue());
    }
}
