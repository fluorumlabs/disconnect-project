package com.github.fluorumlabs.disconnect.highcharts;

import java.lang.FunctionalInterface;
import java.lang.String;
import javax.annotation.Nullable;
import js.lang.Any;
import org.teavm.jso.JSFunctor;
import org.teavm.jso.JSProperty;

/**
 * (Highcharts, Highstock, Highmaps) Time options that can apply globally or to
 * individual charts. These settings affect how <code>datetime</code> axes are laid out,
 * how tooltips are formatted, how series pointIntervalUnit works and how the
 * Highstock range selector handles time.
 *
 * The common use case is that all charts in the same Highcharts object share
 * the same time settings, in which case the global settings are set using
 * <code>setOptions</code>.(see online documentation for example)
 *
 * Since v6.0.5, the time options were moved from the <code>global</code> obect to the
 * <code>time</code> object, and time options can be set on each individual chart.
 *
 * @see <a href="https://api.highcharts.com/highcharts/time">https://api.highcharts.com/highcharts/time</a>
 * @see <a href="https://api.highcharts.com/highstock/time">https://api.highcharts.com/highstock/time</a>
 * @see <a href="https://api.highcharts.com/highmaps/time">https://api.highcharts.com/highmaps/time</a>
 *
 */
public interface TimeOptions extends Any {
  /**
   * (Highcharts, Highstock, Gantt) A custom <code>Date</code> class for advanced date
   * handling. For example, JDate can be hooked in to handle Jalali dates.
   *
   * @see <a href="https://api.highcharts.com/highcharts/time.Date">https://api.highcharts.com/highcharts/time.Date</a>
   * @see <a href="https://api.highcharts.com/highstock/time.Date">https://api.highcharts.com/highstock/time.Date</a>
   * @see <a href="https://api.highcharts.com/gantt/time.Date">https://api.highcharts.com/gantt/time.Date</a>
   *
   * @implspec Date?: any;
   *
   */
  @JSProperty("Date")
  @Nullable
  Any getDate();

  /**
   * (Highcharts, Highstock, Gantt) A custom <code>Date</code> class for advanced date
   * handling. For example, JDate can be hooked in to handle Jalali dates.
   *
   * @see <a href="https://api.highcharts.com/highcharts/time.Date">https://api.highcharts.com/highcharts/time.Date</a>
   * @see <a href="https://api.highcharts.com/highstock/time.Date">https://api.highcharts.com/highstock/time.Date</a>
   * @see <a href="https://api.highcharts.com/gantt/time.Date">https://api.highcharts.com/gantt/time.Date</a>
   *
   * @implspec Date?: any;
   *
   */
  @JSProperty("Date")
  void setDate(Any value);

  /**
   * (Highcharts, Highstock, Gantt) A callback to return the time zone offset
   * for a given datetime. It takes the timestamp in terms of milliseconds
   * since January 1 1970, and returns the timezone offset in minutes. This
   * provides a hook for drawing time based charts in specific time zones
   * using their local DST crossover dates, with the help of external
   * libraries.
   *
   * @see <a href="https://api.highcharts.com/highcharts/time.getTimezoneOffset">https://api.highcharts.com/highcharts/time.getTimezoneOffset</a>
   * @see <a href="https://api.highcharts.com/highstock/time.getTimezoneOffset">https://api.highcharts.com/highstock/time.getTimezoneOffset</a>
   * @see <a href="https://api.highcharts.com/gantt/time.getTimezoneOffset">https://api.highcharts.com/gantt/time.getTimezoneOffset</a>
   *
   * @implspec getTimezoneOffset?: () =&gt; void;
   *
   */
  @JSProperty("getTimezoneOffset")
  @Nullable
  GetTimezoneOffset getGetTimezoneOffset();

  /**
   * (Highcharts, Highstock, Gantt) A callback to return the time zone offset
   * for a given datetime. It takes the timestamp in terms of milliseconds
   * since January 1 1970, and returns the timezone offset in minutes. This
   * provides a hook for drawing time based charts in specific time zones
   * using their local DST crossover dates, with the help of external
   * libraries.
   *
   * @see <a href="https://api.highcharts.com/highcharts/time.getTimezoneOffset">https://api.highcharts.com/highcharts/time.getTimezoneOffset</a>
   * @see <a href="https://api.highcharts.com/highstock/time.getTimezoneOffset">https://api.highcharts.com/highstock/time.getTimezoneOffset</a>
   * @see <a href="https://api.highcharts.com/gantt/time.getTimezoneOffset">https://api.highcharts.com/gantt/time.getTimezoneOffset</a>
   *
   * @implspec getTimezoneOffset?: () =&gt; void;
   *
   */
  @JSProperty("getTimezoneOffset")
  void setGetTimezoneOffset(GetTimezoneOffset value);

