package org.vaadin.disconnect.demo.client.vaadin;

import org.vaadin.disconnect.core.client.ElementPrototype;
import org.vaadin.disconnect.core.client.Elements;
import org.vaadin.disconnect.demo.client.vaadin.internals.Vaadin;

/**
 * Created by Artem Godin on 8/26/2019.
 */
public interface CheckBox extends ElementPrototype<CheckBox> {
    static CheckBox create() {
        return Elements.create(Vaadin.CHECKBOX);
    }
}
