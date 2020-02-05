package com.github.fluorumlabs.disconnect.vaadin;

import com.github.fluorumlabs.disconnect.vaadin.elements.PasswordFieldElement;
import com.github.fluorumlabs.disconnect.zero.component.AbstractComponent;
import com.github.fluorumlabs.disconnect.zero.component.Component;
import com.github.fluorumlabs.disconnect.zero.component.HasComponents;

/**
 * `<vaadin-password-field>` is a Web Component for password field control in forms.
 * <p>
 * ```html
 * <vaadin-password-field label="Password">
 * </vaadin-password-field>
 * ```
 * <p>
 * ### Styling
 * <p>
 * See vaadin-text-field.html for the styling documentation
 * <p>
 * In addition to vaadin-text-field parts, here's the list of vaadin-password-field specific parts
 * <p>
 * Part name       | Description
 * ----------------|----------------------------------------------------
 * `reveal-button` | The eye icon which toggles the password visibility
 * <p>
 * In addition to vaadin-text-field state attributes, here's the list of vaadin-password-field specific attributes
 * <p>
 * Attribute    | Description | Part name
 * -------------|-------------|------------
 * `password-visible` | Set when the password is visible | :host
 * <p>
 * See [ThemableMixin – how to apply styles for shadow parts](https://github.com/vaadin/vaadin-themable-mixin/wiki)
 */
public class VaadinPasswordField extends AbstractComponent<PasswordFieldElement>
		implements HasComponents<PasswordFieldElement, VaadinPasswordField, Component<?>> {
	public VaadinPasswordField() {
		super("vaadin-password-field");
	}

	/**
	 * Set to true to hide the eye icon which toggles the password visibility.
	 */
	public boolean revealButtonHidden() {
		return getNode().isRevealButtonHidden();
	}

	/**
	 * Set to true to hide the eye icon which toggles the password visibility.
	 */
	public VaadinPasswordField revealButtonHidden(boolean revealButtonHidden) {
		getNode().setRevealButtonHidden(revealButtonHidden);
		return this;
	}

	/**
	 * True if the password is visible ([type=text]).
	 */
	public boolean passwordVisible() {
		return getNode().isPasswordVisible();
	}
}
