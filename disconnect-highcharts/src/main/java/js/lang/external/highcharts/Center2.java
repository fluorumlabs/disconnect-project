package js.lang.external.highcharts;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import java.lang.String;
import javax.annotation.Nullable;
import js.lang.Any;
import js.lang.Unknown /* ( number | string | null ) */;
import org.teavm.jso.JSBody;

@NpmPackage(
    name = "highcharts",
    version = "^8.1.0"
)
@Import(
    module = "highcharts/es-modules/masters/highcharts.src.js"
)
public interface Center2 extends Any {
  @JSBody(
      script = "return this[0]"
  )
  @Nullable
  Unknown /* ( number | string | null ) */ getValue0();

  @JSBody(
      params = "value",
      script = "this[0] = value"
  )
  void setValue0(double value);

  @JSBody(
      params = "value",
      script = "this[0] = value"
  )
  void setValue0(@Nullable String value);

  @JSBody(
      script = "return this[1]"
  )
  @Nullable
  Unknown /* ( number | string | null ) */ getValue1();

  @JSBody(
      params = "value",
      script = "this[1] = value"
  )
  void setValue1(double value);

  @JSBody(
      params = "value",
      script = "this[1] = value"
  )
  void setValue1(@Nullable String value);

  class Builder {
    private final Center2 object = Any.empty();

    public Center2 build() {
      return object;
    }

    public Center2.Builder value0(double value) {
      object.setValue0(value);
      return this;
    }

    public Center2.Builder value0(@Nullable String value) {
      object.setValue0(value);
      return this;
    }

    public Center2.Builder value1(double value) {
      object.setValue1(value);
      return this;
    }

    public Center2.Builder value1(@Nullable String value) {
      object.setValue1(value);
      return this;
    }
  }
}
