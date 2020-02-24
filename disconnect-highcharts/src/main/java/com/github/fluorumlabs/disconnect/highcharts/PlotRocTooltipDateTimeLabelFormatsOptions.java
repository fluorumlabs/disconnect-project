package com.github.fluorumlabs.disconnect.highcharts;

import java.lang.String;
import javax.annotation.Nullable;
import js.lang.Any;
import org.teavm.jso.JSProperty;

/**
 * (Highcharts, Highstock, Gantt) For series on a datetime axes, the date format
 * in the tooltip's header will by default be guessed based on the closest data
 * points. This member gives the default string representations used for each
 * unit. For an overview of the replacement codes, see dateFormat.
 *
 * @see <a href="https://api.highcharts.com/highcharts/plotOptions.roc.tooltip.dateTimeLabelFormats">https://api.highcharts.com/highcharts/plotOptions.roc.tooltip.dateTimeLabelFormats</a>
 * @see <a href="https://api.highcharts.com/highstock/plotOptions.roc.tooltip.dateTimeLabelFormats">https://api.highcharts.com/highstock/plotOptions.roc.tooltip.dateTimeLabelFormats</a>
 * @see <a href="https://api.highcharts.com/gantt/plotOptions.roc.tooltip.dateTimeLabelFormats">https://api.highcharts.com/gantt/plotOptions.roc.tooltip.dateTimeLabelFormats</a>
 *
 */
public interface PlotRocTooltipDateTimeLabelFormatsOptions extends Any {
  /**
   * @implspec day?: string;
   *
   */
  @JSProperty("day")
  @Nullable
  String getDay();

  /**
   * @implspec day?: string;
   *
   */
  @JSProperty("day")
  void setDay(String value);

  /**
   * @implspec hour?: string;
   *
   */
  @JSProperty("hour")
  @Nullable
  String getHour();

  /**
   * @implspec hour?: string;
   *
   */
  @JSProperty("hour")
  void setHour(String value);

  /**
   * @implspec millisecond?: string;
   *
   */
  @JSProperty("millisecond")
  @Nullable
  String getMillisecond();

  /**
   * @implspec millisecond?: string;
   *
   */
  @JSProperty("millisecond")
  void setMillisecond(String value);

  /**
   * @implspec minute?: string;
   *
   */
  @JSProperty("minute")
  @Nullable
  String getMinute();

  /**
   * @implspec minute?: string;
   *
   */
  @JSProperty("minute")
  void setMinute(String value);

  /**
   * @implspec month?: string;
   *
   */
  @JSProperty("month")
  @Nullable
  String getMonth();

  /**
   * @implspec month?: string;
   *
   */
  @JSProperty("month")
  void setMonth(String value);

  /**
   * @implspec second?: string;
   *
   */
  @JSProperty("second")
  @Nullable
  String getSecond();

  /**
   * @implspec second?: string;
   *
   */
  @JSProperty("second")
  void setSecond(String value);

  /**
   * @implspec week?: string;
   *
   */
  @JSProperty("week")
  @Nullable
  String getWeek();

  /**
   * @implspec week?: string;
   *
   */
  @JSProperty("week")
  void setWeek(String value);

  /**
   * @implspec year?: string;
   *
   */
  @JSProperty("year")
  @Nullable
  String getYear();

  /**
   * @implspec year?: string;
   *
   */
  @JSProperty("year")
  void setYear(String value);
}
