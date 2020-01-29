package js.lang;

import js.intl.DateTimeFormatOptions;
import org.teavm.jso.JSBody;
import org.teavm.jso.JSByRef;

/**
 * Enables basic storage and retrieval of dates and times.
 */
public interface JsDate extends Any {
    /**
     * Returns a string representation of a date. The format of the string depends on the locale.
     */
    String toString();

    /**
     * Returns a date as a string value.
     */
    String toDateString();

    /**
     * Returns a time as a string value.
     */
    String toTimeString();

    /**
     * Returns a value as a string value appropriate to the host environment's current locale.
     */
    String toLocaleString();

    /**
     * Converts a date and time to a string by using the current or specified locale.
     * @param locales A locale string or array of locale strings that contain one or more language or locale tags. If you include more than one locale string, list them in descending order of priority so that the first entry is the preferred locale. If you omit this parameter, the default locale of the JavaScript runtime is used.
     * @param options An object that contains one or more properties that specify comparison options.
     */
    String toLocaleString(String locales, DateTimeFormatOptions options);
    String toLocaleString(@JSByRef String[] locales, DateTimeFormatOptions options);
    String toLocaleString(String locales);
    String toLocaleString(@JSByRef String[] locales);

    /**
     * Returns a date as a string value appropriate to the host environment's current locale.
     */
    String toLocaleDateString();

    /**
     * Converts a date to a string by using the current or specified locale.
     * @param locales A locale string or array of locale strings that contain one or more language or locale tags. If you include more than one locale string, list them in descending order of priority so that the first entry is the preferred locale. If you omit this parameter, the default locale of the JavaScript runtime is used.
     * @param options An object that contains one or more properties that specify comparison options.
     */
    String toLocaleDateString(String locales, DateTimeFormatOptions options);
    String toLocaleDateString(@JSByRef String[] locales, DateTimeFormatOptions options);
    String toLocaleDateString(String locales);
    String toLocaleDateString(@JSByRef String[] locales);

    /**
     * Returns a time as a string value appropriate to the host environment's current locale.
     */
    String toLocaleTimeString();

    /**
     * Converts a time to a string by using the current or specified locale.
     * @param locales A locale string or array of locale strings that contain one or more language or locale tags. If you include more than one locale string, list them in descending order of priority so that the first entry is the preferred locale. If you omit this parameter, the default locale of the JavaScript runtime is used.
     * @param options An object that contains one or more properties that specify comparison options.
     */
    String toLocaleTimeString(String locales, DateTimeFormatOptions options);
    String toLocaleTimeString(@JSByRef String[] locales, DateTimeFormatOptions options);
    String toLocaleTimeString(String locales);
    String toLocaleTimeString(@JSByRef String[] locales);

    /**
     * Returns the stored time value in milliseconds since midnight, January 1, 1970 UTC.
     */
    int valueOf();

    /**
     * Gets the time value in milliseconds.
     */
    int getTime();

    /**
     * Gets the year, using local time.
     */
    int getFullYear();

    /**
     * Gets the year using Universal Coordinated Time (UTC).
     */
    int getUTCFullYear();

    /**
     * Gets the month, using local time.
     */
    int getMonth();

    /**
     * Gets the month of a Date object using Universal Coordinated Time (UTC).
     */
    int getUTCMonth();

    /**
     * Gets the day-of-the-month, using local time.
     */
    int getDate();

    /**
     * Gets the day-of-the-month, using Universal Coordinated Time (UTC).
     */
    int getUTCDate();

    /**
     * Gets the day of the week, using local time.
     */
    int getDay();

    /**
     * Gets the day of the week using Universal Coordinated Time (UTC).
     */
    int getUTCDay();

    /**
     * Gets the hours in a date, using local time.
     */
    int getHours();

    /**
     * Gets the hours value in a Date object using Universal Coordinated Time (UTC).
     */
    int getUTCHours();

    /**
     * Gets the minutes of a Date object, using local time.
     */
    int getMinutes();

    /**
     * Gets the minutes of a Date object using Universal Coordinated Time (UTC).
     */
    int getUTCMinutes();

    /**
     * Gets the seconds of a Date object, using local time.
     */
    int getSeconds();

    /**
     * Gets the seconds of a Date object using Universal Coordinated Time (UTC).
     */
    int getUTCSeconds();

    /**
     * Gets the milliseconds of a Date, using local time.
     */
    int getMilliseconds();

    /**
     * Gets the milliseconds of a Date object using Universal Coordinated Time (UTC).
     */
    int getUTCMilliseconds();

    /**
     * Gets the difference in minutes between the time on the local computer and Universal Coordinated Time (UTC).
     */
    int getTimezoneOffset();

