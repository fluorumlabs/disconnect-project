package com.github.fluorumlabs.disconnect.vaadin;

import com.github.fluorumlabs.disconnect.polymer.types.BooleanPropertyChangeEvent;
import com.github.fluorumlabs.disconnect.polymer.types.StringPropertyChangeEvent;
import com.github.fluorumlabs.disconnect.vaadin.elements.RadioGroupElement;
import com.github.fluorumlabs.disconnect.vaadin.mixins.HasThemableMixin;
import com.github.fluorumlabs.disconnect.zero.component.AbstractComponent;
import com.github.fluorumlabs.disconnect.zero.component.Component;
import com.github.fluorumlabs.disconnect.zero.component.HasComponents;
import com.github.fluorumlabs.disconnect.zero.observable.ObservableEvent;

import javax.annotation.Nullable;

/**
 * <code>&lt;vaadin-radio-group&gt;</code> is a Web Component for grouping vaadin-radio-buttons.
 *
 * <pre><code class="language-html">&lt;vaadin-radio-group&gt;
 *   &lt;vaadin-radio-button name=&quot;foo&quot;&gt;Foo&lt;/vaadin-radio-button&gt;
 *   &lt;vaadin-radio-button name=&quot;bar&quot;&gt;Bar&lt;/vaadin-radio-button&gt;
 *   &lt;vaadin-radio-button name=&quot;baz&quot;&gt;Baz&lt;/vaadin-radio-button&gt;
 * &lt;/vaadin-radio-group&gt;
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
 * <tr><td><code>group-field</code></td><td>The element that wraps radio-buttons</td></tr>
 * </tbody>
 * </table>
 * The following state attributes are available for styling:
 *
 * <table>
 * <thead>
 * <tr><th>Attribute</th><th>Description</th><th>Part name</th></tr>
 * </thead>
 * <tbody>
 * <tr><td><code>disabled</code></td><td>Set when the radio group and its children are disabled.</td><td>:host</td></tr>
 * <tr><td><code>readonly</code></td><td>Set to a readonly radio group</td><td>:host</td></tr>
 * <tr><td><code>invalid</code></td><td>Set when the element is invalid</td><td>:host</td></tr>
 * <tr><td><code>has-label</code></td><td>Set when the element has a label</td><td>:host</td></tr>
 * <tr><td><code>has-value</code></td><td>Set when the element has a value</td><td>:host</td></tr>
 * <tr><td><code>focused</code></td><td>Set when the element contains focus</td><td>:host</td></tr>
 * </tbody>
 * </table>
 * See
 * <a href="https://github.com/vaadin/vaadin-themable-mixin/wiki">ThemableMixin – how to apply styles for shadow parts</a>
 */
public class VaadinRadioGroup extends AbstractComponent<RadioGroupElement>
		implements HasThemableMixin<RadioGroupElement, VaadinRadioGroup>,
		HasComponents<RadioGroupElement, VaadinRadioGroup, Component<?>> {
	public VaadinRadioGroup() {
		super(RadioGroupElement.TAGNAME());
	}

	/**
	 * The current disabled state of the radio group. True if group and all internal radio buttons are disabled.
	 */
	public boolean disabled() {
		return getNode().isDisabled();
	}

	/**
	 * The current disabled state of the radio group. True if group and all internal radio buttons are disabled.
	 */
	public VaadinRadioGroup disabled(boolean disabled) {
		getNode().setDisabled(disabled);
		return this;
	}

	/**
	 * This attribute indicates that the user cannot modify the value of the control.
	 */
	public boolean readonly() {
		return getNode().isReadonly();
	}

	/**
	 * This attribute indicates that the user cannot modify the value of the control.
	 */
	public VaadinRadioGroup readonly(boolean readonly) {
		getNode().setReadonly(readonly);
		return this;
	}

	/**
	 * This property is set to true when the value is invalid.
	 */
	public boolean invalid() {
		return getNode().isInvalid();
	}

	/**
	 * This property is set to true when the value is invalid.
	 */
	public VaadinRadioGroup invalid(boolean invalid) {
		getNode().setInvalid(invalid);
		return this;
	}

	/**
	 * Specifies that the user must fill in a value.
	 */
	public boolean required() {
		return getNode().isRequired();
	}

	/**
	 * Specifies that the user must fill in a value.
	 */
	public VaadinRadioGroup required(boolean required) {
		getNode().setRequired(required);
		return this;
	}

	/**
	 * Error to show when the input value is invalid.
	 */
	@Nullable
	public String errorMessage() {
		return getNode().getErrorMessage();
	}

	/**
	 * Error to show when the input value is invalid.
	 */
	public VaadinRadioGroup errorMessage(String errorMessage) {
		getNode().setErrorMessage(errorMessage);
		return this;
	}

	/**
	 * String used for the label element.
	 */
	@Nullable
	public String label() {
		return getNode().getLabel();
	}

	/**
	 * String used for the label element.
	 */
	public VaadinRadioGroup label(String label) {
		getNode().setLabel(label);
		return this;
	}

	/**
	 * Value of the radio group.
	 */
	@Nullable
	public String value() {
		return getNode().getValue();
	}

	/**
	 * Value of the radio group.
	 */
	public VaadinRadioGroup value(String value) {
		getNode().setValue(value);
		return this;
	}

	/**
	 * Returns true if <code>value</code> is valid.
	 * <code>&lt;iron-form&gt;</code> uses this to check the validity or all its elements.
	 *
	 * @return True if the value is valid.
	 */
	public boolean validate() {
		return getNode().validate();
	}

	/**
	 * Returns true if the current input value satisfies all constraints (if any)
	 */
	public boolean checkValidity() {
		return getNode().checkValidity();
	}

	/**
	 * Fired when the <code>invalid</code> property changes.
	 */
	public ObservableEvent<BooleanPropertyChangeEvent> invalidChangedEvent() {
		return createEvent("invalid-changed");
	}

	/**
	 * Fired when the <code>value</code> property changes.
	 */
	public ObservableEvent<StringPropertyChangeEvent> valueChangedEvent() {
		return createEvent("value-changed");
	}
}
