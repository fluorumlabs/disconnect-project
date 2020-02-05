package com.github.fluorumlabs.disconnect.vaadin.elements;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import com.github.fluorumlabs.disconnect.vaadin.Vaadin;
import com.github.fluorumlabs.disconnect.vaadin.elements.mixins.ThemableMixin;
import js.web.dom.HTMLElement;
import org.teavm.jso.JSProperty;

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
@NpmPackage(
        name = "@vaadin/vaadin",
        version = Vaadin.VERSION
)
@Import(
        symbols = "RadioGroupElement",
        module = "@vaadin/vaadin-radio-button/src/vaadin-radio-group.js"
)
public interface RadioGroupElement extends HTMLElement, ThemableMixin {
    /**
     * The current disabled state of the radio group. True if group and all internal radio buttons are disabled.
     */
    @JSProperty
    boolean isDisabled();

    /**
     * The current disabled state of the radio group. True if group and all internal radio buttons are disabled.
     */
    @JSProperty
    void setDisabled(boolean disabled);

    /**
     * This attribute indicates that the user cannot modify the value of the control.
     */
    @JSProperty
    boolean isReadonly();

    /**
     * This attribute indicates that the user cannot modify the value of the control.
     */
    @JSProperty
    void setReadonly(boolean readonly);

    /**
     * This property is set to true when the value is invalid.
     */
    @JSProperty
    boolean isInvalid();

    /**
     * This property is set to true when the value is invalid.
     */
    @JSProperty
    void setInvalid(boolean invalid);

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
     * Value of the radio group.
     */
    @Nullable
    @JSProperty
    String getValue();

    /**
     * Value of the radio group.
     */
    @JSProperty
    void setValue(String value);

    /**
     * Returns true if `value` is valid.
     * `<iron-form>` uses this to check the validity or all its elements.
     *
     * @return True if the value is valid.
     */
    boolean validate();

    /**
     * Returns true if the current input value satisfies all constraints (if any)
     *
     * @return
     */
    boolean checkValidity();
}
