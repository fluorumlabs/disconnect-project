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
 * @see <a href="https://api.highcharts.com/highcharts/yAxis.dateTimeLabelFormats">https://api.highcharts.com/highcharts/yAxis.dateTimeLabelFormats</a>
 * @see <a href="https://api.highcharts.com/highstock/yAxis.dateTimeLabelFormats">https://api.highcharts.com/highstock/yAxis.dateTimeLabelFormats</a>
 * @see <a href="https://api.highcharts.com/gantt/yAxis.dateTimeLabelFormats">https://api.highcharts.com/gantt/yAxis.dateTimeLabelFormats</a>
 *
 */
public interface YAxisDateTimeLabelFormatsOptions extends Any {
  /**
   * @implspec day?: YAxisDateTimeLabelFormatsDayOptions;
   *
   */
  @JSProperty("day")
  @Nullable
  YAxisDateTimeLabelFormatsDayOptions getDay();

  /**
   * @implspec day?: YAxisDateTimeLabelFormatsDayOptions;
   *
   */
  @JSProperty("day")
  void setDay(YAxisDateTimeLabelFormatsDayOptions value);

  /**
   * @implspec hour?: YAxisDateTimeLabelFormatsHourOptions;
   *
   */
  @JSProperty("hour")
  @Nullable
  YAxisDateTimeLabelFormatsHourOptions getHour();

  /**
   * @implspec hour?: YAxisDateTimeLabelFormatsHourOptions;
   *
   */
  @JSProperty("hour")
  void setHour(YAxisDateTimeLabelFormatsHourOptions value);

  /**
   * @implspec millisecond?: YAxisDateTimeLabelFormatsMillisecondOptions;
   *
   */
  @JSProperty("millisecond")
  @Nullable
  YAxisDateTimeLabelFormatsMillisecondOptions getMillisecond();

  /**
   * @implspec millisecond?: YAxisDateTimeLabelFormatsMillisecondOptions;
   *
   */
  @JSProperty("millisecond")
  void setMillisecond(YAxisDateTimeLabelFormatsMillisecondOptions value);

  /**
   * @implspec minute?: YAxisDateTimeLabelFormatsMinuteOptions;
   *
   */
  @JSProperty("minute")
  @Nullable
  YAxisDateTimeLabelFormatsMinuteOptions getMinute();

  /**
   * @implspec minute?: YAxisDateTimeLabelFormatsMinuteOptions;
   *
   */
  @JSProperty("minute")
  void setMinute(YAxisDateTimeLabelFormatsMinuteOptions value);

  /**
   * @implspec month?: YAxisDateTimeLabelFormatsMonthOptions;
   *
   */
  @JSProperty("month")
  @Nullable
  YAxisDateTimeLabelFormatsMonthOptions getMonth();

  /**
   * @implspec month?: YAxisDateTimeLabelFormatsMonthOptions;
   *
   */
  @JSProperty("month")
  void setMonth(YAxisDateTimeLabelFormatsMonthOptions value);

  /**
   * @implspec second?: YAxisDateTimeLabelFormatsSecondOptions;
   *
   */
  @JSProperty("second")
  @Nullable
  YAxisDateTimeLabelFormatsSecondOptions getSecond();

  /**
   * @implspec second?: YAxisDateTimeLabelFormatsSecondOptions;
   *
   */
  @JSProperty("second")
  void setSecond(YAxisDateTimeLabelFormatsSecondOptions value);

  /**
   * @implspec week?: YAxisDateTimeLabelFormatsWeekOptions;
   *
   */
  @JSProperty("week")
  @Nullable
  YAxisDateTimeLabelFormatsWeekOptions getWeek();

  /**
   * @implspec week?: YAxisDateTimeLabelFormatsWeekOptions;
   *
   */
  @JSProperty("week")
  void setWeek(YAxisDateTimeLabelFormatsWeekOptions value);

  /**
   * @implspec year?: YAxisDateTimeLabelFormatsYearOptions;
   *
   */
  @JSProperty("year")
  @Nullable
  YAxisDateTimeLabelFormatsYearOptions getYear();

  /**
   * @implspec year?: YAxisDateTimeLabelFormatsYearOptions;
   *
   */
  @JSProperty("year")
  void setYear(YAxisDateTimeLabelFormatsYearOptions value);
}
