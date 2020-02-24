package com.github.fluorumlabs.disconnect.highcharts;

import java.lang.String;
import javax.annotation.Nullable;
import js.lang.Any;
import js.lang.Unknown;
import org.teavm.jso.JSProperty;

/**
 * (Highstock) Options for the point markers of line-like series. Properties
 * like <code>fillColor</code>, <code>lineColor</code> and <code>lineWidth</code> define the visual appearance of
 * the markers. Other series types, like column series, don't have markers, but
 * have visual options on the series level instead.
 *
 * In styled mode, the markers can be styled with the <code>.highcharts-point</code>,
 * <code>.highcharts-point-hover</code> and <code>.highcharts-point-select</code> class names.
 *
 * @see <a href="https://api.highcharts.com/highstock/plotOptions.sma.marker">https://api.highcharts.com/highstock/plotOptions.sma.marker</a>
 *
 */
public interface PlotSmaMarkerOptions extends Any {
  /**
   * (Highstock) Enable or disable the point marker. If <code>undefined</code>, the
   * markers are hidden when the data is dense, and shown for more widespread
   * data points.
   *
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.sma.marker.enabled">https://api.highcharts.com/highstock/plotOptions.sma.marker.enabled</a>
   *
   * @implspec enabled?: boolean;
   *
   */
  @JSProperty("enabled")
  boolean getEnabled();

  /**
   * (Highstock) Enable or disable the point marker. If <code>undefined</code>, the
   * markers are hidden when the data is dense, and shown for more widespread
   * data points.
   *
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.sma.marker.enabled">https://api.highcharts.com/highstock/plotOptions.sma.marker.enabled</a>
   *
   * @implspec enabled?: boolean;
   *
   */
  @JSProperty("enabled")
  void setEnabled(boolean value);

  /**
   * (Highstock) The threshold for how dense the point markers should be
   * before they are hidden, given that <code>enabled</code> is not defined. The number
   * indicates the horizontal distance between the two closest points in the
   * series, as multiples of the <code>marker.radius</code>. In other words, the default
   * value of 2 means points are hidden if overlapping horizontally.
   *
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.sma.marker.enabledThreshold">https://api.highcharts.com/highstock/plotOptions.sma.marker.enabledThreshold</a>
   *
   * @implspec enabledThreshold?: number;
   *
   */
  @JSProperty("enabledThreshold")
  double getEnabledThreshold();

  /**
   * (Highstock) The threshold for how dense the point markers should be
   * before they are hidden, given that <code>enabled</code> is not defined. The number
   * indicates the horizontal distance between the two closest points in the
   * series, as multiples of the <code>marker.radius</code>. In other words, the default
   * value of 2 means points are hidden if overlapping horizontally.
   *
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.sma.marker.enabledThreshold">https://api.highcharts.com/highstock/plotOptions.sma.marker.enabledThreshold</a>
   *
   * @implspec enabledThreshold?: number;
   *
   */
  @JSProperty("enabledThreshold")
  void setEnabledThreshold(double value);

  /**
   * (Highstock) The fill color of the point marker. When <code>undefined</code>, the
   * series' or point's color is used.
   *
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.sma.marker.fillColor">https://api.highcharts.com/highstock/plotOptions.sma.marker.fillColor</a>
   *
   * @implspec fillColor?: (ColorString|GradientColorObject|object);
   *
   */
  @JSProperty("fillColor")
  @Nullable
  Unknown getFillColor();

  /**
   * (Highstock) The fill color of the point marker. When <code>undefined</code>, the
   * series' or point's color is used.
   *
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.sma.marker.fillColor">https://api.highcharts.com/highstock/plotOptions.sma.marker.fillColor</a>
   *
   * @implspec fillColor?: (ColorString|GradientColorObject|object);
   *
   */
  @JSProperty("fillColor")
  void setFillColor(GradientColorObject value);

  /**
   * (Highstock) The fill color of the point marker. When <code>undefined</code>, the
   * series' or point's color is used.
   *
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.sma.marker.fillColor">https://api.highcharts.com/highstock/plotOptions.sma.marker.fillColor</a>
   *
   * @implspec fillColor?: (ColorString|GradientColorObject|object);
   *
   */
  @JSProperty("fillColor")
  void setFillColor(String value);

  /**
   * (Highstock) The fill color of the point marker. When <code>undefined</code>, the
   * series' or point's color is used.
   *
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.sma.marker.fillColor">https://api.highcharts.com/highstock/plotOptions.sma.marker.fillColor</a>
   *
   * @implspec fillColor?: (ColorString|GradientColorObject|object);
   *
   */
  @JSProperty("fillColor")
  void setFillColor(Any value);

