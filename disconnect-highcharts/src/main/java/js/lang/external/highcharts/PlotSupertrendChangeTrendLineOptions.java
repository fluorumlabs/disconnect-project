package js.lang.external.highcharts;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import javax.annotation.Nullable;
import js.lang.Any;
import org.teavm.jso.JSProperty;

/**
 * (Highstock) The styles for the Supertrend line that intersect main series.
 *
 */
@NpmPackage(
    name = "highcharts",
    version = "^8.1.2"
)
@Import(
    module = "highcharts/es-modules/masters/highcharts.src.js"
)
public interface PlotSupertrendChangeTrendLineOptions extends Any {
  @JSProperty("styles")
  @Nullable
  PlotSupertrendChangeTrendLineStylesOptions getStyles();

  @JSProperty("styles")
  void setStyles(@Nullable PlotSupertrendChangeTrendLineStylesOptions value);

  static Builder builder() {
    return new Builder();
  }

  final class Builder {
    private final PlotSupertrendChangeTrendLineOptions object = Any.empty();

    private Builder() {
    }

    public PlotSupertrendChangeTrendLineOptions build() {
      return object;
    }

    public Builder styles(@Nullable PlotSupertrendChangeTrendLineStylesOptions value) {
      object.setStyles(value);
      return this;
    }
  }
}
