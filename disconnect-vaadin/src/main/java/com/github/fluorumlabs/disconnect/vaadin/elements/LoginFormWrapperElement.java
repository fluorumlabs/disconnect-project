package com.github.fluorumlabs.disconnect.vaadin.elements;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import com.github.fluorumlabs.disconnect.vaadin.Vaadin;
import com.github.fluorumlabs.disconnect.vaadin.elements.mixins.ElementMixin;
import com.github.fluorumlabs.disconnect.vaadin.elements.mixins.LoginMixin;
import com.github.fluorumlabs.disconnect.vaadin.elements.mixins.ThemableMixin;
import js.web.dom.HTMLElement;

/**
 * <code>&lt;vaadin-login-form-wrapper&gt;</code> is a helper component providing a wrapper for the login form.
 * <p>
 * See the usage in <code>&lt;vaadin-login-form&gt;</code>.
 *
 * <h3>Styling</h3>
 * The following Shadow DOM parts of the <code>&lt;vaadin-login-form-wrapper&gt;</code> are available for styling:
 *
 * <table>
 * <thead>
 * <tr><th>Part name</th><th>Description</th></tr>
 * </thead>
 * <tbody>
 * <tr><td><code>form</code></td><td>Container for the entire component's content</td></tr>
 * <tr><td><code>form-title</code></td><td>Title of the login form</td></tr>
 * <tr><td><code>error-message</code></td><td>Container for error message, contains error-message-title and
 * error-message-description parts. Hidden by default.</td></tr>
 * <tr><td><code>error-message-title</code></td><td>Container for error message title</td></tr>
 * <tr><td><code>error-message-description</code></td><td>Container for error message description</td></tr>
 * <tr><td><code>error-message-description</code></td><td>Container for error message description</td></tr>
 * <tr><td><code>footer</code></td><td>Container additional information text from <code>i18n</code> object</td></tr>
 * </tbody>
 * </table>
 * See
 * <a href="https://github.com/vaadin/vaadin-themable-mixin/wiki">ThemableMixin – how to apply styles for shadow parts</a>
 *
 * <h3>Component's slots</h3>
 * The following slots are available for being set
 *
 * <table>
 * <thead>
 * <tr><th>Slot name</th><th>Description</th></tr>
 * </thead>
 * <tbody>
 * <tr><td><code>form</code></td><td>Html form placeholder. See the usage in <code>&lt;vaadin-login-form&gt;</code>
 * .</td></tr>
 * </tbody>
 * </table>
 * See examples of setting the content into slots in the live demos.
 */
@NpmPackage(
		name = "@vaadin/vaadin",
		version = Vaadin.VERSION
)
@Import(
		symbols = "LoginFormWrapperElement",
		module = "@vaadin/vaadin-login/vaadin-login-form-wrapper.js"
)
public interface LoginFormWrapperElement extends HTMLElement, ElementMixin, ThemableMixin, LoginMixin {
}
