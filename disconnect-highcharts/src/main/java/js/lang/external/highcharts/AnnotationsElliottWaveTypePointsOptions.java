package js.lang.external.highcharts;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import javax.annotation.Nullable;
import js.lang.Any;
import org.teavm.jso.JSProperty;

@NpmPackage(
    name = "highcharts",
    version = "^8.1.2"
)
@Import(
    module = "highcharts/es-modules/masters/highcharts.src.js"
)
public interface AnnotationsElliottWaveTypePointsOptions extends Any {
  @JSProperty("controlPoint")
  double getControlPoint();

  @JSProperty("controlPoint")
  void setControlPoint(double value);

  /**
   * (Highstock) Options for annotation's labels. Each label inherits options
   * from the labelOptions object. An option from the labelOptions can be
   * overwritten by config for a specific label.
   *
   */
  @JSProperty("label")
  @Nullable
  AnnotationsElliottWaveTypePointsLabelOptions getLabel();

  /**
   * (Highstock) Options for annotation's labels. Each label inherits options
   * from the labelOptions object. An option from the labelOptions can be
   * overwritten by config for a specific label.
   *
   */
  @JSProperty("label")
  void setLabel(@Nullable AnnotationsElliottWaveTypePointsLabelOptions value);

  /**
   * (Highstock) The x position of the point.
   *
   */
  @JSProperty("x")
  double getX();

  /**
   * (Highstock) The x position of the point.
   *
   */
  @JSProperty("x")
  void setX(double value);

  /**
   * (Highstock) The y position of the point.
   *
   */
  @JSProperty("y")
  double getY();

  /**
   * (Highstock) The y position of the point.
   *
   */
  @JSProperty("y")
  void setY(double value);

  static Builder builder() {
    return new Builder();
  }

  final class Builder {
    private final AnnotationsElliottWaveTypePointsOptions object = Any.empty();

    private Builder() {
    }

    public AnnotationsElliottWaveTypePointsOptions build() {
      return object;
    }

    public Builder controlPoint(double value) {
      object.setControlPoint(value);
      return this;
    }

    /**
     * (Highstock) Options for annotation's labels. Each label inherits options
     * from the labelOptions object. An option from the labelOptions can be
     * overwritten by config for a specific label.
     *
     */
    public Builder label(@Nullable AnnotationsElliottWaveTypePointsLabelOptions value) {
      object.setLabel(value);
      return this;
    }

    /**
     * (Highstock) The x position of the point.
     *
     */
    public Builder x(double value) {
      object.setX(value);
      return this;
    }

    /**
     * (Highstock) The y position of the point.
     *
     */
    public Builder y(double value) {
      object.setY(value);
      return this;
    }
  }
}
