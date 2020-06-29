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
public interface GlobalOptions extends Any {
  /**
   * (Highcharts, Highstock, Highmaps, Gantt) Path to the pattern image
   * required by VML browsers in order to draw radial gradients.
   *
   */
  @JSProperty("VMLRadialGradientURL")
  @Nullable
  String getVMLRadialGradientURL();

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) Path to the pattern image
   * required by VML browsers in order to draw radial gradients.
   *
   */
  @JSProperty("VMLRadialGradientURL")
  void setVMLRadialGradientURL(@Nullable String value);

  static Builder builder() {
    return new Builder();
  }

  final class Builder {
    private final GlobalOptions object = Any.empty();

    private Builder() {
    }

    public GlobalOptions build() {
      return object;
    }

    /**
     * (Highcharts, Highstock, Highmaps, Gantt) Path to the pattern image
     * required by VML browsers in order to draw radial gradients.
     *
     */
    public Builder VMLRadialGradientURL(@Nullable String value) {
      object.setVMLRadialGradientURL(value);
      return this;
    }
  }
}
