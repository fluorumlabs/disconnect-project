package js.lang.external.vaadin.customfield;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import js.util.collections.Array;
import js.web.dom.HTMLElement;
import org.teavm.jso.JSMethod;
import org.teavm.jso.JSProperty;

import javax.annotation.Nullable;

/**
 * <code>&lt;vaadin-custom-field&gt;</code> is a Web Component providing field wrapper functionality.
 *
 * <pre><code>&lt;vaadin-custom-field label="Appointment time"&gt;
 *    &lt;vaadin-date-picker&gt;&lt;/vaadin-date-picker&gt;
 *    &lt;vaadin-time-picker&gt;&lt;/vaadin-time-picker&gt;
 * &lt;/vaadin-custom-field&gt;
 * </code></pre>
 * <h3>Styling</h3>
 * You may set the attribute <code>disabled</code> or <code>readonly</code> on this component to make the label styles behave the same way as they would on a <code>&lt;vaadin-text-field&gt;</code> which is disabled or readonly.
 *
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
 *    <td><code>has-label</code></td>
 *    <td>Set when the field has a label</td>
 *    <td>:host</td>
 *   </tr>
 *   <tr>
 *    <td><code>invalid</code></td>
 *    <td>Set when the field is invalid</td>
 *    <td>:host</td>
 *   </tr>
 *   <tr>
 *    <td><code>focused</code></td>
 *    <td>Set when the field contains focus</td>
 *    <td>:host</td>
 *   </tr>
 *  </tbody>
 * </table>
 * See <a href="https://github.com/vaadin/vaadin-themable-mixin/wiki">ThemableMixin â€“ how to apply styles for shadow parts</a>
 *
 * <strong>Mixins:</strong> ElementMixin, CustomFieldMixin, ThemableMixin, ElementMixin
 *
 * <h2>Example</h2>
 * <pre><code class="language-javascript">demo/index.html
 * </code></pre>
 */
@NpmPackage(name = "@vaadin/vaadin-custom-field", version = "^1.2.0-alpha3")
@Import(module = "@vaadin/vaadin-custom-field/vaadin-custom-field.js")
public interface CustomFieldElement extends HTMLElement {

    // !wca! checkValidity: (): boolean
    /**
     * Returns true if the current inputs values satisfy all constraints (if any)
     */
    @JSMethod("checkValidity")
    boolean checkValidity();

    // !wca! focus: (): void
    /**
     */
    @JSMethod("focus")
    void focus();

    // !wca! validate: (): boolean
    /**
     * Returns true if <code>value</code> is valid.
     * <code>&lt;iron-form&gt;</code> uses this to check the validity or all its elements.
     */
    @JSMethod("validate")
    boolean validate();

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

    // !wca! get i18n: CustomFieldI18n

    // !wca! set i18n: CustomFieldI18n
    /**
     * The object used to localize this component.
     * To change the default localization, replace the entire
     * <em>i18n</em> object or just the property you want to modify.
     *
     * The object has the following JSON structure:
     *
     *  {
     *  // A function to format given <code>Array</code> as
     *  // component value. Array is list of all internal values
     *  // in the order of their presence in the DOM
     *  // This function is called each time the internal input
     *  // value is changed.
     *  formatValue: inputValues =&gt; {
     *  // returns a representation of the given array of values
     *  // in the form of string with delimiter characters
     *  },
     *
     *  // A function to parse the given value to an <code>Array</code> in the format
     *  // of the list of all internal values
     *  // in the order of their presence in the DOM
     *  // This function is called when value of the
     *  // custom field is set.
     *  parseValue: value =&gt; {
     *  // returns the array of values from parsed value string.
     *  }
     */
    @JSProperty("i18n")
    void setI18n(CustomFieldI18n value);

    // !wca! get inputs: HTMLElement[] | undefined
    /**
     * Array of available input nodes
     */
    @JSProperty("inputs")
    @Nullable
    Array<HTMLElement> getInputs();

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

    // !wca! get name: string
    /**
     * The name of the control, which is submitted with the form data.
     */
    @JSProperty("name")
    String getName();

    // !wca! set name: string
    /**
     * The name of the control, which is submitted with the form data.
     */
    @JSProperty("name")
    void setName(String value);

    // !wca! get required: boolean
    /**
     * Specifies that the user must fill in a value.
     */
    @JSProperty("required")
    boolean isRequired();

    // !wca! set required: boolean
    /**
     * Specifies that the user must fill in a value.
     */
    @JSProperty("required")
    void setRequired(boolean value);

    // !wca! get theme: string | null | undefined

    // !wca! get value: string
    /**
     * The value of the field. When wrapping several inputs, it will contain <code>\t</code>
     * (Tab character) as a delimiter indicating parts intended to be used as the
     * corresponding inputs values. Use the <a href="#/elements/vaadin-custom-field#property-i18n"><code>i18n</code></a>
     * property to customize this behavior.
     */
    @JSProperty("value")
    String getValue();

    // !wca! set value: string
    /**
     * The value of the field. When wrapping several inputs, it will contain <code>\t</code>
     * (Tab character) as a delimiter indicating parts intended to be used as the
     * corresponding inputs values. Use the <a href="#/elements/vaadin-custom-field#property-i18n"><code>i18n</code></a>
     * property to customize this behavior.
     */
    @JSProperty("value")
    void setValue(String value);
}
