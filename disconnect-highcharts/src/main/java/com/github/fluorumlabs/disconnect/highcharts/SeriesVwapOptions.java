package com.github.fluorumlabs.disconnect.highcharts;

import js.extras.JsEnum;
import org.teavm.jso.JSProperty;

/**
 * (Highstock) A <code>Volume Weighted Average Price (VWAP)</code> series. If the type
 * option is not specified, it is inherited from chart.type.
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
 * Options for all <code>vwap</code> series are defined in plotOptions.vwap.
 *
 * </li>
 * <li>
 * Options for one single series are given in the series instance array.
 *
 * </li>
 * </ol>
 * (see online documentation for example)
 *
 * @see <a href="https://api.highcharts.com/highstock/series.vwap">https://api.highcharts.com/highstock/series.vwap</a>
 *
 */
public interface SeriesVwapOptions extends PlotVwapOptions, SeriesOptions {
  /**
   * (Highcharts, Highstock, Highmaps) This property is only in TypeScript
   * non-optional and might be <code>undefined</code> in series objects from unknown
   * sources.
   *
   * @implspec type: &quot;vwap&quot;;
   *
   */
  @JSProperty("type")
  Type getType();

  /**
   * (Highcharts, Highstock, Highmaps) This property is only in TypeScript
   * non-optional and might be <code>undefined</code> in series objects from unknown
   * sources.
   *
   * @implspec type: &quot;vwap&quot;;
   *
   */
  @JSProperty("type")
  void setType(Type value);

  /**
   */
  abstract class Type extends JsEnum {
    public static final Type VWAP = JsEnum.of("vwap");
  }
}
