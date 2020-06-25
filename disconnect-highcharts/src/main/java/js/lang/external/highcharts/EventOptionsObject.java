package js.lang.external.highcharts;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import js.lang.Any;
import org.teavm.jso.JSProperty;

/**
 * The event options for adding function callback.
 *
 */
@NpmPackage(
    name = "highcharts",
    version = "^8.1.0"
)
@Import(
    module = "highcharts/es-modules/masters/highcharts.src.js"
)
public interface EventOptionsObject extends Any {
  /**
   * The order the event handler should be called. This opens for having one
   * handler be called before another, independent of in which order they were
   * added.
   *
   */
  @JSProperty("order")
  double getOrder();

  /**
   * The order the event handler should be called. This opens for having one
   * handler be called before another, independent of in which order they were
   * added.
   *
   */
  @JSProperty("order")
  void setOrder(double value);

  class Builder {
    private final EventOptionsObject object = Any.empty();

    public EventOptionsObject build() {
      return object;
    }

    /**
     * The order the event handler should be called. This opens for having one
     * handler be called before another, independent of in which order they were
     * added.
     *
     */
    public Builder order(double value) {
      object.setOrder(value);
      return this;
    }
  }
}
