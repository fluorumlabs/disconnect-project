package com.github.fluorumlabs.disconnect.vaadin.checkbox;

import com.github.fluorumlabs.disconnect.core.annotations.CustomElement;
import com.github.fluorumlabs.disconnect.core.components.Component;
import com.github.fluorumlabs.disconnect.core.components.HtmlComponent;
import com.github.fluorumlabs.disconnect.core.observables.ObservableValue;
import com.github.fluorumlabs.disconnect.vaadin.theme.Themable;
import com.github.fluorumlabs.disconnect.vaadin.theme.ThemeVariant;
import js.lang.external.vaadin.checkbox.CheckboxGroupElement;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

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
@CustomElement(tagName = "vaadin-checkbox-group", external = true)
public class CheckboxGroup extends HtmlComponent<CheckboxGroupElement> implements Themable<CheckboxGroupElement> {

    public CheckboxGroup() {
    }

    public CheckboxGroup(String textContent) {
        super(textContent);
    }

    public CheckboxGroup(Component<?>... components) {
        super(components);
    }

    // !wca! validate: (): boolean
    /**
     * Returns true if <code>value</code> is valid.
     * <code>&lt;iron-form&gt;</code> uses this to check the validity or all its elements.
     */
    public boolean validate() {
        return getElement().validate();
    }

    // !wca! get disabled: boolean
    /**
     * The current disabled state of the checkbox group. True if group and all internal checkboxes are disabled.
     */
    public boolean isDisabled() {
        return getElement().isDisabled();
    }

    // !wca! set disabled: boolean
    /**
     * The current disabled state of the checkbox group. True if group and all internal checkboxes are disabled.
     */
    public void setDisabled(boolean value) {
        getElement().setDisabled(value);
    }

    // !wca! observe disabled: boolean

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

    // !wca! get value: !Array<!string>
    /**
     * Value of the checkbox group.
     * Note: toggling the checkboxes modifies the value by creating new
     * array each time, to override Polymer dirty-checking for arrays.
     * You can still use Polymer array mutation methods to update the value.
     */
    public Set<String> getValue() {
        return new HashSet<>(Arrays.asList(getElement().getValue()));
    }

    // !wca! set value: !Array<!string>
    /**
     * Value of the checkbox group.
     * Note: toggling the checkboxes modifies the value by creating new
     * array each time, to override Polymer dirty-checking for arrays.
     * You can still use Polymer array mutation methods to update the value.
     */
    public void setValue(Set<String> value) {
        getElement().setValue(value.toArray(new String[0]));
    }

    // !wca! observe value: !Array<!string>
    /**
     * Value of the checkbox group.
     * Note: toggling the checkboxes modifies the value by creating new
     * array each time, to override Polymer dirty-checking for arrays.
     * You can still use Polymer array mutation methods to update the value.
     */
    public ObservableValue<Set<String>> value() {
        return createObservableValue(this::getValue, this::setValue, "value-changed");
    }

    public enum Variant implements ThemeVariant {
        VERTICAL
    }

}
