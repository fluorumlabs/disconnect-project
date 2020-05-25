package com.github.fluorumlabs.disconnect.vaadin.mixins;

import com.github.fluorumlabs.disconnect.vaadin.elements.mixins.DatePickerMixin;
import com.github.fluorumlabs.disconnect.vaadin.i18n.DatePickerI18n;
import com.github.fluorumlabs.disconnect.zero.component.HasElement;
import com.github.fluorumlabs.disconnect.zero.observable.ObservableValue;
import js.lang.JsDate;

import javax.annotation.Nullable;
import java.util.Date;

public interface HasDatePickerMixin<E extends DatePickerMixin, T extends HasElement<E>> extends HasElement<E> {
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
	default ObservableValue<Date> value() {
		return createObservableValue(
				() -> {
					return new Date(Math.round(JsDate.parse(getNode().getValue())));
				},
				date -> {
					JsDate jsDate = JsDate.create(date.getTime());
					getNode().setValue(jsDate.toISOString().substring(0, 10));
				},
				"value-changed"
		);
	}

	/**
	 * Set to true to mark the input as required.
	 */
	default boolean required() {
		return getNode().isRequired();
	}

	/**
	 * Set to true to mark the input as required.
	 */
	default T required(boolean required) {
		getNode().setRequired(required);
		return (T) this;
	}

	/**
	 * The name of this element.
	 */
	@Nullable
	default String name() {
		return getNode().getName();
	}

	/**
	 * The name of this element.
	 */
	default T name(String name) {
		getNode().setName(name);
		return (T) this;
	}

	/**
	 * Date which should be visible when there is no value selected.
	 * <p>
	 * The same date formats as for the <code>value</code> property are supported.
	 */
	@Nullable
	default String initialPosition() {
		return getNode().getInitialPosition();
	}

	/**
	 * Date which should be visible when there is no value selected.
	 * <p>
	 * The same date formats as for the <code>value</code> property are supported.
	 */
	default T initialPosition(String initialPosition) {
		getNode().setInitialPosition(initialPosition);
		return (T) this;
	}

	/**
	 * The label for this element.
	 */
	@Nullable
	default String label() {
		return getNode().getLabel();
	}

	/**
	 * The label for this element.
	 */
	default T label(String label) {
		getNode().setLabel(label);
		return (T) this;
	}

	/**
	 * Set true to open the date selector overlay.
	 */
	default boolean opened() {
		return getNode().isOpened();
	}

	/**
	 * Set true to open the date selector overlay.
	 */
	default T opened(boolean opened) {
		getNode().setOpened(opened);
		return (T) this;
	}

	/**
	 * Set true to display ISO-8601 week numbers in the calendar. Notice that
	 * displaying week numbers is only supported when <code>i18n.firstDayOfWeek</code>
	 * is 1 (Monday).
	 */
	default boolean showWeekNumbers() {
		return getNode().isShowWeekNumbers();
	}

	/**
	 * Set true to display ISO-8601 week numbers in the calendar. Notice that
	 * displaying week numbers is only supported when <code>i18n.firstDayOfWeek</code>
	 * is 1 (Monday).
	 */
	default T showWeekNumbers(boolean showWeekNumbers) {
		getNode().setShowWeekNumbers(showWeekNumbers);
		return (T) this;
	}

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
	default DatePickerI18n i18n() {
		return getNode().getI18n();
	}

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
	default T i18n(DatePickerI18n i18n) {
		getNode().setI18n(i18n);
		return (T) this;
	}

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
	default String min() {
		return getNode().getMin();
	}

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
	default T min(String min) {
		getNode().setMin(min);
		return (T) this;
	}

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
	default String max() {
		return getNode().getMax();
	}

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
	default T max(String max) {
		getNode().setMax(max);
		return (T) this;
	}

	/**
	 * Opens the dropdown.
	 */
	default void open() {
		getNode().open();
	}

	/**
	 * Closes the dropdown.
	 */
	default void close() {
		getNode().close();
	}

	/**
	 * Returns true if <code>value</code> is valid, and sets the <code>invalid</code> flag appropriately.
	 *
	 * @param value Value to validate. Optional, defaults to user's input value.
	 *
	 * @return True if the value is valid and sets the <code>invalid</code> flag appropriately
	 */
	default boolean validate(String value) {
		return getNode().validate(value);
	}

	/**
	 * Returns true if the current input value satisfies all constraints (if any)
	 * <p>
	 * Override the <code>checkValidity</code> method for custom validations.
	 *
	 * @param value Value to validate. Optional, defaults to the selected date.
	 *
	 * @return True if the value is valid
	 */
	default boolean checkValidity(String value) {
		return getNode().checkValidity(value);
	}

}
