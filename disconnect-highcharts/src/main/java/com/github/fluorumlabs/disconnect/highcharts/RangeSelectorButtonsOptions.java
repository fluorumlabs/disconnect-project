package com.github.fluorumlabs.disconnect.highcharts;

import java.lang.String;
import javax.annotation.Nullable;
import js.extras.JsEnum;
import js.lang.Any;
import org.teavm.jso.JSProperty;

/**
 * (Highstock) An array of configuration objects for the buttons.
 *
 * Defaults to
 *
 * (see online documentation for example)
 *
 * @see <a href="https://api.highcharts.com/highstock/rangeSelector.buttons">https://api.highcharts.com/highstock/rangeSelector.buttons</a>
 *
 */
public interface RangeSelectorButtonsOptions extends Any {
  /**
   * (Highstock) How many units of the defined type the button should span. If
   * <code>type</code> is &quot;month&quot; and <code>count</code> is 3, the button spans three months.
   *
   * @see <a href="https://api.highcharts.com/highstock/rangeSelector.buttons.count">https://api.highcharts.com/highstock/rangeSelector.buttons.count</a>
   *
   * @implspec count?: number;
   *
   */
  @JSProperty("count")
  double getCount();

  /**
   * (Highstock) How many units of the defined type the button should span. If
   * <code>type</code> is &quot;month&quot; and <code>count</code> is 3, the button spans three months.
   *
   * @see <a href="https://api.highcharts.com/highstock/rangeSelector.buttons.count">https://api.highcharts.com/highstock/rangeSelector.buttons.count</a>
   *
   * @implspec count?: number;
   *
   */
  @JSProperty("count")
  void setCount(double value);

  /**
   * (Highstock) A custom data grouping object for each button.
   *
   * @see <a href="https://api.highcharts.com/highstock/rangeSelector.buttons.dataGrouping">https://api.highcharts.com/highstock/rangeSelector.buttons.dataGrouping</a>
   *
   * @implspec dataGrouping?: RangeSelectorButtonsDataGroupingOptions;
   *
   */
  @JSProperty("dataGrouping")
  @Nullable
  RangeSelectorButtonsDataGroupingOptions getDataGrouping();

  /**
   * (Highstock) A custom data grouping object for each button.
   *
   * @see <a href="https://api.highcharts.com/highstock/rangeSelector.buttons.dataGrouping">https://api.highcharts.com/highstock/rangeSelector.buttons.dataGrouping</a>
   *
   * @implspec dataGrouping?: RangeSelectorButtonsDataGroupingOptions;
   *
   */
  @JSProperty("dataGrouping")
  void setDataGrouping(RangeSelectorButtonsDataGroupingOptions value);

  /**
   * @implspec events?: RangeSelectorButtonsEventsOptions;
   *
   */
  @JSProperty("events")
  @Nullable
  RangeSelectorButtonsEventsOptions getEvents();

  /**
   * @implspec events?: RangeSelectorButtonsEventsOptions;
   *
   */
  @JSProperty("events")
  void setEvents(RangeSelectorButtonsEventsOptions value);

  /**
   * (Highstock) Additional range (in milliseconds) added to the end of the
   * calculated time span.
   *
   * @see <a href="https://api.highcharts.com/highstock/rangeSelector.buttons.offsetMax">https://api.highcharts.com/highstock/rangeSelector.buttons.offsetMax</a>
   *
   * @implspec offsetMax?: number;
   *
   */
  @JSProperty("offsetMax")
  double getOffsetMax();

  /**
   * (Highstock) Additional range (in milliseconds) added to the end of the
   * calculated time span.
   *
   * @see <a href="https://api.highcharts.com/highstock/rangeSelector.buttons.offsetMax">https://api.highcharts.com/highstock/rangeSelector.buttons.offsetMax</a>
   *
   * @implspec offsetMax?: number;
   *
   */
  @JSProperty("offsetMax")
  void setOffsetMax(double value);

  /**
   * (Highstock) Additional range (in milliseconds) added to the start of the
   * calculated time span.
   *
   * @see <a href="https://api.highcharts.com/highstock/rangeSelector.buttons.offsetMin">https://api.highcharts.com/highstock/rangeSelector.buttons.offsetMin</a>
   *
   * @implspec offsetMin?: number;
   *
   */
  @JSProperty("offsetMin")
  double getOffsetMin();

