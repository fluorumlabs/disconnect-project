package js.lang.external.vaadin.vaadin_date_picker;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import java.lang.String;
import javax.annotation.Nullable;
import js.lang.Any;
import org.teavm.jso.JSProperty;

@NpmPackage(
    name = "@vaadin/vaadin-date-picker",
    version = "^4.3.0-alpha3"
)
@Import(
    module = "@vaadin/vaadin-date-picker/src/vaadin-date-picker-mixin.js"
)
public interface DatePickerMixin extends Any {
  /**
   * The value for this element.
   *
   * Supported date formats:
   *
   * <ul>
   * <li>ISO 8601 <code>&quot;YYYY-MM-DD&quot;</code> (default)</li>
   * <li>6-digit extended ISO 8601 <code>&quot;+YYYYYY-MM-DD&quot;</code>, <code>&quot;-YYYYYY-MM-DD&quot;</code></li>
   * </ul>
   */
  @JSProperty("value")
  String getValue();

  /**
   * The value for this element.
   *
   * Supported date formats:
   *
   * <ul>
   * <li>ISO 8601 <code>&quot;YYYY-MM-DD&quot;</code> (default)</li>
   * <li>6-digit extended ISO 8601 <code>&quot;+YYYYYY-MM-DD&quot;</code>, <code>&quot;-YYYYYY-MM-DD&quot;</code></li>
   * </ul>
   */
  @JSProperty("value")
  void setValue(String value);

  /**
   * Set to true to mark the input as required.
   *
   */
  @JSProperty("required")
  boolean getRequired();

  /**
   * Set to true to mark the input as required.
   *
   */
  @JSProperty("required")
  void setRequired(boolean value);

  /**
   * The name of this element.
   *
   */
  @JSProperty("name")
  @Nullable
  String getName();

  /**
   * The name of this element.
   *
   */
  @JSProperty("name")
  void setName(@Nullable String value);

  /**
   * Date which should be visible when there is no value selected.
   *
   * The same date formats as for the <code>value</code> property are supported.
   *
   */
  @JSProperty("initialPosition")
  @Nullable
  String getInitialPosition();

  /**
   * Date which should be visible when there is no value selected.
   *
   * The same date formats as for the <code>value</code> property are supported.
   *
   */
  @JSProperty("initialPosition")
  void setInitialPosition(@Nullable String value);

  /**
   * The label for this element.
   *
   */
  @JSProperty("label")
  @Nullable
  String getLabel();

  /**
   * The label for this element.
   *
   */
  @JSProperty("label")
  void setLabel(@Nullable String value);

  /**
   * Set true to open the date selector overlay.
   *
   */
  @JSProperty("opened")
  boolean getOpened();

  /**
   * Set true to open the date selector overlay.
   *
   */
  @JSProperty("opened")
  void setOpened(boolean value);

  /**
   * Set true to prevent the overlay from opening automatically.
   *
   */
  @JSProperty("autoOpenDisabled")
  boolean getAutoOpenDisabled();

  /**
   * Set true to prevent the overlay from opening automatically.
   *
   */
  @JSProperty("autoOpenDisabled")
  void setAutoOpenDisabled(boolean value);

  /**
   * Set true to display ISO-8601 week numbers in the calendar. Notice that
   * displaying week numbers is only supported when <code>i18n.firstDayOfWeek</code>
   * is 1 (Monday).
   *
   */
  @JSProperty("showWeekNumbers")
  boolean getShowWeekNumbers();

  /**
   * Set true to display ISO-8601 week numbers in the calendar. Notice that
   * displaying week numbers is only supported when <code>i18n.firstDayOfWeek</code>
   * is 1 (Monday).
   *
   */
  @JSProperty("showWeekNumbers")
  void setShowWeekNumbers(boolean value);

