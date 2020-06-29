package js.lang.external.highcharts;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import js.extras.JsEnum;
import js.lang.Any;
import js.lang.JsFunction;
import org.teavm.jso.JSProperty;

/**
 * Contains common information for a drag event on series points.
 *
 */
@NpmPackage(
    name = "highcharts",
    version = "^8.1.2"
)
@Import(
    module = "highcharts/es-modules/masters/highcharts.src.js"
)
public interface PointDragEventObject extends Any {
  /**
   * New points during drag.
   *
   */
  @JSProperty("newPoints")
  Dictionary<PointDragDropObject> getNewPoints();

  /**
   * New points during drag.
   *
   */
  @JSProperty("newPoints")
  void setNewPoints(Dictionary<PointDragDropObject> value);

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
   * Prevent default drag action.
   *
   */
  @JSProperty("preventDefault")
  JsFunction getPreventDefault();

  /**
   * Prevent default drag action.
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
    public static final Type DRAG = JsEnum.of("drag");
  }

  final class Builder {
    private final PointDragEventObject object = Any.empty();

    private Builder() {
    }

    public PointDragEventObject build() {
      return object;
    }

    /**
     * New points during drag.
     *
     */
    public Builder newPoints(Dictionary<PointDragDropObject> value) {
      object.setNewPoints(value);
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
     * Prevent default drag action.
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
