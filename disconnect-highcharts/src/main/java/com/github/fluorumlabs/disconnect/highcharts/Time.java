package com.github.fluorumlabs.disconnect.highcharts;

import java.lang.String;
import java.lang.UnsupportedOperationException;
import js.lang.Any;
import org.teavm.jso.JSBody;

/**
 * The Time class. Time settings are applied in general for each page using
 * <code>Highcharts.setOptions</code>, or individually for each Chart item through the time
 * options set.
 *
 * The Time object is available from Highcharts.Chart#time, which refers to
 * <code>Highcharts.time</code> if no individual time settings are applied.
 *
 */
public interface Time extends Any {
  /**
   * The Time class. Time settings are applied in general for each page using
   * <code>Highcharts.setOptions</code>, or individually for each Chart item through the
   * time options set.
   *
   * The Time object is available from Highcharts.Chart#time, which refers to
   * <code>Highcharts.time</code> if no individual time settings are applied.
   *
   * @param options
   * Time options as defined in chart.options.time.
   *
   * @see <a href="https://api.highcharts.com/class-reference/Highcharts.Time#constructor">https://api.highcharts.com/class-reference/Highcharts.Time#constructor</a>
   *
   * @implspec constructor(options: TimeOptions);
   *
   */
  @JSBody(
      params = {"options"},
      script = "return new Time(options)"
  )
  static Time create(TimeOptions options) {
    throw new UnsupportedOperationException("Available only in JavaScript");
  }

  /**
   * Formats a JavaScript date timestamp (milliseconds since Jan 1st 1970)
   * into a human readable date string. The format is a subset of the formats
   * for PHP's strftime function. Additional formats can be given in the
   * Highcharts.dateFormats hook.
   *
   * @param timestamp
   * The JavaScript timestamp.
   *
   * @param capitalize
   * Upper case first letter in the return.
   *
   * @return The formatted date.
   *
   * @see <a href="https://api.highcharts.com/class-reference/Highcharts.Time#dateFormat">https://api.highcharts.com/class-reference/Highcharts.Time#dateFormat</a>
   *
   * @implspec dateFormat(timestamp: number, capitalize?: boolean): string;
   *
   */
  String dateFormat(double timestamp);

  /**
   * Formats a JavaScript date timestamp (milliseconds since Jan 1st 1970)
   * into a human readable date string. The format is a subset of the formats
   * for PHP's strftime function. Additional formats can be given in the
   * Highcharts.dateFormats hook.
   *
   * @param timestamp
   * The JavaScript timestamp.
   *
   * @param capitalize
   * Upper case first letter in the return.
   *
   * @return The formatted date.
   *
   * @see <a href="https://api.highcharts.com/class-reference/Highcharts.Time#dateFormat">https://api.highcharts.com/class-reference/Highcharts.Time#dateFormat</a>
   *
   * @implspec dateFormat(timestamp: number, capitalize?: boolean): string;
   *
   */
  String dateFormat(double timestamp, boolean capitalize);

  /**
   * Formats a JavaScript date timestamp (milliseconds since Jan 1st 1970)
   * into a human readable date string. The format is a subset of the formats
   * for PHP's strftime function. Additional formats can be given in the
   * Highcharts.dateFormats hook.
   *
   * @param format
   * The desired format where various time representations are prefixed
   * with %.
   *
   * @param timestamp
   * The JavaScript timestamp.
   *
   * @param capitalize
   * Upper case first letter in the return.
   *
   * @return The formatted date.
   *
   * @see <a href="https://api.highcharts.com/class-reference/Highcharts.Time#dateFormat">https://api.highcharts.com/class-reference/Highcharts.Time#dateFormat</a>
   *
   * @implspec dateFormat(format: string, timestamp: number, capitalize?: boolean): string;
   *
   */
  String dateFormat(String format, double timestamp, boolean capitalize);

