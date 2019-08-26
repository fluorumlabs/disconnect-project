package org.vaadin.disconnect.demo.client.material;

import org.vaadin.disconnect.core.client.ElementPrototype;
import org.vaadin.disconnect.core.client.Elements;
import org.vaadin.disconnect.demo.client.material.internals.CoreImports;

/**
 * Created by Artem Godin on 8/26/2019.
 */
public interface GridItem extends ElementPrototype<GridItem> {
    static GridItem create() {
        return Elements.<GridItem>create(CoreImports.imports().get("Grid"))
                .with("item", true);
    }

    default GridItem breakpoint(Breakpoint breakpoint, int size) {
        return with(breakpoint.getValue(), size);
    }

    enum Breakpoint {
        LG("lg"), MD("md"), SM("sm"), XL("xl"), XS("xs");

        private final String value;

        Breakpoint(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }
    }
}
