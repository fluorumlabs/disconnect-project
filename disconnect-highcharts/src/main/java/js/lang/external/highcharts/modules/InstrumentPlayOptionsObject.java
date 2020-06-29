package js.lang.external.highcharts.modules;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import javax.annotation.Nullable;
import js.lang.Any;
import js.lang.JsFunction;
import js.lang.Unknown /* ( number | Function ) */;
import org.teavm.jso.JSProperty;

/**
 * Options for playing an instrument.
 *
 */
@NpmPackage(
    name = "highcharts",
    version = "^8.1.2"
)
@Import(
    module = "highcharts/es-modules/masters/modules/sonification.src.js"
)
public interface InstrumentPlayOptionsObject extends Any {
  /**
   * The duration of the note in milliseconds.
   *
   */
  @JSProperty("duration")
  double getDuration();

  /**
   * The duration of the note in milliseconds.
   *
   */
  @JSProperty("duration")
  void setDuration(double value);

  /**
   * The frequency of the note to play. Can be a fixed number, or a
   * function. The function receives one argument: the relative time of
   * the note playing (0 being the start, and 1 being the end of the
   * note). It should return the frequency number for each point in time.
   * The poll interval of this function is specified by the
   * Instrument.playCallbackInterval option.
   *
   */
  @JSProperty("frequency")
  Unknown /* ( number | Function ) */ getFrequency();

  /**
   * The frequency of the note to play. Can be a fixed number, or a
   * function. The function receives one argument: the relative time of
   * the note playing (0 being the start, and 1 being the end of the
   * note). It should return the frequency number for each point in time.
   * The poll interval of this function is specified by the
   * Instrument.playCallbackInterval option.
   *
   */
  @JSProperty("frequency")
  void setFrequency(double value);

  /**
   * The frequency of the note to play. Can be a fixed number, or a
   * function. The function receives one argument: the relative time of
   * the note playing (0 being the start, and 1 being the end of the
   * note). It should return the frequency number for each point in time.
   * The poll interval of this function is specified by the
   * Instrument.playCallbackInterval option.
   *
   */
  @JSProperty("frequency")
  void setFrequency(JsFunction value);

  /**
   * The maximum frequency to allow. If the instrument has a set of
   * allowed frequencies, the closest frequency is used by default. Use
   * this option to stop too high frequencies from being used.
   *
   */
  @JSProperty("maxFrequency")
  double getMaxFrequency();

  /**
   * The maximum frequency to allow. If the instrument has a set of
   * allowed frequencies, the closest frequency is used by default. Use
   * this option to stop too high frequencies from being used.
   *
   */
  @JSProperty("maxFrequency")
  void setMaxFrequency(double value);

  /**
   * The minimum frequency to allow. If the instrument has a set of
   * allowed frequencies, the closest frequency is used by default. Use
   * this option to stop too low frequencies from being used.
   *
   */
  @JSProperty("minFrequency")
  double getMinFrequency();

  /**
   * The minimum frequency to allow. If the instrument has a set of
   * allowed frequencies, the closest frequency is used by default. Use
   * this option to stop too low frequencies from being used.
   *
   */
  @JSProperty("minFrequency")
  void setMinFrequency(double value);

  /**
   * Callback function to be called when the play is completed.
   *
   */
  @JSProperty("onEnd")
  @Nullable
  JsFunction getOnEnd();

  /**
   * Callback function to be called when the play is completed.
   *
   */
  @JSProperty("onEnd")
  void setOnEnd(@Nullable JsFunction value);

  /**
   * The panning of the instrument. Can be a fixed number between -1 and
   * 1, or a function. The function receives one argument: the relative
   * time of the note playing (0 being the start, and 1 being the end of
   * the note). It should return the panning value for each point in time.
   * The poll interval of this function is specified by the
   * Instrument.playCallbackInterval option. Defaults to 0.
   *
   */
  @JSProperty("pan")
  @Nullable
  Unknown /* ( number | Function ) */ getPan();

  /**
   * The panning of the instrument. Can be a fixed number between -1 and
   * 1, or a function. The function receives one argument: the relative
   * time of the note playing (0 being the start, and 1 being the end of
   * the note). It should return the panning value for each point in time.
   * The poll interval of this function is specified by the
   * Instrument.playCallbackInterval option. Defaults to 0.
   *
   */
  @JSProperty("pan")
  void setPan(double value);

  /**
   * The panning of the instrument. Can be a fixed number between -1 and
   * 1, or a function. The function receives one argument: the relative
   * time of the note playing (0 being the start, and 1 being the end of
   * the note). It should return the panning value for each point in time.
   * The poll interval of this function is specified by the
   * Instrument.playCallbackInterval option. Defaults to 0.
   *
   */
  @JSProperty("pan")
  void setPan(@Nullable JsFunction value);

