package js.lang.external.vaadin.checkbox;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import js.web.dom.HTMLElement;
import org.teavm.jso.JSMethod;
import org.teavm.jso.JSProperty;

/**
 * <code>&lt;vaadin-checkbox&gt;</code> is a Web Component for customized checkboxes.
 *
 * <pre><code class="language-html">&lt;vaadin-checkbox&gt;
 *    Make my profile visible
 * &lt;/vaadin-checkbox&gt;
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
 *    <td><code>checkbox</code></td>
 *    <td>The wrapper element for the native <input type="checkbox"></td>
 *   </tr>
 *   <tr>
 *    <td><code>label</code></td>
 *    <td>The wrapper element in which the component's children, namely the label, is slotted</td>
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
 *    <td><code>active</code></td>
 *    <td>Set when the checkbox is pressed down, either with mouse, touch or the keyboard.</td>
 *    <td><code>:host</code></td>
 *   </tr>
 *   <tr>
 *    <td><code>disabled</code></td>
 *    <td>Set when the checkbox is disabled.</td>
 *    <td><code>:host</code></td>
 *   </tr>
 *   <tr>
 *    <td><code>focus-ring</code></td>
 *    <td>Set when the checkbox is focused using the keyboard.</td>
 *    <td><code>:host</code></td>
 *   </tr>
 *   <tr>
 *    <td><code>focused</code></td>
 *    <td>Set when the checkbox is focused.</td>
 *    <td><code>:host</code></td>
 *   </tr>
 *   <tr>
 *    <td><code>indeterminate</code></td>
 *    <td>Set when the checkbox is in indeterminate mode.</td>
 *    <td><code>:host</code></td>
 *   </tr>
 *   <tr>
 *    <td><code>checked</code></td>
 *    <td>Set when the checkbox is checked.</td>
 *    <td><code>:host</code></td>
 *   </tr>
 *   <tr>
 *    <td><code>empty</code></td>
 *    <td>Set when there is no label provided.</td>
 *    <td><code>label</code></td>
 *   </tr>
 *  </tbody>
 * </table>
 * See <a href="https://github.com/vaadin/vaadin-themable-mixin/wiki">ThemableMixin â€“ how to apply styles for shadow parts</a>
 *
 * <strong>Mixins:</strong> ElementMixin, ControlStateMixin, ThemableMixin, GestureEventListeners, ElementMixin
 *
 * <h2>Example</h2>
 * <pre><code class="language-javascript">demo/index.html
 * </code></pre>
 */
@NpmPackage(name = "@vaadin/vaadin-checkbox", version = "^2.4.0-alpha3")
@Import(module = "@vaadin/vaadin-checkbox/vaadin-checkbox.js")
public interface CheckboxElement extends HTMLElement {

    // !wca! click: (): void

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

    // !wca! get checked: boolean
    /**
     * True if the checkbox is checked.
     */
    @JSProperty("checked")
    boolean isChecked();

    // !wca! set checked: boolean
    /**
     * True if the checkbox is checked.
     */
    @JSProperty("checked")
    void setChecked(boolean value);

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

    // !wca! get indeterminate: boolean
    /**
     * Indeterminate state of the checkbox when it's neither checked nor unchecked, but undetermined.
     * <a href="https://developer.mozilla.org/en-US/docs/Web/HTML/Element/input/checkbox#Indeterminate_state_checkboxes">https://developer.mozilla.org/en-US/docs/Web/HTML/Element/input/checkbox#Indeterminate_state_checkboxes</a>
     */
    @JSProperty("indeterminate")
    boolean isIndeterminate();

    // !wca! set indeterminate: boolean
    /**
     * Indeterminate state of the checkbox when it's neither checked nor unchecked, but undetermined.
     * <a href="https://developer.mozilla.org/en-US/docs/Web/HTML/Element/input/checkbox#Indeterminate_state_checkboxes">https://developer.mozilla.org/en-US/docs/Web/HTML/Element/input/checkbox#Indeterminate_state_checkboxes</a>
     */
    @JSProperty("indeterminate")
    void setIndeterminate(boolean value);

    // !wca! get name: ?
    /**
     */
    @JSProperty("name")
    String getName();

    // !wca! set name: ?
    /**
     */
    @JSProperty("name")
    void setName(String value);

    // !wca! get theme: string | null | undefined

    // !wca! get value: string
    /**
     * The value given to the data submitted with the checkbox's name to the server when the control is inside a form.
     */
    @JSProperty("value")
    String getValue();

    // !wca! set value: string
    /**
     * The value given to the data submitted with the checkbox's name to the server when the control is inside a form.
     */
    @JSProperty("value")
    void setValue(String value);
}
