package com.github.fluorumlabs.disconnect.highcharts;

import java.lang.String;
import javax.annotation.Nullable;
import js.lang.Any;
import js.lang.Unknown;
import org.teavm.jso.JSProperty;

/**
 * (Highcharts, Highstock, Highmaps) An array of points for the shape. This
 * option is available for shapes which can use multiple points such as path. A
 * point can be either a point object or a point's id.
 *
 * @see <a href="https://api.highcharts.com/highcharts/annotations.shapes.points">https://api.highcharts.com/highcharts/annotations.shapes.points</a>
 * @see <a href="https://api.highcharts.com/highstock/annotations.shapes.points">https://api.highcharts.com/highstock/annotations.shapes.points</a>
 * @see <a href="https://api.highcharts.com/highmaps/annotations.shapes.points">https://api.highcharts.com/highmaps/annotations.shapes.points</a>
 *
 */
public interface AnnotationsShapesPointsOptions extends Any {
  /**
   * (Highcharts, Highstock, Highmaps) The x position of the point. Units can
   * be either in axis or chart pixel coordinates.
   *
   * @see <a href="https://api.highcharts.com/highcharts/annotations.shapes.points.x">https://api.highcharts.com/highcharts/annotations.shapes.points.x</a>
   * @see <a href="https://api.highcharts.com/highstock/annotations.shapes.points.x">https://api.highcharts.com/highstock/annotations.shapes.points.x</a>
   * @see <a href="https://api.highcharts.com/highmaps/annotations.shapes.points.x">https://api.highcharts.com/highmaps/annotations.shapes.points.x</a>
   *
   * @implspec x?: number;
   *
   */
  @JSProperty("x")
  double getX();

  /**
   * (Highcharts, Highstock, Highmaps) The x position of the point. Units can
   * be either in axis or chart pixel coordinates.
   *
   * @see <a href="https://api.highcharts.com/highcharts/annotations.shapes.points.x">https://api.highcharts.com/highcharts/annotations.shapes.points.x</a>
   * @see <a href="https://api.highcharts.com/highstock/annotations.shapes.points.x">https://api.highcharts.com/highstock/annotations.shapes.points.x</a>
   * @see <a href="https://api.highcharts.com/highmaps/annotations.shapes.points.x">https://api.highcharts.com/highmaps/annotations.shapes.points.x</a>
   *
   * @implspec x?: number;
   *
   */
  @JSProperty("x")
  void setX(double value);

  /**
   * (Highcharts, Highstock, Highmaps) This number defines which xAxis the
   * point is connected to. It refers to either the axis id or the index of
   * the axis in the xAxis array. If the option is not configured or the axis
   * is not found the point's x coordinate refers to the chart pixels.
   *
   * @see <a href="https://api.highcharts.com/highcharts/annotations.shapes.points.xAxis">https://api.highcharts.com/highcharts/annotations.shapes.points.xAxis</a>
   * @see <a href="https://api.highcharts.com/highstock/annotations.shapes.points.xAxis">https://api.highcharts.com/highstock/annotations.shapes.points.xAxis</a>
   * @see <a href="https://api.highcharts.com/highmaps/annotations.shapes.points.xAxis">https://api.highcharts.com/highmaps/annotations.shapes.points.xAxis</a>
   *
   * @implspec xAxis?: (number|string);
   *
   */
  @JSProperty("xAxis")
  @Nullable
  Unknown getXAxis();

  /**
   * (Highcharts, Highstock, Highmaps) This number defines which xAxis the
   * point is connected to. It refers to either the axis id or the index of
   * the axis in the xAxis array. If the option is not configured or the axis
   * is not found the point's x coordinate refers to the chart pixels.
   *
   * @see <a href="https://api.highcharts.com/highcharts/annotations.shapes.points.xAxis">https://api.highcharts.com/highcharts/annotations.shapes.points.xAxis</a>
   * @see <a href="https://api.highcharts.com/highstock/annotations.shapes.points.xAxis">https://api.highcharts.com/highstock/annotations.shapes.points.xAxis</a>
   * @see <a href="https://api.highcharts.com/highmaps/annotations.shapes.points.xAxis">https://api.highcharts.com/highmaps/annotations.shapes.points.xAxis</a>
   *
   * @implspec xAxis?: (number|string);
   *
   */
  @JSProperty("xAxis")
  void setXAxis(double value);

  /**
   * (Highcharts, Highstock, Highmaps) This number defines which xAxis the
   * point is connected to. It refers to either the axis id or the index of
   * the axis in the xAxis array. If the option is not configured or the axis
   * is not found the point's x coordinate refers to the chart pixels.
   *
   * @see <a href="https://api.highcharts.com/highcharts/annotations.shapes.points.xAxis">https://api.highcharts.com/highcharts/annotations.shapes.points.xAxis</a>
   * @see <a href="https://api.highcharts.com/highstock/annotations.shapes.points.xAxis">https://api.highcharts.com/highstock/annotations.shapes.points.xAxis</a>
   * @see <a href="https://api.highcharts.com/highmaps/annotations.shapes.points.xAxis">https://api.highcharts.com/highmaps/annotations.shapes.points.xAxis</a>
   *
   * @implspec xAxis?: (number|string);
   *
   */
  @JSProperty("xAxis")
  void setXAxis(String value);

