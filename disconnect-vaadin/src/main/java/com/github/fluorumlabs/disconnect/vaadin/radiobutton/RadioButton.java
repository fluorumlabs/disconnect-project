package com.github.fluorumlabs.disconnect.vaadin.radiobutton;

import com.github.fluorumlabs.disconnect.core.annotations.CustomElement;
import com.github.fluorumlabs.disconnect.core.components.Component;
import com.github.fluorumlabs.disconnect.core.components.HtmlComponent;
import com.github.fluorumlabs.disconnect.core.observables.ObservableEvent;
import com.github.fluorumlabs.disconnect.core.observables.ObservableValue;
import com.github.fluorumlabs.disconnect.vaadin.theme.Themable;
import js.lang.external.vaadin.radiobutton.RadioButtonElement;
import js.web.dom.Event;

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
@CustomElement(tagName = "vaadin-radio-button", external = true)
public class RadioButton extends HtmlComponent<RadioButtonElement> implements Themable<RadioButtonElement> {

    public RadioButton() {
    }

    public RadioButton(String textContent) {
        super(textContent);
    }

    public RadioButton(Component<?>... components) {
        super(components);
    }

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
     * True if the radio button is checked.
     */
    public boolean isChecked() {
        return getElement().isChecked();
    }

    // !wca! set checked: boolean
    /**
     * True if the radio button is checked.
     */
    public void setChecked(boolean value) {
        getElement().setChecked(value);
    }

    // !wca! observe checked: boolean
    /**
     * True if the radio button is checked.
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

    // !wca! get name: string
    /**
     * Name of the element.
     */
    public String getName() {
        return getElement().getName();
    }

    // !wca! set name: string
    /**
     * Name of the element.
     */
    public void setName(String value) {
        getElement().setName(value);
    }

    // !wca! observe name: string

    // !wca! get theme: string | null | undefined

    // !wca! observe theme: string | null | undefined

    // !wca! get value: string
    /**
     * The value for this element.
     */
    public String getValue() {
        return getElement().getValue();
    }

    // !wca! set value: string
    /**
     * The value for this element.
     */
    public void setValue(String value) {
        getElement().setValue(value);
    }

    // !wca! observe value: string
    /**
     * The value for this element.
     */
    public ObservableValue<String> value() {
        return createObservableValue(this::getValue, this::setValue, "value-changed");
    }

    // !wca! event change: ?
    public ObservableEvent<Event> changeEvent() {
        return createEvent("change");
    }
}
