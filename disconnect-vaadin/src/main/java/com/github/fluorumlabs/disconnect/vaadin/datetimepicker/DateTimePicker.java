package com.github.fluorumlabs.disconnect.vaadin.datetimepicker;

import com.github.fluorumlabs.disconnect.core.annotations.CustomElement;
import com.github.fluorumlabs.disconnect.core.components.Component;
import com.github.fluorumlabs.disconnect.core.components.HtmlComponent;
import com.github.fluorumlabs.disconnect.core.observables.ObservableEvent;
import com.github.fluorumlabs.disconnect.core.observables.ObservableValue;
import com.github.fluorumlabs.disconnect.vaadin.theme.Themable;
import js.lang.external.vaadin.datetimepicker.DateTimePickerElement;
import js.lang.external.vaadin.datetimepicker.DateTimePickerI18n;
import js.web.dom.Event;

import javax.annotation.Nullable;
import java.util.Date;

import static com.github.fluorumlabs.disconnect.vaadin.datepicker.DatePicker.fromDate;
import static com.github.fluorumlabs.disconnect.vaadin.datepicker.DatePicker.toDate;

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
@CustomElement(tagName = "vaadin-date-time-picker", external = true)
public class DateTimePicker extends HtmlComponent<DateTimePickerElement> implements Themable<DateTimePickerElement> {

    public DateTimePicker() {
    }

    public DateTimePicker(String textContent) {
        super(textContent);
    }

