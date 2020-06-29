package js.lang.external.highcharts;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import js.lang.Any;
import js.web.dom.Event;
import org.teavm.jso.JSProperty;

/**
 * Common information for a click event on a series.
 *
 */
@NpmPackage(
    name = "highcharts",
    version = "^8.1.2"
)
@Import(
    module = "highcharts/es-modules/masters/highcharts.src.js"
)
public interface SeriesClickEventObject extends Event {
  /**
   * Nearest point on the graph.
   *
   */
  @JSProperty("point")
  Point getPoint();

  /**
   * Nearest point on the graph.
   *
   */
  @JSProperty("point")
  void setPoint(Point value);

  static Builder builder() {
    return new Builder();
  }

  final class Builder {
    private final SeriesClickEventObject object = Any.empty();

    private Builder() {
    }

    public SeriesClickEventObject build() {
      return object;
    }

    /**
     * Nearest point on the graph.
     *
     */
    public Builder point(Point value) {
      object.setPoint(value);
      return this;
    }
  }
}
