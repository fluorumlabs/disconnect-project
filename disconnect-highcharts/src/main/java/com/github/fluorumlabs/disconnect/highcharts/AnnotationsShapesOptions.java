package com.github.fluorumlabs.disconnect.highcharts;

import java.lang.String;
import javax.annotation.Nullable;
import js.lang.Any;
import js.lang.Unknown;
import js.util.collections.Array;
import org.teavm.jso.JSProperty;

/**
 * (Highcharts, Highstock, Highmaps) An array of shapes for the annotation. For
 * options that apply to multiple shapes, then can be added to the shapeOptions.
 *
 * @see <a href="https://api.highcharts.com/highcharts/annotations.shapes">https://api.highcharts.com/highcharts/annotations.shapes</a>
 * @see <a href="https://api.highcharts.com/highstock/annotations.shapes">https://api.highcharts.com/highstock/annotations.shapes</a>
 * @see <a href="https://api.highcharts.com/highmaps/annotations.shapes">https://api.highcharts.com/highmaps/annotations.shapes</a>
 *
 */
public interface AnnotationsShapesOptions extends Any {
  /**
   * (Highcharts, Highstock, Highmaps) The color of the shape's fill.
   *
   * @see <a href="https://api.highcharts.com/highcharts/annotations.shapes.fill">https://api.highcharts.com/highcharts/annotations.shapes.fill</a>
   * @see <a href="https://api.highcharts.com/highstock/annotations.shapes.fill">https://api.highcharts.com/highstock/annotations.shapes.fill</a>
   * @see <a href="https://api.highcharts.com/highmaps/annotations.shapes.fill">https://api.highcharts.com/highmaps/annotations.shapes.fill</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/annotations.shapes.fill">https://api.highcharts.com/highcharts/annotations.shapes.fill</a>
   * @see <a href="https://api.highcharts.com/highstock/annotations.shapes.fill">https://api.highcharts.com/highstock/annotations.shapes.fill</a>
   * @see <a href="https://api.highcharts.com/highmaps/annotations.shapes.fill">https://api.highcharts.com/highmaps/annotations.shapes.fill</a>
   *
   * @implspec fill?: (ColorString|GradientColorObject);
   *
   */
  @JSProperty("fill")
  void setFill(GradientColorObject value);

  /**
   * (Highcharts, Highstock, Highmaps) The color of the shape's fill.
   *
   * @see <a href="https://api.highcharts.com/highcharts/annotations.shapes.fill">https://api.highcharts.com/highcharts/annotations.shapes.fill</a>
   * @see <a href="https://api.highcharts.com/highstock/annotations.shapes.fill">https://api.highcharts.com/highstock/annotations.shapes.fill</a>
   * @see <a href="https://api.highcharts.com/highmaps/annotations.shapes.fill">https://api.highcharts.com/highmaps/annotations.shapes.fill</a>
   *
   * @implspec fill?: (ColorString|GradientColorObject);
   *
   */
  @JSProperty("fill")
  void setFill(String value);

  /**
   * (Highcharts, Highstock, Highmaps) The height of the shape.
   *
   * @see <a href="https://api.highcharts.com/highcharts/annotations.shapes.height">https://api.highcharts.com/highcharts/annotations.shapes.height</a>
   * @see <a href="https://api.highcharts.com/highstock/annotations.shapes.height">https://api.highcharts.com/highstock/annotations.shapes.height</a>
   * @see <a href="https://api.highcharts.com/highmaps/annotations.shapes.height">https://api.highcharts.com/highmaps/annotations.shapes.height</a>
   *
   * @implspec height?: number;
   *
   */
  @JSProperty("height")
  double getHeight();

  /**
   * (Highcharts, Highstock, Highmaps) The height of the shape.
   *
   * @see <a href="https://api.highcharts.com/highcharts/annotations.shapes.height">https://api.highcharts.com/highcharts/annotations.shapes.height</a>
   * @see <a href="https://api.highcharts.com/highstock/annotations.shapes.height">https://api.highcharts.com/highstock/annotations.shapes.height</a>
   * @see <a href="https://api.highcharts.com/highmaps/annotations.shapes.height">https://api.highcharts.com/highmaps/annotations.shapes.height</a>
   *
   * @implspec height?: number;
   *
   */
  @JSProperty("height")
  void setHeight(double value);

