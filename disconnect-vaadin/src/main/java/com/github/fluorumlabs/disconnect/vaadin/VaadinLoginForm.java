package com.github.fluorumlabs.disconnect.vaadin;

import com.github.fluorumlabs.disconnect.vaadin.elements.LoginFormElement;
import com.github.fluorumlabs.disconnect.vaadin.mixins.HasElementMixin;
import com.github.fluorumlabs.disconnect.vaadin.mixins.HasLoginMixin;
import com.github.fluorumlabs.disconnect.vaadin.mixins.HasThemableMixin;
import com.github.fluorumlabs.disconnect.zero.component.AbstractComponent;
import com.github.fluorumlabs.disconnect.zero.component.Component;
import com.github.fluorumlabs.disconnect.zero.component.HasComponents;

import javax.annotation.Nullable;

/**
 * `<vaadin-login-form>` is a Web Component providing an easy way to require users
 * to log in into an application. Note that component has no shadowRoot.
 * <p>
 * ```
 * <vaadin-login-form></vaadin-login-form>
 * ```
 * <p>
 * Component has to be accessible from the `document` layer in order to allow password managers to work properly with
 * form values.
 * Using `<vaadin-login-overlay>` allows to always attach the component to the document body.
 * <p>
 * ### Styling
 * <p>
 * The component doesn't have a shadowRoot, so the html form and input fields can be styled in an upper layer. To style
 * `vaadin-login-form-wrapper` check its documentation.
 * <p>
 * See examples of setting the content into slots in the live demos.
 */
public class VaadinLoginForm extends AbstractComponent<LoginFormElement>
		implements HasElementMixin<LoginFormElement, VaadinLoginForm>,
		HasThemableMixin<LoginFormElement, VaadinLoginForm>,
		HasLoginMixin<LoginFormElement, VaadinLoginForm>,
		HasComponents<LoginFormElement, VaadinLoginForm, Component<?>> {
	public VaadinLoginForm() {
		super("vaadin-login-form");
	}

	/**
	 * Defines the theme of the element.
	 * The value is propagated to vaadin-login-form-wrapper element.
	 */
	@Nullable
	public String theme() {
		return getNode().getTheme();
	}

	/**
	 * Defines the theme of the element.
	 * The value is propagated to vaadin-login-form-wrapper element.
	 */
	public VaadinLoginForm theme(String theme) {
		getNode().setTheme(theme);
		return this;
	}

	public void submit() {
		getNode().submit();
	}
}
