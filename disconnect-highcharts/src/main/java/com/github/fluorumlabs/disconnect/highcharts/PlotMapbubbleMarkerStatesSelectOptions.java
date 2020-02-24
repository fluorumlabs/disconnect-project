package com.github.fluorumlabs.disconnect.highcharts;

import java.lang.String;
import javax.annotation.Nullable;
import js.lang.Any;
import js.lang.Unknown;
import org.teavm.jso.JSProperty;

/**
 * (Highmaps) The appearance of the point marker when selected. In order to
 * allow a point to be selected, set the <code>series.allowPointSelect</code> option to
 * true.
 *
 * @see <a href="https://api.highcharts.com/highmaps/plotOptions.mapbubble.marker.states.select">https://api.highcharts.com/highmaps/plotOptions.mapbubble.marker.states.select</a>
 *
 */
public interface PlotMapbubbleMarkerStatesSelectOptions extends Any {
  /**
   * (Highmaps) Enable or disable visible feedback for selection.
   *
   * @see <a href="https://api.highcharts.com/highmaps/plotOptions.mapbubble.marker.states.select.enabled">https://api.highcharts.com/highmaps/plotOptions.mapbubble.marker.states.select.enabled</a>
   *
   * @implspec enabled?: boolean;
   *
   */
  @JSProperty("enabled")
  boolean getEnabled();

  /**
   * (Highmaps) Enable or disable visible feedback for selection.
   *
   * @see <a href="https://api.highcharts.com/highmaps/plotOptions.mapbubble.marker.states.select.enabled">https://api.highcharts.com/highmaps/plotOptions.mapbubble.marker.states.select.enabled</a>
   *
   * @implspec enabled?: boolean;
   *
   */
  @JSProperty("enabled")
  void setEnabled(boolean value);

  /**
   * (Highmaps) The fill color of the point marker.
   *
   * @see <a href="https://api.highcharts.com/highmaps/plotOptions.mapbubble.marker.states.select.fillColor">https://api.highcharts.com/highmaps/plotOptions.mapbubble.marker.states.select.fillColor</a>
   *
   * @implspec fillColor?: (ColorString|GradientColorObject|object);
   *
   */
  @JSProperty("fillColor")
  @Nullable
  Unknown getFillColor();

  /**
   * (Highmaps) The fill color of the point marker.
   *
   * @see <a href="https://api.highcharts.com/highmaps/plotOptions.mapbubble.marker.states.select.fillColor">https://api.highcharts.com/highmaps/plotOptions.mapbubble.marker.states.select.fillColor</a>
   *
   * @implspec fillColor?: (ColorString|GradientColorObject|object);
   *
   */
  @JSProperty("fillColor")
  void setFillColor(GradientColorObject value);

  /**
   * (Highmaps) The fill color of the point marker.
   *
   * @see <a href="https://api.highcharts.com/highmaps/plotOptions.mapbubble.marker.states.select.fillColor">https://api.highcharts.com/highmaps/plotOptions.mapbubble.marker.states.select.fillColor</a>
   *
   * @implspec fillColor?: (ColorString|GradientColorObject|object);
   *
   */
  @JSProperty("fillColor")
  void setFillColor(String value);

  /**
   * (Highmaps) The fill color of the point marker.
   *
   * @see <a href="https://api.highcharts.com/highmaps/plotOptions.mapbubble.marker.states.select.fillColor">https://api.highcharts.com/highmaps/plotOptions.mapbubble.marker.states.select.fillColor</a>
   *
   * @implspec fillColor?: (ColorString|GradientColorObject|object);
   *
   */
  @JSProperty("fillColor")
  void setFillColor(Any value);

  /**
   * (Highmaps) The color of the point marker's outline. When <code>undefined</code>, the
   * series' or point's color is used.
   *
   * @see <a href="https://api.highcharts.com/highmaps/plotOptions.mapbubble.marker.states.select.lineColor">https://api.highcharts.com/highmaps/plotOptions.mapbubble.marker.states.select.lineColor</a>
   *
   * @implspec lineColor?: ColorString;
   *
   */
  @JSProperty("lineColor")
  @Nullable
  String getLineColor();

  /**
   * (Highmaps) The color of the point marker's outline. When <code>undefined</code>, the
   * series' or point's color is used.
   *
   * @see <a href="https://api.highcharts.com/highmaps/plotOptions.mapbubble.marker.states.select.lineColor">https://api.highcharts.com/highmaps/plotOptions.mapbubble.marker.states.select.lineColor</a>
   *
   * @implspec lineColor?: ColorString;
   *
   */
  @JSProperty("lineColor")
  void setLineColor(String value);

  /**
   * (Highmaps) The width of the point marker's outline.
   *
   * @see <a href="https://api.highcharts.com/highmaps/plotOptions.mapbubble.marker.states.select.lineWidth">https://api.highcharts.com/highmaps/plotOptions.mapbubble.marker.states.select.lineWidth</a>
   *
   * @implspec lineWidth?: number;
   *
   */
  @JSProperty("lineWidth")
  double getLineWidth();

  /**
   * (Highmaps) The width of the point marker's outline.
   *
   * @see <a href="https://api.highcharts.com/highmaps/plotOptions.mapbubble.marker.states.select.lineWidth">https://api.highcharts.com/highmaps/plotOptions.mapbubble.marker.states.select.lineWidth</a>
   *
   * @implspec lineWidth?: number;
   *
   */
  @JSProperty("lineWidth")
  void setLineWidth(double value);

  /**
   * (Highmaps) The radius of the point marker. In hover state, it defaults to
   * the normal state's radius + 2.
   *
   * @see <a href="https://api.highcharts.com/highmaps/plotOptions.mapbubble.marker.states.select.radius">https://api.highcharts.com/highmaps/plotOptions.mapbubble.marker.states.select.radius</a>
   *
   * @implspec radius?: number;
   *
   */
  @JSProperty("radius")
  double getRadius();

  /**
   * (Highmaps) The radius of the point marker. In hover state, it defaults to
   * the normal state's radius + 2.
   *
   * @see <a href="https://api.highcharts.com/highmaps/plotOptions.mapbubble.marker.states.select.radius">https://api.highcharts.com/highmaps/plotOptions.mapbubble.marker.states.select.radius</a>
   *
   * @implspec radius?: number;
   *
   */
  @JSProperty("radius")
  void setRadius(double value);
}
