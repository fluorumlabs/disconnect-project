package org.vaadin.disconnect.core.client.router;

import org.vaadin.disconnect.core.client.ElementPrototype;
import org.vaadin.disconnect.core.client.Elements;
import org.vaadin.disconnect.core.client.internals.RouterImports;

/**
 * Created by Artem Godin on 8/26/2019.
 */
public interface Switch extends ElementPrototype<Switch> {
    static Switch create() {
        return Elements.create(RouterImports.routeSwitch());
    }

    static Switch create(ElementPrototype<?>... children) {
        return create().add(children);
    }

}
