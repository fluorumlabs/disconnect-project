package com.github.fluorumlabs.disconnect.highcharts;

import java.lang.String;
import javax.annotation.Nullable;
import js.lang.Any;
import js.lang.Unknown;
import org.teavm.jso.JSProperty;

/**
 * (Highcharts) Options for the point markers of line-like series. Properties
 * like <code>fillColor</code>, <code>lineColor</code> and <code>lineWidth</code> define the visual appearance of
 * the markers. Other series types, like column series, don't have markers, but
 * have visual options on the series level instead.
 *
 * In styled mode, the markers can be styled with the <code>.highcharts-point</code>,
 * <code>.highcharts-point-hover</code> and <code>.highcharts-point-select</code> class names.
 *
 * @see <a href="https://api.highcharts.com/highcharts/plotOptions.pareto.marker">https://api.highcharts.com/highcharts/plotOptions.pareto.marker</a>
 *
 */
public interface PlotParetoMarkerOptions extends Any {
  /**
   * (Highcharts) Enable or disable the point marker. If <code>undefined</code>, the
   * markers are hidden when the data is dense, and shown for more widespread
   * data points.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.pareto.marker.enabled">https://api.highcharts.com/highcharts/plotOptions.pareto.marker.enabled</a>
   *
   * @implspec enabled?: boolean;
   *
   */
  @JSProperty("enabled")
  boolean getEnabled();

  /**
   * (Highcharts) Enable or disable the point marker. If <code>undefined</code>, the
   * markers are hidden when the data is dense, and shown for more widespread
   * data points.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.pareto.marker.enabled">https://api.highcharts.com/highcharts/plotOptions.pareto.marker.enabled</a>
   *
   * @implspec enabled?: boolean;
   *
   */
  @JSProperty("enabled")
  void setEnabled(boolean value);

  /**
   * (Highcharts) The threshold for how dense the point markers should be
   * before they are hidden, given that <code>enabled</code> is not defined. The number
   * indicates the horizontal distance between the two closest points in the
   * series, as multiples of the <code>marker.radius</code>. In other words, the default
   * value of 2 means points are hidden if overlapping horizontally.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.pareto.marker.enabledThreshold">https://api.highcharts.com/highcharts/plotOptions.pareto.marker.enabledThreshold</a>
   *
   * @implspec enabledThreshold?: number;
   *
   */
  @JSProperty("enabledThreshold")
  double getEnabledThreshold();

  /**
   * (Highcharts) The threshold for how dense the point markers should be
   * before they are hidden, given that <code>enabled</code> is not defined. The number
   * indicates the horizontal distance between the two closest points in the
   * series, as multiples of the <code>marker.radius</code>. In other words, the default
   * value of 2 means points are hidden if overlapping horizontally.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.pareto.marker.enabledThreshold">https://api.highcharts.com/highcharts/plotOptions.pareto.marker.enabledThreshold</a>
   *
   * @implspec enabledThreshold?: number;
   *
   */
  @JSProperty("enabledThreshold")
  void setEnabledThreshold(double value);

  /**
   * (Highcharts) The fill color of the point marker. When <code>undefined</code>, the
   * series' or point's color is used.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.pareto.marker.fillColor">https://api.highcharts.com/highcharts/plotOptions.pareto.marker.fillColor</a>
   *
   * @implspec fillColor?: (ColorString|GradientColorObject|object);
   *
   */
  @JSProperty("fillColor")
  @Nullable
  Unknown getFillColor();

  /**
   * (Highcharts) The fill color of the point marker. When <code>undefined</code>, the
   * series' or point's color is used.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.pareto.marker.fillColor">https://api.highcharts.com/highcharts/plotOptions.pareto.marker.fillColor</a>
   *
   * @implspec fillColor?: (ColorString|GradientColorObject|object);
   *
   */
  @JSProperty("fillColor")
  void setFillColor(GradientColorObject value);

  /**
   * (Highcharts) The fill color of the point marker. When <code>undefined</code>, the
   * series' or point's color is used.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.pareto.marker.fillColor">https://api.highcharts.com/highcharts/plotOptions.pareto.marker.fillColor</a>
   *
   * @implspec fillColor?: (ColorString|GradientColorObject|object);
   *
   */
  @JSProperty("fillColor")
  void setFillColor(String value);

  /**
   * (Highcharts) The fill color of the point marker. When <code>undefined</code>, the
   * series' or point's color is used.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.pareto.marker.fillColor">https://api.highcharts.com/highcharts/plotOptions.pareto.marker.fillColor</a>
   *
   * @implspec fillColor?: (ColorString|GradientColorObject|object);
   *
   */
  @JSProperty("fillColor")
  void setFillColor(Any value);

  /**
   * (Highcharts) Image markers only. Set the image width explicitly. When
   * using this option, a <code>width</code> must also be set.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.pareto.marker.height">https://api.highcharts.com/highcharts/plotOptions.pareto.marker.height</a>
   *
   * @implspec height?: number;
   *
   */
  @JSProperty("height")
  double getHeight();

  /**
   * (Highcharts) Image markers only. Set the image width explicitly. When
   * using this option, a <code>width</code> must also be set.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.pareto.marker.height">https://api.highcharts.com/highcharts/plotOptions.pareto.marker.height</a>
   *
   * @implspec height?: number;
   *
   */
  @JSProperty("height")
  void setHeight(double value);

