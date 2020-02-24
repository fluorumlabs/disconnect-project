package com.github.fluorumlabs.disconnect.highcharts;

import javax.annotation.Nullable;
import js.extras.JsEnum;
import js.util.collections.Array;
import org.teavm.jso.JSProperty;

/**
 * (Gantt) A <code>gantt</code> series.
 *
 * Configuration options for the series are given in three levels:
 *
 * <ol>
 * <li>
 * Options for all series in a chart are defined in the plotOptions.series
 * object.
 *
 * </li>
 * <li>
 * Options for all <code>gantt</code> series are defined in plotOptions.gantt.
 *
 * </li>
 * <li>
 * Options for one single series are given in the series instance array.
 *
 * </li>
 * </ol>
 * (see online documentation for example)
 *
 * @see <a href="https://api.highcharts.com/gantt/series.gantt">https://api.highcharts.com/gantt/series.gantt</a>
 *
 */
public interface SeriesGanttOptions extends PlotGanttOptions, SeriesOptions {
  /**
   * (Gantt) Data for a Gantt series.
   *
   * @see <a href="https://api.highcharts.com/gantt/series.gantt.data">https://api.highcharts.com/gantt/series.gantt.data</a>
   *
   * @implspec data?: Array<SeriesGanttDataOptions>;
   *
   */
  @JSProperty("data")
  @Nullable
  Array<SeriesGanttDataOptions> getData();

  /**
   * (Gantt) Data for a Gantt series.
   *
   * @see <a href="https://api.highcharts.com/gantt/series.gantt.data">https://api.highcharts.com/gantt/series.gantt.data</a>
   *
   * @implspec data?: Array<SeriesGanttDataOptions>;
   *
   */
  @JSProperty("data")
  void setData(Array<SeriesGanttDataOptions> value);

  /**
   * (Highcharts, Highstock, Highmaps) This property is only in TypeScript
   * non-optional and might be <code>undefined</code> in series objects from unknown
   * sources.
   *
   * @implspec type: &quot;gantt&quot;;
   *
   */
  @JSProperty("type")
  Type getType();

  /**
   * (Highcharts, Highstock, Highmaps) This property is only in TypeScript
   * non-optional and might be <code>undefined</code> in series objects from unknown
   * sources.
   *
   * @implspec type: &quot;gantt&quot;;
   *
   */
  @JSProperty("type")
  void setType(Type value);

  /**
   */
  abstract class Type extends JsEnum {
    public static final Type GANTT = JsEnum.of("gantt");
  }
}
