package js.lang.external.highcharts;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import js.lang.Any;
import org.teavm.jso.JSProperty;

@NpmPackage(
    name = "highcharts",
    version = "^8.1.0"
)
@Import(
    module = "highcharts/es-modules/masters/highcharts.src.js"
)
public interface ConnectorsAnimationOptionsObject extends Any {
  @JSProperty("reversed")
  boolean getReversed();

  @JSProperty("reversed")
  void setReversed(boolean value);

  class Builder {
    private final ConnectorsAnimationOptionsObject object = Any.empty();

    public ConnectorsAnimationOptionsObject build() {
      return object;
    }

    public Builder reversed(boolean value) {
      object.setReversed(value);
      return this;
    }
  }
}
