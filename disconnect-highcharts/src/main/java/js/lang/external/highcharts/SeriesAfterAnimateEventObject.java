package js.lang.external.highcharts;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import js.extras.JsEnum;
import js.lang.Any;
import org.teavm.jso.JSProperty;

/**
 * Event information regarding completed animation of a series.
 *
 */
@NpmPackage(
    name = "highcharts",
    version = "^8.1.2"
)
@Import(
    module = "highcharts/es-modules/masters/highcharts.src.js"
)
public interface SeriesAfterAnimateEventObject extends Any {
  /**
   * Animated series.
   *
   */
  @JSProperty("target")
  Series getTarget();

  /**
   * Animated series.
   *
   */
  @JSProperty("target")
  void setTarget(Series value);

  /**
   * Event type.
   *
   */
  @JSProperty("type")
  Type getType();

  /**
   * Event type.
   *
   */
  @JSProperty("type")
  void setType(Type value);

  static Builder builder() {
    return new Builder();
  }

  abstract class Type extends JsEnum {
    public static final Type AFTERANIMATE = JsEnum.of("afterAnimate");
  }

  final class Builder {
    private final SeriesAfterAnimateEventObject object = Any.empty();

    private Builder() {
    }

    public SeriesAfterAnimateEventObject build() {
      return object;
    }

    /**
     * Animated series.
     *
     */
    public Builder target(Series value) {
      object.setTarget(value);
      return this;
    }

    /**
     * Event type.
     *
     */
    public Builder type(Type value) {
      object.setType(value);
      return this;
    }
  }
}
