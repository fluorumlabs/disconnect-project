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
public interface Data5 extends Any {
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

  @JSBody(
      script = "return this[2]"
  )
  double getValue2();

  @JSBody(
      params = "value",
      script = "this[2] = value"
  )
  void setValue2(double value);

  @JSBody(
      script = "return this[3]"
  )
  double getValue3();

  @JSBody(
      params = "value",
      script = "this[3] = value"
  )
  void setValue3(double value);

  @JSBody(
      script = "return this[4]"
  )
  double getValue4();

  @JSBody(
      params = "value",
      script = "this[4] = value"
  )
  void setValue4(double value);

  static Data5.Builder builder() {
    return new Data5.Builder();
  }

  final class Builder {
    private final Data5 object = Any.empty();

    private Builder() {
    }

    public Data5 build() {
      return object;
    }

    public Data5.Builder value0(double value) {
      object.setValue0(value);
      return this;
    }

    public Data5.Builder value0(String value) {
      object.setValue0(value);
      return this;
    }

    public Data5.Builder value1(double value) {
      object.setValue1(value);
      return this;
    }

    public Data5.Builder value2(double value) {
      object.setValue2(value);
      return this;
    }

    public Data5.Builder value3(double value) {
      object.setValue3(value);
      return this;
    }

    public Data5.Builder value4(double value) {
      object.setValue4(value);
      return this;
    }
  }
}
