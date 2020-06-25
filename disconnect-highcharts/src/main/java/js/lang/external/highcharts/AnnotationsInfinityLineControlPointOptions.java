package js.lang.external.highcharts;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import javax.annotation.Nullable;
import js.lang.Any;
import org.teavm.jso.JSProperty;

@NpmPackage(
    name = "highcharts",
    version = "^8.1.0"
)
@Import(
    module = "highcharts/es-modules/masters/highcharts.src.js"
)
public interface AnnotationsInfinityLineControlPointOptions extends Any {
  @JSProperty("events")
  @Nullable
  Any getEvents();

  @JSProperty("events")
  void setEvents(@Nullable Any value);

  class Builder {
    private final AnnotationsInfinityLineControlPointOptions object = Any.empty();

    public AnnotationsInfinityLineControlPointOptions build() {
      return object;
    }

    public Builder events(@Nullable Any value) {
      object.setEvents(value);
      return this;
    }
  }
}
