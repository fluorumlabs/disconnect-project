package js.lang.external.highcharts;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import javax.annotation.Nullable;
import js.lang.Any;
import org.teavm.jso.JSProperty;

/**
 * Gradient options instead of a solid color.
 *
 */
@NpmPackage(
    name = "highcharts",
    version = "^8.1.0"
)
@Import(
    module = "highcharts/es-modules/masters/highcharts.src.js"
)
public interface GradientColorObject extends Any {
  /**
   * Holds an object that defines the start position and the end position
   * relative to the shape.
   *
   */
  @JSProperty("linearGradient")
  @Nullable
  LinearGradientColorObject getLinearGradient();

  /**
   * Holds an object that defines the start position and the end position
   * relative to the shape.
   *
   */
  @JSProperty("linearGradient")
  void setLinearGradient(@Nullable LinearGradientColorObject value);

  /**
   * Holds an object that defines the center position and the radius.
   *
   */
  @JSProperty("radialGradient")
  @Nullable
  RadialGradientColorObject getRadialGradient();

  /**
   * Holds an object that defines the center position and the radius.
   *
   */
  @JSProperty("radialGradient")
  void setRadialGradient(@Nullable RadialGradientColorObject value);

  /**
   * The first item in each tuple is the position in the gradient, where 0 is
   * the start of the gradient and 1 is the end of the gradient. Multiple
   * stops can be applied. The second item is the color for each stop. This
   * color can also be given in the rgba format.
   *
   */
  @JSProperty("stops")
  GradientColorStopObject[] getStops();

  /**
   * The first item in each tuple is the position in the gradient, where 0 is
   * the start of the gradient and 1 is the end of the gradient. Multiple
   * stops can be applied. The second item is the color for each stop. This
   * color can also be given in the rgba format.
   *
   */
  @JSProperty("stops")
  void setStops(GradientColorStopObject[] value);

  class Builder {
    private final GradientColorObject object = Any.empty();

    public GradientColorObject build() {
      return object;
    }

    /**
     * Holds an object that defines the start position and the end position
     * relative to the shape.
     *
     */
    public Builder linearGradient(@Nullable LinearGradientColorObject value) {
      object.setLinearGradient(value);
      return this;
    }

    /**
     * Holds an object that defines the center position and the radius.
     *
     */
    public Builder radialGradient(@Nullable RadialGradientColorObject value) {
      object.setRadialGradient(value);
      return this;
    }

    /**
     * The first item in each tuple is the position in the gradient, where 0 is
     * the start of the gradient and 1 is the end of the gradient. Multiple
     * stops can be applied. The second item is the color for each stop. This
     * color can also be given in the rgba format.
     *
     */
    public Builder stops(GradientColorStopObject[] value) {
      object.setStops(value);
      return this;
    }
  }
}
