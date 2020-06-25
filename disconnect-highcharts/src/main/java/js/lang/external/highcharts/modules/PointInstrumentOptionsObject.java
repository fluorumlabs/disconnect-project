package js.lang.external.highcharts.modules;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import js.lang.Any;
import org.teavm.jso.JSProperty;

@NpmPackage(
    name = "highcharts",
    version = "^8.1.0"
)
@Import(
    module = "highcharts/es-modules/masters/modules/sonification.src.js"
)
public interface PointInstrumentOptionsObject extends Any {
  /**
   * The maximum duration for a note when using a data property for
   * duration. Can be overridden by using either a fixed number or a
   * function for instrumentMapping.duration. Defaults to 2000.
   *
   */
  @JSProperty("maxDuration")
  double getMaxDuration();

  /**
   * The maximum duration for a note when using a data property for
   * duration. Can be overridden by using either a fixed number or a
   * function for instrumentMapping.duration. Defaults to 2000.
   *
   */
  @JSProperty("maxDuration")
  void setMaxDuration(double value);

  /**
   * The maximum frequency for a note when using a data property for
   * frequency. Can be overridden by using either a fixed number or a
   * function for instrumentMapping.frequency. Defaults to 2200.
   *
   */
  @JSProperty("maxFrequency")
  double getMaxFrequency();

  /**
   * The maximum frequency for a note when using a data property for
   * frequency. Can be overridden by using either a fixed number or a
   * function for instrumentMapping.frequency. Defaults to 2200.
   *
   */
  @JSProperty("maxFrequency")
  void setMaxFrequency(double value);

  /**
   * The maximum pan value for a note when using a data property for
   * panning. Can be overridden by using either a fixed number or a
   * function for instrumentMapping.pan. Defaults to 1 (fully right).
   *
   */
  @JSProperty("maxPan")
  double getMaxPan();

  /**
   * The maximum pan value for a note when using a data property for
   * panning. Can be overridden by using either a fixed number or a
   * function for instrumentMapping.pan. Defaults to 1 (fully right).
   *
   */
  @JSProperty("maxPan")
  void setMaxPan(double value);

  /**
   * The maximum volume for a note when using a data property for volume.
   * Can be overridden by using either a fixed number or a function for
   * instrumentMapping.volume. Defaults to 1.
   *
   */
  @JSProperty("maxVolume")
  double getMaxVolume();

  /**
   * The maximum volume for a note when using a data property for volume.
   * Can be overridden by using either a fixed number or a function for
   * instrumentMapping.volume. Defaults to 1.
   *
   */
  @JSProperty("maxVolume")
  void setMaxVolume(double value);

  /**
   * The minimum duration for a note when using a data property for
   * duration. Can be overridden by using either a fixed number or a
   * function for instrumentMapping.duration. Defaults to 20.
   *
   */
  @JSProperty("minDuration")
  double getMinDuration();

  /**
   * The minimum duration for a note when using a data property for
   * duration. Can be overridden by using either a fixed number or a
   * function for instrumentMapping.duration. Defaults to 20.
   *
   */
  @JSProperty("minDuration")
  void setMinDuration(double value);

  /**
   * The minimum frequency for a note when using a data property for
   * frequency. Can be overridden by using either a fixed number or a
   * function for instrumentMapping.frequency. Defaults to 220.
   *
   */
  @JSProperty("minFrequency")
  double getMinFrequency();

  /**
   * The minimum frequency for a note when using a data property for
   * frequency. Can be overridden by using either a fixed number or a
   * function for instrumentMapping.frequency. Defaults to 220.
   *
   */
  @JSProperty("minFrequency")
  void setMinFrequency(double value);

  /**
   * The minimum pan value for a note when using a data property for
   * panning. Can be overridden by using either a fixed number or a
   * function for instrumentMapping.pan. Defaults to -1 (fully left).
   *
   */
  @JSProperty("minPan")
  double getMinPan();

  /**
   * The minimum pan value for a note when using a data property for
   * panning. Can be overridden by using either a fixed number or a
   * function for instrumentMapping.pan. Defaults to -1 (fully left).
   *
   */
  @JSProperty("minPan")
  void setMinPan(double value);

  /**
   * The minimum volume for a note when using a data property for volume.
   * Can be overridden by using either a fixed number or a function for
   * instrumentMapping.volume. Defaults to 0.1.
   *
   */
  @JSProperty("minVolume")
  double getMinVolume();

  /**
   * The minimum volume for a note when using a data property for volume.
   * Can be overridden by using either a fixed number or a function for
   * instrumentMapping.volume. Defaults to 0.1.
   *
   */
  @JSProperty("minVolume")
  void setMinVolume(double value);

  class Builder {
    private final PointInstrumentOptionsObject object = Any.empty();

    public PointInstrumentOptionsObject build() {
      return object;
    }

    /**
     * The maximum duration for a note when using a data property for
     * duration. Can be overridden by using either a fixed number or a
     * function for instrumentMapping.duration. Defaults to 2000.
     *
     */
    public Builder maxDuration(double value) {
      object.setMaxDuration(value);
      return this;
    }

    /**
     * The maximum frequency for a note when using a data property for
     * frequency. Can be overridden by using either a fixed number or a
     * function for instrumentMapping.frequency. Defaults to 2200.
     *
     */
    public Builder maxFrequency(double value) {
      object.setMaxFrequency(value);
      return this;
    }

    /**
     * The maximum pan value for a note when using a data property for
     * panning. Can be overridden by using either a fixed number or a
     * function for instrumentMapping.pan. Defaults to 1 (fully right).
     *
     */
    public Builder maxPan(double value) {
      object.setMaxPan(value);
      return this;
    }

    /**
     * The maximum volume for a note when using a data property for volume.
     * Can be overridden by using either a fixed number or a function for
     * instrumentMapping.volume. Defaults to 1.
     *
     */
    public Builder maxVolume(double value) {
      object.setMaxVolume(value);
      return this;
    }

    /**
     * The minimum duration for a note when using a data property for
     * duration. Can be overridden by using either a fixed number or a
     * function for instrumentMapping.duration. Defaults to 20.
     *
     */
    public Builder minDuration(double value) {
      object.setMinDuration(value);
      return this;
    }

    /**
     * The minimum frequency for a note when using a data property for
     * frequency. Can be overridden by using either a fixed number or a
     * function for instrumentMapping.frequency. Defaults to 220.
     *
     */
    public Builder minFrequency(double value) {
      object.setMinFrequency(value);
      return this;
    }

    /**
     * The minimum pan value for a note when using a data property for
     * panning. Can be overridden by using either a fixed number or a
     * function for instrumentMapping.pan. Defaults to -1 (fully left).
     *
     */
    public Builder minPan(double value) {
      object.setMinPan(value);
      return this;
    }

    /**
     * The minimum volume for a note when using a data property for volume.
     * Can be overridden by using either a fixed number or a function for
     * instrumentMapping.volume. Defaults to 0.1.
     *
     */
    public Builder minVolume(double value) {
      object.setMinVolume(value);
      return this;
    }
  }
}
