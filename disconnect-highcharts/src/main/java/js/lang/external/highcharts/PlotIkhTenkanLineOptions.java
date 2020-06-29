package js.lang.external.highcharts;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import javax.annotation.Nullable;
import js.lang.Any;
import org.teavm.jso.JSProperty;

/**
 * (Highstock) The styles for Tenkan line
 *
 */
@NpmPackage(
    name = "highcharts",
    version = "^8.1.2"
)
@Import(
    module = "highcharts/es-modules/masters/highcharts.src.js"
)
public interface PlotIkhTenkanLineOptions extends Any {
  @JSProperty("styles")
  @Nullable
  PlotIkhTenkanLineStylesOptions getStyles();

  @JSProperty("styles")
  void setStyles(@Nullable PlotIkhTenkanLineStylesOptions value);

  static Builder builder() {
    return new Builder();
  }

  final class Builder {
    private final PlotIkhTenkanLineOptions object = Any.empty();

    private Builder() {
    }

    public PlotIkhTenkanLineOptions build() {
      return object;
    }

    public Builder styles(@Nullable PlotIkhTenkanLineStylesOptions value) {
      object.setStyles(value);
      return this;
    }
  }
}
