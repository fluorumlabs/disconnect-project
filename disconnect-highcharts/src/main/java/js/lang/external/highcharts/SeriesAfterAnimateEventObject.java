package js.lang.external.highcharts;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import js.lang.Any;
import org.teavm.jso.JSProperty;

/**
 * Event information regarding completed animation of a series.
 *
 */
@NpmPackage(
    name = "highcharts",
    version = "^8.1.0"
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

  class Builder {
    private final SeriesAfterAnimateEventObject object = Any.empty();

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
  }
}
