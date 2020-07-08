package com.github.fluorumlabs.disconnect.vaadin.timepicker;

import com.github.fluorumlabs.disconnect.core.annotations.CustomElement;
import com.github.fluorumlabs.disconnect.core.components.Component;
import com.github.fluorumlabs.disconnect.core.components.HtmlComponent;
import com.github.fluorumlabs.disconnect.core.observables.ObservableEvent;
import com.github.fluorumlabs.disconnect.core.observables.ObservableValue;
import com.github.fluorumlabs.disconnect.vaadin.theme.Themable;
import js.lang.external.vaadin.timepicker.TimePickerElement;
import js.lang.external.vaadin.timepicker.TimePickerI18n;
import js.web.dom.Event;

/**
 * <code>&lt;vaadin-time-picker&gt;</code> is a Web Component providing a time-selection field.
 *
 * <pre><code class="language-html">&lt;vaadin-time-picker&gt;&lt;/vaadin-time-picker&gt;
 * </code></pre>
 * <pre><code class="language-js">timePicker.value = '14:30';
 * </code></pre>
 * When the selected <code>value</code> is changed, a <code>value-changed</code> event is triggered.
 *
 * <h3>Styling</h3>
 * The following custom properties are available for styling:
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
 *    <td><code>toggle-button</code></td>
 *    <td>The toggle button</td>
 *   </tr>
 *  </tbody>
 * </table>
 * See <a href="https://github.com/vaadin/vaadin-themable-mixin/wiki">ThemableMixin â€“ how to apply styles for shadow parts</a>
 *
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
 *    <td>Set to a disabled time picker</td>
 *    <td>:host</td>
 *   </tr>
 *   <tr>
 *    <td><code>readonly</code></td>
 *    <td>Set to a read only time picker</td>
 *    <td>:host</td>
 *   </tr>
 *   <tr>
 *    <td><code>invalid</code></td>
 *    <td>Set when the element is invalid</td>
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
 *  </tbody>
 * </table>
 * In addition to <code>&lt;vaadin-time-picker&gt;</code> itself, the following internal components are themable:
 *
 * <ul>
 *  <li><code>&lt;vaadin-time-picker-text-field&gt;</code>, see <a href="https://vaadin.com/components/vaadin-text-field/html-api/elements/Vaadin.TextFieldElement"><code>&lt;vaadin-text-field&gt;</code> documentation</a> for the text field parts.</li>
 *  <li><code>&lt;vaadin-combo-box-light&gt;</code>, see <a href="https://vaadin.com/components/vaadin-combo-box/html-api/elements/Vaadin.ComboBoxElement"><code>&lt;vaadin-combo-box&gt;</code> documentation</a> for the combo box parts.</li>
 * </ul>
 * Note: the <code>theme</code> attribute value set on <code>&lt;vaadin-time-picker&gt;</code> is propagated to the internal themable components listed above.
 *
 * <strong>Mixins:</strong> ElementMixin, ControlStateMixin, ThemableMixin, ElementMixin
 *
 * <h2>Example</h2>
 * <pre><code class="language-javascript">demo/index.html
 * </code></pre>
 */
@CustomElement(tagName = "vaadin-time-picker", external = true)
public class TimePicker extends HtmlComponent<TimePickerElement> implements Themable<TimePickerElement> {

    public TimePicker() {
    }

    public TimePicker(String textContent) {
        super(textContent);
    }

    public TimePicker(Component<?>... components) {
        super(components);
    }

    // !wca! checkValidity: (): boolean
    /**
     * Returns true if the current input value satisfies all constraints (if any)
     *
     * You can override the <code>checkValidity</code> method for custom validations.
     */
    public boolean checkValidity() {
        return getElement().checkValidity();
    }

    // !wca! click: (): void

    // !wca! validate: (): boolean
    /**
     * Returns true if <code>value</code> is valid, and sets the <code>invalid</code> flag appropriately.
     */
    public boolean validate() {
        return getElement().validate();
    }

    // !wca! get autoOpenDisabled: boolean
    /**
     * Set true to prevent the overlay from opening automatically.
     */
    public boolean isAutoOpenDisabled() {
        return getElement().isAutoOpenDisabled();
    }

    // !wca! set autoOpenDisabled: boolean
    /**
     * Set true to prevent the overlay from opening automatically.
     */
    public void setAutoOpenDisabled(boolean value) {
        getElement().setAutoOpenDisabled(value);
    }

    // !wca! observe autoOpenDisabled: boolean

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

    // !wca! get clearButtonVisible: boolean
    /**
     * Set to true to display the clear icon which clears the input.
     */
    public boolean isClearButtonVisible() {
        return getElement().isClearButtonVisible();
    }

    // !wca! set clearButtonVisible: boolean
    /**
     * Set to true to display the clear icon which clears the input.
     */
    public void setClearButtonVisible(boolean value) {
        getElement().setClearButtonVisible(value);
    }

