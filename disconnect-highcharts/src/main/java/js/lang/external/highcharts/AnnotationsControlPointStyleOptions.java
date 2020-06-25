package js.lang.external.highcharts;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import java.lang.String;
import javax.annotation.Nullable;
import js.lang.Any;
import org.teavm.jso.JSBody;
import org.teavm.jso.JSProperty;

@NpmPackage(
    name = "highcharts",
    version = "^8.1.0"
)
@Import(
    module = "highcharts/es-modules/masters/highcharts.src.js"
)
public interface AnnotationsControlPointStyleOptions extends Any {
  @JSProperty("fill")
  @Nullable
  String getFill();

  @JSProperty("fill")
  void setFill(@Nullable String value);

  @JSProperty("stroke")
  @Nullable
  String getStroke();

  @JSProperty("stroke")
  void setStroke(@Nullable String value);

  @JSBody(
      script = "return this['stroke-width']"
  )
  double getStrokeWidth();

  @JSBody(
      params = "value",
      script = "this['stroke-width'] = value"
  )
  void setStrokeWidth(double value);

  class Builder {
    private final AnnotationsControlPointStyleOptions object = Any.empty();

    public AnnotationsControlPointStyleOptions build() {
      return object;
    }

    public Builder fill(@Nullable String value) {
      object.setFill(value);
      return this;
    }

    public Builder stroke(@Nullable String value) {
      object.setStroke(value);
      return this;
    }

    public Builder strokeWidth(double value) {
      object.setStrokeWidth(value);
      return this;
    }
  }
}
