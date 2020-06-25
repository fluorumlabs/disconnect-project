package js.lang.external.highcharts;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import javax.annotation.Nullable;
import js.lang.Any;
import org.teavm.jso.JSProperty;

@NpmPackage(
    name = "highcharts",
    version = "^8.1.0"
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

  class Builder {
    private final PlotAbandsBottomLineOptions object = Any.empty();

    public PlotAbandsBottomLineOptions build() {
      return object;
    }

    public Builder styles(@Nullable PlotAbandsBottomLineStylesOptions value) {
      object.setStyles(value);
      return this;
    }
  }
}
