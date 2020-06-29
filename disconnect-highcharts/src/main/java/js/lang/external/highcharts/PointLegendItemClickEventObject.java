package js.lang.external.highcharts;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import js.extras.JsEnum;
import js.lang.Any;
import js.lang.JsFunction;
import js.web.pointerevents.PointerEvent;
import org.teavm.jso.JSProperty;

/**
 * Information about the legend click event.
 *
 */
@NpmPackage(
    name = "highcharts",
    version = "^8.1.2"
)
@Import(
    module = "highcharts/es-modules/masters/highcharts.src.js"
)
public interface PointLegendItemClickEventObject extends Any {
  /**
   * Related browser event.
   *
   */
  @JSProperty("browserEvent")
  PointerEvent getBrowserEvent();

  /**
   * Related browser event.
   *
   */
  @JSProperty("browserEvent")
  void setBrowserEvent(PointerEvent value);

  /**
   * Prevent the default action of toggle the visibility of the point.
   *
   */
  @JSProperty("preventDefault")
  JsFunction getPreventDefault();

  /**
   * Prevent the default action of toggle the visibility of the point.
   *
   */
  @JSProperty("preventDefault")
  void setPreventDefault(JsFunction value);

  /**
   * Related point.
   *
   */
  @JSProperty("target")
  Point getTarget();

  /**
   * Related point.
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
    public static final Type LEGENDITEMCLICK = JsEnum.of("legendItemClick");
  }

  final class Builder {
    private final PointLegendItemClickEventObject object = Any.empty();

    private Builder() {
    }

    public PointLegendItemClickEventObject build() {
      return object;
    }

    /**
     * Related browser event.
     *
     */
    public Builder browserEvent(PointerEvent value) {
      object.setBrowserEvent(value);
      return this;
    }

    /**
     * Prevent the default action of toggle the visibility of the point.
     *
     */
    public Builder preventDefault(JsFunction value) {
      object.setPreventDefault(value);
      return this;
    }

    /**
     * Related point.
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
