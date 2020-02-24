package com.github.fluorumlabs.disconnect.highcharts;

import java.lang.String;
import javax.annotation.Nullable;
import js.extras.JsEnum;
import js.lang.Any;
import org.teavm.jso.JSProperty;

/**
 * (Gantt) The Pathfinder module allows you to define connections between any
 * two points, represented as lines - optionally with markers for the start
 * and/or end points. Multiple algorithms are available for calculating how the
 * connecting lines are drawn.
 *
 * Connector functionality requires Highcharts Gantt to be loaded. In Gantt
 * charts, the connectors are used to draw dependencies between tasks.
 *
 * @see <a href="https://api.highcharts.com/gantt/connectors">https://api.highcharts.com/gantt/connectors</a>
 *
 */
public interface ConnectorsOptions extends Any {
  /**
   * (Gantt) Set the default pathfinder margin to use, in pixels. Some
   * Pathfinder algorithms attempt to avoid obstacles, such as other points in
   * the chart. These algorithms use this margin to determine how close lines
   * can be to an obstacle. The default is to compute this automatically from
   * the size of the obstacles in the chart.
   *
   * To draw connecting lines close to existing points, set this to a low
   * number. For more space around existing points, set this number higher.
   *
   * @see <a href="https://api.highcharts.com/gantt/connectors.algorithmMargin">https://api.highcharts.com/gantt/connectors.algorithmMargin</a>
   *
   * @implspec algorithmMargin?: number;
   *
   */
  @JSProperty("algorithmMargin")
  double getAlgorithmMargin();

  /**
   * (Gantt) Set the default pathfinder margin to use, in pixels. Some
   * Pathfinder algorithms attempt to avoid obstacles, such as other points in
   * the chart. These algorithms use this margin to determine how close lines
   * can be to an obstacle. The default is to compute this automatically from
   * the size of the obstacles in the chart.
   *
   * To draw connecting lines close to existing points, set this to a low
   * number. For more space around existing points, set this number higher.
   *
   * @see <a href="https://api.highcharts.com/gantt/connectors.algorithmMargin">https://api.highcharts.com/gantt/connectors.algorithmMargin</a>
   *
   * @implspec algorithmMargin?: number;
   *
   */
  @JSProperty("algorithmMargin")
  void setAlgorithmMargin(double value);

  /**
   * (Gantt) Set the default dash style for this chart's connecting lines.
   *
   * @see <a href="https://api.highcharts.com/gantt/connectors.dashStyle">https://api.highcharts.com/gantt/connectors.dashStyle</a>
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
   * @see <a href="https://api.highcharts.com/gantt/connectors.dashStyle">https://api.highcharts.com/gantt/connectors.dashStyle</a>
   *
   * @implspec dashStyle?: string;
   *
   */
  @JSProperty("dashStyle")
  void setDashStyle(String value);

  /**
   * (Gantt) Enable connectors for this chart. Requires Highcharts Gantt.
   *
   * @see <a href="https://api.highcharts.com/gantt/connectors.enabled">https://api.highcharts.com/gantt/connectors.enabled</a>
   *
   * @implspec enabled?: boolean;
   *
   */
  @JSProperty("enabled")
  boolean getEnabled();

  /**
   * (Gantt) Enable connectors for this chart. Requires Highcharts Gantt.
   *
   * @see <a href="https://api.highcharts.com/gantt/connectors.enabled">https://api.highcharts.com/gantt/connectors.enabled</a>
   *
   * @implspec enabled?: boolean;
   *
   */
  @JSProperty("enabled")
  void setEnabled(boolean value);

  /**
   * (Gantt) Marker options specific to the end markers for this chart's
   * Pathfinder connectors. Overrides the generic marker options.
   *
   * @see <a href="https://api.highcharts.com/gantt/connectors.endMarker">https://api.highcharts.com/gantt/connectors.endMarker</a>
   *
   * @implspec endMarker?: ConnectorsEndMarkerOptions;
   *
   */
  @JSProperty("endMarker")
  @Nullable
  ConnectorsEndMarkerOptions getEndMarker();

  /**
   * (Gantt) Marker options specific to the end markers for this chart's
   * Pathfinder connectors. Overrides the generic marker options.
   *
   * @see <a href="https://api.highcharts.com/gantt/connectors.endMarker">https://api.highcharts.com/gantt/connectors.endMarker</a>
   *
   * @implspec endMarker?: ConnectorsEndMarkerOptions;
   *
   */
  @JSProperty("endMarker")
  void setEndMarker(ConnectorsEndMarkerOptions value);

  /**
   * (Gantt) Set the default color for this chart's Pathfinder connecting
   * lines. Defaults to the color of the point being connected.
   *
   * @see <a href="https://api.highcharts.com/gantt/connectors.lineColor">https://api.highcharts.com/gantt/connectors.lineColor</a>
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
   * @see <a href="https://api.highcharts.com/gantt/connectors.lineColor">https://api.highcharts.com/gantt/connectors.lineColor</a>
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
   * @see <a href="https://api.highcharts.com/gantt/connectors.lineWidth">https://api.highcharts.com/gantt/connectors.lineWidth</a>
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
   * @see <a href="https://api.highcharts.com/gantt/connectors.lineWidth">https://api.highcharts.com/gantt/connectors.lineWidth</a>
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
   * @see <a href="https://api.highcharts.com/gantt/connectors.marker">https://api.highcharts.com/gantt/connectors.marker</a>
   *
   * @implspec marker?: ConnectorsMarkerOptions;
   *
   */
  @JSProperty("marker")
  @Nullable
  ConnectorsMarkerOptions getMarker();

  /**
   * (Gantt) Marker options for this chart's Pathfinder connectors. Note that
   * this option is overridden by the <code>startMarker</code> and <code>endMarker</code> options.
   *
   * @see <a href="https://api.highcharts.com/gantt/connectors.marker">https://api.highcharts.com/gantt/connectors.marker</a>
   *
   * @implspec marker?: ConnectorsMarkerOptions;
   *
   */
  @JSProperty("marker")
  void setMarker(ConnectorsMarkerOptions value);

  /**
   * (Gantt) Marker options specific to the start markers for this chart's
   * Pathfinder connectors. Overrides the generic marker options.
   *
   * @see <a href="https://api.highcharts.com/gantt/connectors.startMarker">https://api.highcharts.com/gantt/connectors.startMarker</a>
   *
   * @implspec startMarker?: ConnectorsStartMarkerOptions;
   *
   */
  @JSProperty("startMarker")
  @Nullable
  ConnectorsStartMarkerOptions getStartMarker();

  /**
   * (Gantt) Marker options specific to the start markers for this chart's
   * Pathfinder connectors. Overrides the generic marker options.
   *
   * @see <a href="https://api.highcharts.com/gantt/connectors.startMarker">https://api.highcharts.com/gantt/connectors.startMarker</a>
   *
   * @implspec startMarker?: ConnectorsStartMarkerOptions;
   *
   */
  @JSProperty("startMarker")
  void setStartMarker(ConnectorsStartMarkerOptions value);

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
   * @see <a href="https://api.highcharts.com/gantt/connectors.type">https://api.highcharts.com/gantt/connectors.type</a>
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
   * @see <a href="https://api.highcharts.com/gantt/connectors.type">https://api.highcharts.com/gantt/connectors.type</a>
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
