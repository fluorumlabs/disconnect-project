package js.lang.external.highcharts.modules;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import java.lang.String;
import js.lang.Any;
import js.lang.Unknown /* ( string | Instrument ) */;
import org.teavm.jso.JSProperty;

/**
 * Define an Instrument and the options for playing it.
 *
 */
@NpmPackage(
    name = "highcharts",
    version = "^8.1.0"
)
@Import(
    module = "highcharts/es-modules/masters/modules/sonification.src.js"
)
public interface EarconInstrument extends Any {
  /**
   * An instrument instance or the name of the instrument in the
   * Highcharts.sonification.instruments map.
   *
   */
  @JSProperty("instrument")
  Unknown /* ( string | Instrument ) */ getInstrument();

  /**
   * An instrument instance or the name of the instrument in the
   * Highcharts.sonification.instruments map.
   *
   */
  @JSProperty("instrument")
  void setInstrument(Instrument value);

  /**
   * An instrument instance or the name of the instrument in the
   * Highcharts.sonification.instruments map.
   *
   */
  @JSProperty("instrument")
  void setInstrument(String value);

  /**
   * The options to pass to Instrument.play.
   *
   */
  @JSProperty("playOptions")
  InstrumentPlayOptionsObject getPlayOptions();

  /**
   * The options to pass to Instrument.play.
   *
   */
  @JSProperty("playOptions")
  void setPlayOptions(InstrumentPlayOptionsObject value);

  class Builder {
    private final EarconInstrument object = Any.empty();

    public EarconInstrument build() {
      return object;
    }

    /**
     * An instrument instance or the name of the instrument in the
     * Highcharts.sonification.instruments map.
     *
     */
    public Builder instrument(Instrument value) {
      object.setInstrument(value);
      return this;
    }

    /**
     * An instrument instance or the name of the instrument in the
     * Highcharts.sonification.instruments map.
     *
     */
    public Builder instrument(String value) {
      object.setInstrument(value);
      return this;
    }

    /**
     * The options to pass to Instrument.play.
     *
     */
    public Builder playOptions(InstrumentPlayOptionsObject value) {
      object.setPlayOptions(value);
      return this;
    }
  }
}
