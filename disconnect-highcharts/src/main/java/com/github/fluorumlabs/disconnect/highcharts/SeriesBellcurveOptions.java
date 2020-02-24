package com.github.fluorumlabs.disconnect.highcharts;

import js.extras.JsEnum;
import org.teavm.jso.JSProperty;

/**
 * (Highcharts) A <code>bellcurve</code> series. If the type option is not specified, it is
 * inherited from chart.type.
 *
 * For options that apply to multiple series, it is recommended to add them to
 * the plotOptions.series options structure. To apply to all series of this
 * specific type, apply it to plotOptions.bellcurve.
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
 * Options for all <code>bellcurve</code> series are defined in plotOptions.bellcurve.
 *
 * </li>
 * <li>
 * Options for one single series are given in the series instance array.
 *
 * </li>
 * </ol>
 * (see online documentation for example)
 *
 * @see <a href="https://api.highcharts.com/highcharts/series.bellcurve">https://api.highcharts.com/highcharts/series.bellcurve</a>
 *
 */
public interface SeriesBellcurveOptions extends PlotBellcurveOptions, SeriesOptions {
  /**
   * (Highcharts, Highstock, Highmaps) This property is only in TypeScript
   * non-optional and might be <code>undefined</code> in series objects from unknown
   * sources.
   *
   * @implspec type: &quot;bellcurve&quot;;
   *
   */
  @JSProperty("type")
  Type getType();

  /**
   * (Highcharts, Highstock, Highmaps) This property is only in TypeScript
   * non-optional and might be <code>undefined</code> in series objects from unknown
   * sources.
   *
   * @implspec type: &quot;bellcurve&quot;;
   *
   */
  @JSProperty("type")
  void setType(Type value);

  /**
   */
  abstract class Type extends JsEnum {
    public static final Type BELLCURVE = JsEnum.of("bellcurve");
  }
}
