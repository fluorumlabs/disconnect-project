package js.lang.external.highcharts;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import java.lang.String;
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
public interface PlotVbpVolumeDivisionStylesOptions extends Any {
  /**
   * (Highstock) Color of negative volume bars.
   *
   */
  @JSProperty("negativeColor")
  @Nullable
  String getNegativeColor();

  /**
   * (Highstock) Color of negative volume bars.
   *
   */
  @JSProperty("negativeColor")
  void setNegativeColor(@Nullable String value);

  /**
   * (Highstock) Color of positive volume bars.
   *
   */
  @JSProperty("positiveColor")
  @Nullable
  String getPositiveColor();

  /**
   * (Highstock) Color of positive volume bars.
   *
   */
  @JSProperty("positiveColor")
  void setPositiveColor(@Nullable String value);

  static Builder builder() {
    return new Builder();
  }

  final class Builder {
    private final PlotVbpVolumeDivisionStylesOptions object = Any.empty();

    private Builder() {
    }

    public PlotVbpVolumeDivisionStylesOptions build() {
      return object;
    }

    /**
     * (Highstock) Color of negative volume bars.
     *
     */
    public Builder negativeColor(@Nullable String value) {
      object.setNegativeColor(value);
      return this;
    }

    /**
     * (Highstock) Color of positive volume bars.
     *
     */
    public Builder positiveColor(@Nullable String value) {
      object.setPositiveColor(value);
      return this;
    }
  }
}
