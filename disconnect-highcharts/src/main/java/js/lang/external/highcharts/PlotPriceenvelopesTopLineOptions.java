package js.lang.external.highcharts;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import javax.annotation.Nullable;
import js.lang.Any;
import org.teavm.jso.JSProperty;

/**
 * (Highstock) Top line options.
 *
 */
@NpmPackage(
    name = "highcharts",
    version = "^8.1.2"
)
@Import(
    module = "highcharts/es-modules/masters/highcharts.src.js"
)
public interface PlotPriceenvelopesTopLineOptions extends Any {
  @JSProperty("styles")
  @Nullable
  PlotPriceenvelopesTopLineStylesOptions getStyles();

  @JSProperty("styles")
  void setStyles(@Nullable PlotPriceenvelopesTopLineStylesOptions value);

  static Builder builder() {
    return new Builder();
  }

  final class Builder {
    private final PlotPriceenvelopesTopLineOptions object = Any.empty();

    private Builder() {
    }

    public PlotPriceenvelopesTopLineOptions build() {
      return object;
    }

    public Builder styles(@Nullable PlotPriceenvelopesTopLineStylesOptions value) {
      object.setStyles(value);
      return this;
    }
  }
}
