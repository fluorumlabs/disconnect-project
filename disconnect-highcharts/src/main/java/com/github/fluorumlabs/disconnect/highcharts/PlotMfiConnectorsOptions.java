package com.github.fluorumlabs.disconnect.highcharts;

import java.lang.String;
import javax.annotation.Nullable;
import js.extras.JsEnum;
import js.lang.Any;
import org.teavm.jso.JSProperty;

/**
 * (Gantt) Override Pathfinder connector options for a series. Requires
 * Highcharts Gantt to be loaded.
 *
 * @see <a href="https://api.highcharts.com/gantt/plotOptions.mfi.connectors">https://api.highcharts.com/gantt/plotOptions.mfi.connectors</a>
 *
 */
public interface PlotMfiConnectorsOptions extends Any {
  /**
   * (Gantt) Set the default dash style for this chart's connecting lines.
   *
   * @see <a href="https://api.highcharts.com/gantt/plotOptions.mfi.connectors.dashStyle">https://api.highcharts.com/gantt/plotOptions.mfi.connectors.dashStyle</a>
   *
   * @implspec dashStyle?: string;
   *
   */
  @JSProperty("dashStyle")
  @Nullable
  String getDashStyle();

  /**
   * (Gantt) Set the default dash style for this chart's connecting lines.
   *
   * @see <a href="https://api.highcharts.com/gantt/plotOptions.mfi.connectors.dashStyle">https://api.highcharts.com/gantt/plotOptions.mfi.connectors.dashStyle</a>
   *
   * @implspec dashStyle?: string;
   *
   */
  @JSProperty("dashStyle")
  void setDashStyle(String value);

  /**
   * (Gantt) Marker options specific to the end markers for this chart's
   * Pathfinder connectors. Overrides the generic marker options.
   *
   * @see <a href="https://api.highcharts.com/gantt/plotOptions.mfi.connectors.endMarker">https://api.highcharts.com/gantt/plotOptions.mfi.connectors.endMarker</a>
   *
   * @implspec endMarker?: PlotMfiConnectorsEndMarkerOptions;
   *
   */
  @JSProperty("endMarker")
  @Nullable
  PlotMfiConnectorsEndMarkerOptions getEndMarker();

  /**
   * (Gantt) Marker options specific to the end markers for this chart's
   * Pathfinder connectors. Overrides the generic marker options.
   *
   * @see <a href="https://api.highcharts.com/gantt/plotOptions.mfi.connectors.endMarker">https://api.highcharts.com/gantt/plotOptions.mfi.connectors.endMarker</a>
   *
   * @implspec endMarker?: PlotMfiConnectorsEndMarkerOptions;
   *
   */
  @JSProperty("endMarker")
  void setEndMarker(PlotMfiConnectorsEndMarkerOptions value);

  /**
   * (Gantt) Set the default color for this chart's Pathfinder connecting
   * lines. Defaults to the color of the point being connected.
   *
   * @see <a href="https://api.highcharts.com/gantt/plotOptions.mfi.connectors.lineColor">https://api.highcharts.com/gantt/plotOptions.mfi.connectors.lineColor</a>
   *
   * @implspec lineColor?: ColorString;
   *
   */
  @JSProperty("lineColor")
  @Nullable
  String getLineColor();

  /**
   * (Gantt) Set the default color for this chart's Pathfinder connecting
   * lines. Defaults to the color of the point being connected.
   *
   * @see <a href="https://api.highcharts.com/gantt/plotOptions.mfi.connectors.lineColor">https://api.highcharts.com/gantt/plotOptions.mfi.connectors.lineColor</a>
   *
   * @implspec lineColor?: ColorString;
   *
   */
  @JSProperty("lineColor")
  void setLineColor(String value);

  /**
   * (Gantt) Set the default pixel width for this chart's Pathfinder
   * connecting lines.
   *
   * @see <a href="https://api.highcharts.com/gantt/plotOptions.mfi.connectors.lineWidth">https://api.highcharts.com/gantt/plotOptions.mfi.connectors.lineWidth</a>
   *
   * @implspec lineWidth?: number;
   *
   */
  @JSProperty("lineWidth")
  double getLineWidth();

  /**
   * (Gantt) Set the default pixel width for this chart's Pathfinder
   * connecting lines.
   *
   * @see <a href="https://api.highcharts.com/gantt/plotOptions.mfi.connectors.lineWidth">https://api.highcharts.com/gantt/plotOptions.mfi.connectors.lineWidth</a>
   *
   * @implspec lineWidth?: number;
   *
   */
  @JSProperty("lineWidth")
  void setLineWidth(double value);

