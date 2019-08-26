package org.vaadin.disconnect.demo.client.material;

import org.vaadin.disconnect.core.client.ElementPrototype;
import org.vaadin.disconnect.core.client.Elements;
import org.vaadin.disconnect.demo.client.material.internals.CoreImports;
import org.vaadin.disconnect.demo.client.material.internals.IconsImports;

/**
 * Created by Artem Godin on 8/26/2019.
 */
public interface Icon extends ElementPrototype<Icon> {
    static Icon create(String name) {
        return Elements.create(IconsImports.imports().get(name));
    }
}
