package js.lang.external.vaadin.datepicker;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import js.lang.Any;
import js.web.dom.HTMLElement;
import org.teavm.jso.JSMethod;
import org.teavm.jso.JSProperty;

import javax.annotation.Nullable;

/**
 * <code>&lt;vaadin-date-picker&gt;</code> is a date selection field which includes a scrollable month calendar view.
 *
 * <pre><code class="language-html">&lt;vaadin-date-picker label="Birthday"&gt;&lt;/vaadin-date-picker&gt;
 * </code></pre>
 * <pre><code class="language-js">datePicker.value = '2016-03-02';
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
 *    <td><code>text-field</code></td>
 *    <td>Input element</td>
 *    <td>vaadin-date-picker</td>
 *   </tr>
 *   <tr>
 *    <td><code>clear-button</code></td>
 *    <td>Clear button</td>
 *    <td>vaadin-date-picker</td>
 *   </tr>
 *   <tr>
 *    <td><code>toggle-button</code></td>
 *    <td>Toggle button</td>
 *    <td>vaadin-date-picker</td>
 *   </tr>
 *   <tr>
 *    <td><code>overlay-content</code></td>
 *    <td>The overlay element</td>
 *    <td>vaadin-date-picker</td>
 *   </tr>
 *   <tr>
 *    <td><code>overlay-header</code></td>
 *    <td>Fullscreen mode header</td>
 *    <td>vaadin-date-picker-overlay-content</td>
 *   </tr>
 *   <tr>
 *    <td><code>label</code></td>
 *    <td>Fullscreen mode value/label</td>
 *    <td>vaadin-date-picker-overlay-content</td>
 *   </tr>
 *   <tr>
 *    <td><code>clear-button</code></td>
 *    <td>Fullscreen mode clear button</td>
 *    <td>vaadin-date-picker-overlay-content</td>
 *   </tr>
 *   <tr>
 *    <td><code>toggle-button</code></td>
 *    <td>Fullscreen mode toggle button</td>
 *    <td>vaadin-date-picker-overlay-content</td>
 *   </tr>
 *   <tr>
 *    <td><code>years-toggle-button</code></td>
 *    <td>Fullscreen mode years scroller toggle</td>
 *    <td>vaadin-date-picker-overlay-content</td>
 *   </tr>
 *   <tr>
 *    <td><code>months</code></td>
 *    <td>Months scroller</td>
 *    <td>vaadin-date-picker-overlay-content</td>
 *   </tr>
 *   <tr>
 *    <td><code>years</code></td>
 *    <td>Years scroller</td>
 *    <td>vaadin-date-picker-overlay-content</td>
 *   </tr>
 *   <tr>
 *    <td><code>toolbar</code></td>
 *    <td>Footer bar with buttons</td>
 *    <td>vaadin-date-picker-overlay-content</td>
 *   </tr>
 *   <tr>
 *    <td><code>today-button</code></td>
 *    <td>Today button</td>
 *    <td>vaadin-date-picker-overlay-content</td>
 *   </tr>
 *   <tr>
 *    <td><code>cancel-button</code></td>
 *    <td>Cancel button</td>
 *    <td>vaadin-date-picker-overlay-content</td>
 *   </tr>
 *   <tr>
 *    <td><code>month</code></td>
 *    <td>Month calendar</td>
 *    <td>vaadin-date-picker-overlay-content</td>
 *   </tr>
 *   <tr>
 *    <td><code>year-number</code></td>
 *    <td>Year number</td>
 *    <td>vaadin-date-picker-overlay-content</td>
 *   </tr>
 *   <tr>
 *    <td><code>year-separator</code></td>
 *    <td>Year separator</td>
 *    <td>vaadin-date-picker-overlay-content</td>
 *   </tr>
 *   <tr>
 *    <td><code>month-header</code></td>
 *    <td>Month title</td>
 *    <td>vaadin-month-calendar</td>
 *   </tr>
 *   <tr>
 *    <td><code>weekdays</code></td>
 *    <td>Weekday container</td>
 *    <td>vaadin-month-calendar</td>
 *   </tr>
 *   <tr>
 *    <td><code>weekday</code></td>
 *    <td>Weekday element</td>
 *    <td>vaadin-month-calendar</td>
 *   </tr>
 *   <tr>
 *    <td><code>week-numbers</code></td>
 *    <td>Week numbers container</td>
 *    <td>vaadin-month-calendar</td>
 *   </tr>
 *   <tr>
 *    <td><code>week-number</code></td>
 *    <td>Week number element</td>
 *    <td>vaadin-month-calendar</td>
 *   </tr>
 *   <tr>
 *    <td><code>date</code></td>
 *    <td>Date element</td>
 *    <td>vaadin-month-calendar</td>
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
 *    <td><code>invalid</code></td>
 *    <td>Set when the element is invalid</td>
 *    <td>:host</td>
 *   </tr>
 *   <tr>
 *    <td><code>opened</code></td>
 *    <td>Set when the date selector overlay is opened</td>
 *    <td>:host</td>
 *   </tr>
 *   <tr>
 *    <td><code>readonly</code></td>
 *    <td>Set when the element is readonly</td>
 *    <td>:host</td>
 *   </tr>
 *   <tr>
 *    <td><code>disabled</code></td>
 *    <td>Set when the element is disabled</td>
 *    <td>:host</td>
 *   </tr>
 *   <tr>
 *    <td><code>today</code></td>
 *    <td>Set on the date corresponding to the current day</td>
 *    <td>date</td>
 *   </tr>
 *   <tr>
 *    <td><code>focused</code></td>
 *    <td>Set on the focused date</td>
 *    <td>date</td>
 *   </tr>
 *   <tr>
 *    <td><code>disabled</code></td>
 *    <td>Set on the date out of the allowed range</td>
 *    <td>date</td>
 *   </tr>
 *   <tr>
 *    <td><code>selected</code></td>
 *    <td>Set on the selected date</td>
 *    <td>date</td>
 *   </tr>
 *  </tbody>
 * </table>
 * If you want to replace the default input field with a custom implementation, you should use the <a href="#vaadin-date-picker-light"><code>&lt;vaadin-date-picker-light&gt;</code></a> element.
 *
 * In addition to <code>&lt;vaadin-date-picker&gt;</code> itself, the following internal components are themable:
 *
 * <ul>
 *  <li><code>&lt;vaadin-text-field&gt;</code></li>
 *  <li><code>&lt;vaadin-date-picker-overlay&gt;</code></li>
 *  <li><code>&lt;vaadin-date-picker-overlay-content&gt;</code></li>
 *  <li><code>&lt;vaadin-month-calendar&gt;</code></li>
 * </ul>
 * Note: the <code>theme</code> attribute value set on <code>&lt;vaadin-date-picker&gt;</code> is propagated to the internal themable components listed above.
 *
 * <strong>Mixins:</strong> ElementMixin, ControlStateMixin, ThemableMixin, DatePickerMixin, GestureEventListeners, ElementMixin
 *
 * <h2>Example</h2>
 * <pre><code class="language-javascript">demo/index.html
 * </code></pre>
 */
