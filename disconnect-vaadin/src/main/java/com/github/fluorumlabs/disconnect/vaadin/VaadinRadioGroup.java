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
 * `<vaadin-radio-group>` is a Web Component for grouping vaadin-radio-buttons.
 * <p>
 * ```html
 * <vaadin-radio-group>
 * <vaadin-radio-button name="foo">Foo</vaadin-radio-button>
 * <vaadin-radio-button name="bar">Bar</vaadin-radio-button>
 * <vaadin-radio-button name="baz">Baz</vaadin-radio-button>
 * </vaadin-radio-group>
 * ```
 * <p>
 * ### Styling
 * <p>
 * The following shadow DOM parts are available for styling:
 * <p>
 * Part name | Description
 * ----------------|----------------
 * `label` | The label element
 * `group-field` | The element that wraps radio-buttons
 * <p>
 * The following state attributes are available for styling:
 * <p>
 * Attribute  | Description | Part name
 * -----------|-------------|------------
 * `disabled`   | Set when the radio group and its children are disabled. | :host
 * `readonly` | Set to a readonly radio group | :host
 * `invalid` | Set when the element is invalid | :host
 * `has-label` | Set when the element has a label | :host
 * `has-value` | Set when the element has a value | :host
 * `focused` | Set when the element contains focus | :host
 * <p>
 * See [ThemableMixin – how to apply styles for shadow parts](https://github.com/vaadin/vaadin-themable-mixin/wiki)
 */
public class VaadinRadioGroup extends AbstractComponent<RadioGroupElement>
		implements HasThemableMixin<RadioGroupElement, VaadinRadioGroup>,
		HasComponents<RadioGroupElement, VaadinRadioGroup, Component<?>> {
	public VaadinRadioGroup() {
		super("vaadin-radio-group");
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
	 * Returns true if `value` is valid.
	 * `<iron-form>` uses this to check the validity or all its elements.
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
	 * Fired when the `invalid` property changes.
	 */
	public ObservableEvent<BooleanPropertyChangeEvent> invalidChangedEvent() {
		return createEvent("invalid-changed");
	}

	/**
	 * Fired when the `value` property changes.
	 */
	public ObservableEvent<StringPropertyChangeEvent> valueChangedEvent() {
		return createEvent("value-changed");
	}
}
