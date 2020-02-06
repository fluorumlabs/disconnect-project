package com.github.fluorumlabs.disconnect.vaadin;

import com.github.fluorumlabs.disconnect.vaadin.elements.GridProEditCheckboxElement;
import com.github.fluorumlabs.disconnect.zero.component.AbstractComponent;
import com.github.fluorumlabs.disconnect.zero.component.Component;
import com.github.fluorumlabs.disconnect.zero.component.HasComponents;

/**
 * The cell editor checkbox element.
 *
 * <h3>Styling</h3>
 * See
 * <a href="https://github.com/vaadin/vaadin-checkbox/blob/master/src/vaadin-checkbox.html"><code>&lt;vaadin-checkbox&gt;</code> documentation</a>
 * for <code>&lt;vaadin-checkbox&gt;</code> parts.
 * <p>
 * See
 * <a href="https://github.com/vaadin/vaadin-themable-mixin/wiki">ThemableMixin – how to apply styles for shadow parts</a>
 */
public class VaadinGridProEditCheckbox extends AbstractComponent<GridProEditCheckboxElement>
		implements HasComponents<GridProEditCheckboxElement, VaadinGridProEditCheckbox, Component<?>> {
	public VaadinGridProEditCheckbox() {
		super(GridProEditCheckboxElement.TAGNAME);
	}
}
