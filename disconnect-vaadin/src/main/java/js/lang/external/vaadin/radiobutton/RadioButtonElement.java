package js.lang.external.vaadin.radiobutton;

import javax.annotation.Nullable;
import org.teavm.jso.JSProperty;
import org.teavm.jso.JSMethod;
import js.web.dom.HTMLElement;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import com.github.fluorumlabs.disconnect.core.annotations.Import;

/**
 * <code>&lt;vaadin-radio-button&gt;</code> is a Web Component for radio buttons.
 *
 * <pre><code class="language-html">&lt;vaadin-radio-button value="foo"&gt;Foo&lt;/vaadin-radio-button&gt;
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
 *    <td><code>radio</code></td>
 *    <td>The radio button element</td>
 *   </tr>
 *   <tr>
 *    <td><code>label</code></td>
 *    <td>The label content element</td>
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
 *    <td>Set when the radio button is disabled.</td>
 *    <td>:host</td>
 *   </tr>
 *   <tr>
 *    <td><code>focus-ring</code></td>
 *    <td>Set when the radio button is focused using the keyboard.</td>
 *    <td>:host</td>
 *   </tr>
 *   <tr>
 *    <td><code>focused</code></td>
 *    <td>Set when the radio button is focused.</td>
 *    <td>:host</td>
 *   </tr>
 *   <tr>
 *    <td><code>checked</code></td>
 *    <td>Set when the radio button is checked.</td>
 *    <td>:host</td>
 *   </tr>
 *   <tr>
 *    <td><code>empty</code></td>
 *    <td>Set when there is no label provided.</td>
 *    <td>label</td>
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
@NpmPackage(name = "@vaadin/vaadin-radio-button", version = "^1.4.0-alpha3")
@Import(module = "@vaadin/vaadin-radio-button/vaadin-radio-button.js")
public interface RadioButtonElement extends HTMLElement {

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
     * True if the radio button is checked.
     */
    @JSProperty("checked")
    boolean isChecked();

    // !wca! set checked: boolean
    /**
     * True if the radio button is checked.
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

    // !wca! get name: string
    /**
     * Name of the element.
     */
    @JSProperty("name")
    String getName();

    // !wca! set name: string
    /**
     * Name of the element.
     */
    @JSProperty("name")
    void setName(String value);

    // !wca! get theme: string | null | undefined

    // !wca! get value: string
    /**
     * The value for this element.
     */
    @JSProperty("value")
    String getValue();

    // !wca! set value: string
    /**
     * The value for this element.
     */
    @JSProperty("value")
    void setValue(String value);
}
