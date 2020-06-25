package js.lang.external.highcharts;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import js.lang.Any;
import js.lang.JsFunction;
import js.web.pointerevents.PointerEvent;
import org.teavm.jso.JSProperty;

/**
 * Information about the legend click event.
 *
 */
@NpmPackage(
    name = "highcharts",
    version = "^8.1.0"
)
@Import(
    module = "highcharts/es-modules/masters/highcharts.src.js"
)
public interface SeriesLegendItemClickEventObject extends Any {
  /**
   * Related browser event.
   *
   */
  @JSProperty("browserEvent")
  PointerEvent getBrowserEvent();

  /**
   * Related browser event.
   *
   */
  @JSProperty("browserEvent")
  void setBrowserEvent(PointerEvent value);

  /**
   * Prevent the default action of toggle the visibility of the series.
   *
   */
  @JSProperty("preventDefault")
  JsFunction getPreventDefault();

  /**
   * Prevent the default action of toggle the visibility of the series.
   *
   */
  @JSProperty("preventDefault")
  void setPreventDefault(JsFunction value);

  /**
   * Related series.
   *
   */
  @JSProperty("target")
  Series getTarget();

  /**
   * Related series.
   *
   */
  @JSProperty("target")
  void setTarget(Series value);

  class Builder {
    private final SeriesLegendItemClickEventObject object = Any.empty();

    public SeriesLegendItemClickEventObject build() {
      return object;
    }

    /**
     * Related browser event.
     *
     */
    public Builder browserEvent(PointerEvent value) {
      object.setBrowserEvent(value);
      return this;
    }

    /**
     * Prevent the default action of toggle the visibility of the series.
     *
     */
    public Builder preventDefault(JsFunction value) {
      object.setPreventDefault(value);
      return this;
    }

    /**
     * Related series.
     *
     */
    public Builder target(Series value) {
      object.setTarget(value);
      return this;
    }
  }
}
