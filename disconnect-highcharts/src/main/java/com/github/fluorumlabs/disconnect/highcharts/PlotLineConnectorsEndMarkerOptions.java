package com.github.fluorumlabs.disconnect.highcharts;

import java.lang.String;
import javax.annotation.Nullable;
import js.lang.Any;
import js.lang.Unknown;
import org.teavm.jso.JSProperty;

/**
 * (Gantt) Marker options specific to the end markers for this chart's
 * Pathfinder connectors. Overrides the generic marker options.
 *
 * @see <a href="https://api.highcharts.com/gantt/plotOptions.line.connectors.endMarker">https://api.highcharts.com/gantt/plotOptions.line.connectors.endMarker</a>
 *
 */
public interface PlotLineConnectorsEndMarkerOptions extends Any {
  /**
   * (Gantt) Horizontal alignment of the markers relative to the points.
   *
   * @see <a href="https://api.highcharts.com/gantt/plotOptions.line.connectors.endMarker.align">https://api.highcharts.com/gantt/plotOptions.line.connectors.endMarker.align</a>
   *
   * @implspec align?: string;
   *
   */
  @JSProperty("align")
  @Nullable
  String getAlign();

  /**
   * (Gantt) Horizontal alignment of the markers relative to the points.
   *
   * @see <a href="https://api.highcharts.com/gantt/plotOptions.line.connectors.endMarker.align">https://api.highcharts.com/gantt/plotOptions.line.connectors.endMarker.align</a>
   *
   * @implspec align?: string;
   *
   */
  @JSProperty("align")
  void setAlign(String value);

  /**
   * (Gantt) Set the color of the connector markers. By default this is the
   * same as the connector color.
   *
   * @see <a href="https://api.highcharts.com/gantt/plotOptions.line.connectors.endMarker.color">https://api.highcharts.com/gantt/plotOptions.line.connectors.endMarker.color</a>
   *
   * @implspec color?: (ColorString|GradientColorObject);
   *
   */
  @JSProperty("color")
  @Nullable
  Unknown getColor();

  /**
   * (Gantt) Set the color of the connector markers. By default this is the
   * same as the connector color.
   *
   * @see <a href="https://api.highcharts.com/gantt/plotOptions.line.connectors.endMarker.color">https://api.highcharts.com/gantt/plotOptions.line.connectors.endMarker.color</a>
   *
   * @implspec color?: (ColorString|GradientColorObject);
   *
   */
  @JSProperty("color")
  void setColor(GradientColorObject value);

  /**
   * (Gantt) Set the color of the connector markers. By default this is the
   * same as the connector color.
   *
   * @see <a href="https://api.highcharts.com/gantt/plotOptions.line.connectors.endMarker.color">https://api.highcharts.com/gantt/plotOptions.line.connectors.endMarker.color</a>
   *
   * @implspec color?: (ColorString|GradientColorObject);
   *
   */
  @JSProperty("color")
  void setColor(String value);

  /**
   * (Gantt) Enable markers for the connectors.
   *
   * @see <a href="https://api.highcharts.com/gantt/plotOptions.line.connectors.endMarker.enabled">https://api.highcharts.com/gantt/plotOptions.line.connectors.endMarker.enabled</a>
   *
   * @implspec enabled?: boolean;
   *
   */
  @JSProperty("enabled")
  boolean getEnabled();

  /**
   * (Gantt) Enable markers for the connectors.
   *
   * @see <a href="https://api.highcharts.com/gantt/plotOptions.line.connectors.endMarker.enabled">https://api.highcharts.com/gantt/plotOptions.line.connectors.endMarker.enabled</a>
   *
   * @implspec enabled?: boolean;
   *
   */
  @JSProperty("enabled")
  void setEnabled(boolean value);

  /**
   * (Gantt) Set the height of the connector markers. If not supplied, this is
   * inferred from the marker radius.
   *
   * @see <a href="https://api.highcharts.com/gantt/plotOptions.line.connectors.endMarker.height">https://api.highcharts.com/gantt/plotOptions.line.connectors.endMarker.height</a>
   *
   * @implspec height?: number;
   *
   */
  @JSProperty("height")
  double getHeight();

  /**
   * (Gantt) Set the height of the connector markers. If not supplied, this is
   * inferred from the marker radius.
   *
   * @see <a href="https://api.highcharts.com/gantt/plotOptions.line.connectors.endMarker.height">https://api.highcharts.com/gantt/plotOptions.line.connectors.endMarker.height</a>
   *
   * @implspec height?: number;
   *
   */
  @JSProperty("height")
  void setHeight(double value);

  /**
   * (Gantt) Whether or not to draw the markers inside the points.
   *
   * @see <a href="https://api.highcharts.com/gantt/plotOptions.line.connectors.endMarker.inside">https://api.highcharts.com/gantt/plotOptions.line.connectors.endMarker.inside</a>
   *
   * @implspec inside?: boolean;
   *
   */
  @JSProperty("inside")
  boolean getInside();

  /**
   * (Gantt) Whether or not to draw the markers inside the points.
   *
   * @see <a href="https://api.highcharts.com/gantt/plotOptions.line.connectors.endMarker.inside">https://api.highcharts.com/gantt/plotOptions.line.connectors.endMarker.inside</a>
   *
   * @implspec inside?: boolean;
   *
   */
  @JSProperty("inside")
  void setInside(boolean value);

