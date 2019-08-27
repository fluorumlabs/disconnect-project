package org.vaadin.disconnect.demo.client.material;

import org.vaadin.disconnect.core.client.Constructor;
import org.vaadin.disconnect.core.client.ElementPrototype;
import org.vaadin.disconnect.core.client.Elements;
import org.vaadin.disconnect.demo.client.material.internals.IconsImports;

/**
 * Created by Artem Godin on 8/26/2019.
 */
public interface Icon extends ElementPrototype<Icon> {
    static Icon create(Material icon) {
        return Elements.create(icon.getValue());
    }

    enum Material {
        CREATE(IconsImports.Create()),
        CLEAR(IconsImports.Clear()),
        MAP(IconsImports.Map()),
        DATE_RANGE(IconsImports.DateRange()),
        PIE_CHART(IconsImports.PieChart());

        private final Constructor value;

        Material(Constructor value) {
            this.value = value;
        }

        public Constructor getValue() {
            return value;
        }
    }
}
