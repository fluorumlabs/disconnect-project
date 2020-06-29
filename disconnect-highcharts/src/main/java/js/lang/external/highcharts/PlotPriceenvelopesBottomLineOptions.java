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
    version = "^8.1.2"
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

  static Builder builder() {
    return new Builder();
  }

  final class Builder {
    private final PlotPriceenvelopesBottomLineOptions object = Any.empty();

    private Builder() {
    }

    public PlotPriceenvelopesBottomLineOptions build() {
      return object;
    }

    public Builder styles(@Nullable PlotPriceenvelopesBottomLineStylesOptions value) {
      object.setStyles(value);
      return this;
    }
  }
}
