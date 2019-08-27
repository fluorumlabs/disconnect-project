package org.vaadin.disconnect.demo.client.material;

import org.vaadin.disconnect.core.client.ElementPrototype;
import org.vaadin.disconnect.core.client.Elements;
import org.vaadin.disconnect.demo.client.material.internals.CoreImports;

/**
 * Created by Artem Godin on 8/26/2019.
 */
public interface InputLabel extends ElementPrototype<InputLabel> {
    static InputLabel create() {
        return Elements.create(CoreImports.imports().get("FormLabel"));
    }

    default InputLabel component(String component) {
        return with("component", component);
    }

    default InputLabel forId(String id) {
        return with("htmlFor", id);
    }

}
