package com.github.fluorumlabs.disconnect.highcharts;

import java.lang.String;
import javax.annotation.Nullable;
import js.extras.JsEnum;
import js.lang.Any;
import js.lang.Unknown;
import org.teavm.jso.JSProperty;

/**
 * (Highmaps) Options for the point markers of line-like series. Properties like
 * <code>fillColor</code>, <code>lineColor</code> and <code>lineWidth</code> define the visual appearance of the
 * markers. Other series types, like column series, don't have markers, but have
 * visual options on the series level instead.
 *
 * In styled mode, the markers can be styled with the <code>.highcharts-point</code>,
 * <code>.highcharts-point-hover</code> and <code>.highcharts-point-select</code> class names.
 *
 * @see <a href="https://api.highcharts.com/highmaps/plotOptions.mapbubble.marker">https://api.highcharts.com/highmaps/plotOptions.mapbubble.marker</a>
 *
 */
public interface PlotMapbubbleMarkerOptions extends Any {
  /**
   * (Highmaps) The fill color of the point marker. When <code>undefined</code>, the
   * series' or point's color is used.
   *
   * @see <a href="https://api.highcharts.com/highmaps/plotOptions.mapbubble.marker.fillColor">https://api.highcharts.com/highmaps/plotOptions.mapbubble.marker.fillColor</a>
   *
   * @implspec fillColor?: (ColorString|GradientColorObject|object);
   *
   */
  @JSProperty("fillColor")
  @Nullable
  Unknown getFillColor();

  /**
   * (Highmaps) The fill color of the point marker. When <code>undefined</code>, the
   * series' or point's color is used.
   *
   * @see <a href="https://api.highcharts.com/highmaps/plotOptions.mapbubble.marker.fillColor">https://api.highcharts.com/highmaps/plotOptions.mapbubble.marker.fillColor</a>
   *
   * @implspec fillColor?: (ColorString|GradientColorObject|object);
   *
   */
  @JSProperty("fillColor")
  void setFillColor(GradientColorObject value);

  /**
   * (Highmaps) The fill color of the point marker. When <code>undefined</code>, the
   * series' or point's color is used.
   *
   * @see <a href="https://api.highcharts.com/highmaps/plotOptions.mapbubble.marker.fillColor">https://api.highcharts.com/highmaps/plotOptions.mapbubble.marker.fillColor</a>
   *
   * @implspec fillColor?: (ColorString|GradientColorObject|object);
   *
   */
  @JSProperty("fillColor")
  void setFillColor(String value);

  /**
   * (Highmaps) The fill color of the point marker. When <code>undefined</code>, the
   * series' or point's color is used.
   *
   * @see <a href="https://api.highcharts.com/highmaps/plotOptions.mapbubble.marker.fillColor">https://api.highcharts.com/highmaps/plotOptions.mapbubble.marker.fillColor</a>
   *
   * @implspec fillColor?: (ColorString|GradientColorObject|object);
   *
   */
  @JSProperty("fillColor")
  void setFillColor(Any value);

  /**
   * (Highmaps) The fill opacity of the bubble markers.
   *
   * @see <a href="https://api.highcharts.com/highmaps/plotOptions.mapbubble.marker.fillOpacity">https://api.highcharts.com/highmaps/plotOptions.mapbubble.marker.fillOpacity</a>
   *
   * @implspec fillOpacity?: number;
   *
   */
  @JSProperty("fillOpacity")
  double getFillOpacity();

  /**
   * (Highmaps) The fill opacity of the bubble markers.
   *
   * @see <a href="https://api.highcharts.com/highmaps/plotOptions.mapbubble.marker.fillOpacity">https://api.highcharts.com/highmaps/plotOptions.mapbubble.marker.fillOpacity</a>
   *
   * @implspec fillOpacity?: number;
   *
   */
  @JSProperty("fillOpacity")
  void setFillOpacity(double value);

  /**
   * (Highmaps) The color of the point marker's outline. When <code>undefined</code>, the
   * series' or point's color is used.
   *
   * @see <a href="https://api.highcharts.com/highmaps/plotOptions.mapbubble.marker.lineColor">https://api.highcharts.com/highmaps/plotOptions.mapbubble.marker.lineColor</a>
   *
   * @implspec lineColor?: any;
   *
   */
  @JSProperty("lineColor")
  @Nullable
  Any getLineColor();

  /**
   * (Highmaps) The color of the point marker's outline. When <code>undefined</code>, the
   * series' or point's color is used.
   *
   * @see <a href="https://api.highcharts.com/highmaps/plotOptions.mapbubble.marker.lineColor">https://api.highcharts.com/highmaps/plotOptions.mapbubble.marker.lineColor</a>
   *
   * @implspec lineColor?: any;
   *
   */
  @JSProperty("lineColor")
  void setLineColor(Any value);

