package js.lang.external.highcharts;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import javax.annotation.Nullable;
import js.lang.Any;
import org.teavm.jso.JSProperty;

/**
 * (Highstock) An elliott wave annotation.
 *
 */
@NpmPackage(
    name = "highcharts",
    version = "^8.1.0"
)
@Import(
    module = "highcharts/es-modules/masters/highcharts.src.js"
)
public interface AnnotationsElliottWaveOptions extends Any {
  @JSProperty("controlPointOptions")
  @Nullable
  AnnotationsElliottWaveControlPointOptions getControlPointOptions();

  @JSProperty("controlPointOptions")
  void setControlPointOptions(@Nullable AnnotationsElliottWaveControlPointOptions value);

  /**
   * (Highstock) Options for annotation's labels. Each label inherits options
   * from the labelOptions object. An option from the labelOptions can be
   * overwritten by config for a specific label.
   *
   */
  @JSProperty("labelOptions")
  @Nullable
  AnnotationsElliottWaveLabelOptions getLabelOptions();

  /**
   * (Highstock) Options for annotation's labels. Each label inherits options
   * from the labelOptions object. An option from the labelOptions can be
   * overwritten by config for a specific label.
   *
   */
  @JSProperty("labelOptions")
  void setLabelOptions(@Nullable AnnotationsElliottWaveLabelOptions value);

  /**
   * (Highstock) Options for annotation's shapes. Each shape inherits options
   * from the shapeOptions object. An option from the shapeOptions can be
   * overwritten by config for a specific shape.
   *
   */
  @JSProperty("shapeOptions")
  @Nullable
  AnnotationsElliottWaveShapeOptions getShapeOptions();

  /**
   * (Highstock) Options for annotation's shapes. Each shape inherits options
   * from the shapeOptions object. An option from the shapeOptions can be
   * overwritten by config for a specific shape.
   *
   */
  @JSProperty("shapeOptions")
  void setShapeOptions(@Nullable AnnotationsElliottWaveShapeOptions value);

  /**
   * (Highstock) Additional options for an annotation with the type.
   *
   */
  @JSProperty("typeOptions")
  @Nullable
  AnnotationsElliottWaveTypeOptions getTypeOptions();

  /**
   * (Highstock) Additional options for an annotation with the type.
   *
   */
  @JSProperty("typeOptions")
  void setTypeOptions(@Nullable AnnotationsElliottWaveTypeOptions value);

  class Builder {
    private final AnnotationsElliottWaveOptions object = Any.empty();

    public AnnotationsElliottWaveOptions build() {
      return object;
    }

    public Builder controlPointOptions(@Nullable AnnotationsElliottWaveControlPointOptions value) {
      object.setControlPointOptions(value);
      return this;
    }

    /**
     * (Highstock) Options for annotation's labels. Each label inherits options
     * from the labelOptions object. An option from the labelOptions can be
     * overwritten by config for a specific label.
     *
     */
    public Builder labelOptions(@Nullable AnnotationsElliottWaveLabelOptions value) {
      object.setLabelOptions(value);
      return this;
    }

    /**
     * (Highstock) Options for annotation's shapes. Each shape inherits options
     * from the shapeOptions object. An option from the shapeOptions can be
     * overwritten by config for a specific shape.
     *
     */
    public Builder shapeOptions(@Nullable AnnotationsElliottWaveShapeOptions value) {
      object.setShapeOptions(value);
      return this;
    }

    /**
     * (Highstock) Additional options for an annotation with the type.
     *
     */
    public Builder typeOptions(@Nullable AnnotationsElliottWaveTypeOptions value) {
      object.setTypeOptions(value);
      return this;
    }
  }
}
