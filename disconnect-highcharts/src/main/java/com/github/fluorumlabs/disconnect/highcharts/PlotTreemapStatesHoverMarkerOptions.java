package com.github.fluorumlabs.disconnect.highcharts;

import java.lang.String;
import javax.annotation.Nullable;
import js.lang.Any;
import js.lang.Unknown;
import org.teavm.jso.JSProperty;

/**
 * (Highcharts, Highstock) In Highcharts 1.0, the appearance of all markers
 * belonging to the hovered series. For settings on the hover state of the
 * individual point, see marker.states.hover.
 *
 * @see <a href="https://api.highcharts.com/highcharts/plotOptions.treemap.states.hover.marker">https://api.highcharts.com/highcharts/plotOptions.treemap.states.hover.marker</a>
 * @see <a href="https://api.highcharts.com/highstock/plotOptions.treemap.states.hover.marker">https://api.highcharts.com/highstock/plotOptions.treemap.states.hover.marker</a>
 *
 */
public interface PlotTreemapStatesHoverMarkerOptions extends Any {
  /**
   * (Highcharts, Highstock) Enable or disable the point marker. If
   * <code>undefined</code>, the markers are hidden when the data is dense, and shown for
   * more widespread data points.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.treemap.states.hover.marker.enabled">https://api.highcharts.com/highcharts/plotOptions.treemap.states.hover.marker.enabled</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.treemap.states.hover.marker.enabled">https://api.highcharts.com/highstock/plotOptions.treemap.states.hover.marker.enabled</a>
   *
   * @implspec enabled?: boolean;
   *
   */
  @JSProperty("enabled")
  boolean getEnabled();

  /**
   * (Highcharts, Highstock) Enable or disable the point marker. If
   * <code>undefined</code>, the markers are hidden when the data is dense, and shown for
   * more widespread data points.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.treemap.states.hover.marker.enabled">https://api.highcharts.com/highcharts/plotOptions.treemap.states.hover.marker.enabled</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.treemap.states.hover.marker.enabled">https://api.highcharts.com/highstock/plotOptions.treemap.states.hover.marker.enabled</a>
   *
   * @implspec enabled?: boolean;
   *
   */
  @JSProperty("enabled")
  void setEnabled(boolean value);

  /**
   * (Highcharts, Highstock) The threshold for how dense the point markers
   * should be before they are hidden, given that <code>enabled</code> is not defined.
   * The number indicates the horizontal distance between the two closest
   * points in the series, as multiples of the <code>marker.radius</code>. In other
   * words, the default value of 2 means points are hidden if overlapping
   * horizontally.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.treemap.states.hover.marker.enabledThreshold">https://api.highcharts.com/highcharts/plotOptions.treemap.states.hover.marker.enabledThreshold</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.treemap.states.hover.marker.enabledThreshold">https://api.highcharts.com/highstock/plotOptions.treemap.states.hover.marker.enabledThreshold</a>
   *
   * @implspec enabledThreshold?: number;
   *
   */
  @JSProperty("enabledThreshold")
  double getEnabledThreshold();

  /**
   * (Highcharts, Highstock) The threshold for how dense the point markers
   * should be before they are hidden, given that <code>enabled</code> is not defined.
   * The number indicates the horizontal distance between the two closest
   * points in the series, as multiples of the <code>marker.radius</code>. In other
   * words, the default value of 2 means points are hidden if overlapping
   * horizontally.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.treemap.states.hover.marker.enabledThreshold">https://api.highcharts.com/highcharts/plotOptions.treemap.states.hover.marker.enabledThreshold</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.treemap.states.hover.marker.enabledThreshold">https://api.highcharts.com/highstock/plotOptions.treemap.states.hover.marker.enabledThreshold</a>
   *
   * @implspec enabledThreshold?: number;
   *
   */
  @JSProperty("enabledThreshold")
  void setEnabledThreshold(double value);

  /**
   * (Highcharts, Highstock) The fill color of the point marker. When
   * <code>undefined</code>, the series' or point's color is used.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.treemap.states.hover.marker.fillColor">https://api.highcharts.com/highcharts/plotOptions.treemap.states.hover.marker.fillColor</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.treemap.states.hover.marker.fillColor">https://api.highcharts.com/highstock/plotOptions.treemap.states.hover.marker.fillColor</a>
   *
   * @implspec fillColor?: (ColorString|GradientColorObject|object);
   *
   */
  @JSProperty("fillColor")
  @Nullable
  Unknown getFillColor();

  /**
   * (Highcharts, Highstock) The fill color of the point marker. When
   * <code>undefined</code>, the series' or point's color is used.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.treemap.states.hover.marker.fillColor">https://api.highcharts.com/highcharts/plotOptions.treemap.states.hover.marker.fillColor</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.treemap.states.hover.marker.fillColor">https://api.highcharts.com/highstock/plotOptions.treemap.states.hover.marker.fillColor</a>
   *
   * @implspec fillColor?: (ColorString|GradientColorObject|object);
   *
   */
  @JSProperty("fillColor")
  void setFillColor(GradientColorObject value);

