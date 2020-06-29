package js.lang.external.highcharts;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import javax.annotation.Nullable;
import js.lang.Any;
import org.teavm.jso.JSProperty;

/**
 * (Highcharts) Event handlers for the axis.
 *
 */
@NpmPackage(
    name = "highcharts",
    version = "^8.1.2"
)
@Import(
    module = "highcharts/es-modules/masters/highcharts.src.js"
)
public interface ZAxisEventsOptions extends Any {
  /**
   * (Highcharts, Gantt) An event fired after the breaks have rendered.
   *
   */
  @JSProperty("afterBreaks")
  @Nullable
  AxisEventCallbackFunction getAfterBreaks();

  /**
   * (Highcharts, Gantt) An event fired after the breaks have rendered.
   *
   */
  @JSProperty("afterBreaks")
  void setAfterBreaks(@Nullable AxisEventCallbackFunction value);

  /**
   * (Highcharts) As opposed to the <code>setExtremes</code> event, this event fires
   * after the final min and max values are computed and corrected for
   * <code>minRange</code>.
   *
   * Fires when the minimum and maximum is set for the axis, either by calling
   * the <code>.setExtremes()</code> method or by selecting an area in the chart. One
   * parameter, <code>event</code>, is passed to the function, containing common event
   * information.
   *
   * The new user set minimum and maximum values can be found by <code>event.min</code>
   * and <code>event.max</code>. These reflect the axis minimum and maximum in axis
   * values. The actual data extremes are found in <code>event.dataMin</code> and
   * <code>event.dataMax</code>.
   *
   */
  @JSProperty("afterSetExtremes")
  @Nullable
  AxisSetExtremesEventCallbackFunction getAfterSetExtremes();

  /**
   * (Highcharts) As opposed to the <code>setExtremes</code> event, this event fires
   * after the final min and max values are computed and corrected for
   * <code>minRange</code>.
   *
   * Fires when the minimum and maximum is set for the axis, either by calling
   * the <code>.setExtremes()</code> method or by selecting an area in the chart. One
   * parameter, <code>event</code>, is passed to the function, containing common event
   * information.
   *
   * The new user set minimum and maximum values can be found by <code>event.min</code>
   * and <code>event.max</code>. These reflect the axis minimum and maximum in axis
   * values. The actual data extremes are found in <code>event.dataMin</code> and
   * <code>event.dataMax</code>.
   *
   */
  @JSProperty("afterSetExtremes")
  void setAfterSetExtremes(@Nullable AxisSetExtremesEventCallbackFunction value);

  /**
   * (Highcharts, Gantt) An event fired when a break from this axis occurs on
   * a point.
   *
   */
  @JSProperty("pointBreak")
  @Nullable
  AxisPointBreakEventCallbackFunction getPointBreak();

  /**
   * (Highcharts, Gantt) An event fired when a break from this axis occurs on
   * a point.
   *
   */
  @JSProperty("pointBreak")
  void setPointBreak(@Nullable AxisPointBreakEventCallbackFunction value);

  /**
   * (Highcharts, Highstock, Gantt) An event fired when a point falls inside a
   * break from this axis.
   *
   */
  @JSProperty("pointInBreak")
  @Nullable
  AxisPointBreakEventCallbackFunction getPointInBreak();

  /**
   * (Highcharts, Highstock, Gantt) An event fired when a point falls inside a
   * break from this axis.
   *
   */
  @JSProperty("pointInBreak")
  void setPointInBreak(@Nullable AxisPointBreakEventCallbackFunction value);

  /**
   * (Highcharts) Fires when the minimum and maximum is set for the axis,
   * either by calling the <code>.setExtremes()</code> method or by selecting an area in
   * the chart. One parameter, <code>event</code>, is passed to the function, containing
   * common event information.
   *
   * The new user set minimum and maximum values can be found by <code>event.min</code>
   * and <code>event.max</code>. These reflect the axis minimum and maximum in data
   * values. When an axis is zoomed all the way out from the &quot;Reset zoom&quot;
   * button, <code>event.min</code> and <code>event.max</code> are null, and the new extremes are
   * set based on <code>this.dataMin</code> and <code>this.dataMax</code>.
   *
   */
  @JSProperty("setExtremes")
  @Nullable
  AxisSetExtremesEventCallbackFunction getSetExtremes();

  /**
   * (Highcharts) Fires when the minimum and maximum is set for the axis,
   * either by calling the <code>.setExtremes()</code> method or by selecting an area in
   * the chart. One parameter, <code>event</code>, is passed to the function, containing
   * common event information.
   *
   * The new user set minimum and maximum values can be found by <code>event.min</code>
   * and <code>event.max</code>. These reflect the axis minimum and maximum in data
   * values. When an axis is zoomed all the way out from the &quot;Reset zoom&quot;
   * button, <code>event.min</code> and <code>event.max</code> are null, and the new extremes are
   * set based on <code>this.dataMin</code> and <code>this.dataMax</code>.
   *
   */
  @JSProperty("setExtremes")
  void setSetExtremes(@Nullable AxisSetExtremesEventCallbackFunction value);

  static Builder builder() {
    return new Builder();
  }

  final class Builder {
    private final ZAxisEventsOptions object = Any.empty();

    private Builder() {
    }

    public ZAxisEventsOptions build() {
      return object;
    }

    /**
     * (Highcharts, Gantt) An event fired after the breaks have rendered.
     *
     */
    public Builder afterBreaks(@Nullable AxisEventCallbackFunction value) {
      object.setAfterBreaks(value);
      return this;
    }

    /**
     * (Highcharts) As opposed to the <code>setExtremes</code> event, this event fires
     * after the final min and max values are computed and corrected for
     * <code>minRange</code>.
     *
     * Fires when the minimum and maximum is set for the axis, either by calling
     * the <code>.setExtremes()</code> method or by selecting an area in the chart. One
     * parameter, <code>event</code>, is passed to the function, containing common event
     * information.
     *
     * The new user set minimum and maximum values can be found by <code>event.min</code>
     * and <code>event.max</code>. These reflect the axis minimum and maximum in axis
     * values. The actual data extremes are found in <code>event.dataMin</code> and
     * <code>event.dataMax</code>.
     *
     */
    public Builder afterSetExtremes(@Nullable AxisSetExtremesEventCallbackFunction value) {
      object.setAfterSetExtremes(value);
      return this;
    }

    /**
     * (Highcharts, Gantt) An event fired when a break from this axis occurs on
     * a point.
     *
     */
    public Builder pointBreak(@Nullable AxisPointBreakEventCallbackFunction value) {
      object.setPointBreak(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Gantt) An event fired when a point falls inside a
     * break from this axis.
     *
     */
    public Builder pointInBreak(@Nullable AxisPointBreakEventCallbackFunction value) {
      object.setPointInBreak(value);
      return this;
    }

    /**
     * (Highcharts) Fires when the minimum and maximum is set for the axis,
     * either by calling the <code>.setExtremes()</code> method or by selecting an area in
     * the chart. One parameter, <code>event</code>, is passed to the function, containing
     * common event information.
     *
     * The new user set minimum and maximum values can be found by <code>event.min</code>
     * and <code>event.max</code>. These reflect the axis minimum and maximum in data
     * values. When an axis is zoomed all the way out from the &quot;Reset zoom&quot;
     * button, <code>event.min</code> and <code>event.max</code> are null, and the new extremes are
     * set based on <code>this.dataMin</code> and <code>this.dataMax</code>.
     *
     */
    public Builder setExtremes(@Nullable AxisSetExtremesEventCallbackFunction value) {
      object.setSetExtremes(value);
      return this;
    }
  }
}
