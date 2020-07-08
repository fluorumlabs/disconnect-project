package com.github.fluorumlabs.disconnect.vaadin.checkbox;

import com.github.fluorumlabs.disconnect.core.annotations.CustomElement;
import com.github.fluorumlabs.disconnect.core.components.Component;
import com.github.fluorumlabs.disconnect.core.components.HtmlComponent;
import com.github.fluorumlabs.disconnect.core.observables.ObservableEvent;
import com.github.fluorumlabs.disconnect.core.observables.ObservableValue;
import com.github.fluorumlabs.disconnect.vaadin.theme.Themable;
import js.lang.external.vaadin.checkbox.CheckboxElement;
import js.web.dom.Event;

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
@CustomElement(tagName = "vaadin-checkbox", external = true)
public class Checkbox extends HtmlComponent<CheckboxElement> implements Themable<CheckboxElement> {

    public Checkbox() {
    }

    public Checkbox(String textContent) {
        super(textContent);
    }

    public Checkbox(Component<?>... components) {
        super(components);
    }

    // !wca! click: (): void

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

    // !wca! get checked: boolean
    /**
     * True if the checkbox is checked.
     */
    public boolean isChecked() {
        return getElement().isChecked();
    }

    // !wca! set checked: boolean
    /**
     * True if the checkbox is checked.
     */
    public void setChecked(boolean value) {
        getElement().setChecked(value);
    }

    // !wca! observe checked: boolean
    /**
     * True if the checkbox is checked.
     */
    public ObservableValue<Boolean> checked() {
        return createObservableValue(this::isChecked, this::setChecked, "checked-changed");
    }

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

    // !wca! get indeterminate: boolean
    /**
     * Indeterminate state of the checkbox when it's neither checked nor unchecked, but undetermined.
     * <a href="https://developer.mozilla.org/en-US/docs/Web/HTML/Element/input/checkbox#Indeterminate_state_checkboxes">https://developer.mozilla.org/en-US/docs/Web/HTML/Element/input/checkbox#Indeterminate_state_checkboxes</a>
     */
    public boolean isIndeterminate() {
        return getElement().isIndeterminate();
    }

    // !wca! set indeterminate: boolean
    /**
     * Indeterminate state of the checkbox when it's neither checked nor unchecked, but undetermined.
     * <a href="https://developer.mozilla.org/en-US/docs/Web/HTML/Element/input/checkbox#Indeterminate_state_checkboxes">https://developer.mozilla.org/en-US/docs/Web/HTML/Element/input/checkbox#Indeterminate_state_checkboxes</a>
     */
    public void setIndeterminate(boolean value) {
        getElement().setIndeterminate(value);
    }

    // !wca! observe indeterminate: boolean

    // !wca! get name: ?
    /**
     */
    public String getName() {
        return getElement().getName();
    }

    // !wca! set name: ?
    /**
     */
    public void setName(String value) {
        getElement().setName(value);
    }

    // !wca! observe name: ?

    // !wca! get theme: string | null | undefined

    // !wca! observe theme: string | null | undefined

    // !wca! get value: string
    /**
     * The value given to the data submitted with the checkbox's name to the server when the control is inside a form.
     */
    public String getValue() {
        return getElement().getValue();
    }

    // !wca! set value: string
    /**
     * The value given to the data submitted with the checkbox's name to the server when the control is inside a form.
     */
    public void setValue(String value) {
        getElement().setValue(value);
    }

    // !wca! observe value: string
    /**
     * The value given to the data submitted with the checkbox's name to the server when the control is inside a form.
     */
    public ObservableValue<String> value() {
        return createObservableValue(this::getValue, this::setValue, "value-changed");
    }

    // !wca! event change: ?
    public ObservableEvent<Event> changeEvent() {
        return createEvent("change");
    }
}
