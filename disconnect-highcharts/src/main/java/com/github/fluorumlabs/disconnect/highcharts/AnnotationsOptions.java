package com.github.fluorumlabs.disconnect.highcharts;

import java.lang.String;
import javax.annotation.Nullable;
import js.lang.Any;
import js.util.collections.Array;
import org.teavm.jso.JSProperty;

/**
 * (Highcharts, Highstock, Highmaps) Options for configuring annotations, for
 * example labels, arrows or shapes. Annotations can be tied to points, axis
 * coordinates or chart pixel coordinates.
 *
 * @see <a href="https://api.highcharts.com/highcharts/annotations">https://api.highcharts.com/highcharts/annotations</a>
 * @see <a href="https://api.highcharts.com/highstock/annotations">https://api.highcharts.com/highstock/annotations</a>
 * @see <a href="https://api.highcharts.com/highmaps/annotations">https://api.highcharts.com/highmaps/annotations</a>
 *
 */
public interface AnnotationsOptions extends Any {
  /**
   * (Highcharts, Highstock, Highmaps) Sets an ID for an annotation. Can be
   * user later when removing an annotation in Chart.removeAnnotation(id)
   * method.
   *
   * @see <a href="https://api.highcharts.com/highcharts/annotations.id">https://api.highcharts.com/highcharts/annotations.id</a>
   * @see <a href="https://api.highcharts.com/highstock/annotations.id">https://api.highcharts.com/highstock/annotations.id</a>
   * @see <a href="https://api.highcharts.com/highmaps/annotations.id">https://api.highcharts.com/highmaps/annotations.id</a>
   *
   * @implspec id?: string;
   *
   */
  @JSProperty("id")
  @Nullable
  String getId();

  /**
   * (Highcharts, Highstock, Highmaps) Sets an ID for an annotation. Can be
   * user later when removing an annotation in Chart.removeAnnotation(id)
   * method.
   *
   * @see <a href="https://api.highcharts.com/highcharts/annotations.id">https://api.highcharts.com/highcharts/annotations.id</a>
   * @see <a href="https://api.highcharts.com/highstock/annotations.id">https://api.highcharts.com/highstock/annotations.id</a>
   * @see <a href="https://api.highcharts.com/highmaps/annotations.id">https://api.highcharts.com/highmaps/annotations.id</a>
   *
   * @implspec id?: string;
   *
   */
  @JSProperty("id")
  void setId(String value);

  /**
   * (Highcharts, Highstock, Highmaps) Options for annotation's labels. Each
   * label inherits options from the labelOptions object. An option from the
   * labelOptions can be overwritten by config for a specific label.
   *
   * @see <a href="https://api.highcharts.com/highcharts/annotations.labelOptions">https://api.highcharts.com/highcharts/annotations.labelOptions</a>
   * @see <a href="https://api.highcharts.com/highstock/annotations.labelOptions">https://api.highcharts.com/highstock/annotations.labelOptions</a>
   * @see <a href="https://api.highcharts.com/highmaps/annotations.labelOptions">https://api.highcharts.com/highmaps/annotations.labelOptions</a>
   *
   * @implspec labelOptions?: AnnotationsLabelOptions;
   *
   */
  @JSProperty("labelOptions")
  @Nullable
  AnnotationsLabelOptions getLabelOptions();

  /**
   * (Highcharts, Highstock, Highmaps) Options for annotation's labels. Each
   * label inherits options from the labelOptions object. An option from the
   * labelOptions can be overwritten by config for a specific label.
   *
   * @see <a href="https://api.highcharts.com/highcharts/annotations.labelOptions">https://api.highcharts.com/highcharts/annotations.labelOptions</a>
   * @see <a href="https://api.highcharts.com/highstock/annotations.labelOptions">https://api.highcharts.com/highstock/annotations.labelOptions</a>
   * @see <a href="https://api.highcharts.com/highmaps/annotations.labelOptions">https://api.highcharts.com/highmaps/annotations.labelOptions</a>
   *
   * @implspec labelOptions?: AnnotationsLabelOptions;
   *
   */
  @JSProperty("labelOptions")
  void setLabelOptions(AnnotationsLabelOptions value);

