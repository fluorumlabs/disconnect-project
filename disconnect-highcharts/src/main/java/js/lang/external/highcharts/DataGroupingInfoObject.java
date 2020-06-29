package js.lang.external.highcharts;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
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
public interface DataGroupingInfoObject extends Any {
  @JSProperty("length")
  double getLength();

  @JSProperty("length")
  void setLength(double value);

  @JSProperty("options")
  @Nullable
  SeriesOptionsRegistry[] getOptions();

  @JSProperty("options")
  void setOptions(SeriesOptionsRegistry... value);

  @JSProperty("start")
  double getStart();

  @JSProperty("start")
  void setStart(double value);

  static Builder builder() {
    return new Builder();
  }

  final class Builder {
    private final DataGroupingInfoObject object = Any.empty();

    private Builder() {
    }

    public DataGroupingInfoObject build() {
      return object;
    }

    public Builder length(double value) {
      object.setLength(value);
      return this;
    }

    public Builder options(SeriesOptionsRegistry... value) {
      object.setOptions(value);
      return this;
    }

    public Builder start(double value) {
      object.setStart(value);
      return this;
    }
  }
}
