package js.lang.external.highcharts;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import javax.annotation.Nullable;
import js.lang.Any;
import org.teavm.jso.JSProperty;

/**
 * (Highstock) A crooked line annotation.
 *
 */
@NpmPackage(
    name = "highcharts",
    version = "^8.1.2"
)
@Import(
    module = "highcharts/es-modules/masters/highcharts.src.js"
)
public interface AnnotationsCrookedLineOptions extends Any {
  @JSProperty("controlPointOptions")
  @Nullable
  AnnotationsCrookedLineControlPointOptions getControlPointOptions();

  @JSProperty("controlPointOptions")
  void setControlPointOptions(@Nullable AnnotationsCrookedLineControlPointOptions value);

  /**
   * (Highstock) Options for annotation's labels. Each label inherits options
   * from the labelOptions object. An option from the labelOptions can be
   * overwritten by config for a specific label.
   *
   */
  @JSProperty("labelOptions")
  @Nullable
  AnnotationsCrookedLineLabelOptions getLabelOptions();

  /**
   * (Highstock) Options for annotation's labels. Each label inherits options
   * from the labelOptions object. An option from the labelOptions can be
   * overwritten by config for a specific label.
   *
   */
  @JSProperty("labelOptions")
  void setLabelOptions(@Nullable AnnotationsCrookedLineLabelOptions value);

  /**
   * (Highstock) Options for annotation's shapes. Each shape inherits options
   * from the shapeOptions object. An option from the shapeOptions can be
   * overwritten by config for a specific shape.
   *
   */
  @JSProperty("shapeOptions")
  @Nullable
  AnnotationsCrookedLineShapeOptions getShapeOptions();

  /**
   * (Highstock) Options for annotation's shapes. Each shape inherits options
   * from the shapeOptions object. An option from the shapeOptions can be
   * overwritten by config for a specific shape.
   *
   */
  @JSProperty("shapeOptions")
  void setShapeOptions(@Nullable AnnotationsCrookedLineShapeOptions value);

  /**
   * (Highstock) Additional options for an annotation with the type.
   *
   */
  @JSProperty("typeOptions")
  @Nullable
  AnnotationsCrookedLineTypeOptions getTypeOptions();

  /**
   * (Highstock) Additional options for an annotation with the type.
   *
   */
  @JSProperty("typeOptions")
  void setTypeOptions(@Nullable AnnotationsCrookedLineTypeOptions value);

  static Builder builder() {
    return new Builder();
  }

  final class Builder {
    private final AnnotationsCrookedLineOptions object = Any.empty();

    private Builder() {
    }

    public AnnotationsCrookedLineOptions build() {
      return object;
    }

    public Builder controlPointOptions(@Nullable AnnotationsCrookedLineControlPointOptions value) {
      object.setControlPointOptions(value);
      return this;
    }

    /**
     * (Highstock) Options for annotation's labels. Each label inherits options
     * from the labelOptions object. An option from the labelOptions can be
     * overwritten by config for a specific label.
     *
     */
    public Builder labelOptions(@Nullable AnnotationsCrookedLineLabelOptions value) {
      object.setLabelOptions(value);
      return this;
    }

    /**
     * (Highstock) Options for annotation's shapes. Each shape inherits options
     * from the shapeOptions object. An option from the shapeOptions can be
     * overwritten by config for a specific shape.
     *
     */
    public Builder shapeOptions(@Nullable AnnotationsCrookedLineShapeOptions value) {
      object.setShapeOptions(value);
      return this;
    }

    /**
     * (Highstock) Additional options for an annotation with the type.
     *
     */
    public Builder typeOptions(@Nullable AnnotationsCrookedLineTypeOptions value) {
      object.setTypeOptions(value);
      return this;
    }
  }
}
