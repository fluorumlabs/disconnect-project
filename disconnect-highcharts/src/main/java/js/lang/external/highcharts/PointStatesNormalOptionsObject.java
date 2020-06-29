package js.lang.external.highcharts;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import javax.annotation.Nullable;
import js.lang.Any;
import js.lang.Unknown /* ( boolean | AnimationOptionsObject ) */;
import org.teavm.jso.JSProperty;

/**
 * (Highcharts, Highstock) The normal state of a single point marker. Currently
 * only used for setting animation when returning to normal state from hover.
 *
 */
@NpmPackage(
    name = "highcharts",
    version = "^8.1.2"
)
@Import(
    module = "highcharts/es-modules/masters/highcharts.src.js"
)
public interface PointStatesNormalOptionsObject extends Any {
  /**
   * (Highcharts, Highstock) Animation when returning to normal state after
   * hovering.
   *
   */
  @JSProperty("animation")
  @Nullable
  Unknown /* ( boolean | AnimationOptionsObject ) */ getAnimation();

  /**
   * (Highcharts, Highstock) Animation when returning to normal state after
   * hovering.
   *
   */
  @JSProperty("animation")
  void setAnimation(boolean value);

  /**
   * (Highcharts, Highstock) Animation when returning to normal state after
   * hovering.
   *
   */
  @JSProperty("animation")
  void setAnimation(@Nullable AnimationOptionsObject value);

  static Builder builder() {
    return new Builder();
  }

  final class Builder {
    private final PointStatesNormalOptionsObject object = Any.empty();

    private Builder() {
    }

    public PointStatesNormalOptionsObject build() {
      return object;
    }

    /**
     * (Highcharts, Highstock) Animation when returning to normal state after
     * hovering.
     *
     */
    public Builder animation(boolean value) {
      object.setAnimation(value);
      return this;
    }

    /**
     * (Highcharts, Highstock) Animation when returning to normal state after
     * hovering.
     *
     */
    public Builder animation(@Nullable AnimationOptionsObject value) {
      object.setAnimation(value);
      return this;
    }
  }
}
