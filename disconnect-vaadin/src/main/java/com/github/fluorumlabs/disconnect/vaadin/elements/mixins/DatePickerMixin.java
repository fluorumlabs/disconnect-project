package com.github.fluorumlabs.disconnect.vaadin.elements.mixins;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import com.github.fluorumlabs.disconnect.vaadin.Vaadin;
import com.github.fluorumlabs.disconnect.vaadin.i18n.DatePickerI18n;
import js.web.dom.Element;
import org.teavm.jso.JSProperty;

import javax.annotation.Nullable;

@NpmPackage(
		name = "@vaadin/vaadin",
		version = Vaadin.VERSION
)
@Import(
		symbols = "DatePickerMixin",
		module = "@vaadin/vaadin-date-picker/src/vaadin-date-picker-mixin.js"
)
public interface DatePickerMixin extends Element {
	/**
	 * The value for this element.
	 * <p>
	 * Supported date formats:
	 *
	 * <ul>
	 * <li>ISO 8601 <code>&quot;YYYY-MM-DD&quot;</code> (default)</li>
	 * <li>6-digit extended ISO 8601 <code>&quot;+YYYYYY-MM-DD&quot;</code>, <code>&quot;-YYYYYY-MM-DD&quot;
	 * </code></li>
	 * </ul>
	 */
	@JSProperty
	String getValue();

	/**
	 * The value for this element.
	 * <p>
	 * Supported date formats:
	 *
	 * <ul>
	 * <li>ISO 8601 <code>&quot;YYYY-MM-DD&quot;</code> (default)</li>
	 * <li>6-digit extended ISO 8601 <code>&quot;+YYYYYY-MM-DD&quot;</code>, <code>&quot;-YYYYYY-MM-DD&quot;
	 * </code></li>
	 * </ul>
	 */
	@JSProperty
	void setValue(String value);

	/**
	 * Set to true to mark the input as required.
	 */
	@JSProperty
	boolean isRequired();

	/**
	 * Set to true to mark the input as required.
	 */
	@JSProperty
	void setRequired(boolean required);

	/**
	 * The name of this element.
	 */
	@Nullable
	@JSProperty
	String getName();

	/**
	 * The name of this element.
	 */
	@JSProperty
	void setName(String name);

	/**
	 * Date which should be visible when there is no value selected.
	 * <p>
	 * The same date formats as for the <code>value</code> property are supported.
	 */
	@Nullable
	@JSProperty
	String getInitialPosition();

	/**
	 * Date which should be visible when there is no value selected.
	 * <p>
	 * The same date formats as for the <code>value</code> property are supported.
	 */
	@JSProperty
	void setInitialPosition(String initialPosition);

	/**
	 * The label for this element.
	 */
	@Nullable
	@JSProperty
	String getLabel();

	/**
	 * The label for this element.
	 */
	@JSProperty
	void setLabel(String label);

	/**
	 * Set true to open the date selector overlay.
	 */
	@JSProperty
	boolean isOpened();

	/**
	 * Set true to open the date selector overlay.
	 */
	@JSProperty
	void setOpened(boolean opened);

	/**
	 * Set true to display ISO-8601 week numbers in the calendar. Notice that
	 * displaying week numbers is only supported when <code>i18n.firstDayOfWeek</code>
	 * is 1 (Monday).
	 */
	@JSProperty
	boolean isShowWeekNumbers();

	/**
	 * Set true to display ISO-8601 week numbers in the calendar. Notice that
	 * displaying week numbers is only supported when <code>i18n.firstDayOfWeek</code>
	 * is 1 (Monday).
	 */
	@JSProperty
	void setShowWeekNumbers(boolean showWeekNumbers);

