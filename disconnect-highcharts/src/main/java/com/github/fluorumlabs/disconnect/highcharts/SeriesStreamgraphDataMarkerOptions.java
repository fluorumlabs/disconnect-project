package com.github.fluorumlabs.disconnect.highcharts;

import java.lang.String;
import javax.annotation.Nullable;
import js.lang.Any;
import js.lang.Unknown;
import org.teavm.jso.JSProperty;

/**
 * (Highcharts, Highstock) Options for the point markers of line-like series.
 * Properties like <code>fillColor</code>, <code>lineColor</code> and <code>lineWidth</code> define the visual
 * appearance of the markers. Other series types, like column series, don't have
 * markers, but have visual options on the series level instead.
 *
 * In styled mode, the markers can be styled with the <code>.highcharts-point</code>,
 * <code>.highcharts-point-hover</code> and <code>.highcharts-point-select</code> class names.
 *
 * @see <a href="https://api.highcharts.com/highcharts/series.streamgraph.data.marker">https://api.highcharts.com/highcharts/series.streamgraph.data.marker</a>
 * @see <a href="https://api.highcharts.com/highstock/series.streamgraph.data.marker">https://api.highcharts.com/highstock/series.streamgraph.data.marker</a>
 *
 */
public interface SeriesStreamgraphDataMarkerOptions extends Any {
  /**
   * (Highcharts, Highstock, Highmaps) Enable or disable the point marker. If
   * <code>undefined</code>, the markers are hidden when the data is dense, and shown for
   * more widespread data points.
   *
   * @see <a href="https://api.highcharts.com/highcharts/series.streamgraph.data.marker.enabled">https://api.highcharts.com/highcharts/series.streamgraph.data.marker.enabled</a>
   * @see <a href="https://api.highcharts.com/highstock/series.streamgraph.data.marker.enabled">https://api.highcharts.com/highstock/series.streamgraph.data.marker.enabled</a>
   * @see <a href="https://api.highcharts.com/highmaps/series.streamgraph.data.marker.enabled">https://api.highcharts.com/highmaps/series.streamgraph.data.marker.enabled</a>
   *
   * @implspec enabled?: boolean;
   *
   */
  @JSProperty("enabled")
  boolean getEnabled();

  /**
   * (Highcharts, Highstock, Highmaps) Enable or disable the point marker. If
   * <code>undefined</code>, the markers are hidden when the data is dense, and shown for
   * more widespread data points.
   *
   * @see <a href="https://api.highcharts.com/highcharts/series.streamgraph.data.marker.enabled">https://api.highcharts.com/highcharts/series.streamgraph.data.marker.enabled</a>
   * @see <a href="https://api.highcharts.com/highstock/series.streamgraph.data.marker.enabled">https://api.highcharts.com/highstock/series.streamgraph.data.marker.enabled</a>
   * @see <a href="https://api.highcharts.com/highmaps/series.streamgraph.data.marker.enabled">https://api.highcharts.com/highmaps/series.streamgraph.data.marker.enabled</a>
   *
   * @implspec enabled?: boolean;
   *
   */
  @JSProperty("enabled")
  void setEnabled(boolean value);

  /**
   * (Highcharts, Highstock, Highmaps) The threshold for how dense the point
   * markers should be before they are hidden, given that <code>enabled</code> is not
   * defined. The number indicates the horizontal distance between the two
   * closest points in the series, as multiples of the <code>marker.radius</code>. In
   * other words, the default value of 2 means points are hidden if
   * overlapping horizontally.
   *
   * @see <a href="https://api.highcharts.com/highcharts/series.streamgraph.data.marker.enabledThreshold">https://api.highcharts.com/highcharts/series.streamgraph.data.marker.enabledThreshold</a>
   * @see <a href="https://api.highcharts.com/highstock/series.streamgraph.data.marker.enabledThreshold">https://api.highcharts.com/highstock/series.streamgraph.data.marker.enabledThreshold</a>
   * @see <a href="https://api.highcharts.com/highmaps/series.streamgraph.data.marker.enabledThreshold">https://api.highcharts.com/highmaps/series.streamgraph.data.marker.enabledThreshold</a>
   *
   * @implspec enabledThreshold?: number;
   *
   */
  @JSProperty("enabledThreshold")
  double getEnabledThreshold();

