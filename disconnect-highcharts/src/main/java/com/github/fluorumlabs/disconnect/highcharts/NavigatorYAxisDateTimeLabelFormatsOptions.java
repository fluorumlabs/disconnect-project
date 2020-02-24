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
 * @see <a href="https://api.highcharts.com/highcharts/navigator.yAxis.dateTimeLabelFormats">https://api.highcharts.com/highcharts/navigator.yAxis.dateTimeLabelFormats</a>
 * @see <a href="https://api.highcharts.com/highstock/navigator.yAxis.dateTimeLabelFormats">https://api.highcharts.com/highstock/navigator.yAxis.dateTimeLabelFormats</a>
 * @see <a href="https://api.highcharts.com/gantt/navigator.yAxis.dateTimeLabelFormats">https://api.highcharts.com/gantt/navigator.yAxis.dateTimeLabelFormats</a>
 *
 */
public interface NavigatorYAxisDateTimeLabelFormatsOptions extends Any {
  /**
   * @implspec day?: NavigatorYAxisDateTimeLabelFormatsDayOptions;
   *
   */
  @JSProperty("day")
  @Nullable
  NavigatorYAxisDateTimeLabelFormatsDayOptions getDay();

  /**
   * @implspec day?: NavigatorYAxisDateTimeLabelFormatsDayOptions;
   *
   */
  @JSProperty("day")
  void setDay(NavigatorYAxisDateTimeLabelFormatsDayOptions value);

  /**
   * @implspec hour?: NavigatorYAxisDateTimeLabelFormatsHourOptions;
   *
   */
  @JSProperty("hour")
  @Nullable
  NavigatorYAxisDateTimeLabelFormatsHourOptions getHour();

  /**
   * @implspec hour?: NavigatorYAxisDateTimeLabelFormatsHourOptions;
   *
   */
  @JSProperty("hour")
  void setHour(NavigatorYAxisDateTimeLabelFormatsHourOptions value);

  /**
   * @implspec millisecond?: NavigatorYAxisDateTimeLabelFormatsMillisecondOptions;
   *
   */
  @JSProperty("millisecond")
  @Nullable
  NavigatorYAxisDateTimeLabelFormatsMillisecondOptions getMillisecond();

  /**
   * @implspec millisecond?: NavigatorYAxisDateTimeLabelFormatsMillisecondOptions;
   *
   */
  @JSProperty("millisecond")
  void setMillisecond(NavigatorYAxisDateTimeLabelFormatsMillisecondOptions value);

  /**
   * @implspec minute?: NavigatorYAxisDateTimeLabelFormatsMinuteOptions;
   *
   */
  @JSProperty("minute")
  @Nullable
  NavigatorYAxisDateTimeLabelFormatsMinuteOptions getMinute();

  /**
   * @implspec minute?: NavigatorYAxisDateTimeLabelFormatsMinuteOptions;
   *
   */
  @JSProperty("minute")
  void setMinute(NavigatorYAxisDateTimeLabelFormatsMinuteOptions value);

  /**
   * @implspec month?: NavigatorYAxisDateTimeLabelFormatsMonthOptions;
   *
   */
  @JSProperty("month")
  @Nullable
  NavigatorYAxisDateTimeLabelFormatsMonthOptions getMonth();

  /**
   * @implspec month?: NavigatorYAxisDateTimeLabelFormatsMonthOptions;
   *
   */
  @JSProperty("month")
  void setMonth(NavigatorYAxisDateTimeLabelFormatsMonthOptions value);

  /**
   * @implspec second?: NavigatorYAxisDateTimeLabelFormatsSecondOptions;
   *
   */
  @JSProperty("second")
  @Nullable
  NavigatorYAxisDateTimeLabelFormatsSecondOptions getSecond();

  /**
   * @implspec second?: NavigatorYAxisDateTimeLabelFormatsSecondOptions;
   *
   */
  @JSProperty("second")
  void setSecond(NavigatorYAxisDateTimeLabelFormatsSecondOptions value);

  /**
   * @implspec week?: NavigatorYAxisDateTimeLabelFormatsWeekOptions;
   *
   */
  @JSProperty("week")
  @Nullable
  NavigatorYAxisDateTimeLabelFormatsWeekOptions getWeek();

  /**
   * @implspec week?: NavigatorYAxisDateTimeLabelFormatsWeekOptions;
   *
   */
  @JSProperty("week")
  void setWeek(NavigatorYAxisDateTimeLabelFormatsWeekOptions value);

  /**
   * @implspec year?: NavigatorYAxisDateTimeLabelFormatsYearOptions;
   *
   */
  @JSProperty("year")
  @Nullable
  NavigatorYAxisDateTimeLabelFormatsYearOptions getYear();

  /**
   * @implspec year?: NavigatorYAxisDateTimeLabelFormatsYearOptions;
   *
   */
  @JSProperty("year")
  void setYear(NavigatorYAxisDateTimeLabelFormatsYearOptions value);
}
