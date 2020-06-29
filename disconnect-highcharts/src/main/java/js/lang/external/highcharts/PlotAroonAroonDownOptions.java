package js.lang.external.highcharts;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import javax.annotation.Nullable;
import js.lang.Any;
import org.teavm.jso.JSProperty;

/**
 * (Highstock) aroonDown line options.
 *
 */
@NpmPackage(
    name = "highcharts",
    version = "^8.1.2"
)
@Import(
    module = "highcharts/es-modules/masters/highcharts.src.js"
)
public interface PlotAroonAroonDownOptions extends Any {
  /**
   * (Highstock) Styles for an aroonDown line.
   *
   */
  @JSProperty("styles")
  @Nullable
  PlotAroonAroonDownStylesOptions getStyles();

  /**
   * (Highstock) Styles for an aroonDown line.
   *
   */
  @JSProperty("styles")
  void setStyles(@Nullable PlotAroonAroonDownStylesOptions value);

  static Builder builder() {
    return new Builder();
  }

  final class Builder {
    private final PlotAroonAroonDownOptions object = Any.empty();

    private Builder() {
    }

    public PlotAroonAroonDownOptions build() {
      return object;
    }

    /**
     * (Highstock) Styles for an aroonDown line.
     *
     */
    public Builder styles(@Nullable PlotAroonAroonDownStylesOptions value) {
      object.setStyles(value);
      return this;
    }
  }
}
