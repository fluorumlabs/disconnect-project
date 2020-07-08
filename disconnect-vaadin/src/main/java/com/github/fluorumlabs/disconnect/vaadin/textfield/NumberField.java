package com.github.fluorumlabs.disconnect.vaadin.textfield;

import com.github.fluorumlabs.disconnect.core.annotations.CustomElement;
import com.github.fluorumlabs.disconnect.core.components.Component;
import com.github.fluorumlabs.disconnect.core.components.HtmlComponent;
import com.github.fluorumlabs.disconnect.core.observables.ObservableEvent;
import com.github.fluorumlabs.disconnect.core.observables.ObservableValue;
import com.github.fluorumlabs.disconnect.core.utils.LowerCase;
import com.github.fluorumlabs.disconnect.vaadin.theme.Themable;
import js.lang.external.vaadin.textfield.NumberFieldElement;
import js.lang.external.vaadin.textfield.TextFieldI18n;
import js.web.dom.Event;

import javax.annotation.Nullable;

/**
 * <code>&lt;vaadin-number-field&gt;</code> is a Web Component for number field control in forms.
 *
 * <pre><code class="language-html">&lt;vaadin-number-field label="Number"&gt;
 * &lt;/vaadin-number-field&gt;
 * </code></pre>
 * <strong>Mixins:</strong> TextFieldMixin, ControlStateMixin, ThemableMixin, ElementMixin, ElementMixin
 *
 * <h2>Example</h2>
 * <pre><code class="language-javascript">demo/index.html
 * </code></pre>
 */
@CustomElement(tagName = "vaadin-number-field", external = true)
public class NumberField extends HtmlComponent<NumberFieldElement> implements Themable<NumberFieldElement> {

    public NumberField() {
    }

    public NumberField(String textContent) {
        super(textContent);
    }

    public NumberField(Component<?>... components) {
        super(components);
    }

    // !wca! checkValidity: (): boolean
    /**
     * Returns true if the current input value satisfies all constraints (if any)
     */
    public boolean checkValidity() {
        return getElement().checkValidity();
    }

    // !wca! clear: (): void

    // !wca! click: (): void

    // !wca! validate: (): boolean
    /**
     * Returns true if <code>value</code> is valid.
     * <code>&lt;iron-form&gt;</code> uses this to check the validity for all its elements.
     */
    public boolean validate() {
        return getElement().validate();
    }

    // !wca! get autocapitalize: "on" | "off" | "none" | "characters" | "words" | "sentences" | undefined
    /**
     * This is a property supported by Safari and Chrome that is used to control whether
     * autocapitalization should be enabled when the user is entering/editing the text.
     * Possible values are:
     * characters: Characters capitalization.
     * words: Words capitalization.
     * sentences: Sentences capitalization.
     * none: No capitalization.
     */
    public @Nullable Autocapitalize getAutocapitalize() {
        return LowerCase.parse(Autocapitalize.class, getElement().getAutocapitalize());
    }

    // !wca! set autocapitalize: "on" | "off" | "none" | "characters" | "words" | "sentences" | undefined
    /**
     * This is a property supported by Safari and Chrome that is used to control whether
     * autocapitalization should be enabled when the user is entering/editing the text.
     * Possible values are:
     * characters: Characters capitalization.
     * words: Words capitalization.
     * sentences: Sentences capitalization.
     * none: No capitalization.
     */
    public void setAutocapitalize(@Nullable Autocapitalize value) {
        getElement().setAutocapitalize(LowerCase.of(value));
    }

    // !wca! observe autocapitalize: "on" | "off" | "none" | "characters" | "words" | "sentences" | undefined

    // !wca! get autocomplete: string | null | undefined
    /**
     * Whether the value of the control can be automatically completed by the browser.
     * List of available options at:
     * <a href="https://developer.mozilla.org/en/docs/Web/HTML/Element/input#attr-autocomplete">https://developer.mozilla.org/en/docs/Web/HTML/Element/input#attr-autocomplete</a>
     */
    public @Nullable Autocomplete getAutocomplete() {
        return LowerCase.parse(Autocomplete.class, getElement().getAutocomplete());
    }

