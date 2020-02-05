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
@NpmPackage(
		name = "@vaadin/vaadin",
		version = Vaadin.VERSION
)
@Import(
		symbols = "CheckboxGroupElement",
		module = "@vaadin/vaadin-checkbox/src/vaadin-checkbox-group.js"
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
	 * Returns true if `value` is valid.
	 * `<iron-form>` uses this to check the validity or all its elements.
	 *
	 * @return True if the value is valid.
	 */
	boolean validate();
}
