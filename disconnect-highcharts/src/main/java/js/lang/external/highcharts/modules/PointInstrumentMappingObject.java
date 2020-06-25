package js.lang.external.highcharts.modules;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import java.lang.String;
import javax.annotation.Nullable;
import js.lang.Any;
import js.lang.JsFunction;
import js.lang.Unknown /* ( number | string | Function ) */;
import org.teavm.jso.JSProperty;

/**
 * Define the parameter mapping for an instrument.
 *
 */
@NpmPackage(
    name = "highcharts",
    version = "^8.1.0"
)
@Import(
    module = "highcharts/es-modules/masters/modules/sonification.src.js"
)
public interface PointInstrumentMappingObject extends Any {
  /**
   * Define the duration of the notes for this instrument. This can be a
   * string with a data property name, e.g. <code>'y'</code>, in which case this data
   * property is used to define the duration relative to the <code>y</code>-values of
   * the other points. A higher <code>y</code> value would then result in a longer
   * duration. This option can also be a fixed number or a function. If it
   * is a function, this function is called once before the note starts
   * playing, and should return the duration in milliseconds. It receives
   * two arguments: The point, and the dataExtremes.
   *
   */
  @JSProperty("duration")
  Unknown /* ( number | string | Function ) */ getDuration();

  /**
   * Define the duration of the notes for this instrument. This can be a
   * string with a data property name, e.g. <code>'y'</code>, in which case this data
   * property is used to define the duration relative to the <code>y</code>-values of
   * the other points. A higher <code>y</code> value would then result in a longer
   * duration. This option can also be a fixed number or a function. If it
   * is a function, this function is called once before the note starts
   * playing, and should return the duration in milliseconds. It receives
   * two arguments: The point, and the dataExtremes.
   *
   */
  @JSProperty("duration")
  void setDuration(double value);

  /**
   * Define the duration of the notes for this instrument. This can be a
   * string with a data property name, e.g. <code>'y'</code>, in which case this data
   * property is used to define the duration relative to the <code>y</code>-values of
   * the other points. A higher <code>y</code> value would then result in a longer
   * duration. This option can also be a fixed number or a function. If it
   * is a function, this function is called once before the note starts
   * playing, and should return the duration in milliseconds. It receives
   * two arguments: The point, and the dataExtremes.
   *
   */
  @JSProperty("duration")
  void setDuration(String value);

  /**
   * Define the duration of the notes for this instrument. This can be a
   * string with a data property name, e.g. <code>'y'</code>, in which case this data
   * property is used to define the duration relative to the <code>y</code>-values of
   * the other points. A higher <code>y</code> value would then result in a longer
   * duration. This option can also be a fixed number or a function. If it
   * is a function, this function is called once before the note starts
   * playing, and should return the duration in milliseconds. It receives
   * two arguments: The point, and the dataExtremes.
   *
   */
  @JSProperty("duration")
  void setDuration(JsFunction value);

  /**
   * Define the frequency of the instrument. This can be a string with a
   * data property name, e.g. <code>'y'</code>, in which case this data property is
   * used to define the frequency relative to the <code>y</code>-values of the other
   * points. A higher <code>y</code> value would then result in a higher frequency.
   * This option can also be a fixed number or a function. If it is a
   * function, this function is called in regular intervals while the note
   * is playing. It receives three arguments: The point, the dataExtremes,
   * and the current relative time - where 0 is the beginning of the note
   * and 1 is the end. The function should return the frequency of the
   * note as a number (in Hz).
   *
   */
  @JSProperty("frequency")
  Unknown /* ( number | string | Function ) */ getFrequency();

  /**
   * Define the frequency of the instrument. This can be a string with a
   * data property name, e.g. <code>'y'</code>, in which case this data property is
   * used to define the frequency relative to the <code>y</code>-values of the other
   * points. A higher <code>y</code> value would then result in a higher frequency.
   * This option can also be a fixed number or a function. If it is a
   * function, this function is called in regular intervals while the note
   * is playing. It receives three arguments: The point, the dataExtremes,
   * and the current relative time - where 0 is the beginning of the note
   * and 1 is the end. The function should return the frequency of the
   * note as a number (in Hz).
   *
   */
  @JSProperty("frequency")
  void setFrequency(double value);

  /**
   * Define the frequency of the instrument. This can be a string with a
   * data property name, e.g. <code>'y'</code>, in which case this data property is
   * used to define the frequency relative to the <code>y</code>-values of the other
   * points. A higher <code>y</code> value would then result in a higher frequency.
   * This option can also be a fixed number or a function. If it is a
   * function, this function is called in regular intervals while the note
   * is playing. It receives three arguments: The point, the dataExtremes,
   * and the current relative time - where 0 is the beginning of the note
   * and 1 is the end. The function should return the frequency of the
   * note as a number (in Hz).
   *
   */
  @JSProperty("frequency")
  void setFrequency(String value);

