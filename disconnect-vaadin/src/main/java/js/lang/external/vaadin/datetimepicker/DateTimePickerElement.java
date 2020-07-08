package js.lang.external.vaadin.datetimepicker;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import js.lang.Any;
import js.web.dom.HTMLElement;
import org.teavm.jso.JSMethod;
import org.teavm.jso.JSProperty;

import javax.annotation.Nullable;

/**
 * <code>&lt;vaadin-date-time-picker&gt;</code> is a Web Component providing a date time selection field.
 *
 * <pre><code class="language-html">&lt;vaadin-date-time-picker value="2019-09-16T15:00"&gt;&lt;/vaadin-date-time-picker&gt;
 * </code></pre>
 * <pre><code class="language-js">dateTimePicker.value = '2019-09-16T15:00';
 * </code></pre>
 * When the selected <code>value</code> is changed, a <code>value-changed</code> event is triggered.
 *
 * <h3>Styling</h3>
 * The following shadow DOM parts are available for styling:
 *
 * <table>
 *  <thead>
 *   <tr>
 *    <th>Part name</th>
 *    <th>Description</th>
 *    <th>Theme for Element</th>
 *   </tr>
 *  </thead>
 *  <tbody>
 *   <tr>
 *    <td><code>date</code></td>
 *    <td>Date picker element</td>
 *    <td>vaadin-date-time-picker</td>
 *   </tr>
 *   <tr>
 *    <td><code>time</code></td>
 *    <td>Time picker element</td>
 *    <td>vaadin-date-time-picker</td>
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
 *    <td>Set when the element is disabled</td>
 *    <td>:host</td>
 *   </tr>
 *   <tr>
 *    <td><code>readonly</code></td>
 *    <td>Set when the element is read-only</td>
 *    <td>:host</td>
 *   </tr>
 *  </tbody>
 * </table>
 * See <a href="https://github.com/vaadin/vaadin-themable-mixin#stylable-shadow-parts">ThemableMixin â€“ Stylable Shadow Parts</a>
 *
 * In addition to <code>&lt;vaadin-date-time-picker&gt;</code> itself, the following internal components are themable:
 *
 * <ul>
 *  <li><code>&lt;vaadin-custom-field&gt;</code>, see <a href="https://vaadin.com/components/vaadin-custom-field/html-api/elements/Vaadin.CustomFieldElement"><code>custom-field</code> documentation</a> for the custom field parts.</li>
 *  <li><code>&lt;vaadin-date-picker&gt;</code>, see <a href="https://vaadin.com/components/vaadin-date-picker/html-api/elements/Vaadin.DatePickerElement"><code>date-picker</code> documentation</a> for the date picker parts.</li>
 *  <li><code>&lt;vaadin-time-picker&gt;</code>, see <a href="https://vaadin.com/components/vaadin-time-picker/html-api/elements/Vaadin.TimePickerElement"><code>time-picker</code> documentation</a> for the time picker parts.</li>
 * </ul>
 * Note: the <code>theme</code> attribute value set on <code>&lt;vaadin-date-time-picker&gt;</code> is propagated to the internal themable components listed above.
 *
 * <strong>Mixins:</strong> ElementMixin, ThemableMixin, ElementMixin
 *
 * <h2>Example</h2>
 * <pre><code class="language-javascript">demo/index.html
 * </code></pre>
 */
@NpmPackage(name = "@vaadin/vaadin-date-time-picker", version = "^1.3.0-alpha3")
@Import(module = "@vaadin/vaadin-date-time-picker/vaadin-date-time-picker.js")
public interface DateTimePickerElement extends HTMLElement {

    // !wca! checkValidity: (): boolean
    /**
     * Returns true if the current input value satisfies all constraints (if any)
     *
     * You can override the <code>checkValidity</code> method for custom validations.
     */
    @JSMethod("checkValidity")
    boolean checkValidity();

    // !wca! validate: (): boolean
    /**
     * Returns true if <code>value</code> is valid, and sets the <code>invalid</code> flag appropriately.
     */
    @JSMethod("validate")
    boolean validate();

    // !wca! get autoOpenDisabled: boolean
    /**
     * Set to true to prevent the overlays from opening automatically.
     */
    @JSProperty("autoOpenDisabled")
    boolean isAutoOpenDisabled();

