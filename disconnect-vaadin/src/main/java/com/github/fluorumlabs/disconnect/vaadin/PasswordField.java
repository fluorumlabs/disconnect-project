package com.github.fluorumlabs.disconnect.vaadin;

import com.github.fluorumlabs.disconnect.core.annotations.WebComponent;
import com.github.fluorumlabs.disconnect.vaadin.elements.PasswordFieldElement;
import com.github.fluorumlabs.disconnect.vaadin.mixins.HasThemableMixin;
import com.github.fluorumlabs.disconnect.zero.component.AbstractComponent;
import com.github.fluorumlabs.disconnect.core.components.HasElement;
import com.github.fluorumlabs.disconnect.zero.component.HasComponents;
import com.github.fluorumlabs.disconnect.zero.component.HasStyle;

/**
 * <code>&lt;vaadin-password-field&gt;</code> is a Web Component for password field control in forms.
 *
 * <pre><code class="language-html">&lt;vaadin-password-field label=&quot;Password&quot;&gt;
 * &lt;/vaadin-password-field&gt;
 * </code></pre>
 * <h3>Styling</h3>
 * See vaadin-text-field.html for the styling documentation
 * <p>
 * In addition to vaadin-text-field parts, here's the list of vaadin-password-field specific parts
 *
 * <table>
 * <thead>
 * <tr><th>Part name</th><th>Description</th></tr>
 * </thead>
 * <tbody>
 * <tr><td><code>reveal-button</code></td><td>The eye icon which toggles the password visibility</td></tr>
 * </tbody>
 * </table>
 * In addition to vaadin-text-field state attributes, here's the list of vaadin-password-field specific attributes
 *
 * <table>
 * <thead>
 * <tr><th>Attribute</th><th>Description</th><th>Part name</th></tr>
 * </thead>
 * <tbody>
 * <tr><td><code>password-visible</code></td><td>Set when the password is visible</td><td>:host</td></tr>
 * </tbody>
 * </table>
 * See
 * <a href="https://github.com/vaadin/vaadin-themable-mixin/wiki">ThemableMixin – how to apply styles for shadow parts</a>
 */
@WebComponent
public class PasswordField extends AbstractComponent<PasswordFieldElement>
		implements HasThemableMixin<TextField.Variant, PasswordFieldElement, PasswordField>,
		HasStyle<PasswordFieldElement, PasswordField>, HasComponents<PasswordFieldElement, PasswordField, HasElement<?>> {
	public PasswordField() {
		super(PasswordFieldElement.TAGNAME());
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
	public PasswordField revealButtonHidden(boolean revealButtonHidden) {
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
