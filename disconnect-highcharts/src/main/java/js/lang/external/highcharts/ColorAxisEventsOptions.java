package js.lang.external.highcharts;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import javax.annotation.Nullable;
import js.lang.Any;
import js.lang.JsFunction;
import org.teavm.jso.JSProperty;

/**
 * (Highcharts, Highstock, Highmaps) Event handlers for the axis.
 *
 */
@NpmPackage(
    name = "highcharts",
    version = "^8.1.0"
)
@Import(
    module = "highcharts/es-modules/masters/highcharts.src.js"
)
public interface ColorAxisEventsOptions extends Any {
  /**
   * (Highcharts, Highstock, Highmaps) As opposed to the <code>setExtremes</code> event,
   * this event fires after the final min and max values are computed and
   * corrected for <code>minRange</code>.
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
   * (Highcharts, Highstock, Highmaps) As opposed to the <code>setExtremes</code> event,
   * this event fires after the final min and max values are computed and
   * corrected for <code>minRange</code>.
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
   * (Highcharts, Highstock, Highmaps) Fires when the legend item belonging to
   * the colorAxis is clicked. One parameter, <code>event</code>, is passed to the
   * function.
   *
   */
  @JSProperty("legendItemClick")
  @Nullable
  JsFunction getLegendItemClick();

  /**
   * (Highcharts, Highstock, Highmaps) Fires when the legend item belonging to
   * the colorAxis is clicked. One parameter, <code>event</code>, is passed to the
   * function.
   *
   */
  @JSProperty("legendItemClick")
  void setLegendItemClick(@Nullable JsFunction value);

  /**
   * (Highcharts, Highstock, Highmaps) Fires when the minimum and maximum is
   * set for the axis, either by calling the <code>.setExtremes()</code> method or by
   * selecting an area in the chart. One parameter, <code>event</code>, is passed to the
   * function, containing common event information.
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
   * (Highcharts, Highstock, Highmaps) Fires when the minimum and maximum is
   * set for the axis, either by calling the <code>.setExtremes()</code> method or by
   * selecting an area in the chart. One parameter, <code>event</code>, is passed to the
   * function, containing common event information.
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

  class Builder {
    private final ColorAxisEventsOptions object = Any.empty();

    public ColorAxisEventsOptions build() {
      return object;
    }

    /**
     * (Highcharts, Highstock, Highmaps) As opposed to the <code>setExtremes</code> event,
     * this event fires after the final min and max values are computed and
     * corrected for <code>minRange</code>.
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
     * (Highcharts, Highstock, Highmaps) Fires when the legend item belonging to
     * the colorAxis is clicked. One parameter, <code>event</code>, is passed to the
     * function.
     *
     */
    public Builder legendItemClick(@Nullable JsFunction value) {
      object.setLegendItemClick(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Highmaps) Fires when the minimum and maximum is
     * set for the axis, either by calling the <code>.setExtremes()</code> method or by
     * selecting an area in the chart. One parameter, <code>event</code>, is passed to the
     * function, containing common event information.
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
