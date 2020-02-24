package com.github.fluorumlabs.disconnect.highcharts;

import java.lang.String;
import javax.annotation.Nullable;
import js.lang.Any;
import js.lang.Unknown;
import org.teavm.jso.JSProperty;

/**
 * (Highcharts, Highstock, Highmaps) Options for annotation's shapes. Each shape
 * inherits options from the shapeOptions object. An option from the
 * shapeOptions can be overwritten by config for a specific shape.
 *
 * @see <a href="https://api.highcharts.com/highcharts/annotations.shapeOptions">https://api.highcharts.com/highcharts/annotations.shapeOptions</a>
 * @see <a href="https://api.highcharts.com/highstock/annotations.shapeOptions">https://api.highcharts.com/highstock/annotations.shapeOptions</a>
 * @see <a href="https://api.highcharts.com/highmaps/annotations.shapeOptions">https://api.highcharts.com/highmaps/annotations.shapeOptions</a>
 *
 */
public interface AnnotationsShapeOptions extends Any {
  /**
   * (Highcharts, Highstock, Highmaps) The color of the shape's fill.
   *
   * @see <a href="https://api.highcharts.com/highcharts/annotations.shapeOptions.fill">https://api.highcharts.com/highcharts/annotations.shapeOptions.fill</a>
   * @see <a href="https://api.highcharts.com/highstock/annotations.shapeOptions.fill">https://api.highcharts.com/highstock/annotations.shapeOptions.fill</a>
   * @see <a href="https://api.highcharts.com/highmaps/annotations.shapeOptions.fill">https://api.highcharts.com/highmaps/annotations.shapeOptions.fill</a>
   *
   * @implspec fill?: (ColorString|GradientColorObject);
   *
   */
  @JSProperty("fill")
  @Nullable
  Unknown getFill();

  /**
   * (Highcharts, Highstock, Highmaps) The color of the shape's fill.
   *
   * @see <a href="https://api.highcharts.com/highcharts/annotations.shapeOptions.fill">https://api.highcharts.com/highcharts/annotations.shapeOptions.fill</a>
   * @see <a href="https://api.highcharts.com/highstock/annotations.shapeOptions.fill">https://api.highcharts.com/highstock/annotations.shapeOptions.fill</a>
   * @see <a href="https://api.highcharts.com/highmaps/annotations.shapeOptions.fill">https://api.highcharts.com/highmaps/annotations.shapeOptions.fill</a>
   *
   * @implspec fill?: (ColorString|GradientColorObject);
   *
   */
  @JSProperty("fill")
  void setFill(GradientColorObject value);

  /**
   * (Highcharts, Highstock, Highmaps) The color of the shape's fill.
   *
   * @see <a href="https://api.highcharts.com/highcharts/annotations.shapeOptions.fill">https://api.highcharts.com/highcharts/annotations.shapeOptions.fill</a>
   * @see <a href="https://api.highcharts.com/highstock/annotations.shapeOptions.fill">https://api.highcharts.com/highstock/annotations.shapeOptions.fill</a>
   * @see <a href="https://api.highcharts.com/highmaps/annotations.shapeOptions.fill">https://api.highcharts.com/highmaps/annotations.shapeOptions.fill</a>
   *
   * @implspec fill?: (ColorString|GradientColorObject);
   *
   */
  @JSProperty("fill")
  void setFill(String value);

  /**
   * (Highcharts, Highstock, Highmaps) The height of the shape.
   *
   * @see <a href="https://api.highcharts.com/highcharts/annotations.shapeOptions.height">https://api.highcharts.com/highcharts/annotations.shapeOptions.height</a>
   * @see <a href="https://api.highcharts.com/highstock/annotations.shapeOptions.height">https://api.highcharts.com/highstock/annotations.shapeOptions.height</a>
   * @see <a href="https://api.highcharts.com/highmaps/annotations.shapeOptions.height">https://api.highcharts.com/highmaps/annotations.shapeOptions.height</a>
   *
   * @implspec height?: number;
   *
   */
  @JSProperty("height")
  double getHeight();

