package js.lang.external.highcharts;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import javax.annotation.Nullable;
import js.lang.Any;
import org.teavm.jso.JSProperty;

/**
 * (Highstock) The styles for bars when volume is divided into
 * positive/negative.
 *
 */
@NpmPackage(
    name = "highcharts",
    version = "^8.1.2"
)
@Import(
    module = "highcharts/es-modules/masters/highcharts.src.js"
)
public interface PlotVbpVolumeDivisionOptions extends Any {
  /**
   * (Highstock) Option to control if volume is divided.
   *
   */
  @JSProperty("enabled")
  boolean getEnabled();

  /**
   * (Highstock) Option to control if volume is divided.
   *
   */
  @JSProperty("enabled")
  void setEnabled(boolean value);

  @JSProperty("styles")
  @Nullable
  PlotVbpVolumeDivisionStylesOptions getStyles();

  @JSProperty("styles")
  void setStyles(@Nullable PlotVbpVolumeDivisionStylesOptions value);

  static Builder builder() {
    return new Builder();
  }

  final class Builder {
    private final PlotVbpVolumeDivisionOptions object = Any.empty();

    private Builder() {
    }

    public PlotVbpVolumeDivisionOptions build() {
      return object;
    }

    /**
     * (Highstock) Option to control if volume is divided.
     *
     */
    public Builder enabled(boolean value) {
      object.setEnabled(value);
      return this;
    }

    public Builder styles(@Nullable PlotVbpVolumeDivisionStylesOptions value) {
      object.setStyles(value);
      return this;
    }
  }
}
