package js.lang.external.highcharts;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import js.lang.Any;
import js.lang.Unknown /* number */;
import org.teavm.jso.JSProperty;

/**
 * Contains information about a points new values.
 *
 */
@NpmPackage(
    name = "highcharts",
    version = "^8.1.0"
)
@Import(
    module = "highcharts/es-modules/masters/highcharts.src.js"
)
public interface PointDragDropObject extends Any {
  /**
   * New values.
   *
   */
  @JSProperty("newValues")
  Dictionary<Unknown /* number */> getNewValues();

  /**
   * New values.
   *
   */
  @JSProperty("newValues")
  void setNewValues(Dictionary<Unknown /* number */> value);

  /**
   * Updated point.
   *
   */
  @JSProperty("point")
  Point getPoint();

  /**
   * Updated point.
   *
   */
  @JSProperty("point")
  void setPoint(Point value);

  class Builder {
    private final PointDragDropObject object = Any.empty();

    public PointDragDropObject build() {
      return object;
    }

    /**
     * New values.
     *
     */
    public Builder newValues(Dictionary<Unknown /* number */> value) {
      object.setNewValues(value);
      return this;
    }

    /**
     * Updated point.
     *
     */
    public Builder point(Point value) {
      object.setPoint(value);
      return this;
    }
  }
}
