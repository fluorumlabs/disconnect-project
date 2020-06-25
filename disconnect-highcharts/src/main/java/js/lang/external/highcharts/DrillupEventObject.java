package js.lang.external.highcharts;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import javax.annotation.Nullable;
import js.lang.Any;
import js.lang.JsFunction;
import org.teavm.jso.JSProperty;

/**
 * The event arguments when drilling up from a drilldown series.
 *
 */
@NpmPackage(
    name = "highcharts",
    version = "^8.1.0"
)
@Import(
    module = "highcharts/es-modules/masters/highcharts.src.js"
)
public interface DrillupEventObject extends Any {
  /**
   * Prevents the default behaviour of the event.
   *
   */
  @JSProperty("preventDefault")
  JsFunction getPreventDefault();

  /**
   * Prevents the default behaviour of the event.
   *
   */
  @JSProperty("preventDefault")
  void setPreventDefault(JsFunction value);

  /**
   * Options for the new series.
   *
   */
  @JSProperty("seriesOptions")
  @Nullable
  SeriesOptionsRegistry[] getSeriesOptions();

  /**
   * Options for the new series.
   *
   */
  @JSProperty("seriesOptions")
  void setSeriesOptions(SeriesOptionsRegistry[] value);

  /**
   * The event target.
   *
   */
  @JSProperty("target")
  Chart getTarget();

  /**
   * The event target.
   *
   */
  @JSProperty("target")
  void setTarget(Chart value);

  class Builder {
    private final DrillupEventObject object = Any.empty();

    public DrillupEventObject build() {
      return object;
    }

    /**
     * Prevents the default behaviour of the event.
     *
     */
    public Builder preventDefault(JsFunction value) {
      object.setPreventDefault(value);
      return this;
    }

    /**
     * Options for the new series.
     *
     */
    public Builder seriesOptions(SeriesOptionsRegistry[] value) {
      object.setSeriesOptions(value);
      return this;
    }

    /**
     * The event target.
     *
     */
    public Builder target(Chart value) {
      object.setTarget(value);
      return this;
    }
  }
}
