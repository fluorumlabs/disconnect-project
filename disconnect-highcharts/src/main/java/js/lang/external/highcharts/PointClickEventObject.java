package js.lang.external.highcharts;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import js.lang.Any;
import org.teavm.jso.JSProperty;

/**
 * Common information for a click event on a series point.
 *
 */
@NpmPackage(
    name = "highcharts",
    version = "^8.1.0"
)
@Import(
    module = "highcharts/es-modules/masters/highcharts.src.js"
)
public interface PointClickEventObject extends PointerEventObject {
  /**
   * Clicked point.
   *
   */
  @JSProperty("point")
  Point getPoint();

  /**
   * Clicked point.
   *
   */
  @JSProperty("point")
  void setPoint(Point value);

  class Builder {
    private final PointClickEventObject object = Any.empty();

    public PointClickEventObject build() {
      return object;
    }

    /**
     * Clicked point.
     *
     */
    public Builder point(Point value) {
      object.setPoint(value);
      return this;
    }
  }
}
