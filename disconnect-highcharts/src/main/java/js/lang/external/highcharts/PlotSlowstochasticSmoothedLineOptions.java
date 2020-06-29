package js.lang.external.highcharts;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import javax.annotation.Nullable;
import js.lang.Any;
import org.teavm.jso.JSProperty;

/**
 * (Highstock) Smoothed line options.
 *
 */
@NpmPackage(
    name = "highcharts",
    version = "^8.1.2"
)
@Import(
    module = "highcharts/es-modules/masters/highcharts.src.js"
)
public interface PlotSlowstochasticSmoothedLineOptions extends Any {
  /**
   * (Highstock) Styles for a smoothed line.
   *
   */
  @JSProperty("styles")
  @Nullable
  PlotSlowstochasticSmoothedLineStylesOptions getStyles();

  /**
   * (Highstock) Styles for a smoothed line.
   *
   */
  @JSProperty("styles")
  void setStyles(@Nullable PlotSlowstochasticSmoothedLineStylesOptions value);

  static Builder builder() {
    return new Builder();
  }

  final class Builder {
    private final PlotSlowstochasticSmoothedLineOptions object = Any.empty();

    private Builder() {
    }

    public PlotSlowstochasticSmoothedLineOptions build() {
      return object;
    }

    /**
     * (Highstock) Styles for a smoothed line.
     *
     */
    public Builder styles(@Nullable PlotSlowstochasticSmoothedLineStylesOptions value) {
      object.setStyles(value);
      return this;
    }
  }
}