  /**
   * (Highcharts) The color of the point marker's outline. When <code>undefined</code>,
   * the series' or point's color is used.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.pareto.marker.lineColor">https://api.highcharts.com/highcharts/plotOptions.pareto.marker.lineColor</a>
   *
   * @implspec lineColor?: ColorString;
   *
   */
  @JSProperty("lineColor")
  @Nullable
  String getLineColor();

  /**
   * (Highcharts) The color of the point marker's outline. When <code>undefined</code>,
   * the series' or point's color is used.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.pareto.marker.lineColor">https://api.highcharts.com/highcharts/plotOptions.pareto.marker.lineColor</a>
   *
   * @implspec lineColor?: ColorString;
   *
   */
  @JSProperty("lineColor")
  void setLineColor(String value);

  /**
   * (Highcharts) The width of the point marker's outline.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.pareto.marker.lineWidth">https://api.highcharts.com/highcharts/plotOptions.pareto.marker.lineWidth</a>
   *
   * @implspec lineWidth?: number;
   *
   */
  @JSProperty("lineWidth")
  double getLineWidth();

  /**
   * (Highcharts) The width of the point marker's outline.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.pareto.marker.lineWidth">https://api.highcharts.com/highcharts/plotOptions.pareto.marker.lineWidth</a>
   *
   * @implspec lineWidth?: number;
   *
   */
  @JSProperty("lineWidth")
  void setLineWidth(double value);

  /**
   * (Highcharts) The radius of the point marker.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.pareto.marker.radius">https://api.highcharts.com/highcharts/plotOptions.pareto.marker.radius</a>
   *
   * @implspec radius?: number;
   *
   */
  @JSProperty("radius")
  double getRadius();

  /**
   * (Highcharts) The radius of the point marker.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.pareto.marker.radius">https://api.highcharts.com/highcharts/plotOptions.pareto.marker.radius</a>
   *
   * @implspec radius?: number;
   *
   */
  @JSProperty("radius")
  void setRadius(double value);

  /**
   * (Highcharts) States for a single point marker.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.pareto.marker.states">https://api.highcharts.com/highcharts/plotOptions.pareto.marker.states</a>
   *
   * @implspec states?: PlotParetoMarkerStatesOptions;
   *
   */
  @JSProperty("states")
  @Nullable
  PlotParetoMarkerStatesOptions getStates();

  /**
   * (Highcharts) States for a single point marker.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.pareto.marker.states">https://api.highcharts.com/highcharts/plotOptions.pareto.marker.states</a>
   *
   * @implspec states?: PlotParetoMarkerStatesOptions;
   *
   */
  @JSProperty("states")
  void setStates(PlotParetoMarkerStatesOptions value);

  /**
   * (Highcharts) A predefined shape or symbol for the marker. When undefined,
   * the symbol is pulled from options.symbols. Other possible values are
   * &quot;circle&quot;, &quot;square&quot;, &quot;diamond&quot;, &quot;triangle&quot; and &quot;triangle-down&quot;.
   *
   * Additionally, the URL to a graphic can be given on this form:
   * &quot;url(graphic.png)&quot;. Note that for the image to be applied to exported
   * charts, its URL needs to be accessible by the export server.
   *
   * Custom callbacks for symbol path generation can also be added to
   * <code>Highcharts.SVGRenderer.prototype.symbols</code>. The callback is then used by
   * its method name, as shown in the demo.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.pareto.marker.symbol">https://api.highcharts.com/highcharts/plotOptions.pareto.marker.symbol</a>
   *
   * @implspec symbol?: string;
   *
   */
  @JSProperty("symbol")
  @Nullable
  String getSymbol();

  /**
   * (Highcharts) A predefined shape or symbol for the marker. When undefined,
   * the symbol is pulled from options.symbols. Other possible values are
   * &quot;circle&quot;, &quot;square&quot;, &quot;diamond&quot;, &quot;triangle&quot; and &quot;triangle-down&quot;.
   *
   * Additionally, the URL to a graphic can be given on this form:
   * &quot;url(graphic.png)&quot;. Note that for the image to be applied to exported
   * charts, its URL needs to be accessible by the export server.
   *
   * Custom callbacks for symbol path generation can also be added to
   * <code>Highcharts.SVGRenderer.prototype.symbols</code>. The callback is then used by
   * its method name, as shown in the demo.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.pareto.marker.symbol">https://api.highcharts.com/highcharts/plotOptions.pareto.marker.symbol</a>
   *
   * @implspec symbol?: string;
   *
   */
  @JSProperty("symbol")
  void setSymbol(String value);

  /**
   * (Highcharts) Image markers only. Set the image width explicitly. When
   * using this option, a <code>height</code> must also be set.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.pareto.marker.width">https://api.highcharts.com/highcharts/plotOptions.pareto.marker.width</a>
   *
   * @implspec width?: number;
   *
   */
  @JSProperty("width")
  double getWidth();

  /**
   * (Highcharts) Image markers only. Set the image width explicitly. When
   * using this option, a <code>height</code> must also be set.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.pareto.marker.width">https://api.highcharts.com/highcharts/plotOptions.pareto.marker.width</a>
   *
   * @implspec width?: number;
   *
   */
  @JSProperty("width")
  void setWidth(double value);
}