  /**
   * (Highstock) Additional range (in milliseconds) added to the start of the
   * calculated time span.
   *
   * @see <a href="https://api.highcharts.com/highstock/rangeSelector.buttons.offsetMin">https://api.highcharts.com/highstock/rangeSelector.buttons.offsetMin</a>
   *
   * @implspec offsetMin?: number;
   *
   */
  @JSProperty("offsetMin")
  void setOffsetMin(double value);

  /**
   * (Highstock) When buttons apply dataGrouping on a series, by default
   * zooming in/out will deselect buttons and unset dataGrouping. Enable this
   * option to keep buttons selected when extremes change.
   *
   * @see <a href="https://api.highcharts.com/highstock/rangeSelector.buttons.preserveDataGrouping">https://api.highcharts.com/highstock/rangeSelector.buttons.preserveDataGrouping</a>
   *
   * @implspec preserveDataGrouping?: boolean;
   *
   */
  @JSProperty("preserveDataGrouping")
  boolean getPreserveDataGrouping();

  /**
   * (Highstock) When buttons apply dataGrouping on a series, by default
   * zooming in/out will deselect buttons and unset dataGrouping. Enable this
   * option to keep buttons selected when extremes change.
   *
   * @see <a href="https://api.highcharts.com/highstock/rangeSelector.buttons.preserveDataGrouping">https://api.highcharts.com/highstock/rangeSelector.buttons.preserveDataGrouping</a>
   *
   * @implspec preserveDataGrouping?: boolean;
   *
   */
  @JSProperty("preserveDataGrouping")
  void setPreserveDataGrouping(boolean value);

  /**
   * (Highstock) The text for the button itself.
   *
   * @see <a href="https://api.highcharts.com/highstock/rangeSelector.buttons.text">https://api.highcharts.com/highstock/rangeSelector.buttons.text</a>
   *
   * @implspec text?: string;
   *
   */
  @JSProperty("text")
  @Nullable
  String getText();

  /**
   * (Highstock) The text for the button itself.
   *
   * @see <a href="https://api.highcharts.com/highstock/rangeSelector.buttons.text">https://api.highcharts.com/highstock/rangeSelector.buttons.text</a>
   *
   * @implspec text?: string;
   *
   */
  @JSProperty("text")
  void setText(String value);

  /**
   * (Highstock) Defined the time span for the button. Can be one of
   * <code>millisecond</code>, <code>second</code>, <code>minute</code>, <code>hour</code>, <code>day</code>, <code>week</code>, <code>month</code>, <code>ytd</code>,
   * <code>all</code>.
   *
   * @see <a href="https://api.highcharts.com/highstock/rangeSelector.buttons.type">https://api.highcharts.com/highstock/rangeSelector.buttons.type</a>
   *
   * @implspec type?: (&quot;all&quot;|&quot;day&quot;|&quot;millisecond&quot;|&quot;minute&quot;|&quot;month&quot;|&quot;second&quot;|&quot;week&quot;|&quot;ytd&quot;);
   *
   */
  @JSProperty("type")
  @Nullable
  Type getType();

  /**
   * (Highstock) Defined the time span for the button. Can be one of
   * <code>millisecond</code>, <code>second</code>, <code>minute</code>, <code>hour</code>, <code>day</code>, <code>week</code>, <code>month</code>, <code>ytd</code>,
   * <code>all</code>.
   *
   * @see <a href="https://api.highcharts.com/highstock/rangeSelector.buttons.type">https://api.highcharts.com/highstock/rangeSelector.buttons.type</a>
   *
   * @implspec type?: (&quot;all&quot;|&quot;day&quot;|&quot;millisecond&quot;|&quot;minute&quot;|&quot;month&quot;|&quot;second&quot;|&quot;week&quot;|&quot;ytd&quot;);
   *
   */
  @JSProperty("type")
  void setType(Type value);

  /**
   */
  abstract class Type extends JsEnum {
    public static final Type ALL = JsEnum.of("all");

    public static final Type DAY = JsEnum.of("day");

    public static final Type MILLISECOND = JsEnum.of("millisecond");

    public static final Type MINUTE = JsEnum.of("minute");

    public static final Type MONTH = JsEnum.of("month");

    public static final Type SECOND = JsEnum.of("second");

    public static final Type WEEK = JsEnum.of("week");

    public static final Type YTD = JsEnum.of("ytd");
  }
}
