package com.github.fluorumlabs.disconnect.highcharts;

import java.lang.String;
import javax.annotation.Nullable;
import js.lang.Any;
import js.lang.Unknown;
import org.teavm.jso.JSProperty;

/**
 * (Gantt) Marker options specific to the start markers for this chart's
 * Pathfinder connectors. Overrides the generic marker options.
 *
 * @see <a href="https://api.highcharts.com/gantt/plotOptions.arearange.connectors.startMarker">https://api.highcharts.com/gantt/plotOptions.arearange.connectors.startMarker</a>
 *
 */
public interface PlotArearangeConnectorsStartMarkerOptions extends Any {
  /**
   * (Gantt) Horizontal alignment of the markers relative to the points.
   *
   * @see <a href="https://api.highcharts.com/gantt/plotOptions.arearange.connectors.startMarker.align">https://api.highcharts.com/gantt/plotOptions.arearange.connectors.startMarker.align</a>
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
   * @see <a href="https://api.highcharts.com/gantt/plotOptions.arearange.connectors.startMarker.align">https://api.highcharts.com/gantt/plotOptions.arearange.connectors.startMarker.align</a>
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
   * @see <a href="https://api.highcharts.com/gantt/plotOptions.arearange.connectors.startMarker.color">https://api.highcharts.com/gantt/plotOptions.arearange.connectors.startMarker.color</a>
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
   * @see <a href="https://api.highcharts.com/gantt/plotOptions.arearange.connectors.startMarker.color">https://api.highcharts.com/gantt/plotOptions.arearange.connectors.startMarker.color</a>
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
   * @see <a href="https://api.highcharts.com/gantt/plotOptions.arearange.connectors.startMarker.color">https://api.highcharts.com/gantt/plotOptions.arearange.connectors.startMarker.color</a>
   *
   * @implspec color?: (ColorString|GradientColorObject);
   *
   */
  @JSProperty("color")
  void setColor(String value);

  /**
   * (Gantt) Enable markers for the connectors.
   *
   * @see <a href="https://api.highcharts.com/gantt/plotOptions.arearange.connectors.startMarker.enabled">https://api.highcharts.com/gantt/plotOptions.arearange.connectors.startMarker.enabled</a>
   *
   * @implspec enabled?: boolean;
   *
   */
  @JSProperty("enabled")
  boolean getEnabled();

  /**
   * (Gantt) Enable markers for the connectors.
   *
   * @see <a href="https://api.highcharts.com/gantt/plotOptions.arearange.connectors.startMarker.enabled">https://api.highcharts.com/gantt/plotOptions.arearange.connectors.startMarker.enabled</a>
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
   * @see <a href="https://api.highcharts.com/gantt/plotOptions.arearange.connectors.startMarker.height">https://api.highcharts.com/gantt/plotOptions.arearange.connectors.startMarker.height</a>
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
   * @see <a href="https://api.highcharts.com/gantt/plotOptions.arearange.connectors.startMarker.height">https://api.highcharts.com/gantt/plotOptions.arearange.connectors.startMarker.height</a>
   *
   * @implspec height?: number;
   *
   */
  @JSProperty("height")
  void setHeight(double value);

  /**
   * (Gantt) Whether or not to draw the markers inside the points.
   *
   * @see <a href="https://api.highcharts.com/gantt/plotOptions.arearange.connectors.startMarker.inside">https://api.highcharts.com/gantt/plotOptions.arearange.connectors.startMarker.inside</a>
   *
   * @implspec inside?: boolean;
   *
   */
  @JSProperty("inside")
  boolean getInside();

  /**
   * (Gantt) Whether or not to draw the markers inside the points.
   *
   * @see <a href="https://api.highcharts.com/gantt/plotOptions.arearange.connectors.startMarker.inside">https://api.highcharts.com/gantt/plotOptions.arearange.connectors.startMarker.inside</a>
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
   * @see <a href="https://api.highcharts.com/gantt/plotOptions.arearange.connectors.startMarker.lineColor">https://api.highcharts.com/gantt/plotOptions.arearange.connectors.startMarker.lineColor</a>
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
   * @see <a href="https://api.highcharts.com/gantt/plotOptions.arearange.connectors.startMarker.lineColor">https://api.highcharts.com/gantt/plotOptions.arearange.connectors.startMarker.lineColor</a>
   *
   * @implspec lineColor?: ColorString;
   *
   */
  @JSProperty("lineColor")
  void setLineColor(String value);

  /**
   * (Gantt) Set the line/border width of the pathfinder markers.
   *
   * @see <a href="https://api.highcharts.com/gantt/plotOptions.arearange.connectors.startMarker.lineWidth">https://api.highcharts.com/gantt/plotOptions.arearange.connectors.startMarker.lineWidth</a>
   *
   * @implspec lineWidth?: number;
   *
   */
  @JSProperty("lineWidth")
  double getLineWidth();

  /**
   * (Gantt) Set the line/border width of the pathfinder markers.
   *
   * @see <a href="https://api.highcharts.com/gantt/plotOptions.arearange.connectors.startMarker.lineWidth">https://api.highcharts.com/gantt/plotOptions.arearange.connectors.startMarker.lineWidth</a>
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
   * @see <a href="https://api.highcharts.com/gantt/plotOptions.arearange.connectors.startMarker.radius">https://api.highcharts.com/gantt/plotOptions.arearange.connectors.startMarker.radius</a>
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
   * @see <a href="https://api.highcharts.com/gantt/plotOptions.arearange.connectors.startMarker.radius">https://api.highcharts.com/gantt/plotOptions.arearange.connectors.startMarker.radius</a>
   *
   * @implspec radius?: number;
   *
   */
  @JSProperty("radius")
  void setRadius(double value);

  /**
   * (Gantt) Set the symbol of the connector start markers.
   *
   * @see <a href="https://api.highcharts.com/gantt/plotOptions.arearange.connectors.startMarker.symbol">https://api.highcharts.com/gantt/plotOptions.arearange.connectors.startMarker.symbol</a>
   *
   * @implspec symbol?: string;
   *
   */
  @JSProperty("symbol")
  @Nullable
  String getSymbol();

  /**
   * (Gantt) Set the symbol of the connector start markers.
   *
   * @see <a href="https://api.highcharts.com/gantt/plotOptions.arearange.connectors.startMarker.symbol">https://api.highcharts.com/gantt/plotOptions.arearange.connectors.startMarker.symbol</a>
   *
   * @implspec symbol?: string;
   *
   */
  @JSProperty("symbol")
  void setSymbol(String value);

  /**
   * (Gantt) Vertical alignment of the markers relative to the points.
   *
   * @see <a href="https://api.highcharts.com/gantt/plotOptions.arearange.connectors.startMarker.verticalAlign">https://api.highcharts.com/gantt/plotOptions.arearange.connectors.startMarker.verticalAlign</a>
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
   * @see <a href="https://api.highcharts.com/gantt/plotOptions.arearange.connectors.startMarker.verticalAlign">https://api.highcharts.com/gantt/plotOptions.arearange.connectors.startMarker.verticalAlign</a>
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
   * @see <a href="https://api.highcharts.com/gantt/plotOptions.arearange.connectors.startMarker.width">https://api.highcharts.com/gantt/plotOptions.arearange.connectors.startMarker.width</a>
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
   * @see <a href="https://api.highcharts.com/gantt/plotOptions.arearange.connectors.startMarker.width">https://api.highcharts.com/gantt/plotOptions.arearange.connectors.startMarker.width</a>
   *
   * @implspec width?: number;
   *
   */
  @JSProperty("width")
  void setWidth(double value);
}