	/**
	 * The object used to localize this component.
	 * To change the default localization, replace the entire
	 * <em>i18n</em> object or just the property you want to modify.
	 * <p>
	 * The object has the following JSON structure and default values:
	 *
	 * <pre><code>      {
	 *         // An array with the full names of months starting
	 *         // with January.
	 *         monthNames: [
	 *           'January', 'February', 'March', 'April', 'May',
	 *           'June', 'July', 'August', 'September',
	 *           'October', 'November', 'December'
	 *         ],
	 *
	 *         // An array of weekday names starting with Sunday. Used
	 *         // in screen reader announcements.
	 *         weekdays: [
	 *           'Sunday', 'Monday', 'Tuesday', 'Wednesday',
	 *           'Thursday', 'Friday', 'Saturday'
	 *         ],
	 *
	 *         // An array of short weekday names starting with Sunday.
	 *         // Displayed in the calendar.
	 *         weekdaysShort: [
	 *           'Sun', 'Mon', 'Tue', 'Wed', 'Thu', 'Fri', 'Sat'
	 *         ],
	 *
	 *         // An integer indicating the first day of the week
	 *         // (0 = Sunday, 1 = Monday, etc.).
	 *         firstDayOfWeek: 0,
	 *
	 *         // Used in screen reader announcements along with week
	 *         // numbers, if they are displayed.
	 *         week: 'Week',
	 *
	 *         // Translation of the Calendar icon button title.
	 *         calendar: 'Calendar',
	 *
	 *         // Translation of the Clear icon button title.
	 *         clear: 'Clear',
	 *
	 *         // Translation of the Today shortcut button text.
	 *         today: 'Today',
	 *
	 *         // Translation of the Cancel button text.
	 *         cancel: 'Cancel',
	 *
	 *         // A function to format given `Object` as
	 *         // date string. Object is in the format `{ day: ..., month: ..., year: ... }`
	 *         // Note: The argument month is 0-based. This means that January = 0 and December = 11.
	 *         formatDate: d =&gt; {
	 *           // returns a string representation of the given
	 *           // object in 'MM/DD/YYYY' -format
	 *         },
	 *
	 *         // A function to parse the given text to an `Object` in the format `{ day: ..., month: ..., year: ...
	 *         }`.
	 *         // Must properly parse (at least) text formatted by `formatDate`.
	 *         // Setting the property to null will disable keyboard input feature.
	 *         // Note: The argument month is 0-based. This means that January = 0 and December = 11.
	 *         parseDate: text =&gt; {
	 *           // Parses a string in 'MM/DD/YY', 'MM/DD' or 'DD' -format to
	 *           // an `Object` in the format `{ day: ..., month: ..., year: ... }`.
	 *         }
	 *
	 *         // A function to format given `monthName` and
	 *         // `fullYear` integer as calendar title string.
	 *         formatTitle: (monthName, fullYear) =&gt; {
	 *           return monthName + ' ' + fullYear;
	 *         }
	 *       }
	 * </code></pre>
	 */
	@Nullable
	@JSProperty
	DatePickerI18n getI18n();

	/**
	 * The object used to localize this component.
	 * To change the default localization, replace the entire
	 * <em>i18n</em> object or just the property you want to modify.
	 * <p>
	 * The object has the following JSON structure and default values:
	 *
	 * <pre><code>      {
	 *         // An array with the full names of months starting
	 *         // with January.
	 *         monthNames: [
	 *           'January', 'February', 'March', 'April', 'May',
	 *           'June', 'July', 'August', 'September',
	 *           'October', 'November', 'December'
	 *         ],
	 *
	 *         // An array of weekday names starting with Sunday. Used
	 *         // in screen reader announcements.
	 *         weekdays: [
	 *           'Sunday', 'Monday', 'Tuesday', 'Wednesday',
	 *           'Thursday', 'Friday', 'Saturday'
	 *         ],
	 *
	 *         // An array of short weekday names starting with Sunday.
	 *         // Displayed in the calendar.
	 *         weekdaysShort: [
	 *           'Sun', 'Mon', 'Tue', 'Wed', 'Thu', 'Fri', 'Sat'
	 *         ],
	 *
	 *         // An integer indicating the first day of the week
	 *         // (0 = Sunday, 1 = Monday, etc.).
	 *         firstDayOfWeek: 0,
	 *
	 *         // Used in screen reader announcements along with week
	 *         // numbers, if they are displayed.
	 *         week: 'Week',
	 *
	 *         // Translation of the Calendar icon button title.
	 *         calendar: 'Calendar',
	 *
	 *         // Translation of the Clear icon button title.
	 *         clear: 'Clear',
	 *
	 *         // Translation of the Today shortcut button text.
	 *         today: 'Today',
	 *
	 *         // Translation of the Cancel button text.
	 *         cancel: 'Cancel',
	 *
	 *         // A function to format given `Object` as
	 *         // date string. Object is in the format `{ day: ..., month: ..., year: ... }`
	 *         // Note: The argument month is 0-based. This means that January = 0 and December = 11.
	 *         formatDate: d =&gt; {
	 *           // returns a string representation of the given
	 *           // object in 'MM/DD/YYYY' -format
	 *         },
	 *
	 *         // A function to parse the given text to an `Object` in the format `{ day: ..., month: ..., year: ...
	 *         }`.
	 *         // Must properly parse (at least) text formatted by `formatDate`.
	 *         // Setting the property to null will disable keyboard input feature.
	 *         // Note: The argument month is 0-based. This means that January = 0 and December = 11.
	 *         parseDate: text =&gt; {
	 *           // Parses a string in 'MM/DD/YY', 'MM/DD' or 'DD' -format to
	 *           // an `Object` in the format `{ day: ..., month: ..., year: ... }`.
	 *         }
	 *
	 *         // A function to format given `monthName` and
	 *         // `fullYear` integer as calendar title string.
	 *         formatTitle: (monthName, fullYear) =&gt; {
	 *           return monthName + ' ' + fullYear;
	 *         }
	 *       }
	 * </code></pre>
	 */
	@JSProperty
	void setI18n(DatePickerI18n i18n);