    /**
     * Sets the date and time value in the Date object.
     *
     * @param time A numeric value representing the number of elapsed milliseconds since midnight, January 1, 1970 GMT.
     */
    int setTime(int time);

    /**
     * Sets the milliseconds value in the Date object using local time.
     *
     * @param ms A numeric value equal to the millisecond value.
     */
    int setMilliseconds(int ms);

    /**
     * Sets the milliseconds value in the Date object using Universal Coordinated Time (UTC).
     *
     * @param ms A numeric value equal to the millisecond value.
     */
    int setUTCMilliseconds(int ms);

    /**
     * Sets the seconds value in the Date object using local time.
     *
     * @param sec A numeric value equal to the seconds value.
     * @param ms  A numeric value equal to the milliseconds value.
     */
    int setSeconds(int sec, int ms);

    int setSeconds(int sec);

    /**
     * Sets the seconds value in the Date object using Universal Coordinated Time (UTC).
     *
     * @param sec A numeric value equal to the seconds value.
     * @param ms  A numeric value equal to the milliseconds value.
     */
    int setUTCSeconds(int sec, int ms);

    int setUTCSeconds(int sec);

    /**
     * Sets the minutes value in the Date object using local time.
     *
     * @param min A numeric value equal to the minutes value.
     * @param sec A numeric value equal to the seconds value.
     * @param ms  A numeric value equal to the milliseconds value.
     */
    int setMinutes(int min, int sec, int ms);

    int setMinutes(int min, int sec);

    int setMinutes(int min);

    /**
     * Sets the minutes value in the Date object using Universal Coordinated Time (UTC).
     *
     * @param min A numeric value equal to the minutes value.
     * @param sec A numeric value equal to the seconds value.
     * @param ms  A numeric value equal to the milliseconds value.
     */
    int setUTCMinutes(int min, int sec, int ms);

    int setUTCMinutes(int min, int sec);

    int setUTCMinutes(int min);

    /**
     * Sets the hour value in the Date object using local time.
     *
     * @param hours A numeric value equal to the hours value.
     * @param min   A numeric value equal to the minutes value.
     * @param sec   A numeric value equal to the seconds value.
     * @param ms    A numeric value equal to the milliseconds value.
     */
    int setHours(int hours, int min, int sec, int ms);

    int setHours(int hours, int min, int sec);

    int setHours(int hours, int min);

    int setHours(int hours);

    /**
     * Sets the hours value in the Date object using Universal Coordinated Time (UTC).
     *
     * @param hours A numeric value equal to the hours value.
     * @param min   A numeric value equal to the minutes value.
     * @param sec   A numeric value equal to the seconds value.
     * @param ms    A numeric value equal to the milliseconds value.
     */
    int setUTCHours(int hours, int min, int sec, int ms);

    int setUTCHours(int hours, int min, int sec);

    int setUTCHours(int hours, int min);

    int setUTCHours(int hours);

    /**
     * Sets the numeric day-of-the-month value of the Date object using local time.
     *
     * @param date A numeric value equal to the day of the month.
     */
    int setDate(int date);

    /**
     * Sets the numeric day of the month in the Date object using Universal Coordinated Time (UTC).
     *
     * @param date A numeric value equal to the day of the month.
     */
    int setUTCDate(int date);

    /**
     * Sets the month value in the Date object using local time.
     *
     * @param month A numeric value equal to the month. The value for January is 0, and other month values follow consecutively.
     * @param date  A numeric value representing the day of the month. If this value is not supplied, the value from a call to the getDate method is used.
     */
    int setMonth(int month, int date);

    int setMonth(int month);

    /**
     * Sets the month value in the Date object using Universal Coordinated Time (UTC).
     *
     * @param month A numeric value equal to the month. The value for January is 0, and other month values follow consecutively.
     * @param date  A numeric value representing the day of the month. If it is not supplied, the value from a call to the getUTCDate method is used.
     */
    int setUTCMonth(int month, int date);

    int setUTCMonth(int month);

    /**
     * Sets the year of the Date object using local time.
     *
     * @param year  A numeric value for the year.
     * @param month A zero-based numeric value for the month (0 for January, 11 for December). Must be specified if numDate is specified.
     * @param date  A numeric value equal for the day of the month.
     */
    int setFullYear(int year, int month, int date);

    int setFullYear(int year, int month);

    int setFullYear(int year);

    /**
     * Sets the year value in the Date object using Universal Coordinated Time (UTC).
     *
     * @param year  A numeric value equal to the year.
     * @param month A numeric value equal to the month. The value for January is 0, and other month values follow consecutively. Must be supplied if numDate is supplied.
     * @param date  A numeric value equal to the day of the month.
     */
    int setUTCFullYear(int year, int month, int date);

