package com.github.fluorumlabs.disconnect.highcharts;

import javax.annotation.Nullable;
import js.extras.JsEnum;
import js.lang.Unknown;
import js.util.collections.Array;
import org.teavm.jso.JSProperty;

/**
 * (Highcharts, Highmaps) A <code>tilemap</code> series. If the type option is not
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
 * Options for all <code>tilemap</code> series are defined in plotOptions.tilemap.
 *
 * </li>
 * <li>
 * Options for one single series are given in the series instance array.
 *
 * </li>
 * </ol>
 * (see online documentation for example)
 *
 * @see <a href="https://api.highcharts.com/highcharts/series.tilemap">https://api.highcharts.com/highcharts/series.tilemap</a>
 * @see <a href="https://api.highcharts.com/highmaps/series.tilemap">https://api.highcharts.com/highmaps/series.tilemap</a>
 *
 */
public interface SeriesTilemapOptions extends PlotTilemapOptions, SeriesOptions {
  /**
   * (Highcharts, Highmaps) An array of data points for the series. For the
   * <code>tilemap</code> series type, points can be given in the following ways:
   *
   * <ol>
   * <li>
   * An array of arrays with 3 or 2 values. In this case, the values
   * correspond to <code>x,y,value</code>. If the first value is a string, it is applied
   * as the name of the point, and the <code>x</code> value is inferred. The <code>x</code> value
   * can also be omitted, in which case the inner arrays should be of length
   * 2 . Then the <code>x</code> value is automatically calculated, either starting at 0
   * and incremented by 1, or from <code>pointStart</code> and <code>pointInterval</code> given in
   * the series options.(see online documentation for example)
   *
   * </li>
   * <li>
   * An array of objects with named values. The objects are point
   * configuration objects as seen below. If the total number of data points
   * exceeds the series' turboThreshold, this option is not available.(see
   * online documentation for example)
   *
   * </li>
   * </ol>
   * Note that for some tileShapes the grid coordinates are offset.
   *
   * @see <a href="https://api.highcharts.com/highcharts/series.tilemap.data">https://api.highcharts.com/highcharts/series.tilemap.data</a>
   * @see <a href="https://api.highcharts.com/highmaps/series.tilemap.data">https://api.highcharts.com/highmaps/series.tilemap.data</a>
   *
   * @implspec data?: Array&lt;([(number|string), number]|[(number|string), number, number]|SeriesTilemapDataOptions)&gt;;
   *
   */
  @JSProperty("data")
  @Nullable
  Array<Unknown> getData();

  /**
   * (Highcharts, Highmaps) An array of data points for the series. For the
   * <code>tilemap</code> series type, points can be given in the following ways:
   *
   * <ol>
   * <li>
   * An array of arrays with 3 or 2 values. In this case, the values
   * correspond to <code>x,y,value</code>. If the first value is a string, it is applied
   * as the name of the point, and the <code>x</code> value is inferred. The <code>x</code> value
   * can also be omitted, in which case the inner arrays should be of length
   * 2 . Then the <code>x</code> value is automatically calculated, either starting at 0
   * and incremented by 1, or from <code>pointStart</code> and <code>pointInterval</code> given in
   * the series options.(see online documentation for example)
   *
   * </li>
   * <li>
   * An array of objects with named values. The objects are point
   * configuration objects as seen below. If the total number of data points
   * exceeds the series' turboThreshold, this option is not available.(see
   * online documentation for example)
   *
   * </li>
   * </ol>
   * Note that for some tileShapes the grid coordinates are offset.
   *
   * @see <a href="https://api.highcharts.com/highcharts/series.tilemap.data">https://api.highcharts.com/highcharts/series.tilemap.data</a>
   * @see <a href="https://api.highcharts.com/highmaps/series.tilemap.data">https://api.highcharts.com/highmaps/series.tilemap.data</a>
   *
   * @implspec data?: Array&lt;([(number|string), number]|[(number|string), number, number]|SeriesTilemapDataOptions)&gt;;
   *
   */
  @JSProperty("data")
  void setData(Array<Unknown> value);

  /**
   * (Highcharts, Highstock, Highmaps) This property is only in TypeScript
   * non-optional and might be <code>undefined</code> in series objects from unknown
   * sources.
   *
   * @implspec type: &quot;tilemap&quot;;
   *
   */
  @JSProperty("type")
  Type getType();

  /**
   * (Highcharts, Highstock, Highmaps) This property is only in TypeScript
   * non-optional and might be <code>undefined</code> in series objects from unknown
   * sources.
   *
   * @implspec type: &quot;tilemap&quot;;
   *
   */
  @JSProperty("type")
  void setType(Type value);

  /**
   */
  abstract class Type extends JsEnum {
    public static final Type TILEMAP = JsEnum.of("tilemap");
  }
}
