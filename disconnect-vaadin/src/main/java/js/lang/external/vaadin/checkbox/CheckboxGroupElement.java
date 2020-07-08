package js.lang.external.vaadin.checkbox;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import js.web.dom.HTMLElement;
import org.teavm.jso.JSMethod;
import org.teavm.jso.JSProperty;

/**
 * <code>&lt;vaadin-checkbox-group&gt;</code> is a Polymer element for grouping vaadin-checkboxes.
 *
 * <pre><code class="language-html">&lt;vaadin-checkbox-group label="Preferred language of contact:"&gt;
 *   &lt;vaadin-checkbox value="en"&gt;English&lt;/vaadin-checkbox&gt;
 *   &lt;vaadin-checkbox value="fr"&gt;FranÃ§ais&lt;/vaadin-checkbox&gt;
 *   &lt;vaadin-checkbox value="de"&gt;Deutsch&lt;/vaadin-checkbox&gt;
 * &lt;/vaadin-checkbox-group&gt;
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
 *    <td>The element that wraps checkboxes</td>
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
 *    <td>Set when the checkbox group and its children are disabled.</td>
 *    <td>:host</td>
 *   </tr>
 *   <tr>
 *    <td><code>focused</code></td>
 *    <td>Set when the checkbox group contains focus</td>
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
 *    <td><code>required</code></td>
 *    <td>Set when the element is required</td>
 *    <td>:host</td>
 *   </tr>
 *   <tr>
 *    <td><code>invalid</code></td>
 *    <td>Set when the element is invalid</td>
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
@NpmPackage(name = "@vaadin/vaadin-checkbox", version = "^2.4.0-alpha3")
@Import(module = "@vaadin/vaadin-checkbox/vaadin-checkbox-group.js")
public interface CheckboxGroupElement extends HTMLElement {

    // !wca! validate: (): boolean
    /**
     * Returns true if <code>value</code> is valid.
     * <code>&lt;iron-form&gt;</code> uses this to check the validity or all its elements.
     */
    @JSMethod("validate")
    boolean validate();

    // !wca! get disabled: boolean
    /**
     * The current disabled state of the checkbox group. True if group and all internal checkboxes are disabled.
     */
    @JSProperty("disabled")
    boolean isDisabled();

    // !wca! set disabled: boolean
    /**
     * The current disabled state of the checkbox group. True if group and all internal checkboxes are disabled.
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

    // !wca! get value: !Array<!string>
    /**
     * Value of the checkbox group.
     * Note: toggling the checkboxes modifies the value by creating new
     * array each time, to override Polymer dirty-checking for arrays.
     * You can still use Polymer array mutation methods to update the value.
     */
    @JSProperty("value")
    String[] getValue();

    // !wca! set value: !Array<!string>
    /**
     * Value of the checkbox group.
     * Note: toggling the checkboxes modifies the value by creating new
     * array each time, to override Polymer dirty-checking for arrays.
     * You can still use Polymer array mutation methods to update the value.
     */
    @JSProperty("value")
    void setValue(String[] value);
}
