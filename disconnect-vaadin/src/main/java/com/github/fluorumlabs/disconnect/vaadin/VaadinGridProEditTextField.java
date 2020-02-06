package com.github.fluorumlabs.disconnect.vaadin;

import com.github.fluorumlabs.disconnect.vaadin.elements.GridProEditTextFieldElement;
import com.github.fluorumlabs.disconnect.zero.component.AbstractComponent;
import com.github.fluorumlabs.disconnect.zero.component.Component;
import com.github.fluorumlabs.disconnect.zero.component.HasComponents;

/**
 * The cell editor text-field element.
 *
 * <h3>Styling</h3>
 * See
 * <a href="https://github.com/vaadin/vaadin-text-field/blob/master/src/vaadin-text-field.html"><code>&lt;vaadin-text-field&gt;</code> documentation</a>
 * for <code>&lt;vaadin-text-field&gt;</code> parts.
 * <p>
 * See
 * <a href="https://github.com/vaadin/vaadin-themable-mixin/wiki">ThemableMixin – how to apply styles for shadow parts</a>
 */
public class VaadinGridProEditTextField extends AbstractComponent<GridProEditTextFieldElement>
		implements HasComponents<GridProEditTextFieldElement, VaadinGridProEditTextField, Component<?>> {
	public VaadinGridProEditTextField() {
		super(GridProEditTextFieldElement.TAGNAME);
	}
}
