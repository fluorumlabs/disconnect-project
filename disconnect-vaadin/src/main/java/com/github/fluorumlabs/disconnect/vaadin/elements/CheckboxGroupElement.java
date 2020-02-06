package com.github.fluorumlabs.disconnect.vaadin.elements;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import com.github.fluorumlabs.disconnect.vaadin.Vaadin;
import com.github.fluorumlabs.disconnect.vaadin.elements.mixins.ThemableMixin;
import js.web.dom.HTMLElement;
import org.teavm.jso.JSByRef;
import org.teavm.jso.JSProperty;

import javax.annotation.Nullable;

/**
 * <code>&lt;vaadin-checkbox-group&gt;</code> is a Polymer element for grouping vaadin-checkboxes.
 *
 * <pre><code class="language-html">&lt;vaadin-checkbox-group label=&quot;Preferred language of contact:&quot;&gt;
 *  &lt;vaadin-checkbox value=&quot;en&quot;&gt;English&lt;/vaadin-checkbox&gt;
 *  &lt;vaadin-checkbox value=&quot;fr&quot;&gt;Français&lt;/vaadin-checkbox&gt;
 *  &lt;vaadin-checkbox value=&quot;de&quot;&gt;Deutsch&lt;/vaadin-checkbox&gt;
 * &lt;/vaadin-checkbox-group&gt;
 * </code></pre>
 * <h3>Styling</h3>
 * The following shadow DOM parts are available for styling:
 *
 * <table>
 * <thead>
 * <tr><th>Part name</th><th>Description</th></tr>
 * </thead>
 * <tbody>
 * <tr><td><code>label</code></td><td>The label element</td></tr>
 * <tr><td><code>group-field</code></td><td>The element that wraps checkboxes</td></tr>
 * <tr><td><code>error-message</code></td><td>The error message element</td></tr>
 * </tbody>
 * </table>
 * The following state attributes are available for styling:
 *
 * <table>
 * <thead>
 * <tr><th>Attribute</th><th>Description</th><th>Part name</th></tr>
 * </thead>
 * <tbody>
 * <tr><td><code>disabled</code></td><td>Set when the checkbox group and its children are disabled
 * .</td><td>:host</td></tr>
 * <tr><td><code>focused</code></td><td>Set when the checkbox group contains focus</td><td>:host</td></tr>
 * <tr><td><code>has-label</code></td><td>Set when the element has a label</td><td>:host</td></tr>
 * <tr><td><code>has-value</code></td><td>Set when the element has a value</td><td>:host</td></tr>
 * <tr><td><code>required</code></td><td>Set when the element is required</td><td>:host</td></tr>
 * <tr><td><code>invalid</code></td><td>Set when the element is invalid</td><td>:host</td></tr>
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
		symbols = "CheckboxGroupElement",
		module = "@vaadin/vaadin-checkbox/vaadin-checkbox-group.js"
)
public interface CheckboxGroupElement extends HTMLElement, ThemableMixin {
	/**
	 * The current disabled state of the checkbox group. True if group and all internal checkboxes are disabled.
	 */
	@JSProperty
	boolean isDisabled();

	/**
	 * The current disabled state of the checkbox group. True if group and all internal checkboxes are disabled.
	 */
	@JSProperty
	void setDisabled(boolean disabled);

	/**
	 * String used for the label element.
	 */
	@Nullable
	@JSProperty
	String getLabel();

	/**
	 * String used for the label element.
	 */
	@JSProperty
	void setLabel(String label);

	/**
	 * Value of the checkbox group.
	 * Note: toggling the checkboxes modifies the value by creating new
	 * array each time, to override Polymer dirty-checking for arrays.
	 * You can still use Polymer array mutation methods to update the value.
	 */
	@Nullable
	@JSProperty
	String[] getValue();

	/**
	 * Value of the checkbox group.
	 * Note: toggling the checkboxes modifies the value by creating new
	 * array each time, to override Polymer dirty-checking for arrays.
	 * You can still use Polymer array mutation methods to update the value.
	 */
	@JSProperty
	void setValue(@JSByRef String... value);

	/**
	 * Error to show when the input value is invalid.
	 */
	@Nullable
	@JSProperty
	String getErrorMessage();

	/**
	 * Error to show when the input value is invalid.
	 */
	@JSProperty
	void setErrorMessage(String errorMessage);

	/**
	 * Specifies that the user must fill in a value.
	 */
	@JSProperty
	boolean isRequired();

	/**
	 * Specifies that the user must fill in a value.
	 */
	@JSProperty
	void setRequired(boolean required);

	/**
	 * This property is set to true when the control value is invalid.
	 */
	@JSProperty
	boolean isInvalid();

	/**
	 * This property is set to true when the control value is invalid.
	 */
	@JSProperty
	void setInvalid(boolean invalid);

	/**
	 * Returns true if <code>value</code> is valid.
	 * <code>&lt;iron-form&gt;</code> uses this to check the validity or all its elements.
	 *
	 * @return True if the value is valid.
	 */
	boolean validate();
}
