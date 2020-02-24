package com.github.fluorumlabs.disconnect.highcharts;

import java.lang.String;
import javax.annotation.Nullable;
import js.lang.Any;
import js.lang.Unknown;
import org.teavm.jso.JSProperty;

/**
 * (Gantt) Progress indicator, how much of the task completed. If it is a
 * number, the <code>fill</code> will be applied automatically.
 *
 * @see <a href="https://api.highcharts.com/gantt/series.gantt.data.completed">https://api.highcharts.com/gantt/series.gantt.data.completed</a>
 *
 */
public interface SeriesGanttDataCompletedOptions extends Any {
  /**
   * (Highcharts, Highstock, Gantt) The amount of the progress indicator,
   * ranging from 0 (not started) to 1 (finished).
   *
   * @see <a href="https://api.highcharts.com/highcharts/series.gantt.data.completed.amount">https://api.highcharts.com/highcharts/series.gantt.data.completed.amount</a>
   * @see <a href="https://api.highcharts.com/highstock/series.gantt.data.completed.amount">https://api.highcharts.com/highstock/series.gantt.data.completed.amount</a>
   * @see <a href="https://api.highcharts.com/gantt/series.gantt.data.completed.amount">https://api.highcharts.com/gantt/series.gantt.data.completed.amount</a>
   *
   * @implspec amount?: number;
   *
   */
  @JSProperty("amount")
  double getAmount();

  /**
   * (Highcharts, Highstock, Gantt) The amount of the progress indicator,
   * ranging from 0 (not started) to 1 (finished).
   *
   * @see <a href="https://api.highcharts.com/highcharts/series.gantt.data.completed.amount">https://api.highcharts.com/highcharts/series.gantt.data.completed.amount</a>
   * @see <a href="https://api.highcharts.com/highstock/series.gantt.data.completed.amount">https://api.highcharts.com/highstock/series.gantt.data.completed.amount</a>
   * @see <a href="https://api.highcharts.com/gantt/series.gantt.data.completed.amount">https://api.highcharts.com/gantt/series.gantt.data.completed.amount</a>
   *
   * @implspec amount?: number;
   *
   */
  @JSProperty("amount")
  void setAmount(double value);

  /**
   * (Highcharts, Highstock, Gantt) The fill of the progress indicator.
   * Defaults to a darkened variety of the main color.
   *
   * @see <a href="https://api.highcharts.com/highcharts/series.gantt.data.completed.fill">https://api.highcharts.com/highcharts/series.gantt.data.completed.fill</a>
   * @see <a href="https://api.highcharts.com/highstock/series.gantt.data.completed.fill">https://api.highcharts.com/highstock/series.gantt.data.completed.fill</a>
   * @see <a href="https://api.highcharts.com/gantt/series.gantt.data.completed.fill">https://api.highcharts.com/gantt/series.gantt.data.completed.fill</a>
   *
   * @implspec fill?: (ColorString|GradientColorObject);
   *
   */
  @JSProperty("fill")
  @Nullable
  Unknown getFill();

  /**
   * (Highcharts, Highstock, Gantt) The fill of the progress indicator.
   * Defaults to a darkened variety of the main color.
   *
   * @see <a href="https://api.highcharts.com/highcharts/series.gantt.data.completed.fill">https://api.highcharts.com/highcharts/series.gantt.data.completed.fill</a>
   * @see <a href="https://api.highcharts.com/highstock/series.gantt.data.completed.fill">https://api.highcharts.com/highstock/series.gantt.data.completed.fill</a>
   * @see <a href="https://api.highcharts.com/gantt/series.gantt.data.completed.fill">https://api.highcharts.com/gantt/series.gantt.data.completed.fill</a>
   *
   * @implspec fill?: (ColorString|GradientColorObject);
   *
   */
  @JSProperty("fill")
  void setFill(GradientColorObject value);

  /**
   * (Highcharts, Highstock, Gantt) The fill of the progress indicator.
   * Defaults to a darkened variety of the main color.
   *
   * @see <a href="https://api.highcharts.com/highcharts/series.gantt.data.completed.fill">https://api.highcharts.com/highcharts/series.gantt.data.completed.fill</a>
   * @see <a href="https://api.highcharts.com/highstock/series.gantt.data.completed.fill">https://api.highcharts.com/highstock/series.gantt.data.completed.fill</a>
   * @see <a href="https://api.highcharts.com/gantt/series.gantt.data.completed.fill">https://api.highcharts.com/gantt/series.gantt.data.completed.fill</a>
   *
   * @implspec fill?: (ColorString|GradientColorObject);
   *
   */
  @JSProperty("fill")
  void setFill(String value);
}
