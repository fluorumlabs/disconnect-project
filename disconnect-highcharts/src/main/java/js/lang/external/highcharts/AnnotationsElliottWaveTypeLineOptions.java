package js.lang.external.highcharts;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import java.lang.String;
import javax.annotation.Nullable;
import js.lang.Any;
import org.teavm.jso.JSProperty;

/**
 * (Highstock) Line options.
 *
 */
@NpmPackage(
    name = "highcharts",
    version = "^8.1.0"
)
@Import(
    module = "highcharts/es-modules/masters/highcharts.src.js"
)
public interface AnnotationsElliottWaveTypeLineOptions extends Any {
  @JSProperty("fill")
  @Nullable
  String getFill();

  @JSProperty("fill")
  void setFill(@Nullable String value);

  @JSProperty("strokeWidth")
  double getStrokeWidth();

  @JSProperty("strokeWidth")
  void setStrokeWidth(double value);

  class Builder {
    private final AnnotationsElliottWaveTypeLineOptions object = Any.empty();

    public AnnotationsElliottWaveTypeLineOptions build() {
      return object;
    }

    public Builder fill(@Nullable String value) {
      object.setFill(value);
      return this;
    }

    public Builder strokeWidth(double value) {
      object.setStrokeWidth(value);
      return this;
    }
  }
}