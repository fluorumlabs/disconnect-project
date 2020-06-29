package js.lang.external.highcharts;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import javax.annotation.Nullable;
import js.extras.JsEnum;
import js.lang.Any;
import js.lang.JsFunction;
import js.lang.Unknown /* ( boolean | Array < Point > ) */;
import js.web.dom.Event;
import org.teavm.jso.JSProperty;

/**
 * The event arguments when a drilldown point is clicked.
 *
 */
@NpmPackage(
    name = "highcharts",
    version = "^8.1.2"
)
@Import(
    module = "highcharts/es-modules/masters/highcharts.src.js"
)
public interface DrilldownEventObject extends Any {
  /**
   * If a category label was clicked, which index.
   *
   */
  @JSProperty("category")
  double getCategory();

  /**
   * If a category label was clicked, which index.
   *
   */
  @JSProperty("category")
  void setCategory(double value);

  /**
   * The original browser event (usually click) that triggered the drilldown.
   *
   */
  @JSProperty("originalEvent")
  @Nullable
  Event getOriginalEvent();

  /**
   * The original browser event (usually click) that triggered the drilldown.
   *
   */
  @JSProperty("originalEvent")
  void setOriginalEvent(@Nullable Event value);

  /**
   * The originating point.
   *
   */
  @JSProperty("point")
  Point getPoint();

  /**
   * The originating point.
   *
   */
  @JSProperty("point")
  void setPoint(Point value);

  /**
   * If a category label was clicked, this array holds all points
   * corresponding to the category. Otherwise it is set to false.
   *
   */
  @JSProperty("points")
  @Nullable
  Unknown /* ( boolean | Array < Point > ) */ getPoints();

  /**
   * If a category label was clicked, this array holds all points
   * corresponding to the category. Otherwise it is set to false.
   *
   */
  @JSProperty("points")
  void setPoints(boolean value);

  /**
   * If a category label was clicked, this array holds all points
   * corresponding to the category. Otherwise it is set to false.
   *
   */
  @JSProperty("points")
  void setPoints(Point... value);

  /**
   * Prevents the default behaviour of the event.
   *
   */
  @JSProperty("preventDefault")
  JsFunction getPreventDefault();

  /**
   * Prevents the default behaviour of the event.
   *
   */
  @JSProperty("preventDefault")
  void setPreventDefault(JsFunction value);

  /**
   * Options for the new series. If the event is utilized for async drilldown,
   * the seriesOptions are not added, but rather loaded async.
   *
   */
  @JSProperty("seriesOptions")
  @Nullable
  SeriesOptionsRegistry[] getSeriesOptions();

  /**
   * Options for the new series. If the event is utilized for async drilldown,
   * the seriesOptions are not added, but rather loaded async.
   *
   */
  @JSProperty("seriesOptions")
  void setSeriesOptions(SeriesOptionsRegistry... value);

  /**
   * The event target.
   *
   */
  @JSProperty("target")
  Chart getTarget();

  /**
   * The event target.
   *
   */
  @JSProperty("target")
  void setTarget(Chart value);

  /**
   * The event type.
   *
   */
  @JSProperty("type")
  Type getType();

  /**
   * The event type.
   *
   */
  @JSProperty("type")
  void setType(Type value);

  static Builder builder() {
    return new Builder();
  }

  abstract class Type extends JsEnum {
    public static final Type DRILLDOWN = JsEnum.of("drilldown");
  }

  final class Builder {
    private final DrilldownEventObject object = Any.empty();

    private Builder() {
    }

    public DrilldownEventObject build() {
      return object;
    }

    /**
     * If a category label was clicked, which index.
     *
     */
    public Builder category(double value) {
      object.setCategory(value);
      return this;
    }

    /**
     * The original browser event (usually click) that triggered the drilldown.
     *
     */
    public Builder originalEvent(@Nullable Event value) {
      object.setOriginalEvent(value);
      return this;
    }

    /**
     * The originating point.
     *
     */
    public Builder point(Point value) {
      object.setPoint(value);
      return this;
    }

    /**
     * If a category label was clicked, this array holds all points
     * corresponding to the category. Otherwise it is set to false.
     *
     */
    public Builder points(boolean value) {
      object.setPoints(value);
      return this;
    }

    /**
     * If a category label was clicked, this array holds all points
     * corresponding to the category. Otherwise it is set to false.
     *
     */
    public Builder points(Point... value) {
      object.setPoints(value);
      return this;
    }

    /**
     * Prevents the default behaviour of the event.
     *
     */
    public Builder preventDefault(JsFunction value) {
      object.setPreventDefault(value);
      return this;
    }

    /**
     * Options for the new series. If the event is utilized for async drilldown,
     * the seriesOptions are not added, but rather loaded async.
     *
     */
    public Builder seriesOptions(SeriesOptionsRegistry... value) {
      object.setSeriesOptions(value);
      return this;
    }

    /**
     * The event target.
     *
     */
    public Builder target(Chart value) {
      object.setTarget(value);
      return this;
    }

    /**
     * The event type.
     *
     */
    public Builder type(Type value) {
      object.setType(value);
      return this;
    }
  }
}
