package js.lang.external.highcharts;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import js.lang.Any;
import js.lang.JsFunction;
import org.teavm.jso.JSProperty;

/**
 * Contains common event information. Through the <code>options</code> property you can
 * access the series options that were passed to the <code>addSeries</code> method.
 *
 */
@NpmPackage(
    name = "highcharts",
    version = "^8.1.0"
)
@Import(
    module = "highcharts/es-modules/masters/highcharts.src.js"
)
public interface ChartAddSeriesEventObject extends Any {
  /**
   * The series options that were passed to the <code>addSeries</code> method.
   *
   */
  @JSProperty("options")
  SeriesOptionsRegistry[] getOptions();

  /**
   * The series options that were passed to the <code>addSeries</code> method.
   *
   */
  @JSProperty("options")
  void setOptions(SeriesOptionsRegistry[] value);

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
    private final ChartAddSeriesEventObject object = Any.empty();

    public ChartAddSeriesEventObject build() {
      return object;
    }

    /**
     * The series options that were passed to the <code>addSeries</code> method.
     *
     */
    public Builder options(SeriesOptionsRegistry[] value) {
      object.setOptions(value);
      return this;
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
     * The event target.
     *
     */
    public Builder target(Chart value) {
      object.setTarget(value);
      return this;
    }
  }
}