    // !wca! set autocomplete: string | null | undefined
    /**
     * Whether the value of the control can be automatically completed by the browser.
     * List of available options at:
     * <a href="https://developer.mozilla.org/en/docs/Web/HTML/Element/input#attr-autocomplete">https://developer.mozilla.org/en/docs/Web/HTML/Element/input#attr-autocomplete</a>
     */
    public void setAutocomplete(@Nullable Autocomplete value) {
        getElement().setAutocomplete(LowerCase.of(value));
    }

    // !wca! observe autocomplete: string | null | undefined

    // !wca! get autocorrect: "on" | "off" | undefined
    /**
     * This is a property supported by Safari that is used to control whether
     * autocorrection should be enabled when the user is entering/editing the text.
     * Possible values are:
     * on: Enable autocorrection.
     * off: Disable autocorrection.
     */
    public @Nullable Autocorrect getAutocorrect() {
        return LowerCase.parse(Autocorrect.class, getElement().getAutocorrect());
    }

    // !wca! set autocorrect: "on" | "off" | undefined
    /**
     * This is a property supported by Safari that is used to control whether
     * autocorrection should be enabled when the user is entering/editing the text.
     * Possible values are:
     * on: Enable autocorrection.
     * off: Disable autocorrection.
     */
    public void setAutocorrect(@Nullable Autocorrect value) {
        getElement().setAutocorrect(LowerCase.of(value));
    }

    // !wca! observe autocorrect: "on" | "off" | undefined

    // !wca! get autofocus: boolean | null | undefined
    /**
     * Specify that this control should have input focus when the page loads.
     */
    public boolean isAutofocus() {
        return getElement().isAutofocus();
    }

    // !wca! set autofocus: boolean | null | undefined
    /**
     * Specify that this control should have input focus when the page loads.
     */
    public void setAutofocus(boolean value) {
        getElement().setAutofocus(value);
    }

    // !wca! observe autofocus: boolean | null | undefined

    // !wca! get autoselect: boolean
    /**
     * Specify that the value should be automatically selected when the field gains focus.
     */
    public boolean isAutoselect() {
        return getElement().isAutoselect();
    }

    // !wca! set autoselect: boolean
    /**
     * Specify that the value should be automatically selected when the field gains focus.
     */
    public void setAutoselect(boolean value) {
        getElement().setAutoselect(value);
    }

    // !wca! observe autoselect: boolean

    // !wca! get clearButtonVisible: boolean
    /**
     * Set to true to display the clear icon which clears the input.
     */
    public boolean isClearButtonVisible() {
        return getElement().isClearButtonVisible();
    }

    // !wca! set clearButtonVisible: boolean
    /**
     * Set to true to display the clear icon which clears the input.
     */
    public void setClearButtonVisible(boolean value) {
        getElement().setClearButtonVisible(value);
    }

    // !wca! observe clearButtonVisible: boolean

    // !wca! get disabled: boolean | null | undefined
    /**
     * If true, the user cannot interact with this element.
     */
    public boolean isDisabled() {
        return getElement().isDisabled();
    }

    // !wca! set disabled: boolean | null | undefined
    /**
     * If true, the user cannot interact with this element.
     */
    public void setDisabled(boolean value) {
        getElement().setDisabled(value);
    }

    // !wca! observe disabled: boolean | null | undefined

    // !wca! get errorMessage: string
    /**
     * Error to show when the input value is invalid.
     */
    public String getErrorMessage() {
        return getElement().getErrorMessage();
    }

    // !wca! set errorMessage: string
    /**
     * Error to show when the input value is invalid.
     */
    public void setErrorMessage(String value) {
        getElement().setErrorMessage(value);
    }

    // !wca! observe errorMessage: string

    // !wca! get focusElement: HTMLElement | null | undefined

    // !wca! observe focusElement: HTMLElement | null | undefined

    // !wca! get hasControls: boolean
    /**
     * Set to true to display value increase/decrease controls.
     */
    public boolean isHasControls() {
        return getElement().isHasControls();
    }

    // !wca! set hasControls: boolean
    /**
     * Set to true to display value increase/decrease controls.
     */
    public void setHasControls(boolean value) {
        getElement().setHasControls(value);
    }

    // !wca! observe hasControls: boolean

    // !wca! get hasValue: boolean | null | undefined
    /**
     * Specifies that the text field has value.
     */
    public boolean isHasValue() {
        return getElement().isHasValue();
    }