  /**
   * (Highcharts, Highstock, Highmaps) Id of the marker which will be drawn at
   * the final vertex of the path. Custom markers can be defined in defs
   * property.
   *
   * @see <a href="https://api.highcharts.com/highcharts/annotations.shapes.markerEnd">https://api.highcharts.com/highcharts/annotations.shapes.markerEnd</a>
   * @see <a href="https://api.highcharts.com/highstock/annotations.shapes.markerEnd">https://api.highcharts.com/highstock/annotations.shapes.markerEnd</a>
   * @see <a href="https://api.highcharts.com/highmaps/annotations.shapes.markerEnd">https://api.highcharts.com/highmaps/annotations.shapes.markerEnd</a>
   *
   * @implspec markerEnd?: string;
   *
   */
  @JSProperty("markerEnd")
  @Nullable
  String getMarkerEnd();

  /**
   * (Highcharts, Highstock, Highmaps) Id of the marker which will be drawn at
   * the final vertex of the path. Custom markers can be defined in defs
   * property.
   *
   * @see <a href="https://api.highcharts.com/highcharts/annotations.shapes.markerEnd">https://api.highcharts.com/highcharts/annotations.shapes.markerEnd</a>
   * @see <a href="https://api.highcharts.com/highstock/annotations.shapes.markerEnd">https://api.highcharts.com/highstock/annotations.shapes.markerEnd</a>
   * @see <a href="https://api.highcharts.com/highmaps/annotations.shapes.markerEnd">https://api.highcharts.com/highmaps/annotations.shapes.markerEnd</a>
   *
   * @implspec markerEnd?: string;
   *
   */
  @JSProperty("markerEnd")
  void setMarkerEnd(String value);

  /**
   * (Highcharts, Highstock, Highmaps) Id of the marker which will be drawn at
   * the first vertex of the path. Custom markers can be defined in defs
   * property.
   *
   * @see <a href="https://api.highcharts.com/highcharts/annotations.shapes.markerStart">https://api.highcharts.com/highcharts/annotations.shapes.markerStart</a>
   * @see <a href="https://api.highcharts.com/highstock/annotations.shapes.markerStart">https://api.highcharts.com/highstock/annotations.shapes.markerStart</a>
   * @see <a href="https://api.highcharts.com/highmaps/annotations.shapes.markerStart">https://api.highcharts.com/highmaps/annotations.shapes.markerStart</a>
   *
   * @implspec markerStart?: string;
   *
   */
  @JSProperty("markerStart")
  @Nullable
  String getMarkerStart();

  /**
   * (Highcharts, Highstock, Highmaps) Id of the marker which will be drawn at
   * the first vertex of the path. Custom markers can be defined in defs
   * property.
   *
   * @see <a href="https://api.highcharts.com/highcharts/annotations.shapes.markerStart">https://api.highcharts.com/highcharts/annotations.shapes.markerStart</a>
   * @see <a href="https://api.highcharts.com/highstock/annotations.shapes.markerStart">https://api.highcharts.com/highstock/annotations.shapes.markerStart</a>
   * @see <a href="https://api.highcharts.com/highmaps/annotations.shapes.markerStart">https://api.highcharts.com/highmaps/annotations.shapes.markerStart</a>
   *
   * @implspec markerStart?: string;
   *
   */
  @JSProperty("markerStart")
  void setMarkerStart(String value);

  /**
   * (Highcharts, Highstock, Highmaps) This option defines the point to which
   * the shape will be connected. It can be either the point which exists in
   * the series - it is referenced by the point's id - or a new point with
   * defined x, y properties and optionally axes.
   *
   * @see <a href="https://api.highcharts.com/highcharts/annotations.shapes.point">https://api.highcharts.com/highcharts/annotations.shapes.point</a>
   * @see <a href="https://api.highcharts.com/highstock/annotations.shapes.point">https://api.highcharts.com/highstock/annotations.shapes.point</a>
   * @see <a href="https://api.highcharts.com/highmaps/annotations.shapes.point">https://api.highcharts.com/highmaps/annotations.shapes.point</a>
   *
   * @implspec point?: (string|AnnotationsShapesPointOptions);
   *
   */
  @JSProperty("point")
  @Nullable
  Unknown getPoint();

  /**
   * (Highcharts, Highstock, Highmaps) This option defines the point to which
   * the shape will be connected. It can be either the point which exists in
   * the series - it is referenced by the point's id - or a new point with
   * defined x, y properties and optionally axes.
   *
   * @see <a href="https://api.highcharts.com/highcharts/annotations.shapes.point">https://api.highcharts.com/highcharts/annotations.shapes.point</a>
   * @see <a href="https://api.highcharts.com/highstock/annotations.shapes.point">https://api.highcharts.com/highstock/annotations.shapes.point</a>
   * @see <a href="https://api.highcharts.com/highmaps/annotations.shapes.point">https://api.highcharts.com/highmaps/annotations.shapes.point</a>
   *
   * @implspec point?: (string|AnnotationsShapesPointOptions);
   *
   */
  @JSProperty("point")
  void setPoint(String value);

