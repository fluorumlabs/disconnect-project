package com.github.fluorumlabs.disconnect.vaadin.elements;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import com.github.fluorumlabs.disconnect.polymer.elements.mixins.GestureEventListeners;
import com.github.fluorumlabs.disconnect.vaadin.Vaadin;
import com.github.fluorumlabs.disconnect.vaadin.elements.mixins.ControlStateMixin;
import com.github.fluorumlabs.disconnect.vaadin.elements.mixins.ElementMixin;
import com.github.fluorumlabs.disconnect.vaadin.elements.mixins.ThemableMixin;
import js.web.dom.HTMLElement;
import org.teavm.jso.JSProperty;

import javax.annotation.Nullable;

/**
 * <code>&lt;vaadin-checkbox&gt;</code> is a Web Component for customized checkboxes.
 *
 * <pre><code class="language-html">&lt;vaadin-checkbox&gt;
 *   Make my profile visible
 * &lt;/vaadin-checkbox&gt;
 * </code></pre>
 * <h3>Styling</h3>
 * The following shadow DOM parts are available for styling:
 *
 * <table>
 * <thead>
 * <tr><th>Part name</th><th>Description</th></tr>
 * </thead>
 * <tbody>
 * <tr><td><code>checkbox</code></td><td>The wrapper element for the native <input type="checkbox"></td></tr>
 * <tr><td><code>label</code></td><td>The wrapper element in which the component's children, namely the label, is
 * slotted</td></tr>
 * </tbody>
 * </table>
 * The following state attributes are available for styling:
 *
 * <table>
 * <thead>
 * <tr><th>Attribute</th><th>Description</th><th>Part name</th></tr>
 * </thead>
 * <tbody>
 * <tr><td><code>active</code></td><td>Set when the checkbox is pressed down, either with mouse, touch or the
 * keyboard.</td><td><code>:host</code></td></tr>
 * <tr><td><code>disabled</code></td><td>Set when the checkbox is disabled.</td><td><code>:host</code></td></tr>
 * <tr><td><code>focus-ring</code></td><td>Set when the checkbox is focused using the keyboard
 * .</td><td><code>:host</code></td></tr>
 * <tr><td><code>focused</code></td><td>Set when the checkbox is focused.</td><td><code>:host</code></td></tr>
 * <tr><td><code>indeterminate</code></td><td>Set when the checkbox is in indeterminate mode
 * .</td><td><code>:host</code></td></tr>
 * <tr><td><code>checked</code></td><td>Set when the checkbox is checked.</td><td><code>:host</code></td></tr>
 * <tr><td><code>empty</code></td><td>Set when there is no label provided.</td><td><code>label</code></td></tr>
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
		symbols = "CheckboxElement",
		module = "@vaadin/vaadin-checkbox/vaadin-checkbox.js"
)
public interface CheckboxElement
		extends HTMLElement, ElementMixin, ControlStateMixin, ThemableMixin, GestureEventListeners {
	String TAGNAME = "vaadin-checkbox";
	/**
	 * Name of the element.
	 */
	@JSProperty
	String getName();

	/**
	 * Name of the element.
	 */
	@JSProperty
	void setName(String name);

	/**
	 * True if the checkbox is checked.
	 */
	@JSProperty
	boolean isChecked();

	/**
	 * True if the checkbox is checked.
	 */
	@JSProperty
	void setChecked(boolean checked);

	/**
	 * Indeterminate state of the checkbox when it's neither checked nor unchecked, but undetermined.
	 * <a href="https://developer.mozilla.org/en-US/docs/Web/HTML/Element/input/checkbox#Indeterminate_state_checkboxes">https://developer.mozilla.org/en-US/docs/Web/HTML/Element/input/checkbox#Indeterminate_state_checkboxes</a>
	 */
	@JSProperty
	boolean isIndeterminate();

	/**
	 * Indeterminate state of the checkbox when it's neither checked nor unchecked, but undetermined.
	 * <a href="https://developer.mozilla.org/en-US/docs/Web/HTML/Element/input/checkbox#Indeterminate_state_checkboxes">https://developer.mozilla.org/en-US/docs/Web/HTML/Element/input/checkbox#Indeterminate_state_checkboxes</a>
	 */
	@JSProperty
	void setIndeterminate(boolean indeterminate);

	/**
	 * The value given to the data submitted with the checkbox's name to the server when the control is inside a form.
	 */
	@Nullable
	@JSProperty
	String getValue();

	/**
	 * The value given to the data submitted with the checkbox's name to the server when the control is inside a form.
	 */
	@JSProperty
	void setValue(String value);
}
