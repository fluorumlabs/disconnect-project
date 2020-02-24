package js.lang;

import js.intl.DateTimeFormatOptions;
import org.teavm.jso.JSBody;

/**
 * Enables basic storage and retrieval of dates and times.
 */
public interface JsDate extends Any {
	/**
	 * Create js date.
	 *
	 * @return the js date
	 */
	@JSBody(script = "return new Date()")
    static JsDate create() {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

	/**
	 * Create js date.
	 *
	 * @param value the value
	 *
	 * @return the js date
	 */
	@JSBody(params = "value", script = "return new Date(value)")
    static JsDate create(int value) {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

	/**
	 * Create js date.
	 *
	 * @param value the value
	 *
	 * @return the js date
	 */
	@JSBody(params = "value", script = "return new Date(value)")
    static JsDate create(double value) {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

	/**
	 * Create js date.
	 *
	 * @param value the value
	 *
	 * @return the js date
	 */
	@JSBody(params = "value", script = "return new Date(value)")
    static JsDate create(String value) {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

	/**
	 * Create js date.
	 *
	 * @param value the value
	 *
	 * @return the js date
	 */
	@JSBody(params = "value", script = "return new Date(value)")
    static JsDate create(JsDate value) {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

	/**
	 * Create js date.
	 *
	 * @param year    the year
	 * @param month   the month
	 * @param date    the date
	 * @param hours   the hours
	 * @param minutes the minutes
	 * @param seconds the seconds
	 * @param ms      the ms
	 *
	 * @return the js date
	 */
	@JSBody(params = {"year", "month", "date", "hours", "minutes", "seconds", "ms"}, script = "return new Date(year,month,date,hours,minutes,seconds,ms)")
    static JsDate create(int year, int month, int date, int hours, int minutes, int seconds, int ms) {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

	/**
	 * Create js date.
	 *
	 * @param year    the year
	 * @param month   the month
	 * @param date    the date
	 * @param hours   the hours
	 * @param minutes the minutes
	 * @param seconds the seconds
	 *
	 * @return the js date
	 */
	@JSBody(params = {"year", "month", "date", "hours", "minutes", "seconds"}, script = "return new Date(year,month,date,hours,minutes,seconds)")
    static JsDate create(int year, int month, int date, int hours, int minutes, int seconds) {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

	/**
	 * Create js date.
	 *
	 * @param year    the year
	 * @param month   the month
	 * @param date    the date
	 * @param hours   the hours
	 * @param minutes the minutes
	 *
	 * @return the js date
	 */
	@JSBody(params = {"year", "month", "date", "hours", "minutes"}, script = "return new Date(year,month,date,hours,minutes)")
    static JsDate create(int year, int month, int date, int hours, int minutes) {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

	/**
	 * Create js date.
	 *
	 * @param year  the year
	 * @param month the month
	 * @param date  the date
	 * @param hours the hours
	 *
	 * @return the js date
	 */
	@JSBody(params = {"year", "month", "date", "hours"}, script = "return new Date(year,month,date,hours)")
    static JsDate create(int year, int month, int date, int hours) {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

	/**
	 * Create js date.
	 *
	 * @param year  the year
	 * @param month the month
	 * @param date  the date
	 *
	 * @return the js date
	 */
	@JSBody(params = {"year", "month", "date"}, script = "return new Date(year,month,date)")
    static JsDate create(int year, int month, int date) {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

	/**
	 * Create js date.
	 *
	 * @param year  the year
	 * @param month the month
	 *
	 * @return the js date
	 */
	@JSBody(params = {"year", "month"}, script = "return new Date(year,month)")
    static JsDate create(int year, int month) {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

	/**
	 * Prototype js date.
	 *
	 * @return the js date
	 */
	@JSBody(script = "return Date.prototype")
    static JsDate prototype() {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

	/**
	 * Parses a string containing a date, and returns the number of milliseconds between that date and midnight,
	 * January 1, 1970.
	 *
	 * @param s A date string
	 *
	 * @return the double
	 */
	@JSBody(params = "s", script = "return Date.parse(s)")
    static double parse(String s) {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

	/**
	 * Returns the number of milliseconds between midnight, January 1, 1970 Universal Coordinated Time (UTC) (or GMT)
	 * and the specified date.
	 *
	 * @param year    The full year designation is required for cross-century date accuracy. If year is between 0 and
	 *                   99 is used, then year is assumed to be 1900 + year.
	 * @param month   The month as a number between 0 and 11 (January to December).
	 * @param date    The date as a number between 1 and 31.
	 * @param hours   Must be supplied if minutes is supplied. A number from 0 to 23 (midnight to 11pm) that specifies
	 *                  the hour.
	 * @param minutes Must be supplied if seconds is supplied. A number from 0 to 59 that specifies the minutes.
	 * @param seconds Must be supplied if milliseconds is supplied. A number from 0 to 59 that specifies the seconds.
	 * @param ms      A number from 0 to 999 that specifies the milliseconds.
	 *
	 * @return the double
	 */
	@JSBody(params = {"year", "month", "date", "hours", "minutes", "seconds", "ms"}, script = "return Date.UTC(year,month,date,hours,minutes,seconds,ms)")
    static double UTC(int year, int month, int date, int hours, int minutes, int seconds, int ms) {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

	/**
	 * Utc double.
	 *
	 * @param year    the year
	 * @param month   the month
	 * @param date    the date
	 * @param hours   the hours
	 * @param minutes the minutes
	 * @param seconds the seconds
	 *
	 * @return the double
	 */
	@JSBody(params = {"year", "month", "date", "hours", "minutes", "seconds"}, script = "return Date.UTC(year,month,date,hours,minutes,seconds)")
    static double UTC(int year, int month, int date, int hours, int minutes, int seconds) {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

	/**
	 * Utc double.
	 *
	 * @param year    the year
	 * @param month   the month
	 * @param date    the date
	 * @param hours   the hours
	 * @param minutes the minutes
	 *
	 * @return the double
	 */
	@JSBody(params = {"year", "month", "date", "hours", "minutes"}, script = "return Date.UTC(year,month,date,hours,minutes)")
    static double UTC(int year, int month, int date, int hours, int minutes) {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

	/**
	 * Utc double.
	 *
	 * @param year  the year
	 * @param month the month
	 * @param date  the date
	 * @param hours the hours
	 *
	 * @return the double
	 */
	@JSBody(params = {"year", "month", "date", "hours"}, script = "return Date.UTC(year,month,date,hours)")
    static double UTC(int year, int month, int date, int hours) {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

	/**
	 * Utc double.
	 *
	 * @param year  the year
	 * @param month the month
	 * @param date  the date
	 *
	 * @return the double
	 */
	@JSBody(params = {"year", "month", "date"}, script = "return Date.UTC(year,month,date)")
    static double UTC(int year, int month, int date) {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

	/**
	 * Utc double.
	 *
	 * @param year  the year
	 * @param month the month
	 *
	 * @return the double
	 */
	@JSBody(params = {"year", "month"}, script = "return Date.UTC(year,month)")
    static double UTC(int year, int month) {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

	/**
	 * Now double.
	 *
	 * @return the double
	 */
	@JSBody(script = "return Date.now()")
    static double now() {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    /**
     * Returns a string representation of a date. The format of the string depends on the locale.
     */
    String toString();

	/**
	 * Returns a date as a string value.
	 *
	 * @return the string
	 */
	String toDateString();

	/**
	 * Returns a time as a string value.
	 *
	 * @return the string
	 */
	String toTimeString();

	/**
	 * Returns a value as a string value appropriate to the host environment's current locale.
	 *
	 * @return the string
	 */
	String toLocaleString();

	/**
	 * Converts a date and time to a string by using the current or specified locale.
	 *
	 * @param locales A locale string or array of locale strings that contain one or more language or locale tags. If
	 *                   you include more than one locale string, list them in descending order of priority so that
	 *                   the first entry is the preferred locale. If you omit this parameter, the default locale of
	 *                   the JavaScript runtime is used.
	 * @param options An object that contains one or more properties that specify comparison options.
	 *
	 * @return the string
	 */
	String toLocaleString(String locales, DateTimeFormatOptions options);

	/**
	 * To locale string string.
	 *
	 * @param locales the locales
	 * @param options the options
	 *
	 * @return the string
	 */
	String toLocaleString(String[] locales, DateTimeFormatOptions options);

	/**
	 * To locale string string.
	 *
	 * @param locales the locales
	 *
	 * @return the string
	 */
	String toLocaleString(String locales);

	/**
	 * To locale string string.
	 *
	 * @param locales the locales
	 *
	 * @return the string
	 */
	String toLocaleString(String[] locales);

	/**
	 * Returns a date as a string value appropriate to the host environment's current locale.
	 *
	 * @return the string
	 */
	String toLocaleDateString();

	/**
	 * Converts a date to a string by using the current or specified locale.
	 *
	 * @param locales A locale string or array of locale strings that contain one or more language or locale tags. If
	 *                   you include more than one locale string, list them in descending order of priority so that
	 *                   the first entry is the preferred locale. If you omit this parameter, the default locale of
	 *                   the JavaScript runtime is used.
	 * @param options An object that contains one or more properties that specify comparison options.
	 *
	 * @return the string
	 */
	String toLocaleDateString(String locales, DateTimeFormatOptions options);

	/**
	 * To locale date string string.
	 *
	 * @param locales the locales
	 * @param options the options
	 *
	 * @return the string
	 */
	String toLocaleDateString(String[] locales, DateTimeFormatOptions options);

	/**
	 * To locale date string string.
	 *
	 * @param locales the locales
	 *
	 * @return the string
	 */
	String toLocaleDateString(String locales);

	/**
	 * To locale date string string.
	 *
	 * @param locales the locales
	 *
	 * @return the string
	 */
	String toLocaleDateString(String[] locales);

	/**
	 * Returns a time as a string value appropriate to the host environment's current locale.
	 *
	 * @return the string
	 */
	String toLocaleTimeString();

	/**
	 * Converts a time to a string by using the current or specified locale.
	 *
	 * @param locales A locale string or array of locale strings that contain one or more language or locale tags. If
	 *                   you include more than one locale string, list them in descending order of priority so that
	 *                   the first entry is the preferred locale. If you omit this parameter, the default locale of
	 *                   the JavaScript runtime is used.
	 * @param options An object that contains one or more properties that specify comparison options.
	 *
	 * @return the string
	 */
	String toLocaleTimeString(String locales, DateTimeFormatOptions options);

	/**
	 * To locale time string string.
	 *
	 * @param locales the locales
	 * @param options the options
	 *
	 * @return the string
	 */
	String toLocaleTimeString(String[] locales, DateTimeFormatOptions options);

	/**
	 * To locale time string string.
	 *
	 * @param locales the locales
	 *
	 * @return the string
	 */
	String toLocaleTimeString(String locales);

	/**
	 * To locale time string string.
	 *
	 * @param locales the locales
	 *
	 * @return the string
	 */
	String toLocaleTimeString(String[] locales);

	/**
	 * Returns the stored time value in milliseconds since midnight, January 1, 1970 UTC.
	 *
	 * @return the double
	 */
	double valueOf();

	/**
	 * Gets the time value in milliseconds.
	 *
	 * @return the time
	 */
	double getTime();

	/**
	 * Gets the year, using local time.
	 *
	 * @return the full year
	 */
	int getFullYear();

	/**
	 * Gets the year using Universal Coordinated Time (UTC).
	 *
	 * @return the utc full year
	 */
	int getUTCFullYear();

	/**
	 * Gets the month, using local time.
	 *
	 * @return the month
	 */
	int getMonth();

	/**
	 * Gets the month of a Date object using Universal Coordinated Time (UTC).
	 *
	 * @return the utc month
	 */
	int getUTCMonth();

	/**
	 * Gets the day-of-the-month, using local time.
	 *
	 * @return the date
	 */
	int getDate();

	/**
	 * Gets the day-of-the-month, using Universal Coordinated Time (UTC).
	 *
	 * @return the utc date
	 */
	int getUTCDate();

	/**
	 * Gets the day of the week, using local time.
	 *
	 * @return the day
	 */
	int getDay();

	/**
	 * Gets the day of the week using Universal Coordinated Time (UTC).
	 *
	 * @return the utc day
	 */
	int getUTCDay();

	/**
	 * Gets the hours in a date, using local time.
	 *
	 * @return the hours
	 */
	int getHours();

	/**
	 * Gets the hours value in a Date object using Universal Coordinated Time (UTC).
	 *
	 * @return the utc hours
	 */
	int getUTCHours();

	/**
	 * Gets the minutes of a Date object, using local time.
	 *
	 * @return the minutes
	 */
	int getMinutes();

	/**
	 * Gets the minutes of a Date object using Universal Coordinated Time (UTC).
	 *
	 * @return the utc minutes
	 */
	int getUTCMinutes();

	/**
	 * Gets the seconds of a Date object, using local time.
	 *
	 * @return the seconds
	 */
	int getSeconds();

	/**
	 * Gets the seconds of a Date object using Universal Coordinated Time (UTC).
	 *
	 * @return the utc seconds
	 */
	int getUTCSeconds();

	/**
	 * Gets the milliseconds of a Date, using local time.
	 *
	 * @return the milliseconds
	 */
	int getMilliseconds();

	/**
	 * Gets the milliseconds of a Date object using Universal Coordinated Time (UTC).
	 *
	 * @return the utc milliseconds
	 */
	int getUTCMilliseconds();

	/**
	 * Gets the difference in minutes between the time on the local computer and Universal Coordinated Time (UTC).
	 *
	 * @return the timezone offset
	 */
	int getTimezoneOffset();

	/**
	 * Sets the date and time value in the Date object.
	 *
	 * @param time A numeric value representing the number of elapsed milliseconds since midnight, January 1, 1970 GMT.
	 *
	 * @return the time
	 */
	int setTime(double time);

	/**
	 * Sets the milliseconds value in the Date object using local time.
	 *
	 * @param ms A numeric value equal to the millisecond value.
	 *
	 * @return the milliseconds
	 */
	int setMilliseconds(double ms);

	/**
	 * Sets the milliseconds value in the Date object using Universal Coordinated Time (UTC).
	 *
	 * @param ms A numeric value equal to the millisecond value.
	 *
	 * @return the utc milliseconds
	 */
	int setUTCMilliseconds(double ms);

	/**
	 * Sets the seconds value in the Date object using local time.
	 *
	 * @param sec A numeric value equal to the seconds value.
	 * @param ms  A numeric value equal to the milliseconds value.
	 *
	 * @return the seconds
	 */
	int setSeconds(int sec, int ms);

	/**
	 * Sets seconds.
	 *
	 * @param sec the sec
	 *
	 * @return the seconds
	 */
	int setSeconds(int sec);

	/**
	 * Sets the seconds value in the Date object using Universal Coordinated Time (UTC).
	 *
	 * @param sec A numeric value equal to the seconds value.
	 * @param ms  A numeric value equal to the milliseconds value.
	 *
	 * @return the utc seconds
	 */
	int setUTCSeconds(int sec, int ms);

	/**
	 * Sets utc seconds.
	 *
	 * @param sec the sec
	 *
	 * @return the utc seconds
	 */
	int setUTCSeconds(int sec);

	/**
	 * Sets the minutes value in the Date object using local time.
	 *
	 * @param min A numeric value equal to the minutes value.
	 * @param sec A numeric value equal to the seconds value.
	 * @param ms  A numeric value equal to the milliseconds value.
	 *
	 * @return the minutes
	 */
	int setMinutes(int min, int sec, int ms);

	/**
	 * Sets minutes.
	 *
	 * @param min the min
	 * @param sec the sec
	 *
	 * @return the minutes
	 */
	int setMinutes(int min, int sec);

	/**
	 * Sets minutes.
	 *
	 * @param min the min
	 *
	 * @return the minutes
	 */
	int setMinutes(int min);

	/**
	 * Sets the minutes value in the Date object using Universal Coordinated Time (UTC).
	 *
	 * @param min A numeric value equal to the minutes value.
	 * @param sec A numeric value equal to the seconds value.
	 * @param ms  A numeric value equal to the milliseconds value.
	 *
	 * @return the utc minutes
	 */
	int setUTCMinutes(int min, int sec, int ms);

	/**
	 * Sets utc minutes.
	 *
	 * @param min the min
	 * @param sec the sec
	 *
	 * @return the utc minutes
	 */
	int setUTCMinutes(int min, int sec);

	/**
	 * Sets utc minutes.
	 *
	 * @param min the min
	 *
	 * @return the utc minutes
	 */
	int setUTCMinutes(int min);

	/**
	 * Sets the hour value in the Date object using local time.
	 *
	 * @param hours A numeric value equal to the hours value.
	 * @param min   A numeric value equal to the minutes value.
	 * @param sec   A numeric value equal to the seconds value.
	 * @param ms    A numeric value equal to the milliseconds value.
	 *
	 * @return the hours
	 */
	int setHours(int hours, int min, int sec, int ms);

	/**
	 * Sets hours.
	 *
	 * @param hours the hours
	 * @param min   the min
	 * @param sec   the sec
	 *
	 * @return the hours
	 */
	int setHours(int hours, int min, int sec);

	/**
	 * Sets hours.
	 *
	 * @param hours the hours
	 * @param min   the min
	 *
	 * @return the hours
	 */
	int setHours(int hours, int min);

	/**
	 * Sets hours.
	 *
	 * @param hours the hours
	 *
	 * @return the hours
	 */
	int setHours(int hours);

	/**
	 * Sets the hours value in the Date object using Universal Coordinated Time (UTC).
	 *
	 * @param hours A numeric value equal to the hours value.
	 * @param min   A numeric value equal to the minutes value.
	 * @param sec   A numeric value equal to the seconds value.
	 * @param ms    A numeric value equal to the milliseconds value.
	 *
	 * @return the utc hours
	 */
	int setUTCHours(int hours, int min, int sec, int ms);

	/**
	 * Sets utc hours.
	 *
	 * @param hours the hours
	 * @param min   the min
	 * @param sec   the sec
	 *
	 * @return the utc hours
	 */
	int setUTCHours(int hours, int min, int sec);

	/**
	 * Sets utc hours.
	 *
	 * @param hours the hours
	 * @param min   the min
	 *
	 * @return the utc hours
	 */
	int setUTCHours(int hours, int min);

	/**
	 * Sets utc hours.
	 *
	 * @param hours the hours
	 *
	 * @return the utc hours
	 */
	int setUTCHours(int hours);

	/**
	 * Sets the numeric day-of-the-month value of the Date object using local time.
	 *
	 * @param date A numeric value equal to the day of the month.
	 *
	 * @return the date
	 */
	int setDate(int date);

	/**
	 * Sets the numeric day of the month in the Date object using Universal Coordinated Time (UTC).
	 *
	 * @param date A numeric value equal to the day of the month.
	 *
	 * @return the utc date
	 */
	int setUTCDate(int date);

	/**
	 * Sets the month value in the Date object using local time.
	 *
	 * @param month A numeric value equal to the month. The value for January is 0, and other month values follow
	 *                 consecutively.
	 * @param date  A numeric value representing the day of the month. If this value is not supplied, the value from a
	 *                call to the getDate method is used.
	 *
	 * @return the month
	 */
	int setMonth(int month, int date);

	/**
	 * Sets month.
	 *
	 * @param month the month
	 *
	 * @return the month
	 */
	int setMonth(int month);

	/**
	 * Sets the month value in the Date object using Universal Coordinated Time (UTC).
	 *
	 * @param month A numeric value equal to the month. The value for January is 0, and other month values follow
	 *                 consecutively.
	 * @param date  A numeric value representing the day of the month. If it is not supplied, the value from a call to
	 *                the getUTCDate method is used.
	 *
	 * @return the utc month
	 */
	int setUTCMonth(int month, int date);

	/**
	 * Sets utc month.
	 *
	 * @param month the month
	 *
	 * @return the utc month
	 */
	int setUTCMonth(int month);

	/**
	 * Sets the year of the Date object using local time.
	 *
	 * @param year  A numeric value for the year.
	 * @param month A zero-based numeric value for the month (0 for January, 11 for December). Must be specified if
	 *                 numDate is specified.
	 * @param date  A numeric value equal for the day of the month.
	 *
	 * @return the full year
	 */
	int setFullYear(int year, int month, int date);

	/**
	 * Sets full year.
	 *
	 * @param year  the year
	 * @param month the month
	 *
	 * @return the full year
	 */
	int setFullYear(int year, int month);

	/**
	 * Sets full year.
	 *
	 * @param year the year
	 *
	 * @return the full year
	 */
	int setFullYear(int year);

	/**
	 * Sets the year value in the Date object using Universal Coordinated Time (UTC).
	 *
	 * @param year  A numeric value equal to the year.
	 * @param month A numeric value equal to the month. The value for January is 0, and other month values follow
	 *                 consecutively. Must be supplied if numDate is supplied.
	 * @param date  A numeric value equal to the day of the month.
	 *
	 * @return the utc full year
	 */
	int setUTCFullYear(int year, int month, int date);

	/**
	 * Sets utc full year.
	 *
	 * @param year  the year
	 * @param month the month
	 *
	 * @return the utc full year
	 */
	int setUTCFullYear(int year, int month);

	/**
	 * Sets utc full year.
	 *
	 * @param year the year
	 *
	 * @return the utc full year
	 */
	int setUTCFullYear(int year);

	/**
	 * Returns a date converted to a string using Universal Coordinated Time (UTC).
	 *
	 * @return the string
	 */
	String toUTCString();

	/**
	 * Returns a date as a string value in ISO format.
	 *
	 * @return the string
	 */
	String toISOString();

	/**
	 * Used by the JSON.stringify method to enable the transformation of an object's data for JavaScript Object
	 * Notation (JSON) serialization.
	 *
	 * @param key the key
	 *
	 * @return the string
	 */
	String toJSON(Any key);

	/**
	 * To json string.
	 *
	 * @return the string
	 */
	String toJSON();
}
