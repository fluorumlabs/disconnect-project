package js.lang.external.highcharts;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import javax.annotation.Nullable;
import js.lang.Any;
import org.teavm.jso.JSProperty;

/**
 * (Highstock) The styles for Senkou Span B line
 *
 */
@NpmPackage(
    name = "highcharts",
    version = "^8.1.2"
)
@Import(
    module = "highcharts/es-modules/masters/highcharts.src.js"
)
public interface PlotIkhSenkouSpanBOptions extends Any {
  @JSProperty("styles")
  @Nullable
  PlotIkhSenkouSpanBStylesOptions getStyles();

  @JSProperty("styles")
  void setStyles(@Nullable PlotIkhSenkouSpanBStylesOptions value);

  static Builder builder() {
    return new Builder();
  }

  final class Builder {
    private final PlotIkhSenkouSpanBOptions object = Any.empty();

    private Builder() {
    }

    public PlotIkhSenkouSpanBOptions build() {
      return object;
    }

    public Builder styles(@Nullable PlotIkhSenkouSpanBStylesOptions value) {
      object.setStyles(value);
      return this;
    }
  }
}
