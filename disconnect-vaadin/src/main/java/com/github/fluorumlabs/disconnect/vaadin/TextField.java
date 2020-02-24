package com.github.fluorumlabs.disconnect.vaadin;

import com.github.fluorumlabs.disconnect.core.annotations.WebComponent;
import com.github.fluorumlabs.disconnect.vaadin.elements.TextFieldElement;
import com.github.fluorumlabs.disconnect.vaadin.mixins.HasTextFieldMixin;
import com.github.fluorumlabs.disconnect.vaadin.mixins.HasThemableMixin;
import com.github.fluorumlabs.disconnect.vaadin.types.ThemeVariant;
import com.github.fluorumlabs.disconnect.zero.component.*;
import js.extras.JsEnum;

import javax.annotation.Nullable;

/**
 * <code>&lt;vaadin-text-field&gt;</code> is a Web Component for text field control in forms.
 *
 * <pre><code class="language-html">&lt;vaadin-text-field label=&quot;First Name&quot;&gt;
 * &lt;/vaadin-text-field&gt;
 * </code></pre>
 * <h3>Prefixes and suffixes</h3>
 * These are child elements of a <code>&lt;vaadin-text-field&gt;</code> that are displayed
 * inline with the input, before or after.
 * In order for an element to be considered as a prefix, it must have the slot
 * attribute set to <code>prefix</code> (and similarly for <code>suffix</code>).
 *
 * <pre><code class="language-html">&lt;vaadin-text-field label=&quot;Email address&quot;&gt;
 *   &lt;div slot=&quot;prefix&quot;&gt;Sent to:&lt;/div&gt;
 *   &lt;div slot=&quot;suffix&quot;&gt;@vaadin.com&lt;/div&gt;
 * &lt;/vaadin-text-area&gt;
 * </code></pre>
 * <h3>Styling</h3>
 * The following custom properties are available for styling:
 *
 * <table>
 * <thead>
 * <tr><th>Custom property</th><th>Description</th><th>Default</th></tr>
 * </thead>
 * <tbody>
 * <tr><td><code>--vaadin-text-field-default-width</code></td><td>Set the default width of the input
 * field</td><td><code>12em</code></td></tr>
 * </tbody>
 * </table>
 * The following shadow DOM parts are available for styling:
 *
 * <table>
 * <thead>
 * <tr><th>Part name</th><th>Description</th></tr>
 * </thead>
 * <tbody>
 * <tr><td><code>label</code></td><td>The label element</td></tr>
 * <tr><td><code>input-field</code></td><td>The element that wraps prefix, value and suffix</td></tr>
 * <tr><td><code>value</code></td><td>The text value element inside the <code>input-field</code> element</td></tr>
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
 * <tr><td><code>disabled</code></td><td>Set to a disabled text field</td><td>:host</td></tr>
 * <tr><td><code>has-value</code></td><td>Set when the element has a value</td><td>:host</td></tr>
 * <tr><td><code>has-label</code></td><td>Set when the element has a label</td><td>:host</td></tr>
 * <tr><td><code>invalid</code></td><td>Set when the element is invalid</td><td>:host</td></tr>
 * <tr><td><code>input-prevented</code></td><td>Temporarily set when invalid input is prevented</td><td>:host</td></tr>
 * <tr><td><code>focused</code></td><td>Set when the element is focused</td><td>:host</td></tr>
 * <tr><td><code>focus-ring</code></td><td>Set when the element is keyboard focused</td><td>:host</td></tr>
 * <tr><td><code>readonly</code></td><td>Set to a readonly text field</td><td>:host</td></tr>
 * </tbody>
 * </table>
 * See
 * <a href="https://github.com/vaadin/vaadin-themable-mixin/wiki">ThemableMixin – how to apply styles for shadow parts</a>
 */
@WebComponent
public class TextField extends AbstractComponent<TextFieldElement>
		implements HasTextFieldMixin<TextFieldElement, TextField>,
		HasThemableMixin<TextField.Variant, TextFieldElement, TextField>,
		HasSlots<TextFieldElement>,
		HasStyle<TextFieldElement, TextField>, HasComponents<TextFieldElement, TextField, Component<?>> {
	public TextField() {
		super(TextFieldElement.TAGNAME());
	}

	/**
	 * Identifies a list of pre-defined options to suggest to the user.
	 * The value must be the id of a <datalist> element in the same document.
	 */
	@Nullable
	public String list() {
		return getNode().getList();
	}

	/**
	 * Identifies a list of pre-defined options to suggest to the user.
	 * The value must be the id of a <datalist> element in the same document.
	 */
	public TextField list(String list) {
		getNode().setList(list);
		return this;
	}

	/**
	 * A regular expression that the value is checked against.
	 * The pattern must match the entire value, not just some subset.
	 */
	@Nullable
	public String pattern() {
		return getNode().getPattern();
	}

	/**
	 * A regular expression that the value is checked against.
	 * The pattern must match the entire value, not just some subset.
	 */
	public TextField pattern(String pattern) {
		getNode().setPattern(pattern);
		return this;
	}

	/**
	 * The text usually displayed in a tooltip popup when the mouse is over the field.
	 */
	@Nullable
	public String title() {
		return getNode().getTitle();
	}

	/**
	 * The text usually displayed in a tooltip popup when the mouse is over the field.
	 */
	public TextField title(String title) {
		getNode().setTitle(title);
		return this;
	}

	public HasSlots.Container prefixSlot() {
		return slotted("prefix");
	}

	public HasSlots.Container inputSlot() {
		return slotted("input");
	}

	public HasSlots.Container suffixSlot() {
		return slotted("suffix");
	}

	public abstract static class Variant extends ThemeVariant {
		public static final Variant SMALL = JsEnum.of("small");
		public static final Variant ALIGN_CENTER = JsEnum.of("align-center");
		public static final Variant ALIGN_RIGHT = JsEnum.of("align-right");
	}

}

