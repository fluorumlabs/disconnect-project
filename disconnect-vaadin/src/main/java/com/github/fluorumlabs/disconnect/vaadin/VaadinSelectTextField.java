package com.github.fluorumlabs.disconnect.vaadin;

import com.github.fluorumlabs.disconnect.vaadin.elements.SelectTextFieldElement;
import com.github.fluorumlabs.disconnect.zero.component.AbstractComponent;
import com.github.fluorumlabs.disconnect.zero.component.Component;
import com.github.fluorumlabs.disconnect.zero.component.HasComponents;
import js.web.dom.Element;

/**
 * The text-field element.
 *
 * <h3>Styling</h3>
 * See
 * <a href="https://github.com/vaadin/vaadin-text-field/blob/master/src/vaadin-text-field.html"><code>&lt;vaadin-text-field&gt;</code> documentation</a>
 * for <code>&lt;vaadin-select-text-field&gt;</code> parts and available slots (prefix, suffix etc.)
 * <p>
 * See
 * <a href="https://github.com/vaadin/vaadin-themable-mixin/wiki">ThemableMixin – how to apply styles for shadow parts</a>
 */
public class VaadinSelectTextField extends AbstractComponent<SelectTextFieldElement>
		implements HasComponents<SelectTextFieldElement, VaadinSelectTextField, Component<?>> {
	public VaadinSelectTextField() {
		super(SelectTextFieldElement.TAGNAME());
	}

	/**
	 *
	 */
	public Element focusElement() {
		return getNode().getFocusElement();
	}

	/**
	 *
	 */
	public Element inputElement() {
		return getNode().getInputElement();
	}
}