  /**
   * (Highcharts, Highstock, Highmaps) The threshold for how dense the point
   * markers should be before they are hidden, given that <code>enabled</code> is not
   * defined. The number indicates the horizontal distance between the two
   * closest points in the series, as multiples of the <code>marker.radius</code>. In
   * other words, the default value of 2 means points are hidden if
   * overlapping horizontally.
   *
   * @see <a href="https://api.highcharts.com/highcharts/series.streamgraph.data.marker.enabledThreshold">https://api.highcharts.com/highcharts/series.streamgraph.data.marker.enabledThreshold</a>
   * @see <a href="https://api.highcharts.com/highstock/series.streamgraph.data.marker.enabledThreshold">https://api.highcharts.com/highstock/series.streamgraph.data.marker.enabledThreshold</a>
   * @see <a href="https://api.highcharts.com/highmaps/series.streamgraph.data.marker.enabledThreshold">https://api.highcharts.com/highmaps/series.streamgraph.data.marker.enabledThreshold</a>
   *
   * @implspec enabledThreshold?: number;
   *
   */
  @JSProperty("enabledThreshold")
  void setEnabledThreshold(double value);

  /**
   * (Highcharts, Highstock, Highmaps) The fill color of the point marker.
   * When <code>undefined</code>, the series' or point's color is used.
   *
   * @see <a href="https://api.highcharts.com/highcharts/series.streamgraph.data.marker.fillColor">https://api.highcharts.com/highcharts/series.streamgraph.data.marker.fillColor</a>
   * @see <a href="https://api.highcharts.com/highstock/series.streamgraph.data.marker.fillColor">https://api.highcharts.com/highstock/series.streamgraph.data.marker.fillColor</a>
   * @see <a href="https://api.highcharts.com/highmaps/series.streamgraph.data.marker.fillColor">https://api.highcharts.com/highmaps/series.streamgraph.data.marker.fillColor</a>
   *
   * @implspec fillColor?: (ColorString|GradientColorObject|object);
   *
   */
  @JSProperty("fillColor")
  @Nullable
  Unknown getFillColor();

  /**
   * (Highcharts, Highstock, Highmaps) The fill color of the point marker.
   * When <code>undefined</code>, the series' or point's color is used.
   *
   * @see <a href="https://api.highcharts.com/highcharts/series.streamgraph.data.marker.fillColor">https://api.highcharts.com/highcharts/series.streamgraph.data.marker.fillColor</a>
   * @see <a href="https://api.highcharts.com/highstock/series.streamgraph.data.marker.fillColor">https://api.highcharts.com/highstock/series.streamgraph.data.marker.fillColor</a>
   * @see <a href="https://api.highcharts.com/highmaps/series.streamgraph.data.marker.fillColor">https://api.highcharts.com/highmaps/series.streamgraph.data.marker.fillColor</a>
   *
   * @implspec fillColor?: (ColorString|GradientColorObject|object);
   *
   */
  @JSProperty("fillColor")
  void setFillColor(GradientColorObject value);

  /**
   * (Highcharts, Highstock, Highmaps) The fill color of the point marker.
   * When <code>undefined</code>, the series' or point's color is used.
   *
   * @see <a href="https://api.highcharts.com/highcharts/series.streamgraph.data.marker.fillColor">https://api.highcharts.com/highcharts/series.streamgraph.data.marker.fillColor</a>
   * @see <a href="https://api.highcharts.com/highstock/series.streamgraph.data.marker.fillColor">https://api.highcharts.com/highstock/series.streamgraph.data.marker.fillColor</a>
   * @see <a href="https://api.highcharts.com/highmaps/series.streamgraph.data.marker.fillColor">https://api.highcharts.com/highmaps/series.streamgraph.data.marker.fillColor</a>
   *
   * @implspec fillColor?: (ColorString|GradientColorObject|object);
   *
   */
  @JSProperty("fillColor")
  void setFillColor(String value);

  /**
   * (Highcharts, Highstock, Highmaps) The fill color of the point marker.
   * When <code>undefined</code>, the series' or point's color is used.
   *
   * @see <a href="https://api.highcharts.com/highcharts/series.streamgraph.data.marker.fillColor">https://api.highcharts.com/highcharts/series.streamgraph.data.marker.fillColor</a>
   * @see <a href="https://api.highcharts.com/highstock/series.streamgraph.data.marker.fillColor">https://api.highcharts.com/highstock/series.streamgraph.data.marker.fillColor</a>
   * @see <a href="https://api.highcharts.com/highmaps/series.streamgraph.data.marker.fillColor">https://api.highcharts.com/highmaps/series.streamgraph.data.marker.fillColor</a>
   *
   * @implspec fillColor?: (ColorString|GradientColorObject|object);
   *
   */
  @JSProperty("fillColor")
  void setFillColor(Any value);

