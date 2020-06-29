package js.lang.external.highcharts;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import javax.annotation.Nullable;
import js.lang.Any;
import org.teavm.jso.JSProperty;

/**
 * (Highstock) A measure annotation.
 *
 */
@NpmPackage(
    name = "highcharts",
    version = "^8.1.2"
)
@Import(
    module = "highcharts/es-modules/masters/highcharts.src.js"
)
public interface AnnotationsMeasureOptions extends Any {
  @JSProperty("controlPointOptions")
  @Nullable
  AnnotationsMeasureControlPointOptions getControlPointOptions();

  @JSProperty("controlPointOptions")
  void setControlPointOptions(@Nullable AnnotationsMeasureControlPointOptions value);

  /**
   * (Highstock) Additional options for an annotation with the type.
   *
   */
  @JSProperty("typeOptions")
  @Nullable
  AnnotationsMeasureTypeOptions getTypeOptions();

  /**
   * (Highstock) Additional options for an annotation with the type.
   *
   */
  @JSProperty("typeOptions")
  void setTypeOptions(@Nullable AnnotationsMeasureTypeOptions value);

  static Builder builder() {
    return new Builder();
  }

  final class Builder {
    private final AnnotationsMeasureOptions object = Any.empty();

    private Builder() {
    }

    public AnnotationsMeasureOptions build() {
      return object;
    }

    public Builder controlPointOptions(@Nullable AnnotationsMeasureControlPointOptions value) {
      object.setControlPointOptions(value);
      return this;
    }

    /**
     * (Highstock) Additional options for an annotation with the type.
     *
     */
    public Builder typeOptions(@Nullable AnnotationsMeasureTypeOptions value) {
      object.setTypeOptions(value);
      return this;
    }
  }
}
