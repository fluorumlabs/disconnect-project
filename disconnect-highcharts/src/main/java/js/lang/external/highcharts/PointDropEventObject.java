package js.lang.external.highcharts;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import java.lang.String;
import javax.annotation.Nullable;
import js.lang.Any;
import js.lang.JsFunction;
import org.teavm.jso.JSProperty;

/**
 * Contains common information for a drop event on series points.
 *
 */
@NpmPackage(
    name = "highcharts",
    version = "^8.1.0"
)
@Import(
    module = "highcharts/es-modules/masters/highcharts.src.js"
)
public interface PointDropEventObject extends Any {
  /**
   * New point after drag if only a single one.
   *
   */
  @JSProperty("newPoint")
  @Nullable
  PointDragDropObject getNewPoint();

  /**
   * New point after drag if only a single one.
   *
   */
  @JSProperty("newPoint")
  void setNewPoint(@Nullable PointDragDropObject value);

  /**
   * New point id after drag if only a single one.
   *
   */
  @JSProperty("newPointId")
  @Nullable
  String getNewPointId();

  /**
   * New point id after drag if only a single one.
   *
   */
  @JSProperty("newPointId")
  void setNewPointId(@Nullable String value);

  /**
   * New points after drop.
   *
   */
  @JSProperty("newPoints")
  Dictionary<PointDragDropObject> getNewPoints();

  /**
   * New points after drop.
   *
   */
  @JSProperty("newPoints")
  void setNewPoints(Dictionary<PointDragDropObject> value);

  /**
   * Number of new points.
   *
   */
  @JSProperty("numNewPoints")
  double getNumNewPoints();

  /**
   * Number of new points.
   *
   */
  @JSProperty("numNewPoints")
  void setNumNewPoints(double value);

  /**
   * Original data.
   *
   */
  @JSProperty("origin")
  DragDropPositionObject getOrigin();

  /**
   * Original data.
   *
   */
  @JSProperty("origin")
  void setOrigin(DragDropPositionObject value);

  /**
   * Prevent default drop action.
   *
   */
  @JSProperty("preventDefault")
  JsFunction getPreventDefault();

  /**
   * Prevent default drop action.
   *
   */
  @JSProperty("preventDefault")
  void setPreventDefault(JsFunction value);

  /**
   * Target point that caused the event.
   *
   */
  @JSProperty("target")
  Point getTarget();

  /**
   * Target point that caused the event.
   *
   */
  @JSProperty("target")
  void setTarget(Point value);

  class Builder {
    private final PointDropEventObject object = Any.empty();

    public PointDropEventObject build() {
      return object;
    }

    /**
     * New point after drag if only a single one.
     *
     */
    public Builder newPoint(@Nullable PointDragDropObject value) {
      object.setNewPoint(value);
      return this;
    }

    /**
     * New point id after drag if only a single one.
     *
     */
    public Builder newPointId(@Nullable String value) {
      object.setNewPointId(value);
      return this;
    }

    /**
     * New points after drop.
     *
     */
    public Builder newPoints(Dictionary<PointDragDropObject> value) {
      object.setNewPoints(value);
      return this;
    }

    /**
     * Number of new points.
     *
     */
    public Builder numNewPoints(double value) {
      object.setNumNewPoints(value);
      return this;
    }

    /**
     * Original data.
     *
     */
    public Builder origin(DragDropPositionObject value) {
      object.setOrigin(value);
      return this;
    }

    /**
     * Prevent default drop action.
     *
     */
    public Builder preventDefault(JsFunction value) {
      object.setPreventDefault(value);
      return this;
    }

    /**
     * Target point that caused the event.
     *
     */
    public Builder target(Point value) {
      object.setTarget(value);
      return this;
    }
  }
}
