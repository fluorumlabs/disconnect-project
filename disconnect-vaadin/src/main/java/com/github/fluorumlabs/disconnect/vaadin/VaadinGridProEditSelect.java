package com.github.fluorumlabs.disconnect.vaadin;

import com.github.fluorumlabs.disconnect.vaadin.elements.GridProEditSelectElement;
import com.github.fluorumlabs.disconnect.zero.component.AbstractComponent;
import com.github.fluorumlabs.disconnect.zero.component.Component;
import com.github.fluorumlabs.disconnect.zero.component.HasComponents;

import javax.annotation.Nullable;

/**
 * The cell editor select element.
 * <p>
 * ### Styling
 * <p>
 * See [`<vaadin-select>` documentation](https://github.com/vaadin/vaadin-select/blob/master/src/vaadin-select.html)
 * for `<vaadin-grid-pro-edit-select>` parts.
 * <p>
 * See [ThemableMixin – how to apply styles for shadow parts](https://github.com/vaadin/vaadin-themable-mixin/wiki)
 */
public class VaadinGridProEditSelect extends AbstractComponent<GridProEditSelectElement>
        implements HasComponents<GridProEditSelectElement, VaadinGridProEditSelect, Component<?>> {
    public VaadinGridProEditSelect() {
        super("vaadin-grid-pro-edit-select");
    }

    @Nullable
    public String[] options() {
        return getNode().getOptions();
    }

    public VaadinGridProEditSelect options(String... options) {
        getNode().setOptions(options);
        return this;
    }
}
