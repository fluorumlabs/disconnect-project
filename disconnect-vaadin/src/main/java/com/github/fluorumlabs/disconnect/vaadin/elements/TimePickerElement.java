package com.github.fluorumlabs.disconnect.vaadin.elements;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import com.github.fluorumlabs.disconnect.vaadin.Vaadin;
import com.github.fluorumlabs.disconnect.vaadin.elements.mixins.ControlStateMixin;
import com.github.fluorumlabs.disconnect.vaadin.elements.mixins.ElementMixin;
import com.github.fluorumlabs.disconnect.vaadin.elements.mixins.ThemableMixin;
import com.github.fluorumlabs.disconnect.vaadin.i18n.TimePickerI18n;
import js.web.dom.HTMLElement;
import org.teavm.jso.JSProperty;

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
@NpmPackage(
        name = "@vaadin/vaadin",
        version = Vaadin.VERSION
)
@Import(
        symbols = "TimePickerElement",
        module = "@vaadin/vaadin-time-picker/src/vaadin-time-picker.js"
)
public interface TimePickerElement extends HTMLElement, ElementMixin, ControlStateMixin, ThemableMixin {
    /**
     * The name of this element.
     */
    @Nullable
    @JSProperty
    String getName();

    /**
     * The name of this element.
     */
    @JSProperty
    void setName(String name);

    /**
     * The time value for this element.
     * <p>
     * Supported time formats are in ISO 8601:
     * - `hh:mm` (default)
     * - `hh:mm:ss`
     * - `hh:mm:ss.fff`
     */
    @Nullable
    @JSProperty
    String getValue();

    /**
     * The time value for this element.
     * <p>
     * Supported time formats are in ISO 8601:
     * - `hh:mm` (default)
     * - `hh:mm:ss`
     * - `hh:mm:ss.fff`
     */
    @JSProperty
    void setValue(String value);

    /**
     * The label for this element.
     */
    @Nullable
    @JSProperty
    String getLabel();

    /**
     * The label for this element.
     */
    @JSProperty
    void setLabel(String label);

    /**
     * Set to true to mark the input as required.
     */
    @JSProperty
    boolean isRequired();

    /**
     * Set to true to mark the input as required.
     */
    @JSProperty
    void setRequired(boolean required);

    /**
     * Set to true to prevent the user from entering invalid input.
     */
    @JSProperty
    boolean isPreventInvalidInput();

    /**
     * Set to true to prevent the user from entering invalid input.
     */
    @JSProperty
    void setPreventInvalidInput(boolean preventInvalidInput);

    /**
     * A pattern to validate the `input` with.
     */
    @Nullable
    @JSProperty
    String getPattern();

    /**
     * A pattern to validate the `input` with.
     */
    @JSProperty
    void setPattern(String pattern);

    /**
     * The error message to display when the input is invalid.
     */
    @Nullable
    @JSProperty
    String getErrorMessage();

    /**
     * The error message to display when the input is invalid.
     */
    @JSProperty
    void setErrorMessage(String errorMessage);

    /**
     * A placeholder string in addition to the label.
     */
    @Nullable
    @JSProperty
    String getPlaceholder();

    /**
     * A placeholder string in addition to the label.
     */
    @JSProperty
    void setPlaceholder(String placeholder);

    /**
     * Set to true to prevent user picking a date or typing in the input.
     */
    @JSProperty
    boolean isReadonly();

    /**
     * Set to true to prevent user picking a date or typing in the input.
     */
    @JSProperty
    void setReadonly(boolean readonly);

    /**
     * Set to true if the value is invalid.
     */
    @JSProperty
    boolean isInvalid();

    /**
     * Set to true if the value is invalid.
     */
    @JSProperty
    void setInvalid(boolean invalid);

    /**
     * Minimum time allowed.
     * <p>
     * Supported time formats are in ISO 8601:
     * - `hh:mm`
     * - `hh:mm:ss`
     * - `hh:mm:ss.fff`
     */
    @Nullable
    @JSProperty
    String getMin();

    /**
     * Minimum time allowed.
     * <p>
     * Supported time formats are in ISO 8601:
     * - `hh:mm`
     * - `hh:mm:ss`
     * - `hh:mm:ss.fff`
     */
    @JSProperty
    void setMin(String min);

    /**
     * Maximum time allowed.
     * <p>
     * Supported time formats are in ISO 8601:
     * - `hh:mm`
     * - `hh:mm:ss`
     * - `hh:mm:ss.fff`
     */
    @Nullable
    @JSProperty
    String getMax();

    /**
     * Maximum time allowed.
     * <p>
     * Supported time formats are in ISO 8601:
     * - `hh:mm`
     * - `hh:mm:ss`
     * - `hh:mm:ss.fff`
     */
    @JSProperty
    void setMax(String max);

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
    @JSProperty
    double getStep();

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
    @JSProperty
    void setStep(double step);

    /**
     * Set to true to display the clear icon which clears the input.
     */
    @JSProperty
    boolean isClearButtonVisible();

    /**
     * Set to true to display the clear icon which clears the input.
     */
    @JSProperty
    void setClearButtonVisible(boolean clearButtonVisible);

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
    @JSProperty
    TimePickerI18n getI18n();

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
    @JSProperty
    void setI18n(TimePickerI18n i18n);

    /**
     * Returns true if `value` is valid, and sets the `invalid` flag appropriately.
     *
     * @return True if the value is valid and sets the `invalid` flag appropriately
     */
    boolean validate();

    /**
     * Returns true if the current input value satisfies all constraints (if any)
     * <p>
     * You can override the `checkValidity` method for custom validations.
     */
    boolean checkValidity();
}
