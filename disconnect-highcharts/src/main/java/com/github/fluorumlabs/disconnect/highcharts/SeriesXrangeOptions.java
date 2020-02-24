package com.github.fluorumlabs.disconnect.highcharts;

import javax.annotation.Nullable;
import js.extras.JsEnum;
import js.util.collections.Array;
import org.teavm.jso.JSProperty;

/**
 * (Highcharts, Highstock, Gantt) An <code>xrange</code> series. If the type option is not
 * specified, it is inherited from chart.type.
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
 * Options for all <code>xrange</code> series are defined in plotOptions.xrange.
 *
 * </li>
 * <li>
 * Options for one single series are given in the series instance array.
 *
 * </li>
 * </ol>
 * (see online documentation for example)
 *
 * @see <a href="https://api.highcharts.com/highcharts/series.xrange">https://api.highcharts.com/highcharts/series.xrange</a>
 * @see <a href="https://api.highcharts.com/highstock/series.xrange">https://api.highcharts.com/highstock/series.xrange</a>
 * @see <a href="https://api.highcharts.com/gantt/series.xrange">https://api.highcharts.com/gantt/series.xrange</a>
 *
 */
public interface SeriesXrangeOptions extends PlotXrangeOptions, SeriesOptions {
  /**
   * (Highcharts, Highstock, Gantt) An array of data points for the series.
   * For the <code>xrange</code> series type, points can be given in the following ways:
   *
   * <ol>
   * <li>An array of objects with named values. The objects are point
   * configuration objects as seen below.(see online documentation for
   * example)</li>
   * </ol>
   * @see <a href="https://api.highcharts.com/highcharts/series.xrange.data">https://api.highcharts.com/highcharts/series.xrange.data</a>
   * @see <a href="https://api.highcharts.com/highstock/series.xrange.data">https://api.highcharts.com/highstock/series.xrange.data</a>
   * @see <a href="https://api.highcharts.com/gantt/series.xrange.data">https://api.highcharts.com/gantt/series.xrange.data</a>
   *
   * @implspec data?: Array<SeriesXrangeDataOptions>;
   *
   */
  @JSProperty("data")
  @Nullable
  Array<SeriesXrangeDataOptions> getData();

  /**
   * (Highcharts, Highstock, Gantt) An array of data points for the series.
   * For the <code>xrange</code> series type, points can be given in the following ways:
   *
   * <ol>
   * <li>An array of objects with named values. The objects are point
   * configuration objects as seen below.(see online documentation for
   * example)</li>
   * </ol>
   * @see <a href="https://api.highcharts.com/highcharts/series.xrange.data">https://api.highcharts.com/highcharts/series.xrange.data</a>
   * @see <a href="https://api.highcharts.com/highstock/series.xrange.data">https://api.highcharts.com/highstock/series.xrange.data</a>
   * @see <a href="https://api.highcharts.com/gantt/series.xrange.data">https://api.highcharts.com/gantt/series.xrange.data</a>
   *
   * @implspec data?: Array<SeriesXrangeDataOptions>;
   *
   */
  @JSProperty("data")
  void setData(Array<SeriesXrangeDataOptions> value);

  /**
   * (Highcharts, Highstock, Highmaps) This property is only in TypeScript
   * non-optional and might be <code>undefined</code> in series objects from unknown
   * sources.
   *
   * @implspec type: &quot;xrange&quot;;
   *
   */
  @JSProperty("type")
  Type getType();

  /**
   * (Highcharts, Highstock, Highmaps) This property is only in TypeScript
   * non-optional and might be <code>undefined</code> in series objects from unknown
   * sources.
   *
   * @implspec type: &quot;xrange&quot;;
   *
   */
  @JSProperty("type")
  void setType(Type value);

  /**
   */
  abstract class Type extends JsEnum {
    public static final Type XRANGE = JsEnum.of("xrange");
  }
}