  /**
   * (Highcharts, Highstock) The fill color of the point marker. When
   * <code>undefined</code>, the series' or point's color is used.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.treemap.states.hover.marker.fillColor">https://api.highcharts.com/highcharts/plotOptions.treemap.states.hover.marker.fillColor</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.treemap.states.hover.marker.fillColor">https://api.highcharts.com/highstock/plotOptions.treemap.states.hover.marker.fillColor</a>
   *
   * @implspec fillColor?: (ColorString|GradientColorObject|object);
   *
   */
  @JSProperty("fillColor")
  void setFillColor(String value);

  /**
   * (Highcharts, Highstock) The fill color of the point marker. When
   * <code>undefined</code>, the series' or point's color is used.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.treemap.states.hover.marker.fillColor">https://api.highcharts.com/highcharts/plotOptions.treemap.states.hover.marker.fillColor</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.treemap.states.hover.marker.fillColor">https://api.highcharts.com/highstock/plotOptions.treemap.states.hover.marker.fillColor</a>
   *
   * @implspec fillColor?: (ColorString|GradientColorObject|object);
   *
   */
  @JSProperty("fillColor")
  void setFillColor(Any value);

  /**
   * (Highcharts, Highstock) Image markers only. Set the image width
   * explicitly. When using this option, a <code>width</code> must also be set.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.treemap.states.hover.marker.height">https://api.highcharts.com/highcharts/plotOptions.treemap.states.hover.marker.height</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.treemap.states.hover.marker.height">https://api.highcharts.com/highstock/plotOptions.treemap.states.hover.marker.height</a>
   *
   * @implspec height?: number;
   *
   */
  @JSProperty("height")
  double getHeight();

  /**
   * (Highcharts, Highstock) Image markers only. Set the image width
   * explicitly. When using this option, a <code>width</code> must also be set.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.treemap.states.hover.marker.height">https://api.highcharts.com/highcharts/plotOptions.treemap.states.hover.marker.height</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.treemap.states.hover.marker.height">https://api.highcharts.com/highstock/plotOptions.treemap.states.hover.marker.height</a>
   *
   * @implspec height?: number;
   *
   */
  @JSProperty("height")
  void setHeight(double value);

  /**
   * (Highcharts, Highstock) The color of the point marker's outline. When
   * <code>undefined</code>, the series' or point's color is used.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.treemap.states.hover.marker.lineColor">https://api.highcharts.com/highcharts/plotOptions.treemap.states.hover.marker.lineColor</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.treemap.states.hover.marker.lineColor">https://api.highcharts.com/highstock/plotOptions.treemap.states.hover.marker.lineColor</a>
   *
   * @implspec lineColor?: ColorString;
   *
   */
  @JSProperty("lineColor")
  @Nullable
  String getLineColor();

  /**
   * (Highcharts, Highstock) The color of the point marker's outline. When
   * <code>undefined</code>, the series' or point's color is used.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.treemap.states.hover.marker.lineColor">https://api.highcharts.com/highcharts/plotOptions.treemap.states.hover.marker.lineColor</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.treemap.states.hover.marker.lineColor">https://api.highcharts.com/highstock/plotOptions.treemap.states.hover.marker.lineColor</a>
   *
   * @implspec lineColor?: ColorString;
   *
   */
  @JSProperty("lineColor")
  void setLineColor(String value);

  /**
   * (Highcharts, Highstock) The width of the point marker's outline.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.treemap.states.hover.marker.lineWidth">https://api.highcharts.com/highcharts/plotOptions.treemap.states.hover.marker.lineWidth</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.treemap.states.hover.marker.lineWidth">https://api.highcharts.com/highstock/plotOptions.treemap.states.hover.marker.lineWidth</a>
   *
   * @implspec lineWidth?: number;
   *
   */
  @JSProperty("lineWidth")
  double getLineWidth();

  /**
   * (Highcharts, Highstock) The width of the point marker's outline.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.treemap.states.hover.marker.lineWidth">https://api.highcharts.com/highcharts/plotOptions.treemap.states.hover.marker.lineWidth</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.treemap.states.hover.marker.lineWidth">https://api.highcharts.com/highstock/plotOptions.treemap.states.hover.marker.lineWidth</a>
   *
   * @implspec lineWidth?: number;
   *
   */
  @JSProperty("lineWidth")
  void setLineWidth(double value);

  /**
   * (Highcharts, Highstock) The radius of the point marker.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.treemap.states.hover.marker.radius">https://api.highcharts.com/highcharts/plotOptions.treemap.states.hover.marker.radius</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.treemap.states.hover.marker.radius">https://api.highcharts.com/highstock/plotOptions.treemap.states.hover.marker.radius</a>
   *
   * @implspec radius?: number;
   *
   */
  @JSProperty("radius")
  double getRadius();

