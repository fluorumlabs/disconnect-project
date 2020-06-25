package js.lang.external.highcharts.modules;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import java.lang.String;
import javax.annotation.Nullable;
import js.lang.Any;
import js.lang.JsFunction;
import js.lang.Unknown /* ( string | Instrument ) */;
import org.teavm.jso.JSProperty;

/**
 * An instrument definition for a point, specifying the instrument to play
 * and how to play it.
 *
 */
@NpmPackage(
    name = "highcharts",
    version = "^8.1.0"
)
@Import(
    module = "highcharts/es-modules/masters/modules/sonification.src.js"
)
public interface PointInstrumentObject extends Any {
  /**
   * An Instrument instance or the name of the instrument in the
   * Highcharts.sonification.instruments map.
   *
   */
  @JSProperty("instrument")
  Unknown /* ( string | Instrument ) */ getInstrument();

  /**
   * An Instrument instance or the name of the instrument in the
   * Highcharts.sonification.instruments map.
   *
   */
  @JSProperty("instrument")
  void setInstrument(Instrument value);

  /**
   * An Instrument instance or the name of the instrument in the
   * Highcharts.sonification.instruments map.
   *
   */
  @JSProperty("instrument")
  void setInstrument(String value);

  /**
   * Mapping of instrument parameters for this instrument.
   *
   */
  @JSProperty("instrumentMapping")
  PointInstrumentMappingObject getInstrumentMapping();

  /**
   * Mapping of instrument parameters for this instrument.
   *
   */
  @JSProperty("instrumentMapping")
  void setInstrumentMapping(PointInstrumentMappingObject value);

  /**
   * Options for this instrument.
   *
   */
  @JSProperty("instrumentOptions")
  @Nullable
  PointInstrumentOptionsObject getInstrumentOptions();

  /**
   * Options for this instrument.
   *
   */
  @JSProperty("instrumentOptions")
  void setInstrumentOptions(@Nullable PointInstrumentOptionsObject value);

  /**
   * Callback to call when the instrument has stopped playing.
   *
   */
  @JSProperty("onEnd")
  @Nullable
  JsFunction getOnEnd();

  /**
   * Callback to call when the instrument has stopped playing.
   *
   */
  @JSProperty("onEnd")
  void setOnEnd(@Nullable JsFunction value);

  class Builder {
    private final PointInstrumentObject object = Any.empty();

    public PointInstrumentObject build() {
      return object;
    }

    /**
     * An Instrument instance or the name of the instrument in the
     * Highcharts.sonification.instruments map.
     *
     */
    public Builder instrument(Instrument value) {
      object.setInstrument(value);
      return this;
    }

    /**
     * An Instrument instance or the name of the instrument in the
     * Highcharts.sonification.instruments map.
     *
     */
    public Builder instrument(String value) {
      object.setInstrument(value);
      return this;
    }

    /**
     * Mapping of instrument parameters for this instrument.
     *
     */
    public Builder instrumentMapping(PointInstrumentMappingObject value) {
      object.setInstrumentMapping(value);
      return this;
    }

    /**
     * Options for this instrument.
     *
     */
    public Builder instrumentOptions(@Nullable PointInstrumentOptionsObject value) {
      object.setInstrumentOptions(value);
      return this;
    }

    /**
     * Callback to call when the instrument has stopped playing.
     *
     */
    public Builder onEnd(@Nullable JsFunction value) {
      object.setOnEnd(value);
      return this;
    }
  }
}