  /**
   * (Highcharts, Highstock, Highmaps) This option defines the point to which
   * the shape will be connected. It can be either the point which exists in
   * the series - it is referenced by the point's id - or a new point with
   * defined x, y properties and optionally axes.
   *
   * @see <a href="https://api.highcharts.com/highcharts/annotations.shapes.point">https://api.highcharts.com/highcharts/annotations.shapes.point</a>
   * @see <a href="https://api.highcharts.com/highstock/annotations.shapes.point">https://api.highcharts.com/highstock/annotations.shapes.point</a>
   * @see <a href="https://api.highcharts.com/highmaps/annotations.shapes.point">https://api.highcharts.com/highmaps/annotations.shapes.point</a>
   *
   * @implspec point?: (string|AnnotationsShapesPointOptions);
   *
   */
  @JSProperty("point")
  void setPoint(AnnotationsShapesPointOptions value);

  /**
   * (Highcharts, Highstock, Highmaps) An array of points for the shape. This
   * option is available for shapes which can use multiple points such as
   * path. A point can be either a point object or a point's id.
   *
   * @see <a href="https://api.highcharts.com/highcharts/annotations.shapes.points">https://api.highcharts.com/highcharts/annotations.shapes.points</a>
   * @see <a href="https://api.highcharts.com/highstock/annotations.shapes.points">https://api.highcharts.com/highstock/annotations.shapes.points</a>
   * @see <a href="https://api.highcharts.com/highmaps/annotations.shapes.points">https://api.highcharts.com/highmaps/annotations.shapes.points</a>
   *
   * @implspec points?: Array<AnnotationsShapesPointsOptions>;
   *
   */
  @JSProperty("points")
  @Nullable
  Array<AnnotationsShapesPointsOptions> getPoints();

  /**
   * (Highcharts, Highstock, Highmaps) An array of points for the shape. This
   * option is available for shapes which can use multiple points such as
   * path. A point can be either a point object or a point's id.
   *
   * @see <a href="https://api.highcharts.com/highcharts/annotations.shapes.points">https://api.highcharts.com/highcharts/annotations.shapes.points</a>
   * @see <a href="https://api.highcharts.com/highstock/annotations.shapes.points">https://api.highcharts.com/highstock/annotations.shapes.points</a>
   * @see <a href="https://api.highcharts.com/highmaps/annotations.shapes.points">https://api.highcharts.com/highmaps/annotations.shapes.points</a>
   *
   * @implspec points?: Array<AnnotationsShapesPointsOptions>;
   *
   */
  @JSProperty("points")
  void setPoints(Array<AnnotationsShapesPointsOptions> value);

  /**
   * (Highcharts, Highstock, Highmaps) The radius of the shape.
   *
   * @see <a href="https://api.highcharts.com/highcharts/annotations.shapes.r">https://api.highcharts.com/highcharts/annotations.shapes.r</a>
   * @see <a href="https://api.highcharts.com/highstock/annotations.shapes.r">https://api.highcharts.com/highstock/annotations.shapes.r</a>
   * @see <a href="https://api.highcharts.com/highmaps/annotations.shapes.r">https://api.highcharts.com/highmaps/annotations.shapes.r</a>
   *
   * @implspec r?: number;
   *
   */
  @JSProperty("r")
  double getR();

  /**
   * (Highcharts, Highstock, Highmaps) The radius of the shape.
   *
   * @see <a href="https://api.highcharts.com/highcharts/annotations.shapes.r">https://api.highcharts.com/highcharts/annotations.shapes.r</a>
   * @see <a href="https://api.highcharts.com/highstock/annotations.shapes.r">https://api.highcharts.com/highstock/annotations.shapes.r</a>
   * @see <a href="https://api.highcharts.com/highmaps/annotations.shapes.r">https://api.highcharts.com/highmaps/annotations.shapes.r</a>
   *
   * @implspec r?: number;
   *
   */
  @JSProperty("r")
  void setR(double value);

