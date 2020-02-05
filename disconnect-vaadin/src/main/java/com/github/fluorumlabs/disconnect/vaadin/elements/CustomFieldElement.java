package com.github.fluorumlabs.disconnect.vaadin.elements;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import com.github.fluorumlabs.disconnect.vaadin.Vaadin;
import com.github.fluorumlabs.disconnect.vaadin.elements.mixins.CustomFieldMixin;
import com.github.fluorumlabs.disconnect.vaadin.elements.mixins.ElementMixin;
import com.github.fluorumlabs.disconnect.vaadin.elements.mixins.ThemableMixin;
import js.web.dom.HTMLElement;
import org.teavm.jso.JSProperty;

import javax.annotation.Nullable;

/**
 * `<vaadin-custom-field>` is a Web Component providing field wrapper functionality.
 * <p>
 * ```
 * <vaadin-custom-field label="Appointment time">
 * <vaadin-date-picker></vaadin-date-picker>
 * <vaadin-time-picker></vaadin-time-picker>
 * </vaadin-custom-field>
 * ```
 * <p>
 * ### Styling
 * <p>
 * You may set the attribute `disabled` or `readonly` on this component to make the label styles behave the same
 * way as they would on a `<vaadin-text-field>` which is disabled or readonly.
 * <p>
 * The following shadow DOM parts are available for styling:
 * <p>
 * Part name | Description
 * ----------------|----------------
 * `label` | The label element
 * `error-message` | The error message element
 * <p>
 * The following state attributes are available for styling:
 * <p>
 * Attribute    | Description | Part name
 * -------------|-------------|------------
 * `has-label`  | Set when the field has a label | :host
 * `invalid`    | Set when the field is invalid | :host
 * `focused`    | Set when the field contains focus | :host
 * <p>
 * See [ThemableMixin – how to apply styles for shadow parts](https://github.com/vaadin/vaadin-themable-mixin/wiki)
 */
@NpmPackage(
		name = "@vaadin/vaadin",
		version = Vaadin.VERSION
)
@Import(
		symbols = "CustomFieldElement",
		module = "@vaadin/vaadin-custom-field/src/vaadin-custom-field.js"
)
public interface CustomFieldElement extends HTMLElement, ElementMixin, ThemableMixin, CustomFieldMixin {
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
	 * The name of the control, which is submitted with the form data.
	 */
	@Nullable
	@JSProperty
	String getName();

	/**
	 * The name of the control, which is submitted with the form data.
	 */
	@JSProperty
	void setName(String name);

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
	 * The value of the field. When wrapping several inputs, it will contain `\t`
	 * (Tab character) as a delimiter indicating parts intended to be used as the
	 * corresponding inputs values. Use the [`i18n`](#/elements/vaadin-custom-field#property-i18n)
	 * property to customize this behavior.
	 */
	@Nullable
	@JSProperty
	String getValue();

	/**
	 * The value of the field. When wrapping several inputs, it will contain `\t`
	 * (Tab character) as a delimiter indicating parts intended to be used as the
	 * corresponding inputs values. Use the [`i18n`](#/elements/vaadin-custom-field#property-i18n)
	 * property to customize this behavior.
	 */
	@JSProperty
	void setValue(String value);

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
	 * Returns true if `value` is valid.
	 * `<iron-form>` uses this to check the validity or all its elements.
	 *
	 * @return True if the value is valid.
	 */
	boolean validate();

	/**
	 * Returns true if the current inputs values satisfy all constraints (if any)
	 */
	boolean checkValidity();
}
