package js.lang.external.highcharts;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import javax.annotation.Nullable;
import js.lang.Any;
import org.teavm.jso.JSProperty;

@NpmPackage(
    name = "highcharts",
    version = "^8.1.2"
)
@Import(
    module = "highcharts/es-modules/masters/highcharts.src.js"
)
public interface PlotAbandsTopLineOptions extends Any {
  @JSProperty("styles")
  @Nullable
  PlotAbandsTopLineStylesOptions getStyles();

  @JSProperty("styles")
  void setStyles(@Nullable PlotAbandsTopLineStylesOptions value);

  static Builder builder() {
    return new Builder();
  }

  final class Builder {
    private final PlotAbandsTopLineOptions object = Any.empty();

    private Builder() {
    }

    public PlotAbandsTopLineOptions build() {
      return object;
    }

    public Builder styles(@Nullable PlotAbandsTopLineStylesOptions value) {
      object.setStyles(value);
      return this;
    }
  }
}
