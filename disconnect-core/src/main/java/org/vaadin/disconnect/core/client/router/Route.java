package org.vaadin.disconnect.core.client.router;

import org.teavm.jso.JSObject;
import org.vaadin.disconnect.core.client.Constructor;
import org.vaadin.disconnect.core.client.ElementPrototype;
import org.vaadin.disconnect.core.client.Elements;
import org.vaadin.disconnect.core.client.internals.RouterImports;

/**
 * Created by Artem Godin on 8/26/2019.
 */
public interface Route extends ElementPrototype<Route> {
    static Route create() {
        return Elements.create(RouterImports.route());
    }

    static Route create(String path, Constructor target) {
        return create().path(path).target(target);
    }

    static Route create(Constructor target) {
        return create().target(target);
    }

    default Route path(String path) {
        return with("path", path);
    }

    default Route exact() {
        return with("exact", true);
    }

    default Route target(Constructor constructor) {
        return with("component", constructor);
    }
}