    // !wca! set autoOpenDisabled: boolean
    /**
     * Set to true to prevent the overlays from opening automatically.
     */
    @JSProperty("autoOpenDisabled")
    void setAutoOpenDisabled(boolean value);

    // !wca! get autofocus: boolean
    /**
     * Specify that this control should have input focus when the page loads.
     */
    @JSProperty("autofocus")
    boolean isAutofocus();

    // !wca! set autofocus: boolean
    /**
     * Specify that this control should have input focus when the page loads.
     */
    @JSProperty("autofocus")
    void setAutofocus(boolean value);

    // !wca! get datePlaceholder: string
    /**
     * A placeholder string for the date field.
     */
    @JSProperty("datePlaceholder")
    String getDatePlaceholder();

    // !wca! set datePlaceholder: string
    /**
     * A placeholder string for the date field.
     */
    @JSProperty("datePlaceholder")
    void setDatePlaceholder(String value);

    // !wca! get disabled: boolean
    /**
     * Set to true to disable this element.
     */
    @JSProperty("disabled")
    boolean isDisabled();

    // !wca! set disabled: boolean
    /**
     * Set to true to disable this element.
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

    // !wca! get i18n: !DateTimePickerI18n

    // !wca! set i18n: !DateTimePickerI18n
    /**
     * The object used to localize this component.
     * To change the default localization, replace the entire
     * <code>i18n</code> object or just the properties you want to modify.
     *
     * The object is a combination of the i18n properties supported by
     * <code>&lt;vaadin-date-picker&gt;</code> and <code>&lt;vaadin-time-picker&gt;</code>. See <code>i18n</code> property at:
     * - <a href="https://vaadin.com/components/vaadin-date-picker/html-api/elements/Vaadin.DatePickerElement"><code>date-picker</code> documentation</a>
     * - <a href="https://vaadin.com/components/vaadin-time-picker/html-api/elements/Vaadin.TimePickerElement"><code>time-picker</code> documentation</a>
     */
    @JSProperty("i18n")
    void setI18n(DateTimePickerI18n value);

    // !wca! get initialPosition: string
    /**
     * Date which should be visible in the date picker overlay when there is no value selected.
     *
     * The same date formats as for the <code>value</code> property are supported but without the time part.
     */
    @JSProperty("initialPosition")
    String getInitialPosition();

    // !wca! set initialPosition: string
    /**
     * Date which should be visible in the date picker overlay when there is no value selected.
     *
     * The same date formats as for the <code>value</code> property are supported but without the time part.
     */
    @JSProperty("initialPosition")
    void setInitialPosition(String value);

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

    // !wca! get max: string | undefined
    /**
     * The latest value (date and time) that can be selected. All later values will be disabled.
     *
     * Supported date time format is based on ISO 8601 (without a time zone designator):
     * - Minute precision <code>"YYYY-MM-DDThh:mm"</code>
     * - Second precision <code>"YYYY-MM-DDThh:mm:ss"</code>
     * - Millisecond precision <code>"YYYY-MM-DDThh:mm:ss.fff"</code>
     */
    @JSProperty("max")
    @Nullable
    String getMax();

    // !wca! set max: string | undefined
    /**
     * The latest value (date and time) that can be selected. All later values will be disabled.
     *
     * Supported date time format is based on ISO 8601 (without a time zone designator):
     * - Minute precision <code>"YYYY-MM-DDThh:mm"</code>
     * - Second precision <code>"YYYY-MM-DDThh:mm:ss"</code>
     * - Millisecond precision <code>"YYYY-MM-DDThh:mm:ss.fff"</code>
     */
    @JSProperty("max")
    void setMax(@Nullable String value);

    // !wca! get min: string | undefined
    /**
     * The earliest allowed value (date and time) that can be selected. All earlier values will be disabled.
     *
     * Supported date time format is based on ISO 8601 (without a time zone designator):
     * - Minute precision <code>"YYYY-MM-DDThh:mm"</code>
     * - Second precision <code>"YYYY-MM-DDThh:mm:ss"</code>
     * - Millisecond precision <code>"YYYY-MM-DDThh:mm:ss.fff"</code>
     */
    @JSProperty("min")
    @Nullable
    String getMin();

    // !wca! set min: string | undefined
    /**
     * The earliest allowed value (date and time) that can be selected. All earlier values will be disabled.
     *
     * Supported date time format is based on ISO 8601 (without a time zone designator):
     * - Minute precision <code>"YYYY-MM-DDThh:mm"</code>
     * - Second precision <code>"YYYY-MM-DDThh:mm:ss"</code>
     * - Millisecond precision <code>"YYYY-MM-DDThh:mm:ss.fff"</code>
     */
    @JSProperty("min")
    void setMin(@Nullable String value);

