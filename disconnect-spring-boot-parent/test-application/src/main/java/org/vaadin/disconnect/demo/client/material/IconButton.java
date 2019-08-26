package org.vaadin.disconnect.demo.client.material;

import org.vaadin.disconnect.core.client.ElementPrototype;
import org.vaadin.disconnect.core.client.Elements;
import org.vaadin.disconnect.demo.client.material.internals.CoreImports;

/**
 * Created by Artem Godin on 8/26/2019.
 */
public interface IconButton extends ElementPrototype<IconButton> {
    static IconButton create() {
        return Elements.create(CoreImports.imports().get("IconButton"));
    }

    static IconButton create(String name) {
        return create().add(Icon.create(name));
    }

    default IconButton color(Color color) {
        return with("color", color.getValue());
    }

    default IconButton edge(Edge edge) {
        return with("edge", edge.getValue());
    }

    enum Edge {
        START("start"),
        END("end");

        private final String value;

        Edge(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }
    }
}