  /**
   * (Highcharts, Highstock, Highmaps) The height of the shape.
   *
   * @see <a href="https://api.highcharts.com/highcharts/annotations.shapeOptions.height">https://api.highcharts.com/highcharts/annotations.shapeOptions.height</a>
   * @see <a href="https://api.highcharts.com/highstock/annotations.shapeOptions.height">https://api.highcharts.com/highstock/annotations.shapeOptions.height</a>
   * @see <a href="https://api.highcharts.com/highmaps/annotations.shapeOptions.height">https://api.highcharts.com/highmaps/annotations.shapeOptions.height</a>
   *
   * @implspec height?: number;
   *
   */
  @JSProperty("height")
  void setHeight(double value);

  /**
   * (Highcharts, Highstock, Highmaps) The radius of the shape.
   *
   * @see <a href="https://api.highcharts.com/highcharts/annotations.shapeOptions.r">https://api.highcharts.com/highcharts/annotations.shapeOptions.r</a>
   * @see <a href="https://api.highcharts.com/highstock/annotations.shapeOptions.r">https://api.highcharts.com/highstock/annotations.shapeOptions.r</a>
   * @see <a href="https://api.highcharts.com/highmaps/annotations.shapeOptions.r">https://api.highcharts.com/highmaps/annotations.shapeOptions.r</a>
   *
   * @implspec r?: number;
   *
   */
  @JSProperty("r")
  double getR();

  /**
   * (Highcharts, Highstock, Highmaps) The radius of the shape.
   *
   * @see <a href="https://api.highcharts.com/highcharts/annotations.shapeOptions.r">https://api.highcharts.com/highcharts/annotations.shapeOptions.r</a>
   * @see <a href="https://api.highcharts.com/highstock/annotations.shapeOptions.r">https://api.highcharts.com/highstock/annotations.shapeOptions.r</a>
   * @see <a href="https://api.highcharts.com/highmaps/annotations.shapeOptions.r">https://api.highcharts.com/highmaps/annotations.shapeOptions.r</a>
   *
   * @implspec r?: number;
   *
   */
  @JSProperty("r")
  void setR(double value);

  /**
   * (Highcharts, Highstock, Highmaps) The color of the shape's stroke.
   *
   * @see <a href="https://api.highcharts.com/highcharts/annotations.shapeOptions.stroke">https://api.highcharts.com/highcharts/annotations.shapeOptions.stroke</a>
   * @see <a href="https://api.highcharts.com/highstock/annotations.shapeOptions.stroke">https://api.highcharts.com/highstock/annotations.shapeOptions.stroke</a>
   * @see <a href="https://api.highcharts.com/highmaps/annotations.shapeOptions.stroke">https://api.highcharts.com/highmaps/annotations.shapeOptions.stroke</a>
   *
   * @implspec stroke?: ColorString;
   *
   */
  @JSProperty("stroke")
  @Nullable
  String getStroke();

  /**
   * (Highcharts, Highstock, Highmaps) The color of the shape's stroke.
   *
   * @see <a href="https://api.highcharts.com/highcharts/annotations.shapeOptions.stroke">https://api.highcharts.com/highcharts/annotations.shapeOptions.stroke</a>
   * @see <a href="https://api.highcharts.com/highstock/annotations.shapeOptions.stroke">https://api.highcharts.com/highstock/annotations.shapeOptions.stroke</a>
   * @see <a href="https://api.highcharts.com/highmaps/annotations.shapeOptions.stroke">https://api.highcharts.com/highmaps/annotations.shapeOptions.stroke</a>
   *
   * @implspec stroke?: ColorString;
   *
   */
  @JSProperty("stroke")
  void setStroke(String value);

  /**
   * (Highcharts, Highstock, Highmaps) The pixel stroke width of the shape.
   *
   * @see <a href="https://api.highcharts.com/highcharts/annotations.shapeOptions.strokeWidth">https://api.highcharts.com/highcharts/annotations.shapeOptions.strokeWidth</a>
   * @see <a href="https://api.highcharts.com/highstock/annotations.shapeOptions.strokeWidth">https://api.highcharts.com/highstock/annotations.shapeOptions.strokeWidth</a>
   * @see <a href="https://api.highcharts.com/highmaps/annotations.shapeOptions.strokeWidth">https://api.highcharts.com/highmaps/annotations.shapeOptions.strokeWidth</a>
   *
   * @implspec strokeWidth?: number;
   *
   */
  @JSProperty("strokeWidth")
  double getStrokeWidth();