@NpmPackage(name = "@vaadin/vaadin-date-picker", version = "^4.3.0-alpha3")
@Import(module = "@vaadin/vaadin-date-picker/vaadin-date-picker.js")
public interface DatePickerElement extends HTMLElement {

    // !wca! checkValidity: (): boolean
    /**
     * Returns true if the current input value satisfies all constraints (if any)
     *
     * Override the <code>checkValidity</code> method for custom validations.
     */
    @JSMethod("checkValidity")
    boolean checkValidity();

    // !wca! click: (): void
    /**
     */
    @JSMethod("click")
    void click();

    // !wca! close: (): void
    /**
     * Closes the dropdown.
     */
    @JSMethod("close")
    void close();

    // !wca! open: (): void
    /**
     * Opens the dropdown.
     */
    @JSMethod("open")
    void open();

    // !wca! validate: (): boolean
    /**
     * Returns true if <code>value</code> is valid, and sets the <code>invalid</code> flag appropriately.
     */
    @JSMethod("validate")
    boolean validate();

    // !wca! get autoOpenDisabled: boolean | null | undefined
    /**
     * Set true to prevent the overlay from opening automatically.
     */
    @JSProperty("autoOpenDisabled")
    boolean isAutoOpenDisabled();

    // !wca! set autoOpenDisabled: boolean | null | undefined
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

