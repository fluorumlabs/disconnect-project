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
public interface PlotAbandsBottomLineOptions extends Any {
  @JSProperty("styles")
  @Nullable
  PlotAbandsBottomLineStylesOptions getStyles();

  @JSProperty("styles")
  void setStyles(@Nullable PlotAbandsBottomLineStylesOptions value);

  static Builder builder() {
    return new Builder();
  }

  final class Builder {
    private final PlotAbandsBottomLineOptions object = Any.empty();

    private Builder() {
    }

    public PlotAbandsBottomLineOptions build() {
      return object;
    }

    public Builder styles(@Nullable PlotAbandsBottomLineStylesOptions value) {
      object.setStyles(value);
      return this;
    }
  }
}