  /**
   * The object used to localize this component.
   * To change the default localization, replace the entire
   * <em>i18n</em> object or just the property you want to modify.
   *
   * The object has the following JSON structure and default values:
   *
   * <pre><code>       {
   *          // An array with the full names of months starting
   *          // with January.
   *          monthNames: [
   *            'January', 'February', 'March', 'April', 'May',
   *            'June', 'July', 'August', 'September',
   *            'October', 'November', 'December'
   *          ],
   *
   *          // An array of weekday names starting with Sunday. Used
   *          // in screen reader announcements.
   *          weekdays: [
   *            'Sunday', 'Monday', 'Tuesday', 'Wednesday',
   *            'Thursday', 'Friday', 'Saturday'
   *          ],
   *
   *          // An array of short weekday names starting with Sunday.
   *          // Displayed in the calendar.
   *          weekdaysShort: [
   *            'Sun', 'Mon', 'Tue', 'Wed', 'Thu', 'Fri', 'Sat'
   *          ],
   *
   *          // An integer indicating the first day of the week
   *          // (0 = Sunday, 1 = Monday, etc.).
   *          firstDayOfWeek: 0,
   *
   *          // Used in screen reader announcements along with week
   *          // numbers, if they are displayed.
   *          week: 'Week',
   *
   *          // Translation of the Calendar icon button title.
   *          calendar: 'Calendar',
   *
   *          // Translation of the Clear icon button title.
   *          clear: 'Clear',
   *
   *          // Translation of the Today shortcut button text.
   *          today: 'Today',
   *
   *          // Translation of the Cancel button text.
   *          cancel: 'Cancel',
   *
   *          // A function to format given `Object` as
   *          // date string. Object is in the format `{ day: ..., month: ..., year: ... }`
   *          // Note: The argument month is 0-based. This means that January = 0 and December = 11.
   *          formatDate: d =&gt; {
   *            // returns a string representation of the given
   *            // object in 'MM/DD/YYYY' -format
   *          },
   *
   *          // A function to parse the given text to an `Object` in the format `{ day: ..., month: ..., year: ... }`.
   *          // Must properly parse (at least) text formatted by `formatDate`.
   *          // Setting the property to null will disable keyboard input feature.
   *          // Note: The argument month is 0-based. This means that January = 0 and December = 11.
   *          parseDate: text =&gt; {
   *            // Parses a string in 'MM/DD/YY', 'MM/DD' or 'DD' -format to
   *            // an `Object` in the format `{ day: ..., month: ..., year: ... }`.
   *          }
   *
   *          // A function to format given `monthName` and
   *          // `fullYear` integer as calendar title string.
   *          formatTitle: (monthName, fullYear) =&gt; {
   *            return monthName + ' ' + fullYear;
   *          }
   *        }
   * </code></pre>
   */
  @JSProperty("i18n")
  DatePickerI18n getI18n();

  /**
   * The object used to localize this component.
   * To change the default localization, replace the entire
   * <em>i18n</em> object or just the property you want to modify.
   *
   * The object has the following JSON structure and default values:
   *
   * <pre><code>       {
   *          // An array with the full names of months starting
   *          // with January.
   *          monthNames: [
   *            'January', 'February', 'March', 'April', 'May',
   *            'June', 'July', 'August', 'September',
   *            'October', 'November', 'December'
   *          ],
   *
   *          // An array of weekday names starting with Sunday. Used
   *          // in screen reader announcements.
   *          weekdays: [
   *            'Sunday', 'Monday', 'Tuesday', 'Wednesday',
   *            'Thursday', 'Friday', 'Saturday'
   *          ],
   *
   *          // An array of short weekday names starting with Sunday.
   *          // Displayed in the calendar.
   *          weekdaysShort: [
   *            'Sun', 'Mon', 'Tue', 'Wed', 'Thu', 'Fri', 'Sat'
   *          ],
   *
   *          // An integer indicating the first day of the week
   *          // (0 = Sunday, 1 = Monday, etc.).
   *          firstDayOfWeek: 0,
   *
   *          // Used in screen reader announcements along with week
   *          // numbers, if they are displayed.
   *          week: 'Week',
   *
   *          // Translation of the Calendar icon button title.
   *          calendar: 'Calendar',
   *
   *          // Translation of the Clear icon button title.
   *          clear: 'Clear',
   *
   *          // Translation of the Today shortcut button text.
   *          today: 'Today',
   *
   *          // Translation of the Cancel button text.
   *          cancel: 'Cancel',
   *
   *          // A function to format given `Object` as
   *          // date string. Object is in the format `{ day: ..., month: ..., year: ... }`
   *          // Note: The argument month is 0-based. This means that January = 0 and December = 11.
   *          formatDate: d =&gt; {
   *            // returns a string representation of the given
   *            // object in 'MM/DD/YYYY' -format
   *          },
   *
   *          // A function to parse the given text to an `Object` in the format `{ day: ..., month: ..., year: ... }`.
   *          // Must properly parse (at least) text formatted by `formatDate`.
   *          // Setting the property to null will disable keyboard input feature.
   *          // Note: The argument month is 0-based. This means that January = 0 and December = 11.
   *          parseDate: text =&gt; {
   *            // Parses a string in 'MM/DD/YY', 'MM/DD' or 'DD' -format to
   *            // an `Object` in the format `{ day: ..., month: ..., year: ... }`.
   *          }
   *
   *          // A function to format given `monthName` and
   *          // `fullYear` integer as calendar title string.
   *          formatTitle: (monthName, fullYear) =&gt; {
   *            return monthName + ' ' + fullYear;
   *          }
   *        }
   * </code></pre>
   */
  @JSProperty("i18n")
  void setI18n(DatePickerI18n value);

