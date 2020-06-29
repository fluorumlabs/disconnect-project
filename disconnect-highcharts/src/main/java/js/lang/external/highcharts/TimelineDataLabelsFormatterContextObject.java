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
public interface TimelineDataLabelsFormatterContextObject extends PointLabelObject {
  @JSProperty("key")
  @Nullable
  String getKey();

  @JSProperty("key")
  void setKey(@Nullable String value);

  @JSProperty("point")
  Point getPoint();

  @JSProperty("point")
  void setPoint(Point value);

  @JSProperty("series")
  Series getSeries();

  @JSProperty("series")
  void setSeries(Series value);

  static Builder builder() {
    return new Builder();
  }

  final class Builder {
    private final TimelineDataLabelsFormatterContextObject object = Any.empty();

    private Builder() {
    }

    public TimelineDataLabelsFormatterContextObject build() {
      return object;
    }

    public Builder key(@Nullable String value) {
      object.setKey(value);
      return this;
    }

    public Builder point(Point value) {
      object.setPoint(value);
      return this;
    }

    public Builder series(Series value) {
      object.setSeries(value);
      return this;
    }
  }
}
