package com.github.fluorumlabs.disconnect.highcharts;

import javax.annotation.Nullable;
import js.lang.Any;
import js.util.collections.Array;
import org.teavm.jso.JSProperty;

/**
 * (Highcharts, Highstock, Gantt) Series labels are placed as close to the
 * series as possible in a natural way, seeking to avoid other series. The goal
 * of this feature is to make the chart more easily readable, like if a human
 * designer placed the labels in the optimal position.
 *
 * The series labels currently work with series types having a <code>graph</code> or an
 * <code>area</code>.
 *
 * Requires the <code>series-label.js</code> module.
 *
 * @see <a href="https://api.highcharts.com/highcharts/plotOptions.column.label">https://api.highcharts.com/highcharts/plotOptions.column.label</a>
 * @see <a href="https://api.highcharts.com/highstock/plotOptions.column.label">https://api.highcharts.com/highstock/plotOptions.column.label</a>
 * @see <a href="https://api.highcharts.com/gantt/plotOptions.column.label">https://api.highcharts.com/gantt/plotOptions.column.label</a>
 *
 */
public interface PlotColumnLabelOptions extends Any {
  /**
   * (Highcharts, Highstock, Gantt) An array of boxes to avoid when laying out
   * the labels. Each item has a <code>left</code>, <code>right</code>, <code>top</code> and <code>bottom</code> property.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.column.label.boxesToAvoid">https://api.highcharts.com/highcharts/plotOptions.column.label.boxesToAvoid</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.column.label.boxesToAvoid">https://api.highcharts.com/highstock/plotOptions.column.label.boxesToAvoid</a>
   * @see <a href="https://api.highcharts.com/gantt/plotOptions.column.label.boxesToAvoid">https://api.highcharts.com/gantt/plotOptions.column.label.boxesToAvoid</a>
   *
   * @implspec boxesToAvoid?: Array<LabelIntersectBoxObject>;
   *
   */
  @JSProperty("boxesToAvoid")
  @Nullable
  Array<LabelIntersectBoxObject> getBoxesToAvoid();

  /**
   * (Highcharts, Highstock, Gantt) An array of boxes to avoid when laying out
   * the labels. Each item has a <code>left</code>, <code>right</code>, <code>top</code> and <code>bottom</code> property.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.column.label.boxesToAvoid">https://api.highcharts.com/highcharts/plotOptions.column.label.boxesToAvoid</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.column.label.boxesToAvoid">https://api.highcharts.com/highstock/plotOptions.column.label.boxesToAvoid</a>
   * @see <a href="https://api.highcharts.com/gantt/plotOptions.column.label.boxesToAvoid">https://api.highcharts.com/gantt/plotOptions.column.label.boxesToAvoid</a>
   *
   * @implspec boxesToAvoid?: Array<LabelIntersectBoxObject>;
   *
   */
  @JSProperty("boxesToAvoid")
  void setBoxesToAvoid(Array<LabelIntersectBoxObject> value);

  /**
   * (Highcharts, Highstock, Gantt) Allow labels to be placed distant to the
   * graph if necessary, and draw a connector line to the graph. Setting this
   * option to true may decrease the performance significantly, since the
   * algorithm with systematically search for open spaces in the while plot
   * area. Visually, it may also result in a more cluttered chart, though more
   * of the series will be labeled.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.column.label.connectorAllowed">https://api.highcharts.com/highcharts/plotOptions.column.label.connectorAllowed</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.column.label.connectorAllowed">https://api.highcharts.com/highstock/plotOptions.column.label.connectorAllowed</a>
   * @see <a href="https://api.highcharts.com/gantt/plotOptions.column.label.connectorAllowed">https://api.highcharts.com/gantt/plotOptions.column.label.connectorAllowed</a>
   *
   * @implspec connectorAllowed?: boolean;
   *
   */
  @JSProperty("connectorAllowed")
  boolean getConnectorAllowed();

  /**
   * (Highcharts, Highstock, Gantt) Allow labels to be placed distant to the
   * graph if necessary, and draw a connector line to the graph. Setting this
   * option to true may decrease the performance significantly, since the
   * algorithm with systematically search for open spaces in the while plot
   * area. Visually, it may also result in a more cluttered chart, though more
   * of the series will be labeled.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.column.label.connectorAllowed">https://api.highcharts.com/highcharts/plotOptions.column.label.connectorAllowed</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.column.label.connectorAllowed">https://api.highcharts.com/highstock/plotOptions.column.label.connectorAllowed</a>
   * @see <a href="https://api.highcharts.com/gantt/plotOptions.column.label.connectorAllowed">https://api.highcharts.com/gantt/plotOptions.column.label.connectorAllowed</a>
   *
   * @implspec connectorAllowed?: boolean;
   *
   */
  @JSProperty("connectorAllowed")
  void setConnectorAllowed(boolean value);