  /**
   * (Highstock) Image markers only. Set the image width explicitly. When
   * using this option, a <code>width</code> must also be set.
   *
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.sma.marker.height">https://api.highcharts.com/highstock/plotOptions.sma.marker.height</a>
   *
   * @implspec height?: number;
   *
   */
  @JSProperty("height")
  double getHeight();

  /**
   * (Highstock) Image markers only. Set the image width explicitly. When
   * using this option, a <code>width</code> must also be set.
   *
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.sma.marker.height">https://api.highcharts.com/highstock/plotOptions.sma.marker.height</a>
   *
   * @implspec height?: number;
   *
   */
  @JSProperty("height")
  void setHeight(double value);

  /**
   * (Highstock) The color of the point marker's outline. When <code>undefined</code>,
   * the series' or point's color is used.
   *
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.sma.marker.lineColor">https://api.highcharts.com/highstock/plotOptions.sma.marker.lineColor</a>
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
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.sma.marker.lineColor">https://api.highcharts.com/highstock/plotOptions.sma.marker.lineColor</a>
   *
   * @implspec lineColor?: ColorString;
   *
   */
  @JSProperty("lineColor")
  void setLineColor(String value);

  /**
   * (Highstock) The width of the point marker's outline.
   *
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.sma.marker.lineWidth">https://api.highcharts.com/highstock/plotOptions.sma.marker.lineWidth</a>
   *
   * @implspec lineWidth?: number;
   *
   */
  @JSProperty("lineWidth")
  double getLineWidth();

  /**
   * (Highstock) The width of the point marker's outline.
   *
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.sma.marker.lineWidth">https://api.highcharts.com/highstock/plotOptions.sma.marker.lineWidth</a>
   *
   * @implspec lineWidth?: number;
   *
   */
  @JSProperty("lineWidth")
  void setLineWidth(double value);

  /**
   * (Highstock) The radius of the point marker.
   *
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.sma.marker.radius">https://api.highcharts.com/highstock/plotOptions.sma.marker.radius</a>
   *
   * @implspec radius?: number;
   *
   */
  @JSProperty("radius")
  double getRadius();

  /**
   * (Highstock) The radius of the point marker.
   *
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.sma.marker.radius">https://api.highcharts.com/highstock/plotOptions.sma.marker.radius</a>
   *
   * @implspec radius?: number;
   *
   */
  @JSProperty("radius")
  void setRadius(double value);

  /**
   * (Highstock) States for a single point marker.
   *
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.sma.marker.states">https://api.highcharts.com/highstock/plotOptions.sma.marker.states</a>
   *
   * @implspec states?: PlotSmaMarkerStatesOptions;
   *
   */
  @JSProperty("states")
  @Nullable
  PlotSmaMarkerStatesOptions getStates();

  /**
   * (Highstock) States for a single point marker.
   *
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.sma.marker.states">https://api.highcharts.com/highstock/plotOptions.sma.marker.states</a>
   *
   * @implspec states?: PlotSmaMarkerStatesOptions;
   *
   */
  @JSProperty("states")
  void setStates(PlotSmaMarkerStatesOptions value);

  /**
   * (Highstock) A predefined shape or symbol for the marker. When undefined,
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
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.sma.marker.symbol">https://api.highcharts.com/highstock/plotOptions.sma.marker.symbol</a>
   *
   * @implspec symbol?: string;
   *
   */
  @JSProperty("symbol")
  @Nullable
  String getSymbol();

  /**
   * (Highstock) A predefined shape or symbol for the marker. When undefined,
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
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.sma.marker.symbol">https://api.highcharts.com/highstock/plotOptions.sma.marker.symbol</a>
   *
   * @implspec symbol?: string;
   *
   */
  @JSProperty("symbol")
  void setSymbol(String value);

  /**
   * (Highstock) Image markers only. Set the image width explicitly. When
   * using this option, a <code>height</code> must also be set.
   *
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.sma.marker.width">https://api.highcharts.com/highstock/plotOptions.sma.marker.width</a>
   *
   * @implspec width?: number;
   *
   */
  @JSProperty("width")
  double getWidth();

  /**
   * (Highstock) Image markers only. Set the image width explicitly. When
   * using this option, a <code>height</code> must also be set.
   *
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.sma.marker.width">https://api.highcharts.com/highstock/plotOptions.sma.marker.width</a>
   *
   * @implspec width?: number;
   *
   */
  @JSProperty("width")
  void setWidth(double value);
}
