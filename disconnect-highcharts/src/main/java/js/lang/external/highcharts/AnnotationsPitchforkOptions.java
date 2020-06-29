package js.lang.external.highcharts;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import javax.annotation.Nullable;
import js.lang.Any;
import org.teavm.jso.JSProperty;

/**
 * (Highstock) A pitchfork annotation.
 *
 */
@NpmPackage(
    name = "highcharts",
    version = "^8.1.2"
)
@Import(
    module = "highcharts/es-modules/masters/highcharts.src.js"
)
public interface AnnotationsPitchforkOptions extends Any {
  @JSProperty("controlPointOptions")
  @Nullable
  AnnotationsPitchforkControlPointOptions getControlPointOptions();

  @JSProperty("controlPointOptions")
  void setControlPointOptions(@Nullable AnnotationsPitchforkControlPointOptions value);

  /**
   * (Highstock) Options for annotation's labels. Each label inherits options
   * from the labelOptions object. An option from the labelOptions can be
   * overwritten by config for a specific label.
   *
   */
  @JSProperty("labelOptions")
  @Nullable
  AnnotationsPitchforkLabelOptions getLabelOptions();

  /**
   * (Highstock) Options for annotation's labels. Each label inherits options
   * from the labelOptions object. An option from the labelOptions can be
   * overwritten by config for a specific label.
   *
   */
  @JSProperty("labelOptions")
  void setLabelOptions(@Nullable AnnotationsPitchforkLabelOptions value);

  /**
   * (Highstock) Options for annotation's shapes. Each shape inherits options
   * from the shapeOptions object. An option from the shapeOptions can be
   * overwritten by config for a specific shape.
   *
   */
  @JSProperty("shapeOptions")
  @Nullable
  AnnotationsPitchforkShapeOptions getShapeOptions();

  /**
   * (Highstock) Options for annotation's shapes. Each shape inherits options
   * from the shapeOptions object. An option from the shapeOptions can be
   * overwritten by config for a specific shape.
   *
   */
  @JSProperty("shapeOptions")
  void setShapeOptions(@Nullable AnnotationsPitchforkShapeOptions value);

  /**
   * (Highstock) Additional options for an annotation with the type.
   *
   */
  @JSProperty("typeOptions")
  @Nullable
  AnnotationsPitchforkTypeOptions getTypeOptions();

  /**
   * (Highstock) Additional options for an annotation with the type.
   *
   */
  @JSProperty("typeOptions")
  void setTypeOptions(@Nullable AnnotationsPitchforkTypeOptions value);

  static Builder builder() {
    return new Builder();
  }

  final class Builder {
    private final AnnotationsPitchforkOptions object = Any.empty();

    private Builder() {
    }

    public AnnotationsPitchforkOptions build() {
      return object;
    }

    public Builder controlPointOptions(@Nullable AnnotationsPitchforkControlPointOptions value) {
      object.setControlPointOptions(value);
      return this;
    }

    /**
     * (Highstock) Options for annotation's labels. Each label inherits options
     * from the labelOptions object. An option from the labelOptions can be
     * overwritten by config for a specific label.
     *
     */
    public Builder labelOptions(@Nullable AnnotationsPitchforkLabelOptions value) {
      object.setLabelOptions(value);
      return this;
    }

    /**
     * (Highstock) Options for annotation's shapes. Each shape inherits options
     * from the shapeOptions object. An option from the shapeOptions can be
     * overwritten by config for a specific shape.
     *
     */
    public Builder shapeOptions(@Nullable AnnotationsPitchforkShapeOptions value) {
      object.setShapeOptions(value);
      return this;
    }

    /**
     * (Highstock) Additional options for an annotation with the type.
     *
     */
    public Builder typeOptions(@Nullable AnnotationsPitchforkTypeOptions value) {
      object.setTypeOptions(value);
      return this;
    }
  }
}
