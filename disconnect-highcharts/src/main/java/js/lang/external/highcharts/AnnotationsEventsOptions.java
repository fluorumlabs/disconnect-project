package js.lang.external.highcharts;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import javax.annotation.Nullable;
import js.lang.Any;
import org.teavm.jso.JSProperty;

/**
 * (Highcharts, Highstock, Highmaps, Gantt) Events available in annotations.
 *
 */
@NpmPackage(
    name = "highcharts",
    version = "^8.1.0"
)
@Import(
    module = "highcharts/es-modules/masters/highcharts.src.js"
)
public interface AnnotationsEventsOptions extends Any {
  /**
   * (Highcharts, Highstock, Highmaps, Gantt) Event callback when annotation
   * is added to the chart.
   *
   */
  @JSProperty("add")
  @Nullable
  EventCallbackFunction<Annotation> getAdd();

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) Event callback when annotation
   * is added to the chart.
   *
   */
  @JSProperty("add")
  void setAdd(@Nullable EventCallbackFunction<Annotation> value);

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) Event callback when annotation
   * is updated (e.g. drag and droppped or resized by control points).
   *
   */
  @JSProperty("afterUpdate")
  @Nullable
  EventCallbackFunction<Annotation> getAfterUpdate();

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) Event callback when annotation
   * is updated (e.g. drag and droppped or resized by control points).
   *
   */
  @JSProperty("afterUpdate")
  void setAfterUpdate(@Nullable EventCallbackFunction<Annotation> value);

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) Event callback when annotation
   * is removed from the chart.
   *
   */
  @JSProperty("remove")
  @Nullable
  EventCallbackFunction<Annotation> getRemove();

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) Event callback when annotation
   * is removed from the chart.
   *
   */
  @JSProperty("remove")
  void setRemove(@Nullable EventCallbackFunction<Annotation> value);

  class Builder {
    private final AnnotationsEventsOptions object = Any.empty();

    public AnnotationsEventsOptions build() {
      return object;
    }

    /**
     * (Highcharts, Highstock, Highmaps, Gantt) Event callback when annotation
     * is added to the chart.
     *
     */
    public Builder add(@Nullable EventCallbackFunction<Annotation> value) {
      object.setAdd(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Highmaps, Gantt) Event callback when annotation
     * is updated (e.g. drag and droppped or resized by control points).
     *
     */
    public Builder afterUpdate(@Nullable EventCallbackFunction<Annotation> value) {
      object.setAfterUpdate(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Highmaps, Gantt) Event callback when annotation
     * is removed from the chart.
     *
     */
    public Builder remove(@Nullable EventCallbackFunction<Annotation> value) {
      object.setRemove(value);
      return this;
    }
  }
}
