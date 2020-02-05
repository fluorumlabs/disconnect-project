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
     * The value of the field. When wrapping several inputs, it will contain `\t`
     * (Tab character) as a delimiter indicating parts intended to be used as the
     * corresponding inputs values. Use the [`i18n`](#/elements/vaadin-custom-field#property-i18n)
     * property to customize this behavior.
     */
    @Nullable
    public String value() {
        return getNode().getValue();
    }

    /**
     * The value of the field. When wrapping several inputs, it will contain `\t`
     * (Tab character) as a delimiter indicating parts intended to be used as the
     * corresponding inputs values. Use the [`i18n`](#/elements/vaadin-custom-field#property-i18n)
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
     * Returns true if `value` is valid.
     * `<iron-form>` uses this to check the validity or all its elements.
     *
     * @return True if the value is valid.
     */
    public boolean validate() {
        return getNode().validate();
    }

    /**
     * Returns true if the current inputs values satisfy all constraints (if any)
     *
     * @return
     */
    public boolean checkValidity() {
        return getNode().checkValidity();
    }

    /**
     * Fired when the `value` property changes.
     */
    public ObservableEvent<StringPropertyChangeEvent> valueChangedEvent() {
        return createEvent("value-changed");
    }

    /**
     * Fired when the `invalid` property changes.
     */
    public ObservableEvent<BooleanPropertyChangeEvent> invalidChangedEvent() {
        return createEvent("invalid-changed");
    }
}
