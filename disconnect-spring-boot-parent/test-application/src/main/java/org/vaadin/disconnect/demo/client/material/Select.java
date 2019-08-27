package org.vaadin.disconnect.demo.client.material;

import org.teavm.jso.JSIndexer;
import org.teavm.jso.JSObject;
import org.teavm.jso.core.JSObjects;
import org.vaadin.disconnect.core.client.ElementPrototype;
import org.vaadin.disconnect.core.client.Elements;
import org.vaadin.disconnect.demo.client.material.internals.CoreImports;

/**
 * Created by Artem Godin on 8/26/2019.
 */
public interface Select extends ElementPrototype<Select> {
    static Select create() {
        return Elements.create(CoreImports.imports().get("Select"));
    }

    default Select nativeSelect() {
        return with("native", true);
    }

    default Select input(ElementPrototype<?> input) {
        return with("input", Elements.from(input));
    }
}
