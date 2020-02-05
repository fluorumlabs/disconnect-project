package com.github.fluorumlabs.disconnect.vaadin;

import com.github.fluorumlabs.disconnect.polymer.types.BooleanPropertyChangeEvent;
import com.github.fluorumlabs.disconnect.polymer.types.StringPropertyChangeEvent;
import com.github.fluorumlabs.disconnect.vaadin.elements.TimePickerElement;
import com.github.fluorumlabs.disconnect.vaadin.i18n.TimePickerI18n;
import com.github.fluorumlabs.disconnect.vaadin.mixins.HasControlStateMixin;
import com.github.fluorumlabs.disconnect.vaadin.mixins.HasElementMixin;
import com.github.fluorumlabs.disconnect.vaadin.mixins.HasThemableMixin;
import com.github.fluorumlabs.disconnect.zero.component.AbstractComponent;
import com.github.fluorumlabs.disconnect.zero.component.Component;
import com.github.fluorumlabs.disconnect.zero.component.HasComponents;
import com.github.fluorumlabs.disconnect.zero.observable.ObservableEvent;
import js.web.dom.Element;

import javax.annotation.Nullable;

/**
 * `<vaadin-time-picker>` is a Web Component providing a time-selection field.
 * <p>
 * ```html
 * <vaadin-time-picker></vaadin-time-picker>
 * ```
 * ```js
 * timePicker.value = '14:30';
 * ```
 * <p>
 * When the selected `value` is changed, a `value-changed` event is triggered.
 * <p>
 * ### Styling
 * <p>
 * The following custom properties are available for styling:
 * <p>
 * Part name | Description
 * ----------------|----------------
 * `toggle-button` | The toggle button
 * <p>
 * See [ThemableMixin – how to apply styles for shadow parts](https://github.com/vaadin/vaadin-themable-mixin/wiki)
 * <p>
 * The following state attributes are available for styling:
 * <p>
 * Attribute    | Description | Part name
 * -------------|-------------|------------
 * `disabled` | Set to a disabled time picker | :host
 * `readonly` | Set to a read only time picker | :host
 * `invalid` | Set when the element is invalid | :host
 * `focused` | Set when the element is focused | :host
 * `focus-ring` | Set when the element is keyboard focused | :host
 * <p>
 * In addition to `<vaadin-time-picker>` itself, the following internal
 * components are themable:
 * <p>
 * - `<vaadin-time-picker-text-field>`, see
 * [`<vaadin-text-field>` documentation](https://vaadin.com/components/vaadin-text-field/html-api/elements/Vaadin
 * .TextFieldElement)
 * for the text field parts.
 * - `<vaadin-combo-box-light>`, see
 * [`<vaadin-combo-box>` documentation](https://vaadin.com/components/vaadin-combo-box/html-api/elements/Vaadin
 * .ComboBoxElement)
 * for the combo box parts.
 * <p>
 * Note: the `theme` attribute value set on `<vaadin-time-picker>` is
 * propagated to the internal themable components listed above.
 */
