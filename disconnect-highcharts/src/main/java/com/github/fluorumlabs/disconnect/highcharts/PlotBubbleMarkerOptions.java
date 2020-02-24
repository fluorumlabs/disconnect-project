package com.github.fluorumlabs.disconnect.highcharts;

import java.lang.String;
import javax.annotation.Nullable;
import js.extras.JsEnum;
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
 * @see <a href="https://api.highcharts.com/highcharts/plotOptions.bubble.marker">https://api.highcharts.com/highcharts/plotOptions.bubble.marker</a>
 * @see <a href="https://api.highcharts.com/highstock/plotOptions.bubble.marker">https://api.highcharts.com/highstock/plotOptions.bubble.marker</a>
 *
 */
public interface PlotBubbleMarkerOptions extends Any {
  /**
   * (Highcharts, Highstock) The fill color of the point marker. When
   * <code>undefined</code>, the series' or point's color is used.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.bubble.marker.fillColor">https://api.highcharts.com/highcharts/plotOptions.bubble.marker.fillColor</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.bubble.marker.fillColor">https://api.highcharts.com/highstock/plotOptions.bubble.marker.fillColor</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.bubble.marker.fillColor">https://api.highcharts.com/highcharts/plotOptions.bubble.marker.fillColor</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.bubble.marker.fillColor">https://api.highcharts.com/highstock/plotOptions.bubble.marker.fillColor</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.bubble.marker.fillColor">https://api.highcharts.com/highcharts/plotOptions.bubble.marker.fillColor</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.bubble.marker.fillColor">https://api.highcharts.com/highstock/plotOptions.bubble.marker.fillColor</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.bubble.marker.fillColor">https://api.highcharts.com/highcharts/plotOptions.bubble.marker.fillColor</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.bubble.marker.fillColor">https://api.highcharts.com/highstock/plotOptions.bubble.marker.fillColor</a>
   *
   * @implspec fillColor?: (ColorString|GradientColorObject|object);
   *
   */
  @JSProperty("fillColor")
  void setFillColor(Any value);

  /**
   * (Highcharts, Highstock) The fill opacity of the bubble markers.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.bubble.marker.fillOpacity">https://api.highcharts.com/highcharts/plotOptions.bubble.marker.fillOpacity</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.bubble.marker.fillOpacity">https://api.highcharts.com/highstock/plotOptions.bubble.marker.fillOpacity</a>
   *
   * @implspec fillOpacity?: number;
   *
   */
  @JSProperty("fillOpacity")
  double getFillOpacity();

  /**
   * (Highcharts, Highstock) The fill opacity of the bubble markers.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.bubble.marker.fillOpacity">https://api.highcharts.com/highcharts/plotOptions.bubble.marker.fillOpacity</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.bubble.marker.fillOpacity">https://api.highcharts.com/highstock/plotOptions.bubble.marker.fillOpacity</a>
   *
   * @implspec fillOpacity?: number;
   *
   */
  @JSProperty("fillOpacity")
  void setFillOpacity(double value);

  /**
   * (Highcharts, Highstock) The color of the point marker's outline. When
   * <code>undefined</code>, the series' or point's color is used.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.bubble.marker.lineColor">https://api.highcharts.com/highcharts/plotOptions.bubble.marker.lineColor</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.bubble.marker.lineColor">https://api.highcharts.com/highstock/plotOptions.bubble.marker.lineColor</a>
   *
   * @implspec lineColor?: any;
   *
   */
  @JSProperty("lineColor")
  @Nullable
  Any getLineColor();

  /**
   * (Highcharts, Highstock) The color of the point marker's outline. When
   * <code>undefined</code>, the series' or point's color is used.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.bubble.marker.lineColor">https://api.highcharts.com/highcharts/plotOptions.bubble.marker.lineColor</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.bubble.marker.lineColor">https://api.highcharts.com/highstock/plotOptions.bubble.marker.lineColor</a>
   *
   * @implspec lineColor?: any;
   *
   */
  @JSProperty("lineColor")
  void setLineColor(Any value);

