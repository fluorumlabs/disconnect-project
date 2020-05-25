package com.github.fluorumlabs.disconnect.vaadin;

import com.github.fluorumlabs.disconnect.core.annotations.WebComponent;
import com.github.fluorumlabs.disconnect.vaadin.elements.LoginFormElement;
import com.github.fluorumlabs.disconnect.vaadin.mixins.HasElementMixin;
import com.github.fluorumlabs.disconnect.vaadin.mixins.HasLoginMixin;
import com.github.fluorumlabs.disconnect.zero.component.AbstractComponent;
import com.github.fluorumlabs.disconnect.core.components.HasElement;
import com.github.fluorumlabs.disconnect.zero.component.HasComponents;
import com.github.fluorumlabs.disconnect.zero.component.HasStyle;

import javax.annotation.Nullable;

/**
 * <code>&lt;vaadin-login-form&gt;</code> is a Web Component providing an easy way to require users
 * to log in into an application. Note that component has no shadowRoot.
 *
 * <pre><code>&lt;vaadin-login-form&gt;&lt;/vaadin-login-form&gt;
 * </code></pre>
 * Component has to be accessible from the <code>document</code> layer in order to allow password managers to work
 * properly with form values.
 * Using <code>&lt;vaadin-login-overlay&gt;</code> allows to always attach the component to the document body.
 *
 * <h3>Styling</h3>
 * The component doesn't have a shadowRoot, so the html form and input fields can be styled in an upper layer. To style
 * <code>vaadin-login-form-wrapper</code> check its documentation.
 * <p>
 * See examples of setting the content into slots in the live demos.
 */
@WebComponent
public class LoginForm extends AbstractComponent<LoginFormElement>
		implements HasElementMixin<LoginFormElement, LoginForm>,
		HasLoginMixin<LoginFormElement, LoginForm>,
		HasStyle<LoginFormElement, LoginForm>, HasComponents<LoginFormElement, LoginForm, HasElement<?>> {
	public LoginForm() {
		super(LoginFormElement.TAGNAME());
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
	public LoginForm theme(String theme) {
		getNode().setTheme(theme);
		return this;
	}

	public void submit() {
		getNode().submit();
	}
}