    // !wca! get i18n: DatePickerI18n

    // !wca! set i18n: DatePickerI18n
    /**
     * The object used to localize this component.
     * To change the default localization, replace the entire
     * <em>i18n</em> object or just the property you want to modify.
     *
     * The object has the following JSON structure and default values:
     *
     *  {
     *  // An array with the full names of months starting
     *  // with January.
     *  monthNames: [
     *  'January', 'February', 'March', 'April', 'May',
     *  'June', 'July', 'August', 'September',
     *  'October', 'November', 'December'
     *  ],
     *
     *  // An array of weekday names starting with Sunday. Used
     *  // in screen reader announcements.
     *  weekdays: [
     *  'Sunday', 'Monday', 'Tuesday', 'Wednesday',
     *  'Thursday', 'Friday', 'Saturday'
     *  ],
     *
     *  // An array of short weekday names starting with Sunday.
     *  // Displayed in the calendar.
     *  weekdaysShort: [
     *  'Sun', 'Mon', 'Tue', 'Wed', 'Thu', 'Fri', 'Sat'
     *  ],
     *
     *  // An integer indicating the first day of the week
     *  // (0 = Sunday, 1 = Monday, etc.).
     *  firstDayOfWeek: 0,
     *
     *  // Used in screen reader announcements along with week
     *  // numbers, if they are displayed.
     *  week: 'Week',
     *
     *  // Translation of the Calendar icon button title.
     *  calendar: 'Calendar',
     *
     *  // Translation of the Clear icon button title.
     *  clear: 'Clear',
     *
     *  // Translation of the Today shortcut button text.
     *  today: 'Today',
     *
     *  // Translation of the Cancel button text.
     *  cancel: 'Cancel',
     *
     *  // A function to format given <code>Object</code> as
     *  // date string. Object is in the format <code>{ day: ..., month: ..., year: ... }</code>
     *  // Note: The argument month is 0-based. This means that January = 0 and December = 11.
     *  formatDate: d =&gt; {
     *  // returns a string representation of the given
     *  // object in 'MM/DD/YYYY' -format
     *  },
     *
     *  // A function to parse the given text to an <code>Object</code> in the format <code>{ day: ..., month: ..., year: ... }</code>.
     *  // Must properly parse (at least) text formatted by <code>formatDate</code>.
     *  // Setting the property to null will disable keyboard input feature.
     *  // Note: The argument month is 0-based. This means that January = 0 and December = 11.
     *  parseDate: text =&gt; {
     *  // Parses a string in 'MM/DD/YY', 'MM/DD' or 'DD' -format to
     *  // an <code>Object</code> in the format <code>{ day: ..., month: ..., year: ... }</code>.
     *  }
     *
     *  // A function to format given <code>monthName</code> and
     *  // <code>fullYear</code> integer as calendar title string.
     *  formatTitle: (monthName, fullYear) =&gt; {
     *  return monthName + ' ' + fullYear;
     *  }
     *  }
     */
    @JSProperty("i18n")
    void setI18n(DatePickerI18n value);

    // !wca! get initialPosition: string | null | undefined
    /**
     * Date which should be visible when there is no value selected.
     *
     * The same date formats as for the <code>value</code> property are supported.
     */
    @JSProperty("initialPosition")
    @Nullable
    String getInitialPosition();

    // !wca! set initialPosition: string | null | undefined
    /**
     * Date which should be visible when there is no value selected.
     *
     * The same date formats as for the <code>value</code> property are supported.
     */
    @JSProperty("initialPosition")
    void setInitialPosition(@Nullable String value);

    // !wca! get invalid: boolean
    /**
     * This property is set to true when the control value invalid.
     */
    @JSProperty("invalid")
    boolean isInvalid();

    // !wca! set invalid: boolean
    /**
     * This property is set to true when the control value invalid.
     */
    @JSProperty("invalid")
    void setInvalid(boolean value);

    // !wca! get label: string | null | undefined
    /**
     * The label for this element.
     */
    @JSProperty("label")
    @Nullable
    String getLabel();

    // !wca! set label: string | null | undefined
    /**
     * The label for this element.
     */
    @JSProperty("label")
    void setLabel(@Nullable String value);

