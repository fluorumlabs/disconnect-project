package com.github.fluorumlabs.disconnect.highcharts;

import javax.annotation.Nullable;
import js.lang.Any;
import org.teavm.jso.JSProperty;

/**
 * (Highcharts, Highstock, Gantt) For a datetime axis, the scale will
 * automatically adjust to the appropriate unit. This member gives the default
 * string representations used for each unit. For intermediate values, different
 * units may be used, for example the <code>day</code> unit can be used on midnight and
 * <code>hour</code> unit be used for intermediate values on the same axis. For an overview
 * of the replacement codes, see dateFormat. Defaults to:
 *
 * (see online documentation for example)
 *
 * @see <a href="https://api.highcharts.com/highcharts/navigator.xAxis.dateTimeLabelFormats">https://api.highcharts.com/highcharts/navigator.xAxis.dateTimeLabelFormats</a>
 * @see <a href="https://api.highcharts.com/highstock/navigator.xAxis.dateTimeLabelFormats">https://api.highcharts.com/highstock/navigator.xAxis.dateTimeLabelFormats</a>
 * @see <a href="https://api.highcharts.com/gantt/navigator.xAxis.dateTimeLabelFormats">https://api.highcharts.com/gantt/navigator.xAxis.dateTimeLabelFormats</a>
 *
 */
public interface NavigatorXAxisDateTimeLabelFormatsOptions extends Any {
  /**
   * @implspec day?: NavigatorXAxisDateTimeLabelFormatsDayOptions;
   *
   */
  @JSProperty("day")
  @Nullable
  NavigatorXAxisDateTimeLabelFormatsDayOptions getDay();

  /**
   * @implspec day?: NavigatorXAxisDateTimeLabelFormatsDayOptions;
   *
   */
  @JSProperty("day")
  void setDay(NavigatorXAxisDateTimeLabelFormatsDayOptions value);

  /**
   * @implspec hour?: NavigatorXAxisDateTimeLabelFormatsHourOptions;
   *
   */
  @JSProperty("hour")
  @Nullable
  NavigatorXAxisDateTimeLabelFormatsHourOptions getHour();

  /**
   * @implspec hour?: NavigatorXAxisDateTimeLabelFormatsHourOptions;
   *
   */
  @JSProperty("hour")
  void setHour(NavigatorXAxisDateTimeLabelFormatsHourOptions value);

  /**
   * @implspec millisecond?: NavigatorXAxisDateTimeLabelFormatsMillisecondOptions;
   *
   */
  @JSProperty("millisecond")
  @Nullable
  NavigatorXAxisDateTimeLabelFormatsMillisecondOptions getMillisecond();

  /**
   * @implspec millisecond?: NavigatorXAxisDateTimeLabelFormatsMillisecondOptions;
   *
   */
  @JSProperty("millisecond")
  void setMillisecond(NavigatorXAxisDateTimeLabelFormatsMillisecondOptions value);

  /**
   * @implspec minute?: NavigatorXAxisDateTimeLabelFormatsMinuteOptions;
   *
   */
  @JSProperty("minute")
  @Nullable
  NavigatorXAxisDateTimeLabelFormatsMinuteOptions getMinute();

  /**
   * @implspec minute?: NavigatorXAxisDateTimeLabelFormatsMinuteOptions;
   *
   */
  @JSProperty("minute")
  void setMinute(NavigatorXAxisDateTimeLabelFormatsMinuteOptions value);

  /**
   * @implspec month?: NavigatorXAxisDateTimeLabelFormatsMonthOptions;
   *
   */
  @JSProperty("month")
  @Nullable
  NavigatorXAxisDateTimeLabelFormatsMonthOptions getMonth();

  /**
   * @implspec month?: NavigatorXAxisDateTimeLabelFormatsMonthOptions;
   *
   */
  @JSProperty("month")
  void setMonth(NavigatorXAxisDateTimeLabelFormatsMonthOptions value);

  /**
   * @implspec second?: NavigatorXAxisDateTimeLabelFormatsSecondOptions;
   *
   */
  @JSProperty("second")
  @Nullable
  NavigatorXAxisDateTimeLabelFormatsSecondOptions getSecond();

  /**
   * @implspec second?: NavigatorXAxisDateTimeLabelFormatsSecondOptions;
   *
   */
  @JSProperty("second")
  void setSecond(NavigatorXAxisDateTimeLabelFormatsSecondOptions value);

  /**
   * @implspec week?: NavigatorXAxisDateTimeLabelFormatsWeekOptions;
   *
   */
  @JSProperty("week")
  @Nullable
  NavigatorXAxisDateTimeLabelFormatsWeekOptions getWeek();

  /**
   * @implspec week?: NavigatorXAxisDateTimeLabelFormatsWeekOptions;
   *
   */
  @JSProperty("week")
  void setWeek(NavigatorXAxisDateTimeLabelFormatsWeekOptions value);

  /**
   * @implspec year?: NavigatorXAxisDateTimeLabelFormatsYearOptions;
   *
   */
  @JSProperty("year")
  @Nullable
  NavigatorXAxisDateTimeLabelFormatsYearOptions getYear();

  /**
   * @implspec year?: NavigatorXAxisDateTimeLabelFormatsYearOptions;
   *
   */
  @JSProperty("year")
  void setYear(NavigatorXAxisDateTimeLabelFormatsYearOptions value);
}
