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
 * @see <a href="https://api.highcharts.com/highcharts/chart.parallelAxes.dateTimeLabelFormats">https://api.highcharts.com/highcharts/chart.parallelAxes.dateTimeLabelFormats</a>
 * @see <a href="https://api.highcharts.com/highstock/chart.parallelAxes.dateTimeLabelFormats">https://api.highcharts.com/highstock/chart.parallelAxes.dateTimeLabelFormats</a>
 * @see <a href="https://api.highcharts.com/gantt/chart.parallelAxes.dateTimeLabelFormats">https://api.highcharts.com/gantt/chart.parallelAxes.dateTimeLabelFormats</a>
 *
 */
public interface ChartParallelAxesDateTimeLabelFormatsOptions extends Any {
  /**
   * @implspec day?: ChartParallelAxesDateTimeLabelFormatsDayOptions;
   *
   */
  @JSProperty("day")
  @Nullable
  ChartParallelAxesDateTimeLabelFormatsDayOptions getDay();

  /**
   * @implspec day?: ChartParallelAxesDateTimeLabelFormatsDayOptions;
   *
   */
  @JSProperty("day")
  void setDay(ChartParallelAxesDateTimeLabelFormatsDayOptions value);

  /**
   * @implspec hour?: ChartParallelAxesDateTimeLabelFormatsHourOptions;
   *
   */
  @JSProperty("hour")
  @Nullable
  ChartParallelAxesDateTimeLabelFormatsHourOptions getHour();

  /**
   * @implspec hour?: ChartParallelAxesDateTimeLabelFormatsHourOptions;
   *
   */
  @JSProperty("hour")
  void setHour(ChartParallelAxesDateTimeLabelFormatsHourOptions value);

  /**
   * @implspec millisecond?: ChartParallelAxesDateTimeLabelFormatsMillisecondOptions;
   *
   */
  @JSProperty("millisecond")
  @Nullable
  ChartParallelAxesDateTimeLabelFormatsMillisecondOptions getMillisecond();

  /**
   * @implspec millisecond?: ChartParallelAxesDateTimeLabelFormatsMillisecondOptions;
   *
   */
  @JSProperty("millisecond")
  void setMillisecond(ChartParallelAxesDateTimeLabelFormatsMillisecondOptions value);

  /**
   * @implspec minute?: ChartParallelAxesDateTimeLabelFormatsMinuteOptions;
   *
   */
  @JSProperty("minute")
  @Nullable
  ChartParallelAxesDateTimeLabelFormatsMinuteOptions getMinute();

  /**
   * @implspec minute?: ChartParallelAxesDateTimeLabelFormatsMinuteOptions;
   *
   */
  @JSProperty("minute")
  void setMinute(ChartParallelAxesDateTimeLabelFormatsMinuteOptions value);

  /**
   * @implspec month?: ChartParallelAxesDateTimeLabelFormatsMonthOptions;
   *
   */
  @JSProperty("month")
  @Nullable
  ChartParallelAxesDateTimeLabelFormatsMonthOptions getMonth();

  /**
   * @implspec month?: ChartParallelAxesDateTimeLabelFormatsMonthOptions;
   *
   */
  @JSProperty("month")
  void setMonth(ChartParallelAxesDateTimeLabelFormatsMonthOptions value);

  /**
   * @implspec second?: ChartParallelAxesDateTimeLabelFormatsSecondOptions;
   *
   */
  @JSProperty("second")
  @Nullable
  ChartParallelAxesDateTimeLabelFormatsSecondOptions getSecond();

  /**
   * @implspec second?: ChartParallelAxesDateTimeLabelFormatsSecondOptions;
   *
   */
  @JSProperty("second")
  void setSecond(ChartParallelAxesDateTimeLabelFormatsSecondOptions value);

  /**
   * @implspec week?: ChartParallelAxesDateTimeLabelFormatsWeekOptions;
   *
   */
  @JSProperty("week")
  @Nullable
  ChartParallelAxesDateTimeLabelFormatsWeekOptions getWeek();

  /**
   * @implspec week?: ChartParallelAxesDateTimeLabelFormatsWeekOptions;
   *
   */
  @JSProperty("week")
  void setWeek(ChartParallelAxesDateTimeLabelFormatsWeekOptions value);

  /**
   * @implspec year?: ChartParallelAxesDateTimeLabelFormatsYearOptions;
   *
   */
  @JSProperty("year")
  @Nullable
  ChartParallelAxesDateTimeLabelFormatsYearOptions getYear();

  /**
   * @implspec year?: ChartParallelAxesDateTimeLabelFormatsYearOptions;
   *
   */
  @JSProperty("year")
  void setYear(ChartParallelAxesDateTimeLabelFormatsYearOptions value);
}
