package com.github.fluorumlabs.disconnect.vaadin;

import com.github.fluorumlabs.disconnect.polymer.types.BooleanPropertyChangeEvent;
import com.github.fluorumlabs.disconnect.polymer.types.StringPropertyChangeEvent;
import com.github.fluorumlabs.disconnect.vaadin.elements.CustomFieldElement;
import com.github.fluorumlabs.disconnect.vaadin.mixins.HasCustomFieldMixin;
import com.github.fluorumlabs.disconnect.vaadin.mixins.HasElementMixin;
import com.github.fluorumlabs.disconnect.vaadin.mixins.HasThemableMixin;
import com.github.fluorumlabs.disconnect.zero.component.AbstractComponent;
import com.github.fluorumlabs.disconnect.zero.component.Component;
import com.github.fluorumlabs.disconnect.zero.component.HasComponents;
import com.github.fluorumlabs.disconnect.zero.observable.ObservableEvent;

import javax.annotation.Nullable;

/**
 * <code>&lt;vaadin-custom-field&gt;</code> is a Web Component providing field wrapper functionality.
 *
 * <pre><code>&lt;vaadin-custom-field label=&quot;Appointment time&quot;&gt;
 *   &lt;vaadin-date-picker&gt;&lt;/vaadin-date-picker&gt;
 *   &lt;vaadin-time-picker&gt;&lt;/vaadin-time-picker&gt;
 * &lt;/vaadin-custom-field&gt;
 * </code></pre>
 * <h3>Styling</h3>
 * You may set the attribute <code>disabled</code> or <code>readonly</code> on this component to make the label
 * styles behave the same
 * way as they would on a <code>&lt;vaadin-text-field&gt;</code> which is disabled or readonly.
 * <p>
 * The following shadow DOM parts are available for styling:
 *
 * <table>
 * <thead>
 * <tr><th>Part name</th><th>Description</th></tr>
 * </thead>
 * <tbody>
 * <tr><td><code>label</code></td><td>The label element</td></tr>
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
 * <tr><td><code>has-label</code></td><td>Set when the field has a label</td><td>:host</td></tr>
 * <tr><td><code>invalid</code></td><td>Set when the field is invalid</td><td>:host</td></tr>
 * <tr><td><code>focused</code></td><td>Set when the field contains focus</td><td>:host</td></tr>
 * </tbody>
 * </table>
 * See
 * <a href="https://github.com/vaadin/vaadin-themable-mixin/wiki">ThemableMixin – how to apply styles for shadow parts</a>
 */
public class VaadinCustomField extends AbstractComponent<CustomFieldElement>
		implements HasElementMixin<CustomFieldElement, VaadinCustomField>,
		HasThemableMixin<CustomFieldElement, VaadinCustomField>,
		HasCustomFieldMixin<CustomFieldElement, VaadinCustomField>,
		HasComponents<CustomFieldElement, VaadinCustomField, Component<?>> {
	public VaadinCustomField() {
		super("vaadin-custom-field");
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
	public VaadinCustomField label(String label) {
		getNode().setLabel(label);
		return this;
	}

	/**
	 * The name of the control, which is submitted with the form data.
	 */
	@Nullable
	public String name() {
		return getNode().getName();
	}

	/**
	 * The name of the control, which is submitted with the form data.
	 */
	public VaadinCustomField name(String name) {
		getNode().setName(name);
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
	public VaadinCustomField required(boolean required) {
		getNode().setRequired(required);
		return this;
	}

	/**
	 * The value of the field. When wrapping several inputs, it will contain <code>\t</code>
	 * (Tab character) as a delimiter indicating parts intended to be used as the
	 * corresponding inputs values. Use the
	 * <a href="#/elements/vaadin-custom-field#property-i18n"><code>i18n</code></a>
	 * property to customize this behavior.
	 */
	@Nullable
	public String value() {
		return getNode().getValue();
	}

	/**
	 * The value of the field. When wrapping several inputs, it will contain <code>\t</code>
	 * (Tab character) as a delimiter indicating parts intended to be used as the
	 * corresponding inputs values. Use the
	 * <a href="#/elements/vaadin-custom-field#property-i18n"><code>i18n</code></a>
	 * property to customize this behavior.
	 */
	public VaadinCustomField value(String value) {
		getNode().setValue(value);
		return this;
	}

	/**
	 * This property is set to true when the control value is invalid.
	 */
	public boolean invalid() {
		return getNode().isInvalid();
	}

	/**
	 * This property is set to true when the control value is invalid.
	 */
	public VaadinCustomField invalid(boolean invalid) {
		getNode().setInvalid(invalid);
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
	public VaadinCustomField errorMessage(String errorMessage) {
		getNode().setErrorMessage(errorMessage);
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
	 * Returns true if the current inputs values satisfy all constraints (if any)
	 */
	public boolean checkValidity() {
		return getNode().checkValidity();
	}

	/**
	 * Fired when the <code>value</code> property changes.
	 */
	public ObservableEvent<StringPropertyChangeEvent> valueChangedEvent() {
		return createEvent("value-changed");
	}

	/**
	 * Fired when the <code>invalid</code> property changes.
	 */
	public ObservableEvent<BooleanPropertyChangeEvent> invalidChangedEvent() {
		return createEvent("invalid-changed");
	}
}
