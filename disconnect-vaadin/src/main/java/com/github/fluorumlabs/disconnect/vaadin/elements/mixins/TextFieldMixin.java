package com.github.fluorumlabs.disconnect.vaadin.elements.mixins;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import com.github.fluorumlabs.disconnect.vaadin.Vaadin;
import com.github.fluorumlabs.disconnect.vaadin.constants.Autocorrect;
import com.github.fluorumlabs.disconnect.vaadin.i18n.TextFieldI18n;
import js.web.dom.Autocapitalize;
import js.web.dom.Autocomplete;
import org.teavm.jso.JSProperty;

import javax.annotation.Nullable;

@NpmPackage(
        name = "@vaadin/vaadin",
        version = Vaadin.VERSION
)
@Import(
        symbols = "TextFieldMixin",
        module = "@vaadin/vaadin-text-field/src/vaadin-text-field-mixin.js"
)
public interface TextFieldMixin extends ControlStateMixin {
    /**
     * Whether the value of the control can be automatically completed by the browser.
     * List of available options at:
     * https://developer.mozilla.org/en/docs/Web/HTML/Element/input#attr-autocomplete
     */
    @Nullable
    @JSProperty
    Autocomplete getAutocomplete();

    /**
     * Whether the value of the control can be automatically completed by the browser.
     * List of available options at:
     * https://developer.mozilla.org/en/docs/Web/HTML/Element/input#attr-autocomplete
     */
    @JSProperty
    void setAutocomplete(Autocomplete autocomplete);

    /**
     * This is a property supported by Safari that is used to control whether
     * autocorrection should be enabled when the user is entering/editing the text.
     * Possible values are:
     * on: Enable autocorrection.
     * off: Disable autocorrection.
     */
    @Nullable
    @JSProperty
    Autocorrect getAutocorrect();

    /**
     * This is a property supported by Safari that is used to control whether
     * autocorrection should be enabled when the user is entering/editing the text.
     * Possible values are:
     * on: Enable autocorrection.
     * off: Disable autocorrection.
     */
    @JSProperty
    void setAutocorrect(Autocorrect autocorrect);

    /**
     * This is a property supported by Safari and Chrome that is used to control whether
     * autocapitalization should be enabled when the user is entering/editing the text.
     * Possible values are:
     * characters: Characters capitalization.
     * words: Words capitalization.
     * sentences: Sentences capitalization.
     * none: No capitalization.
     */
    @Nullable
    @JSProperty
    Autocapitalize getAutocapitalize();

    /**
     * This is a property supported by Safari and Chrome that is used to control whether
     * autocapitalization should be enabled when the user is entering/editing the text.
     * Possible values are:
     * characters: Characters capitalization.
     * words: Words capitalization.
     * sentences: Sentences capitalization.
     * none: No capitalization.
     */
    @JSProperty
    void setAutocapitalize(Autocapitalize autocapitalize);

    /**
     * Specify that the value should be automatically selected when the field gains focus.
     */
    @JSProperty
    boolean isAutoselect();

    /**
     * Specify that the value should be automatically selected when the field gains focus.
     */
    @JSProperty
    void setAutoselect(boolean autoselect);

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
     * Object with translated strings used for localization. Has
     * the following structure and default values:
     * <p>
     * ```
     * {
     * // Translation of the clear icon button accessible label
     * clear: 'Clear'
     * }
     * ```
     */
    @Nullable
    @JSProperty
    TextFieldI18n getI18n();

    /**
     * Object with translated strings used for localization. Has
     * the following structure and default values:
     * <p>
     * ```
     * {
     * // Translation of the clear icon button accessible label
     * clear: 'Clear'
     * }
     * ```
     */
    @JSProperty
    void setI18n(TextFieldI18n i18n);

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
     * Maximum number of characters (in Unicode code points) that the user can enter.
     */
    @JSProperty
    int getMaxlength();

    /**
     * Maximum number of characters (in Unicode code points) that the user can enter.
     */
    @JSProperty
    void setMaxlength(int maxlength);

    /**
     * Minimum number of characters (in Unicode code points) that the user can enter.
     */
    @JSProperty
    int getMinlength();

    /**
     * Minimum number of characters (in Unicode code points) that the user can enter.
     */
    @JSProperty
    void setMinlength(int minlength);

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
     * A hint to the user of what can be entered in the control.
     */
    @Nullable
    @JSProperty
    String getPlaceholder();

    /**
     * A hint to the user of what can be entered in the control.
     */
    @JSProperty
    void setPlaceholder(String placeholder);

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
     * The initial value of the control.
     * It can be used for two-way data binding.
     */
    @Nullable
    @JSProperty
    String getValue();

    /**
     * The initial value of the control.
     * It can be used for two-way data binding.
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
     * Specifies that the text field has value.
     */
    @JSProperty
    boolean isHasValue();

    /**
     * Specifies that the text field has value.
     */
    @JSProperty
    void setHasValue(boolean hasValue);

    /**
     * When set to true, user is prevented from typing a value that
     * conflicts with the given `pattern`.
     */
    @JSProperty
    boolean isPreventInvalidInput();

    /**
     * When set to true, user is prevented from typing a value that
     * conflicts with the given `pattern`.
     */
    @JSProperty
    void setPreventInvalidInput(boolean preventInvalidInput);

    /**
     * Returns true if the current input value satisfies all constraints (if any)
     */
    boolean checkValidity();

    /**
     * Returns true if `value` is valid.
     * `<iron-form>` uses this to check the validity for all its elements.
     *
     * @return True if the value is valid.
     */
    boolean validate();

    void clear();
}