  /**
   * Define the frequency of the instrument. This can be a string with a
   * data property name, e.g. <code>'y'</code>, in which case this data property is
   * used to define the frequency relative to the <code>y</code>-values of the other
   * points. A higher <code>y</code> value would then result in a higher frequency.
   * This option can also be a fixed number or a function. If it is a
   * function, this function is called in regular intervals while the note
   * is playing. It receives three arguments: The point, the dataExtremes,
   * and the current relative time - where 0 is the beginning of the note
   * and 1 is the end. The function should return the frequency of the
   * note as a number (in Hz).
   *
   */
  @JSProperty("frequency")
  void setFrequency(JsFunction value);

  /**
   * Define the panning of the instrument. This can be a string with a
   * data property name, e.g. <code>'x'</code>, in which case this data property is
   * used to define the panning relative to the <code>x</code>-values of the other
   * points. A higher <code>x</code> value would then result in a higher panning
   * value (panned further to the right). This option can also be a fixed
   * number or a function. If it is a function, this function is called in
   * regular intervals while the note is playing. It receives three
   * arguments: The point, the dataExtremes, and the current relative time
   *
   * <ul>
   * <li>where 0 is the beginning of the note and 1 is the end. The function
   * should return the panning of the note as a number between -1 and 1.</li>
   * </ul>
   */
  @JSProperty("pan")
  @Nullable
  Unknown /* ( number | string | Function ) */ getPan();

  /**
   * Define the panning of the instrument. This can be a string with a
   * data property name, e.g. <code>'x'</code>, in which case this data property is
   * used to define the panning relative to the <code>x</code>-values of the other
   * points. A higher <code>x</code> value would then result in a higher panning
   * value (panned further to the right). This option can also be a fixed
   * number or a function. If it is a function, this function is called in
   * regular intervals while the note is playing. It receives three
   * arguments: The point, the dataExtremes, and the current relative time
   *
   * <ul>
   * <li>where 0 is the beginning of the note and 1 is the end. The function
   * should return the panning of the note as a number between -1 and 1.</li>
   * </ul>
   */
  @JSProperty("pan")
  void setPan(double value);

  /**
   * Define the panning of the instrument. This can be a string with a
   * data property name, e.g. <code>'x'</code>, in which case this data property is
   * used to define the panning relative to the <code>x</code>-values of the other
   * points. A higher <code>x</code> value would then result in a higher panning
   * value (panned further to the right). This option can also be a fixed
   * number or a function. If it is a function, this function is called in
   * regular intervals while the note is playing. It receives three
   * arguments: The point, the dataExtremes, and the current relative time
   *
   * <ul>
   * <li>where 0 is the beginning of the note and 1 is the end. The function
   * should return the panning of the note as a number between -1 and 1.</li>
   * </ul>
   */
  @JSProperty("pan")
  void setPan(@Nullable String value);

  /**
   * Define the panning of the instrument. This can be a string with a
   * data property name, e.g. <code>'x'</code>, in which case this data property is
   * used to define the panning relative to the <code>x</code>-values of the other
   * points. A higher <code>x</code> value would then result in a higher panning
   * value (panned further to the right). This option can also be a fixed
   * number or a function. If it is a function, this function is called in
   * regular intervals while the note is playing. It receives three
   * arguments: The point, the dataExtremes, and the current relative time
   *
   * <ul>
   * <li>where 0 is the beginning of the note and 1 is the end. The function
   * should return the panning of the note as a number between -1 and 1.</li>
   * </ul>
   */
  @JSProperty("pan")
  void setPan(@Nullable JsFunction value);

  /**
   * Define the volume of the instrument. This can be a string with a data
   * property name, e.g. <code>'y'</code>, in which case this data property is used
   * to define the volume relative to the <code>y</code>-values of the other points.
   * A higher <code>y</code> value would then result in a higher volume. This option
   * can also be a fixed number or a function. If it is a function, this
   * function is called in regular intervals while the note is playing. It
   * receives three arguments: The point, the dataExtremes, and the
   * current relative time - where 0 is the beginning of the note and 1 is
   * the end. The function should return the volume of the note as a
   * number between 0 and 1.
   *
   */
  @JSProperty("volume")
  Unknown /* ( number | string | Function ) */ getVolume();

  /**
   * Define the volume of the instrument. This can be a string with a data
   * property name, e.g. <code>'y'</code>, in which case this data property is used
   * to define the volume relative to the <code>y</code>-values of the other points.
   * A higher <code>y</code> value would then result in a higher volume. This option
   * can also be a fixed number or a function. If it is a function, this
   * function is called in regular intervals while the note is playing. It
   * receives three arguments: The point, the dataExtremes, and the
   * current relative time - where 0 is the beginning of the note and 1 is
   * the end. The function should return the volume of the note as a
   * number between 0 and 1.
   *
   */
  @JSProperty("volume")
  void setVolume(double value);