  /**
   * (Highcharts, Highstock, Highmaps) An array of labels for the annotation.
   * For options that apply to multiple labels, they can be added to the
   * labelOptions.
   *
   * @see <a href="https://api.highcharts.com/highcharts/annotations.labels">https://api.highcharts.com/highcharts/annotations.labels</a>
   * @see <a href="https://api.highcharts.com/highstock/annotations.labels">https://api.highcharts.com/highstock/annotations.labels</a>
   * @see <a href="https://api.highcharts.com/highmaps/annotations.labels">https://api.highcharts.com/highmaps/annotations.labels</a>
   *
   * @implspec labels?: Array<AnnotationsLabelsOptions>;
   *
   */
  @JSProperty("labels")
  @Nullable
  Array<AnnotationsLabelsOptions> getLabels();

  /**
   * (Highcharts, Highstock, Highmaps) An array of labels for the annotation.
   * For options that apply to multiple labels, they can be added to the
   * labelOptions.
   *
   * @see <a href="https://api.highcharts.com/highcharts/annotations.labels">https://api.highcharts.com/highcharts/annotations.labels</a>
   * @see <a href="https://api.highcharts.com/highstock/annotations.labels">https://api.highcharts.com/highstock/annotations.labels</a>
   * @see <a href="https://api.highcharts.com/highmaps/annotations.labels">https://api.highcharts.com/highmaps/annotations.labels</a>
   *
   * @implspec labels?: Array<AnnotationsLabelsOptions>;
   *
   */
  @JSProperty("labels")
  void setLabels(Array<AnnotationsLabelsOptions> value);

  /**
   * (Highcharts, Highstock, Highmaps) Options for annotation's shapes. Each
   * shape inherits options from the shapeOptions object. An option from the
   * shapeOptions can be overwritten by config for a specific shape.
   *
   * @see <a href="https://api.highcharts.com/highcharts/annotations.shapeOptions">https://api.highcharts.com/highcharts/annotations.shapeOptions</a>
   * @see <a href="https://api.highcharts.com/highstock/annotations.shapeOptions">https://api.highcharts.com/highstock/annotations.shapeOptions</a>
   * @see <a href="https://api.highcharts.com/highmaps/annotations.shapeOptions">https://api.highcharts.com/highmaps/annotations.shapeOptions</a>
   *
   * @implspec shapeOptions?: AnnotationsShapeOptions;
   *
   */
  @JSProperty("shapeOptions")
  @Nullable
  AnnotationsShapeOptions getShapeOptions();

  /**
   * (Highcharts, Highstock, Highmaps) Options for annotation's shapes. Each
   * shape inherits options from the shapeOptions object. An option from the
   * shapeOptions can be overwritten by config for a specific shape.
   *
   * @see <a href="https://api.highcharts.com/highcharts/annotations.shapeOptions">https://api.highcharts.com/highcharts/annotations.shapeOptions</a>
   * @see <a href="https://api.highcharts.com/highstock/annotations.shapeOptions">https://api.highcharts.com/highstock/annotations.shapeOptions</a>
   * @see <a href="https://api.highcharts.com/highmaps/annotations.shapeOptions">https://api.highcharts.com/highmaps/annotations.shapeOptions</a>
   *
   * @implspec shapeOptions?: AnnotationsShapeOptions;
   *
   */
  @JSProperty("shapeOptions")
  void setShapeOptions(AnnotationsShapeOptions value);