  /**
   * (Highcharts, Highstock, Highmaps) The pixel stroke width of the shape.
   *
   * @see <a href="https://api.highcharts.com/highcharts/annotations.shapeOptions.strokeWidth">https://api.highcharts.com/highcharts/annotations.shapeOptions.strokeWidth</a>
   * @see <a href="https://api.highcharts.com/highstock/annotations.shapeOptions.strokeWidth">https://api.highcharts.com/highstock/annotations.shapeOptions.strokeWidth</a>
   * @see <a href="https://api.highcharts.com/highmaps/annotations.shapeOptions.strokeWidth">https://api.highcharts.com/highmaps/annotations.shapeOptions.strokeWidth</a>
   *
   * @implspec strokeWidth?: number;
   *
   */
  @JSProperty("strokeWidth")
  void setStrokeWidth(double value);

  /**
   * (Highcharts, Highstock, Highmaps) The type of the shape, e.g. circle or
   * rectangle.
   *
   * @see <a href="https://api.highcharts.com/highcharts/annotations.shapeOptions.type">https://api.highcharts.com/highcharts/annotations.shapeOptions.type</a>
   * @see <a href="https://api.highcharts.com/highstock/annotations.shapeOptions.type">https://api.highcharts.com/highstock/annotations.shapeOptions.type</a>
   * @see <a href="https://api.highcharts.com/highmaps/annotations.shapeOptions.type">https://api.highcharts.com/highmaps/annotations.shapeOptions.type</a>
   *
   * @implspec type?: string;
   *
   */
  @JSProperty("type")
  @Nullable
  String getType();

  /**
   * (Highcharts, Highstock, Highmaps) The type of the shape, e.g. circle or
   * rectangle.
   *
   * @see <a href="https://api.highcharts.com/highcharts/annotations.shapeOptions.type">https://api.highcharts.com/highcharts/annotations.shapeOptions.type</a>
   * @see <a href="https://api.highcharts.com/highstock/annotations.shapeOptions.type">https://api.highcharts.com/highstock/annotations.shapeOptions.type</a>
   * @see <a href="https://api.highcharts.com/highmaps/annotations.shapeOptions.type">https://api.highcharts.com/highmaps/annotations.shapeOptions.type</a>
   *
   * @implspec type?: string;
   *
   */
  @JSProperty("type")
  void setType(String value);

  /**
   * (Highcharts, Highstock, Highmaps) The width of the shape.
   *
   * @see <a href="https://api.highcharts.com/highcharts/annotations.shapeOptions.width">https://api.highcharts.com/highcharts/annotations.shapeOptions.width</a>
   * @see <a href="https://api.highcharts.com/highstock/annotations.shapeOptions.width">https://api.highcharts.com/highstock/annotations.shapeOptions.width</a>
   * @see <a href="https://api.highcharts.com/highmaps/annotations.shapeOptions.width">https://api.highcharts.com/highmaps/annotations.shapeOptions.width</a>
   *
   * @implspec width?: number;
   *
   */
  @JSProperty("width")
  double getWidth();

  /**
   * (Highcharts, Highstock, Highmaps) The width of the shape.
   *
   * @see <a href="https://api.highcharts.com/highcharts/annotations.shapeOptions.width">https://api.highcharts.com/highcharts/annotations.shapeOptions.width</a>
   * @see <a href="https://api.highcharts.com/highstock/annotations.shapeOptions.width">https://api.highcharts.com/highstock/annotations.shapeOptions.width</a>
   * @see <a href="https://api.highcharts.com/highmaps/annotations.shapeOptions.width">https://api.highcharts.com/highmaps/annotations.shapeOptions.width</a>
   *
   * @implspec width?: number;
   *
   */
  @JSProperty("width")
  void setWidth(double value);
}
