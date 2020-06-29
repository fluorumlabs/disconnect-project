package js.lang.external.highcharts;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import javax.annotation.Nullable;
import js.lang.Any;
import js.lang.Unknown /* ( boolean | AnimationOptionsObject ) */;
import org.teavm.jso.JSProperty;

/**
 * (Highcharts) The opposite state of a hover for a single point node. Applied
 * to all not connected nodes to the hovered one.
 *
 */
@NpmPackage(
    name = "highcharts",
    version = "^8.1.2"
)
@Import(
    module = "highcharts/es-modules/masters/highcharts.src.js"
)
public interface PointStatesInactiveOptionsObject extends Any {
  /**
   * (Highcharts) Animation when not hovering over the node.
   *
   */
  @JSProperty("animation")
  @Nullable
  Unknown /* ( boolean | AnimationOptionsObject ) */ getAnimation();

  /**
   * (Highcharts) Animation when not hovering over the node.
   *
   */
  @JSProperty("animation")
  void setAnimation(boolean value);

  /**
   * (Highcharts) Animation when not hovering over the node.
   *
   */
  @JSProperty("animation")
  void setAnimation(@Nullable AnimationOptionsObject value);

  /**
   * (Highcharts) Opacity of inactive markers.
   *
   */
  @JSProperty("opacity")
  double getOpacity();

  /**
   * (Highcharts) Opacity of inactive markers.
   *
   */
  @JSProperty("opacity")
  void setOpacity(double value);

  static Builder builder() {
    return new Builder();
  }

  final class Builder {
    private final PointStatesInactiveOptionsObject object = Any.empty();

    private Builder() {
    }

    public PointStatesInactiveOptionsObject build() {
      return object;
    }

    /**
     * (Highcharts) Animation when not hovering over the node.
     *
     */
    public Builder animation(boolean value) {
      object.setAnimation(value);
      return this;
    }

    /**
     * (Highcharts) Animation when not hovering over the node.
     *
     */
    public Builder animation(@Nullable AnimationOptionsObject value) {
      object.setAnimation(value);
      return this;
    }

    /**
     * (Highcharts) Opacity of inactive markers.
     *
     */
    public Builder opacity(double value) {
      object.setOpacity(value);
      return this;
    }
  }
}
