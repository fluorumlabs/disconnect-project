package js.lang.external.vaadin.datepicker;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import js.lang.Any;
import js.web.dom.HTMLElement;
import org.teavm.jso.JSMethod;
import org.teavm.jso.JSProperty;

import javax.annotation.Nullable;

/**
 * <code>&lt;vaadin-date-picker-light&gt;</code> is a customizable version of the <code>&lt;vaadin-date-picker&gt;</code> providing only the scrollable month calendar view and leaving the input field definition to the user.
 *
 * To create a custom input field, you need to add a child element which has a two-way data-bindable property representing the input value. The property name is expected to be <code>bindValue</code> by default. See the example below for a simplest possible example using an <code>&lt;input&gt;</code> element extended with <code>iron-input</code>.
 *
 * <pre><code class="language-html">&lt;vaadin-date-picker-light&gt;
 *    &lt;iron-input&gt;
 *      &lt;input/&gt;
 *    &lt;/iron-input&gt;
 * &lt;/vaadin-date-picker-light&gt;
 * </code></pre>
 * If you are using other custom input fields like <code>&lt;paper-input&gt;</code>, you need to define the name of value property using the <code>attrForValue</code> property.
 *
 * <pre><code class="language-html">&lt;vaadin-date-picker-light attr-for-value="value"&gt;
 *    &lt;paper-input label="Birthday"&gt;
 *    &lt;/paper-input&gt;
 * &lt;/vaadin-date-picker-light&gt;
 * </code></pre>
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
 *    <td><code>overlay-content</code></td>
 *    <td>The overlay element</td>
 *    <td>vaadin-date-picker-light</td>
 *   </tr>
 *  </tbody>
 * </table>
 * See <a href="https://github.com/vaadin/vaadin-themable-mixin/wiki">ThemableMixin â€“ how to apply styles for shadow parts</a>
 *
 * In addition to <code>&lt;vaadin-date-picker-light&gt;</code> itself, the following internal components are themable:
 *
 * <ul>
 *  <li><code>&lt;vaadin-date-picker-overlay&gt;</code></li>
 *  <li><code>&lt;vaadin-date-picker-overlay-content&gt;</code></li>
 *  <li><code>&lt;vaadin-month-calendar&gt;</code></li>
 * </ul>
 * Note: the <code>theme</code> attribute value set on <code>&lt;vaadin-date-picker-light&gt;</code> is propagated to the internal themable components listed above.
 *
 * <strong>Mixins:</strong> ThemableMixin, DatePickerMixin, ElementMixin
 */
@NpmPackage(name = "@vaadin/vaadin-date-picker", version = "^4.3.0-alpha3")
@Import(module = "@vaadin/vaadin-date-picker/vaadin-date-picker-light.js")
public interface DatePickerLightElement extends HTMLElement {

    // !wca! checkValidity: (): boolean
    /**
     * Returns true if the current input value satisfies all constraints (if any)
     *
     * Override the <code>checkValidity</code> method for custom validations.
     */
    @JSMethod("checkValidity")
    boolean checkValidity();

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

    // !wca! get attrForValue: string
    /**
     * Name of the two-way data-bindable property representing the
     * value of the custom input field.
     */
    @JSProperty("attrForValue")
    String getAttrForValue();

    // !wca! set attrForValue: string
    /**
     * Name of the two-way data-bindable property representing the
     * value of the custom input field.
     */
    @JSProperty("attrForValue")
    void setAttrForValue(String value);

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
