package com.github.fluorumlabs.disconnect.highcharts;

import javax.annotation.Nullable;
import js.extras.JsEnum;
import js.util.collections.Array;
import org.teavm.jso.JSProperty;

/**
 * (Highstock) A <code>flags</code> series. If the type option is not specified, it is
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
 * Options for all <code>flags</code> series are defined in plotOptions.flags.
 *
 * </li>
 * <li>
 * Options for one single series are given in the series instance array.
 *
 * </li>
 * </ol>
 * (see online documentation for example)
 *
 * @see <a href="https://api.highcharts.com/highstock/series.flags">https://api.highcharts.com/highstock/series.flags</a>
 *
 */
public interface SeriesFlagsOptions extends PlotFlagsOptions, SeriesOptions {
  /**
   * (Highstock) An array of data points for the series. For the <code>flags</code>
   * series type, points can be given in the following ways:
   *
   * <ol>
   * <li>An array of objects with named values. The following snippet shows
   * only a few settings, see the complete options set below. If the total
   * number of data points exceeds the series' turboThreshold, this option is
   * not available.</li>
   * </ol>
   * <pre><code class="language-js">&quot;B&quot;, text: &quot;Second event&quot; }]&lt;/pre&gt;
   *
   * @see https://api.highcharts.com/highstock/series.flags.data
   *
   * @implspec data?: Array&lt;SeriesFlagsDataOptions&gt;;</code></pre>
   */
  @JSProperty("data")
  @Nullable
  Array<SeriesFlagsDataOptions> getData();

  /**
   * (Highstock) An array of data points for the series. For the <code>flags</code>
   * series type, points can be given in the following ways:
   *
   * <ol>
   * <li>An array of objects with named values. The following snippet shows
   * only a few settings, see the complete options set below. If the total
   * number of data points exceeds the series' turboThreshold, this option is
   * not available.</li>
   * </ol>
   * <pre><code class="language-js">&quot;B&quot;, text: &quot;Second event&quot; }]&lt;/pre&gt;
   *
   * @see https://api.highcharts.com/highstock/series.flags.data
   *
   * @implspec data?: Array&lt;SeriesFlagsDataOptions&gt;;</code></pre>
   */
  @JSProperty("data")
  void setData(Array<SeriesFlagsDataOptions> value);

  /**
   * (Highcharts, Highstock, Highmaps) This property is only in TypeScript
   * non-optional and might be <code>undefined</code> in series objects from unknown
   * sources.
   *
   * @implspec type: &quot;flags&quot;;
   *
   */
  @JSProperty("type")
  Type getType();

  /**
   * (Highcharts, Highstock, Highmaps) This property is only in TypeScript
   * non-optional and might be <code>undefined</code> in series objects from unknown
   * sources.
   *
   * @implspec type: &quot;flags&quot;;
   *
   */
  @JSProperty("type")
  void setType(Type value);

  /**
   */
  abstract class Type extends JsEnum {
    public static final Type FLAGS = JsEnum.of("flags");
  }
}