  /**
   * (Highcharts, Highstock, Highmaps) The y position of the point. Units can
   * be either in axis or chart pixel coordinates.
   *
   * @see <a href="https://api.highcharts.com/highcharts/annotations.shapes.points.y">https://api.highcharts.com/highcharts/annotations.shapes.points.y</a>
   * @see <a href="https://api.highcharts.com/highstock/annotations.shapes.points.y">https://api.highcharts.com/highstock/annotations.shapes.points.y</a>
   * @see <a href="https://api.highcharts.com/highmaps/annotations.shapes.points.y">https://api.highcharts.com/highmaps/annotations.shapes.points.y</a>
   *
   * @implspec y?: number;
   *
   */
  @JSProperty("y")
  double getY();

  /**
   * (Highcharts, Highstock, Highmaps) The y position of the point. Units can
   * be either in axis or chart pixel coordinates.
   *
   * @see <a href="https://api.highcharts.com/highcharts/annotations.shapes.points.y">https://api.highcharts.com/highcharts/annotations.shapes.points.y</a>
   * @see <a href="https://api.highcharts.com/highstock/annotations.shapes.points.y">https://api.highcharts.com/highstock/annotations.shapes.points.y</a>
   * @see <a href="https://api.highcharts.com/highmaps/annotations.shapes.points.y">https://api.highcharts.com/highmaps/annotations.shapes.points.y</a>
   *
   * @implspec y?: number;
   *
   */
  @JSProperty("y")
  void setY(double value);

  /**
   * (Highcharts, Highstock, Highmaps) This number defines which yAxis the
   * point is connected to. It refers to either the axis id or the index of
   * the axis in the yAxis array. If the option is not configured or the axis
   * is not found the point's y coordinate refers to the chart pixels.
   *
   * @see <a href="https://api.highcharts.com/highcharts/annotations.shapes.points.yAxis">https://api.highcharts.com/highcharts/annotations.shapes.points.yAxis</a>
   * @see <a href="https://api.highcharts.com/highstock/annotations.shapes.points.yAxis">https://api.highcharts.com/highstock/annotations.shapes.points.yAxis</a>
   * @see <a href="https://api.highcharts.com/highmaps/annotations.shapes.points.yAxis">https://api.highcharts.com/highmaps/annotations.shapes.points.yAxis</a>
   *
   * @implspec yAxis?: (number|string);
   *
   */
  @JSProperty("yAxis")
  @Nullable
  Unknown getYAxis();

  /**
   * (Highcharts, Highstock, Highmaps) This number defines which yAxis the
   * point is connected to. It refers to either the axis id or the index of
   * the axis in the yAxis array. If the option is not configured or the axis
   * is not found the point's y coordinate refers to the chart pixels.
   *
   * @see <a href="https://api.highcharts.com/highcharts/annotations.shapes.points.yAxis">https://api.highcharts.com/highcharts/annotations.shapes.points.yAxis</a>
   * @see <a href="https://api.highcharts.com/highstock/annotations.shapes.points.yAxis">https://api.highcharts.com/highstock/annotations.shapes.points.yAxis</a>
   * @see <a href="https://api.highcharts.com/highmaps/annotations.shapes.points.yAxis">https://api.highcharts.com/highmaps/annotations.shapes.points.yAxis</a>
   *
   * @implspec yAxis?: (number|string);
   *
   */
  @JSProperty("yAxis")
  void setYAxis(double value);

  /**
   * (Highcharts, Highstock, Highmaps) This number defines which yAxis the
   * point is connected to. It refers to either the axis id or the index of
   * the axis in the yAxis array. If the option is not configured or the axis
   * is not found the point's y coordinate refers to the chart pixels.
   *
   * @see <a href="https://api.highcharts.com/highcharts/annotations.shapes.points.yAxis">https://api.highcharts.com/highcharts/annotations.shapes.points.yAxis</a>
   * @see <a href="https://api.highcharts.com/highstock/annotations.shapes.points.yAxis">https://api.highcharts.com/highstock/annotations.shapes.points.yAxis</a>
   * @see <a href="https://api.highcharts.com/highmaps/annotations.shapes.points.yAxis">https://api.highcharts.com/highmaps/annotations.shapes.points.yAxis</a>
   *
   * @implspec yAxis?: (number|string);
   *
   */
  @JSProperty("yAxis")
  void setYAxis(String value);
}
