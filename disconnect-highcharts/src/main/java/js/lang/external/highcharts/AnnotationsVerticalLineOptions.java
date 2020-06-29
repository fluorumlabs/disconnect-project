package js.lang.external.highcharts;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import javax.annotation.Nullable;
import js.lang.Any;
import org.teavm.jso.JSProperty;

/**
 * (Highstock) A vertical line annotation.
 *
 */
@NpmPackage(
    name = "highcharts",
    version = "^8.1.2"
)
@Import(
    module = "highcharts/es-modules/masters/highcharts.src.js"
)
public interface AnnotationsVerticalLineOptions extends Any {
  /**
   * (Highstock) Options for annotation's labels. Each label inherits options
   * from the labelOptions object. An option from the labelOptions can be
   * overwritten by config for a specific label.
   *
   */
  @JSProperty("labelOptions")
  @Nullable
  AnnotationsVerticalLineLabelOptions getLabelOptions();

  /**
   * (Highstock) Options for annotation's labels. Each label inherits options
   * from the labelOptions object. An option from the labelOptions can be
   * overwritten by config for a specific label.
   *
   */
  @JSProperty("labelOptions")
  void setLabelOptions(@Nullable AnnotationsVerticalLineLabelOptions value);

  /**
   * (Highstock) Options for annotation's shapes. Each shape inherits options
   * from the shapeOptions object. An option from the shapeOptions can be
   * overwritten by config for a specific shape.
   *
   */
  @JSProperty("shapeOptions")
  @Nullable
  AnnotationsVerticalLineShapeOptions getShapeOptions();

  /**
   * (Highstock) Options for annotation's shapes. Each shape inherits options
   * from the shapeOptions object. An option from the shapeOptions can be
   * overwritten by config for a specific shape.
   *
   */
  @JSProperty("shapeOptions")
  void setShapeOptions(@Nullable AnnotationsVerticalLineShapeOptions value);

  /**
   * (Highstock) Additional options for an annotation with the type.
   *
   */
  @JSProperty("typeOptions")
  @Nullable
  AnnotationsVerticalLineTypeOptions getTypeOptions();

  /**
   * (Highstock) Additional options for an annotation with the type.
   *
   */
  @JSProperty("typeOptions")
  void setTypeOptions(@Nullable AnnotationsVerticalLineTypeOptions value);

  static Builder builder() {
    return new Builder();
  }

  final class Builder {
    private final AnnotationsVerticalLineOptions object = Any.empty();

    private Builder() {
    }

    public AnnotationsVerticalLineOptions build() {
      return object;
    }

    /**
     * (Highstock) Options for annotation's labels. Each label inherits options
     * from the labelOptions object. An option from the labelOptions can be
     * overwritten by config for a specific label.
     *
     */
    public Builder labelOptions(@Nullable AnnotationsVerticalLineLabelOptions value) {
      object.setLabelOptions(value);
      return this;
    }

    /**
     * (Highstock) Options for annotation's shapes. Each shape inherits options
     * from the shapeOptions object. An option from the shapeOptions can be
     * overwritten by config for a specific shape.
     *
     */
    public Builder shapeOptions(@Nullable AnnotationsVerticalLineShapeOptions value) {
      object.setShapeOptions(value);
      return this;
    }

    /**
     * (Highstock) Additional options for an annotation with the type.
     *
     */
    public Builder typeOptions(@Nullable AnnotationsVerticalLineTypeOptions value) {
      object.setTypeOptions(value);
      return this;
    }
  }
}