  /**
   * (Highcharts, Highstock) The width of the point marker's outline.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.bubble.marker.lineWidth">https://api.highcharts.com/highcharts/plotOptions.bubble.marker.lineWidth</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.bubble.marker.lineWidth">https://api.highcharts.com/highstock/plotOptions.bubble.marker.lineWidth</a>
   *
   * @implspec lineWidth?: number;
   *
   */
  @JSProperty("lineWidth")
  double getLineWidth();

  /**
   * (Highcharts, Highstock) The width of the point marker's outline.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.bubble.marker.lineWidth">https://api.highcharts.com/highcharts/plotOptions.bubble.marker.lineWidth</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.bubble.marker.lineWidth">https://api.highcharts.com/highstock/plotOptions.bubble.marker.lineWidth</a>
   *
   * @implspec lineWidth?: number;
   *
   */
  @JSProperty("lineWidth")
  void setLineWidth(double value);

  /**
   * (Highcharts, Highstock) States for a single point marker.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.bubble.marker.states">https://api.highcharts.com/highcharts/plotOptions.bubble.marker.states</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.bubble.marker.states">https://api.highcharts.com/highstock/plotOptions.bubble.marker.states</a>
   *
   * @implspec states?: PlotBubbleMarkerStatesOptions;
   *
   */
  @JSProperty("states")
  @Nullable
  PlotBubbleMarkerStatesOptions getStates();

  /**
   * (Highcharts, Highstock) States for a single point marker.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.bubble.marker.states">https://api.highcharts.com/highcharts/plotOptions.bubble.marker.states</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.bubble.marker.states">https://api.highcharts.com/highstock/plotOptions.bubble.marker.states</a>
   *
   * @implspec states?: PlotBubbleMarkerStatesOptions;
   *
   */
  @JSProperty("states")
  void setStates(PlotBubbleMarkerStatesOptions value);

  /**
   * (Highcharts, Highstock) A predefined shape or symbol for the marker.
   * Possible values are &quot;circle&quot;, &quot;square&quot;, &quot;diamond&quot;, &quot;triangle&quot; and
   * &quot;triangle-down&quot;.
   *
   * Additionally, the URL to a graphic can be given on the form
   * <code>url(graphic.png)</code>. Note that for the image to be applied to exported
   * charts, its URL needs to be accessible by the export server.
   *
   * Custom callbacks for symbol path generation can also be added to
   * <code>Highcharts.SVGRenderer.prototype.symbols</code>. The callback is then used by
   * its method name, as shown in the demo.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.bubble.marker.symbol">https://api.highcharts.com/highcharts/plotOptions.bubble.marker.symbol</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.bubble.marker.symbol">https://api.highcharts.com/highstock/plotOptions.bubble.marker.symbol</a>
   *
   * @implspec symbol?: (&quot;circle&quot;|&quot;diamond&quot;|&quot;square&quot;|&quot;triangle&quot;|&quot;triangle-down&quot;);
   *
   */
  @JSProperty("symbol")
  @Nullable
  Symbol getSymbol();

  /**
   * (Highcharts, Highstock) A predefined shape or symbol for the marker.
   * Possible values are &quot;circle&quot;, &quot;square&quot;, &quot;diamond&quot;, &quot;triangle&quot; and
   * &quot;triangle-down&quot;.
   *
   * Additionally, the URL to a graphic can be given on the form
   * <code>url(graphic.png)</code>. Note that for the image to be applied to exported
   * charts, its URL needs to be accessible by the export server.
   *
   * Custom callbacks for symbol path generation can also be added to
   * <code>Highcharts.SVGRenderer.prototype.symbols</code>. The callback is then used by
   * its method name, as shown in the demo.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.bubble.marker.symbol">https://api.highcharts.com/highcharts/plotOptions.bubble.marker.symbol</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.bubble.marker.symbol">https://api.highcharts.com/highstock/plotOptions.bubble.marker.symbol</a>
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