    // !wca! observe clearButtonVisible: boolean

    // !wca! get disabled: boolean
    /**
     * Set to true to disable this input.
     */
    public boolean isDisabled() {
        return getElement().isDisabled();
    }

    // !wca! set disabled: boolean
    /**
     * Set to true to disable this input.
     */
    public void setDisabled(boolean value) {
        getElement().setDisabled(value);
    }

    // !wca! observe disabled: boolean

    // !wca! get errorMessage: string
    /**
     * The error message to display when the input is invalid.
     */
    public String getErrorMessage() {
        return getElement().getErrorMessage();
    }

    // !wca! set errorMessage: string
    /**
     * The error message to display when the input is invalid.
     */
    public void setErrorMessage(String value) {
        getElement().setErrorMessage(value);
    }

    // !wca! observe errorMessage: string

    // !wca! get i18n: !TimePickerI18n

    // !wca! set i18n: !TimePickerI18n
    /**
     * The object used to localize this component.
     * To change the default localization, replace the entire
     * <em>i18n</em> object or just the property you want to modify.
     *
     * The object has the following JSON structure:
     *
     *  {
     *  // A function to format given <code>Object</code> as
     *  // time string. Object is in the format <code>{ hours: ..., minutes: ..., seconds: ..., milliseconds: ... }</code>
     *  formatTime: (time) =&gt; {
     *  // returns a string representation of the given
     *  // object in <code>hh</code> / 'hh:mm' / 'hh:mm:ss' / 'hh:mm:ss.fff' - formats
     *  },
     *
     *  // A function to parse the given text to an <code>Object</code> in the format
     *  // <code>{ hours: ..., minutes: ..., seconds: ..., milliseconds: ... }</code>.
     *  // Must properly parse (at least) text
     *  // formatted by <code>formatTime</code>.
     *  parseTime: text =&gt; {
     *  // Parses a string in object/string that can be formatted by<code>formatTime</code>.
     *  }
     *
     *  // Translation of the time selector icon button title.
     *  selector: 'Time selector',
     *
     *  // Translation of the time selector clear button title.
     *  clear: 'Clear'
     *  }
     * @param value
     */
    public void setI18n(TimePickerI18n value) {
        getElement().setI18n(value);
    }

    // !wca! observe i18n: !TimePickerI18n

    // !wca! get invalid: boolean
    /**
     * Set to true if the value is invalid.
     */
    public boolean isInvalid() {
        return getElement().isInvalid();
    }

    // !wca! set invalid: boolean
    /**
     * Set to true if the value is invalid.
     */
    public void setInvalid(boolean value) {
        getElement().setInvalid(value);
    }

    // !wca! observe invalid: boolean

    // !wca! get label: string
    /**
     * The label for this element.
     */
    public String getLabel() {
        return getElement().getLabel();
    }

    // !wca! set label: string
    /**
     * The label for this element.
     */
    public void setLabel(String value) {
        getElement().setLabel(value);
    }

    // !wca! observe label: string

    // !wca! get max: string
    /**
     * Maximum time allowed.
     *
     * Supported time formats are in ISO 8601:
     * - <code>hh:mm</code>
     * - <code>hh:mm:ss</code>
     * - <code>hh:mm:ss.fff</code>
     */
    public String getMax() {
        return getElement().getMax();
    }

    // !wca! set max: string
    /**
     * Maximum time allowed.
     *
     * Supported time formats are in ISO 8601:
     * - <code>hh:mm</code>
     * - <code>hh:mm:ss</code>
     * - <code>hh:mm:ss.fff</code>
     */
    public void setMax(String value) {
        getElement().setMax(value);
    }

    // !wca! observe max: string

    // !wca! get min: string
    /**
     * Minimum time allowed.
     *
     * Supported time formats are in ISO 8601:
     * - <code>hh:mm</code>
     * - <code>hh:mm:ss</code>
     * - <code>hh:mm:ss.fff</code>
     */
    public String getMin() {
        return getElement().getMin();
    }

    // !wca! set min: string
    /**
     * Minimum time allowed.
     *
     * Supported time formats are in ISO 8601:
     * - <code>hh:mm</code>
     * - <code>hh:mm:ss</code>
     * - <code>hh:mm:ss.fff</code>
     */
    public void setMin(String value) {
        getElement().setMin(value);
    }

    // !wca! observe min: string

    // !wca! get name: string
    /**
     * The name of this element.
     */
    public String getName() {
        return getElement().getName();
    }

    // !wca! set name: string
    /**
     * The name of this element.
     */
    public void setName(String value) {
        getElement().setName(value);
    }

    // !wca! observe name: string

    // !wca! get pattern: string
    /**
     * A pattern to validate the <code>input</code> with.
     */
    public String getPattern() {
        return getElement().getPattern();
    }