    int setUTCFullYear(int year, int month);

    int setUTCFullYear(int year);

    /**
     * Returns a date converted to a string using Universal Coordinated Time (UTC).
     */
    String toUTCString();

    /**
     * Returns a date as a string value in ISO format.
     */
    String toISOString();

    /**
     * Used by the JSON.stringify method to enable the transformation of an object's data for JavaScript Object Notation (JSON) serialization.
     */
    String toJSON(Any key);

    String toJSON();

    @JSBody(script = "return new Date()")
    static JsDate create() {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    @JSBody(params = "value", script = "return new Date(value)")
    static JsDate create(int value) {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    @JSBody(params = "value", script = "return new Date(value)")
    static JsDate create(double value) {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    @JSBody(params = "value", script = "return new Date(value)")
    static JsDate create(String value) {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    @JSBody(params = "value", script = "return new Date(value)")
    static JsDate create(JsDate value) {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    @JSBody(params = {"year", "month", "date", "hours", "minutes", "seconds", "ms"}, script = "return new Date(year,month,date,hours,minutes,seconds,ms)")
    static JsDate create(int year, int month, int date, int hours, int minutes, int seconds, int ms) {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    @JSBody(params = {"year", "month", "date", "hours", "minutes", "seconds"}, script = "return new Date(year,month,date,hours,minutes,seconds)")
    static JsDate create(int year, int month, int date, int hours, int minutes, int seconds) {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    @JSBody(params = {"year", "month", "date", "hours", "minutes"}, script = "return new Date(year,month,date,hours,minutes)")
    static JsDate create(int year, int month, int date, int hours, int minutes) {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    @JSBody(params = {"year", "month", "date", "hours"}, script = "return new Date(year,month,date,hours)")
    static JsDate create(int year, int month, int date, int hours) {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    @JSBody(params = {"year", "month", "date"}, script = "return new Date(year,month,date)")
    static JsDate create(int year, int month, int date) {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    @JSBody(params = {"year", "month"}, script = "return new Date(year,month)")
    static JsDate create(int year, int month) {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    @JSBody(script = "return Date.prototype")
    static JsDate prototype() {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    /**
     * Parses a string containing a date, and returns the number of milliseconds between that date and midnight, January 1, 1970.
     *
     * @param s A date string
     */
    @JSBody(params = "s", script = "return Date.parse(s)")
    static int parse(String s) {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    /**
     * Returns the number of milliseconds between midnight, January 1, 1970 Universal Coordinated Time (UTC) (or GMT) and the specified date.
     *
     * @param year    The full year designation is required for cross-century date accuracy. If year is between 0 and 99 is used, then year is assumed to be 1900 + year.
     * @param month   The month as a number between 0 and 11 (January to December).
     * @param date    The date as a number between 1 and 31.
     * @param hours   Must be supplied if minutes is supplied. A number from 0 to 23 (midnight to 11pm) that specifies the hour.
     * @param minutes Must be supplied if seconds is supplied. A number from 0 to 59 that specifies the minutes.
     * @param seconds Must be supplied if milliseconds is supplied. A number from 0 to 59 that specifies the seconds.
     * @param ms      A number from 0 to 999 that specifies the milliseconds.
     */
    @JSBody(params = {"year", "month", "date", "hours", "minutes", "seconds", "ms"}, script = "return Date.UTC(year,month,date,hours,minutes,seconds,ms)")
    static int UTC(int year, int month, int date, int hours, int minutes, int seconds, int ms) {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    @JSBody(params = {"year", "month", "date", "hours", "minutes", "seconds"}, script = "return Date.UTC(year,month,date,hours,minutes,seconds)")
    static int UTC(int year, int month, int date, int hours, int minutes, int seconds) {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    @JSBody(params = {"year", "month", "date", "hours", "minutes"}, script = "return Date.UTC(year,month,date,hours,minutes)")
    static int UTC(int year, int month, int date, int hours, int minutes) {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    @JSBody(params = {"year", "month", "date", "hours"}, script = "return Date.UTC(year,month,date,hours)")
    static int UTC(int year, int month, int date, int hours) {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    @JSBody(params = {"year", "month", "date"}, script = "return Date.UTC(year,month,date)")
    static int UTC(int year, int month, int date) {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    @JSBody(params = {"year", "month"}, script = "return Date.UTC(year,month)")
    static int UTC(int year, int month) {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    @JSBody(script = "return Date.now()")
    static int now() {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }
}