  /**
   * (Highcharts, Highstock) The radius of the point marker.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.treemap.states.hover.marker.radius">https://api.highcharts.com/highcharts/plotOptions.treemap.states.hover.marker.radius</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.treemap.states.hover.marker.radius">https://api.highcharts.com/highstock/plotOptions.treemap.states.hover.marker.radius</a>
   *
   * @implspec radius?: number;
   *
   */
  @JSProperty("radius")
  void setRadius(double value);

  /**
   * (Highcharts, Highstock) States for a single point marker.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.treemap.states.hover.marker.states">https://api.highcharts.com/highcharts/plotOptions.treemap.states.hover.marker.states</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.treemap.states.hover.marker.states">https://api.highcharts.com/highstock/plotOptions.treemap.states.hover.marker.states</a>
   *
   * @implspec states?: PlotTreemapStatesHoverMarkerStatesOptions;
   *
   */
  @JSProperty("states")
  @Nullable
  PlotTreemapStatesHoverMarkerStatesOptions getStates();

  /**
   * (Highcharts, Highstock) States for a single point marker.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.treemap.states.hover.marker.states">https://api.highcharts.com/highcharts/plotOptions.treemap.states.hover.marker.states</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.treemap.states.hover.marker.states">https://api.highcharts.com/highstock/plotOptions.treemap.states.hover.marker.states</a>
   *
   * @implspec states?: PlotTreemapStatesHoverMarkerStatesOptions;
   *
   */
  @JSProperty("states")
  void setStates(PlotTreemapStatesHoverMarkerStatesOptions value);

  /**
   * (Highcharts, Highstock) A predefined shape or symbol for the marker. When
   * undefined, the symbol is pulled from options.symbols. Other possible
   * values are &quot;circle&quot;, &quot;square&quot;, &quot;diamond&quot;, &quot;triangle&quot; and &quot;triangle-down&quot;.
   *
   * Additionally, the URL to a graphic can be given on this form:
   * &quot;url(graphic.png)&quot;. Note that for the image to be applied to exported
   * charts, its URL needs to be accessible by the export server.
   *
   * Custom callbacks for symbol path generation can also be added to
   * <code>Highcharts.SVGRenderer.prototype.symbols</code>. The callback is then used by
   * its method name, as shown in the demo.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.treemap.states.hover.marker.symbol">https://api.highcharts.com/highcharts/plotOptions.treemap.states.hover.marker.symbol</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.treemap.states.hover.marker.symbol">https://api.highcharts.com/highstock/plotOptions.treemap.states.hover.marker.symbol</a>
   *
   * @implspec symbol?: string;
   *
   */
  @JSProperty("symbol")
  @Nullable
  String getSymbol();

  /**
   * (Highcharts, Highstock) A predefined shape or symbol for the marker. When
   * undefined, the symbol is pulled from options.symbols. Other possible
   * values are &quot;circle&quot;, &quot;square&quot;, &quot;diamond&quot;, &quot;triangle&quot; and &quot;triangle-down&quot;.
   *
   * Additionally, the URL to a graphic can be given on this form:
   * &quot;url(graphic.png)&quot;. Note that for the image to be applied to exported
   * charts, its URL needs to be accessible by the export server.
   *
   * Custom callbacks for symbol path generation can also be added to
   * <code>Highcharts.SVGRenderer.prototype.symbols</code>. The callback is then used by
   * its method name, as shown in the demo.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.treemap.states.hover.marker.symbol">https://api.highcharts.com/highcharts/plotOptions.treemap.states.hover.marker.symbol</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.treemap.states.hover.marker.symbol">https://api.highcharts.com/highstock/plotOptions.treemap.states.hover.marker.symbol</a>
   *
   * @implspec symbol?: string;
   *
   */
  @JSProperty("symbol")
  void setSymbol(String value);

  /**
   * (Highcharts, Highstock) Image markers only. Set the image width
   * explicitly. When using this option, a <code>height</code> must also be set.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.treemap.states.hover.marker.width">https://api.highcharts.com/highcharts/plotOptions.treemap.states.hover.marker.width</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.treemap.states.hover.marker.width">https://api.highcharts.com/highstock/plotOptions.treemap.states.hover.marker.width</a>
   *
   * @implspec width?: number;
   *
   */
  @JSProperty("width")
  double getWidth();

  /**
   * (Highcharts, Highstock) Image markers only. Set the image width
   * explicitly. When using this option, a <code>height</code> must also be set.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.treemap.states.hover.marker.width">https://api.highcharts.com/highcharts/plotOptions.treemap.states.hover.marker.width</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.treemap.states.hover.marker.width">https://api.highcharts.com/highstock/plotOptions.treemap.states.hover.marker.width</a>
   *
   * @implspec width?: number;
   *
   */
  @JSProperty("width")
  void setWidth(double value);
}
