package js.lang.external.highcharts.modules;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import javax.annotation.Nullable;
import js.lang.Any;
import js.lang.JsFunction;

/**
 * The Instrument class. Instrument objects represent an instrument capable
 * of playing a certain pitch for a specified duration.
 *
 */
@NpmPackage(
    name = "highcharts",
    version = "^8.1.0"
)
@Import(
    module = "highcharts/es-modules/masters/modules/sonification.src.js"
)
public interface Instrument extends Any {
  /**
   * Return a copy of an instrument. Only one instrument instance can play
   * at a time, so use this to get a new copy of the instrument that can
   * play alongside it. The new instrument copy will receive a new ID
   * unless one is supplied in options.
   *
   * @param options
   * Options to merge in for the copy.
   *
   * @return A new Instrument instance with the same options.
   *
   */
  Instrument copy(@Nullable InstrumentOptionsObject options);

  /**
   * Return a copy of an instrument. Only one instrument instance can play
   * at a time, so use this to get a new copy of the instrument that can
   * play alongside it. The new instrument copy will receive a new ID
   * unless one is supplied in options.
   *
   * @return A new Instrument instance with the same options.
   *
   */
  Instrument copy();

  /**
   * Mute an instrument that is playing. If the instrument is not
   * currently playing, this function does nothing.
   *
   */
  void mute();

  /**
   * Play the instrument according to options.
   *
   * @param options
   * Options for the playback of the instrument.
   *
   */
  void play(InstrumentPlayOptionsObject options);

  /**
   * Stop the instrument playing.
   *
   * @param immediately
   * Whether to do the stop immediately or fade out.
   *
   * @param onStopped
   * Callback function to be called when the stop is completed.
   *
   * @param callbackData
   * Data to send to the onEnd callback functions.
   *
   */
  void stop(boolean immediately, @Nullable JsFunction onStopped, @Nullable Any callbackData);

  /**
   * Stop the instrument playing.
   *
   * @param immediately
   * Whether to do the stop immediately or fade out.
   *
   * @param onStopped
   * Callback function to be called when the stop is completed.
   *
   */
  void stop(boolean immediately, @Nullable JsFunction onStopped);

  /**
   * Stop the instrument playing.
   *
   * @param immediately
   * Whether to do the stop immediately or fade out.
   *
   */
  void stop(boolean immediately);
}
