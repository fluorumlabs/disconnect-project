package com.github.fluorumlabs.disconnect.vaadin.mixins;

import com.github.fluorumlabs.disconnect.vaadin.elements.mixins.DatePickerMixin;
import com.github.fluorumlabs.disconnect.vaadin.i18n.DatePickerI18n;
import com.github.fluorumlabs.disconnect.zero.component.Component;
import com.github.fluorumlabs.disconnect.zero.observable.ObservableEvent;
import js.web.dom.Event;

import javax.annotation.Nullable;

public interface HasDatePickerMixin<E extends DatePickerMixin, T extends Component<E>> extends Component<E> {
	/**
	 * The value for this element.
	 * <p>
	 * Supported date formats:
	 * - ISO 8601 `"YYYY-MM-DD"` (default)
	 * - 6-digit extended ISO 8601 `"+YYYYYY-MM-DD"`, `"-YYYYYY-MM-DD"`
	 */
	default String value() {
		return getNode().getValue();
	}

	/**
	 * The value for this element.
	 * <p>
	 * Supported date formats:
	 * - ISO 8601 `"YYYY-MM-DD"` (default)
	 * - 6-digit extended ISO 8601 `"+YYYYYY-MM-DD"`, `"-YYYYYY-MM-DD"`
	 */
	default T value(String value) {
		getNode().setValue(value);
		return (T) this;
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
	 * The same date formats as for the `value` property are supported.
	 */
	@Nullable
	default String initialPosition() {
		return getNode().getInitialPosition();
	}

	/**
	 * Date which should be visible when there is no value selected.
	 * <p>
	 * The same date formats as for the `value` property are supported.
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
	 * displaying week numbers is only supported when `i18n.firstDayOfWeek`
	 * is 1 (Monday).
	 */
	default boolean showWeekNumbers() {
		return getNode().isShowWeekNumbers();
	}

	/**
	 * Set true to display ISO-8601 week numbers in the calendar. Notice that
	 * displaying week numbers is only supported when `i18n.firstDayOfWeek`
	 * is 1 (Monday).
	 */
	default T showWeekNumbers(boolean showWeekNumbers) {
		getNode().setShowWeekNumbers(showWeekNumbers);
		return (T) this;
	}

	/**
	 * The object used to localize this component.
	 * To change the default localization, replace the entire
	 * _i18n_ object or just the property you want to modify.
	 * <p>
	 * The object has the following JSON structure and default values:
	 * <p>
	 * {
	 * // An array with the full names of months starting
	 * // with January.
	 * monthNames: [
	 * 'January', 'February', 'March', 'April', 'May',
	 * 'June', 'July', 'August', 'September',
	 * 'October', 'November', 'December'
	 * ],
	 * <p>
	 * // An array of weekday names starting with Sunday. Used
	 * // in screen reader announcements.
	 * weekdays: [
	 * 'Sunday', 'Monday', 'Tuesday', 'Wednesday',
	 * 'Thursday', 'Friday', 'Saturday'
	 * ],
	 * <p>
	 * // An array of short weekday names starting with Sunday.
	 * // Displayed in the calendar.
	 * weekdaysShort: [
	 * 'Sun', 'Mon', 'Tue', 'Wed', 'Thu', 'Fri', 'Sat'
	 * ],
	 * <p>
	 * // An integer indicating the first day of the week
	 * // (0 = Sunday, 1 = Monday, etc.).
	 * firstDayOfWeek: 0,
	 * <p>
	 * // Used in screen reader announcements along with week
	 * // numbers, if they are displayed.
	 * week: 'Week',
	 * <p>
	 * // Translation of the Calendar icon button title.
	 * calendar: 'Calendar',
	 * <p>
	 * // Translation of the Clear icon button title.
	 * clear: 'Clear',
	 * <p>
	 * // Translation of the Today shortcut button text.
	 * today: 'Today',
	 * <p>
	 * // Translation of the Cancel button text.
	 * cancel: 'Cancel',
	 * <p>
	 * // A function to format given `Object` as
	 * // date string. Object is in the format `{ day: ..., month: ..., year: ... }`
	 * // Note: The argument month is 0-based. This means that January = 0 and December = 11.
	 * formatDate: d => {
	 * // returns a string representation of the given
	 * // object in 'MM/DD/YYYY' -format
	 * },
	 * <p>
	 * // A function to parse the given text to an `Object` in the format `{ day: ..., month: ..., year: ... }`.
	 * // Must properly parse (at least) text formatted by `formatDate`.
	 * // Setting the property to null will disable keyboard input feature.
	 * // Note: The argument month is 0-based. This means that January = 0 and December = 11.
	 * parseDate: text => {
	 * // Parses a string in 'MM/DD/YY', 'MM/DD' or 'DD' -format to
	 * // an `Object` in the format `{ day: ..., month: ..., year: ... }`.
	 * }
	 * <p>
	 * // A function to format given `monthName` and
	 * // `fullYear` integer as calendar title string.
	 * formatTitle: (monthName, fullYear) => {
	 * return monthName + ' ' + fullYear;
	 * }
	 * }
	 */
	@Nullable
	default DatePickerI18n i18n() {
		return getNode().getI18n();
	}

	/**
	 * The object used to localize this component.
	 * To change the default localization, replace the entire
	 * _i18n_ object or just the property you want to modify.
	 * <p>
	 * The object has the following JSON structure and default values:
	 * <p>
	 * {
	 * // An array with the full names of months starting
	 * // with January.
	 * monthNames: [
	 * 'January', 'February', 'March', 'April', 'May',
	 * 'June', 'July', 'August', 'September',
	 * 'October', 'November', 'December'
	 * ],
	 * <p>
	 * // An array of weekday names starting with Sunday. Used
	 * // in screen reader announcements.
	 * weekdays: [
	 * 'Sunday', 'Monday', 'Tuesday', 'Wednesday',
	 * 'Thursday', 'Friday', 'Saturday'
	 * ],
	 * <p>
	 * // An array of short weekday names starting with Sunday.
	 * // Displayed in the calendar.
	 * weekdaysShort: [
	 * 'Sun', 'Mon', 'Tue', 'Wed', 'Thu', 'Fri', 'Sat'
	 * ],
	 * <p>
	 * // An integer indicating the first day of the week
	 * // (0 = Sunday, 1 = Monday, etc.).
	 * firstDayOfWeek: 0,
	 * <p>
	 * // Used in screen reader announcements along with week
	 * // numbers, if they are displayed.
	 * week: 'Week',
	 * <p>
	 * // Translation of the Calendar icon button title.
	 * calendar: 'Calendar',
	 * <p>
	 * // Translation of the Clear icon button title.
	 * clear: 'Clear',
	 * <p>
	 * // Translation of the Today shortcut button text.
	 * today: 'Today',
	 * <p>
	 * // Translation of the Cancel button text.
	 * cancel: 'Cancel',
	 * <p>
	 * // A function to format given `Object` as
	 * // date string. Object is in the format `{ day: ..., month: ..., year: ... }`
	 * // Note: The argument month is 0-based. This means that January = 0 and December = 11.
	 * formatDate: d => {
	 * // returns a string representation of the given
	 * // object in 'MM/DD/YYYY' -format
	 * },
	 * <p>
	 * // A function to parse the given text to an `Object` in the format `{ day: ..., month: ..., year: ... }`.
	 * // Must properly parse (at least) text formatted by `formatDate`.
	 * // Setting the property to null will disable keyboard input feature.
	 * // Note: The argument month is 0-based. This means that January = 0 and December = 11.
	 * parseDate: text => {
	 * // Parses a string in 'MM/DD/YY', 'MM/DD' or 'DD' -format to
	 * // an `Object` in the format `{ day: ..., month: ..., year: ... }`.
	 * }
	 * <p>
	 * // A function to format given `monthName` and
	 * // `fullYear` integer as calendar title string.
	 * formatTitle: (monthName, fullYear) => {
	 * return monthName + ' ' + fullYear;
	 * }
	 * }
	 */
	default T i18n(DatePickerI18n i18n) {
		getNode().setI18n(i18n);
		return (T) this;
	}

	/**
	 * The earliest date that can be selected. All earlier dates will be disabled.
	 * <p>
	 * Supported date formats:
	 * - ISO 8601 `"YYYY-MM-DD"` (default)
	 * - 6-digit extended ISO 8601 `"+YYYYYY-MM-DD"`, `"-YYYYYY-MM-DD"`
	 */
	default String min() {
		return getNode().getMin();
	}

	/**
	 * The earliest date that can be selected. All earlier dates will be disabled.
	 * <p>
	 * Supported date formats:
	 * - ISO 8601 `"YYYY-MM-DD"` (default)
	 * - 6-digit extended ISO 8601 `"+YYYYYY-MM-DD"`, `"-YYYYYY-MM-DD"`
	 */
	default T min(String min) {
		getNode().setMin(min);
		return (T) this;
	}

	/**
	 * The latest date that can be selected. All later dates will be disabled.
	 * <p>
	 * Supported date formats:
	 * - ISO 8601 `"YYYY-MM-DD"` (default)
	 * - 6-digit extended ISO 8601 `"+YYYYYY-MM-DD"`, `"-YYYYYY-MM-DD"`
	 */
	default String max() {
		return getNode().getMax();
	}

	/**
	 * The latest date that can be selected. All later dates will be disabled.
	 * <p>
	 * Supported date formats:
	 * - ISO 8601 `"YYYY-MM-DD"` (default)
	 * - 6-digit extended ISO 8601 `"+YYYYYY-MM-DD"`, `"-YYYYYY-MM-DD"`
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
	 * Returns true if `value` is valid, and sets the `invalid` flag appropriately.
	 *
	 * @param value Value to validate. Optional, defaults to user's input value.
	 *
	 * @return True if the value is valid and sets the `invalid` flag appropriately
	 */
	default boolean validate(String value) {
		return getNode().validate(value);
	}

	/**
	 * Returns true if the current input value satisfies all constraints (if any)
	 * <p>
	 * Override the `checkValidity` method for custom validations.
	 *
	 * @param value Value to validate. Optional, defaults to the selected date.
	 *
	 * @return True if the value is valid
	 */
	default boolean checkValidity(String value) {
		return getNode().checkValidity(value);
	}

	/**
	 * Fired when the user commits a value change.
	 */
	default ObservableEvent<Event> ChangeEvent() {
		return createEvent("change");
	}
}