    // !wca! set pattern: string
    /**
     * A pattern to validate the <code>input</code> with.
     */
    public void setPattern(String value) {
        getElement().setPattern(value);
    }

    // !wca! observe pattern: string

    // !wca! get placeholder: string
    /**
     * A placeholder string in addition to the label.
     */
    public String getPlaceholder() {
        return getElement().getPlaceholder();
    }

    // !wca! set placeholder: string
    /**
     * A placeholder string in addition to the label.
     */
    public void setPlaceholder(String value) {
        getElement().setPlaceholder(value);
    }

    // !wca! observe placeholder: string

    // !wca! get preventInvalidInput: boolean
    /**
     * Set to true to prevent the user from entering invalid input.
     */
    public boolean isPreventInvalidInput() {
        return getElement().isPreventInvalidInput();
    }

    // !wca! set preventInvalidInput: boolean
    /**
     * Set to true to prevent the user from entering invalid input.
     */
    public void setPreventInvalidInput(boolean value) {
        getElement().setPreventInvalidInput(value);
    }

    // !wca! observe preventInvalidInput: boolean

    // !wca! get readonly: boolean
    /**
     * Set to true to prevent user picking a date or typing in the input.
     */
    public boolean isReadonly() {
        return getElement().isReadonly();
    }

    // !wca! set readonly: boolean
    /**
     * Set to true to prevent user picking a date or typing in the input.
     */
    public void setReadonly(boolean value) {
        getElement().setReadonly(value);
    }

    // !wca! observe readonly: boolean

    // !wca! get required: boolean
    /**
     * Set to true to mark the input as required.
     */
    public boolean isRequired() {
        return getElement().isRequired();
    }

    // !wca! set required: boolean
    /**
     * Set to true to mark the input as required.
     */
    public void setRequired(boolean value) {
        getElement().setRequired(value);
    }

    // !wca! observe required: boolean

    // !wca! get step: number
    /**
     * Specifies the number of valid intervals in a day used for
     * configuring the items displayed in the selection box.
     *
     * It also configures the precision of the value string. By default
     * the component formats values as <code>hh:mm</code> but setting a step value
     * lower than one minute or one second, format resolution changes to
     * <code>hh:mm:ss</code> and <code>hh:mm:ss.fff</code> respectively.
     *
     * Unit must be set in seconds, and for correctly configuring intervals
     * in the dropdown, it need to evenly divide a day.
     *
     * Note: it is possible to define step that is dividing an hour in inexact
     * fragments (i.e. 5760 seconds which equals 1 hour 36 minutes), but it is
     * not recommended to use it for better UX experience.
     */
    public double getStep() {
        return getElement().getStep();
    }

    // !wca! set step: number
    /**
     * Specifies the number of valid intervals in a day used for
     * configuring the items displayed in the selection box.
     *
     * It also configures the precision of the value string. By default
     * the component formats values as <code>hh:mm</code> but setting a step value
     * lower than one minute or one second, format resolution changes to
     * <code>hh:mm:ss</code> and <code>hh:mm:ss.fff</code> respectively.
     *
     * Unit must be set in seconds, and for correctly configuring intervals
     * in the dropdown, it need to evenly divide a day.
     *
     * Note: it is possible to define step that is dividing an hour in inexact
     * fragments (i.e. 5760 seconds which equals 1 hour 36 minutes), but it is
     * not recommended to use it for better UX experience.
     */
    public void setStep(double value) {
        getElement().setStep(value);
    }

    // !wca! observe step: number

    // !wca! get theme: string | null | undefined

    // !wca! observe theme: string | null | undefined

    // !wca! get value: string
    /**
     * The time value for this element.
     *
     * Supported time formats are in ISO 8601:
     * - <code>hh:mm</code> (default)
     * - <code>hh:mm:ss</code>
     * - <code>hh:mm:ss.fff</code>
     */
    public String getValue() {
        return getElement().getValue();
    }

    // !wca! set value: string
    /**
     * The time value for this element.
     *
     * Supported time formats are in ISO 8601:
     * - <code>hh:mm</code> (default)
     * - <code>hh:mm:ss</code>
     * - <code>hh:mm:ss.fff</code>
     */
    public void setValue(String value) {
        getElement().setValue(value);
    }

    // !wca! observe value: string
    /**
     * The time value for this element.
     *
     * Supported time formats are in ISO 8601:
     * - <code>hh:mm</code> (default)
     * - <code>hh:mm:ss</code>
     * - <code>hh:mm:ss.fff</code>
     */
    public ObservableValue<String> value() {
        return createObservableValue(this::getValue, this::setValue, "value-changed");
    }

    // !wca! event change: ?
    public ObservableEvent<Event> changeEvent() {
        return createEvent("change");
    }
}
