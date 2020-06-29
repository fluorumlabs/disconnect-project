package js.lang.external.highcharts;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import javax.annotation.Nullable;
import js.lang.Any;
import org.teavm.jso.JSProperty;

/**
 * (Highstock) The styles for Kijun line
 *
 */
@NpmPackage(
    name = "highcharts",
    version = "^8.1.2"
)
@Import(
    module = "highcharts/es-modules/masters/highcharts.src.js"
)
public interface PlotIkhKijunLineOptions extends Any {
  @JSProperty("styles")
  @Nullable
  PlotIkhKijunLineStylesOptions getStyles();

  @JSProperty("styles")
  void setStyles(@Nullable PlotIkhKijunLineStylesOptions value);

  static Builder builder() {
    return new Builder();
  }

  final class Builder {
    private final PlotIkhKijunLineOptions object = Any.empty();

    private Builder() {
    }

    public PlotIkhKijunLineOptions build() {
      return object;
    }

    public Builder styles(@Nullable PlotIkhKijunLineStylesOptions value) {
      object.setStyles(value);
      return this;
    }
  }
}
