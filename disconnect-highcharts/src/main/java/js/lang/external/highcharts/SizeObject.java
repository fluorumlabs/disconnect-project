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
public interface SizeObject extends Any {
  @JSProperty("height")
  double getHeight();

  @JSProperty("height")
  void setHeight(double value);

  @JSProperty("width")
  double getWidth();

  @JSProperty("width")
  void setWidth(double value);

  class Builder {
    private final SizeObject object = Any.empty();

    public SizeObject build() {
      return object;
    }

    public Builder height(double value) {
      object.setHeight(value);
      return this;
    }

    public Builder width(double value) {
      object.setWidth(value);
      return this;
    }
  }
}