  /**
   * (Highcharts, Highstock, Gantt) If the label is closer than this to a
   * neighbour graph, draw a connector.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.column.label.connectorNeighbourDistance">https://api.highcharts.com/highcharts/plotOptions.column.label.connectorNeighbourDistance</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.column.label.connectorNeighbourDistance">https://api.highcharts.com/highstock/plotOptions.column.label.connectorNeighbourDistance</a>
   * @see <a href="https://api.highcharts.com/gantt/plotOptions.column.label.connectorNeighbourDistance">https://api.highcharts.com/gantt/plotOptions.column.label.connectorNeighbourDistance</a>
   *
   * @implspec connectorNeighbourDistance?: number;
   *
   */
  @JSProperty("connectorNeighbourDistance")
  double getConnectorNeighbourDistance();

  /**
   * (Highcharts, Highstock, Gantt) If the label is closer than this to a
   * neighbour graph, draw a connector.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.column.label.connectorNeighbourDistance">https://api.highcharts.com/highcharts/plotOptions.column.label.connectorNeighbourDistance</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.column.label.connectorNeighbourDistance">https://api.highcharts.com/highstock/plotOptions.column.label.connectorNeighbourDistance</a>
   * @see <a href="https://api.highcharts.com/gantt/plotOptions.column.label.connectorNeighbourDistance">https://api.highcharts.com/gantt/plotOptions.column.label.connectorNeighbourDistance</a>
   *
   * @implspec connectorNeighbourDistance?: number;
   *
   */
  @JSProperty("connectorNeighbourDistance")
  void setConnectorNeighbourDistance(double value);

  /**
   * (Highcharts, Highstock, Gantt) Enable the series label per series.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.column.label.enabled">https://api.highcharts.com/highcharts/plotOptions.column.label.enabled</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.column.label.enabled">https://api.highcharts.com/highstock/plotOptions.column.label.enabled</a>
   * @see <a href="https://api.highcharts.com/gantt/plotOptions.column.label.enabled">https://api.highcharts.com/gantt/plotOptions.column.label.enabled</a>
   *
   * @implspec enabled?: boolean;
   *
   */
  @JSProperty("enabled")
  boolean getEnabled();

  /**
   * (Highcharts, Highstock, Gantt) Enable the series label per series.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.column.label.enabled">https://api.highcharts.com/highcharts/plotOptions.column.label.enabled</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.column.label.enabled">https://api.highcharts.com/highstock/plotOptions.column.label.enabled</a>
   * @see <a href="https://api.highcharts.com/gantt/plotOptions.column.label.enabled">https://api.highcharts.com/gantt/plotOptions.column.label.enabled</a>
   *
   * @implspec enabled?: boolean;
   *
   */
  @JSProperty("enabled")
  void setEnabled(boolean value);

  /**
   * (Highcharts, Highstock, Gantt) For area-like series, allow the font size
   * to vary so that small areas get a smaller font size. The default applies
   * this effect to area-like series but not line-like series.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.column.label.maxFontSize">https://api.highcharts.com/highcharts/plotOptions.column.label.maxFontSize</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.column.label.maxFontSize">https://api.highcharts.com/highstock/plotOptions.column.label.maxFontSize</a>
   * @see <a href="https://api.highcharts.com/gantt/plotOptions.column.label.maxFontSize">https://api.highcharts.com/gantt/plotOptions.column.label.maxFontSize</a>
   *
   * @implspec maxFontSize?: (number|null);
   *
   */
  @JSProperty("maxFontSize")
  double getMaxFontSize();

  /**
   * (Highcharts, Highstock, Gantt) For area-like series, allow the font size
   * to vary so that small areas get a smaller font size. The default applies
   * this effect to area-like series but not line-like series.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.column.label.maxFontSize">https://api.highcharts.com/highcharts/plotOptions.column.label.maxFontSize</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.column.label.maxFontSize">https://api.highcharts.com/highstock/plotOptions.column.label.maxFontSize</a>
   * @see <a href="https://api.highcharts.com/gantt/plotOptions.column.label.maxFontSize">https://api.highcharts.com/gantt/plotOptions.column.label.maxFontSize</a>
   *
   * @implspec maxFontSize?: (number|null);
   *
   */
  @JSProperty("maxFontSize")
  void setMaxFontSize(double value);

