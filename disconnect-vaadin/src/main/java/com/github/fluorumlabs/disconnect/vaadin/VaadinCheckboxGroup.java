package com.github.fluorumlabs.disconnect.vaadin;

import com.github.fluorumlabs.disconnect.polymer.types.BooleanPropertyChangeEvent;
import com.github.fluorumlabs.disconnect.polymer.types.StringArrayPropertyChangeEvent;
import com.github.fluorumlabs.disconnect.vaadin.elements.CheckboxGroupElement;
import com.github.fluorumlabs.disconnect.vaadin.mixins.HasThemableMixin;
import com.github.fluorumlabs.disconnect.zero.component.AbstractComponent;
import com.github.fluorumlabs.disconnect.zero.component.Component;
import com.github.fluorumlabs.disconnect.zero.component.HasComponents;
import com.github.fluorumlabs.disconnect.zero.observable.ObservableEvent;

import javax.annotation.Nullable;

/**
 * `<vaadin-checkbox-group>` is a Polymer element for grouping vaadin-checkboxes.
 * <p>
 * ```html
 * <vaadin-checkbox-group label="Preferred language of contact:">
 * <vaadin-checkbox value="en">English</vaadin-checkbox>
 * <vaadin-checkbox value="fr">Français</vaadin-checkbox>
 * <vaadin-checkbox value="de">Deutsch</vaadin-checkbox>
 * </vaadin-checkbox-group>
 * ```
 * <p>
 * ### Styling
 * <p>
 * The following shadow DOM parts are available for styling:
 * <p>
 * Part name | Description
 * ----------------|----------------
 * `label` | The label element
 * `group-field` | The element that wraps checkboxes
 * `error-message` | The error message element
 * <p>
 * The following state attributes are available for styling:
 * <p>
 * Attribute  | Description | Part name
 * -----------|-------------|------------
 * `disabled`   | Set when the checkbox group and its children are disabled. | :host
 * `focused` | Set when the checkbox group contains focus | :host
 * `has-label` | Set when the element has a label | :host
 * `has-value` | Set when the element has a value | :host
 * `required` | Set when the element is required | :host
 * `invalid` | Set when the element is invalid | :host
 * <p>
 * See [ThemableMixin – how to apply styles for shadow parts](https://github.com/vaadin/vaadin-themable-mixin/wiki)
 */
public class VaadinCheckboxGroup extends AbstractComponent<CheckboxGroupElement>
		implements HasThemableMixin<CheckboxGroupElement, VaadinCheckboxGroup>,
		HasComponents<CheckboxGroupElement, VaadinCheckboxGroup, Component<?>> {
	public VaadinCheckboxGroup() {
		super("vaadin-checkbox-group");
	}

	/**
	 * The current disabled state of the checkbox group. True if group and all internal checkboxes are disabled.
	 */
	public boolean disabled() {
		return getNode().isDisabled();
	}

	/**
	 * The current disabled state of the checkbox group. True if group and all internal checkboxes are disabled.
	 */
	public VaadinCheckboxGroup disabled(boolean disabled) {
		getNode().setDisabled(disabled);
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
	public VaadinCheckboxGroup label(String label) {
		getNode().setLabel(label);
		return this;
	}

	/**
	 * Value of the checkbox group.
	 * Note: toggling the checkboxes modifies the value by creating new
	 * array each time, to override Polymer dirty-checking for arrays.
	 * You can still use Polymer array mutation methods to update the value.
	 */
	@Nullable
	public String[] value() {
		return getNode().getValue();
	}

	/**
	 * Value of the checkbox group.
	 * Note: toggling the checkboxes modifies the value by creating new
	 * array each time, to override Polymer dirty-checking for arrays.
	 * You can still use Polymer array mutation methods to update the value.
	 */
	public VaadinCheckboxGroup value(String... value) {
		getNode().setValue(value);
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
	public VaadinCheckboxGroup errorMessage(String errorMessage) {
		getNode().setErrorMessage(errorMessage);
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
	public VaadinCheckboxGroup required(boolean required) {
		getNode().setRequired(required);
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
	public VaadinCheckboxGroup invalid(boolean invalid) {
		getNode().setInvalid(invalid);
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
	 * Fired when the `value` property changes.
	 */
	public ObservableEvent<StringArrayPropertyChangeEvent> valueChangedEvent() {
		return createEvent("value-changed");
	}

	/**
	 * Fired when the `invalid` property changes.
	 */
	public ObservableEvent<BooleanPropertyChangeEvent> invalidChangedEvent() {
		return createEvent("invalid-changed");
	}
}
