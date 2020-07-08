package js.lang.external.vaadin.textfield;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import com.github.fluorumlabs.disconnect.core.utils.Serialized;
import js.lang.Any;
import js.web.dom.HTMLElement;
import org.teavm.jso.JSMethod;
import org.teavm.jso.JSProperty;

import javax.annotation.Nullable;

/**
 * <code>&lt;vaadin-text-field&gt;</code> is a Web Component for text field control in forms.
 *
 * <pre><code class="language-html">&lt;vaadin-text-field label="First Name"&gt;
 * &lt;/vaadin-text-field&gt;
 * </code></pre>
 * <h3>Prefixes and suffixes</h3>
 * These are child elements of a <code>&lt;vaadin-text-field&gt;</code> that are displayed inline with the input, before or after. In order for an element to be considered as a prefix, it must have the slot attribute set to <code>prefix</code> (and similarly for <code>suffix</code>).
 *
 * <pre><code class="language-html">&lt;vaadin-text-field label="Email address"&gt;
 *    &lt;div slot="prefix"&gt;Sent to:&lt;/div&gt;
 *    &lt;div slot="suffix"&gt;@vaadin.com&lt;/div&gt;
 * &lt;/vaadin-text-area&gt;
 * </code></pre>
 * <h3>Styling</h3>
 * The following custom properties are available for styling:
 *
 * <table>
 *  <thead>
 *   <tr>
 *    <th>Custom property</th>
 *    <th>Description</th>
 *    <th>Default</th>
 *   </tr>
 *  </thead>
 *  <tbody>
 *   <tr>
 *    <td><code>--vaadin-text-field-default-width</code></td>
 *    <td>Set the default width of the input field</td>
 *    <td><code>12em</code></td>
 *   </tr>
 *  </tbody>
 * </table>
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
 *    <td><code>input-prevented</code></td>
 *    <td>Temporarily set when invalid input is prevented</td>
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
@NpmPackage(name = "@vaadin/vaadin-text-field", version = "^2.7.0-alpha5")
@Import(module = "@vaadin/vaadin-text-field/vaadin-text-field.js")
public interface TextFieldElement extends HTMLElement {

    // !wca! checkValidity: (): boolean
    /**
     * Returns true if the current input value satisfies all constraints (if any)
     */
    @JSMethod("checkValidity")
    boolean checkValidity();

    // !wca! clear: (): void
    /**
     */
    @JSMethod("clear")
    void clear();

    // !wca! click: (): void
    /**
     */
    @JSMethod("click")
    void click();

    // !wca! validate: (): boolean
    /**
     * Returns true if <code>value</code> is valid.
     * <code>&lt;iron-form&gt;</code> uses this to check the validity for all its elements.
     */
    @JSMethod("validate")
    boolean validate();

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
    @JSProperty("autocapitalize")
    @Nullable
    String getAutocapitalize();

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
    @JSProperty("autocapitalize")
    void setAutocapitalize(@Nullable String value);

    // !wca! get autocomplete: string | null | undefined
    /**
     * Whether the value of the control can be automatically completed by the browser.
     * List of available options at:
     * <a href="https://developer.mozilla.org/en/docs/Web/HTML/Element/input#attr-autocomplete">https://developer.mozilla.org/en/docs/Web/HTML/Element/input#attr-autocomplete</a>
     */
    @JSProperty("autocomplete")
    @Nullable
    String getAutocomplete();

    // !wca! set autocomplete: string | null | undefined
    /**
     * Whether the value of the control can be automatically completed by the browser.
     * List of available options at:
     * <a href="https://developer.mozilla.org/en/docs/Web/HTML/Element/input#attr-autocomplete">https://developer.mozilla.org/en/docs/Web/HTML/Element/input#attr-autocomplete</a>
     */
    @JSProperty("autocomplete")
    void setAutocomplete(@Nullable String value);

    // !wca! get autocorrect: "on" | "off" | undefined
    /**
     * This is a property supported by Safari that is used to control whether
     * autocorrection should be enabled when the user is entering/editing the text.
     * Possible values are:
     * on: Enable autocorrection.
     * off: Disable autocorrection.
     */
    @JSProperty("autocorrect")
    @Nullable
    String getAutocorrect();

    // !wca! set autocorrect: "on" | "off" | undefined
    /**
     * This is a property supported by Safari that is used to control whether
     * autocorrection should be enabled when the user is entering/editing the text.
     * Possible values are:
     * on: Enable autocorrection.
     * off: Disable autocorrection.
     */
    @JSProperty("autocorrect")
    void setAutocorrect(@Nullable String value);

    // !wca! get autofocus: boolean | null | undefined
    /**
     * Specify that this control should have input focus when the page loads.
     */
    @JSProperty("autofocus")
    boolean isAutofocus();

    // !wca! set autofocus: boolean | null | undefined
    /**
     * Specify that this control should have input focus when the page loads.
     */
    @JSProperty("autofocus")
    void setAutofocus(boolean value);

    // !wca! get autoselect: boolean
    /**
     * Specify that the value should be automatically selected when the field gains focus.
     */
    @JSProperty("autoselect")
    boolean isAutoselect();

    // !wca! set autoselect: boolean
    /**
     * Specify that the value should be automatically selected when the field gains focus.
     */
    @JSProperty("autoselect")
    void setAutoselect(boolean value);

    // !wca! get clearButtonVisible: boolean
    /**
     * Set to true to display the clear icon which clears the input.
     */
    @JSProperty("clearButtonVisible")
    boolean isClearButtonVisible();

    // !wca! set clearButtonVisible: boolean
    /**
     * Set to true to display the clear icon which clears the input.
     */
    @JSProperty("clearButtonVisible")
    void setClearButtonVisible(boolean value);

    // !wca! get disabled: boolean | null | undefined
    /**
     * If true, the user cannot interact with this element.
     */
    @JSProperty("disabled")
    boolean isDisabled();

    // !wca! set disabled: boolean | null | undefined
    /**
     * If true, the user cannot interact with this element.
     */
    @JSProperty("disabled")
    void setDisabled(boolean value);

    // !wca! get errorMessage: string
    /**
     * Error to show when the input value is invalid.
     */
    @JSProperty("errorMessage")
    String getErrorMessage();

    // !wca! set errorMessage: string
    /**
     * Error to show when the input value is invalid.
     */
    @JSProperty("errorMessage")
    void setErrorMessage(String value);

    // !wca! get focusElement: HTMLElement | null | undefined

    // !wca! get hasValue: boolean | null | undefined
    /**
     * Specifies that the text field has value.
     */
    @JSProperty("hasValue")
    boolean isHasValue();

    // !wca! set hasValue: boolean | null | undefined
    /**
     * Specifies that the text field has value.
     */
    @JSProperty("hasValue")
    void setHasValue(boolean value);

    // !wca! get i18n: { clear: string; }

    // !wca! set i18n: { clear: string; }
    /**
     * Object with translated strings used for localization. Has
     * the following structure and default values:
     *
     * <code>&lt;br /&gt;{&lt;br /&gt; // Translation of the clear icon button accessible label&lt;br /&gt; clear: 'Clear'&lt;br /&gt;}&lt;br /&gt;</code>
     */
    @JSProperty("i18n")
    void setI18n(TextFieldI18n value);

    // !wca! get inputElement: HTMLElement | null | undefined

    // !wca! get invalid: boolean
    /**
     * This property is set to true when the control value is invalid.
     */
    @JSProperty("invalid")
    boolean isInvalid();

    // !wca! set invalid: boolean
    /**
     * This property is set to true when the control value is invalid.
     */
    @JSProperty("invalid")
    void setInvalid(boolean value);

    // !wca! get label: string
    /**
     * String used for the label element.
     */
    @JSProperty("label")
    String getLabel();

    // !wca! set label: string
    /**
     * String used for the label element.
     */
    @JSProperty("label")
    void setLabel(String value);

    // !wca! get list: string
    /**
     * Identifies a list of pre-defined options to suggest to the user.
     * The value must be the id of a <datalist> element in the same document.</datalist>
     */
    @JSProperty("list")
    String getList();

    // !wca! set list: string
    /**
     * Identifies a list of pre-defined options to suggest to the user.
     * The value must be the id of a <datalist> element in the same document.</datalist>
     */
    @JSProperty("list")
    void setList(String value);

    // !wca! get maxlength: number | null | undefined
    /**
     * Maximum number of characters (in Unicode code points) that the user can enter.
     */
    @JSProperty("maxlength")
    int getMaxlength();

    // !wca! set maxlength: number | null | undefined
    /**
     * Maximum number of characters (in Unicode code points) that the user can enter.
     */
    @JSProperty("maxlength")
    void setMaxlength(int value);

    // !wca! get minlength: number | null | undefined
    /**
     * Minimum number of characters (in Unicode code points) that the user can enter.
     */
    @JSProperty("minlength")
    int getMinlength();

    // !wca! set minlength: number | null | undefined
    /**
     * Minimum number of characters (in Unicode code points) that the user can enter.
     */
    @JSProperty("minlength")
    void setMinlength(int value);

    // !wca! get name: string | null | undefined
    /**
     * The name of the control, which is submitted with the form data.
     */
    @JSProperty("name")
    @Nullable
    String getName();

    // !wca! set name: string | null | undefined
    /**
     * The name of the control, which is submitted with the form data.
     */
    @JSProperty("name")
    void setName(@Nullable String value);

    // !wca! get pattern: string
    /**
     * A regular expression that the value is checked against.
     * The pattern must match the entire value, not just some subset.
     */
    @JSProperty("pattern")
    String getPattern();

    // !wca! set pattern: string
    /**
     * A regular expression that the value is checked against.
     * The pattern must match the entire value, not just some subset.
     */
    @JSProperty("pattern")
    void setPattern(String value);

    // !wca! get placeholder: string | null | undefined
    /**
     * A hint to the user of what can be entered in the control.
     */
    @JSProperty("placeholder")
    @Nullable
    String getPlaceholder();

    // !wca! set placeholder: string | null | undefined
    /**
     * A hint to the user of what can be entered in the control.
     */
    @JSProperty("placeholder")
    void setPlaceholder(@Nullable String value);

    // !wca! get preventInvalidInput: boolean | null | undefined
    /**
     * When set to true, user is prevented from typing a value that
     * conflicts with the given <code>pattern</code>.
     */
    @JSProperty("preventInvalidInput")
    boolean isPreventInvalidInput();

    // !wca! set preventInvalidInput: boolean | null | undefined
    /**
     * When set to true, user is prevented from typing a value that
     * conflicts with the given <code>pattern</code>.
     */
    @JSProperty("preventInvalidInput")
    void setPreventInvalidInput(boolean value);

    // !wca! get readonly: boolean | null | undefined
    /**
     * This attribute indicates that the user cannot modify the value of the control.
     */
    @JSProperty("readonly")
    boolean isReadonly();

    // !wca! set readonly: boolean | null | undefined
    /**
     * This attribute indicates that the user cannot modify the value of the control.
     */
    @JSProperty("readonly")
    void setReadonly(boolean value);

    // !wca! get required: boolean | null | undefined
    /**
     * Specifies that the user must fill in a value.
     */
    @JSProperty("required")
    boolean isRequired();

    // !wca! set required: boolean | null | undefined
    /**
     * Specifies that the user must fill in a value.
     */
    @JSProperty("required")
    void setRequired(boolean value);

    // !wca! get theme: string | null | undefined

    // !wca! get title: string
    /**
     * The text usually displayed in a tooltip popup when the mouse is over the field.
     */
    @JSProperty("title")
    String getTitle();

    // !wca! set title: string
    /**
     * The text usually displayed in a tooltip popup when the mouse is over the field.
     */
    @JSProperty("title")
    void setTitle(String value);

    // !wca! get value: string
    /**
     * The initial value of the control.
     * It can be used for two-way data binding.
     */
    @JSProperty("value")
    String getValue();

    // !wca! set value: string
    /**
     * The initial value of the control.
     * It can be used for two-way data binding.
     */
    @JSProperty("value")
    void setValue(String value);
}
