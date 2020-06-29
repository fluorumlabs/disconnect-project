package js.lang.external.highcharts;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import js.lang.Any;
import org.teavm.jso.JSProperty;

/**
 * (Highcharts, Highstock, Gantt) An object of additional SVG attributes for the
 * no-data label.
 *
 */
@NpmPackage(
    name = "highcharts",
    version = "^8.1.2"
)
@Import(
    module = "highcharts/es-modules/masters/highcharts.src.js"
)
public interface NoDataAttrOptions extends Any {
  @JSProperty("zIndex")
  double getZIndex();

  @JSProperty("zIndex")
  void setZIndex(double value);

  static Builder builder() {
    return new Builder();
  }

  final class Builder {
    private final NoDataAttrOptions object = Any.empty();

    private Builder() {
    }

    public NoDataAttrOptions build() {
      return object;
    }

    public Builder zIndex(double value) {
      object.setZIndex(value);
      return this;
    }
  }
}