  /**
   * The earliest date that can be selected. All earlier dates will be disabled.
   *
   * Supported date formats:
   *
   * <ul>
   * <li>ISO 8601 <code>&quot;YYYY-MM-DD&quot;</code> (default)</li>
   * <li>6-digit extended ISO 8601 <code>&quot;+YYYYYY-MM-DD&quot;</code>, <code>&quot;-YYYYYY-MM-DD&quot;</code></li>
   * </ul>
   */
  @JSProperty("min")
  @Nullable
  String getMin();

  /**
   * The earliest date that can be selected. All earlier dates will be disabled.
   *
   * Supported date formats:
   *
   * <ul>
   * <li>ISO 8601 <code>&quot;YYYY-MM-DD&quot;</code> (default)</li>
   * <li>6-digit extended ISO 8601 <code>&quot;+YYYYYY-MM-DD&quot;</code>, <code>&quot;-YYYYYY-MM-DD&quot;</code></li>
   * </ul>
   */
  @JSProperty("min")
  void setMin(@Nullable String value);

  /**
   * The latest date that can be selected. All later dates will be disabled.
   *
   * Supported date formats:
   *
   * <ul>
   * <li>ISO 8601 <code>&quot;YYYY-MM-DD&quot;</code> (default)</li>
   * <li>6-digit extended ISO 8601 <code>&quot;+YYYYYY-MM-DD&quot;</code>, <code>&quot;-YYYYYY-MM-DD&quot;</code></li>
   * </ul>
   */
  @JSProperty("max")
  @Nullable
  String getMax();

  /**
   * The latest date that can be selected. All later dates will be disabled.
   *
   * Supported date formats:
   *
   * <ul>
   * <li>ISO 8601 <code>&quot;YYYY-MM-DD&quot;</code> (default)</li>
   * <li>6-digit extended ISO 8601 <code>&quot;+YYYYYY-MM-DD&quot;</code>, <code>&quot;-YYYYYY-MM-DD&quot;</code></li>
   * </ul>
   */
  @JSProperty("max")
  void setMax(@Nullable String value);

  /**
   * The latest date that can be selected. All later dates will be disabled.
   *
   */
  void ready();

  /**
   * Opens the dropdown.
   *
   */
  void open();

  /**
   * Closes the dropdown.
   *
   */
  void close();

  /**
   * Returns true if <code>value</code> is valid, and sets the <code>invalid</code> flag appropriately.
   *
   * @return True if the value is valid and sets the <code>invalid</code> flag appropriately
   *
   */
  boolean validate();

  /**
   * Returns true if the current input value satisfies all constraints (if any)
   *
   * Override the <code>checkValidity</code> method for custom validations.
   *
   * @return True if the value is valid
   *
   */
  boolean checkValidity();
}
