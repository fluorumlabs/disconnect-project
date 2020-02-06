package com.github.fluorumlabs.disconnect.vaadin.elements;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import com.github.fluorumlabs.disconnect.vaadin.Vaadin;
import com.github.fluorumlabs.disconnect.vaadin.elements.mixins.ElementMixin;
import com.github.fluorumlabs.disconnect.vaadin.elements.mixins.LoginMixin;
import com.github.fluorumlabs.disconnect.vaadin.elements.mixins.ThemableMixin;
import js.web.dom.HTMLElement;
import org.teavm.jso.JSProperty;

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
@NpmPackage(
		name = "@vaadin/vaadin",
		version = Vaadin.VERSION
)
@Import(
		symbols = "LoginFormElement",
		module = "@vaadin/vaadin-login/vaadin-login-form.js"
)
public interface LoginFormElement extends HTMLElement, ElementMixin, ThemableMixin, LoginMixin {
	String TAGNAME = "vaadin-login-form";

	/**
	 * Defines the theme of the element.
	 * The value is propagated to vaadin-login-form-wrapper element.
	 */
	@Nullable
	@JSProperty
	String getTheme();

	/**
	 * Defines the theme of the element.
	 * The value is propagated to vaadin-login-form-wrapper element.
	 */
	@JSProperty
	void setTheme(String theme);

	void submit();
}