  /**
   * (Gantt) Set the line/border color of the connector markers. By default
   * this is the same as the marker color.
   *
   * @see <a href="https://api.highcharts.com/gantt/plotOptions.line.connectors.endMarker.lineColor">https://api.highcharts.com/gantt/plotOptions.line.connectors.endMarker.lineColor</a>
   *
   * @implspec lineColor?: ColorString;
   *
   */
  @JSProperty("lineColor")
  @Nullable
  String getLineColor();

  /**
   * (Gantt) Set the line/border color of the connector markers. By default
   * this is the same as the marker color.
   *
   * @see <a href="https://api.highcharts.com/gantt/plotOptions.line.connectors.endMarker.lineColor">https://api.highcharts.com/gantt/plotOptions.line.connectors.endMarker.lineColor</a>
   *
   * @implspec lineColor?: ColorString;
   *
   */
  @JSProperty("lineColor")
  void setLineColor(String value);

  /**
   * (Gantt) Set the line/border width of the pathfinder markers.
   *
   * @see <a href="https://api.highcharts.com/gantt/plotOptions.line.connectors.endMarker.lineWidth">https://api.highcharts.com/gantt/plotOptions.line.connectors.endMarker.lineWidth</a>
   *
   * @implspec lineWidth?: number;
   *
   */
  @JSProperty("lineWidth")
  double getLineWidth();

  /**
   * (Gantt) Set the line/border width of the pathfinder markers.
   *
   * @see <a href="https://api.highcharts.com/gantt/plotOptions.line.connectors.endMarker.lineWidth">https://api.highcharts.com/gantt/plotOptions.line.connectors.endMarker.lineWidth</a>
   *
   * @implspec lineWidth?: number;
   *
   */
  @JSProperty("lineWidth")
  void setLineWidth(double value);

  /**
   * (Gantt) Set the radius of the connector markers. The default is
   * automatically computed based on the algorithmMargin setting.
   *
   * Setting marker.width and marker.height will override this setting.
   *
   * @see <a href="https://api.highcharts.com/gantt/plotOptions.line.connectors.endMarker.radius">https://api.highcharts.com/gantt/plotOptions.line.connectors.endMarker.radius</a>
   *
   * @implspec radius?: number;
   *
   */
  @JSProperty("radius")
  double getRadius();

  /**
   * (Gantt) Set the radius of the connector markers. The default is
   * automatically computed based on the algorithmMargin setting.
   *
   * Setting marker.width and marker.height will override this setting.
   *
   * @see <a href="https://api.highcharts.com/gantt/plotOptions.line.connectors.endMarker.radius">https://api.highcharts.com/gantt/plotOptions.line.connectors.endMarker.radius</a>
   *
   * @implspec radius?: number;
   *
   */
  @JSProperty("radius")
  void setRadius(double value);

  /**
   * (Gantt) Set the symbol of the connector end markers.
   *
   * @see <a href="https://api.highcharts.com/gantt/plotOptions.line.connectors.endMarker.symbol">https://api.highcharts.com/gantt/plotOptions.line.connectors.endMarker.symbol</a>
   *
   * @implspec symbol?: string;
   *
   */
  @JSProperty("symbol")
  @Nullable
  String getSymbol();

  /**
   * (Gantt) Set the symbol of the connector end markers.
   *
   * @see <a href="https://api.highcharts.com/gantt/plotOptions.line.connectors.endMarker.symbol">https://api.highcharts.com/gantt/plotOptions.line.connectors.endMarker.symbol</a>
   *
   * @implspec symbol?: string;
   *
   */
  @JSProperty("symbol")
  void setSymbol(String value);

  /**
   * (Gantt) Vertical alignment of the markers relative to the points.
   *
   * @see <a href="https://api.highcharts.com/gantt/plotOptions.line.connectors.endMarker.verticalAlign">https://api.highcharts.com/gantt/plotOptions.line.connectors.endMarker.verticalAlign</a>
   *
   * @implspec verticalAlign?: string;
   *
   */
  @JSProperty("verticalAlign")
  @Nullable
  String getVerticalAlign();

  /**
   * (Gantt) Vertical alignment of the markers relative to the points.
   *
   * @see <a href="https://api.highcharts.com/gantt/plotOptions.line.connectors.endMarker.verticalAlign">https://api.highcharts.com/gantt/plotOptions.line.connectors.endMarker.verticalAlign</a>
   *
   * @implspec verticalAlign?: string;
   *
   */
  @JSProperty("verticalAlign")
  void setVerticalAlign(String value);

  /**
   * (Gantt) Set the width of the connector markers. If not supplied, this is
   * inferred from the marker radius.
   *
   * @see <a href="https://api.highcharts.com/gantt/plotOptions.line.connectors.endMarker.width">https://api.highcharts.com/gantt/plotOptions.line.connectors.endMarker.width</a>
   *
   * @implspec width?: number;
   *
   */
  @JSProperty("width")
  double getWidth();

  /**
   * (Gantt) Set the width of the connector markers. If not supplied, this is
   * inferred from the marker radius.
   *
   * @see <a href="https://api.highcharts.com/gantt/plotOptions.line.connectors.endMarker.width">https://api.highcharts.com/gantt/plotOptions.line.connectors.endMarker.width</a>
   *
   * @implspec width?: number;
   *
   */
  @JSProperty("width")
  void setWidth(double value);
}
