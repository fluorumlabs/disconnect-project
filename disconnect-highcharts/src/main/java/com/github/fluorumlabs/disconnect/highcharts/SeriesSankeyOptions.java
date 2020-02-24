package com.github.fluorumlabs.disconnect.highcharts;

import javax.annotation.Nullable;
import js.extras.JsEnum;
import js.util.collections.Array;
import org.teavm.jso.JSProperty;

/**
 * (Highcharts) A <code>sankey</code> series. If the type option is not specified, it is
 * inherited from chart.type.
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
 * Options for all <code>sankey</code> series are defined in plotOptions.sankey.
 *
 * </li>
 * <li>
 * Options for one single series are given in the series instance array.
 *
 * </li>
 * </ol>
 * (see online documentation for example)
 *
 * @see <a href="https://api.highcharts.com/highcharts/series.sankey">https://api.highcharts.com/highcharts/series.sankey</a>
 *
 */
public interface SeriesSankeyOptions extends PlotSankeyOptions, SeriesOptions {
  /**
   * (Highcharts) An array of data points for the series. For the <code>sankey</code>
   * series type, points can be given in the following way:
   *
   * An array of objects with named values. The following snippet shows only a
   * few settings, see the complete options set below. If the total number of
   * data points exceeds the series' turboThreshold, this option is not
   * available.(see online documentation for example)
   *
   * @see <a href="https://api.highcharts.com/highcharts/series.sankey.data">https://api.highcharts.com/highcharts/series.sankey.data</a>
   *
   * @implspec data?: Array<SeriesSankeyDataOptions>;
   *
   */
  @JSProperty("data")
  @Nullable
  Array<SeriesSankeyDataOptions> getData();

  /**
   * (Highcharts) An array of data points for the series. For the <code>sankey</code>
   * series type, points can be given in the following way:
   *
   * An array of objects with named values. The following snippet shows only a
   * few settings, see the complete options set below. If the total number of
   * data points exceeds the series' turboThreshold, this option is not
   * available.(see online documentation for example)
   *
   * @see <a href="https://api.highcharts.com/highcharts/series.sankey.data">https://api.highcharts.com/highcharts/series.sankey.data</a>
   *
   * @implspec data?: Array<SeriesSankeyDataOptions>;
   *
   */
  @JSProperty("data")
  void setData(Array<SeriesSankeyDataOptions> value);

  /**
   * (Highcharts, Highstock, Highmaps) This property is only in TypeScript
   * non-optional and might be <code>undefined</code> in series objects from unknown
   * sources.
   *
   * @implspec type: &quot;sankey&quot;;
   *
   */
  @JSProperty("type")
  Type getType();

  /**
   * (Highcharts, Highstock, Highmaps) This property is only in TypeScript
   * non-optional and might be <code>undefined</code> in series objects from unknown
   * sources.
   *
   * @implspec type: &quot;sankey&quot;;
   *
   */
  @JSProperty("type")
  void setType(Type value);

  /**
   */
  abstract class Type extends JsEnum {
    public static final Type SANKEY = JsEnum.of("sankey");
  }
}
