package com.github.fluorumlabs.disconnect.highcharts;

import js.extras.JsEnum;
import org.teavm.jso.JSProperty;

/**
 * (Highstock) A <code>ROC</code> series. If the type option is not specified, it is
 * inherited from chart.type.
 *
 * Rate of change indicator (ROC). The indicator value for each point is defined
 * as:
 *
 * <code>(C - Cn) / Cn * 100</code>
 *
 * where: <code>C</code> is the close value of the point of the same x in the linked series
 * and <code>Cn</code> is the close value of the point <code>n</code> periods ago. <code>n</code> is set through
 * period.
 *
 * This series requires <code>linkedTo</code> option to be set.
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
 * Options for all <code>roc</code> series are defined in plotOptions.roc.
 *
 * </li>
 * <li>
 * Options for one single series are given in the series instance array.
 *
 * </li>
 * </ol>
 * (see online documentation for example)
 *
 * @see <a href="https://api.highcharts.com/highstock/series.roc">https://api.highcharts.com/highstock/series.roc</a>
 *
 */
public interface SeriesRocOptions extends PlotRocOptions, SeriesOptions {
  /**
   * (Highcharts, Highstock, Highmaps) This property is only in TypeScript
   * non-optional and might be <code>undefined</code> in series objects from unknown
   * sources.
   *
   * @implspec type: &quot;roc&quot;;
   *
   */
  @JSProperty("type")
  Type getType();

  /**
   * (Highcharts, Highstock, Highmaps) This property is only in TypeScript
   * non-optional and might be <code>undefined</code> in series objects from unknown
   * sources.
   *
   * @implspec type: &quot;roc&quot;;
   *
   */
  @JSProperty("type")
  void setType(Type value);

  /**
   */
  abstract class Type extends JsEnum {
    public static final Type ROC = JsEnum.of("roc");
  }
}