  /**
   * (Highcharts, Highstock, Highmaps) Image markers only. Set the image width
   * explicitly. When using this option, a <code>width</code> must also be set.
   *
   * @see <a href="https://api.highcharts.com/highcharts/series.streamgraph.data.marker.height">https://api.highcharts.com/highcharts/series.streamgraph.data.marker.height</a>
   * @see <a href="https://api.highcharts.com/highstock/series.streamgraph.data.marker.height">https://api.highcharts.com/highstock/series.streamgraph.data.marker.height</a>
   * @see <a href="https://api.highcharts.com/highmaps/series.streamgraph.data.marker.height">https://api.highcharts.com/highmaps/series.streamgraph.data.marker.height</a>
   *
   * @implspec height?: number;
   *
   */
  @JSProperty("height")
  double getHeight();

  /**
   * (Highcharts, Highstock, Highmaps) Image markers only. Set the image width
   * explicitly. When using this option, a <code>width</code> must also be set.
   *
   * @see <a href="https://api.highcharts.com/highcharts/series.streamgraph.data.marker.height">https://api.highcharts.com/highcharts/series.streamgraph.data.marker.height</a>
   * @see <a href="https://api.highcharts.com/highstock/series.streamgraph.data.marker.height">https://api.highcharts.com/highstock/series.streamgraph.data.marker.height</a>
   * @see <a href="https://api.highcharts.com/highmaps/series.streamgraph.data.marker.height">https://api.highcharts.com/highmaps/series.streamgraph.data.marker.height</a>
   *
   * @implspec height?: number;
   *
   */
  @JSProperty("height")
  void setHeight(double value);

  /**
   * (Highcharts, Highstock, Highmaps) The color of the point marker's
   * outline. When <code>undefined</code>, the series' or point's color is used.
   *
   * @see <a href="https://api.highcharts.com/highcharts/series.streamgraph.data.marker.lineColor">https://api.highcharts.com/highcharts/series.streamgraph.data.marker.lineColor</a>
   * @see <a href="https://api.highcharts.com/highstock/series.streamgraph.data.marker.lineColor">https://api.highcharts.com/highstock/series.streamgraph.data.marker.lineColor</a>
   * @see <a href="https://api.highcharts.com/highmaps/series.streamgraph.data.marker.lineColor">https://api.highcharts.com/highmaps/series.streamgraph.data.marker.lineColor</a>
   *
   * @implspec lineColor?: ColorString;
   *
   */
  @JSProperty("lineColor")
  @Nullable
  String getLineColor();

  /**
   * (Highcharts, Highstock, Highmaps) The color of the point marker's
   * outline. When <code>undefined</code>, the series' or point's color is used.
   *
   * @see <a href="https://api.highcharts.com/highcharts/series.streamgraph.data.marker.lineColor">https://api.highcharts.com/highcharts/series.streamgraph.data.marker.lineColor</a>
   * @see <a href="https://api.highcharts.com/highstock/series.streamgraph.data.marker.lineColor">https://api.highcharts.com/highstock/series.streamgraph.data.marker.lineColor</a>
   * @see <a href="https://api.highcharts.com/highmaps/series.streamgraph.data.marker.lineColor">https://api.highcharts.com/highmaps/series.streamgraph.data.marker.lineColor</a>
   *
   * @implspec lineColor?: ColorString;
   *
   */
  @JSProperty("lineColor")
  void setLineColor(String value);

  /**
   * (Highcharts, Highstock, Highmaps) The width of the point marker's
   * outline.
   *
   * @see <a href="https://api.highcharts.com/highcharts/series.streamgraph.data.marker.lineWidth">https://api.highcharts.com/highcharts/series.streamgraph.data.marker.lineWidth</a>
   * @see <a href="https://api.highcharts.com/highstock/series.streamgraph.data.marker.lineWidth">https://api.highcharts.com/highstock/series.streamgraph.data.marker.lineWidth</a>
   * @see <a href="https://api.highcharts.com/highmaps/series.streamgraph.data.marker.lineWidth">https://api.highcharts.com/highmaps/series.streamgraph.data.marker.lineWidth</a>
   *
   * @implspec lineWidth?: number;
   *
   */
  @JSProperty("lineWidth")
  double getLineWidth();

