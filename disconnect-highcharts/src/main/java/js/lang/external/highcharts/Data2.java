package js.lang.external.highcharts;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import java.lang.String;
import js.lang.Any;
import js.lang.Unknown /* ( number | string ) */;
import org.teavm.jso.JSBody;

@NpmPackage(
    name = "highcharts",
    version = "^8.1.2"
)
@Import(
    module = "highcharts/es-modules/masters/highcharts.src.js"
)
public interface Data2 extends Any {
  @JSBody(
      script = "return this[0]"
  )
  Unknown /* ( number | string ) */ getValue0();

  @JSBody(
      params = "value",
      script = "this[0] = value"
  )
  void setValue0(double value);

  @JSBody(
      params = "value",
      script = "this[0] = value"
  )
  void setValue0(String value);

  @JSBody(
      script = "return this[1]"
  )
  double getValue1();

  @JSBody(
      params = "value",
      script = "this[1] = value"
  )
  void setValue1(double value);

  static Data2.Builder builder() {
    return new Data2.Builder();
  }

  final class Builder {
    private final Data2 object = Any.empty();

    private Builder() {
    }

    public Data2 build() {
      return object;
    }

    public Data2.Builder value0(double value) {
      object.setValue0(value);
      return this;
    }

    public Data2.Builder value0(String value) {
      object.setValue0(value);
      return this;
    }

    public Data2.Builder value1(double value) {
      object.setValue1(value);
      return this;
    }
  }
}
