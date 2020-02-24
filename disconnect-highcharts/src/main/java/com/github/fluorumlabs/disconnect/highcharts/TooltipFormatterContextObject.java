package com.github.fluorumlabs.disconnect.highcharts;

import java.lang.String;
import js.lang.Any;
import org.teavm.jso.JSProperty;

public interface TooltipFormatterContextObject extends Any {
  /**
   * @implspec color: ColorString;
   *
   */
  @JSProperty("color")
  String getColor();

  /**
   * @implspec color: ColorString;
   *
   */
  @JSProperty("color")
  void setColor(String value);

  /**
   * @implspec colorIndex?: number;
   *
   */
  @JSProperty("colorIndex")
  double getColorIndex();

  /**
   * @implspec colorIndex?: number;
   *
   */
  @JSProperty("colorIndex")
  void setColorIndex(double value);

  /**
   * @implspec key: number;
   *
   */
  @JSProperty("key")
  double getKey();

  /**
   * @implspec key: number;
   *
   */
  @JSProperty("key")
  void setKey(double value);

  /**
   * @implspec percentage?: number;
   *
   */
  @JSProperty("percentage")
  double getPercentage();

  /**
   * @implspec percentage?: number;
   *
   */
  @JSProperty("percentage")
  void setPercentage(double value);

  /**
   * @implspec point: Point;
   *
   */
  @JSProperty("point")
  Point getPoint();

  /**
   * @implspec point: Point;
   *
   */
  @JSProperty("point")
  void setPoint(Point value);

  /**
   * @implspec series: Series;
   *
   */
  @JSProperty("series")
  Series getSeries();

  /**
   * @implspec series: Series;
   *
   */
  @JSProperty("series")
  void setSeries(Series value);

  /**
   * @implspec total?: number;
   *
   */
  @JSProperty("total")
  double getTotal();

  /**
   * @implspec total?: number;
   *
   */
  @JSProperty("total")
  void setTotal(double value);

  /**
   * @implspec x: number;
   *
   */
  @JSProperty("x")
  double getX();

  /**
   * @implspec x: number;
   *
   */
  @JSProperty("x")
  void setX(double value);

  /**
   * @implspec y: number;
   *
   */
  @JSProperty("y")
  double getY();

  /**
   * @implspec y: number;
   *
   */
  @JSProperty("y")
  void setY(double value);
}