  /**
   * (Gantt) Marker options for this chart's Pathfinder connectors. Note that
   * this option is overridden by the <code>startMarker</code> and <code>endMarker</code> options.
   *
   * @see <a href="https://api.highcharts.com/gantt/plotOptions.mfi.connectors.marker">https://api.highcharts.com/gantt/plotOptions.mfi.connectors.marker</a>
   *
   * @implspec marker?: PlotMfiConnectorsMarkerOptions;
   *
   */
  @JSProperty("marker")
  @Nullable
  PlotMfiConnectorsMarkerOptions getMarker();

  /**
   * (Gantt) Marker options for this chart's Pathfinder connectors. Note that
   * this option is overridden by the <code>startMarker</code> and <code>endMarker</code> options.
   *
   * @see <a href="https://api.highcharts.com/gantt/plotOptions.mfi.connectors.marker">https://api.highcharts.com/gantt/plotOptions.mfi.connectors.marker</a>
   *
   * @implspec marker?: PlotMfiConnectorsMarkerOptions;
   *
   */
  @JSProperty("marker")
  void setMarker(PlotMfiConnectorsMarkerOptions value);

  /**
   * (Gantt) Marker options specific to the start markers for this chart's
   * Pathfinder connectors. Overrides the generic marker options.
   *
   * @see <a href="https://api.highcharts.com/gantt/plotOptions.mfi.connectors.startMarker">https://api.highcharts.com/gantt/plotOptions.mfi.connectors.startMarker</a>
   *
   * @implspec startMarker?: PlotMfiConnectorsStartMarkerOptions;
   *
   */
  @JSProperty("startMarker")
  @Nullable
  PlotMfiConnectorsStartMarkerOptions getStartMarker();

  /**
   * (Gantt) Marker options specific to the start markers for this chart's
   * Pathfinder connectors. Overrides the generic marker options.
   *
   * @see <a href="https://api.highcharts.com/gantt/plotOptions.mfi.connectors.startMarker">https://api.highcharts.com/gantt/plotOptions.mfi.connectors.startMarker</a>
   *
   * @implspec startMarker?: PlotMfiConnectorsStartMarkerOptions;
   *
   */
  @JSProperty("startMarker")
  void setStartMarker(PlotMfiConnectorsStartMarkerOptions value);

  /**
   * (Gantt) Set the default pathfinder algorithm to use for this chart. It is
   * possible to define your own algorithms by adding them to the
   * Highcharts.Pathfinder.prototype.algorithms object before the chart has
   * been created.
   *
   * The default algorithms are as follows:
   *
   * <code>straight</code>: Draws a straight line between the connecting points. Does not
   * avoid other points when drawing.
   *
   * <code>simpleConnect</code>: Finds a path between the points using right angles only.
   * Takes only starting/ending points into account, and will not avoid other
   * points.
   *
   * <code>fastAvoid</code>: Finds a path between the points using right angles only.
   * Will attempt to avoid other points, but its focus is performance over
   * accuracy. Works well with less dense datasets.
   *
   * Default value: <code>straight</code> is used as default for most series types, while
   * <code>simpleConnect</code> is used as default for Gantt series, to show dependencies
   * between points.
   *
   * @see <a href="https://api.highcharts.com/gantt/plotOptions.mfi.connectors.type">https://api.highcharts.com/gantt/plotOptions.mfi.connectors.type</a>
   *
   * @implspec type?: (&quot;straight&quot;|&quot;fastAvoid&quot;|&quot;simpleConnect&quot;);
   *
   */
  @JSProperty("type")
  @Nullable
  Type getType();

  /**
   * (Gantt) Set the default pathfinder algorithm to use for this chart. It is
   * possible to define your own algorithms by adding them to the
   * Highcharts.Pathfinder.prototype.algorithms object before the chart has
   * been created.
   *
   * The default algorithms are as follows:
   *
   * <code>straight</code>: Draws a straight line between the connecting points. Does not
   * avoid other points when drawing.
   *
   * <code>simpleConnect</code>: Finds a path between the points using right angles only.
   * Takes only starting/ending points into account, and will not avoid other
   * points.
   *
   * <code>fastAvoid</code>: Finds a path between the points using right angles only.
   * Will attempt to avoid other points, but its focus is performance over
   * accuracy. Works well with less dense datasets.
   *
   * Default value: <code>straight</code> is used as default for most series types, while
   * <code>simpleConnect</code> is used as default for Gantt series, to show dependencies
   * between points.
   *
   * @see <a href="https://api.highcharts.com/gantt/plotOptions.mfi.connectors.type">https://api.highcharts.com/gantt/plotOptions.mfi.connectors.type</a>
   *
   * @implspec type?: (&quot;straight&quot;|&quot;fastAvoid&quot;|&quot;simpleConnect&quot;);
   *
   */
  @JSProperty("type")
  void setType(Type value);

  /**
   */
  abstract class Type extends JsEnum {
    public static final Type STRAIGHT = JsEnum.of("straight");

    public static final Type FASTAVOID = JsEnum.of("fastAvoid");

    public static final Type SIMPLECONNECT = JsEnum.of("simpleConnect");
  }
}