  /**
   * (Highcharts, Highstock, Highmaps) The width of the point marker's
   * outline.
   *
   * @see <a href="https://api.highcharts.com/highcharts/series.streamgraph.data.marker.lineWidth">https://api.highcharts.com/highcharts/series.streamgraph.data.marker.lineWidth</a>
   * @see <a href="https://api.highcharts.com/highstock/series.streamgraph.data.marker.lineWidth">https://api.highcharts.com/highstock/series.streamgraph.data.marker.lineWidth</a>
   * @see <a href="https://api.highcharts.com/highmaps/series.streamgraph.data.marker.lineWidth">https://api.highcharts.com/highmaps/series.streamgraph.data.marker.lineWidth</a>
   *
   * @implspec lineWidth?: number;
   *
   */
  @JSProperty("lineWidth")
  void setLineWidth(double value);

  /**
   * (Highcharts, Highstock, Highmaps) The radius of the point marker.
   *
   * @see <a href="https://api.highcharts.com/highcharts/series.streamgraph.data.marker.radius">https://api.highcharts.com/highcharts/series.streamgraph.data.marker.radius</a>
   * @see <a href="https://api.highcharts.com/highstock/series.streamgraph.data.marker.radius">https://api.highcharts.com/highstock/series.streamgraph.data.marker.radius</a>
   * @see <a href="https://api.highcharts.com/highmaps/series.streamgraph.data.marker.radius">https://api.highcharts.com/highmaps/series.streamgraph.data.marker.radius</a>
   *
   * @implspec radius?: number;
   *
   */
  @JSProperty("radius")
  double getRadius();

  /**
   * (Highcharts, Highstock, Highmaps) The radius of the point marker.
   *
   * @see <a href="https://api.highcharts.com/highcharts/series.streamgraph.data.marker.radius">https://api.highcharts.com/highcharts/series.streamgraph.data.marker.radius</a>
   * @see <a href="https://api.highcharts.com/highstock/series.streamgraph.data.marker.radius">https://api.highcharts.com/highstock/series.streamgraph.data.marker.radius</a>
   * @see <a href="https://api.highcharts.com/highmaps/series.streamgraph.data.marker.radius">https://api.highcharts.com/highmaps/series.streamgraph.data.marker.radius</a>
   *
   * @implspec radius?: number;
   *
   */
  @JSProperty("radius")
  void setRadius(double value);

  /**
   * (Highcharts, Highstock, Highmaps) States for a single point marker.
   *
   * @see <a href="https://api.highcharts.com/highcharts/series.streamgraph.data.marker.states">https://api.highcharts.com/highcharts/series.streamgraph.data.marker.states</a>
   * @see <a href="https://api.highcharts.com/highstock/series.streamgraph.data.marker.states">https://api.highcharts.com/highstock/series.streamgraph.data.marker.states</a>
   * @see <a href="https://api.highcharts.com/highmaps/series.streamgraph.data.marker.states">https://api.highcharts.com/highmaps/series.streamgraph.data.marker.states</a>
   *
   * @implspec states?: SeriesStreamgraphDataMarkerStatesOptions;
   *
   */
  @JSProperty("states")
  @Nullable
  SeriesStreamgraphDataMarkerStatesOptions getStates();

  /**
   * (Highcharts, Highstock, Highmaps) States for a single point marker.
   *
   * @see <a href="https://api.highcharts.com/highcharts/series.streamgraph.data.marker.states">https://api.highcharts.com/highcharts/series.streamgraph.data.marker.states</a>
   * @see <a href="https://api.highcharts.com/highstock/series.streamgraph.data.marker.states">https://api.highcharts.com/highstock/series.streamgraph.data.marker.states</a>
   * @see <a href="https://api.highcharts.com/highmaps/series.streamgraph.data.marker.states">https://api.highcharts.com/highmaps/series.streamgraph.data.marker.states</a>
   *
   * @implspec states?: SeriesStreamgraphDataMarkerStatesOptions;
   *
   */
  @JSProperty("states")
  void setStates(SeriesStreamgraphDataMarkerStatesOptions value);

