package js.lang.external.highcharts;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import javax.annotation.Nullable;
import js.lang.Any;
import org.teavm.jso.JSProperty;

/**
 * (Highstock) The styles for Chikou line
 *
 */
@NpmPackage(
    name = "highcharts",
    version = "^8.1.2"
)
@Import(
    module = "highcharts/es-modules/masters/highcharts.src.js"
)
public interface PlotIkhChikouLineOptions extends Any {
  @JSProperty("styles")
  @Nullable
  PlotIkhChikouLineStylesOptions getStyles();

  @JSProperty("styles")
  void setStyles(@Nullable PlotIkhChikouLineStylesOptions value);

  static Builder builder() {
    return new Builder();
  }

  final class Builder {
    private final PlotIkhChikouLineOptions object = Any.empty();

    private Builder() {
    }

    public PlotIkhChikouLineOptions build() {
      return object;
    }

    public Builder styles(@Nullable PlotIkhChikouLineStylesOptions value) {
      object.setStyles(value);
      return this;
    }
  }
}
