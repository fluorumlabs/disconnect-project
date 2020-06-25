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
public interface PlotPcTopLineOptions extends Any {
  @JSProperty("styles")
  @Nullable
  PlotPcTopLineStylesOptions getStyles();

  @JSProperty("styles")
  void setStyles(@Nullable PlotPcTopLineStylesOptions value);

  class Builder {
    private final PlotPcTopLineOptions object = Any.empty();

    public PlotPcTopLineOptions build() {
      return object;
    }

    public Builder styles(@Nullable PlotPcTopLineStylesOptions value) {
      object.setStyles(value);
      return this;
    }
  }
}
