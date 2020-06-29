package js.lang.external.highcharts;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import java.lang.String;
import javax.annotation.Nullable;
import js.lang.Any;
import js.lang.Unknown /* ( number | string ) */;
import org.teavm.jso.JSProperty;

/**
 * (Highcharts, Highstock, Highmaps, Gantt) A basic type of an annotation. It
 * allows to add custom labels or shapes. The items can be tied to points, axis
 * coordinates or chart pixel coordinates.
 *
 */
@NpmPackage(
    name = "highcharts",
    version = "^8.1.2"
)
@Import(
    module = "highcharts/es-modules/masters/highcharts.src.js"
)
public interface AnnotationsOptions extends Any {
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
   * (Highstock) A crooked line annotation.
   *
   */
  @JSProperty("crookedLine")
  @Nullable
  AnnotationsCrookedLineOptions getCrookedLine();

  /**
   * (Highstock) A crooked line annotation.
   *
   */
  @JSProperty("crookedLine")
  void setCrookedLine(@Nullable AnnotationsCrookedLineOptions value);

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
   * (Highstock) An elliott wave annotation.
   *
   */
  @JSProperty("elliottWave")
  @Nullable
  AnnotationsElliottWaveOptions getElliottWave();

  /**
   * (Highstock) An elliott wave annotation.
   *
   */
  @JSProperty("elliottWave")
  void setElliottWave(@Nullable AnnotationsElliottWaveOptions value);

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) Events available in annotations.
   *
   */
  @JSProperty("events")
  @Nullable
  AnnotationsEventsOptions getEvents();

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) Events available in annotations.
   *
   */
  @JSProperty("events")
  void setEvents(@Nullable AnnotationsEventsOptions value);

  /**
   * (Highstock) A fibonacci annotation.
   *
   */
  @JSProperty("fibonacci")
  @Nullable
  AnnotationsFibonacciOptions getFibonacci();

  /**
   * (Highstock) A fibonacci annotation.
   *
   */
  @JSProperty("fibonacci")
  void setFibonacci(@Nullable AnnotationsFibonacciOptions value);

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
   * (Highstock) An infinity line annotation.
   *
   */
  @JSProperty("infinityLine")
  @Nullable
  AnnotationsInfinityLineOptions getInfinityLine();

  /**
   * (Highstock) An infinity line annotation.
   *
   */
  @JSProperty("infinityLine")
  void setInfinityLine(@Nullable AnnotationsInfinityLineOptions value);

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) Options for annotation's labels.
   * Each label inherits options from the labelOptions object. An option from
   * the labelOptions can be overwritten by config for a specific label.
   *
   */
  @JSProperty("labelOptions")
  @Nullable
  AnnotationsLabelOptions getLabelOptions();

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) Options for annotation's labels.
   * Each label inherits options from the labelOptions object. An option from
   * the labelOptions can be overwritten by config for a specific label.
   *
   */
  @JSProperty("labelOptions")
  void setLabelOptions(@Nullable AnnotationsLabelOptions value);

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) An array of labels for the
   * annotation. For options that apply to multiple labels, they can be added
   * to the labelOptions.
   *
   */
  @JSProperty("labels")
  @Nullable
  AnnotationsLabelsOptions[] getLabels();

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) An array of labels for the
   * annotation. For options that apply to multiple labels, they can be added
   * to the labelOptions.
   *
   */
  @JSProperty("labels")
  void setLabels(AnnotationsLabelsOptions... value);

  /**
   * (Highstock) A measure annotation.
   *
   */
  @JSProperty("measure")
  @Nullable
  AnnotationsMeasureOptions getMeasure();

  /**
   * (Highstock) A measure annotation.
   *
   */
  @JSProperty("measure")
  void setMeasure(@Nullable AnnotationsMeasureOptions value);

  /**
   * (Highstock) A pitchfork annotation.
   *
   */
  @JSProperty("pitchfork")
  @Nullable
  AnnotationsPitchforkOptions getPitchfork();

  /**
   * (Highstock) A pitchfork annotation.
   *
   */
  @JSProperty("pitchfork")
  void setPitchfork(@Nullable AnnotationsPitchforkOptions value);

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) Options for annotation's shapes.
   * Each shape inherits options from the shapeOptions object. An option from
   * the shapeOptions can be overwritten by config for a specific shape.
   *
   */
  @JSProperty("shapeOptions")
  @Nullable
  AnnotationsShapeOptions getShapeOptions();

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) Options for annotation's shapes.
   * Each shape inherits options from the shapeOptions object. An option from
   * the shapeOptions can be overwritten by config for a specific shape.
   *
   */
  @JSProperty("shapeOptions")
  void setShapeOptions(@Nullable AnnotationsShapeOptions value);

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) An array of shapes for the
   * annotation. For options that apply to multiple shapes, then can be added
   * to the shapeOptions.
   *
   */
  @JSProperty("shapes")
  @Nullable
  AnnotationsShapesOptions[] getShapes();

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) An array of shapes for the
   * annotation. For options that apply to multiple shapes, then can be added
   * to the shapeOptions.
   *
   */
  @JSProperty("shapes")
  void setShapes(AnnotationsShapesOptions... value);

  /**
   * (Highstock) A tunnel annotation.
   *
   */
  @JSProperty("tunnel")
  @Nullable
  AnnotationsTunnelOptions getTunnel();

  /**
   * (Highstock) A tunnel annotation.
   *
   */
  @JSProperty("tunnel")
  void setTunnel(@Nullable AnnotationsTunnelOptions value);

  /**
   * (Highstock) A vertical line annotation.
   *
   */
  @JSProperty("verticalLine")
  @Nullable
  AnnotationsVerticalLineOptions getVerticalLine();

  /**
   * (Highstock) A vertical line annotation.
   *
   */
  @JSProperty("verticalLine")
  void setVerticalLine(@Nullable AnnotationsVerticalLineOptions value);

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

  static Builder builder() {
    return new Builder();
  }

  final class Builder {
    private final AnnotationsOptions object = Any.empty();

    private Builder() {
    }

    public AnnotationsOptions build() {
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
     * (Highstock) A crooked line annotation.
     *
     */
    public Builder crookedLine(@Nullable AnnotationsCrookedLineOptions value) {
      object.setCrookedLine(value);
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
     * (Highstock) An elliott wave annotation.
     *
     */
    public Builder elliottWave(@Nullable AnnotationsElliottWaveOptions value) {
      object.setElliottWave(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Highmaps, Gantt) Events available in annotations.
     *
     */
    public Builder events(@Nullable AnnotationsEventsOptions value) {
      object.setEvents(value);
      return this;
    }

    /**
     * (Highstock) A fibonacci annotation.
     *
     */
    public Builder fibonacci(@Nullable AnnotationsFibonacciOptions value) {
      object.setFibonacci(value);
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
     * (Highstock) An infinity line annotation.
     *
     */
    public Builder infinityLine(@Nullable AnnotationsInfinityLineOptions value) {
      object.setInfinityLine(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Highmaps, Gantt) Options for annotation's labels.
     * Each label inherits options from the labelOptions object. An option from
     * the labelOptions can be overwritten by config for a specific label.
     *
     */
    public Builder labelOptions(@Nullable AnnotationsLabelOptions value) {
      object.setLabelOptions(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Highmaps, Gantt) An array of labels for the
     * annotation. For options that apply to multiple labels, they can be added
     * to the labelOptions.
     *
     */
    public Builder labels(AnnotationsLabelsOptions... value) {
      object.setLabels(value);
      return this;
    }

    /**
     * (Highstock) A measure annotation.
     *
     */
    public Builder measure(@Nullable AnnotationsMeasureOptions value) {
      object.setMeasure(value);
      return this;
    }

    /**
     * (Highstock) A pitchfork annotation.
     *
     */
    public Builder pitchfork(@Nullable AnnotationsPitchforkOptions value) {
      object.setPitchfork(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Highmaps, Gantt) Options for annotation's shapes.
     * Each shape inherits options from the shapeOptions object. An option from
     * the shapeOptions can be overwritten by config for a specific shape.
     *
     */
    public Builder shapeOptions(@Nullable AnnotationsShapeOptions value) {
      object.setShapeOptions(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Highmaps, Gantt) An array of shapes for the
     * annotation. For options that apply to multiple shapes, then can be added
     * to the shapeOptions.
     *
     */
    public Builder shapes(AnnotationsShapesOptions... value) {
      object.setShapes(value);
      return this;
    }

    /**
     * (Highstock) A tunnel annotation.
     *
     */
    public Builder tunnel(@Nullable AnnotationsTunnelOptions value) {
      object.setTunnel(value);
      return this;
    }

    /**
     * (Highstock) A vertical line annotation.
     *
     */
    public Builder verticalLine(@Nullable AnnotationsVerticalLineOptions value) {
      object.setVerticalLine(value);
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