    public DateTimePicker(Component<?>... components) {
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

    // !wca! validate: (): boolean
    /**
     * Returns true if <code>value</code> is valid, and sets the <code>invalid</code> flag appropriately.
     */
    public boolean validate() {
        return getElement().validate();
    }

    // !wca! get autoOpenDisabled: boolean
    /**
     * Set to true to prevent the overlays from opening automatically.
     */
    public boolean isAutoOpenDisabled() {
        return getElement().isAutoOpenDisabled();
    }

    // !wca! set autoOpenDisabled: boolean
    /**
     * Set to true to prevent the overlays from opening automatically.
     */
    public void setAutoOpenDisabled(boolean value) {
        getElement().setAutoOpenDisabled(value);
    }

    // !wca! observe autoOpenDisabled: boolean

    // !wca! get autofocus: boolean
    /**
     * Specify that this control should have input focus when the page loads.
     */
    public boolean isAutofocus() {
        return getElement().isAutofocus();
    }

    // !wca! set autofocus: boolean
    /**
     * Specify that this control should have input focus when the page loads.
     */
    public void setAutofocus(boolean value) {
        getElement().setAutofocus(value);
    }

    // !wca! observe autofocus: boolean

    // !wca! get datePlaceholder: string
    /**
     * A placeholder string for the date field.
     */
    public String getDatePlaceholder() {
        return getElement().getDatePlaceholder();
    }

    // !wca! set datePlaceholder: string
    /**
     * A placeholder string for the date field.
     */
    public void setDatePlaceholder(String value) {
        getElement().setDatePlaceholder(value);
    }

    // !wca! observe datePlaceholder: string

    // !wca! get disabled: boolean
    /**
     * Set to true to disable this element.
     */
    public boolean isDisabled() {
        return getElement().isDisabled();
    }

    // !wca! set disabled: boolean
    /**
     * Set to true to disable this element.
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
     * @param value
     */
    public void setI18n(DateTimePickerI18n value) {
        getElement().setI18n(value);
    }

    // !wca! observe i18n: !DateTimePickerI18n

    // !wca! get initialPosition: string
    /**
     * Date which should be visible in the date picker overlay when there is no value selected.
     *
     * The same date formats as for the <code>value</code> property are supported but without the time part.
     */
    public Date getInitialPosition() {
        return toDate(getElement().getInitialPosition());
    }

    // !wca! set initialPosition: string
    /**
     * Date which should be visible in the date picker overlay when there is no value selected.
     *
     * The same date formats as for the <code>value</code> property are supported but without the time part.
     */
    public void setInitialPosition(Date value) {
        getElement().setInitialPosition(fromDate(value));
    }

    // !wca! observe initialPosition: string
    /**
     * Date which should be visible in the date picker overlay when there is no value selected.
     *
     * The same date formats as for the <code>value</code> property are supported but without the time part.
     */
    public ObservableValue<Date> initialPosition() {
        return createObservableValue(this::getInitialPosition, this::setInitialPosition, "initial-position-changed");
    }

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

    // !wca! get max: string | undefined
    /**
     * The latest value (date and time) that can be selected. All later values will be disabled.
     *
     * Supported date time format is based on ISO 8601 (without a time zone designator):
     * - Minute precision <code>"YYYY-MM-DDThh:mm"</code>
     * - Second precision <code>"YYYY-MM-DDThh:mm:ss"</code>
     * - Millisecond precision <code>"YYYY-MM-DDThh:mm:ss.fff"</code>
     */
    public @Nullable String getMax() {
        return getElement().getMax();
    }

    // !wca! set max: string | undefined
    /**
     * The latest value (date and time) that can be selected. All later values will be disabled.
     *
     * Supported date time format is based on ISO 8601 (without a time zone designator):
     * - Minute precision <code>"YYYY-MM-DDThh:mm"</code>
     * - Second precision <code>"YYYY-MM-DDThh:mm:ss"</code>
     * - Millisecond precision <code>"YYYY-MM-DDThh:mm:ss.fff"</code>
     */
    public void setMax(@Nullable String value) {
        getElement().setMax(value);
    }

    // !wca! observe max: string | undefined

    // !wca! get min: string | undefined
    /**
     * The earliest allowed value (date and time) that can be selected. All earlier values will be disabled.
     *
     * Supported date time format is based on ISO 8601 (without a time zone designator):
     * - Minute precision <code>"YYYY-MM-DDThh:mm"</code>
     * - Second precision <code>"YYYY-MM-DDThh:mm:ss"</code>
     * - Millisecond precision <code>"YYYY-MM-DDThh:mm:ss.fff"</code>
     */
    public @Nullable String getMin() {
        return getElement().getMin();
    }

    // !wca! set min: string | undefined
    /**
     * The earliest allowed value (date and time) that can be selected. All earlier values will be disabled.
     *
     * Supported date time format is based on ISO 8601 (without a time zone designator):
     * - Minute precision <code>"YYYY-MM-DDThh:mm"</code>
     * - Second precision <code>"YYYY-MM-DDThh:mm:ss"</code>
     * - Millisecond precision <code>"YYYY-MM-DDThh:mm:ss.fff"</code>
     */
    public void setMin(@Nullable String value) {
        getElement().setMin(value);
    }

    // !wca! observe min: string | undefined

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

    // !wca! get readonly: boolean
    /**
     * Set to true to make this element read-only.
     */
    public boolean isReadonly() {
        return getElement().isReadonly();
    }

    // !wca! set readonly: boolean
    /**
     * Set to true to make this element read-only.
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

    // !wca! get showWeekNumbers: boolean
    /**
     * Set true to display ISO-8601 week numbers in the calendar. Notice that
     * displaying week numbers is only supported when <code>i18n.firstDayOfWeek</code>
     * is 1 (Monday).
     */
    public boolean isShowWeekNumbers() {
        return getElement().isShowWeekNumbers();
    }

    // !wca! set showWeekNumbers: boolean
    /**
     * Set true to display ISO-8601 week numbers in the calendar. Notice that
     * displaying week numbers is only supported when <code>i18n.firstDayOfWeek</code>
     * is 1 (Monday).
     */
    public void setShowWeekNumbers(boolean value) {
        getElement().setShowWeekNumbers(value);
    }

    // !wca! observe showWeekNumbers: boolean

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
    public double getStep() {
        return getElement().getStep();
    }

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
    public void setStep(double value) {
        getElement().setStep(value);
    }

    // !wca! observe step: number

    // !wca! get theme: string | null | undefined

    // !wca! observe theme: string | null | undefined

    // !wca! get timePlaceholder: string
    /**
     * A placeholder string for the time field.
     */
    public String getTimePlaceholder() {
        return getElement().getTimePlaceholder();
    }

    // !wca! set timePlaceholder: string
    /**
     * A placeholder string for the time field.
     */
    public void setTimePlaceholder(String value) {
        getElement().setTimePlaceholder(value);
    }

    // !wca! observe timePlaceholder: string

    // !wca! get value: string
    /**
     * The value for this element.
     *
     * Supported date time format is based on ISO 8601 (without a time zone designator):
     * - Minute precision <code>"YYYY-MM-DDThh:mm"</code> (default)
     * - Second precision <code>"YYYY-MM-DDThh:mm:ss"</code>
     * - Millisecond precision <code>"YYYY-MM-DDThh:mm:ss.fff"</code>
     */
    public String getValue() {
        return getElement().getValue();
    }

    // !wca! set value: string
    /**
     * The value for this element.
     *
     * Supported date time format is based on ISO 8601 (without a time zone designator):
     * - Minute precision <code>"YYYY-MM-DDThh:mm"</code> (default)
     * - Second precision <code>"YYYY-MM-DDThh:mm:ss"</code>
     * - Millisecond precision <code>"YYYY-MM-DDThh:mm:ss.fff"</code>
     */
    public void setValue(String value) {
        getElement().setValue(value);
    }

    // !wca! observe value: string
    /**
     * The value for this element.
     *
     * Supported date time format is based on ISO 8601 (without a time zone designator):
     * - Minute precision <code>"YYYY-MM-DDThh:mm"</code> (default)
     * - Second precision <code>"YYYY-MM-DDThh:mm:ss"</code>
     * - Millisecond precision <code>"YYYY-MM-DDThh:mm:ss.fff"</code>
     */
    public ObservableValue<String> value() {
        return createObservableValue(this::getValue, this::setValue, "value-changed");
    }

    // !wca! event change: ?
    public ObservableEvent<Event> changeEvent() {
        return createEvent("change");
    }
}
