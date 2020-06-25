package js.lang.external.highcharts.modules;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import java.lang.String;
import javax.annotation.Nullable;
import js.lang.Any;
import js.util.RegExp;
import org.teavm.jso.JSProperty;

/**
 * Structure for alternative date formats to parse.
 *
 */
@NpmPackage(
    name = "highcharts",
    version = "^8.1.0"
)
@Import(
    module = "highcharts/es-modules/masters/modules/data.src.js"
)
public interface DataDateFormatObject extends Any {
  @JSProperty("alternative")
  @Nullable
  String getAlternative();

  @JSProperty("alternative")
  void setAlternative(@Nullable String value);

  @JSProperty("parser")
  DataDateFormatCallbackFunction getParser();

  @JSProperty("parser")
  void setParser(DataDateFormatCallbackFunction value);

  @JSProperty("regex")
  RegExp getRegex();

  @JSProperty("regex")
  void setRegex(RegExp value);

  class Builder {
    private final DataDateFormatObject object = Any.empty();

    public DataDateFormatObject build() {
      return object;
    }

    public Builder alternative(@Nullable String value) {
      object.setAlternative(value);
      return this;
    }

    public Builder parser(DataDateFormatCallbackFunction value) {
      object.setParser(value);
      return this;
    }

    public Builder regex(RegExp value) {
      object.setRegex(value);
      return this;
    }
  }
}