  /**
   * (Highcharts, Highstock, Highmaps) The color of the shape's stroke.
   *
   * @see <a href="https://api.highcharts.com/highcharts/annotations.shapes.stroke">https://api.highcharts.com/highcharts/annotations.shapes.stroke</a>
   * @see <a href="https://api.highcharts.com/highstock/annotations.shapes.stroke">https://api.highcharts.com/highstock/annotations.shapes.stroke</a>
   * @see <a href="https://api.highcharts.com/highmaps/annotations.shapes.stroke">https://api.highcharts.com/highmaps/annotations.shapes.stroke</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/annotations.shapes.stroke">https://api.highcharts.com/highcharts/annotations.shapes.stroke</a>
   * @see <a href="https://api.highcharts.com/highstock/annotations.shapes.stroke">https://api.highcharts.com/highstock/annotations.shapes.stroke</a>
   * @see <a href="https://api.highcharts.com/highmaps/annotations.shapes.stroke">https://api.highcharts.com/highmaps/annotations.shapes.stroke</a>
   *
   * @implspec stroke?: ColorString;
   *
   */
  @JSProperty("stroke")
  void setStroke(String value);

  /**
   * (Highcharts, Highstock, Highmaps) The pixel stroke width of the shape.
   *
   * @see <a href="https://api.highcharts.com/highcharts/annotations.shapes.strokeWidth">https://api.highcharts.com/highcharts/annotations.shapes.strokeWidth</a>
   * @see <a href="https://api.highcharts.com/highstock/annotations.shapes.strokeWidth">https://api.highcharts.com/highstock/annotations.shapes.strokeWidth</a>
   * @see <a href="https://api.highcharts.com/highmaps/annotations.shapes.strokeWidth">https://api.highcharts.com/highmaps/annotations.shapes.strokeWidth</a>
   *
   * @implspec strokeWidth?: number;
   *
   */
  @JSProperty("strokeWidth")
  double getStrokeWidth();

  /**
   * (Highcharts, Highstock, Highmaps) The pixel stroke width of the shape.
   *
   * @see <a href="https://api.highcharts.com/highcharts/annotations.shapes.strokeWidth">https://api.highcharts.com/highcharts/annotations.shapes.strokeWidth</a>
   * @see <a href="https://api.highcharts.com/highstock/annotations.shapes.strokeWidth">https://api.highcharts.com/highstock/annotations.shapes.strokeWidth</a>
   * @see <a href="https://api.highcharts.com/highmaps/annotations.shapes.strokeWidth">https://api.highcharts.com/highmaps/annotations.shapes.strokeWidth</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/annotations.shapes.type">https://api.highcharts.com/highcharts/annotations.shapes.type</a>
   * @see <a href="https://api.highcharts.com/highstock/annotations.shapes.type">https://api.highcharts.com/highstock/annotations.shapes.type</a>
   * @see <a href="https://api.highcharts.com/highmaps/annotations.shapes.type">https://api.highcharts.com/highmaps/annotations.shapes.type</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/annotations.shapes.type">https://api.highcharts.com/highcharts/annotations.shapes.type</a>
   * @see <a href="https://api.highcharts.com/highstock/annotations.shapes.type">https://api.highcharts.com/highstock/annotations.shapes.type</a>
   * @see <a href="https://api.highcharts.com/highmaps/annotations.shapes.type">https://api.highcharts.com/highmaps/annotations.shapes.type</a>
   *
   * @implspec type?: string;
   *
   */
  @JSProperty("type")
  void setType(String value);

  /**
   * (Highcharts, Highstock, Highmaps) The width of the shape.
   *
   * @see <a href="https://api.highcharts.com/highcharts/annotations.shapes.width">https://api.highcharts.com/highcharts/annotations.shapes.width</a>
   * @see <a href="https://api.highcharts.com/highstock/annotations.shapes.width">https://api.highcharts.com/highstock/annotations.shapes.width</a>
   * @see <a href="https://api.highcharts.com/highmaps/annotations.shapes.width">https://api.highcharts.com/highmaps/annotations.shapes.width</a>
   *
   * @implspec width?: number;
   *
   */
  @JSProperty("width")
  double getWidth();

  /**
   * (Highcharts, Highstock, Highmaps) The width of the shape.
   *
   * @see <a href="https://api.highcharts.com/highcharts/annotations.shapes.width">https://api.highcharts.com/highcharts/annotations.shapes.width</a>
   * @see <a href="https://api.highcharts.com/highstock/annotations.shapes.width">https://api.highcharts.com/highstock/annotations.shapes.width</a>
   * @see <a href="https://api.highcharts.com/highmaps/annotations.shapes.width">https://api.highcharts.com/highmaps/annotations.shapes.width</a>
   *
   * @implspec width?: number;
   *
   */
  @JSProperty("width")
  void setWidth(double value);
}
