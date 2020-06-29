package js.lang.external.highcharts;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import java.lang.String;
import javax.annotation.Nullable;
import js.lang.Any;
import js.lang.JsFunction;
import js.lang.Unknown /* ( string | Function ) */;
import org.teavm.jso.JSProperty;

/**
 * An animation configuration. Animation configurations can also be defined as
 * booleans, where <code>false</code> turns off animation and <code>true</code> defaults to a duration
 * of 500ms.
 *
 */
@NpmPackage(
    name = "highcharts",
    version = "^8.1.2"
)
@Import(
    module = "highcharts/es-modules/masters/highcharts.src.js"
)
public interface AnimationOptionsObject extends Any {
  /**
   * A callback function to exectute when the animation finishes.
   *
   */
  @JSProperty("complete")
  @Nullable
  JsFunction getComplete();

  /**
   * A callback function to exectute when the animation finishes.
   *
   */
  @JSProperty("complete")
  void setComplete(@Nullable JsFunction value);

  /**
   * The animation duration in milliseconds.
   *
   */
  @JSProperty("duration")
  double getDuration();

  /**
   * The animation duration in milliseconds.
   *
   */
  @JSProperty("duration")
  void setDuration(double value);

  /**
   * The name of an easing function as defined on the <code>Math</code> object.
   *
   */
  @JSProperty("easing")
  @Nullable
  Unknown /* ( string | Function ) */ getEasing();

  /**
   * The name of an easing function as defined on the <code>Math</code> object.
   *
   */
  @JSProperty("easing")
  void setEasing(@Nullable String value);

  /**
   * The name of an easing function as defined on the <code>Math</code> object.
   *
   */
  @JSProperty("easing")
  void setEasing(@Nullable JsFunction value);

  /**
   * A callback function to execute on each step of each attribute or CSS
   * property that's being animated. The first argument contains information
   * about the animation and progress.
   *
   */
  @JSProperty("step")
  @Nullable
  JsFunction getStep();

  /**
   * A callback function to execute on each step of each attribute or CSS
   * property that's being animated. The first argument contains information
   * about the animation and progress.
   *
   */
  @JSProperty("step")
  void setStep(@Nullable JsFunction value);

  static Builder builder() {
    return new Builder();
  }

  final class Builder {
    private final AnimationOptionsObject object = Any.empty();

    private Builder() {
    }

    public AnimationOptionsObject build() {
      return object;
    }

    /**
     * A callback function to exectute when the animation finishes.
     *
     */
    public Builder complete(@Nullable JsFunction value) {
      object.setComplete(value);
      return this;
    }

    /**
     * The animation duration in milliseconds.
     *
     */
    public Builder duration(double value) {
      object.setDuration(value);
      return this;
    }

    /**
     * The name of an easing function as defined on the <code>Math</code> object.
     *
     */
    public Builder easing(@Nullable String value) {
      object.setEasing(value);
      return this;
    }

    /**
     * The name of an easing function as defined on the <code>Math</code> object.
     *
     */
    public Builder easing(@Nullable JsFunction value) {
      object.setEasing(value);
      return this;
    }

    /**
     * A callback function to execute on each step of each attribute or CSS
     * property that's being animated. The first argument contains information
     * about the animation and progress.
     *
     */
    public Builder step(@Nullable JsFunction value) {
      object.setStep(value);
      return this;
    }
  }
}
