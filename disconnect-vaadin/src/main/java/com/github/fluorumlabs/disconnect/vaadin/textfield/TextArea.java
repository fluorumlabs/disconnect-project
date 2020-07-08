package com.github.fluorumlabs.disconnect.vaadin.textfield;

import com.github.fluorumlabs.disconnect.core.annotations.CustomElement;
import com.github.fluorumlabs.disconnect.core.components.Component;
import com.github.fluorumlabs.disconnect.core.components.HtmlComponent;
import com.github.fluorumlabs.disconnect.core.observables.ObservableValue;
import com.github.fluorumlabs.disconnect.core.utils.LowerCase;
import com.github.fluorumlabs.disconnect.vaadin.theme.Themable;
import js.lang.external.vaadin.textfield.TextAreaElement;
import js.lang.external.vaadin.textfield.TextFieldI18n;

import javax.annotation.Nullable;

/**
 * <code>&lt;vaadin-text-area&gt;</code> is a Web Component for text area control in forms.
 *
 * <pre><code class="language-html">&lt;vaadin-text-area label="Add description"&gt;
 * &lt;/vaadin-text-area&gt;
 * </code></pre>
 * <h3>Prefixes and suffixes</h3>
 * These are child elements of a <code>&lt;vaadin-text-area&gt;</code> that are displayed inline with the input, before or after. In order for an element to be considered as a prefix, it must have the slot attribute set to <code>prefix</code> (and similarly for <code>suffix</code>).
 *
 * <pre><code class="language-html">&lt;vaadin-text-area label="Add description"&gt;
 *    &lt;div slot="prefix"&gt;Details:&lt;/div&gt;
 *    &lt;div slot="suffix"&gt;The end!&lt;/div&gt;
 * &lt;/vaadin-text-area&gt;
 * </code></pre>
 * <h3>Styling</h3>
 * The following shadow DOM parts are available for styling:
 *
 * <table>
 *  <thead>
 *   <tr>
 *    <th>Part name</th>
 *    <th>Description</th>
 *   </tr>
 *  </thead>
 *  <tbody>
 *   <tr>
 *    <td><code>label</code></td>
 *    <td>The label element</td>
 *   </tr>
 *   <tr>
 *    <td><code>input-field</code></td>
 *    <td>The element that wraps prefix, value and suffix</td>
 *   </tr>
 *   <tr>
 *    <td><code>value</code></td>
 *    <td>The text value element inside the <code>input-field</code> element</td>
 *   </tr>
 *   <tr>
 *    <td><code>error-message</code></td>
 *    <td>The error message element</td>
 *   </tr>
 *  </tbody>
 * </table>
 * The following state attributes are available for styling:
 *
 * <table>
 *  <thead>
 *   <tr>
 *    <th>Attribute</th>
 *    <th>Description</th>
 *    <th>Part name</th>
 *   </tr>
 *  </thead>
 *  <tbody>
 *   <tr>
 *    <td><code>disabled</code></td>
 *    <td>Set to a disabled text field</td>
 *    <td>:host</td>
 *   </tr>
 *   <tr>
 *    <td><code>has-value</code></td>
 *    <td>Set when the element has a value</td>
 *    <td>:host</td>
 *   </tr>
 *   <tr>
 *    <td><code>has-label</code></td>
 *    <td>Set when the element has a label</td>
 *    <td>:host</td>
 *   </tr>
 *   <tr>
 *    <td><code>invalid</code></td>
 *    <td>Set when the element is invalid</td>
 *    <td>:host</td>
 *   </tr>
 *   <tr>
 *    <td><code>focused</code></td>
 *    <td>Set when the element is focused</td>
 *    <td>:host</td>
 *   </tr>
 *   <tr>
 *    <td><code>focus-ring</code></td>
 *    <td>Set when the element is keyboard focused</td>
 *    <td>:host</td>
 *   </tr>
 *   <tr>
 *    <td><code>readonly</code></td>
 *    <td>Set to a readonly text field</td>
 *    <td>:host</td>
 *   </tr>
 *  </tbody>
 * </table>
 * See <a href="https://github.com/vaadin/vaadin-themable-mixin/wiki">ThemableMixin â€“ how to apply styles for shadow parts</a>
 *
 * <strong>Mixins:</strong> ElementMixin, TextFieldMixin, ControlStateMixin, ThemableMixin, ElementMixin
 *
 * <h2>Example</h2>
 * <pre><code class="language-javascript">demo/index.html
 * </code></pre>
 */
@CustomElement(tagName = "vaadin-text-area", external = true)
public class TextArea extends HtmlComponent<TextAreaElement> implements Themable<TextAreaElement> {

    public TextArea() {
    }

    public TextArea(String textContent) {
        super(textContent);
    }

    public TextArea(Component<?>... components) {
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
    /**
     */
    public void clear() {
        getElement().clear();
    }

    // !wca! click: (): void
    /**
     */
    public void click() {
        getElement().click();
    }

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

    // !wca! get theme: string | null | undefined

    // !wca! observe theme: string | null | undefined

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
}
