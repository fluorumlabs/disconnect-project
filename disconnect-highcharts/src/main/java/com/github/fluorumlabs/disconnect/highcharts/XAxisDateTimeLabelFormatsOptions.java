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
 * @see <a href="https://api.highcharts.com/highcharts/xAxis.dateTimeLabelFormats">https://api.highcharts.com/highcharts/xAxis.dateTimeLabelFormats</a>
 * @see <a href="https://api.highcharts.com/highstock/xAxis.dateTimeLabelFormats">https://api.highcharts.com/highstock/xAxis.dateTimeLabelFormats</a>
 * @see <a href="https://api.highcharts.com/gantt/xAxis.dateTimeLabelFormats">https://api.highcharts.com/gantt/xAxis.dateTimeLabelFormats</a>
 *
 */
public interface XAxisDateTimeLabelFormatsOptions extends Any {
  /**
   * @implspec day?: XAxisDateTimeLabelFormatsDayOptions;
   *
   */
  @JSProperty("day")
  @Nullable
  XAxisDateTimeLabelFormatsDayOptions getDay();

  /**
   * @implspec day?: XAxisDateTimeLabelFormatsDayOptions;
   *
   */
  @JSProperty("day")
  void setDay(XAxisDateTimeLabelFormatsDayOptions value);

  /**
   * @implspec hour?: XAxisDateTimeLabelFormatsHourOptions;
   *
   */
  @JSProperty("hour")
  @Nullable
  XAxisDateTimeLabelFormatsHourOptions getHour();

  /**
   * @implspec hour?: XAxisDateTimeLabelFormatsHourOptions;
   *
   */
  @JSProperty("hour")
  void setHour(XAxisDateTimeLabelFormatsHourOptions value);

  /**
   * @implspec millisecond?: XAxisDateTimeLabelFormatsMillisecondOptions;
   *
   */
  @JSProperty("millisecond")
  @Nullable
  XAxisDateTimeLabelFormatsMillisecondOptions getMillisecond();

  /**
   * @implspec millisecond?: XAxisDateTimeLabelFormatsMillisecondOptions;
   *
   */
  @JSProperty("millisecond")
  void setMillisecond(XAxisDateTimeLabelFormatsMillisecondOptions value);

  /**
   * @implspec minute?: XAxisDateTimeLabelFormatsMinuteOptions;
   *
   */
  @JSProperty("minute")
  @Nullable
  XAxisDateTimeLabelFormatsMinuteOptions getMinute();

  /**
   * @implspec minute?: XAxisDateTimeLabelFormatsMinuteOptions;
   *
   */
  @JSProperty("minute")
  void setMinute(XAxisDateTimeLabelFormatsMinuteOptions value);

  /**
   * @implspec month?: XAxisDateTimeLabelFormatsMonthOptions;
   *
   */
  @JSProperty("month")
  @Nullable
  XAxisDateTimeLabelFormatsMonthOptions getMonth();

  /**
   * @implspec month?: XAxisDateTimeLabelFormatsMonthOptions;
   *
   */
  @JSProperty("month")
  void setMonth(XAxisDateTimeLabelFormatsMonthOptions value);

  /**
   * @implspec second?: XAxisDateTimeLabelFormatsSecondOptions;
   *
   */
  @JSProperty("second")
  @Nullable
  XAxisDateTimeLabelFormatsSecondOptions getSecond();

  /**
   * @implspec second?: XAxisDateTimeLabelFormatsSecondOptions;
   *
   */
  @JSProperty("second")
  void setSecond(XAxisDateTimeLabelFormatsSecondOptions value);

  /**
   * @implspec week?: XAxisDateTimeLabelFormatsWeekOptions;
   *
   */
  @JSProperty("week")
  @Nullable
  XAxisDateTimeLabelFormatsWeekOptions getWeek();

  /**
   * @implspec week?: XAxisDateTimeLabelFormatsWeekOptions;
   *
   */
  @JSProperty("week")
  void setWeek(XAxisDateTimeLabelFormatsWeekOptions value);

  /**
   * @implspec year?: XAxisDateTimeLabelFormatsYearOptions;
   *
   */
  @JSProperty("year")
  @Nullable
  XAxisDateTimeLabelFormatsYearOptions getYear();

  /**
   * @implspec year?: XAxisDateTimeLabelFormatsYearOptions;
   *
   */
  @JSProperty("year")
  void setYear(XAxisDateTimeLabelFormatsYearOptions value);
}
