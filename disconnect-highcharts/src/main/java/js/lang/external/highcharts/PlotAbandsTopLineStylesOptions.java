package js.lang.external.highcharts;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import js.lang.Any;
import org.teavm.jso.JSProperty;

@NpmPackage(
    name = "highcharts",
    version = "^8.1.2"
)
@Import(
    module = "highcharts/es-modules/masters/highcharts.src.js"
)
public interface PlotAbandsTopLineStylesOptions extends Any {
  /**
   * (Highstock) Pixel width of the line.
   *
   */
  @JSProperty("lineWidth")
  double getLineWidth();

  /**
   * (Highstock) Pixel width of the line.
   *
   */
  @JSProperty("lineWidth")
  void setLineWidth(double value);

  static Builder builder() {
    return new Builder();
  }

  final class Builder {
    private final PlotAbandsTopLineStylesOptions object = Any.empty();

    private Builder() {
    }

    public PlotAbandsTopLineStylesOptions build() {
      return object;
    }

    /**
     * (Highstock) Pixel width of the line.
     *
     */
    public Builder lineWidth(double value) {
      object.setLineWidth(value);
      return this;
    }
  }
}