  /**
   * (Highmaps) The width of the point marker's outline.
   *
   * @see <a href="https://api.highcharts.com/highmaps/plotOptions.mapbubble.marker.lineWidth">https://api.highcharts.com/highmaps/plotOptions.mapbubble.marker.lineWidth</a>
   *
   * @implspec lineWidth?: number;
   *
   */
  @JSProperty("lineWidth")
  double getLineWidth();

  /**
   * (Highmaps) The width of the point marker's outline.
   *
   * @see <a href="https://api.highcharts.com/highmaps/plotOptions.mapbubble.marker.lineWidth">https://api.highcharts.com/highmaps/plotOptions.mapbubble.marker.lineWidth</a>
   *
   * @implspec lineWidth?: number;
   *
   */
  @JSProperty("lineWidth")
  void setLineWidth(double value);

  /**
   * (Highmaps) States for a single point marker.
   *
   * @see <a href="https://api.highcharts.com/highmaps/plotOptions.mapbubble.marker.states">https://api.highcharts.com/highmaps/plotOptions.mapbubble.marker.states</a>
   *
   * @implspec states?: PlotMapbubbleMarkerStatesOptions;
   *
   */
  @JSProperty("states")
  @Nullable
  PlotMapbubbleMarkerStatesOptions getStates();

  /**
   * (Highmaps) States for a single point marker.
   *
   * @see <a href="https://api.highcharts.com/highmaps/plotOptions.mapbubble.marker.states">https://api.highcharts.com/highmaps/plotOptions.mapbubble.marker.states</a>
   *
   * @implspec states?: PlotMapbubbleMarkerStatesOptions;
   *
   */
  @JSProperty("states")
  void setStates(PlotMapbubbleMarkerStatesOptions value);

  /**
   * (Highmaps) A predefined shape or symbol for the marker. Possible values
   * are &quot;circle&quot;, &quot;square&quot;, &quot;diamond&quot;, &quot;triangle&quot; and &quot;triangle-down&quot;.
   *
   * Additionally, the URL to a graphic can be given on the form
   * <code>url(graphic.png)</code>. Note that for the image to be applied to exported
   * charts, its URL needs to be accessible by the export server.
   *
   * Custom callbacks for symbol path generation can also be added to
   * <code>Highcharts.SVGRenderer.prototype.symbols</code>. The callback is then used by
   * its method name, as shown in the demo.
   *
   * @see <a href="https://api.highcharts.com/highmaps/plotOptions.mapbubble.marker.symbol">https://api.highcharts.com/highmaps/plotOptions.mapbubble.marker.symbol</a>
   *
   * @implspec symbol?: (&quot;circle&quot;|&quot;diamond&quot;|&quot;square&quot;|&quot;triangle&quot;|&quot;triangle-down&quot;);
   *
   */
  @JSProperty("symbol")
  @Nullable
  Symbol getSymbol();

  /**
   * (Highmaps) A predefined shape or symbol for the marker. Possible values
   * are &quot;circle&quot;, &quot;square&quot;, &quot;diamond&quot;, &quot;triangle&quot; and &quot;triangle-down&quot;.
   *
   * Additionally, the URL to a graphic can be given on the form
   * <code>url(graphic.png)</code>. Note that for the image to be applied to exported
   * charts, its URL needs to be accessible by the export server.
   *
   * Custom callbacks for symbol path generation can also be added to
   * <code>Highcharts.SVGRenderer.prototype.symbols</code>. The callback is then used by
   * its method name, as shown in the demo.
   *
   * @see <a href="https://api.highcharts.com/highmaps/plotOptions.mapbubble.marker.symbol">https://api.highcharts.com/highmaps/plotOptions.mapbubble.marker.symbol</a>
   *
   * @implspec symbol?: (&quot;circle&quot;|&quot;diamond&quot;|&quot;square&quot;|&quot;triangle&quot;|&quot;triangle-down&quot;);
   *
   */
  @JSProperty("symbol")
  void setSymbol(Symbol value);

  /**
   */
  abstract class Symbol extends JsEnum {
    public static final Symbol CIRCLE = JsEnum.of("circle");

    public static final Symbol DIAMOND = JsEnum.of("diamond");

    public static final Symbol SQUARE = JsEnum.of("square");

    public static final Symbol TRIANGLE = JsEnum.of("triangle");

    public static final Symbol TRIANGLE_DOWN = JsEnum.of("triangle-down");
  }
}