  /**
   * (Highcharts, Highstock, Gantt) For area-like series, allow the font size
   * to vary so that small areas get a smaller font size. The default applies
   * this effect to area-like series but not line-like series.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.column.label.minFontSize">https://api.highcharts.com/highcharts/plotOptions.column.label.minFontSize</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.column.label.minFontSize">https://api.highcharts.com/highstock/plotOptions.column.label.minFontSize</a>
   * @see <a href="https://api.highcharts.com/gantt/plotOptions.column.label.minFontSize">https://api.highcharts.com/gantt/plotOptions.column.label.minFontSize</a>
   *
   * @implspec minFontSize?: (number|null);
   *
   */
  @JSProperty("minFontSize")
  double getMinFontSize();

  /**
   * (Highcharts, Highstock, Gantt) For area-like series, allow the font size
   * to vary so that small areas get a smaller font size. The default applies
   * this effect to area-like series but not line-like series.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.column.label.minFontSize">https://api.highcharts.com/highcharts/plotOptions.column.label.minFontSize</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.column.label.minFontSize">https://api.highcharts.com/highstock/plotOptions.column.label.minFontSize</a>
   * @see <a href="https://api.highcharts.com/gantt/plotOptions.column.label.minFontSize">https://api.highcharts.com/gantt/plotOptions.column.label.minFontSize</a>
   *
   * @implspec minFontSize?: (number|null);
   *
   */
  @JSProperty("minFontSize")
  void setMinFontSize(double value);

  /**
   * (Highcharts, Highstock, Gantt) Draw the label on the area of an area
   * series. By default it is drawn on the area. Set it to <code>false</code> to draw it
   * next to the graph instead.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.column.label.onArea">https://api.highcharts.com/highcharts/plotOptions.column.label.onArea</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.column.label.onArea">https://api.highcharts.com/highstock/plotOptions.column.label.onArea</a>
   * @see <a href="https://api.highcharts.com/gantt/plotOptions.column.label.onArea">https://api.highcharts.com/gantt/plotOptions.column.label.onArea</a>
   *
   * @implspec onArea?: (boolean|null);
   *
   */
  @JSProperty("onArea")
  boolean getOnArea();

  /**
   * (Highcharts, Highstock, Gantt) Draw the label on the area of an area
   * series. By default it is drawn on the area. Set it to <code>false</code> to draw it
   * next to the graph instead.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.column.label.onArea">https://api.highcharts.com/highcharts/plotOptions.column.label.onArea</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.column.label.onArea">https://api.highcharts.com/highstock/plotOptions.column.label.onArea</a>
   * @see <a href="https://api.highcharts.com/gantt/plotOptions.column.label.onArea">https://api.highcharts.com/gantt/plotOptions.column.label.onArea</a>
   *
   * @implspec onArea?: (boolean|null);
   *
   */
  @JSProperty("onArea")
  void setOnArea(boolean value);

  /**
   * (Highcharts, Highstock, Gantt) Styles for the series label. The color
   * defaults to the series color, or a contrast color if <code>onArea</code>.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.column.label.style">https://api.highcharts.com/highcharts/plotOptions.column.label.style</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.column.label.style">https://api.highcharts.com/highstock/plotOptions.column.label.style</a>
   * @see <a href="https://api.highcharts.com/gantt/plotOptions.column.label.style">https://api.highcharts.com/gantt/plotOptions.column.label.style</a>
   *
   * @implspec style?: CSSObject;
   *
   */
  @JSProperty("style")
  @Nullable
  CSSObject getStyle();

  /**
   * (Highcharts, Highstock, Gantt) Styles for the series label. The color
   * defaults to the series color, or a contrast color if <code>onArea</code>.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.column.label.style">https://api.highcharts.com/highcharts/plotOptions.column.label.style</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.column.label.style">https://api.highcharts.com/highstock/plotOptions.column.label.style</a>
   * @see <a href="https://api.highcharts.com/gantt/plotOptions.column.label.style">https://api.highcharts.com/gantt/plotOptions.column.label.style</a>
   *
   * @implspec style?: CSSObject;
   *
   */
  @JSProperty("style")
  void setStyle(CSSObject value);
}