  /**
   * Define the volume of the instrument. This can be a string with a data
   * property name, e.g. <code>'y'</code>, in which case this data property is used
   * to define the volume relative to the <code>y</code>-values of the other points.
   * A higher <code>y</code> value would then result in a higher volume. This option
   * can also be a fixed number or a function. If it is a function, this
   * function is called in regular intervals while the note is playing. It
   * receives three arguments: The point, the dataExtremes, and the
   * current relative time - where 0 is the beginning of the note and 1 is
   * the end. The function should return the volume of the note as a
   * number between 0 and 1.
   *
   */
  @JSProperty("volume")
  void setVolume(String value);

  /**
   * Define the volume of the instrument. This can be a string with a data
   * property name, e.g. <code>'y'</code>, in which case this data property is used
   * to define the volume relative to the <code>y</code>-values of the other points.
   * A higher <code>y</code> value would then result in a higher volume. This option
   * can also be a fixed number or a function. If it is a function, this
   * function is called in regular intervals while the note is playing. It
   * receives three arguments: The point, the dataExtremes, and the
   * current relative time - where 0 is the beginning of the note and 1 is
   * the end. The function should return the volume of the note as a
   * number between 0 and 1.
   *
   */
  @JSProperty("volume")
  void setVolume(JsFunction value);

  class Builder {
    private final PointInstrumentMappingObject object = Any.empty();

    public PointInstrumentMappingObject build() {
      return object;
    }

    /**
     * Define the duration of the notes for this instrument. This can be a
     * string with a data property name, e.g. <code>'y'</code>, in which case this data
     * property is used to define the duration relative to the <code>y</code>-values of
     * the other points. A higher <code>y</code> value would then result in a longer
     * duration. This option can also be a fixed number or a function. If it
     * is a function, this function is called once before the note starts
     * playing, and should return the duration in milliseconds. It receives
     * two arguments: The point, and the dataExtremes.
     *
     */
    public Builder duration(double value) {
      object.setDuration(value);
      return this;
    }

    /**
     * Define the duration of the notes for this instrument. This can be a
     * string with a data property name, e.g. <code>'y'</code>, in which case this data
     * property is used to define the duration relative to the <code>y</code>-values of
     * the other points. A higher <code>y</code> value would then result in a longer
     * duration. This option can also be a fixed number or a function. If it
     * is a function, this function is called once before the note starts
     * playing, and should return the duration in milliseconds. It receives
     * two arguments: The point, and the dataExtremes.
     *
     */
    public Builder duration(String value) {
      object.setDuration(value);
      return this;
    }

    /**
     * Define the duration of the notes for this instrument. This can be a
     * string with a data property name, e.g. <code>'y'</code>, in which case this data
     * property is used to define the duration relative to the <code>y</code>-values of
     * the other points. A higher <code>y</code> value would then result in a longer
     * duration. This option can also be a fixed number or a function. If it
     * is a function, this function is called once before the note starts
     * playing, and should return the duration in milliseconds. It receives
     * two arguments: The point, and the dataExtremes.
     *
     */
    public Builder duration(JsFunction value) {
      object.setDuration(value);
      return this;
    }

    /**
     * Define the frequency of the instrument. This can be a string with a
     * data property name, e.g. <code>'y'</code>, in which case this data property is
     * used to define the frequency relative to the <code>y</code>-values of the other
     * points. A higher <code>y</code> value would then result in a higher frequency.
     * This option can also be a fixed number or a function. If it is a
     * function, this function is called in regular intervals while the note
     * is playing. It receives three arguments: The point, the dataExtremes,
     * and the current relative time - where 0 is the beginning of the note
     * and 1 is the end. The function should return the frequency of the
     * note as a number (in Hz).
     *
     */
    public Builder frequency(double value) {
      object.setFrequency(value);
      return this;
    }

    /**
     * Define the frequency of the instrument. This can be a string with a
     * data property name, e.g. <code>'y'</code>, in which case this data property is
     * used to define the frequency relative to the <code>y</code>-values of the other
     * points. A higher <code>y</code> value would then result in a higher frequency.
     * This option can also be a fixed number or a function. If it is a
     * function, this function is called in regular intervals while the note
     * is playing. It receives three arguments: The point, the dataExtremes,
     * and the current relative time - where 0 is the beginning of the note
     * and 1 is the end. The function should return the frequency of the
     * note as a number (in Hz).
     *
     */
    public Builder frequency(String value) {
      object.setFrequency(value);
      return this;
    }

