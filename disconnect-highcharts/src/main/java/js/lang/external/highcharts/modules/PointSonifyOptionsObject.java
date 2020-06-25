package js.lang.external.highcharts.modules;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import javax.annotation.Nullable;
import js.lang.Any;
import js.lang.JsFunction;
import org.teavm.jso.JSProperty;

/**
 * Options for sonifying a point.
 *
 */
@NpmPackage(
    name = "highcharts",
    version = "^8.1.0"
)
@Import(
    module = "highcharts/es-modules/masters/modules/sonification.src.js"
)
public interface PointSonifyOptionsObject extends Any {
  /**
   * Optionally provide the minimum/maximum values for the points. If this
   * is not supplied, it is calculated from the points in the chart on
   * demand. This option is supplied in the following format, as a map of
   * point data properties to objects with min/max values: (see online
   * documentation for example)
   *
   */
  @JSProperty("dataExtremes")
  @Nullable
  SonificationObject getDataExtremes();

  /**
   * Optionally provide the minimum/maximum values for the points. If this
   * is not supplied, it is calculated from the points in the chart on
   * demand. This option is supplied in the following format, as a map of
   * point data properties to objects with min/max values: (see online
   * documentation for example)
   *
   */
  @JSProperty("dataExtremes")
  void setDataExtremes(@Nullable SonificationObject value);

  /**
   * The instrument definitions for this point.
   *
   */
  @JSProperty("instruments")
  PointInstrumentObject[] getInstruments();

  /**
   * The instrument definitions for this point.
   *
   */
  @JSProperty("instruments")
  void setInstruments(PointInstrumentObject[] value);

  /**
   * Callback called when the sonification has finished.
   *
   */
  @JSProperty("onEnd")
  @Nullable
  JsFunction getOnEnd();

  /**
   * Callback called when the sonification has finished.
   *
   */
  @JSProperty("onEnd")
  void setOnEnd(@Nullable JsFunction value);

  class Builder {
    private final PointSonifyOptionsObject object = Any.empty();

    public PointSonifyOptionsObject build() {
      return object;
    }

    /**
     * Optionally provide the minimum/maximum values for the points. If this
     * is not supplied, it is calculated from the points in the chart on
     * demand. This option is supplied in the following format, as a map of
     * point data properties to objects with min/max values: (see online
     * documentation for example)
     *
     */
    public Builder dataExtremes(@Nullable SonificationObject value) {
      object.setDataExtremes(value);
      return this;
    }

    /**
     * The instrument definitions for this point.
     *
     */
    public Builder instruments(PointInstrumentObject[] value) {
      object.setInstruments(value);
      return this;
    }

    /**
     * Callback called when the sonification has finished.
     *
     */
    public Builder onEnd(@Nullable JsFunction value) {
      object.setOnEnd(value);
      return this;
    }
  }
}
