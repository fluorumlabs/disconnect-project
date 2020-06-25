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
    version = "^8.1.0"
)
@Import(
    module = "highcharts/es-modules/masters/highcharts.src.js"
)
public interface PlotStochasticSmoothedLineOptions extends Any {
  /**
   * (Highstock) Styles for a smoothed line.
   *
   */
  @JSProperty("styles")
  @Nullable
  PlotStochasticSmoothedLineStylesOptions getStyles();

  /**
   * (Highstock) Styles for a smoothed line.
   *
   */
  @JSProperty("styles")
  void setStyles(@Nullable PlotStochasticSmoothedLineStylesOptions value);

  class Builder {
    private final PlotStochasticSmoothedLineOptions object = Any.empty();

    public PlotStochasticSmoothedLineOptions build() {
      return object;
    }

    /**
     * (Highstock) Styles for a smoothed line.
     *
     */
    public Builder styles(@Nullable PlotStochasticSmoothedLineStylesOptions value) {
      object.setStyles(value);
      return this;
    }
  }
}
