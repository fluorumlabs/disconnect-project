package js.lang.external.highcharts.modules;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import js.lang.Any;
import js.lang.JsFunction;
import org.teavm.jso.JSProperty;

/**
 * Global classes and objects related to sonification.
 *
 */
@NpmPackage(
    name = "highcharts",
    version = "^8.1.0"
)
@Import(
    module = "highcharts/es-modules/masters/modules/sonification.src.js"
)
public interface SonificationObject extends Any {
  /**
   * The Earcon class.
   *
   */
  @JSProperty("Earcon")
  JsFunction getEarcon();

  /**
   * The Earcon class.
   *
   */
  @JSProperty("Earcon")
  void setEarcon(JsFunction value);

  /**
   * Note fade-out-time in milliseconds. Most notes are faded out quickly
   * by default if there is time. This is to avoid abrupt stops which will
   * cause perceived clicks.
   *
   */
  @JSProperty("fadeOutDuration")
  double getFadeOutDuration();

  /**
   * Note fade-out-time in milliseconds. Most notes are faded out quickly
   * by default if there is time. This is to avoid abrupt stops which will
   * cause perceived clicks.
   *
   */
  @JSProperty("fadeOutDuration")
  void setFadeOutDuration(double value);

  /**
   * The Instrument class.
   *
   */
  @JSProperty("Instrument")
  JsFunction getInstrument();

  /**
   * The Instrument class.
   *
   */
  @JSProperty("Instrument")
  void setInstrument(JsFunction value);

  /**
   * Predefined instruments, given as an object with a map between the
   * instrument name and the Highcharts.Instrument object.
   *
   */
  @JSProperty("instruments")
  SonificationObject getInstruments();

  /**
   * Predefined instruments, given as an object with a map between the
   * instrument name and the Highcharts.Instrument object.
   *
   */
  @JSProperty("instruments")
  void setInstruments(SonificationObject value);

  class Builder {
    private final SonificationObject object = Any.empty();

    public SonificationObject build() {
      return object;
    }

    /**
     * The Earcon class.
     *
     */
    public Builder Earcon(JsFunction value) {
      object.setEarcon(value);
      return this;
    }

    /**
     * Note fade-out-time in milliseconds. Most notes are faded out quickly
     * by default if there is time. This is to avoid abrupt stops which will
     * cause perceived clicks.
     *
     */
    public Builder fadeOutDuration(double value) {
      object.setFadeOutDuration(value);
      return this;
    }

    /**
     * The Instrument class.
     *
     */
    public Builder Instrument(JsFunction value) {
      object.setInstrument(value);
      return this;
    }

    /**
     * Predefined instruments, given as an object with a map between the
     * instrument name and the Highcharts.Instrument object.
     *
     */
    public Builder instruments(SonificationObject value) {
      object.setInstruments(value);
      return this;
    }
  }
}