    // !wca! get name: string
    /**
     * The name of the control, which is submitted with the form data.
     */
    @JSProperty("name")
    String getName();

    // !wca! set name: string
    /**
     * The name of the control, which is submitted with the form data.
     */
    @JSProperty("name")
    void setName(String value);

    // !wca! get readonly: boolean
    /**
     * Set to true to make this element read-only.
     */
    @JSProperty("readonly")
    boolean isReadonly();

    // !wca! set readonly: boolean
    /**
     * Set to true to make this element read-only.
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

    // !wca! get showWeekNumbers: boolean
    /**
     * Set true to display ISO-8601 week numbers in the calendar. Notice that
     * displaying week numbers is only supported when <code>i18n.firstDayOfWeek</code>
     * is 1 (Monday).
     */
    @JSProperty("showWeekNumbers")
    boolean isShowWeekNumbers();

    // !wca! set showWeekNumbers: boolean
    /**
     * Set true to display ISO-8601 week numbers in the calendar. Notice that
     * displaying week numbers is only supported when <code>i18n.firstDayOfWeek</code>
     * is 1 (Monday).
     */
    @JSProperty("showWeekNumbers")
    void setShowWeekNumbers(boolean value);

    // !wca! get step: number
    /**
     * Specifies the number of valid intervals in a day used for
     * configuring the items displayed in the time selection box.
     *
     * It also configures the precision of the time part of the value string. By default
     * the component formats time values as <code>hh:mm</code> but setting a step value
     * lower than one minute or one second, format resolution changes to
     * <code>hh:mm:ss</code> and <code>hh:mm:ss.fff</code> respectively.
     *
     * Unit must be set in seconds, and for correctly configuring intervals
     * in the dropdown, it need to evenly divide a day.
     *
     * Note: it is possible to define step that is dividing an hour in inexact
     * fragments (i.e. 5760 seconds which equals 1 hour 36 minutes), but it is
     * not recommended to use it for better UX.
     */
    @JSProperty("step")
    double getStep();

    // !wca! set step: number
    /**
     * Specifies the number of valid intervals in a day used for
     * configuring the items displayed in the time selection box.
     *
     * It also configures the precision of the time part of the value string. By default
     * the component formats time values as <code>hh:mm</code> but setting a step value
     * lower than one minute or one second, format resolution changes to
     * <code>hh:mm:ss</code> and <code>hh:mm:ss.fff</code> respectively.
     *
     * Unit must be set in seconds, and for correctly configuring intervals
     * in the dropdown, it need to evenly divide a day.
     *
     * Note: it is possible to define step that is dividing an hour in inexact
     * fragments (i.e. 5760 seconds which equals 1 hour 36 minutes), but it is
     * not recommended to use it for better UX.
     */
    @JSProperty("step")
    void setStep(double value);

    // !wca! get theme: string | null | undefined

    // !wca! get timePlaceholder: string
    /**
     * A placeholder string for the time field.
     */
    @JSProperty("timePlaceholder")
    String getTimePlaceholder();

    // !wca! set timePlaceholder: string
    /**
     * A placeholder string for the time field.
     */
    @JSProperty("timePlaceholder")
    void setTimePlaceholder(String value);

    // !wca! get value: string
    /**
     * The value for this element.
     *
     * Supported date time format is based on ISO 8601 (without a time zone designator):
     * - Minute precision <code>"YYYY-MM-DDThh:mm"</code> (default)
     * - Second precision <code>"YYYY-MM-DDThh:mm:ss"</code>
     * - Millisecond precision <code>"YYYY-MM-DDThh:mm:ss.fff"</code>
     */
    @JSProperty("value")
    String getValue();

    // !wca! set value: string
    /**
     * The value for this element.
     *
     * Supported date time format is based on ISO 8601 (without a time zone designator):
     * - Minute precision <code>"YYYY-MM-DDThh:mm"</code> (default)
     * - Second precision <code>"YYYY-MM-DDThh:mm:ss"</code>
     * - Millisecond precision <code>"YYYY-MM-DDThh:mm:ss.fff"</code>
     */
    @JSProperty("value")
    void setValue(String value);
}
