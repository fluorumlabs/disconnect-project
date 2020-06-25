package js.lang.external.highcharts;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import java.lang.String;
import js.lang.Any;
import org.teavm.jso.JSBody;

/**
 * Color stop tuple.
 *
 */
@NpmPackage(
    name = "highcharts",
    version = "^8.1.0"
)
@Import(
    module = "highcharts/es-modules/masters/highcharts.src.js"
)
public interface GradientColorStopObject extends Any {
  @JSBody(
      script = "return this[0]"
  )
  double getValue0();

  @JSBody(
      params = "value",
      script = "this[0] = value"
  )
  void setValue0(double value);

  @JSBody(
      script = "return this[1]"
  )
  String getValue1();

  @JSBody(
      params = "value",
      script = "this[1] = value"
  )
  void setValue1(String value);

  class Builder {
    private final GradientColorStopObject object = Any.empty();

    public GradientColorStopObject build() {
      return object;
    }

    public Builder value0(double value) {
      object.setValue0(value);
      return this;
    }

    public Builder value1(String value) {
      object.setValue1(value);
      return this;
    }
  }
}
