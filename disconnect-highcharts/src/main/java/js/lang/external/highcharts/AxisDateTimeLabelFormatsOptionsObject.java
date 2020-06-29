package js.lang.external.highcharts;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import java.lang.String;
import javax.annotation.Nullable;
import js.lang.Any;
import org.teavm.jso.JSProperty;

@NpmPackage(
    name = "highcharts",
    version = "^8.1.2"
)
@Import(
    module = "highcharts/es-modules/masters/highcharts.src.js"
)
public interface AxisDateTimeLabelFormatsOptionsObject extends Any {
  @JSProperty("main")
  @Nullable
  String getMain();

  @JSProperty("main")
  void setMain(@Nullable String value);

  @JSProperty("range")
  boolean getRange();

  @JSProperty("range")
  void setRange(boolean value);

  static Builder builder() {
    return new Builder();
  }

  final class Builder {
    private final AxisDateTimeLabelFormatsOptionsObject object = Any.empty();

    private Builder() {
    }

    public AxisDateTimeLabelFormatsOptionsObject build() {
      return object;
    }

    public Builder main(@Nullable String value) {
      object.setMain(value);
      return this;
    }

    public Builder range(boolean value) {
      object.setRange(value);
      return this;
    }
  }
}
