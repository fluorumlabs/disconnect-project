package js.lang.external.highcharts;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import java.lang.String;
import java.lang.UnsupportedOperationException;
import js.extras.JsEnum;
import js.lang.Any;
import js.lang.JsDate;
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
@NpmPackage(
    name = "highcharts",
    version = "^8.1.0"
)
@Import(
    symbols = {"Time as Time_Time"},
    module = "highcharts/es-modules/masters/highcharts.src.js"
)
@Import(
    module = "highcharts/es-modules/masters/highcharts.src.js"
)
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
   */
  @JSBody(
      params = {"options"},
      script = "return new Time_Time(options)"
  )
  static Time create(TimeOptions options) {
    throw new UnsupportedOperationException("Available only in JavaScript");
  }

  /**
   * Formats a JavaScript date timestamp (milliseconds since Jan 1st 1970)
   * into a human readable date string. The available format keys are listed
   * below. Additional formats can be given in the Highcharts.dateFormats
   * hook.
   *
   * Supported format keys:
   *
   * <ul>
   * <li>
   * <code>%a</code>: Short weekday, like 'Mon'
   *
   * </li>
   * <li>
   * <code>%A</code>: Long weekday, like 'Monday'
   *
   * </li>
   * <li>
   * <code>%d</code>: Two digit day of the month, 01 to 31
   *
   * </li>
   * <li>
   * <code>%e</code>: Day of the month, 1 through 31
   *
   * </li>
   * <li>
   * <code>%w</code>: Day of the week, 0 through 6
   *
   * </li>
   * <li>
   * <code>%b</code>: Short month, like 'Jan'
   *
   * </li>
   * <li>
   * <code>%B</code>: Long month, like 'January'
   *
   * </li>
   * <li>
   * <code>%m</code>: Two digit month number, 01 through 12
   *
   * </li>
   * <li>
   * <code>%y</code>: Two digits year, like 09 for 2009
   *
   * </li>
   * <li>
   * <code>%Y</code>: Four digits year, like 2009
   *
   * </li>
   * <li>
   * <code>%H</code>: Two digits hours in 24h format, 00 through 23
   *
   * </li>
   * <li>
   * <code>%k</code>: Hours in 24h format, 0 through 23
   *
   * </li>
   * <li>
   * <code>%I</code>: Two digits hours in 12h format, 00 through 11
   *
   * </li>
   * <li>
   * <code>%l</code>: Hours in 12h format, 1 through 12
   *
   * </li>
   * <li>
   * <code>%M</code>: Two digits minutes, 00 through 59
   *
   * </li>
   * <li>
   * <code>%p</code>: Upper case AM or PM
   *
   * </li>
   * <li>
   * <code>%P</code>: Lower case AM or PM
   *
   * </li>
   * <li>
   * <code>%S</code>: Two digits seconds, 00 through 59
   *
   * </li>
   * <li>
   * <code>%L</code>: Milliseconds (naming from Ruby)
   *
   * </li>
   * </ul>
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
   */
  String dateFormat(String format, double timestamp, boolean capitalize);

  /**
   * Formats a JavaScript date timestamp (milliseconds since Jan 1st 1970)
   * into a human readable date string. The available format keys are listed
   * below. Additional formats can be given in the Highcharts.dateFormats
   * hook.
   *
   * Supported format keys:
   *
   * <ul>
   * <li>
   * <code>%a</code>: Short weekday, like 'Mon'
   *
   * </li>
   * <li>
   * <code>%A</code>: Long weekday, like 'Monday'
   *
   * </li>
   * <li>
   * <code>%d</code>: Two digit day of the month, 01 to 31
   *
   * </li>
   * <li>
   * <code>%e</code>: Day of the month, 1 through 31
   *
   * </li>
   * <li>
   * <code>%w</code>: Day of the week, 0 through 6
   *
   * </li>
   * <li>
   * <code>%b</code>: Short month, like 'Jan'
   *
   * </li>
   * <li>
   * <code>%B</code>: Long month, like 'January'
   *
   * </li>
   * <li>
   * <code>%m</code>: Two digit month number, 01 through 12
   *
   * </li>
   * <li>
   * <code>%y</code>: Two digits year, like 09 for 2009
   *
   * </li>
   * <li>
   * <code>%Y</code>: Four digits year, like 2009
   *
   * </li>
   * <li>
   * <code>%H</code>: Two digits hours in 24h format, 00 through 23
   *
   * </li>
   * <li>
   * <code>%k</code>: Hours in 24h format, 0 through 23
   *
   * </li>
   * <li>
   * <code>%I</code>: Two digits hours in 12h format, 00 through 11
   *
   * </li>
   * <li>
   * <code>%l</code>: Hours in 12h format, 1 through 12
   *
   * </li>
   * <li>
   * <code>%M</code>: Two digits minutes, 00 through 59
   *
   * </li>
   * <li>
   * <code>%p</code>: Upper case AM or PM
   *
   * </li>
   * <li>
   * <code>%P</code>: Lower case AM or PM
   *
   * </li>
   * <li>
   * <code>%S</code>: Two digits seconds, 00 through 59
   *
   * </li>
   * <li>
   * <code>%L</code>: Milliseconds (naming from Ruby)
   *
   * </li>
   * </ul>
   * @param format
   * The desired format where various time representations are prefixed
   * with %.
   *
   * @param timestamp
   * The JavaScript timestamp.
   *
   * @return The formatted date.
   *
   */
  String dateFormat(String format, double timestamp);

  /**
   * Get the value of a date object in given units, and subject to the Time
   * object's current timezone settings. This function corresponds directly to
   * JavaScripts <code>Date.getXXX / Date.getUTCXXX</code>, so instead of calling
   * <code>date.getHours()</code> or <code>date.getUTCHours()</code> we will call
   * <code>time.get('Hours')</code>.
   *
   * @return The given time unit
   *
   */
  double get(GetUnit unit, JsDate date);

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
   */
  AxisTickPositionsArray getTimeTicks(TimeNormalizedObject normalizedInterval, double min,
      double max, double startOfWeek);

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
   */
  AxisTickPositionsArray getTimeTicks(TimeNormalizedObject normalizedInterval, double min,
      double max);

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
   */
  AxisTickPositionsArray getTimeTicks(TimeNormalizedObject normalizedInterval, double min);

  /**
   * Return an array with time positions distributed on round time values
   * right and right after min and max. Used in datetime axes as well as for
   * grouping data on a datetime axis.
   *
   * @param normalizedInterval
   * The interval in axis values (ms) and the count
   *
   */
  AxisTickPositionsArray getTimeTicks(TimeNormalizedObject normalizedInterval);

  /**
   * Get the time zone offset based on the current timezone information as set
   * in the global options.
   *
   * @param timestamp
   * The JavaScript timestamp to inspect.
   *
   * @return The timezone offset in minutes compared to UTC.
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
   * @return The time in milliseconds since January 1st 1970.
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
   * @return The time in milliseconds since January 1st 1970.
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
   * @return The time in milliseconds since January 1st 1970.
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
   * @return The time in milliseconds since January 1st 1970.
   *
   */
  double makeTime(double year, double month);

  /**
   * Set the value of a date object in given units, and subject to the Time
   * object's current timezone settings. This function corresponds directly to
   * JavaScripts <code>Date.setXXX / Date.setUTCXXX</code>, so instead of calling
   * <code>date.setHours(0)</code> or <code>date.setUTCHours(0)</code> we will call
   * <code>time.set('Hours', 0)</code>.
   *
   * @return The epoch milliseconds of the updated date
   *
   */
  double set(SetUnit unit, JsDate date, double value);

  abstract class GetUnit extends JsEnum {
    public static final GetUnit SECONDS = JsEnum.of("Seconds");

    public static final GetUnit MONTH = JsEnum.of("Month");

    public static final GetUnit MINUTES = JsEnum.of("Minutes");

    public static final GetUnit MILLISECONDS = JsEnum.of("Milliseconds");

    public static final GetUnit HOURS = JsEnum.of("Hours");

    public static final GetUnit FULLYEAR = JsEnum.of("FullYear");

    public static final GetUnit DAY = JsEnum.of("Day");

    public static final GetUnit DATE = JsEnum.of("Date");
  }

  abstract class SetUnit extends JsEnum {
    public static final SetUnit SECONDS = JsEnum.of("Seconds");

    public static final SetUnit MONTH = JsEnum.of("Month");

    public static final SetUnit MINUTES = JsEnum.of("Minutes");

    public static final SetUnit MILLISECONDS = JsEnum.of("Milliseconds");

    public static final SetUnit HOURS = JsEnum.of("Hours");

    public static final SetUnit FULLYEAR = JsEnum.of("FullYear");

    public static final SetUnit DAY = JsEnum.of("Day");

    public static final SetUnit DATE = JsEnum.of("Date");
  }
}