  /**
   * Formats a JavaScript date timestamp (milliseconds since Jan 1st 1970)
   * into a human readable date string. The format is a subset of the formats
   * for PHP's strftime function. Additional formats can be given in the
   * Highcharts.dateFormats hook.
   *
   * @param format
   * The desired format where various time representations are prefixed
   * with %.
   *
   * @param timestamp
   * The JavaScript timestamp.
   *
   * @param capitalize
   * Upper case first letter in the return.
   *
   * @return The formatted date.
   *
   * @see <a href="https://api.highcharts.com/class-reference/Highcharts.Time#dateFormat">https://api.highcharts.com/class-reference/Highcharts.Time#dateFormat</a>
   *
   * @implspec dateFormat(format: string, timestamp: number, capitalize?: boolean): string;
   *
   */
  String dateFormat(String format, double timestamp);

  /**
   * Return an array with time positions distributed on round time values
   * right and right after min and max. Used in datetime axes as well as for
   * grouping data on a datetime axis.
   *
   * @param normalizedInterval
   * The interval in axis values (ms) and the count
   *
   * @param min
   * The minimum in axis values
   *
   * @param max
   * The maximum in axis values
   *
   * @implspec getTimeTicks(normalizedInterval: NormalizedIntervalObject, min?: number, max?: number, startOfWeek?: number): TimeTicksObject;
   *
   */
  TimeTicksObject getTimeTicks(NormalizedIntervalObject normalizedInterval, double min, double max);

  /**
   * Return an array with time positions distributed on round time values
   * right and right after min and max. Used in datetime axes as well as for
   * grouping data on a datetime axis.
   *
   * @param normalizedInterval
   * The interval in axis values (ms) and the count
   *
   * @param min
   * The minimum in axis values
   *
   * @param max
   * The maximum in axis values
   *
   * @implspec getTimeTicks(normalizedInterval: NormalizedIntervalObject, min?: number, max?: number, startOfWeek?: number): TimeTicksObject;
   *
   */
  TimeTicksObject getTimeTicks(NormalizedIntervalObject normalizedInterval, double min, double max,
      double startOfWeek);

  /**
   * Return an array with time positions distributed on round time values
   * right and right after min and max. Used in datetime axes as well as for
   * grouping data on a datetime axis.
   *
   * @param normalizedInterval
   * The interval in axis values (ms) and the count
   *
   * @param min
   * The minimum in axis values
   *
   * @param max
   * The maximum in axis values
   *
   * @implspec getTimeTicks(normalizedInterval: NormalizedIntervalObject, min?: number, max?: number, startOfWeek?: number): TimeTicksObject;
   *
   */
  TimeTicksObject getTimeTicks(NormalizedIntervalObject normalizedInterval);

  /**
   * Return an array with time positions distributed on round time values
   * right and right after min and max. Used in datetime axes as well as for
   * grouping data on a datetime axis.
   *
   * @param normalizedInterval
   * The interval in axis values (ms) and the count
   *
   * @param min
   * The minimum in axis values
   *
   * @param max
   * The maximum in axis values
   *
   * @implspec getTimeTicks(normalizedInterval: NormalizedIntervalObject, min?: number, max?: number, startOfWeek?: number): TimeTicksObject;
   *
   */
  TimeTicksObject getTimeTicks(NormalizedIntervalObject normalizedInterval, double min);

  /**
   * Get the time zone offset based on the current timezone information as set
   * in the global options.
   *
   * @param timestamp
   * The JavaScript timestamp to inspect.
   *
   * @return The timezone offset in minutes compared to UTC.
   *
   * @implspec getTimezoneOffset(timestamp: number): number;
   *
   */
  double getTimezoneOffset(double timestamp);

  /**
   * Make a time and returns milliseconds. Interprets the inputs as UTC time,
   * local time or a specific timezone time depending on the current time
   * settings.
   *
   * @param year
   * The year
   *
   * @param month
   * The month. Zero-based, so January is 0.
   *
   * @param date
   * The day of the month
   *
   * @param hours
   * The hour of the day, 0-23.
   *
   * @param minutes
   * The minutes
   *
   * @param seconds
   * The seconds
   *
   * @return The time in milliseconds since January 1st 1970.
   *
   * @implspec makeTime(year: number, month: number, date?: number, hours?: number, minutes?: number, seconds?: number): number;
   *
   */
  double makeTime(double year, double month, double date, double hours, double minutes);