  /**
   * (Highcharts, Highstock, Gantt) Requires moment.js. If the timezone option
   * is specified, it creates a default getTimezoneOffset function that looks
   * up the specified timezone in moment.js. If moment.js is not included,
   * this throws a Highcharts error in the console, but does not crash the
   * chart.
   *
   * @see <a href="https://api.highcharts.com/highcharts/time.timezone">https://api.highcharts.com/highcharts/time.timezone</a>
   * @see <a href="https://api.highcharts.com/highstock/time.timezone">https://api.highcharts.com/highstock/time.timezone</a>
   * @see <a href="https://api.highcharts.com/gantt/time.timezone">https://api.highcharts.com/gantt/time.timezone</a>
   *
   * @implspec timezone?: string;
   *
   */
  @JSProperty("timezone")
  @Nullable
  String getTimezone();

  /**
   * (Highcharts, Highstock, Gantt) Requires moment.js. If the timezone option
   * is specified, it creates a default getTimezoneOffset function that looks
   * up the specified timezone in moment.js. If moment.js is not included,
   * this throws a Highcharts error in the console, but does not crash the
   * chart.
   *
   * @see <a href="https://api.highcharts.com/highcharts/time.timezone">https://api.highcharts.com/highcharts/time.timezone</a>
   * @see <a href="https://api.highcharts.com/highstock/time.timezone">https://api.highcharts.com/highstock/time.timezone</a>
   * @see <a href="https://api.highcharts.com/gantt/time.timezone">https://api.highcharts.com/gantt/time.timezone</a>
   *
   * @implspec timezone?: string;
   *
   */
  @JSProperty("timezone")
  void setTimezone(String value);

  /**
   * (Highcharts, Highstock, Gantt) The timezone offset in minutes. Positive
   * values are west, negative values are east of UTC, as in the ECMAScript
   * getTimezoneOffset method. Use this to display UTC based data in a
   * predefined time zone.
   *
   * @see <a href="https://api.highcharts.com/highcharts/time.timezoneOffset">https://api.highcharts.com/highcharts/time.timezoneOffset</a>
   * @see <a href="https://api.highcharts.com/highstock/time.timezoneOffset">https://api.highcharts.com/highstock/time.timezoneOffset</a>
   * @see <a href="https://api.highcharts.com/gantt/time.timezoneOffset">https://api.highcharts.com/gantt/time.timezoneOffset</a>
   *
   * @implspec timezoneOffset?: number;
   *
   */
  @JSProperty("timezoneOffset")
  double getTimezoneOffset();

  /**
   * (Highcharts, Highstock, Gantt) The timezone offset in minutes. Positive
   * values are west, negative values are east of UTC, as in the ECMAScript
   * getTimezoneOffset method. Use this to display UTC based data in a
   * predefined time zone.
   *
   * @see <a href="https://api.highcharts.com/highcharts/time.timezoneOffset">https://api.highcharts.com/highcharts/time.timezoneOffset</a>
   * @see <a href="https://api.highcharts.com/highstock/time.timezoneOffset">https://api.highcharts.com/highstock/time.timezoneOffset</a>
   * @see <a href="https://api.highcharts.com/gantt/time.timezoneOffset">https://api.highcharts.com/gantt/time.timezoneOffset</a>
   *
   * @implspec timezoneOffset?: number;
   *
   */
  @JSProperty("timezoneOffset")
  void setTimezoneOffset(double value);

  /**
   * (Highcharts, Highstock, Highmaps) Whether to use UTC time for axis
   * scaling, tickmark placement and time display in <code>Highcharts.dateFormat</code>.
   * Advantages of using UTC is that the time displays equally regardless of
   * the user agent's time zone settings. Local time can be used when the data
   * is loaded in real time or when correct Daylight Saving Time transitions
   * are required.
   *
   * @see <a href="https://api.highcharts.com/highcharts/time.useUTC">https://api.highcharts.com/highcharts/time.useUTC</a>
   * @see <a href="https://api.highcharts.com/highstock/time.useUTC">https://api.highcharts.com/highstock/time.useUTC</a>
   * @see <a href="https://api.highcharts.com/highmaps/time.useUTC">https://api.highcharts.com/highmaps/time.useUTC</a>
   *
   * @implspec useUTC?: boolean;
   *
   */
  @JSProperty("useUTC")
  boolean getUseUTC();

  /**
   * (Highcharts, Highstock, Highmaps) Whether to use UTC time for axis
   * scaling, tickmark placement and time display in <code>Highcharts.dateFormat</code>.
   * Advantages of using UTC is that the time displays equally regardless of
   * the user agent's time zone settings. Local time can be used when the data
   * is loaded in real time or when correct Daylight Saving Time transitions
   * are required.
   *
   * @see <a href="https://api.highcharts.com/highcharts/time.useUTC">https://api.highcharts.com/highcharts/time.useUTC</a>
   * @see <a href="https://api.highcharts.com/highstock/time.useUTC">https://api.highcharts.com/highstock/time.useUTC</a>
   * @see <a href="https://api.highcharts.com/highmaps/time.useUTC">https://api.highcharts.com/highmaps/time.useUTC</a>
   *
   * @implspec useUTC?: boolean;
   *
   */
  @JSProperty("useUTC")
  void setUseUTC(boolean value);

  /**
   */
  @JSFunctor
  @FunctionalInterface
  interface GetTimezoneOffset extends Any {
    void apply();
  }
}
