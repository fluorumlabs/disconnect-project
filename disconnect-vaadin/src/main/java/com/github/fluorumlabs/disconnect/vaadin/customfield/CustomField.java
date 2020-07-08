package com.github.fluorumlabs.disconnect.vaadin.customfield;

import com.github.fluorumlabs.disconnect.core.annotations.CustomElement;
import com.github.fluorumlabs.disconnect.core.components.Component;
import com.github.fluorumlabs.disconnect.core.components.HtmlComponent;
import com.github.fluorumlabs.disconnect.core.containers.ArrayLikeBackedComponentList;
import com.github.fluorumlabs.disconnect.core.containers.ComponentList;
import com.github.fluorumlabs.disconnect.core.observables.ObservableValue;
import com.github.fluorumlabs.disconnect.vaadin.theme.Themable;
import com.github.fluorumlabs.disconnect.vaadin.theme.ThemeVariant;
import js.lang.external.vaadin.customfield.CustomFieldElement;
import js.lang.external.vaadin.customfield.CustomFieldI18n;
import js.web.dom.HTMLElement;

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
@CustomElement(tagName = "vaadin-custom-field", external = true)
public class CustomField extends HtmlComponent<CustomFieldElement> implements Themable<CustomFieldElement> {

    public CustomField() {
    }

    public CustomField(String textContent) {
        super(textContent);
    }

    public CustomField(Component<?>... components) {
        super(components);
    }

    // !wca! checkValidity: (): boolean
    /**
     * Returns true if the current inputs values satisfy all constraints (if any)
     */
    public boolean checkValidity() {
        return getElement().checkValidity();
    }

    // !wca! focus: (): void

    // !wca! validate: (): boolean
    /**
     * Returns true if <code>value</code> is valid.
     * <code>&lt;iron-form&gt;</code> uses this to check the validity or all its elements.
     */
    public boolean validate() {
        return getElement().validate();
    }

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
     * @param value
     */
    public void setI18n(CustomFieldI18n value) {
        getElement().setI18n(value);
    }

    // !wca! observe i18n: CustomFieldI18n

    // !wca! get inputs: HTMLElement[] | undefined
    /**
     * Array of available input nodes
     */
    @Nullable
    public ComponentList<Component<? extends HTMLElement>> getInputs() {
        return new ArrayLikeBackedComponentList<>(getElement().getInputs());
    }

    // !wca! observe inputs: HTMLElement[] | undefined

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

    // !wca! get name: string
    /**
     * The name of the control, which is submitted with the form data.
     */
    public String getName() {
        return getElement().getName();
    }

    // !wca! set name: string
    /**
     * The name of the control, which is submitted with the form data.
     */
    public void setName(String value) {
        getElement().setName(value);
    }

    // !wca! observe name: string

    // !wca! get required: boolean
    /**
     * Specifies that the user must fill in a value.
     */
    public boolean isRequired() {
        return getElement().isRequired();
    }

    // !wca! set required: boolean
    /**
     * Specifies that the user must fill in a value.
     */
    public void setRequired(boolean value) {
        getElement().setRequired(value);
    }

    // !wca! observe required: boolean

    // !wca! get theme: string | null | undefined

    // !wca! observe theme: string | null | undefined

    // !wca! get value: string
    /**
     * The value of the field. When wrapping several inputs, it will contain <code>\t</code>
     * (Tab character) as a delimiter indicating parts intended to be used as the
     * corresponding inputs values. Use the <a href="#/elements/vaadin-custom-field#property-i18n"><code>i18n</code></a>
     * property to customize this behavior.
     */
    public String getValue() {
        return getElement().getValue();
    }

    // !wca! set value: string
    /**
     * The value of the field. When wrapping several inputs, it will contain <code>\t</code>
     * (Tab character) as a delimiter indicating parts intended to be used as the
     * corresponding inputs values. Use the <a href="#/elements/vaadin-custom-field#property-i18n"><code>i18n</code></a>
     * property to customize this behavior.
     */
    public void setValue(String value) {
        getElement().setValue(value);
    }

    // !wca! observe value: string
    /**
     * The value of the field. When wrapping several inputs, it will contain <code>\t</code>
     * (Tab character) as a delimiter indicating parts intended to be used as the
     * corresponding inputs values. Use the <a href="#/elements/vaadin-custom-field#property-i18n"><code>i18n</code></a>
     * property to customize this behavior.
     */
    public ObservableValue<String> value() {
        return createObservableValue(this::getValue, this::setValue, "value-changed");
    }

    public enum Variant implements ThemeVariant {
        SMALL
    }
}
