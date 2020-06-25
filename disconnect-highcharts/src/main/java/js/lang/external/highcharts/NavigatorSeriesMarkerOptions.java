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
public interface NavigatorSeriesMarkerOptions extends Any {
  @JSProperty("enabled")
  boolean getEnabled();

  @JSProperty("enabled")
  void setEnabled(boolean value);

  class Builder {
    private final NavigatorSeriesMarkerOptions object = Any.empty();

    public NavigatorSeriesMarkerOptions build() {
      return object;
    }

    public Builder enabled(boolean value) {
      object.setEnabled(value);
      return this;
    }
  }
}
