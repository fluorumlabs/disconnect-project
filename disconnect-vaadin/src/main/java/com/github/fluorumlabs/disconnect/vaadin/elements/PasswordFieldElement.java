package com.github.fluorumlabs.disconnect.vaadin.elements;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import com.github.fluorumlabs.disconnect.vaadin.Vaadin;
import org.teavm.jso.JSProperty;

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
@NpmPackage(
		name = "@vaadin/vaadin",
		version = Vaadin.VERSION
)
@Import(

		module = "@vaadin/vaadin-text-field/theme/lumo/vaadin-password-field.js"
)
public interface PasswordFieldElement extends TextFieldElement {
	static String TAGNAME() {
		return "vaadin-password-field";
	}

	/**
	 * Set to true to hide the eye icon which toggles the password visibility.
	 */
	@JSProperty
	boolean isRevealButtonHidden();

	/**
	 * Set to true to hide the eye icon which toggles the password visibility.
	 */
	@JSProperty
	void setRevealButtonHidden(boolean revealButtonHidden);

	/**
	 * True if the password is visible ([type=text]).
	 */
	@JSProperty
	boolean isPasswordVisible();
}
