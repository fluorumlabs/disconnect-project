package com.github.fluorumlabs.disconnect.highcharts;

import java.lang.String;
import javax.annotation.Nullable;
import js.lang.Any;
import js.lang.Unknown;
import org.teavm.jso.JSProperty;

/**
 * (Highstock) The appearance of the point marker when selected. In order to
 * allow a point to be selected, set the <code>series.allowPointSelect</code> option to
 * true.
 *
 * @see <a href="https://api.highcharts.com/highstock/plotOptions.vbp.marker.states.select">https://api.highcharts.com/highstock/plotOptions.vbp.marker.states.select</a>
 *
 */
public interface PlotVbpMarkerStatesSelectOptions extends Any {
  /**
   * (Highstock) Enable or disable visible feedback for selection.
   *
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.vbp.marker.states.select.enabled">https://api.highcharts.com/highstock/plotOptions.vbp.marker.states.select.enabled</a>
   *
   * @implspec enabled?: boolean;
   *
   */
  @JSProperty("enabled")
  boolean getEnabled();

  /**
   * (Highstock) Enable or disable visible feedback for selection.
   *
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.vbp.marker.states.select.enabled">https://api.highcharts.com/highstock/plotOptions.vbp.marker.states.select.enabled</a>
   *
   * @implspec enabled?: boolean;
   *
   */
  @JSProperty("enabled")
  void setEnabled(boolean value);

  /**
   * (Highstock) The fill color of the point marker.
   *
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.vbp.marker.states.select.fillColor">https://api.highcharts.com/highstock/plotOptions.vbp.marker.states.select.fillColor</a>
   *
   * @implspec fillColor?: (ColorString|GradientColorObject|object);
   *
   */
  @JSProperty("fillColor")
  @Nullable
  Unknown getFillColor();

  /**
   * (Highstock) The fill color of the point marker.
   *
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.vbp.marker.states.select.fillColor">https://api.highcharts.com/highstock/plotOptions.vbp.marker.states.select.fillColor</a>
   *
   * @implspec fillColor?: (ColorString|GradientColorObject|object);
   *
   */
  @JSProperty("fillColor")
  void setFillColor(GradientColorObject value);

  /**
   * (Highstock) The fill color of the point marker.
   *
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.vbp.marker.states.select.fillColor">https://api.highcharts.com/highstock/plotOptions.vbp.marker.states.select.fillColor</a>
   *
   * @implspec fillColor?: (ColorString|GradientColorObject|object);
   *
   */
  @JSProperty("fillColor")
  void setFillColor(String value);

  /**
   * (Highstock) The fill color of the point marker.
   *
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.vbp.marker.states.select.fillColor">https://api.highcharts.com/highstock/plotOptions.vbp.marker.states.select.fillColor</a>
   *
   * @implspec fillColor?: (ColorString|GradientColorObject|object);
   *
   */
  @JSProperty("fillColor")
  void setFillColor(Any value);

  /**
   * (Highstock) The color of the point marker's outline. When <code>undefined</code>,
   * the series' or point's color is used.
   *
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.vbp.marker.states.select.lineColor">https://api.highcharts.com/highstock/plotOptions.vbp.marker.states.select.lineColor</a>
   *
   * @implspec lineColor?: ColorString;
   *
   */
  @JSProperty("lineColor")
  @Nullable
  String getLineColor();

  /**
   * (Highstock) The color of the point marker's outline. When <code>undefined</code>,
   * the series' or point's color is used.
   *
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.vbp.marker.states.select.lineColor">https://api.highcharts.com/highstock/plotOptions.vbp.marker.states.select.lineColor</a>
   *
   * @implspec lineColor?: ColorString;
   *
   */
  @JSProperty("lineColor")
  void setLineColor(String value);

  /**
   * (Highstock) The width of the point marker's outline.
   *
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.vbp.marker.states.select.lineWidth">https://api.highcharts.com/highstock/plotOptions.vbp.marker.states.select.lineWidth</a>
   *
   * @implspec lineWidth?: number;
   *
   */
  @JSProperty("lineWidth")
  double getLineWidth();

  /**
   * (Highstock) The width of the point marker's outline.
   *
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.vbp.marker.states.select.lineWidth">https://api.highcharts.com/highstock/plotOptions.vbp.marker.states.select.lineWidth</a>
   *
   * @implspec lineWidth?: number;
   *
   */
  @JSProperty("lineWidth")
  void setLineWidth(double value);

  /**
   * (Highstock) The radius of the point marker. In hover state, it defaults
   * to the normal state's radius + 2.
   *
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.vbp.marker.states.select.radius">https://api.highcharts.com/highstock/plotOptions.vbp.marker.states.select.radius</a>
   *
   * @implspec radius?: number;
   *
   */
  @JSProperty("radius")
  double getRadius();

  /**
   * (Highstock) The radius of the point marker. In hover state, it defaults
   * to the normal state's radius + 2.
   *
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.vbp.marker.states.select.radius">https://api.highcharts.com/highstock/plotOptions.vbp.marker.states.select.radius</a>
   *
   * @implspec radius?: number;
   *
   */
  @JSProperty("radius")
  void setRadius(double value);
}
