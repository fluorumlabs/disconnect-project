package com.github.fluorumlabs.disconnect.vaadin;

import com.github.fluorumlabs.disconnect.vaadin.elements.EmailFieldElement;
import com.github.fluorumlabs.disconnect.zero.component.AbstractComponent;
import com.github.fluorumlabs.disconnect.zero.component.Component;
import com.github.fluorumlabs.disconnect.zero.component.HasComponents;

/**
 * `<vaadin-email-field>` is a Web Component for email field control in forms.
 * <p>
 * ```html
 * <vaadin-email-field label="Email">
 * </vaadin-email-field>
 * ```
 * <p>
 * ### Styling
 * <p>
 * See vaadin-text-field.html for the styling documentation
 * <p>
 * See [ThemableMixin – how to apply styles for shadow parts](https://github.com/vaadin/vaadin-themable-mixin/wiki)
 */
public class VaadinEmailField extends AbstractComponent<EmailFieldElement>
		implements HasComponents<EmailFieldElement, VaadinEmailField, Component<?>> {
	public VaadinEmailField() {
		super("vaadin-email-field");
	}
}