	/**
	 * The earliest date that can be selected. All earlier dates will be disabled.
	 * <p>
	 * Supported date formats:
	 *
	 * <ul>
	 * <li>ISO 8601 <code>&quot;YYYY-MM-DD&quot;</code> (default)</li>
	 * <li>6-digit extended ISO 8601 <code>&quot;+YYYYYY-MM-DD&quot;</code>, <code>&quot;-YYYYYY-MM-DD&quot;
	 * </code></li>
	 * </ul>
	 */
	@JSProperty
	String getMin();

	/**
	 * The earliest date that can be selected. All earlier dates will be disabled.
	 * <p>
	 * Supported date formats:
	 *
	 * <ul>
	 * <li>ISO 8601 <code>&quot;YYYY-MM-DD&quot;</code> (default)</li>
	 * <li>6-digit extended ISO 8601 <code>&quot;+YYYYYY-MM-DD&quot;</code>, <code>&quot;-YYYYYY-MM-DD&quot;
	 * </code></li>
	 * </ul>
	 */
	@JSProperty
	void setMin(String min);

	/**
	 * The latest date that can be selected. All later dates will be disabled.
	 * <p>
	 * Supported date formats:
	 *
	 * <ul>
	 * <li>ISO 8601 <code>&quot;YYYY-MM-DD&quot;</code> (default)</li>
	 * <li>6-digit extended ISO 8601 <code>&quot;+YYYYYY-MM-DD&quot;</code>, <code>&quot;-YYYYYY-MM-DD&quot;
	 * </code></li>
	 * </ul>
	 */
	@JSProperty
	String getMax();

	/**
	 * The latest date that can be selected. All later dates will be disabled.
	 * <p>
	 * Supported date formats:
	 *
	 * <ul>
	 * <li>ISO 8601 <code>&quot;YYYY-MM-DD&quot;</code> (default)</li>
	 * <li>6-digit extended ISO 8601 <code>&quot;+YYYYYY-MM-DD&quot;</code>, <code>&quot;-YYYYYY-MM-DD&quot;
	 * </code></li>
	 * </ul>
	 */
	@JSProperty
	void setMax(String max);

	/**
	 * Opens the dropdown.
	 */
	void open();

	/**
	 * Closes the dropdown.
	 */
	void close();

	/**
	 * Returns true if <code>value</code> is valid, and sets the <code>invalid</code> flag appropriately.
	 *
	 * @param value Value to validate. Optional, defaults to user's input value.
	 *
	 * @return True if the value is valid and sets the <code>invalid</code> flag appropriately
	 */
	boolean validate(String value);

	/**
	 * Returns true if the current input value satisfies all constraints (if any)
	 * <p>
	 * Override the <code>checkValidity</code> method for custom validations.
	 *
	 * @param value Value to validate. Optional, defaults to the selected date.
	 *
	 * @return True if the value is valid
	 */
	boolean checkValidity(String value);
}