public class VaadinTimePicker extends AbstractComponent<TimePickerElement>
        implements HasElementMixin<TimePickerElement, VaadinTimePicker>,
        HasControlStateMixin<TimePickerElement, VaadinTimePicker>,
        HasThemableMixin<TimePickerElement, VaadinTimePicker>,
        HasComponents<TimePickerElement, VaadinTimePicker, Component<?>> {
    public VaadinTimePicker() {
        super("vaadin-time-picker");
    }

    /**
     * Focusable element used by vaadin-control-state-mixin
     */
    public Element focusElement() {
        return getNode().getFocusElement();
    }

    /**
     * The name of this element.
     */
    @Nullable
    public String name() {
        return getNode().getName();
    }

    /**
     * The name of this element.
     */
    public VaadinTimePicker name(String name) {
        getNode().setName(name);
        return this;
    }

    /**
     * The time value for this element.
     * <p>
     * Supported time formats are in ISO 8601:
     * - `hh:mm` (default)
     * - `hh:mm:ss`
     * - `hh:mm:ss.fff`
     */
    @Nullable
    public String value() {
        return getNode().getValue();
    }

    /**
     * The time value for this element.
     * <p>
     * Supported time formats are in ISO 8601:
     * - `hh:mm` (default)
     * - `hh:mm:ss`
     * - `hh:mm:ss.fff`
     */
    public VaadinTimePicker value(String value) {
        getNode().setValue(value);
        return this;
    }

    /**
     * The label for this element.
     */
    @Nullable
    public String label() {
        return getNode().getLabel();
    }

    /**
     * The label for this element.
     */
    public VaadinTimePicker label(String label) {
        getNode().setLabel(label);
        return this;
    }

    /**
     * Set to true to mark the input as required.
     */
    public boolean required() {
        return getNode().isRequired();
    }

    /**
     * Set to true to mark the input as required.
     */
    public VaadinTimePicker required(boolean required) {
        getNode().setRequired(required);
        return this;
    }

    /**
     * Set to true to disable this input.
     */
    public boolean disabled() {
        return getNode().isDisabled();
    }

    /**
     * Set to true to disable this input.
     */
    public VaadinTimePicker disabled(boolean disabled) {
        getNode().setDisabled(disabled);
        return this;
    }

    /**
     * Set to true to prevent the user from entering invalid input.
     */
    public boolean preventInvalidInput() {
        return getNode().isPreventInvalidInput();
    }

    /**
     * Set to true to prevent the user from entering invalid input.
     */
    public VaadinTimePicker preventInvalidInput(boolean preventInvalidInput) {
        getNode().setPreventInvalidInput(preventInvalidInput);
        return this;
    }

    /**
     * A pattern to validate the `input` with.
     */
    @Nullable
    public String pattern() {
        return getNode().getPattern();
    }

    /**
     * A pattern to validate the `input` with.
     */
    public VaadinTimePicker pattern(String pattern) {
        getNode().setPattern(pattern);
        return this;
    }

    /**
     * The error message to display when the input is invalid.
     */
    @Nullable
    public String errorMessage() {
        return getNode().getErrorMessage();
    }

    /**
     * The error message to display when the input is invalid.
     */
    public VaadinTimePicker errorMessage(String errorMessage) {
        getNode().setErrorMessage(errorMessage);
        return this;
    }

    /**
     * A placeholder string in addition to the label.
     */
    @Nullable
    public String placeholder() {
        return getNode().getPlaceholder();
    }

    /**
     * A placeholder string in addition to the label.
     */
    public VaadinTimePicker placeholder(String placeholder) {
        getNode().setPlaceholder(placeholder);
        return this;
    }

    /**
     * Set to true to prevent user picking a date or typing in the input.
     */
    public boolean readonly() {
        return getNode().isReadonly();
    }

    /**
     * Set to true to prevent user picking a date or typing in the input.
     */
    public VaadinTimePicker readonly(boolean readonly) {
        getNode().setReadonly(readonly);
        return this;
    }

    /**
     * Set to true if the value is invalid.
     */
    public boolean invalid() {
        return getNode().isInvalid();
    }

    /**
     * Set to true if the value is invalid.
     */
    public VaadinTimePicker invalid(boolean invalid) {
        getNode().setInvalid(invalid);
        return this;
    }

    /**
     * Minimum time allowed.
     * <p>
     * Supported time formats are in ISO 8601:
     * - `hh:mm`
     * - `hh:mm:ss`
     * - `hh:mm:ss.fff`
     */
    @Nullable
    public String min() {
        return getNode().getMin();
    }

    /**
     * Minimum time allowed.
     * <p>
     * Supported time formats are in ISO 8601:
     * - `hh:mm`
     * - `hh:mm:ss`
     * - `hh:mm:ss.fff`
     */
    public VaadinTimePicker min(String min) {
        getNode().setMin(min);
        return this;
    }

    /**
     * Maximum time allowed.
     * <p>
     * Supported time formats are in ISO 8601:
     * - `hh:mm`
     * - `hh:mm:ss`
     * - `hh:mm:ss.fff`
     */
    @Nullable
    public String max() {
        return getNode().getMax();
    }

    /**
     * Maximum time allowed.
     * <p>
     * Supported time formats are in ISO 8601:
     * - `hh:mm`
     * - `hh:mm:ss`
     * - `hh:mm:ss.fff`
     */
    public VaadinTimePicker max(String max) {
        getNode().setMax(max);
        return this;
    }

    /**
     * Specifies the number of valid intervals in a day used for
     * configuring the items displayed in the selection box.
     * <p>
     * It also configures the precision of the value string. By default
     * the component formats values as `hh:mm` but setting a step value
     * lower than one minute or one second, format resolution changes to
     * `hh:mm:ss` and `hh:mm:ss.fff` respectively.
     * <p>
     * Unit must be set in seconds, and for correctly configuring intervals
     * in the dropdown, it need to evenly divide a day.
     * <p>
     * Note: it is possible to define step that is dividing an hour in inexact
     * fragments (i.e. 5760 seconds which equals 1 hour 36 minutes), but it is
     * not recommended to use it for better UX experience.
     */
    public double step() {
        return getNode().getStep();
    }

    /**
     * Specifies the number of valid intervals in a day used for
     * configuring the items displayed in the selection box.
     * <p>
     * It also configures the precision of the value string. By default
     * the component formats values as `hh:mm` but setting a step value
     * lower than one minute or one second, format resolution changes to
     * `hh:mm:ss` and `hh:mm:ss.fff` respectively.
     * <p>
     * Unit must be set in seconds, and for correctly configuring intervals
     * in the dropdown, it need to evenly divide a day.
     * <p>
     * Note: it is possible to define step that is dividing an hour in inexact
     * fragments (i.e. 5760 seconds which equals 1 hour 36 minutes), but it is
     * not recommended to use it for better UX experience.
     */
    public VaadinTimePicker step(double step) {
        getNode().setStep(step);
        return this;
    }

    /**
     * Set to true to display the clear icon which clears the input.
     */
    public boolean clearButtonVisible() {
        return getNode().isClearButtonVisible();
    }

    /**
     * Set to true to display the clear icon which clears the input.
     */
    public VaadinTimePicker clearButtonVisible(boolean clearButtonVisible) {
        getNode().setClearButtonVisible(clearButtonVisible);
        return this;
    }

    /**
     * The object used to localize this component.
     * To change the default localization, replace the entire
     * _i18n_ object or just the property you want to modify.
     * <p>
     * The object has the following JSON structure:
     * <p>
     * {
     * // A function to format given `Object` as
     * // time string. Object is in the format `{ hours: ..., minutes: ..., seconds: ..., milliseconds: ... }`
     * formatTime: (time) => {
     * // returns a string representation of the given
     * // object in `hh` / 'hh:mm' / 'hh:mm:ss' / 'hh:mm:ss.fff' - formats
     * },
     * <p>
     * // A function to parse the given text to an `Object` in the format
     * // `{ hours: ..., minutes: ..., seconds: ..., milliseconds: ... }`.
     * // Must properly parse (at least) text
     * // formatted by `formatTime`.
     * parseTime: text => {
     * // Parses a string in object/string that can be formatted by`formatTime`.
     * }
     * <p>
     * // Translation of the time selector icon button title.
     * selector: 'Time selector',
     * <p>
     * // Translation of the time selector clear button title.
     * clear: 'Clear'
     * }
     */
    @Nullable
    public TimePickerI18n i18n() {
        return getNode().getI18n();
    }

    /**
     * The object used to localize this component.
     * To change the default localization, replace the entire
     * _i18n_ object or just the property you want to modify.
     * <p>
     * The object has the following JSON structure:
     * <p>
     * {
     * // A function to format given `Object` as
     * // time string. Object is in the format `{ hours: ..., minutes: ..., seconds: ..., milliseconds: ... }`
     * formatTime: (time) => {
     * // returns a string representation of the given
     * // object in `hh` / 'hh:mm' / 'hh:mm:ss' / 'hh:mm:ss.fff' - formats
     * },
     * <p>
     * // A function to parse the given text to an `Object` in the format
     * // `{ hours: ..., minutes: ..., seconds: ..., milliseconds: ... }`.
     * // Must properly parse (at least) text
     * // formatted by `formatTime`.
     * parseTime: text => {
     * // Parses a string in object/string that can be formatted by`formatTime`.
     * }
     * <p>
     * // Translation of the time selector icon button title.
     * selector: 'Time selector',
     * <p>
     * // Translation of the time selector clear button title.
     * clear: 'Clear'
     * }
     */
    public VaadinTimePicker i18n(TimePickerI18n i18n) {
        getNode().setI18n(i18n);
        return this;
    }

    /**
     * Returns true if `value` is valid, and sets the `invalid` flag appropriately.
     *
     * @return True if the value is valid and sets the `invalid` flag appropriately
     */
    public boolean validate() {
        return getNode().validate();
    }

    /**
     * Returns true if the current input value satisfies all constraints (if any)
     * <p>
     * You can override the `checkValidity` method for custom validations.
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
