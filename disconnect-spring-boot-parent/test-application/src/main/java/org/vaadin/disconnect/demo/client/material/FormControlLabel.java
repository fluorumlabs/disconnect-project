package org.vaadin.disconnect.demo.client.material;

import org.vaadin.disconnect.core.client.ElementPrototype;
import org.vaadin.disconnect.core.client.Elements;
import org.vaadin.disconnect.demo.client.material.internals.CoreImports;

/**
 * Created by Artem Godin on 8/26/2019.
 */
public interface FormControlLabel extends ElementPrototype<FormControlLabel> {
    static FormControlLabel create() {
        return Elements.create(CoreImports.imports().get("FormControlLabel"));
    }

    static FormControlLabel create(String label, ElementPrototype<?> control) {
        return create().label(label).control(control);
    }

    default FormControlLabel label(String label) {
        return with("label", label);
    }

    default FormControlLabel control(ElementPrototype<?> control) {
        return with("control", Elements.from(control));
    }
}
