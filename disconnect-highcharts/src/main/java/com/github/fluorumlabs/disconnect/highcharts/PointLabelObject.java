package com.github.fluorumlabs.disconnect.highcharts;

import java.lang.String;
import js.lang.Any;
import js.lang.Unknown;
import org.teavm.jso.JSProperty;

/**
 * Configuration hash for the data label and tooltip formatters.
 *
 */
public interface PointLabelObject extends Any {
  /**
   * The point's current color.
   *
   * @implspec color: ColorString;
   *
   */
  @JSProperty("color")
  String getColor();

  /**
   * The point's current color.
   *
   * @implspec color: ColorString;
   *
   */
  @JSProperty("color")
  void setColor(String value);

  /**
   * The point's current color index, used in styled mode instead of <code>color</code>.
   * The color index is inserted in class names used for styling.
   *
   * @implspec colorIndex: number;
   *
   */
  @JSProperty("colorIndex")
  double getColorIndex();

  /**
   * The point's current color index, used in styled mode instead of <code>color</code>.
   * The color index is inserted in class names used for styling.
   *
   * @implspec colorIndex: number;
   *
   */
  @JSProperty("colorIndex")
  void setColorIndex(double value);

  /**
   * The name of the related point.
   *
   * @implspec key: (number|string);
   *
   */
  @JSProperty("key")
  Unknown getKey();

  /**
   * The name of the related point.
   *
   * @implspec key: (number|string);
   *
   */
  @JSProperty("key")
  void setKey(double value);

  /**
   * The name of the related point.
   *
   * @implspec key: (number|string);
   *
   */
  @JSProperty("key")
  void setKey(String value);

  /**
   * The percentage for related points in a stacked series or pies.
   *
   * @implspec percentage: number;
   *
   */
  @JSProperty("percentage")
  double getPercentage();

  /**
   * The percentage for related points in a stacked series or pies.
   *
   * @implspec percentage: number;
   *
   */
  @JSProperty("percentage")
  void setPercentage(double value);

  /**
   * The related point.
   *
   * @implspec point: Point;
   *
   */
  @JSProperty("point")
  Point getPoint();

  /**
   * The related point.
   *
   * @implspec point: Point;
   *
   */
  @JSProperty("point")
  void setPoint(Point value);

  /**
   * The related series.
   *
   * @implspec series: Series;
   *
   */
  @JSProperty("series")
  Series getSeries();

  /**
   * The related series.
   *
   * @implspec series: Series;
   *
   */
  @JSProperty("series")
  void setSeries(Series value);

  /**
   * The total of values in either a stack for stacked series, or a pie in a
   * pie series.
   *
   * @implspec total: number;
   *
   */
  @JSProperty("total")
  double getTotal();

  /**
   * The total of values in either a stack for stacked series, or a pie in a
   * pie series.
   *
   * @implspec total: number;
   *
   */
  @JSProperty("total")
  void setTotal(double value);

  /**
   * For categorized axes this property holds the category name for the point.
   * For other axes it holds the X value.
   *
   * @implspec x: (number|string);
   *
   */
  @JSProperty("x")
  Unknown getX();

  /**
   * For categorized axes this property holds the category name for the point.
   * For other axes it holds the X value.
   *
   * @implspec x: (number|string);
   *
   */
  @JSProperty("x")
  void setX(double value);

  /**
   * For categorized axes this property holds the category name for the point.
   * For other axes it holds the X value.
   *
   * @implspec x: (number|string);
   *
   */
  @JSProperty("x")
  void setX(String value);

  /**
   * The y value of the point.
   *
   * @implspec y?: number;
   *
   */
  @JSProperty("y")
  double getY();

  /**
   * The y value of the point.
   *
   * @implspec y?: number;
   *
   */
  @JSProperty("y")
  void setY(double value);
}
