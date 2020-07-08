package js.lang.external.vaadin.timepicker;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import js.lang.Any;
import js.web.dom.HTMLElement;
import org.teavm.jso.JSMethod;
import org.teavm.jso.JSProperty;

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
@NpmPackage(name = "@vaadin/vaadin-time-picker", version = "^2.3.0-alpha4")
@Import(module = "@vaadin/vaadin-time-picker/vaadin-time-picker.js")
public interface TimePickerElement extends HTMLElement {

    // !wca! checkValidity: (): boolean
    /**
     * Returns true if the current input value satisfies all constraints (if any)
     *
     * You can override the <code>checkValidity</code> method for custom validations.
     */
    @JSMethod("checkValidity")
    boolean checkValidity();

    // !wca! click: (): void
    /**
     */
    @JSMethod("click")
    void click();

    // !wca! validate: (): boolean
    /**
     * Returns true if <code>value</code> is valid, and sets the <code>invalid</code> flag appropriately.
     */
    @JSMethod("validate")
    boolean validate();

    // !wca! get autoOpenDisabled: boolean
    /**
     * Set true to prevent the overlay from opening automatically.
     */
    @JSProperty("autoOpenDisabled")
    boolean isAutoOpenDisabled();

    // !wca! set autoOpenDisabled: boolean
    /**
     * Set true to prevent the overlay from opening automatically.
     */
    @JSProperty("autoOpenDisabled")
    void setAutoOpenDisabled(boolean value);

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

    // !wca! get clearButtonVisible: boolean
    /**
     * Set to true to display the clear icon which clears the input.
     */
    @JSProperty("clearButtonVisible")
    boolean isClearButtonVisible();

    // !wca! set clearButtonVisible: boolean
    /**
     * Set to true to display the clear icon which clears the input.
     */
    @JSProperty("clearButtonVisible")
    void setClearButtonVisible(boolean value);

    // !wca! get disabled: boolean
    /**
     * Set to true to disable this input.
     */
    @JSProperty("disabled")
    boolean isDisabled();

    // !wca! set disabled: boolean
    /**
     * Set to true to disable this input.
     */
    @JSProperty("disabled")
    void setDisabled(boolean value);

    // !wca! get errorMessage: string
    /**
     * The error message to display when the input is invalid.
     */
    @JSProperty("errorMessage")
    String getErrorMessage();

    // !wca! set errorMessage: string
    /**
     * The error message to display when the input is invalid.
     */
    @JSProperty("errorMessage")
    void setErrorMessage(String value);

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
     */
    @JSProperty("i18n")
    void setI18n(TimePickerI18n value);

    // !wca! get invalid: boolean
    /**
     * Set to true if the value is invalid.
     */
    @JSProperty("invalid")
    boolean isInvalid();

    // !wca! set invalid: boolean
    /**
     * Set to true if the value is invalid.
     */
    @JSProperty("invalid")
    void setInvalid(boolean value);

    // !wca! get label: string
    /**
     * The label for this element.
     */
    @JSProperty("label")
    String getLabel();

    // !wca! set label: string
    /**
     * The label for this element.
     */
    @JSProperty("label")
    void setLabel(String value);

    // !wca! get max: string
    /**
     * Maximum time allowed.
     *
     * Supported time formats are in ISO 8601:
     * - <code>hh:mm</code>
     * - <code>hh:mm:ss</code>
     * - <code>hh:mm:ss.fff</code>
     */
    @JSProperty("max")
    String getMax();

    // !wca! set max: string
    /**
     * Maximum time allowed.
     *
     * Supported time formats are in ISO 8601:
     * - <code>hh:mm</code>
     * - <code>hh:mm:ss</code>
     * - <code>hh:mm:ss.fff</code>
     */
    @JSProperty("max")
    void setMax(String value);

    // !wca! get min: string
    /**
     * Minimum time allowed.
     *
     * Supported time formats are in ISO 8601:
     * - <code>hh:mm</code>
     * - <code>hh:mm:ss</code>
     * - <code>hh:mm:ss.fff</code>
     */
    @JSProperty("min")
    String getMin();

    // !wca! set min: string
    /**
     * Minimum time allowed.
     *
     * Supported time formats are in ISO 8601:
     * - <code>hh:mm</code>
     * - <code>hh:mm:ss</code>
     * - <code>hh:mm:ss.fff</code>
     */
    @JSProperty("min")
    void setMin(String value);

    // !wca! get name: string
    /**
     * The name of this element.
     */
    @JSProperty("name")
    String getName();

    // !wca! set name: string
    /**
     * The name of this element.
     */
    @JSProperty("name")
    void setName(String value);

    // !wca! get pattern: string
    /**
     * A pattern to validate the <code>input</code> with.
     */
    @JSProperty("pattern")
    String getPattern();

    // !wca! set pattern: string
    /**
     * A pattern to validate the <code>input</code> with.
     */
    @JSProperty("pattern")
    void setPattern(String value);

    // !wca! get placeholder: string
    /**
     * A placeholder string in addition to the label.
     */
    @JSProperty("placeholder")
    String getPlaceholder();

    // !wca! set placeholder: string
    /**
     * A placeholder string in addition to the label.
     */
    @JSProperty("placeholder")
    void setPlaceholder(String value);

    // !wca! get preventInvalidInput: boolean
    /**
     * Set to true to prevent the user from entering invalid input.
     */
    @JSProperty("preventInvalidInput")
    boolean isPreventInvalidInput();

    // !wca! set preventInvalidInput: boolean
    /**
     * Set to true to prevent the user from entering invalid input.
     */
    @JSProperty("preventInvalidInput")
    void setPreventInvalidInput(boolean value);

    // !wca! get readonly: boolean
    /**
     * Set to true to prevent user picking a date or typing in the input.
     */
    @JSProperty("readonly")
    boolean isReadonly();

    // !wca! set readonly: boolean
    /**
     * Set to true to prevent user picking a date or typing in the input.
     */
    @JSProperty("readonly")
    void setReadonly(boolean value);

    // !wca! get required: boolean
    /**
     * Set to true to mark the input as required.
     */
    @JSProperty("required")
    boolean isRequired();

    // !wca! set required: boolean
    /**
     * Set to true to mark the input as required.
     */
    @JSProperty("required")
    void setRequired(boolean value);

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
    @JSProperty("step")
    double getStep();

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
    @JSProperty("step")
    void setStep(double value);

    // !wca! get theme: string | null | undefined

    // !wca! get value: string
    /**
     * The time value for this element.
     *
     * Supported time formats are in ISO 8601:
     * - <code>hh:mm</code> (default)
     * - <code>hh:mm:ss</code>
     * - <code>hh:mm:ss.fff</code>
     */
    @JSProperty("value")
    String getValue();

    // !wca! set value: string
    /**
     * The time value for this element.
     *
     * Supported time formats are in ISO 8601:
     * - <code>hh:mm</code> (default)
     * - <code>hh:mm:ss</code>
     * - <code>hh:mm:ss.fff</code>
     */
    @JSProperty("value")
    void setValue(String value);
}
