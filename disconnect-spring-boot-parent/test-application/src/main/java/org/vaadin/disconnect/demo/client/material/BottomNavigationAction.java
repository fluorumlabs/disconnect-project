package org.vaadin.disconnect.demo.client.material;

import org.vaadin.disconnect.core.client.ElementPrototype;
import org.vaadin.disconnect.core.client.Elements;
import org.vaadin.disconnect.demo.client.material.internals.CoreImports;

/**
 * Created by Artem Godin on 8/26/2019.
 */
public interface BottomNavigationAction extends ElementPrototype<BottomNavigationAction> {
    static BottomNavigationAction create() {
        return Elements.create(CoreImports.imports().get("BottomNavigationAction"));
    }

    static BottomNavigationAction create(String value, String label, Icon.Material icon) {
        return create().label(label).icon(Icon.create(icon)).value(value);
    }

    default BottomNavigationAction label(String label) {
        return with("label", label);
    }

    default BottomNavigationAction value(String value) {
        return with("value", value);
    }

    default BottomNavigationAction icon(Icon icon) {
        return with("icon", Elements.from(icon));
    }

}
