package com.github.fluorumlabs.disconnect.vaadin;

import com.github.fluorumlabs.disconnect.vaadin.elements.GridProEditCheckboxElement;
import com.github.fluorumlabs.disconnect.zero.component.AbstractComponent;
import com.github.fluorumlabs.disconnect.zero.component.Component;
import com.github.fluorumlabs.disconnect.zero.component.HasComponents;

/**
 * The cell editor checkbox element.
 * <p>
 * ### Styling
 * <p>
 * See [`<vaadin-checkbox>` documentation](https://github.com/vaadin/vaadin-checkbox/blob/master/src/vaadin-checkbox
 * .html)
 * for `<vaadin-checkbox>` parts.
 * <p>
 * See [ThemableMixin – how to apply styles for shadow parts](https://github.com/vaadin/vaadin-themable-mixin/wiki)
 */
public class VaadinGridProEditCheckbox extends AbstractComponent<GridProEditCheckboxElement>
		implements HasComponents<GridProEditCheckboxElement, VaadinGridProEditCheckbox, Component<?>> {
	public VaadinGridProEditCheckbox() {
		super("vaadin-grid-pro-edit-checkbox");
	}
}
