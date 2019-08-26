package org.vaadin.disconnect.demo.client.material;

import org.vaadin.disconnect.core.client.ElementPrototype;
import org.vaadin.disconnect.core.client.Elements;
import org.vaadin.disconnect.demo.client.material.internals.CoreImports;

/**
 * Created by Artem Godin on 8/26/2019.
 */
public interface GridContainer extends ElementPrototype<GridContainer> {
    static GridContainer create() {
        return Elements.<GridContainer>create(CoreImports.imports().get("Grid"))
                .with("container", true);
    }

    default GridContainer spacing(int spacing) {
        return with("spacing", spacing);
    }
}
