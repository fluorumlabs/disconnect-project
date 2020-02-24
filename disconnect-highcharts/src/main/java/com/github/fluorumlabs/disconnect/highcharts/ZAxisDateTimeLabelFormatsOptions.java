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
 * @see <a href="https://api.highcharts.com/highcharts/zAxis.dateTimeLabelFormats">https://api.highcharts.com/highcharts/zAxis.dateTimeLabelFormats</a>
 * @see <a href="https://api.highcharts.com/highstock/zAxis.dateTimeLabelFormats">https://api.highcharts.com/highstock/zAxis.dateTimeLabelFormats</a>
 * @see <a href="https://api.highcharts.com/gantt/zAxis.dateTimeLabelFormats">https://api.highcharts.com/gantt/zAxis.dateTimeLabelFormats</a>
 *
 */
public interface ZAxisDateTimeLabelFormatsOptions extends Any {
  /**
   * @implspec day?: ZAxisDateTimeLabelFormatsDayOptions;
   *
   */
  @JSProperty("day")
  @Nullable
  ZAxisDateTimeLabelFormatsDayOptions getDay();

  /**
   * @implspec day?: ZAxisDateTimeLabelFormatsDayOptions;
   *
   */
  @JSProperty("day")
  void setDay(ZAxisDateTimeLabelFormatsDayOptions value);

  /**
   * @implspec hour?: ZAxisDateTimeLabelFormatsHourOptions;
   *
   */
  @JSProperty("hour")
  @Nullable
  ZAxisDateTimeLabelFormatsHourOptions getHour();

  /**
   * @implspec hour?: ZAxisDateTimeLabelFormatsHourOptions;
   *
   */
  @JSProperty("hour")
  void setHour(ZAxisDateTimeLabelFormatsHourOptions value);

  /**
   * @implspec millisecond?: ZAxisDateTimeLabelFormatsMillisecondOptions;
   *
   */
  @JSProperty("millisecond")
  @Nullable
  ZAxisDateTimeLabelFormatsMillisecondOptions getMillisecond();

  /**
   * @implspec millisecond?: ZAxisDateTimeLabelFormatsMillisecondOptions;
   *
   */
  @JSProperty("millisecond")
  void setMillisecond(ZAxisDateTimeLabelFormatsMillisecondOptions value);

  /**
   * @implspec minute?: ZAxisDateTimeLabelFormatsMinuteOptions;
   *
   */
  @JSProperty("minute")
  @Nullable
  ZAxisDateTimeLabelFormatsMinuteOptions getMinute();

  /**
   * @implspec minute?: ZAxisDateTimeLabelFormatsMinuteOptions;
   *
   */
  @JSProperty("minute")
  void setMinute(ZAxisDateTimeLabelFormatsMinuteOptions value);

  /**
   * @implspec month?: ZAxisDateTimeLabelFormatsMonthOptions;
   *
   */
  @JSProperty("month")
  @Nullable
  ZAxisDateTimeLabelFormatsMonthOptions getMonth();

  /**
   * @implspec month?: ZAxisDateTimeLabelFormatsMonthOptions;
   *
   */
  @JSProperty("month")
  void setMonth(ZAxisDateTimeLabelFormatsMonthOptions value);

  /**
   * @implspec second?: ZAxisDateTimeLabelFormatsSecondOptions;
   *
   */
  @JSProperty("second")
  @Nullable
  ZAxisDateTimeLabelFormatsSecondOptions getSecond();

  /**
   * @implspec second?: ZAxisDateTimeLabelFormatsSecondOptions;
   *
   */
  @JSProperty("second")
  void setSecond(ZAxisDateTimeLabelFormatsSecondOptions value);

  /**
   * @implspec week?: ZAxisDateTimeLabelFormatsWeekOptions;
   *
   */
  @JSProperty("week")
  @Nullable
  ZAxisDateTimeLabelFormatsWeekOptions getWeek();

  /**
   * @implspec week?: ZAxisDateTimeLabelFormatsWeekOptions;
   *
   */
  @JSProperty("week")
  void setWeek(ZAxisDateTimeLabelFormatsWeekOptions value);

  /**
   * @implspec year?: ZAxisDateTimeLabelFormatsYearOptions;
   *
   */
  @JSProperty("year")
  @Nullable
  ZAxisDateTimeLabelFormatsYearOptions getYear();

  /**
   * @implspec year?: ZAxisDateTimeLabelFormatsYearOptions;
   *
   */
  @JSProperty("year")
  void setYear(ZAxisDateTimeLabelFormatsYearOptions value);
}
