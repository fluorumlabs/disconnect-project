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
 * <code>&lt;vaadin-radio-button&gt;</code> is a Web Component for radio buttons.
 *
 * <pre><code class="language-html">&lt;vaadin-radio-button value=&quot;foo&quot;&gt;Foo&lt;/vaadin-radio-button&gt;
 * </code></pre>
 * <h3>Styling</h3>
 * The following shadow DOM parts are available for styling:
 *
 * <table>
 * <thead>
 * <tr><th>Part name</th><th>Description</th></tr>
 * </thead>
 * <tbody>
 * <tr><td><code>radio</code></td><td>The radio button element</td></tr>
 * <tr><td><code>label</code></td><td>The label content element</td></tr>
 * </tbody>
 * </table>
 * The following state attributes are available for styling:
 *
 * <table>
 * <thead>
 * <tr><th>Attribute</th><th>Description</th><th>Part name</th></tr>
 * </thead>
 * <tbody>
 * <tr><td><code>disabled</code></td><td>Set when the radio button is disabled.</td><td>:host</td></tr>
 * <tr><td><code>focus-ring</code></td><td>Set when the radio button is focused using the keyboard
 * .</td><td>:host</td></tr>
 * <tr><td><code>focused</code></td><td>Set when the radio button is focused.</td><td>:host</td></tr>
 * <tr><td><code>checked</code></td><td>Set when the radio button is checked.</td><td>:host</td></tr>
 * <tr><td><code>empty</code></td><td>Set when there is no label provided.</td><td>label</td></tr>
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

		module = "@vaadin/vaadin-radio-button/vaadin-radio-button.js"
)
public interface RadioButtonElement
		extends HTMLElement, ElementMixin, ControlStateMixin, ThemableMixin, GestureEventListeners {
	static String TAGNAME() {
		return "vaadin-radio-button";
	}

	/**
	 * Name of the element.
	 */
	@Nullable
	@JSProperty
	String getName();

	/**
	 * Name of the element.
	 */
	@JSProperty
	void setName(String name);

	/**
	 * True if the radio button is checked.
	 */
	@JSProperty
	boolean isChecked();

	/**
	 * True if the radio button is checked.
	 */
	@JSProperty
	void setChecked(boolean checked);

	/**
	 * The value for this element.
	 */
	@Nullable
	@JSProperty
	String getValue();

	/**
	 * The value for this element.
	 */
	@JSProperty
	void setValue(String value);
}
