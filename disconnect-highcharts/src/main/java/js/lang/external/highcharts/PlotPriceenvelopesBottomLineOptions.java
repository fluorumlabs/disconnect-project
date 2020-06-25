package js.lang.external.highcharts;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import javax.annotation.Nullable;
import js.lang.Any;
import org.teavm.jso.JSProperty;

/**
 * (Highstock) Bottom line options.
 *
 */
@NpmPackage(
    name = "highcharts",
    version = "^8.1.0"
)
@Import(
    module = "highcharts/es-modules/masters/highcharts.src.js"
)
public interface PlotPriceenvelopesBottomLineOptions extends Any {
  @JSProperty("styles")
  @Nullable
  PlotPriceenvelopesBottomLineStylesOptions getStyles();

  @JSProperty("styles")
  void setStyles(@Nullable PlotPriceenvelopesBottomLineStylesOptions value);

  class Builder {
    private final PlotPriceenvelopesBottomLineOptions object = Any.empty();

    public PlotPriceenvelopesBottomLineOptions build() {
      return object;
    }

    public Builder styles(@Nullable PlotPriceenvelopesBottomLineStylesOptions value) {
      object.setStyles(value);
      return this;
    }
  }
}
