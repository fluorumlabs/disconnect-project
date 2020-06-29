package js.lang.external.highcharts;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import javax.annotation.Nullable;
import js.lang.Any;
import org.teavm.jso.JSProperty;

/**
 * (Highstock) Properties for each single point.
 *
 */
@NpmPackage(
    name = "highcharts",
    version = "^8.1.2"
)
@Import(
    module = "highcharts/es-modules/masters/highcharts.src.js"
)
public interface PlotSeriesPointOptions extends Any {
  /**
   * (Highstock) Events for each single point.
   *
   */
  @JSProperty("events")
  @Nullable
  PointEventsOptionsObject getEvents();

  /**
   * (Highstock) Events for each single point.
   *
   */
  @JSProperty("events")
  void setEvents(@Nullable PointEventsOptionsObject value);

  static Builder builder() {
    return new Builder();
  }

  final class Builder {
    private final PlotSeriesPointOptions object = Any.empty();

    private Builder() {
    }

    public PlotSeriesPointOptions build() {
      return object;
    }

    /**
     * (Highstock) Events for each single point.
     *
     */
    public Builder events(@Nullable PointEventsOptionsObject value) {
      object.setEvents(value);
      return this;
    }
  }
}