    /**
     * Define the frequency of the instrument. This can be a string with a
     * data property name, e.g. <code>'y'</code>, in which case this data property is
     * used to define the frequency relative to the <code>y</code>-values of the other
     * points. A higher <code>y</code> value would then result in a higher frequency.
     * This option can also be a fixed number or a function. If it is a
     * function, this function is called in regular intervals while the note
     * is playing. It receives three arguments: The point, the dataExtremes,
     * and the current relative time - where 0 is the beginning of the note
     * and 1 is the end. The function should return the frequency of the
     * note as a number (in Hz).
     *
     */
    public Builder frequency(JsFunction value) {
      object.setFrequency(value);
      return this;
    }

    /**
     * Define the panning of the instrument. This can be a string with a
     * data property name, e.g. <code>'x'</code>, in which case this data property is
     * used to define the panning relative to the <code>x</code>-values of the other
     * points. A higher <code>x</code> value would then result in a higher panning
     * value (panned further to the right). This option can also be a fixed
     * number or a function. If it is a function, this function is called in
     * regular intervals while the note is playing. It receives three
     * arguments: The point, the dataExtremes, and the current relative time
     *
     * <ul>
     * <li>where 0 is the beginning of the note and 1 is the end. The function
     * should return the panning of the note as a number between -1 and 1.</li>
     * </ul>
     */
    public Builder pan(double value) {
      object.setPan(value);
      return this;
    }

    /**
     * Define the panning of the instrument. This can be a string with a
     * data property name, e.g. <code>'x'</code>, in which case this data property is
     * used to define the panning relative to the <code>x</code>-values of the other
     * points. A higher <code>x</code> value would then result in a higher panning
     * value (panned further to the right). This option can also be a fixed
     * number or a function. If it is a function, this function is called in
     * regular intervals while the note is playing. It receives three
     * arguments: The point, the dataExtremes, and the current relative time
     *
     * <ul>
     * <li>where 0 is the beginning of the note and 1 is the end. The function
     * should return the panning of the note as a number between -1 and 1.</li>
     * </ul>
     */
    public Builder pan(@Nullable String value) {
      object.setPan(value);
      return this;
    }

    /**
     * Define the panning of the instrument. This can be a string with a
     * data property name, e.g. <code>'x'</code>, in which case this data property is
     * used to define the panning relative to the <code>x</code>-values of the other
     * points. A higher <code>x</code> value would then result in a higher panning
     * value (panned further to the right). This option can also be a fixed
     * number or a function. If it is a function, this function is called in
     * regular intervals while the note is playing. It receives three
     * arguments: The point, the dataExtremes, and the current relative time
     *
     * <ul>
     * <li>where 0 is the beginning of the note and 1 is the end. The function
     * should return the panning of the note as a number between -1 and 1.</li>
     * </ul>
     */
    public Builder pan(@Nullable JsFunction value) {
      object.setPan(value);
      return this;
    }

    /**
     * Define the volume of the instrument. This can be a string with a data
     * property name, e.g. <code>'y'</code>, in which case this data property is used
     * to define the volume relative to the <code>y</code>-values of the other points.
     * A higher <code>y</code> value would then result in a higher volume. This option
     * can also be a fixed number or a function. If it is a function, this
     * function is called in regular intervals while the note is playing. It
     * receives three arguments: The point, the dataExtremes, and the
     * current relative time - where 0 is the beginning of the note and 1 is
     * the end. The function should return the volume of the note as a
     * number between 0 and 1.
     *
     */
    public Builder volume(double value) {
      object.setVolume(value);
      return this;
    }

    /**
     * Define the volume of the instrument. This can be a string with a data
     * property name, e.g. <code>'y'</code>, in which case this data property is used
     * to define the volume relative to the <code>y</code>-values of the other points.
     * A higher <code>y</code> value would then result in a higher volume. This option
     * can also be a fixed number or a function. If it is a function, this
     * function is called in regular intervals while the note is playing. It
     * receives three arguments: The point, the dataExtremes, and the
     * current relative time - where 0 is the beginning of the note and 1 is
     * the end. The function should return the volume of the note as a
     * number between 0 and 1.
     *
     */
    public Builder volume(String value) {
      object.setVolume(value);
      return this;
    }

    /**
     * Define the volume of the instrument. This can be a string with a data
     * property name, e.g. <code>'y'</code>, in which case this data property is used
     * to define the volume relative to the <code>y</code>-values of the other points.
     * A higher <code>y</code> value would then result in a higher volume. This option
     * can also be a fixed number or a function. If it is a function, this
     * function is called in regular intervals while the note is playing. It
     * receives three arguments: The point, the dataExtremes, and the
     * current relative time - where 0 is the beginning of the note and 1 is
     * the end. The function should return the volume of the note as a
     * number between 0 and 1.
     *
     */
    public Builder volume(JsFunction value) {
      object.setVolume(value);
      return this;
    }
  }
}
