package js.lang.external.highcharts;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import java.lang.String;
import javax.annotation.Nullable;
import js.lang.Any;
import js.lang.Unknown /* ( number | string ) */;
import org.teavm.jso.JSProperty;

/**
 * (Highcharts, Highstock, Highmaps, Gantt) Additional options to be merged into
 * all annotations.
 *
 */
@NpmPackage(
    name = "highcharts",
    version = "^8.1.0"
)
@Import(
    module = "highcharts/es-modules/masters/highcharts.src.js"
)
public interface NavigationAnnotationsOptions extends Any {
  /**
   * (Highcharts, Highstock, Highmaps, Gantt) Options for annotation's control
   * points. Each control point inherits options from controlPointOptions
   * object. Options from the controlPointOptions can be overwritten by
   * options in a specific control point.
   *
   */
  @JSProperty("controlPointOptions")
  @Nullable
  AnnotationControlPointOptionsObject getControlPointOptions();

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) Options for annotation's control
   * points. Each control point inherits options from controlPointOptions
   * object. Options from the controlPointOptions can be overwritten by
   * options in a specific control point.
   *
   */
  @JSProperty("controlPointOptions")
  void setControlPointOptions(@Nullable AnnotationControlPointOptionsObject value);

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) Allow an annotation to be
   * draggable by a user. Possible values are <code>'x'</code>, <code>'xy'</code>, <code>'y'</code> and <code>''</code>
   * (disabled).
   *
   */
  @JSProperty("draggable")
  @Nullable
  Draggable getDraggable();

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) Allow an annotation to be
   * draggable by a user. Possible values are <code>'x'</code>, <code>'xy'</code>, <code>'y'</code> and <code>''</code>
   * (disabled).
   *
   */
  @JSProperty("draggable")
  void setDraggable(@Nullable Draggable value);

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) Events available in annotations.
   *
   */
  @JSProperty("events")
  @Nullable
  NavigationAnnotationsEventsOptions getEvents();

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) Events available in annotations.
   *
   */
  @JSProperty("events")
  void setEvents(@Nullable NavigationAnnotationsEventsOptions value);

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) Sets an ID for an annotation.
   * Can be user later when removing an annotation in
   * Chart.removeAnnotation(id) method.
   *
   */
  @JSProperty("id")
  @Nullable
  Unknown /* ( number | string ) */ getId();

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) Sets an ID for an annotation.
   * Can be user later when removing an annotation in
   * Chart.removeAnnotation(id) method.
   *
   */
  @JSProperty("id")
  void setId(double value);

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) Sets an ID for an annotation.
   * Can be user later when removing an annotation in
   * Chart.removeAnnotation(id) method.
   *
   */
  @JSProperty("id")
  void setId(@Nullable String value);

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) Options for annotation's labels.
   * Each label inherits options from the labelOptions object. An option from
   * the labelOptions can be overwritten by config for a specific label.
   *
   */
  @JSProperty("labelOptions")
  @Nullable
  NavigationAnnotationsLabelOptions getLabelOptions();

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) Options for annotation's labels.
   * Each label inherits options from the labelOptions object. An option from
   * the labelOptions can be overwritten by config for a specific label.
   *
   */
  @JSProperty("labelOptions")
  void setLabelOptions(@Nullable NavigationAnnotationsLabelOptions value);

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) An array of labels for the
   * annotation. For options that apply to multiple labels, they can be added
   * to the labelOptions.
   *
   */
  @JSProperty("labels")
  @Nullable
  NavigationAnnotationsLabelsOptions[] getLabels();

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) An array of labels for the
   * annotation. For options that apply to multiple labels, they can be added
   * to the labelOptions.
   *
   */
  @JSProperty("labels")
  void setLabels(NavigationAnnotationsLabelsOptions[] value);

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) Options for annotation's shapes.
   * Each shape inherits options from the shapeOptions object. An option from
   * the shapeOptions can be overwritten by config for a specific shape.
   *
   */
  @JSProperty("shapeOptions")
  @Nullable
  NavigationAnnotationsShapeOptions getShapeOptions();

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) Options for annotation's shapes.
   * Each shape inherits options from the shapeOptions object. An option from
   * the shapeOptions can be overwritten by config for a specific shape.
   *
   */
  @JSProperty("shapeOptions")
  void setShapeOptions(@Nullable NavigationAnnotationsShapeOptions value);

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) An array of shapes for the
   * annotation. For options that apply to multiple shapes, then can be added
   * to the shapeOptions.
   *
   */
  @JSProperty("shapes")
  @Nullable
  NavigationAnnotationsShapesOptions[] getShapes();

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) An array of shapes for the
   * annotation. For options that apply to multiple shapes, then can be added
   * to the shapeOptions.
   *
   */
  @JSProperty("shapes")
  void setShapes(NavigationAnnotationsShapesOptions[] value);

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) Whether the annotation is
   * visible.
   *
   */
  @JSProperty("visible")
  boolean getVisible();

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) Whether the annotation is
   * visible.
   *
   */
  @JSProperty("visible")
  void setVisible(boolean value);

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) The Z index of the annotation.
   *
   */
  @JSProperty("zIndex")
  double getZIndex();

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) The Z index of the annotation.
   *
   */
  @JSProperty("zIndex")
  void setZIndex(double value);

  class Builder {
    private final NavigationAnnotationsOptions object = Any.empty();

    public NavigationAnnotationsOptions build() {
      return object;
    }

    /**
     * (Highcharts, Highstock, Highmaps, Gantt) Options for annotation's control
     * points. Each control point inherits options from controlPointOptions
     * object. Options from the controlPointOptions can be overwritten by
     * options in a specific control point.
     *
     */
    public Builder controlPointOptions(@Nullable AnnotationControlPointOptionsObject value) {
      object.setControlPointOptions(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Highmaps, Gantt) Allow an annotation to be
     * draggable by a user. Possible values are <code>'x'</code>, <code>'xy'</code>, <code>'y'</code> and <code>''</code>
     * (disabled).
     *
     */
    public Builder draggable(@Nullable Draggable value) {
      object.setDraggable(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Highmaps, Gantt) Events available in annotations.
     *
     */
    public Builder events(@Nullable NavigationAnnotationsEventsOptions value) {
      object.setEvents(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Highmaps, Gantt) Sets an ID for an annotation.
     * Can be user later when removing an annotation in
     * Chart.removeAnnotation(id) method.
     *
     */
    public Builder id(double value) {
      object.setId(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Highmaps, Gantt) Sets an ID for an annotation.
     * Can be user later when removing an annotation in
     * Chart.removeAnnotation(id) method.
     *
     */
    public Builder id(@Nullable String value) {
      object.setId(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Highmaps, Gantt) Options for annotation's labels.
     * Each label inherits options from the labelOptions object. An option from
     * the labelOptions can be overwritten by config for a specific label.
     *
     */
    public Builder labelOptions(@Nullable NavigationAnnotationsLabelOptions value) {
      object.setLabelOptions(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Highmaps, Gantt) An array of labels for the
     * annotation. For options that apply to multiple labels, they can be added
     * to the labelOptions.
     *
     */
    public Builder labels(NavigationAnnotationsLabelsOptions[] value) {
      object.setLabels(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Highmaps, Gantt) Options for annotation's shapes.
     * Each shape inherits options from the shapeOptions object. An option from
     * the shapeOptions can be overwritten by config for a specific shape.
     *
     */
    public Builder shapeOptions(@Nullable NavigationAnnotationsShapeOptions value) {
      object.setShapeOptions(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Highmaps, Gantt) An array of shapes for the
     * annotation. For options that apply to multiple shapes, then can be added
     * to the shapeOptions.
     *
     */
    public Builder shapes(NavigationAnnotationsShapesOptions[] value) {
      object.setShapes(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Highmaps, Gantt) Whether the annotation is
     * visible.
     *
     */
    public Builder visible(boolean value) {
      object.setVisible(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Highmaps, Gantt) The Z index of the annotation.
     *
     */
    public Builder zIndex(double value) {
      object.setZIndex(value);
      return this;
    }
  }
}