  /**
   * (Highcharts, Highstock, Highmaps) An array of shapes for the annotation.
   * For options that apply to multiple shapes, then can be added to the
   * shapeOptions.
   *
   * @see <a href="https://api.highcharts.com/highcharts/annotations.shapes">https://api.highcharts.com/highcharts/annotations.shapes</a>
   * @see <a href="https://api.highcharts.com/highstock/annotations.shapes">https://api.highcharts.com/highstock/annotations.shapes</a>
   * @see <a href="https://api.highcharts.com/highmaps/annotations.shapes">https://api.highcharts.com/highmaps/annotations.shapes</a>
   *
   * @implspec shapes?: Array<AnnotationsShapesOptions>;
   *
   */
  @JSProperty("shapes")
  @Nullable
  Array<AnnotationsShapesOptions> getShapes();

  /**
   * (Highcharts, Highstock, Highmaps) An array of shapes for the annotation.
   * For options that apply to multiple shapes, then can be added to the
   * shapeOptions.
   *
   * @see <a href="https://api.highcharts.com/highcharts/annotations.shapes">https://api.highcharts.com/highcharts/annotations.shapes</a>
   * @see <a href="https://api.highcharts.com/highstock/annotations.shapes">https://api.highcharts.com/highstock/annotations.shapes</a>
   * @see <a href="https://api.highcharts.com/highmaps/annotations.shapes">https://api.highcharts.com/highmaps/annotations.shapes</a>
   *
   * @implspec shapes?: Array<AnnotationsShapesOptions>;
   *
   */
  @JSProperty("shapes")
  void setShapes(Array<AnnotationsShapesOptions> value);

  /**
   * (Highcharts, Highstock, Highmaps) Whether the annotation is visible.
   *
   * @see <a href="https://api.highcharts.com/highcharts/annotations.visible">https://api.highcharts.com/highcharts/annotations.visible</a>
   * @see <a href="https://api.highcharts.com/highstock/annotations.visible">https://api.highcharts.com/highstock/annotations.visible</a>
   * @see <a href="https://api.highcharts.com/highmaps/annotations.visible">https://api.highcharts.com/highmaps/annotations.visible</a>
   *
   * @implspec visible?: boolean;
   *
   */
  @JSProperty("visible")
  boolean getVisible();

  /**
   * (Highcharts, Highstock, Highmaps) Whether the annotation is visible.
   *
   * @see <a href="https://api.highcharts.com/highcharts/annotations.visible">https://api.highcharts.com/highcharts/annotations.visible</a>
   * @see <a href="https://api.highcharts.com/highstock/annotations.visible">https://api.highcharts.com/highstock/annotations.visible</a>
   * @see <a href="https://api.highcharts.com/highmaps/annotations.visible">https://api.highcharts.com/highmaps/annotations.visible</a>
   *
   * @implspec visible?: boolean;
   *
   */
  @JSProperty("visible")
  void setVisible(boolean value);

  /**
   * (Highcharts, Highstock, Highmaps) The Z index of the annotation.
   *
   * @see <a href="https://api.highcharts.com/highcharts/annotations.zIndex">https://api.highcharts.com/highcharts/annotations.zIndex</a>
   * @see <a href="https://api.highcharts.com/highstock/annotations.zIndex">https://api.highcharts.com/highstock/annotations.zIndex</a>
   * @see <a href="https://api.highcharts.com/highmaps/annotations.zIndex">https://api.highcharts.com/highmaps/annotations.zIndex</a>
   *
   * @implspec zIndex?: number;
   *
   */
  @JSProperty("zIndex")
  double getZIndex();

  /**
   * (Highcharts, Highstock, Highmaps) The Z index of the annotation.
   *
   * @see <a href="https://api.highcharts.com/highcharts/annotations.zIndex">https://api.highcharts.com/highcharts/annotations.zIndex</a>
   * @see <a href="https://api.highcharts.com/highstock/annotations.zIndex">https://api.highcharts.com/highstock/annotations.zIndex</a>
   * @see <a href="https://api.highcharts.com/highmaps/annotations.zIndex">https://api.highcharts.com/highmaps/annotations.zIndex</a>
   *
   * @implspec zIndex?: number;
   *
   */
  @JSProperty("zIndex")
  void setZIndex(double value);
}
