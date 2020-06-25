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
public interface RangeSelectorButtonsEventsOptions extends Any {
  /**
   * (Highstock, Gantt) Fires when clicking on the rangeSelector button. One
   * parameter, event, is passed to the function, containing common event
   * information. (see online documentation for example)
   *
   * Return false to stop default button's click action.
   *
   */
  @JSProperty("click")
  @Nullable
  RangeSelectorClickCallbackFunction getClick();

  /**
   * (Highstock, Gantt) Fires when clicking on the rangeSelector button. One
   * parameter, event, is passed to the function, containing common event
   * information. (see online documentation for example)
   *
   * Return false to stop default button's click action.
   *
   */
  @JSProperty("click")
  void setClick(@Nullable RangeSelectorClickCallbackFunction value);

  class Builder {
    private final RangeSelectorButtonsEventsOptions object = Any.empty();

    public RangeSelectorButtonsEventsOptions build() {
      return object;
    }

    /**
     * (Highstock, Gantt) Fires when clicking on the rangeSelector button. One
     * parameter, event, is passed to the function, containing common event
     * information. (see online documentation for example)
     *
     * Return false to stop default button's click action.
     *
     */
    public Builder click(@Nullable RangeSelectorClickCallbackFunction value) {
      object.setClick(value);
      return this;
    }
  }
}
