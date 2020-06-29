package js.lang.external.highcharts;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import javax.annotation.Nullable;
import js.lang.Any;
import js.lang.Unknown /* ( boolean | AnimationOptionsObject ) */;
import org.teavm.jso.JSProperty;

/**
 * (Highstock) The opposite state of a hover for series.
 *
 */
@NpmPackage(
    name = "highcharts",
    version = "^8.1.2"
)
@Import(
    module = "highcharts/es-modules/masters/highcharts.src.js"
)
public interface SeriesStatesInactiveOptionsObject extends Any {
  /**
   * (Highstock) The animation for entering the inactive state.
   *
   */
  @JSProperty("animation")
  @Nullable
  Unknown /* ( boolean | AnimationOptionsObject ) */ getAnimation();

  /**
   * (Highstock) The animation for entering the inactive state.
   *
   */
  @JSProperty("animation")
  void setAnimation(boolean value);

  /**
   * (Highstock) The animation for entering the inactive state.
   *
   */
  @JSProperty("animation")
  void setAnimation(@Nullable AnimationOptionsObject value);

  /**
   * (Highstock) Enable or disable the inactive state for a series
   *
   */
  @JSProperty("enabled")
  boolean getEnabled();

  /**
   * (Highstock) Enable or disable the inactive state for a series
   *
   */
  @JSProperty("enabled")
  void setEnabled(boolean value);

  /**
   * (Highcharts) Opacity for the links between nodes in the sankey diagram in
   * inactive mode.
   *
   */
  @JSProperty("linkOpacity")
  double getLinkOpacity();

  /**
   * (Highcharts) Opacity for the links between nodes in the sankey diagram in
   * inactive mode.
   *
   */
  @JSProperty("linkOpacity")
  void setLinkOpacity(double value);

  /**
   * (Highstock) Opacity of series elements (dataLabels, line, area).
   *
   */
  @JSProperty("opacity")
  double getOpacity();

  /**
   * (Highstock) Opacity of series elements (dataLabels, line, area).
   *
   */
  @JSProperty("opacity")
  void setOpacity(double value);

  static Builder builder() {
    return new Builder();
  }

  final class Builder {
    private final SeriesStatesInactiveOptionsObject object = Any.empty();

    private Builder() {
    }

    public SeriesStatesInactiveOptionsObject build() {
      return object;
    }

    /**
     * (Highstock) The animation for entering the inactive state.
     *
     */
    public Builder animation(boolean value) {
      object.setAnimation(value);
      return this;
    }

    /**
     * (Highstock) The animation for entering the inactive state.
     *
     */
    public Builder animation(@Nullable AnimationOptionsObject value) {
      object.setAnimation(value);
      return this;
    }

    /**
     * (Highstock) Enable or disable the inactive state for a series
     *
     */
    public Builder enabled(boolean value) {
      object.setEnabled(value);
      return this;
    }

    /**
     * (Highcharts) Opacity for the links between nodes in the sankey diagram in
     * inactive mode.
     *
     */
    public Builder linkOpacity(double value) {
      object.setLinkOpacity(value);
      return this;
    }

    /**
     * (Highstock) Opacity of series elements (dataLabels, line, area).
     *
     */
    public Builder opacity(double value) {
      object.setOpacity(value);
      return this;
    }
  }
}
