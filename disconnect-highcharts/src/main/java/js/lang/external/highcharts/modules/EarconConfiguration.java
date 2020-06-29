package js.lang.external.highcharts.modules;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import java.lang.String;
import javax.annotation.Nullable;
import js.lang.Any;
import js.lang.JsFunction;
import org.teavm.jso.JSProperty;

/**
 * An Earcon configuration, specifying an Earcon and when to play it.
 *
 */
@NpmPackage(
    name = "highcharts",
    version = "^8.1.2"
)
@Import(
    module = "highcharts/es-modules/masters/modules/sonification.src.js"
)
public interface EarconConfiguration extends Any {
  /**
   * A function to determine whether or not to play this earcon on a
   * point. The function is called for every point, receiving that point
   * as parameter. It should return either a boolean indicating whether or
   * not to play the earcon, or a new Earcon instance - in which case the
   * new Earcon will be played.
   *
   */
  @JSProperty("condition")
  @Nullable
  JsFunction getCondition();

  /**
   * A function to determine whether or not to play this earcon on a
   * point. The function is called for every point, receiving that point
   * as parameter. It should return either a boolean indicating whether or
   * not to play the earcon, or a new Earcon instance - in which case the
   * new Earcon will be played.
   *
   */
  @JSProperty("condition")
  void setCondition(@Nullable JsFunction value);

  /**
   * An Earcon instance.
   *
   */
  @JSProperty("earcon")
  Earcon getEarcon();

  /**
   * An Earcon instance.
   *
   */
  @JSProperty("earcon")
  void setEarcon(Earcon value);

  /**
   * The ID of the point to play the Earcon on.
   *
   */
  @JSProperty("onPoint")
  @Nullable
  String getOnPoint();

  /**
   * The ID of the point to play the Earcon on.
   *
   */
  @JSProperty("onPoint")
  void setOnPoint(@Nullable String value);

  static Builder builder() {
    return new Builder();
  }

  final class Builder {
    private final EarconConfiguration object = Any.empty();

    private Builder() {
    }

    public EarconConfiguration build() {
      return object;
    }

    /**
     * A function to determine whether or not to play this earcon on a
     * point. The function is called for every point, receiving that point
     * as parameter. It should return either a boolean indicating whether or
     * not to play the earcon, or a new Earcon instance - in which case the
     * new Earcon will be played.
     *
     */
    public Builder condition(@Nullable JsFunction value) {
      object.setCondition(value);
      return this;
    }

    /**
     * An Earcon instance.
     *
     */
    public Builder earcon(Earcon value) {
      object.setEarcon(value);
      return this;
    }

    /**
     * The ID of the point to play the Earcon on.
     *
     */
    public Builder onPoint(@Nullable String value) {
      object.setOnPoint(value);
      return this;
    }
  }
}