    // !wca! set hasValue: boolean | null | undefined
    /**
     * Specifies that the text field has value.
     */
    public void setHasValue(boolean value) {
        getElement().setHasValue(value);
    }

    // !wca! observe hasValue: boolean | null | undefined
    /**
     * Specifies that the text field has value.
     */
    public ObservableValue<Boolean> hasValue() {
        return createObservableValue(this::isHasValue, this::setHasValue, "has-value-changed");
    }

    // !wca! get i18n: { clear: string; }

    // !wca! set i18n: { clear: string; }
    /**
     * Object with translated strings used for localization. Has
     * the following structure and default values:
     *
     * <code>&lt;br /&gt;{&lt;br /&gt; // Translation of the clear icon button accessible label&lt;br /&gt; clear: 'Clear'&lt;br /&gt;}&lt;br /&gt;</code>
     * @param value
     */
    public void setI18n(TextFieldI18n value) {
        getElement().setI18n(value);
    }

    // !wca! observe i18n: { clear: string; }

    // !wca! get inputElement: HTMLElement | null | undefined

    // !wca! observe inputElement: HTMLElement | null | undefined

    // !wca! get invalid: boolean
    /**
     * This property is set to true when the control value is invalid.
     */
    public boolean isInvalid() {
        return getElement().isInvalid();
    }

    // !wca! set invalid: boolean
    /**
     * This property is set to true when the control value is invalid.
     */
    public void setInvalid(boolean value) {
        getElement().setInvalid(value);
    }

    // !wca! observe invalid: boolean

    // !wca! get label: string
    /**
     * String used for the label element.
     */
    public String getLabel() {
        return getElement().getLabel();
    }

    // !wca! set label: string
    /**
     * String used for the label element.
     */
    public void setLabel(String value) {
        getElement().setLabel(value);
    }

    // !wca! observe label: string

    // !wca! get list: string | null | undefined
    /**
     * Identifies a list of pre-defined options to suggest to the user.
     * The value must be the id of a <datalist> element in the same document.</datalist>
     */
    public @Nullable String getList() {
        return getElement().getList();
    }

    // !wca! set list: string | null | undefined
    /**
     * Identifies a list of pre-defined options to suggest to the user.
     * The value must be the id of a <datalist> element in the same document.</datalist>
     */
    public void setList(@Nullable String value) {
        getElement().setList(value);
    }

    // !wca! observe list: string | null | undefined

    // !wca! get max: number
    /**
     * The maximum value of the field.
     */
    public double getMax() {
        return getElement().getMax();
    }

    // !wca! set max: number
    /**
     * The maximum value of the field.
     */
    public void setMax(double value) {
        getElement().setMax(value);
    }

    // !wca! observe max: number

    // !wca! get maxlength: number | null | undefined
    /**
     * Maximum number of characters (in Unicode code points) that the user can enter.
     */
    public int getMaxlength() {
        return getElement().getMaxlength();
    }

    // !wca! set maxlength: number | null | undefined
    /**
     * Maximum number of characters (in Unicode code points) that the user can enter.
     */
    public void setMaxlength(int value) {
        getElement().setMaxlength(value);
    }

    // !wca! observe maxlength: number | null | undefined

    // !wca! get min: number
    /**
     * The minimum value of the field.
     */
    public double getMin() {
        return getElement().getMin();
    }

    // !wca! set min: number
    /**
     * The minimum value of the field.
     */
    public void setMin(double value) {
        getElement().setMin(value);
    }

    // !wca! observe min: number

    // !wca! get minlength: number | null | undefined
    /**
     * Minimum number of characters (in Unicode code points) that the user can enter.
     */
    public int getMinlength() {
        return getElement().getMinlength();
    }

    // !wca! set minlength: number | null | undefined
    /**
     * Minimum number of characters (in Unicode code points) that the user can enter.
     */
    public void setMinlength(int value) {
        getElement().setMinlength(value);
    }

    // !wca! observe minlength: number | null | undefined

    // !wca! get name: string | null | undefined
    /**
     * The name of the control, which is submitted with the form data.
     */
    public @Nullable String getName() {
        return getElement().getName();
    }

