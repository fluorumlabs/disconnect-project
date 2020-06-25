package js.lang.external.highcharts;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import java.lang.String;
import javax.annotation.Nullable;
import js.lang.Any;
import org.teavm.jso.JSBody;

@NpmPackage(
    name = "highcharts",
    version = "^8.1.0"
)
@Import(
    module = "highcharts/es-modules/masters/highcharts.src.js"
)
public interface Units2 extends Any {
  @JSBody(
      script = "return this[0]"
  )
  String getValue0();

  @JSBody(
      params = "value",
      script = "this[0] = value"
  )
  void setValue0(String value);

  @JSBody(
      script = "return this[1]"
  )
  @Nullable
  double[] getValue1();

  @JSBody(
      params = "value",
      script = "this[1] = value"
  )
  void setValue1(double[] value);

  class Builder {
    private final Units2 object = Any.empty();

    public Units2 build() {
      return object;
    }

    public Units2.Builder value0(String value) {
      object.setValue0(value);
      return this;
    }

    public Units2.Builder value1(double[] value) {
      object.setValue1(value);
      return this;
    }
  }
}
