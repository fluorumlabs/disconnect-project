package js.lang.external.highcharts;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import js.lang.Any;
import js.web.dom.Event;
import org.teavm.jso.JSProperty;

/**
 * Information about the select/unselect event.
 *
 */
@NpmPackage(
    name = "highcharts",
    version = "^8.1.0"
)
@Import(
    module = "highcharts/es-modules/masters/highcharts.src.js"
)
public interface PointInteractionEventObject extends Event {
  @JSProperty("accumulate")
  boolean getAccumulate();

  @JSProperty("accumulate")
  void setAccumulate(boolean value);

  class Builder {
    private final PointInteractionEventObject object = Any.empty();

    public PointInteractionEventObject build() {
      return object;
    }

    public Builder accumulate(boolean value) {
      object.setAccumulate(value);
      return this;
    }
  }
}
