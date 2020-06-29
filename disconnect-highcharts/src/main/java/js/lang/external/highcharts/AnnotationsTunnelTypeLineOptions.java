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
    version = "^8.1.2"
)
@Import(
    module = "highcharts/es-modules/masters/highcharts.src.js"
)
public interface AnnotationsTunnelTypeLineOptions extends Any {
  @JSProperty("fill")
  @Nullable
  String getFill();

  @JSProperty("fill")
  void setFill(@Nullable String value);

  @JSProperty("strokeWidth")
  double getStrokeWidth();

  @JSProperty("strokeWidth")
  void setStrokeWidth(double value);

  static Builder builder() {
    return new Builder();
  }

  final class Builder {
    private final AnnotationsTunnelTypeLineOptions object = Any.empty();

    private Builder() {
    }

    public AnnotationsTunnelTypeLineOptions build() {
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
