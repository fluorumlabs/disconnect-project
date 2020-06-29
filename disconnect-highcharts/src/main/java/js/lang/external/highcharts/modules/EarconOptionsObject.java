package js.lang.external.highcharts.modules;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import java.lang.String;
import javax.annotation.Nullable;
import js.lang.Any;
import js.lang.JsFunction;
import org.teavm.jso.JSProperty;

/**
 * Options for an Earcon.
 *
 */
@NpmPackage(
    name = "highcharts",
    version = "^8.1.2"
)
@Import(
    module = "highcharts/es-modules/masters/modules/sonification.src.js"
)
public interface EarconOptionsObject extends Any {
  /**
   * The unique ID of the Earcon. Generated if not supplied.
   *
   */
  @JSProperty("id")
  @Nullable
  String getId();

  /**
   * The unique ID of the Earcon. Generated if not supplied.
   *
   */
  @JSProperty("id")
  void setId(@Nullable String value);

  /**
   * The instruments and their options defining this earcon.
   *
   */
  @JSProperty("instruments")
  EarconInstrument[] getInstruments();

  /**
   * The instruments and their options defining this earcon.
   *
   */
  @JSProperty("instruments")
  void setInstruments(EarconInstrument... value);

  /**
   * Callback function to call when earcon has finished playing.
   *
   */
  @JSProperty("onEnd")
  @Nullable
  JsFunction getOnEnd();

  /**
   * Callback function to call when earcon has finished playing.
   *
   */
  @JSProperty("onEnd")
  void setOnEnd(@Nullable JsFunction value);

  /**
   * Global panning of all instruments. Overrides all panning on
   * individual instruments. Can be a number between -1 and 1.
   *
   */
  @JSProperty("pan")
  double getPan();

  /**
   * Global panning of all instruments. Overrides all panning on
   * individual instruments. Can be a number between -1 and 1.
   *
   */
  @JSProperty("pan")
  void setPan(double value);

  /**
   * Master volume for all instruments. Volume settings on individual
   * instruments can still be used for relative volume between the
   * instruments. This setting does not affect volumes set by functions in
   * individual instruments. Can be a number between 0 and 1. Defaults to
   * 1.
   *
   */
  @JSProperty("volume")
  double getVolume();

  /**
   * Master volume for all instruments. Volume settings on individual
   * instruments can still be used for relative volume between the
   * instruments. This setting does not affect volumes set by functions in
   * individual instruments. Can be a number between 0 and 1. Defaults to
   * 1.
   *
   */
  @JSProperty("volume")
  void setVolume(double value);

  static Builder builder() {
    return new Builder();
  }

  final class Builder {
    private final EarconOptionsObject object = Any.empty();

    private Builder() {
    }

    public EarconOptionsObject build() {
      return object;
    }

    /**
     * The unique ID of the Earcon. Generated if not supplied.
     *
     */
    public Builder id(@Nullable String value) {
      object.setId(value);
      return this;
    }

    /**
     * The instruments and their options defining this earcon.
     *
     */
    public Builder instruments(EarconInstrument... value) {
      object.setInstruments(value);
      return this;
    }

    /**
     * Callback function to call when earcon has finished playing.
     *
     */
    public Builder onEnd(@Nullable JsFunction value) {
      object.setOnEnd(value);
      return this;
    }

    /**
     * Global panning of all instruments. Overrides all panning on
     * individual instruments. Can be a number between -1 and 1.
     *
     */
    public Builder pan(double value) {
      object.setPan(value);
      return this;
    }

    /**
     * Master volume for all instruments. Volume settings on individual
     * instruments can still be used for relative volume between the
     * instruments. This setting does not affect volumes set by functions in
     * individual instruments. Can be a number between 0 and 1. Defaults to
     * 1.
     *
     */
    public Builder volume(double value) {
      object.setVolume(value);
      return this;
    }
  }
}