  /**
   * The volume of the instrument. Can be a fixed number between 0 and 1,
   * or a function. The function receives one argument: the relative time
   * of the note playing (0 being the start, and 1 being the end of the
   * note). It should return the volume for each point in time. The poll
   * interval of this function is specified by the
   * Instrument.playCallbackInterval option. Defaults to 1.
   *
   */
  @JSProperty("volume")
  @Nullable
  Unknown /* ( number | Function ) */ getVolume();

  /**
   * The volume of the instrument. Can be a fixed number between 0 and 1,
   * or a function. The function receives one argument: the relative time
   * of the note playing (0 being the start, and 1 being the end of the
   * note). It should return the volume for each point in time. The poll
   * interval of this function is specified by the
   * Instrument.playCallbackInterval option. Defaults to 1.
   *
   */
  @JSProperty("volume")
  void setVolume(double value);

  /**
   * The volume of the instrument. Can be a fixed number between 0 and 1,
   * or a function. The function receives one argument: the relative time
   * of the note playing (0 being the start, and 1 being the end of the
   * note). It should return the volume for each point in time. The poll
   * interval of this function is specified by the
   * Instrument.playCallbackInterval option. Defaults to 1.
   *
   */
  @JSProperty("volume")
  void setVolume(@Nullable JsFunction value);

  static Builder builder() {
    return new Builder();
  }

  final class Builder {
    private final InstrumentPlayOptionsObject object = Any.empty();

    private Builder() {
    }

    public InstrumentPlayOptionsObject build() {
      return object;
    }

    /**
     * The duration of the note in milliseconds.
     *
     */
    public Builder duration(double value) {
      object.setDuration(value);
      return this;
    }

    /**
     * The frequency of the note to play. Can be a fixed number, or a
     * function. The function receives one argument: the relative time of
     * the note playing (0 being the start, and 1 being the end of the
     * note). It should return the frequency number for each point in time.
     * The poll interval of this function is specified by the
     * Instrument.playCallbackInterval option.
     *
     */
    public Builder frequency(double value) {
      object.setFrequency(value);
      return this;
    }

    /**
     * The frequency of the note to play. Can be a fixed number, or a
     * function. The function receives one argument: the relative time of
     * the note playing (0 being the start, and 1 being the end of the
     * note). It should return the frequency number for each point in time.
     * The poll interval of this function is specified by the
     * Instrument.playCallbackInterval option.
     *
     */
    public Builder frequency(JsFunction value) {
      object.setFrequency(value);
      return this;
    }

    /**
     * The maximum frequency to allow. If the instrument has a set of
     * allowed frequencies, the closest frequency is used by default. Use
     * this option to stop too high frequencies from being used.
     *
     */
    public Builder maxFrequency(double value) {
      object.setMaxFrequency(value);
      return this;
    }

    /**
     * The minimum frequency to allow. If the instrument has a set of
     * allowed frequencies, the closest frequency is used by default. Use
     * this option to stop too low frequencies from being used.
     *
     */
    public Builder minFrequency(double value) {
      object.setMinFrequency(value);
      return this;
    }

    /**
     * Callback function to be called when the play is completed.
     *
     */
    public Builder onEnd(@Nullable JsFunction value) {
      object.setOnEnd(value);
      return this;
    }

    /**
     * The panning of the instrument. Can be a fixed number between -1 and
     * 1, or a function. The function receives one argument: the relative
     * time of the note playing (0 being the start, and 1 being the end of
     * the note). It should return the panning value for each point in time.
     * The poll interval of this function is specified by the
     * Instrument.playCallbackInterval option. Defaults to 0.
     *
     */
    public Builder pan(double value) {
      object.setPan(value);
      return this;
    }

    /**
     * The panning of the instrument. Can be a fixed number between -1 and
     * 1, or a function. The function receives one argument: the relative
     * time of the note playing (0 being the start, and 1 being the end of
     * the note). It should return the panning value for each point in time.
     * The poll interval of this function is specified by the
     * Instrument.playCallbackInterval option. Defaults to 0.
     *
     */
    public Builder pan(@Nullable JsFunction value) {
      object.setPan(value);
      return this;
    }

    /**
     * The volume of the instrument. Can be a fixed number between 0 and 1,
     * or a function. The function receives one argument: the relative time
     * of the note playing (0 being the start, and 1 being the end of the
     * note). It should return the volume for each point in time. The poll
     * interval of this function is specified by the
     * Instrument.playCallbackInterval option. Defaults to 1.
     *
     */
    public Builder volume(double value) {
      object.setVolume(value);
      return this;
    }

    /**
     * The volume of the instrument. Can be a fixed number between 0 and 1,
     * or a function. The function receives one argument: the relative time
     * of the note playing (0 being the start, and 1 being the end of the
     * note). It should return the volume for each point in time. The poll
     * interval of this function is specified by the
     * Instrument.playCallbackInterval option. Defaults to 1.
     *
     */
    public Builder volume(@Nullable JsFunction value) {
      object.setVolume(value);
      return this;
    }
  }
}