  /**
   * (Highcharts, Highstock, Highmaps) A predefined shape or symbol for the
   * marker. When undefined, the symbol is pulled from options.symbols. Other
   * possible values are &quot;circle&quot;, &quot;square&quot;, &quot;diamond&quot;, &quot;triangle&quot; and
   * &quot;triangle-down&quot;.
   *
   * Additionally, the URL to a graphic can be given on this form:
   * &quot;url(graphic.png)&quot;. Note that for the image to be applied to exported
   * charts, its URL needs to be accessible by the export server.
   *
   * Custom callbacks for symbol path generation can also be added to
   * <code>Highcharts.SVGRenderer.prototype.symbols</code>. The callback is then used by
   * its method name, as shown in the demo.
   *
   * @see <a href="https://api.highcharts.com/highcharts/series.streamgraph.data.marker.symbol">https://api.highcharts.com/highcharts/series.streamgraph.data.marker.symbol</a>
   * @see <a href="https://api.highcharts.com/highstock/series.streamgraph.data.marker.symbol">https://api.highcharts.com/highstock/series.streamgraph.data.marker.symbol</a>
   * @see <a href="https://api.highcharts.com/highmaps/series.streamgraph.data.marker.symbol">https://api.highcharts.com/highmaps/series.streamgraph.data.marker.symbol</a>
   *
   * @implspec symbol?: string;
   *
   */
  @JSProperty("symbol")
  @Nullable
  String getSymbol();

  /**
   * (Highcharts, Highstock, Highmaps) A predefined shape or symbol for the
   * marker. When undefined, the symbol is pulled from options.symbols. Other
   * possible values are &quot;circle&quot;, &quot;square&quot;, &quot;diamond&quot;, &quot;triangle&quot; and
   * &quot;triangle-down&quot;.
   *
   * Additionally, the URL to a graphic can be given on this form:
   * &quot;url(graphic.png)&quot;. Note that for the image to be applied to exported
   * charts, its URL needs to be accessible by the export server.
   *
   * Custom callbacks for symbol path generation can also be added to
   * <code>Highcharts.SVGRenderer.prototype.symbols</code>. The callback is then used by
   * its method name, as shown in the demo.
   *
   * @see <a href="https://api.highcharts.com/highcharts/series.streamgraph.data.marker.symbol">https://api.highcharts.com/highcharts/series.streamgraph.data.marker.symbol</a>
   * @see <a href="https://api.highcharts.com/highstock/series.streamgraph.data.marker.symbol">https://api.highcharts.com/highstock/series.streamgraph.data.marker.symbol</a>
   * @see <a href="https://api.highcharts.com/highmaps/series.streamgraph.data.marker.symbol">https://api.highcharts.com/highmaps/series.streamgraph.data.marker.symbol</a>
   *
   * @implspec symbol?: string;
   *
   */
  @JSProperty("symbol")
  void setSymbol(String value);

  /**
   * (Highcharts, Highstock, Highmaps) Image markers only. Set the image width
   * explicitly. When using this option, a <code>height</code> must also be set.
   *
   * @see <a href="https://api.highcharts.com/highcharts/series.streamgraph.data.marker.width">https://api.highcharts.com/highcharts/series.streamgraph.data.marker.width</a>
   * @see <a href="https://api.highcharts.com/highstock/series.streamgraph.data.marker.width">https://api.highcharts.com/highstock/series.streamgraph.data.marker.width</a>
   * @see <a href="https://api.highcharts.com/highmaps/series.streamgraph.data.marker.width">https://api.highcharts.com/highmaps/series.streamgraph.data.marker.width</a>
   *
   * @implspec width?: number;
   *
   */
  @JSProperty("width")
  double getWidth();

  /**
   * (Highcharts, Highstock, Highmaps) Image markers only. Set the image width
   * explicitly. When using this option, a <code>height</code> must also be set.
   *
   * @see <a href="https://api.highcharts.com/highcharts/series.streamgraph.data.marker.width">https://api.highcharts.com/highcharts/series.streamgraph.data.marker.width</a>
   * @see <a href="https://api.highcharts.com/highstock/series.streamgraph.data.marker.width">https://api.highcharts.com/highstock/series.streamgraph.data.marker.width</a>
   * @see <a href="https://api.highcharts.com/highmaps/series.streamgraph.data.marker.width">https://api.highcharts.com/highmaps/series.streamgraph.data.marker.width</a>
   *
   * @implspec width?: number;
   *
   */
  @JSProperty("width")
  void setWidth(double value);
}
