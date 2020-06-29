package js.lang.external.highcharts;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import javax.annotation.Nullable;
import js.lang.Any;
import org.teavm.jso.JSProperty;

/**
 * (Highstock) Top line options.
 *
 */
@NpmPackage(
    name = "highcharts",
    version = "^8.1.2"
)
@Import(
    module = "highcharts/es-modules/masters/highcharts.src.js"
)
public interface PlotKeltnerchannelsTopLineOptions extends Any {
  /**
   * (Highstock) Styles for a bottom line.
   *
   */
  @JSProperty("styles")
  @Nullable
  PlotKeltnerchannelsTopLineStylesOptions getStyles();

  /**
   * (Highstock) Styles for a bottom line.
   *
   */
  @JSProperty("styles")
  void setStyles(@Nullable PlotKeltnerchannelsTopLineStylesOptions value);

  static Builder builder() {
    return new Builder();
  }

  final class Builder {
    private final PlotKeltnerchannelsTopLineOptions object = Any.empty();

    private Builder() {
    }

    public PlotKeltnerchannelsTopLineOptions build() {
      return object;
    }

    /**
     * (Highstock) Styles for a bottom line.
     *
     */
    public Builder styles(@Nullable PlotKeltnerchannelsTopLineStylesOptions value) {
      object.setStyles(value);
      return this;
    }
  }
}
