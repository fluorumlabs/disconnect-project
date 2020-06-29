package js.lang.external.highcharts;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import java.lang.String;
import javax.annotation.Nullable;
import js.lang.Any;
import org.teavm.jso.JSProperty;

/**
 * (Highstock) Styles for the annotation's label.
 *
 */
@NpmPackage(
    name = "highcharts",
    version = "^8.1.2"
)
@Import(
    module = "highcharts/es-modules/masters/highcharts.src.js"
)
public interface AnnotationsFibonacciLabelStyleOptions extends Any {
  @JSProperty("color")
  @Nullable
  String getColor();

  @JSProperty("color")
  void setColor(@Nullable String value);

  static Builder builder() {
    return new Builder();
  }

  final class Builder {
    private final AnnotationsFibonacciLabelStyleOptions object = Any.empty();

    private Builder() {
    }

    public AnnotationsFibonacciLabelStyleOptions build() {
      return object;
    }

    public Builder color(@Nullable String value) {
      object.setColor(value);
      return this;
    }
  }
}
