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
public interface AnnotationsElliottWaveControlPointOptions extends Any {
  @JSProperty("events")
  @Nullable
  Any getEvents();

  @JSProperty("events")
  void setEvents(@Nullable Any value);

  static Builder builder() {
    return new Builder();
  }

  final class Builder {
    private final AnnotationsElliottWaveControlPointOptions object = Any.empty();

    private Builder() {
    }

    public AnnotationsElliottWaveControlPointOptions build() {
      return object;
    }

    public Builder events(@Nullable Any value) {
      object.setEvents(value);
      return this;
    }
  }
}