    // !wca! set name: string | null | undefined
    /**
     * The name of the control, which is submitted with the form data.
     */
    public void setName(@Nullable String value) {
        getElement().setName(value);
    }

    // !wca! observe name: string | null | undefined

    // !wca! get pattern: string | null | undefined
    /**
     * A regular expression that the value is checked against.
     * The pattern must match the entire value, not just some subset.
     */
    public @Nullable String getPattern() {
        return getElement().getPattern();
    }

    // !wca! set pattern: string | null | undefined
    /**
     * A regular expression that the value is checked against.
     * The pattern must match the entire value, not just some subset.
     */
    public void setPattern(@Nullable String value) {
        getElement().setPattern(value);
    }

    // !wca! observe pattern: string | null | undefined

    // !wca! get placeholder: string | null | undefined
    /**
     * A hint to the user of what can be entered in the control.
     */
    public @Nullable String getPlaceholder() {
        return getElement().getPlaceholder();
    }

    // !wca! set placeholder: string | null | undefined
    /**
     * A hint to the user of what can be entered in the control.
     */
    public void setPlaceholder(@Nullable String value) {
        getElement().setPlaceholder(value);
    }

    // !wca! observe placeholder: string | null | undefined

    // !wca! get preventInvalidInput: boolean | null | undefined
    /**
     * When set to true, user is prevented from typing a value that
     * conflicts with the given <code>pattern</code>.
     */
    public boolean isPreventInvalidInput() {
        return getElement().isPreventInvalidInput();
    }

    // !wca! set preventInvalidInput: boolean | null | undefined
    /**
     * When set to true, user is prevented from typing a value that
     * conflicts with the given <code>pattern</code>.
     */
    public void setPreventInvalidInput(boolean value) {
        getElement().setPreventInvalidInput(value);
    }

    // !wca! observe preventInvalidInput: boolean | null | undefined

    // !wca! get readonly: boolean | null | undefined
    /**
     * This attribute indicates that the user cannot modify the value of the control.
     */
    public boolean isReadonly() {
        return getElement().isReadonly();
    }

    // !wca! set readonly: boolean | null | undefined
    /**
     * This attribute indicates that the user cannot modify the value of the control.
     */
    public void setReadonly(boolean value) {
        getElement().setReadonly(value);
    }

    // !wca! observe readonly: boolean | null | undefined

    // !wca! get required: boolean | null | undefined
    /**
     * Specifies that the user must fill in a value.
     */
    public boolean isRequired() {
        return getElement().isRequired();
    }

    // !wca! set required: boolean | null | undefined
    /**
     * Specifies that the user must fill in a value.
     */
    public void setRequired(boolean value) {
        getElement().setRequired(value);
    }

    // !wca! observe required: boolean | null | undefined

    // !wca! get step: number
    /**
     * Specifies the allowed number intervals of the field.
     */
    public double getStep() {
        return getElement().getStep();
    }

    // !wca! set step: number
    /**
     * Specifies the allowed number intervals of the field.
     */
    public void setStep(double value) {
        getElement().setStep(value);
    }

    // !wca! observe step: number

    // !wca! get theme: string | null | undefined

    // !wca! observe theme: string | null | undefined

    // !wca! get title: string
    /**
     * The text usually displayed in a tooltip popup when the mouse is over the field.
     */
    public String getTitle() {
        return getElement().getTitle();
    }

    // !wca! set title: string
    /**
     * The text usually displayed in a tooltip popup when the mouse is over the field.
     */
    public void setTitle(String value) {
        getElement().setTitle(value);
    }

    // !wca! observe title: string

    // !wca! get value: string
    /**
     * The initial value of the control.
     * It can be used for two-way data binding.
     */
    public String getValue() {
        return getElement().getValue();
    }

    // !wca! set value: string
    /**
     * The initial value of the control.
     * It can be used for two-way data binding.
     */
    public void setValue(String value) {
        getElement().setValue(value);
    }

    // !wca! observe value: string
    /**
     * The initial value of the control.
     * It can be used for two-way data binding.
     */
    public ObservableValue<String> value() {
        return createObservableValue(this::getValue, this::setValue, "value-changed");
    }

    // !wca! event change: ?
    public ObservableEvent<Event> changeEvent() {
        return createEvent("change");
    }
}