    // !wca! get max: string | undefined
    /**
     * The latest date that can be selected. All later dates will be disabled.
     *
     * Supported date formats:
     * - ISO 8601 <code>"YYYY-MM-DD"</code> (default)
     * - 6-digit extended ISO 8601 <code>"+YYYYYY-MM-DD"</code>, <code>"-YYYYYY-MM-DD"</code>
     */
    @JSProperty("max")
    @Nullable
    String getMax();

    // !wca! set max: string | undefined
    /**
     * The latest date that can be selected. All later dates will be disabled.
     *
     * Supported date formats:
     * - ISO 8601 <code>"YYYY-MM-DD"</code> (default)
     * - 6-digit extended ISO 8601 <code>"+YYYYYY-MM-DD"</code>, <code>"-YYYYYY-MM-DD"</code>
     */
    @JSProperty("max")
    void setMax(@Nullable String value);

    // !wca! get min: string | undefined
    /**
     * The earliest date that can be selected. All earlier dates will be disabled.
     *
     * Supported date formats:
     * - ISO 8601 <code>"YYYY-MM-DD"</code> (default)
     * - 6-digit extended ISO 8601 <code>"+YYYYYY-MM-DD"</code>, <code>"-YYYYYY-MM-DD"</code>
     */
    @JSProperty("min")
    @Nullable
    String getMin();

    // !wca! set min: string | undefined
    /**
     * The earliest date that can be selected. All earlier dates will be disabled.
     *
     * Supported date formats:
     * - ISO 8601 <code>"YYYY-MM-DD"</code> (default)
     * - 6-digit extended ISO 8601 <code>"+YYYYYY-MM-DD"</code>, <code>"-YYYYYY-MM-DD"</code>
     */
    @JSProperty("min")
    void setMin(@Nullable String value);

    // !wca! get name: string | null | undefined
    /**
     * The name of this element.
     */
    @JSProperty("name")
    @Nullable
    String getName();

    // !wca! set name: string | null | undefined
    /**
     * The name of this element.
     */
    @JSProperty("name")
    void setName(@Nullable String value);

    // !wca! get opened: boolean | null | undefined
    /**
     * Set true to open the date selector overlay.
     */
    @JSProperty("opened")
    boolean isOpened();

    // !wca! set opened: boolean | null | undefined
    /**
     * Set true to open the date selector overlay.
     */
    @JSProperty("opened")
    void setOpened(boolean value);

    // !wca! get placeholder: string
    /**
     * A placeholder string in addition to the label. If this is set, the label will always float.
     */
    @JSProperty("placeholder")
    String getPlaceholder();

    // !wca! set placeholder: string
    /**
     * A placeholder string in addition to the label. If this is set, the label will always float.
     */
    @JSProperty("placeholder")
    void setPlaceholder(String value);

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

    // !wca! get showWeekNumbers: boolean | null | undefined
    /**
     * Set true to display ISO-8601 week numbers in the calendar. Notice that
     * displaying week numbers is only supported when <code>i18n.firstDayOfWeek</code>
     * is 1 (Monday).
     */
    @JSProperty("showWeekNumbers")
    boolean isShowWeekNumbers();

    // !wca! set showWeekNumbers: boolean | null | undefined
    /**
     * Set true to display ISO-8601 week numbers in the calendar. Notice that
     * displaying week numbers is only supported when <code>i18n.firstDayOfWeek</code>
     * is 1 (Monday).
     */
    @JSProperty("showWeekNumbers")
    void setShowWeekNumbers(boolean value);

    // !wca! get theme: string | null | undefined

    // !wca! get value: string
    /**
     * The value for this element.
     *
     * Supported date formats:
     * - ISO 8601 <code>"YYYY-MM-DD"</code> (default)
     * - 6-digit extended ISO 8601 <code>"+YYYYYY-MM-DD"</code>, <code>"-YYYYYY-MM-DD"</code>
     */
    @JSProperty("value")
    String getValue();

    // !wca! set value: string
    /**
     * The value for this element.
     *
     * Supported date formats:
     * - ISO 8601 <code>"YYYY-MM-DD"</code> (default)
     * - 6-digit extended ISO 8601 <code>"+YYYYYY-MM-DD"</code>, <code>"-YYYYYY-MM-DD"</code>
     */
    @JSProperty("value")
    void setValue(String value);
}
