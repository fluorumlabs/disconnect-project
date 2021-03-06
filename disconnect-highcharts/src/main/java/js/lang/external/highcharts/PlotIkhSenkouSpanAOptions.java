package js.lang.external.highcharts;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import javax.annotation.Nullable;
import js.lang.Any;
import org.teavm.jso.JSProperty;

/**
 * (Highstock) The styles for Senkou Span A line
 *
 */
@NpmPackage(
    name = "highcharts",
    version = "^8.1.2"
)
@Import(
    module = "highcharts/es-modules/masters/highcharts.src.js"
)
public interface PlotIkhSenkouSpanAOptions extends Any {
  @JSProperty("styles")
  @Nullable
  PlotIkhSenkouSpanAStylesOptions getStyles();

  @JSProperty("styles")
  void setStyles(@Nullable PlotIkhSenkouSpanAStylesOptions value);

  static Builder builder() {
    return new Builder();
  }

  final class Builder {
    private final PlotIkhSenkouSpanAOptions object = Any.empty();

    private Builder() {
    }

    public PlotIkhSenkouSpanAOptions build() {
      return object;
    }

    public Builder styles(@Nullable PlotIkhSenkouSpanAStylesOptions value) {
      object.setStyles(value);
      return this;
    }
  }
}
