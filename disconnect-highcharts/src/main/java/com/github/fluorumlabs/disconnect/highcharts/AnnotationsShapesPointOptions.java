package com.github.fluorumlabs.disconnect.highcharts;

import java.lang.String;
import javax.annotation.Nullable;
import js.lang.Any;
import js.lang.Unknown;
import org.teavm.jso.JSProperty;

/**
 * (Highcharts, Highstock, Highmaps) This option defines the point to which the
 * shape will be connected. It can be either the point which exists in the
 * series - it is referenced by the point's id - or a new point with defined x,
 * y properties and optionally axes.
 *
 * @see <a href="https://api.highcharts.com/highcharts/annotations.shapes.point">https://api.highcharts.com/highcharts/annotations.shapes.point</a>
 * @see <a href="https://api.highcharts.com/highstock/annotations.shapes.point">https://api.highcharts.com/highstock/annotations.shapes.point</a>
 * @see <a href="https://api.highcharts.com/highmaps/annotations.shapes.point">https://api.highcharts.com/highmaps/annotations.shapes.point</a>
 *
 */
public interface AnnotationsShapesPointOptions extends Any {
  /**
   * (Highcharts, Highstock, Highmaps) The x position of the point. Units can
   * be either in axis or chart pixel coordinates.
   *
   * @see <a href="https://api.highcharts.com/highcharts/annotations.shapes.point.x">https://api.highcharts.com/highcharts/annotations.shapes.point.x</a>
   * @see <a href="https://api.highcharts.com/highstock/annotations.shapes.point.x">https://api.highcharts.com/highstock/annotations.shapes.point.x</a>
   * @see <a href="https://api.highcharts.com/highmaps/annotations.shapes.point.x">https://api.highcharts.com/highmaps/annotations.shapes.point.x</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/annotations.shapes.point.x">https://api.highcharts.com/highcharts/annotations.shapes.point.x</a>
   * @see <a href="https://api.highcharts.com/highstock/annotations.shapes.point.x">https://api.highcharts.com/highstock/annotations.shapes.point.x</a>
   * @see <a href="https://api.highcharts.com/highmaps/annotations.shapes.point.x">https://api.highcharts.com/highmaps/annotations.shapes.point.x</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/annotations.shapes.point.xAxis">https://api.highcharts.com/highcharts/annotations.shapes.point.xAxis</a>
   * @see <a href="https://api.highcharts.com/highstock/annotations.shapes.point.xAxis">https://api.highcharts.com/highstock/annotations.shapes.point.xAxis</a>
   * @see <a href="https://api.highcharts.com/highmaps/annotations.shapes.point.xAxis">https://api.highcharts.com/highmaps/annotations.shapes.point.xAxis</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/annotations.shapes.point.xAxis">https://api.highcharts.com/highcharts/annotations.shapes.point.xAxis</a>
   * @see <a href="https://api.highcharts.com/highstock/annotations.shapes.point.xAxis">https://api.highcharts.com/highstock/annotations.shapes.point.xAxis</a>
   * @see <a href="https://api.highcharts.com/highmaps/annotations.shapes.point.xAxis">https://api.highcharts.com/highmaps/annotations.shapes.point.xAxis</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/annotations.shapes.point.xAxis">https://api.highcharts.com/highcharts/annotations.shapes.point.xAxis</a>
   * @see <a href="https://api.highcharts.com/highstock/annotations.shapes.point.xAxis">https://api.highcharts.com/highstock/annotations.shapes.point.xAxis</a>
   * @see <a href="https://api.highcharts.com/highmaps/annotations.shapes.point.xAxis">https://api.highcharts.com/highmaps/annotations.shapes.point.xAxis</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/annotations.shapes.point.y">https://api.highcharts.com/highcharts/annotations.shapes.point.y</a>
   * @see <a href="https://api.highcharts.com/highstock/annotations.shapes.point.y">https://api.highcharts.com/highstock/annotations.shapes.point.y</a>
   * @see <a href="https://api.highcharts.com/highmaps/annotations.shapes.point.y">https://api.highcharts.com/highmaps/annotations.shapes.point.y</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/annotations.shapes.point.y">https://api.highcharts.com/highcharts/annotations.shapes.point.y</a>
   * @see <a href="https://api.highcharts.com/highstock/annotations.shapes.point.y">https://api.highcharts.com/highstock/annotations.shapes.point.y</a>
   * @see <a href="https://api.highcharts.com/highmaps/annotations.shapes.point.y">https://api.highcharts.com/highmaps/annotations.shapes.point.y</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/annotations.shapes.point.yAxis">https://api.highcharts.com/highcharts/annotations.shapes.point.yAxis</a>
   * @see <a href="https://api.highcharts.com/highstock/annotations.shapes.point.yAxis">https://api.highcharts.com/highstock/annotations.shapes.point.yAxis</a>
   * @see <a href="https://api.highcharts.com/highmaps/annotations.shapes.point.yAxis">https://api.highcharts.com/highmaps/annotations.shapes.point.yAxis</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/annotations.shapes.point.yAxis">https://api.highcharts.com/highcharts/annotations.shapes.point.yAxis</a>
   * @see <a href="https://api.highcharts.com/highstock/annotations.shapes.point.yAxis">https://api.highcharts.com/highstock/annotations.shapes.point.yAxis</a>
   * @see <a href="https://api.highcharts.com/highmaps/annotations.shapes.point.yAxis">https://api.highcharts.com/highmaps/annotations.shapes.point.yAxis</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/annotations.shapes.point.yAxis">https://api.highcharts.com/highcharts/annotations.shapes.point.yAxis</a>
   * @see <a href="https://api.highcharts.com/highstock/annotations.shapes.point.yAxis">https://api.highcharts.com/highstock/annotations.shapes.point.yAxis</a>
   * @see <a href="https://api.highcharts.com/highmaps/annotations.shapes.point.yAxis">https://api.highcharts.com/highmaps/annotations.shapes.point.yAxis</a>
   *
   * @implspec yAxis?: (number|string);
   *
   */
  @JSProperty("yAxis")
  void setYAxis(String value);
}
