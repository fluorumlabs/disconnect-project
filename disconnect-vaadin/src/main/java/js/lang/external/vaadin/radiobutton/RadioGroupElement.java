package js.lang.external.vaadin.radiobutton;

import javax.annotation.Nullable;
import org.teavm.jso.JSProperty;
import org.teavm.jso.JSMethod;
import js.web.dom.HTMLElement;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import com.github.fluorumlabs.disconnect.core.annotations.Import;

/**
 * <code>&lt;vaadin-radio-group&gt;</code> is a Web Component for grouping vaadin-radio-buttons.
 *
 * <pre><code class="language-html">&lt;vaadin-radio-group&gt;
 *    &lt;vaadin-radio-button name="foo"&gt;Foo&lt;/vaadin-radio-button&gt;
 *    &lt;vaadin-radio-button name="bar"&gt;Bar&lt;/vaadin-radio-button&gt;
 *    &lt;vaadin-radio-button name="baz"&gt;Baz&lt;/vaadin-radio-button&gt;
 * &lt;/vaadin-radio-group&gt;
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
 *    <td><code>group-field</code></td>
 *    <td>The element that wraps radio-buttons</td>
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
 *    <td>Set when the radio group and its children are disabled.</td>
 *    <td>:host</td>
 *   </tr>
 *   <tr>
 *    <td><code>readonly</code></td>
 *    <td>Set to a readonly radio group</td>
 *    <td>:host</td>
 *   </tr>
 *   <tr>
 *    <td><code>invalid</code></td>
 *    <td>Set when the element is invalid</td>
 *    <td>:host</td>
 *   </tr>
 *   <tr>
 *    <td><code>has-label</code></td>
 *    <td>Set when the element has a label</td>
 *    <td>:host</td>
 *   </tr>
 *   <tr>
 *    <td><code>has-value</code></td>
 *    <td>Set when the element has a value</td>
 *    <td>:host</td>
 *   </tr>
 *   <tr>
 *    <td><code>focused</code></td>
 *    <td>Set when the element contains focus</td>
 *    <td>:host</td>
 *   </tr>
 *  </tbody>
 * </table>
 * See <a href="https://github.com/vaadin/vaadin-themable-mixin/wiki">ThemableMixin â€“ how to apply styles for shadow parts</a>
 *
 * <strong>Mixins:</strong> ThemableMixin, DirMixin, ElementMixin
 *
 * <h2>Example</h2>
 * <pre><code class="language-javascript">demo/index.html
 * </code></pre>
 */
@NpmPackage(name = "@vaadin/vaadin-radio-button", version = "^1.4.0-alpha3")
@Import(module = "@vaadin/vaadin-radio-button/vaadin-radio-group.js")
public interface RadioGroupElement extends HTMLElement {

    // !wca! checkValidity: (): boolean
    /**
     * Returns true if the current input value satisfies all constraints (if any)
     */
    @JSMethod("checkValidity")
    boolean checkValidity();

    // !wca! validate: (): boolean
    /**
     * Returns true if <code>value</code> is valid.
     * <code>&lt;iron-form&gt;</code> uses this to check the validity or all its elements.
     */
    @JSMethod("validate")
    boolean validate();

    // !wca! get disabled: boolean
    /**
     * The current disabled state of the radio group. True if group and all internal radio buttons are disabled.
     */
    @JSProperty("disabled")
    boolean isDisabled();

    // !wca! set disabled: boolean
    /**
     * The current disabled state of the radio group. True if group and all internal radio buttons are disabled.
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

    // !wca! get invalid: boolean
    /**
     * This property is set to true when the value is invalid.
     */
    @JSProperty("invalid")
    boolean isInvalid();

    // !wca! set invalid: boolean
    /**
     * This property is set to true when the value is invalid.
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

    // !wca! get readonly: boolean
    /**
     * This attribute indicates that the user cannot modify the value of the control.
     */
    @JSProperty("readonly")
    boolean isReadonly();

    // !wca! set readonly: boolean
    /**
     * This attribute indicates that the user cannot modify the value of the control.
     */
    @JSProperty("readonly")
    void setReadonly(boolean value);

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
     * Value of the radio group.
     */
    @JSProperty("value")
    String getValue();

    // !wca! set value: string
    /**
     * Value of the radio group.
     */
    @JSProperty("value")
    void setValue(String value);
}
