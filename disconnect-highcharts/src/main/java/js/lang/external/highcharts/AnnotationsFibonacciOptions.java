package js.lang.external.highcharts;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import javax.annotation.Nullable;
import js.lang.Any;
import org.teavm.jso.JSProperty;

/**
 * (Highstock) A fibonacci annotation.
 *
 */
@NpmPackage(
    name = "highcharts",
    version = "^8.1.2"
)
@Import(
    module = "highcharts/es-modules/masters/highcharts.src.js"
)
public interface AnnotationsFibonacciOptions extends Any {
  @JSProperty("controlPointOptions")
  @Nullable
  AnnotationsFibonacciControlPointOptions getControlPointOptions();

  @JSProperty("controlPointOptions")
  void setControlPointOptions(@Nullable AnnotationsFibonacciControlPointOptions value);

  /**
   * (Highstock) Options for annotation's labels. Each label inherits options
   * from the labelOptions object. An option from the labelOptions can be
   * overwritten by config for a specific label.
   *
   */
  @JSProperty("labelOptions")
  @Nullable
  AnnotationsFibonacciLabelOptions getLabelOptions();

  /**
   * (Highstock) Options for annotation's labels. Each label inherits options
   * from the labelOptions object. An option from the labelOptions can be
   * overwritten by config for a specific label.
   *
   */
  @JSProperty("labelOptions")
  void setLabelOptions(@Nullable AnnotationsFibonacciLabelOptions value);

  /**
   * (Highstock) Options for annotation's shapes. Each shape inherits options
   * from the shapeOptions object. An option from the shapeOptions can be
   * overwritten by config for a specific shape.
   *
   */
  @JSProperty("shapeOptions")
  @Nullable
  AnnotationsFibonacciShapeOptions getShapeOptions();

  /**
   * (Highstock) Options for annotation's shapes. Each shape inherits options
   * from the shapeOptions object. An option from the shapeOptions can be
   * overwritten by config for a specific shape.
   *
   */
  @JSProperty("shapeOptions")
  void setShapeOptions(@Nullable AnnotationsFibonacciShapeOptions value);

  /**
   * (Highstock) Additional options for an annotation with the type.
   *
   */
  @JSProperty("typeOptions")
  @Nullable
  AnnotationsFibonacciTypeOptions getTypeOptions();

  /**
   * (Highstock) Additional options for an annotation with the type.
   *
   */
  @JSProperty("typeOptions")
  void setTypeOptions(@Nullable AnnotationsFibonacciTypeOptions value);

  static Builder builder() {
    return new Builder();
  }

  final class Builder {
    private final AnnotationsFibonacciOptions object = Any.empty();

    private Builder() {
    }

    public AnnotationsFibonacciOptions build() {
      return object;
    }

    public Builder controlPointOptions(@Nullable AnnotationsFibonacciControlPointOptions value) {
      object.setControlPointOptions(value);
      return this;
    }

    /**
     * (Highstock) Options for annotation's labels. Each label inherits options
     * from the labelOptions object. An option from the labelOptions can be
     * overwritten by config for a specific label.
     *
     */
    public Builder labelOptions(@Nullable AnnotationsFibonacciLabelOptions value) {
      object.setLabelOptions(value);
      return this;
    }

    /**
     * (Highstock) Options for annotation's shapes. Each shape inherits options
     * from the shapeOptions object. An option from the shapeOptions can be
     * overwritten by config for a specific shape.
     *
     */
    public Builder shapeOptions(@Nullable AnnotationsFibonacciShapeOptions value) {
      object.setShapeOptions(value);
      return this;
    }

    /**
     * (Highstock) Additional options for an annotation with the type.
     *
     */
    public Builder typeOptions(@Nullable AnnotationsFibonacciTypeOptions value) {
      object.setTypeOptions(value);
      return this;
    }
  }
}
