package org.vaadin.disconnect.demo.client.material;

import org.vaadin.disconnect.core.client.ElementPrototype;
import org.vaadin.disconnect.core.client.Elements;
import org.vaadin.disconnect.demo.client.material.internals.CoreImports;

/**
 * Created by Artem Godin on 8/26/2019.
 */
public interface AppBar extends ElementPrototype<AppBar> {
    static AppBar create() {
        return Elements.create(CoreImports.imports().get("AppBar"));
    }

    default AppBar position(Position position) {
        return with("position", position.getValue());
    }
}
