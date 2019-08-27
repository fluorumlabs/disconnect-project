package org.vaadin.disconnect.demo.client.material;

import org.vaadin.disconnect.core.client.ElementPrototype;
import org.vaadin.disconnect.core.client.Elements;
import org.vaadin.disconnect.demo.client.material.internals.CoreImports;

/**
 * Created by Artem Godin on 8/26/2019.
 */
public interface Container extends ElementPrototype<Container> {
    static Container create() {
        return Elements.<Container>create(CoreImports.imports().get("Container"));
    }

    default Container maxWidth(Breakpoint breakpoint) {
        return with("maxWidth", breakpoint.getValue());
    }
}
