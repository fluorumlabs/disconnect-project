package js.lang.external.highcharts.modules;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import java.lang.String;
import javax.annotation.Nullable;
import js.lang.Any;
import org.teavm.jso.JSProperty;

/**
 * A set of options for the Instrument class.
 *
 */
@NpmPackage(
    name = "highcharts",
    version = "^8.1.2"
)
@Import(
    module = "highcharts/es-modules/masters/modules/sonification.src.js"
)
public interface InstrumentOptionsObject extends Any {
  /**
   * A list of allowed frequencies for this instrument. If trying to play
   * a frequency not on this list, the closest frequency will be used. Set
   * to <code>null</code> to allow all frequencies to be used. Defaults to <code>null</code>.
   *
   */
  @JSProperty("allowedFrequencies")
  @Nullable
  double[] getAllowedFrequencies();

  /**
   * A list of allowed frequencies for this instrument. If trying to play
   * a frequency not on this list, the closest frequency will be used. Set
   * to <code>null</code> to allow all frequencies to be used. Defaults to <code>null</code>.
   *
   */
  @JSProperty("allowedFrequencies")
  void setAllowedFrequencies(double... value);

  /**
   * The unique ID of the instrument. Generated if not supplied.
   *
   */
  @JSProperty("id")
  @Nullable
  String getId();

  /**
   * The unique ID of the instrument. Generated if not supplied.
   *
   */
  @JSProperty("id")
  void setId(@Nullable String value);

  /**
   * Options specific to oscillator instruments.
   *
   */
  @JSProperty("oscillator")
  @Nullable
  OscillatorOptionsObject getOscillator();

  /**
   * Options specific to oscillator instruments.
   *
   */
  @JSProperty("oscillator")
  void setOscillator(@Nullable OscillatorOptionsObject value);

  /**
   * When using functions to determine frequency or other parameters
   * during playback, this options specifies how often to call the
   * callback functions. Number given in milliseconds. Defaults to 20.
   *
   */
  @JSProperty("playCallbackInterval")
  double getPlayCallbackInterval();

  /**
   * When using functions to determine frequency or other parameters
   * during playback, this options specifies how often to call the
   * callback functions. Number given in milliseconds. Defaults to 20.
   *
   */
  @JSProperty("playCallbackInterval")
  void setPlayCallbackInterval(double value);

  /**
   * The type of instrument. Currently only <code>oscillator</code> is supported.
   * Defaults to <code>oscillator</code>.
   *
   */
  @JSProperty("type")
  @Nullable
  String getType();

  /**
   * The type of instrument. Currently only <code>oscillator</code> is supported.
   * Defaults to <code>oscillator</code>.
   *
   */
  @JSProperty("type")
  void setType(@Nullable String value);

  static Builder builder() {
    return new Builder();
  }

  final class Builder {
    private final InstrumentOptionsObject object = Any.empty();

    private Builder() {
    }

    public InstrumentOptionsObject build() {
      return object;
    }

    /**
     * A list of allowed frequencies for this instrument. If trying to play
     * a frequency not on this list, the closest frequency will be used. Set
     * to <code>null</code> to allow all frequencies to be used. Defaults to <code>null</code>.
     *
     */
    public Builder allowedFrequencies(double... value) {
      object.setAllowedFrequencies(value);
      return this;
    }

    /**
     * The unique ID of the instrument. Generated if not supplied.
     *
     */
    public Builder id(@Nullable String value) {
      object.setId(value);
      return this;
    }

    /**
     * Options specific to oscillator instruments.
     *
     */
    public Builder oscillator(@Nullable OscillatorOptionsObject value) {
      object.setOscillator(value);
      return this;
    }

    /**
     * When using functions to determine frequency or other parameters
     * during playback, this options specifies how often to call the
     * callback functions. Number given in milliseconds. Defaults to 20.
     *
     */
    public Builder playCallbackInterval(double value) {
      object.setPlayCallbackInterval(value);
      return this;
    }

    /**
     * The type of instrument. Currently only <code>oscillator</code> is supported.
     * Defaults to <code>oscillator</code>.
     *
     */
    public Builder type(@Nullable String value) {
      object.setType(value);
      return this;
    }
  }
}