  /**
   * Make a time and returns milliseconds. Interprets the inputs as UTC time,
   * local time or a specific timezone time depending on the current time
   * settings.
   *
   * @param year
   * The year
   *
   * @param month
   * The month. Zero-based, so January is 0.
   *
   * @param date
   * The day of the month
   *
   * @param hours
   * The hour of the day, 0-23.
   *
   * @param minutes
   * The minutes
   *
   * @param seconds
   * The seconds
   *
   * @return The time in milliseconds since January 1st 1970.
   *
   * @implspec makeTime(year: number, month: number, date?: number, hours?: number, minutes?: number, seconds?: number): number;
   *
   */
  double makeTime(double year, double month, double date, double hours);

  /**
   * Make a time and returns milliseconds. Interprets the inputs as UTC time,
   * local time or a specific timezone time depending on the current time
   * settings.
   *
   * @param year
   * The year
   *
   * @param month
   * The month. Zero-based, so January is 0.
   *
   * @param date
   * The day of the month
   *
   * @param hours
   * The hour of the day, 0-23.
   *
   * @param minutes
   * The minutes
   *
   * @param seconds
   * The seconds
   *
   * @return The time in milliseconds since January 1st 1970.
   *
   * @implspec makeTime(year: number, month: number, date?: number, hours?: number, minutes?: number, seconds?: number): number;
   *
   */
  double makeTime(double year, double month, double date, double hours, double minutes,
      double seconds);

  /**
   * Make a time and returns milliseconds. Interprets the inputs as UTC time,
   * local time or a specific timezone time depending on the current time
   * settings.
   *
   * @param year
   * The year
   *
   * @param month
   * The month. Zero-based, so January is 0.
   *
   * @param date
   * The day of the month
   *
   * @param hours
   * The hour of the day, 0-23.
   *
   * @param minutes
   * The minutes
   *
   * @param seconds
   * The seconds
   *
   * @return The time in milliseconds since January 1st 1970.
   *
   * @implspec makeTime(year: number, month: number, date?: number, hours?: number, minutes?: number, seconds?: number): number;
   *
   */
  double makeTime(double year, double month, double date);

  /**
   * Make a time and returns milliseconds. Interprets the inputs as UTC time,
   * local time or a specific timezone time depending on the current time
   * settings.
   *
   * @param year
   * The year
   *
   * @param month
   * The month. Zero-based, so January is 0.
   *
   * @param date
   * The day of the month
   *
   * @param hours
   * The hour of the day, 0-23.
   *
   * @param minutes
   * The minutes
   *
   * @param seconds
   * The seconds
   *
   * @return The time in milliseconds since January 1st 1970.
   *
   * @implspec makeTime(year: number, month: number, date?: number, hours?: number, minutes?: number, seconds?: number): number;
   *
   */
  double makeTime(double year, double month);

  /**
   * Resolve legacy formats of dateTimeLabelFormats (strings and arrays) into
   * an object.
   *
   * @param f
   * General format description
   *
   * @return The object definition
   *
   * @implspec resolveDTLFormat(f: (any[]|object|string)): object;
   *
   */
  Any resolveDTLFormat(String f);

  /**
   * Resolve legacy formats of dateTimeLabelFormats (strings and arrays) into
   * an object.
   *
   * @param f
   * General format description
   *
   * @return The object definition
   *
   * @implspec resolveDTLFormat(f: (any[]|object|string)): object;
   *
   */
  Any resolveDTLFormat(Any f);

  /**
   * Resolve legacy formats of dateTimeLabelFormats (strings and arrays) into
   * an object.
   *
   * @param f
   * General format description
   *
   * @return The object definition
   *
   * @implspec resolveDTLFormat(f: (any[]|object|string)): object;
   *
   */
  Any resolveDTLFormat(Any[] f);
}
